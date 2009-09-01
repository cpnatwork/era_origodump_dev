/*
 * NAME: era.foss.model.core.model.UserDocument
 */

package era.foss.model.core.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;

import era.foss.model.core.model.internal.SyncContext;
import era.foss.model.core.plugin.CoreActivator;
import era.foss.model.rif.model.Rif;
import era.foss.model.rif.model.RifSpecHierarchyRoots;
import era.foss.model.rif.model.SpecHierarchy;
import era.foss.model.rif.model.SpecHierarchyRoot;
import era.foss.model.rif.model.SpecObject;
import era.foss.model.rif.model.SpecType;
import era.foss.util.log.Log;
import era.foss.util.log.ResourceStatus;

/**
 * This class represents a user created requirement document.
 * 
 * @author poldi
 */
public class UserDocument extends AbstractDocument {

    //
    // defines

    /**
     * When loading a file from the workspace markers are created for errors and
     * warnings.
     */
    public static final String OPTION_CREATE_RESOURCE_MARKERS = "createResourceMarkers";

    /**
     * The document schema is used in ids
     */
    public static final String DOCUMENT_SCHEMA = "user";

    //
    // private members

    /**
     * If document has unsaved changes
     */
    private boolean dirty = false;

    /**
     * Create markers for errors and warnings
     */
    private boolean createResourceMarkers = false;

    private Map<SpecObject, SpecHierarchy> specObjectToHierarchy = new HashMap<SpecObject, SpecHierarchy>();

    /**
     * @param uri
     * @param options
     * @since Jul 31, 2009
     */
    public UserDocument( URI uri, Map<String, String> options ) {
        super( uri, options );
        createResourceMarkers = this.options.getBooleanOption( OPTION_CREATE_RESOURCE_MARKERS, createResourceMarkers );

        // sync empty document
        IStatus status = sync( new NullProgressMonitor() );
        if( logChanges && !status.isOK() ) {
            Log.log( status );
        }
    }

    /**
     * @see era.foss.model.core.model.AbstractDocument#getDocumentSchema()
     * @since Aug 1, 2009
     */
    @Override
    protected String getDefaultDocumentSchema() {
        return DOCUMENT_SCHEMA;
    }

    /**
     * @see era.foss.model.core.model.AbstractDocument#createDocumentAdapter(era.foss.model.core.model.AbstractDocument)
     * @since Jul 31, 2009
     */
    @Override
    protected DocumentAdapter createDocumentAdapter( AbstractDocument document ) {
        return new UserDocumentAdapter( this );
    }

    /**
     * Refactor the document model into a consistent model adding, removing or
     * changing elements as necessary.
     * 
     * @return the list of changes
     * @since Aug 2, 2009
     */
    public IStatus sync( IProgressMonitor monitor ) {
        SyncContext context = new SyncContext();
        return context.process( this, getRif() );
    }

    /**
     * @see era.foss.model.core.model.AbstractDocument#load(org.eclipse.core.runtime.IProgressMonitor)
     * @since Jul 31, 2009
     */
    @Override
    IStatus load( IProgressMonitor monitor ) {
        Rif oldRif = getRif();
        MultiStatus status = new MultiStatus( CoreActivator.PLUGIN_ID, 0, "loading document", null );
        status.addAll( super.load( monitor ) );
        status.addAll( sync( monitor ) );
        if( getRif() != oldRif ) setDirty( false );
        createResourceMarkers( status );

        return status;
    }

    /**
     * If the last load or save created errors and warnings and resource markers
     * should be created this method does it.
     * 
     * @param status
     *            the toplevel status
     * @since Jul 31, 2009
     */
    private void createResourceMarkers( IStatus status ) {
        if( !createResourceMarkers || status == null ) return;
        if( status instanceof ResourceStatus
                && ( status.getSeverity() == IStatus.ERROR || status.getSeverity() == IStatus.WARNING ) ) {
            ( (ResourceStatus)status ).createResourceMarker();
        }
        for( IStatus child : status.getChildren() ) {
            createResourceMarkers( child );
        }

    }

    /**
     * Called by the model to save this document to the disk.
     * 
     * @since Jul 28, 2009
     */
    IStatus save( IProgressMonitor monitor ) {
        checkDisposed();
        try {
            rifProcessor.save( getUri(), getRif() );
        } catch( IOException e ) {
            IStatus status = createStatus( e );
            createResourceMarkers( status );
            return status;
        }
        return createStatus( null, null );
    }

    /**
     * Marks the document dirty.
     * 
     * @since Jul 31, 2009
     */
    protected void setDirty( boolean dirty ) {
        this.dirty = dirty;
    }

    /**
     * Query if the document has unsaved changes.
     * 
     * @return true if document is dirty
     * @since Jul 31, 2009
     */
    public boolean isDirty() {
        return dirty;
    }

    public SpecType getSpecType() {
        // TODO: Implement
        
        return null;
    }

    /**
     * Get the SpecHierarchy to the given requirement object.
     * 
     * @param object
     *            The requirement object
     * @return the hierarchy or null if no hierarchy is associated
     * @since Aug 2, 2009
     */
    public List<SpecHierarchy> getRequirementHierarchy( SpecObject object ) {
        SpecHierarchy hierarchy = specObjectToHierarchy.get( object );
        if( hierarchy == null ) return null;
        List<SpecHierarchy> path = new ArrayList<SpecHierarchy>();
        while( hierarchy != null ) {
            path.set( 0, hierarchy );
            hierarchy = hierarchy.eContainer() instanceof SpecHierarchy ? (SpecHierarchy)hierarchy.eContainer() : null;
        }

        return path;
    }

    private static class UserDocumentAdapter extends DocumentAdapter {

        /**
         * @param document
         * @since Jul 31, 2009
         */
        public UserDocumentAdapter( UserDocument document ) {
            super( document );
        }

        /**
         * @see era.foss.model.core.model.AbstractDocument.DocumentAdapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
         * @since Jul 31, 2009
         */
        @Override
        public void notifyChanged( Notification notification ) {
            super.notifyChanged( notification );
            switch( notification.getEventType() ) {
                case Notification.ADD:
                case Notification.ADD_MANY:
                case Notification.MOVE:
                case Notification.REMOVE:
                case Notification.REMOVE_MANY:
                case Notification.SET:
                case Notification.UNSET:
                    ( (UserDocument)getDocument() ).setDirty( true );
                    break;
            }
        }

    } // UserDocumentAdapter

} // UserDocument
