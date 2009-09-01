/*
 * NAME: era.foss.model.core.Document
 */

package era.foss.model.core.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.util.EContentAdapter;

import era.foss.model.core.model.internal.RifProcessor;
import era.foss.model.core.plugin.CoreActivator;
import era.foss.model.rif.RifFactory;
import era.foss.model.rif.era.IERAObject;
import era.foss.model.rif.model.Identifiable;
import era.foss.model.rif.model.Rif;
import era.foss.util.log.Log;
import era.foss.util.types.Options;

/**
 * This class represents user and internal Rif documents.
 * 
 * @author poldi
 */
public abstract class AbstractDocument {

    //
    // defines

    /**
     * If set to create missing ids for identifiables are generated.
     */
    public static final String OPTION_CREATE_IDS = "createIds";

    /**
     * If set automated model fixes like created ids are logged to the errors log
     */
    public static final String OPTION_LOG_CHANGES = "logChanges";
    
    /**
     * The document schema defines a prefix for generated ids and controls the selection of syncers
     */
    public static final String OPTION_DOCUMENT_SCHEMA = "documentSchema";

    //
    // private members
    
    /**
     * The document schema
     */
    protected String documentSchema = null;

    /**
     * Document options
     */
    protected Options<String, String> options;

    /**
     * Helper for load/save
     */
    protected RifProcessor rifProcessor = new RifProcessor();

    /**
     * The file to load/save
     */
    private URI uri;

    /**
     * The rif of the document
     */
    private Rif rif;

    /**
     * The identifable adapter that makes the id cache
     */
    protected DocumentAdapter documentAdapter;

    /**
     * Maps ids to identifiables
     */
    private Map<String, IERAObject> idCache = new HashMap<String, IERAObject>();

    /**
     * Last created id
     */
    private long lastUniqueId = -1;

    /**
     * trie if ids should be generated
     */
    protected boolean createIds = true;

    /**
     * true to log changes
     */
    protected boolean logChanges = false;

    /**
     * Called by the model to create a new document.
     * 
     * @param resource The resource (not automatically loaded)
     * @since Jul 28, 2009
     */
    protected AbstractDocument( URI uri, Map<String, String> options ) {
        this.uri = uri;
        this.options = new Options<String, String>( options );
        createIds = this.options.getBooleanOption( OPTION_CREATE_IDS, createIds );
        logChanges = this.options.getBooleanOption( OPTION_LOG_CHANGES, logChanges );
        documentSchema = this.options.getStringOption( OPTION_DOCUMENT_SCHEMA, getDefaultDocumentSchema() );
        documentAdapter = createDocumentAdapter( this );
        rif = RifFactory.eINSTANCE.createRif();
        if( createIds ) rif.setIdentifier( createDocumentId() );
        documentAdapter.adapt( rif );
    }
    
    /**
     * @return First part of id identifying the type of document: "user" or "system" and defined which syncers are selected 
     */
    protected abstract String getDefaultDocumentSchema();


    /**
     * @return First part of id identifying the type of document: "user" or "system".
     */
    public String getDocumentSchema() {
        return documentSchema;
    }

    /**
     * Called by the constructor to create the documentAdapter.
     * 
     * This method may be overridden in sub classes.
     * 
     * @param document this
     * @return the adapter
     * @since Jul 31, 2009
     */
    protected DocumentAdapter createDocumentAdapter( AbstractDocument document ) {
        return new DocumentAdapter( document );
    }

    /**
     * Query if the document is closed.
     * 
     * @return true if document is disposed
     * @since Jul 28, 2009
     */
    public boolean isDisposed() {
        return rif == null;
    }

    //
    // File handling

    /**
     * Get the URI from which the file is loaded or saved to.
     * 
     * @return the uri
     * @since Jul 31, 2009
     */
    public URI getUri() {
        return uri;
    }

    /**
     * Called by the model to reload this document from the disk.
     * 
     * @return error or warning status
     */
    IStatus load( IProgressMonitor monitor ) {
        checkDisposed();
        List<Diagnostic> errors = new ArrayList<Diagnostic>();
        List<Diagnostic> warnings = new ArrayList<Diagnostic>();
        Rif o;
        try {
            o = rifProcessor.load( uri, errors, warnings );
        } catch( IOException e ) {
            return createStatus( e );
        }
        if( o != null ) {
            documentAdapter.unadapt( rif );
            rif = (Rif)o;
            if( createIds && rif.getIdentifier() == null ) {
                rif.setIdentifier( createDocumentId() );
                if( logChanges ) {
                    Log.log( new Status( IStatus.INFO, CoreActivator.PLUGIN_ID, "Added missing identifier "
                        + getDocumentId()
                        + " to rif object" ) );
                }
            }
            documentAdapter.adapt( rif );
        }

        return createStatus( errors, warnings );
    }

