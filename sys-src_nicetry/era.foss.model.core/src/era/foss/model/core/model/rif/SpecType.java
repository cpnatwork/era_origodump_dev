package era.foss.model.core.model.rif;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import java.util.List;


/**
 * @model
 * @author poldi
 *
 */
public interface SpecType extends EObject {
    
    /**
     * @model containment="true"
     */
    public EList<AttributeDefinition> getDefinitions();

}
