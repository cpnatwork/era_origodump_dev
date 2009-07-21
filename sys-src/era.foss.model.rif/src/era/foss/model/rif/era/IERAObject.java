/*
 * NAME: era.foss.model.core.model.internal.IERAObject
 */

package era.foss.model.rif.era;

import org.eclipse.emf.ecore.EObject;

/**
 * 
 * @author poldi
 */
public interface IERAObject extends EObject {
    
    /**
     * @return true if object is an identifiable
     * @since Jun 19, 2009
     */
    public boolean isIdentifiable();

}
