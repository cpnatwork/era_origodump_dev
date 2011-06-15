package era.foss.erf;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface View extends EObject {

    /**
     * @model containment="true" ordered="true"
     */
    public EList<ViewElement> getViewElements();

}
