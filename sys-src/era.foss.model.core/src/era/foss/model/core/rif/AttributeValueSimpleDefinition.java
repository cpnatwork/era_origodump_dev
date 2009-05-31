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
 * A representation of the model object '<em><b>Attribute Value Simple Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.AttributeValueSimpleDefinition#getATTRIBUTEDEFINITIONSIMPLEREF <em>ATTRIBUTEDEFINITIONSIMPLEREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getAttributeValueSimpleDefinition()
 * @model extendedMetaData="name='DEFINITION_._3_._type' kind='elementOnly'"
 * @generated
 */
public interface AttributeValueSimpleDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONSIMPLEREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONSIMPLEREF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONSIMPLEREF</em>' attribute.
	 * @see #setATTRIBUTEDEFINITIONSIMPLEREF(String)
	 * @see era.foss.model.core.rif.RifPackage#getAttributeValueSimpleDefinition_ATTRIBUTEDEFINITIONSIMPLEREF()
	 * @model dataType="era.foss.model.core.rif.REF"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-SIMPLE-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	String getATTRIBUTEDEFINITIONSIMPLEREF();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeValueSimpleDefinition#getATTRIBUTEDEFINITIONSIMPLEREF <em>ATTRIBUTEDEFINITIONSIMPLEREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ATTRIBUTEDEFINITIONSIMPLEREF</em>' attribute.
	 * @see #getATTRIBUTEDEFINITIONSIMPLEREF()
	 * @generated
	 */
	void setATTRIBUTEDEFINITIONSIMPLEREF(String value);

} // AttributeValueSimpleDefinition
