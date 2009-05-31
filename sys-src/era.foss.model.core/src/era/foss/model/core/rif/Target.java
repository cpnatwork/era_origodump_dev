/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.Target#getSPECOBJECTREF <em>SPECOBJECTREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getTarget()
 * @model extendedMetaData="name='TARGET_._type' kind='elementOnly'"
 * @generated
 */
public interface Target extends EObject {
	/**
	 * Returns the value of the '<em><b>SPECOBJECTREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECOBJECTREF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECOBJECTREF</em>' attribute.
	 * @see #setSPECOBJECTREF(String)
	 * @see era.foss.model.core.rif.RifPackage#getTarget_SPECOBJECTREF()
	 * @model dataType="era.foss.model.core.rif.REF"
	 *        extendedMetaData="kind='element' name='SPEC-OBJECT-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSPECOBJECTREF();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.Target#getSPECOBJECTREF <em>SPECOBJECTREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECOBJECTREF</em>' attribute.
	 * @see #getSPECOBJECTREF()
	 * @generated
	 */
	void setSPECOBJECTREF(String value);

} // Target
