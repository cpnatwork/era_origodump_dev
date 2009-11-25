/*
 * NAME: era.foss.model.core.model.RootStructureSyncHandler
 */

package era.foss.model.core.model.sync;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import era.foss.model.core.model.AbstractDocument;
import era.foss.model.core.model.AbstractDocumentSyncHandler;
import era.foss.model.core.util.DocumentUtils;
import era.foss.model.rif.era.IERAObject;
import era.foss.model.rif.model.Rif;
import era.foss.model.rif.model.SpecGroup;

/**
 * Creates mandatory objects that are needed by all documents.
 * 
 * <ul>
 * <li>SpecHierarchyRoot
 * </ul>
 * 
 * @author poldi
 */
public class RootStructureSyncHandler extends AbstractDocumentSyncHandler {
    
    //
    // defines
    
    public static final String REQUIREMENT_GROUP_TYPE = "system:documentCore:requirementGroup"; 

    /**
     * 
     * @since Aug 4, 2009
     */
    public RootStructureSyncHandler() {
    }

    /**
     * @see era.foss.model.core.model.AbstractDocumentSyncHandler#sync(era.foss.model.core.model.AbstractDocument)
     * @since Aug 4, 2009
     */
    @Override
    public IStatus process( AbstractDocument document, IERAObject object, boolean fix ) {
        if( !( object instanceof Rif ) ) return Status.OK_STATUS;
        Rif rif = (Rif)object;
        
        processRequirementGroup( document, rif, fix );

        return Status.OK_STATUS;
    }
    
    private IStatus processRequirementGroup( AbstractDocument document, Rif rif, boolean fix ) {
        List<SpecGroup> groups = DocumentUtils.getSpecGroupsByType( document, REQUIREMENT_GROUP_TYPE );
        SpecGroup group = groups.size() > 0 ? groups.iterator().next() : null;
        if( !fix && group == null ) return new Status( IStatus.ERROR, null, "Missing group" );
        group = DocumentUtils.createSpecGroupWithType( document, REQUIREMENT_GROUP_TYPE );
        
        return Status.OK_STATUS;
    }
    
} // RootStructureSyncHandler
