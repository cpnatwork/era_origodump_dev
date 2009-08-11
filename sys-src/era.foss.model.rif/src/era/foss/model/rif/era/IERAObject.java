/*
 * NAME: era.foss.model.core.model.internal.IERAObject
 */

package era.foss.model.rif.era;

import org.eclipse.emf.ecore.EObject;

/**
 * The type of all model elements.
 *  
 * @author poldi
 */
public interface IERAObject extends EObject {
    
    //
    // defines
    
    /**
     * structural feature name of the "identifier" feature.
     */
    public static final String IDENTIFIER = "identifier";
    
    /**
     * @return true if object is an identifiable
     * @since Jun 19, 2009
     */
    public boolean isIdentifiable();

} // IERAObject
