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
 * A representation of the model object '<em><b>Attribute Value Enumeration Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.AttributeValueEnumerationDefinition#getATTRIBUTEDEFINITIONENUMERATIONREF <em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getAttributeValueEnumerationDefinition()
 * @model extendedMetaData="name='DEFINITION_._4_._type' kind='elementOnly'"
 * @generated
 */
public interface AttributeValueEnumerationDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONENUMERATIONREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>' attribute.
	 * @see #setATTRIBUTEDEFINITIONENUMERATIONREF(String)
	 * @see era.foss.model.core.rif.RifPackage#getAttributeValueEnumerationDefinition_ATTRIBUTEDEFINITIONENUMERATIONREF()
	 * @model dataType="era.foss.model.core.rif.REF"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-ENUMERATION-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	String getATTRIBUTEDEFINITIONENUMERATIONREF();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeValueEnumerationDefinition#getATTRIBUTEDEFINITIONENUMERATIONREF <em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>' attribute.
	 * @see #getATTRIBUTEDEFINITIONENUMERATIONREF()
	 * @generated
	 */
	void setATTRIBUTEDEFINITIONENUMERATIONREF(String value);

} // AttributeValueEnumerationDefinition
