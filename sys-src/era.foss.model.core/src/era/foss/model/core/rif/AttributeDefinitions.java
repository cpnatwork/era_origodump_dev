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
 * A representation of the model object '<em><b>Attribute Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitions#getGroup <em>Group</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitions#getATTRIBUTEDEFINITIONCOMPLEXREF <em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitions#getATTRIBUTEDEFINITIONENUMERATIONREF <em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitions#getATTRIBUTEDEFINITIONSIMPLEREF <em>ATTRIBUTEDEFINITIONSIMPLEREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitions()
 * @model extendedMetaData="name='ATTRIBUTE-DEFINITIONS_._type' kind='elementOnly'"
 * @generated
 */
public interface AttributeDefinitions extends EObject {
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
	 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitions_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONCOMPLEXREF</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>' attribute list.
	 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitions_ATTRIBUTEDEFINITIONCOMPLEXREF()
	 * @model unique="false" dataType="era.foss.model.core.rif.REF" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-COMPLEX-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getATTRIBUTEDEFINITIONCOMPLEXREF();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONENUMERATIONREF</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>' attribute list.
	 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitions_ATTRIBUTEDEFINITIONENUMERATIONREF()
	 * @model unique="false" dataType="era.foss.model.core.rif.REF" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-ENUMERATION-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getATTRIBUTEDEFINITIONENUMERATIONREF();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONSIMPLEREF</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONSIMPLEREF</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONSIMPLEREF</em>' attribute list.
	 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitions_ATTRIBUTEDEFINITIONSIMPLEREF()
	 * @model unique="false" dataType="era.foss.model.core.rif.REF" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-SIMPLE-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getATTRIBUTEDEFINITIONSIMPLEREF();

} // AttributeDefinitions
