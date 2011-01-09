package era.foss.erf;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model
 * @author schorsch
 *
 */
public interface Content extends EObject {

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
