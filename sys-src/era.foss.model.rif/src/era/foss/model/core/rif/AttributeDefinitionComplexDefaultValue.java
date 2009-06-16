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
 * A representation of the model object '<em><b>Attribute Definition Complex Default Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitionComplexDefaultValue#getATTRIBUTEVALUEXMLDATA <em>ATTRIBUTEVALUEXMLDATA</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionComplexDefaultValue()
 * @model extendedMetaData="name='DEFAULT-VALUE_._2_._type' kind='elementOnly'"
 * @generated
 */
public interface AttributeDefinitionComplexDefaultValue extends EObject {
	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUEXMLDATA</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUEXMLDATA</em>' containment reference.
	 * @see #setATTRIBUTEVALUEXMLDATA(AttributeValueXmlData)
	 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionComplexDefaultValue_ATTRIBUTEVALUEXMLDATA()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-XML-DATA' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributeValueXmlData getATTRIBUTEVALUEXMLDATA();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeDefinitionComplexDefaultValue#getATTRIBUTEVALUEXMLDATA <em>ATTRIBUTEVALUEXMLDATA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ATTRIBUTEVALUEXMLDATA</em>' containment reference.
	 * @see #getATTRIBUTEVALUEXMLDATA()
	 * @generated
	 */
	void setATTRIBUTEVALUEXMLDATA(AttributeValueXmlData value);

} // AttributeDefinitionComplexDefaultValue
