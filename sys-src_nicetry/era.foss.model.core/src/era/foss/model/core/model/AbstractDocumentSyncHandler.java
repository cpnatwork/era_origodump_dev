/*
 * NAME: era.foss.model.core.model.IDocumentSyncHandler
 */

package era.foss.model.core.model;

import org.eclipse.core.runtime.IStatus;

import era.foss.model.core.model.internal.DocumentSyncRegistry;
import era.foss.model.core.model.internal.SyncContext;
import era.foss.model.rif.era.IERAObject;

/**
 * DocumentSyncHandlers are called after a {@link AbstractDocument} is created or loaded to "fix" the given document.
 * 
 * <p>
 * A DocumentSyncHandler is registered via the documentSync extension-point. It can be ordered to run after another
 * DocumentSyncHandler so that handlers can build upon each other.
 * </p>
 * 
 * <p>
 * DocumentSyncHandlers ensure that a document is consistent by adding missing elements, removing invalid elements
 * or changing or adding attributes of an element. 
 * </p>
 * 
 * <p>
 * A DocumentSyncHandler keeps track of all changes it had made and returns them as an IStatus
 * </p>
 * 
 * @author poldi
 */
public abstract class AbstractDocumentSyncHandler {
    
    //
    // private members
    
    private SyncContext context = null;
    
    /**
     * Called by the {@link SyncContext} to process a given IERAObject.
     * 
     * This method is used only internally
     * 
     * @param document The processed document
     * @param context The context of the current run
     * @param registry the registry that registered this handler
     * @param object the object to be processed
     */
    public IStatus process( AbstractDocument document, SyncContext context, DocumentSyncRegistry registry, IERAObject object ) {
        this.context = context;
        return process( document, object, registry.isFixing() );
    }
	
    /**
     * Fix one aspect of the given document.
     * 
     * @param document The processed document
     * @param document The document to fix
     * @param fix true if this handler should actually fix the document
     * @return a record what has been changed
     * @since Aug 2, 2009
     */
    public abstract IStatus process( AbstractDocument document, IERAObject object, boolean fix );
    
    /**
     * Process the given object.
     * 
     * @param object The object to be processed
     */
    protected void visit( IERAObject object ) {
        context.visit( object );
    }
    
    /**
     * Query if a handler returned errors.
     * 
     * <p>
     * If errors have been reported the model may be in an inconsistent state. No delegation is possible in this case.
     * </p>
     * 
     * @return One handler returned errors
     */
    public boolean hasErrors() {
        return context.hasErrors();
    }

} //IDocumentSyncHandler
