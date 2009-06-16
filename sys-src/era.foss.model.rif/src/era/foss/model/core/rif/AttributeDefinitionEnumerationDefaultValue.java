/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Definition Enumeration Default Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitionEnumerationDefaultValue#getGroup <em>Group</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitionEnumerationDefaultValue#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionEnumerationDefaultValue()
 * @model extendedMetaData="name='DEFAULT-VALUE_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface AttributeDefinitionEnumerationDefaultValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionEnumerationDefaultValue_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list.
	 * The list contents are of type {@link era.foss.model.core.rif.AttributeValueEnumeration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUEENUMERATION</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUEENUMERATION</em>' containment reference list.
	 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionEnumerationDefaultValue_ATTRIBUTEVALUEENUMERATION()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-ENUMERATION' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AttributeValueEnumeration> getATTRIBUTEVALUEENUMERATION();

} // AttributeDefinitionEnumerationDefaultValue