    /**
     * Converts errors and warnings to a status object.
     * 
     * @param errors The errors or null
     * @param warnings the warnings or null
     * @return the status
     * @since Jul 31, 2009
     */
    protected IStatus createStatus( List<Diagnostic> errors, List<Diagnostic> warnings ) {
        if( ( errors == null || errors.size() == 0 ) && ( warnings == null || warnings.size() == 0 ) ) {
            return Status.OK_STATUS;
        }
        MultiStatus collectionStatus = new MultiStatus( CoreActivator.PLUGIN_ID, IStatus.OK, "Errors in "
            + uri.toFileString(), new Exception() );
        for( Diagnostic error : errors ) {
            IStatus status = Log.convert( error, CoreActivator.PLUGIN_ID, IStatus.ERROR );
            collectionStatus.add( status );
        }
        for( Diagnostic warning : warnings ) {
            IStatus status = Log.convert( warning, CoreActivator.PLUGIN_ID, IStatus.ERROR );
            collectionStatus.add( status );
        }

        return collectionStatus;
    }

    /**
     * Create a status from an exception.
     * 
     * @param e the exception
     * @return the status
     * @since Jul 31, 2009
     */
    protected IStatus createStatus( Exception e ) {
        return new Status( IStatus.ERROR, CoreActivator.PLUGIN_ID, "Failed to access "
            + uri.toFileString()
            + ": "
            + e.getMessage(), e );
    }

    /**
     * Called by the model to dispose the document
     * 
     * @since Jul 28, 2009
     */
    void close() {
        checkDisposed();
        documentAdapter.unadapt( rif );
        rif = null;
        idCache = null;
    }

    //
    // Identifiables
    
    /**
     * Get the id counter to try.
     * 
     * @return the counter to try
     * @since Aug 1, 2009
     */
    private long getNextIdCounter() {
        if( lastUniqueId >= 0 ) return ++lastUniqueId;
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        if( workspace == null ) return lastUniqueId = 0;
        try {
            QualifiedName propertyName = new QualifiedName( CoreActivator.PLUGIN_ID, "LAST_UNIQUE_ID" );
            IWorkspaceRoot workspaceRoot = workspace.getRoot();
            String value = workspaceRoot.getPersistentProperty( propertyName );
            lastUniqueId = Long.parseLong( value );
            lastUniqueId++;
            workspaceRoot.setPersistentProperty( propertyName, Long.toString( lastUniqueId ) );
            return lastUniqueId;
        } catch( Exception e ) {
            return lastUniqueId = 0;
        }

    }

    /**
     * Creates a unique document id.
     * 
     * @return the id of the document
     * @since Aug 1, 2009
     */
    protected String createDocumentId() {
        long id = 0;
        String identifier = null;
        WHILE: do {
            identifier = getDocumentSchema() + ":" + Long.toString( id );
            for( AbstractDocument document : Model.getInstance().getDocuments() ) {
                if( identifier.equals( document.getDocumentId() ) ) {
                    id++;
                    continue WHILE;
                }
            }
            break;
        } while( true );

        return identifier;
    }

    /**
     * Creates a unique Identifable id.
     * 
     * @return the id of the identifiable
     * @since Aug 1, 2009
     */
    public String createId() {
        String documentId = getDocumentId();
        String id;
        do {
            id = documentId + ":" + getNextIdCounter();
            IERAObject o = getById( id, null );
            if( o == null ) break;
        } while( true );

        return id;
    }

    /**
     * Creates a unique id for the given objects and updates the object.
     * 
     * The id is only created if {@link #createIds= is true. If {@link #logChanges} a log entry is created.
     * 
     * @param object the object to change
     * @since Aug 1, 2009
     */
    public void createId( IERAObject object ) {
        if( !createIds ) return;
        String id = createId();
        try {
            if( object instanceof Identifiable ) {
                ( (Identifiable)object ).setIdentifier( id );
            } else if( object instanceof Rif ) {
                ( (Rif)object ).setIdentifier( id );
            }
        } catch( Exception e ) {
            throw new IllegalStateException( e );
        }
        if( logChanges ) {
            Log.log( new Status( IStatus.INFO, CoreActivator.PLUGIN_ID, "Added missing identifier "
                + id
                + " to requirement object" ) );
        }
    }

    /**
     * Query the identifier of the rif object.
     * 
     * @return {@link Rif#getIdentifier()}.
     * @since Aug 1, 2009
     */
    public String getDocumentId() {
        return getRif().getIdentifier();
    }

    /**
     * Get the object with the given id if it has a requested type.
     * 
     * @param id the id to search
     * @param type the requested type
     * @return the object or null if it does not exist or has wrong type
     * @since Jun 19, 2009
     */
    public IERAObject getById( String id, Class<? extends IERAObject> type ) {
        checkDisposed();
        IERAObject object;
        synchronized( idCache ) {
            object = idCache.get( id );
        }
        return type == null || type.isInstance( object ) ? object : null;
    }

    /**
     * Called by the document adapter to register a new identifiable.
     * 
     * @param object the object to add
     * @since Jul 28, 2009
     */
    private void addIdentifiable( IERAObject object ) {
        if( rif == null ) return;
        if( object == null ) return;
        String id = getId( object );
        if( id == null ) createId( object );
        if( id == null ) return;
        synchronized( idCache ) {
            idCache.put( id, object );
        }
    }

