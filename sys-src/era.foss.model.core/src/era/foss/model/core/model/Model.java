package era.foss.model.core.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;

import era.foss.model.core.model.internal.SystemDocumentRegistry;
import era.foss.model.rif.era.IERAObject;
import era.foss.util.log.Log;

/**
 * This class represents the system global era requirement model singleton.
 * 
 * <p>
 * The model is composed of a set of {@link AbstractDocument}s that either reside in projects in the Eclipse workspace
 * or that are contributed by plug-ins and are loaded when the model singleton is loaded.
 * </p>
 * 
 * <p>
 * The model manages a list of global features of the model:
 * </p>
 * 
 * <p>
 * <ul>
 * <li>id to identifiable mapping: {@link #getById(String, Class)}</li>
 * </ul>
 * </p>
 * 
 * @author poldi
 */
public class Model {

    //
    // private members

    /**
     * Model singleton instance
     */
    private static Model instance = null;
    
    /**
     * Set to true after {@link #init()} so that init is only called once
     */
    private boolean initialized = false;

    /**
     * Options via which user documents are created
     */
    private Map<String, String> userDocumentOptions = new HashMap<String, String>();

    /**
     * Options via which system documents are created
     */
    private Map<String, String> systemDocumentOptions = new HashMap<String, String>();

    private Set<AbstractDocument> allDocuments = new HashSet<AbstractDocument>();
    private Set<AbstractDocument> userDocuments = new HashSet<AbstractDocument>();
    private Set<AbstractDocument> systemDocuments = new HashSet<AbstractDocument>();

    private Model() {        
    }

    /**
     * Called by {@link #getInstance()} to initialize the model.
     * 
     * This method may not be called from the constructor in order to avoid recursion.
     * 
     * @since Aug 2, 2009
     */
    private void init() {
        if( initialized ) return;
        loadSystemDocuments();
        initialized = true;
    }
    
    /**
     * Loads system documents registered vis the systemDocument extension-point (@link {@link SystemDocumentRegistry}.
     * 
     * @since Aug 2, 2009
     */
    private void loadSystemDocuments() {
        for( SystemDocumentRegistry registration : SystemDocumentRegistry.getRegistrations() ) {
            loadSystemDocument( registration.getPlugin().getSymbolicName(), registration.getPath() );
        }
    }

    /**
     * Loads the given system document from the given plug-in.
     * 
     * @param plugIn the registering plug-in
     * @param path the path to the file within the plug-in
     * @since Aug 2, 2009
     */
    private void loadSystemDocument( String plugIn, String path ) {
        URI uri = URI.createPlatformPluginURI( "/" + plugIn + "/" + path, true );
        AbstractDocument document = new SystemDocument( uri, systemDocumentOptions );
        synchronized( allDocuments ) {
            allDocuments.add( document );
            systemDocuments.add( document );
        }
        IStatus status = document.load( new NullProgressMonitor() );
        if( status.getSeverity() == IStatus.ERROR || status.getSeverity() == IStatus.WARNING ) Log.log( status );
    }

    //
    // Singleton

    /**
     * @return The singleton model instance creating it if necessary
     * @since Jun 19, 2009
     */
    public static Model getInstance() {
        if( instance == null ) {
            instance = new Model();
            instance.init();
        }
        return instance;
    }

    //
    // Id Cache

    /**
     * Get the object with the given id if it has a requested type.
     * 
     * @param id the id to search
     * @param type the requested type
     * @return the object or null if it does not exist or has wrong type
     * @since Jun 19, 2009
     */
    public IERAObject getById( String id, Class<? extends IERAObject> type ) {
        synchronized( allDocuments ) {
            for( AbstractDocument document : allDocuments ) {
                IERAObject o = document.getById( id, type );
                if( o != null ) return o;
            }
        }

        return null;
    }

    //
    // Documents
    
    /**
     * Get the document with the given id
     */
    public AbstractDocument getDocument( String id ) {
        synchronized( allDocuments ) {
            for( AbstractDocument document : allDocuments ) {
                if( id.equals( document.getDocumentId() ) ) return document;
            }
        }
        return null;
    }

    /**
     * Get all documents (system and user).
     */
    public Set<AbstractDocument> getDocuments() {
        synchronized( allDocuments ) {
            // TODO: clone?
            return Collections.unmodifiableSet( allDocuments );
        }
    }

    /**
     * Get all user documents.
     */
    public Set<AbstractDocument> getUserDocuments() {
        synchronized( allDocuments ) {
            // TODO: clone?
            return Collections.unmodifiableSet( userDocuments );
        }
    }

    /**
     * Get all system documents.
     */
    public Set<AbstractDocument> getSystemDocuments() {
        synchronized( allDocuments ) {
            // TODO: clone?
            return Collections.unmodifiableSet( systemDocuments );
        }
    }

    /**
     * Create a new user document somewhere in the Eclipse workspace and add it to the list of documents.
     * 
     * @param file Path to the file that should be created
     * @return The newly created document
     * @since Jul 28, 2009
     */
    public AbstractDocument createUserDocument( IFile file ) {
        URI uri = URI.createURI( file.getFullPath().toPortableString() );
        AbstractDocument document = new UserDocument( uri, userDocumentOptions );
        synchronized( allDocuments ) {
            allDocuments.add( document );
            userDocuments.add( document );
        }

        return document;
    }

    /**
     * Open an existing user document from the Eclipse workspace and add it to the list of documents.
     * 
     * @param file the file to load.
     * @param diagnostic f not null an error/warning status is added
     * @return the document
     * @since Jul 28, 2009
     */
    public AbstractDocument openUserDocument( IFile file, IProgressMonitor monitor, Diagnostic diagnostic ) {
        AbstractDocument document = createUserDocument( file );
        IStatus status = document.load( monitor );
        if( diagnostic != null ) {
            diagnostic.setStatus( status != null ? status : Status.OK_STATUS );
        }

        return document;
    }

    /**
     * Saves the given user document to disk.
     * 
     * @param document The document to save
     * @param diagnostic f not null an error/warning status is added
     * @since Jul 28, 2009
     */
    public void saveUserDocument( UserDocument document, IProgressMonitor monitor, Diagnostic diagnostic )
        throws IllegalStateException {
        synchronized( allDocuments ) {
            if( !userDocuments.contains( document ) ) {
                throw new IllegalStateException( "document not opened with this model" );
            }
            IStatus status = document.save( monitor );
            if( diagnostic != null ) {
                diagnostic.setStatus( status != null ? status : Status.OK_STATUS );
            }
        }
    }

    /**
     * Removes the given document from the list of documents in this model.
     * 
     * @param document the document to close
     * @since Jul 28, 2009
     */
    public void closeUserDocument( AbstractDocument document ) {
        synchronized( allDocuments ) {
            if( !userDocuments.contains( document ) ) {
                throw new IllegalStateException( "document not opened with this model" );
            }
            document.close();
            allDocuments.remove( document );
            userDocuments.remove( document );
        }
    }

    /**
     * This class is used by load and save to hand out errors and warnings.
     * 
     * @author poldi
     */
    public static class Diagnostic {

        //
        // private members

        private IStatus status = null;

        public Diagnostic() {
        }

        /**
         * @return the status
         * @since Aug 1, 2009
         */
        public IStatus getStatus() {
            return status;
        }

        /**
         * @param status the status to set
         * @since Aug 1, 2009
         */
        public void setStatus( IStatus status ) {
            this.status = status;
        }

    } // Diagnostic

} // Model
