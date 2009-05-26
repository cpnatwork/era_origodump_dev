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
 * A representation of the model object '<em><b>Datatypes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.Datatypes#getGroup <em>Group</em>}</li>
 *   <li>{@link era.foss.model.core.rif.Datatypes#getDATATYPEDEFINITIONBINARYFILE <em>DATATYPEDEFINITIONBINARYFILE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.Datatypes#getDATATYPEDEFINITIONBOOLEAN <em>DATATYPEDEFINITIONBOOLEAN</em>}</li>
 *   <li>{@link era.foss.model.core.rif.Datatypes#getDATATYPEDEFINITIONDOCUMENT <em>DATATYPEDEFINITIONDOCUMENT</em>}</li>
 *   <li>{@link era.foss.model.core.rif.Datatypes#getDATATYPEDEFINITIONENUMERATION <em>DATATYPEDEFINITIONENUMERATION</em>}</li>
 *   <li>{@link era.foss.model.core.rif.Datatypes#getDATATYPEDEFINITIONINTEGER <em>DATATYPEDEFINITIONINTEGER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.Datatypes#getDATATYPEDEFINITIONREAL <em>DATATYPEDEFINITIONREAL</em>}</li>
 *   <li>{@link era.foss.model.core.rif.Datatypes#getDATATYPEDEFINITIONSTRING <em>DATATYPEDEFINITIONSTRING</em>}</li>
 *   <li>{@link era.foss.model.core.rif.Datatypes#getDATATYPEDEFINITIONXMLDATA <em>DATATYPEDEFINITIONXMLDATA</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getDatatypes()
 * @model extendedMetaData="name='DATATYPES_._type' kind='elementOnly'"
 * @generated
 */
public interface Datatypes extends EObject {
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
     * @see era.foss.model.core.rif.RifPackage#getDatatypes_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='group:0'"
     * @generated
     */
    FeatureMap getGroup();

    /**
     * Returns the value of the '<em><b>DATATYPEDEFINITIONBINARYFILE</b></em>' containment reference list.
     * The list contents are of type {@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DATATYPEDEFINITIONBINARYFILE</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DATATYPEDEFINITIONBINARYFILE</em>' containment reference list.
     * @see era.foss.model.core.rif.RifPackage#getDatatypes_DATATYPEDEFINITIONBINARYFILE()
     * @model type="era.foss.model.core.rif.DatatypeDefinitionBinaryFile" containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-BINARY-FILE' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList getDATATYPEDEFINITIONBINARYFILE();

    /**
     * Returns the value of the '<em><b>DATATYPEDEFINITIONBOOLEAN</b></em>' containment reference list.
     * The list contents are of type {@link era.foss.model.core.rif.DatatypeDefinitionBoolean}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DATATYPEDEFINITIONBOOLEAN</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DATATYPEDEFINITIONBOOLEAN</em>' containment reference list.
     * @see era.foss.model.core.rif.RifPackage#getDatatypes_DATATYPEDEFINITIONBOOLEAN()
     * @model type="era.foss.model.core.rif.DatatypeDefinitionBoolean" containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-BOOLEAN' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList getDATATYPEDEFINITIONBOOLEAN();

    /**
     * Returns the value of the '<em><b>DATATYPEDEFINITIONDOCUMENT</b></em>' containment reference list.
     * The list contents are of type {@link era.foss.model.core.rif.DatatypeDefinitionDocument}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DATATYPEDEFINITIONDOCUMENT</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DATATYPEDEFINITIONDOCUMENT</em>' containment reference list.
     * @see era.foss.model.core.rif.RifPackage#getDatatypes_DATATYPEDEFINITIONDOCUMENT()
     * @model type="era.foss.model.core.rif.DatatypeDefinitionDocument" containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-DOCUMENT' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList getDATATYPEDEFINITIONDOCUMENT();

    /**
     * Returns the value of the '<em><b>DATATYPEDEFINITIONENUMERATION</b></em>' containment reference list.
     * The list contents are of type {@link era.foss.model.core.rif.DatatypeDefinitionEnumeration}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DATATYPEDEFINITIONENUMERATION</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DATATYPEDEFINITIONENUMERATION</em>' containment reference list.
     * @see era.foss.model.core.rif.RifPackage#getDatatypes_DATATYPEDEFINITIONENUMERATION()
     * @model type="era.foss.model.core.rif.DatatypeDefinitionEnumeration" containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-ENUMERATION' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList getDATATYPEDEFINITIONENUMERATION();

    /**
     * Returns the value of the '<em><b>DATATYPEDEFINITIONINTEGER</b></em>' containment reference list.
     * The list contents are of type {@link era.foss.model.core.rif.DatatypeDefinitionInteger}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DATATYPEDEFINITIONINTEGER</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DATATYPEDEFINITIONINTEGER</em>' containment reference list.
     * @see era.foss.model.core.rif.RifPackage#getDatatypes_DATATYPEDEFINITIONINTEGER()
     * @model type="era.foss.model.core.rif.DatatypeDefinitionInteger" containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-INTEGER' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList getDATATYPEDEFINITIONINTEGER();

    /**
     * Returns the value of the '<em><b>DATATYPEDEFINITIONREAL</b></em>' containment reference list.
     * The list contents are of type {@link era.foss.model.core.rif.DatatypeDefinitionReal}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DATATYPEDEFINITIONREAL</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DATATYPEDEFINITIONREAL</em>' containment reference list.
     * @see era.foss.model.core.rif.RifPackage#getDatatypes_DATATYPEDEFINITIONREAL()
     * @model type="era.foss.model.core.rif.DatatypeDefinitionReal" containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-REAL' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList getDATATYPEDEFINITIONREAL();

    /**
     * Returns the value of the '<em><b>DATATYPEDEFINITIONSTRING</b></em>' containment reference list.
     * The list contents are of type {@link era.foss.model.core.rif.DatatypeDefinitionString}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DATATYPEDEFINITIONSTRING</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DATATYPEDEFINITIONSTRING</em>' containment reference list.
     * @see era.foss.model.core.rif.RifPackage#getDatatypes_DATATYPEDEFINITIONSTRING()
     * @model type="era.foss.model.core.rif.DatatypeDefinitionString" containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-STRING' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList getDATATYPEDEFINITIONSTRING();

    /**
     * Returns the value of the '<em><b>DATATYPEDEFINITIONXMLDATA</b></em>' containment reference list.
     * The list contents are of type {@link era.foss.model.core.rif.DatatypeDefinitionXmlData}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DATATYPEDEFINITIONXMLDATA</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DATATYPEDEFINITIONXMLDATA</em>' containment reference list.
     * @see era.foss.model.core.rif.RifPackage#getDatatypes_DATATYPEDEFINITIONXMLDATA()
     * @model type="era.foss.model.core.rif.DatatypeDefinitionXmlData" containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-XML-DATA' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList getDATATYPEDEFINITIONXMLDATA();

} // Datatypes
