package era.foss.model.core.model.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;

import era.foss.model.core.model.AbstractDocument;
import era.foss.model.core.model.AbstractDocumentSyncHandler;
import era.foss.model.core.model.UserDocument;
import era.foss.model.core.plugin.CoreActivator;
import era.foss.model.rif.era.IERAObject;

/**
 * The {@link SyncContext} object represents on run of
 * {@link AbstractDocumentSyncHandler} against one {@link IERAObject}.
 * 
 * <p>
 * It takes care of the delegation calls of the
 * {@link AbstractDocumentSyncHandler}s, instantation and processing of
 * corresponding {@link AbstractDocumentSyncHandler}s and loop detection.
 * </p>
 * 
 * <p>
 * The {@link SyncContext} is initially created by
 * {@link UserDocument#sync(org.eclipse.core.runtime.IProgressMonitor)} which
 * initiates one run.
 * </p>
 * 
 * @author poldi
 * 
 */
public class SyncContext {

    //
    // private members

    /**
     * true if one handler returned errors
     */
    private boolean hasErrors = false;
    
    /**
     * The processed document
     */
    private AbstractDocument document = null;

    /**
     * The list of stati collected during handler runs
     */
    private List<IStatus> collectedStati = new ArrayList<IStatus>();

    /**
     * All created handlers of this run (handlers are unique to one
     * {@link SyncContext}
     */
    private Map<Class<? extends IERAObject>, List<Handler>> handler = new HashMap<Class<? extends IERAObject>, List<Handler>>();

    /**
     * The pocessed objects for loop detected
     */
    private Set<IERAObject> processedObjects = new HashSet<IERAObject>();

    /**
     * This method runs the given object through all corresponding handlers if
     * the object was not already processed by this {@link SyncContext}.
     * 
     * @param document The document that is been synced
     * @param object
     *            the object to process
     * @return the cumulated status
     */
    public IStatus process( AbstractDocument document, IERAObject object ) {
        this.document = document;
        
        visit( object );        

        if( collectedStati.size() == 0 ) return Status.OK_STATUS;
        return new MultiStatus( CoreActivator.PLUGIN_ID,
                                0,
                                collectedStati.toArray( new IStatus[collectedStati.size()] ),
                                "Synchronized document",
                                null );
    }
       
    /**
     * The the document that is been synced
     * 
     * @return The document that is been synced
     */
    public AbstractDocument getDocument() {
        return document;
    }

    /**
     * This method runs the given object through all corresponding handlers if
     * the object was not already processed by this {@link SyncContext}.
     * 
     * <p>
     * This method is called by {@link AbstractDocumentSyncHandler} which does
     * not collect the overall status.
     * </p>
     * 
     * @param object the object to process
     */
    public void visit( IERAObject object ) {
        if( hasErrors ) return;        
        if( processedObjects.contains( object ) ) return;

        for( Handler handler : getHandlers( object ) ) {
            // run handler
            IStatus status = handler.getHandler().process( document, this, handler.getRegistry(), object );

            // Collect stati
            if( status instanceof MultiStatus ) {
                for( IStatus childStatus : ( (MultiStatus)status ).getChildren() ) {
                    collectedStati.add( childStatus );
                }
            } else {
                collectedStati.add( status );
            }
            if( !status.isOK() ) {
                hasErrors = true;
                break;
            }
        }

        // Loop detection
        processedObjects.add( object );

        return;
    }
    
    /**
     * Query if one of the handler returned errors.
     * 
     * @return true if errors were reported
     */
    public boolean hasErrors() {
        return hasErrors;
    }

    /**
     * Get or create the handlers that can process the given object.
     * 
     * @param object
     *            The object to process
     * @return Handlers and registries for the object
     */
    private List<Handler> getHandlers( IERAObject object ) {
        Class<? extends IERAObject> type = object.getClass();
        List<Handler> handlers = handler.get( type );
        if( handlers != null ) return handlers;
        handlers = new ArrayList<Handler>();
        for( DocumentSyncRegistry registry : DocumentSyncRegistry.getRegistrations( document, type ) ) {
            handlers.add( new Handler( registry, registry.createHandler() ) );
        }

        handler.put( type, handlers );
        return handlers;
    }

    /**
     * Maps handler and registry
     * 
     * @author poldi
     * 
     */
    private static class Handler {

        //
        // private members

        /**
         * The registry
         */
        private DocumentSyncRegistry registry;

        /**
         * The corresponding handler
         */
        private AbstractDocumentSyncHandler handler;

        public Handler( DocumentSyncRegistry registry, AbstractDocumentSyncHandler handler ) {
            this.registry = registry;
            this.handler = handler;
        }

        public DocumentSyncRegistry getRegistry() {
            return registry;
        }

        public AbstractDocumentSyncHandler getHandler() {
            return handler;
        }

    } // Handler

} // SyncContext
