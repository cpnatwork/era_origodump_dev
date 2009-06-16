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
 * A representation of the model object '<em><b>Spec Group Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.SpecGroupType#getSPECTYPEREF <em>SPECTYPEREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getSpecGroupType()
 * @model extendedMetaData="name='TYPE_._5_._type' kind='elementOnly'"
 * @generated
 */
public interface SpecGroupType extends EObject {
	/**
	 * Returns the value of the '<em><b>SPECTYPEREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECTYPEREF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECTYPEREF</em>' attribute.
	 * @see #setSPECTYPEREF(String)
	 * @see era.foss.model.core.rif.RifPackage#getSpecGroupType_SPECTYPEREF()
	 * @model dataType="era.foss.model.core.rif.REF"
	 *        extendedMetaData="kind='element' name='SPEC-TYPE-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSPECTYPEREF();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.SpecGroupType#getSPECTYPEREF <em>SPECTYPEREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECTYPEREF</em>' attribute.
	 * @see #getSPECTYPEREF()
	 * @generated
	 */
	void setSPECTYPEREF(String value);

} // SpecGroupType
