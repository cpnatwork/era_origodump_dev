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
 * A representation of the model object '<em><b>Attribute Value Xml Data Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.AttributeValueXmlDataDefinition#getATTRIBUTEDEFINITIONCOMPLEXREF <em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getAttributeValueXmlDataDefinition()
 * @model extendedMetaData="name='DEFINITION_._5_._type' kind='elementOnly'"
 * @generated
 */
public interface AttributeValueXmlDataDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONCOMPLEXREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>' attribute.
	 * @see #setATTRIBUTEDEFINITIONCOMPLEXREF(String)
	 * @see era.foss.model.core.rif.RifPackage#getAttributeValueXmlDataDefinition_ATTRIBUTEDEFINITIONCOMPLEXREF()
	 * @model dataType="era.foss.model.core.rif.REF"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-COMPLEX-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	String getATTRIBUTEDEFINITIONCOMPLEXREF();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeValueXmlDataDefinition#getATTRIBUTEDEFINITIONCOMPLEXREF <em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>' attribute.
	 * @see #getATTRIBUTEDEFINITIONCOMPLEXREF()
	 * @generated
	 */
	void setATTRIBUTEDEFINITIONCOMPLEXREF(String value);

} // AttributeValueXmlDataDefinition
