package era.foss.model.core.model.rif;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import java.util.List;

/**
 * @model
 * @author poldi
 *
 */
public interface RIF extends EObject {
    
    /**
     * @model containment="true"
     */
    public EList<SpecObject> getSpecObjects();

    /**
     * @model containment="true"
     */
    public EList<SpecType> getSpecTypes();
    
    /**
     * @model containment="true"
     */
    public EList<DatatypeDefinition> getDataTypes();

}
