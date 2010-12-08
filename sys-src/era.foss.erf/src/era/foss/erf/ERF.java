package era.foss.erf;

import org.eclipse.emf.ecore.EObject;

/**
 * @model
 * @author poldi
 *
 */
public interface ERF extends EObject {

	/**
	 * @model containment="true" lowerBound="1"
	 */
	public RIFContent getCoreContent();

	/**
	 * Sets the value of the '{@link era.foss.erf.ERF#getCoreContent <em>Core Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Content</em>' containment reference.
	 * @see #getCoreContent()
	 * @generated
	 */
	void setCoreContent(RIFContent value);

}
