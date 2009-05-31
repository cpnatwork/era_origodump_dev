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
 * A representation of the model object '<em><b>Attribute Definition Simple Default Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitionSimpleDefaultValue#getATTRIBUTEVALUESIMPLE <em>ATTRIBUTEVALUESIMPLE</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionSimpleDefaultValue()
 * @model extendedMetaData="name='DEFAULT-VALUE_._type' kind='elementOnly'"
 * @generated
 */
public interface AttributeDefinitionSimpleDefaultValue extends EObject {
	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUESIMPLE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUESIMPLE</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUESIMPLE</em>' containment reference.
	 * @see #setATTRIBUTEVALUESIMPLE(AttributeValueSimple)
	 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionSimpleDefaultValue_ATTRIBUTEVALUESIMPLE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-SIMPLE' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributeValueSimple getATTRIBUTEVALUESIMPLE();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeDefinitionSimpleDefaultValue#getATTRIBUTEVALUESIMPLE <em>ATTRIBUTEVALUESIMPLE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ATTRIBUTEVALUESIMPLE</em>' containment reference.
	 * @see #getATTRIBUTEVALUESIMPLE()
	 * @generated
	 */
	void setATTRIBUTEVALUESIMPLE(AttributeValueSimple value);

} // AttributeDefinitionSimpleDefaultValue
