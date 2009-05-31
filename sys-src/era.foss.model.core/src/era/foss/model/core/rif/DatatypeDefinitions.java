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
 * A representation of the model object '<em><b>Datatype Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitions#getGroup <em>Group</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitions#getDATATYPEDEFINITIONBINARYFILEREF <em>DATATYPEDEFINITIONBINARYFILEREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitions#getDATATYPEDEFINITIONBOOLEANREF <em>DATATYPEDEFINITIONBOOLEANREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitions#getDATATYPEDEFINITIONDOCUMENTREF <em>DATATYPEDEFINITIONDOCUMENTREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitions#getDATATYPEDEFINITIONENUMERATIONREF <em>DATATYPEDEFINITIONENUMERATIONREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitions#getDATATYPEDEFINITIONINTEGERREF <em>DATATYPEDEFINITIONINTEGERREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitions#getDATATYPEDEFINITIONREALREF <em>DATATYPEDEFINITIONREALREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitions#getDATATYPEDEFINITIONSTRINGREF <em>DATATYPEDEFINITIONSTRINGREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitions#getDATATYPEDEFINITIONXMLDATAREF <em>DATATYPEDEFINITIONXMLDATAREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitions()
 * @model extendedMetaData="name='DATATYPE-DEFINITIONS_._type' kind='elementOnly'"
 * @generated
 */
public interface DatatypeDefinitions extends EObject {
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
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitions_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONBINARYFILEREF</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONBINARYFILEREF</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONBINARYFILEREF</em>' attribute list.
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitions_DATATYPEDEFINITIONBINARYFILEREF()
	 * @model unique="false" dataType="era.foss.model.core.rif.REF" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-BINARY-FILE-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getDATATYPEDEFINITIONBINARYFILEREF();

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONBOOLEANREF</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONBOOLEANREF</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONBOOLEANREF</em>' attribute list.
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitions_DATATYPEDEFINITIONBOOLEANREF()
	 * @model unique="false" dataType="era.foss.model.core.rif.REF" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-BOOLEAN-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getDATATYPEDEFINITIONBOOLEANREF();

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONDOCUMENTREF</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONDOCUMENTREF</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONDOCUMENTREF</em>' attribute list.
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitions_DATATYPEDEFINITIONDOCUMENTREF()
	 * @model unique="false" dataType="era.foss.model.core.rif.REF" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-DOCUMENT-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getDATATYPEDEFINITIONDOCUMENTREF();

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONENUMERATIONREF</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONENUMERATIONREF</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONENUMERATIONREF</em>' attribute list.
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitions_DATATYPEDEFINITIONENUMERATIONREF()
	 * @model unique="false" dataType="era.foss.model.core.rif.REF" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-ENUMERATION-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getDATATYPEDEFINITIONENUMERATIONREF();

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONINTEGERREF</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONINTEGERREF</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONINTEGERREF</em>' attribute list.
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitions_DATATYPEDEFINITIONINTEGERREF()
	 * @model unique="false" dataType="era.foss.model.core.rif.REF" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-INTEGER-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getDATATYPEDEFINITIONINTEGERREF();

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONREALREF</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONREALREF</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONREALREF</em>' attribute list.
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitions_DATATYPEDEFINITIONREALREF()
	 * @model unique="false" dataType="era.foss.model.core.rif.REF" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-REAL-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getDATATYPEDEFINITIONREALREF();

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONSTRINGREF</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONSTRINGREF</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONSTRINGREF</em>' attribute list.
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitions_DATATYPEDEFINITIONSTRINGREF()
	 * @model unique="false" dataType="era.foss.model.core.rif.REF" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-STRING-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getDATATYPEDEFINITIONSTRINGREF();

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONXMLDATAREF</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONXMLDATAREF</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONXMLDATAREF</em>' attribute list.
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitions_DATATYPEDEFINITIONXMLDATAREF()
	 * @model unique="false" dataType="era.foss.model.core.rif.REF" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-XML-DATA-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getDATATYPEDEFINITIONXMLDATAREF();

} // DatatypeDefinitions