    /**
     * Called by the document adapter to unregister an identifiable.
     * 
     * @param object object to unregister
     * @since Jul 28, 2009
     */
    void removeIdentifiable( IERAObject object ) {
        if( rif == null ) return;
        if( object == null ) return;
        String id = getId( object );
        if( id == null ) return;
        synchronized( idCache ) {
            idCache.remove( id );
        }
    }

    private String getId( IERAObject object ) {
        return object instanceof Identifiable ? ( (Identifiable)object ).getIdentifier() : object instanceof Rif
            ? ( (Rif)object ).getIdentifier()
            : null;
    }

    /**
     * Called by the document adapter to unregister an identifiable.
     * 
     * @param id the id to unregister
     * @since Jul 28, 2009
     */
    void removeIdentifiable( String id ) {
        synchronized( idCache ) {
            idCache.remove( id );
        }
    }

    //
    // Model access

    /**
     * Get the {@link Rif} object of the model.
     * 
     * @return toplevel Rif (not null)
     */
    public Rif getRif() {
        return rif;
    }

    /**
     * Checks if document is disposed.
     * 
     * @throws IllegalStateException if disposed
     * @since Jul 31, 2009
     */
    protected void checkDisposed() throws IllegalStateException {
        if( rif == null ) throw new IllegalStateException( "Document is disposed" );
    }

    /**
     * The DocumentAdapter manages the id => Identifiable lookup tables of the model
     * 
     * @author poldi
     */
    protected static class DocumentAdapter extends EContentAdapter {

        //
        // private members

        private AbstractDocument document;

        /**
         * Creates the adapter for the given document
         * 
         * @param document the document to adapt (adapter is placed on the whole tree)
         * @since Jul 28, 2009
         */
        public DocumentAdapter( AbstractDocument document ) {
            this.document = document;
        }

        /**
         * @return the document created this adapter.
         * @since Jul 31, 2009
         */
        protected AbstractDocument getDocument() {
            return document;
        }

        /**
         * Called by document to adapt the Rif of the document.
         * 
         * @param object the rif object
         * @since Jul 28, 2009
         */
        public void adapt( IERAObject object ) {
            object.eAdapters().add( this );
        }

        /**
         * Called by document to unadapt the Rif of the document if the document is closed
         * 
         * @param object the rif object
         * @since Jul 28, 2009
         */
        public void unadapt( IERAObject object ) {
            object.eAdapters().remove( this );

        }

        /**
         * Called when a new object is adapted.
         * 
         * Registers as identifiable if the new object is an identifable.
         * 
         * @see org.eclipse.emf.ecore.util.EContentAdapter#setTarget(org.eclipse.emf.ecore.EObject)
         * @since Jul 28, 2009
         */
        @Override
        protected void setTarget( EObject target ) {
            if( target instanceof IERAObject && ( (IERAObject)target ).isIdentifiable() ) {
                document.addIdentifiable( (IERAObject)target );
            }
            super.setTarget( target );
        }

        /**
         * Called when an object is removed from the document (adapter removed).
         * 
         * Unregisters as identifiable if the new object is an identifable.
         * 
         * @see org.eclipse.emf.ecore.util.EContentAdapter#setTarget(org.eclipse.emf.ecore.EObject)
         * @since Jul 28, 2009
         */
        @Override
        protected void unsetTarget( EObject target ) {
            if( target instanceof IERAObject && ( (IERAObject)target ).isIdentifiable() ) {
                document.removeIdentifiable( (IERAObject)target );
            }
            super.unsetTarget( target );
        }

        @Override
        public void notifyChanged( Notification notification ) {
            // propagate adapter
            super.notifyChanged( notification );
            // update identifiables
            switch( notification.getEventType() ) {
                case Notification.SET:
                    changeAttributeOldValue( notification );
                    changeAttributeNewValue( notification );
                    break;
                case Notification.UNSET:
                    changeAttributeOldValue( notification );
                    break;
            }
        }

        /**
         * When changing an attribute value this method takes care of the new value.
         * 
         * @param notification the attribute change notification
         * @since Jul 28, 2009
         */
        private void changeAttributeNewValue( Notification notification ) {
            if( notification.getFeature() instanceof EAttribute ) {
                // Attribute

                if( IERAObject.IDENTIFIER.equals( ( (EAttribute)notification.getFeature() ).getName() ) ) {
                    document.addIdentifiable( (IERAObject)notification.getNotifier() );
                }
            }
        }

        /**
         * When changing an attribute value this method takes care of the old value.
         * 
         * @param notification the attribute change notification
         * @since Jul 28, 2009
         */
        private void changeAttributeOldValue( Notification notification ) {
            if( notification.getFeature() instanceof EAttribute ) {
                // Attribute

                if( IERAObject.IDENTIFIER.equals( ( (EAttribute)notification.getFeature() ).getName() ) ) {
                    document.removeIdentifiable( notification.getOldStringValue() );
                }
            }
        }

    } // IdentifiableAdpater

} // Document
