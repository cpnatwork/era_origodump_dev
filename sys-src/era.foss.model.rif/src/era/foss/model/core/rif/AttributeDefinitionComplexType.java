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
 * A representation of the model object '<em><b>Attribute Definition Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitionComplexType#getDATATYPEDEFINITIONBINARYFILEREF <em>DATATYPEDEFINITIONBINARYFILEREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitionComplexType#getDATATYPEDEFINITIONDOCUMENTREF <em>DATATYPEDEFINITIONDOCUMENTREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitionComplexType#getDATATYPEDEFINITIONXMLDATAREF <em>DATATYPEDEFINITIONXMLDATAREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionComplexType()
 * @model extendedMetaData="name='TYPE_._6_._type' kind='elementOnly'"
 * @generated
 */
public interface AttributeDefinitionComplexType extends EObject {
	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONBINARYFILEREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONBINARYFILEREF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONBINARYFILEREF</em>' attribute.
	 * @see #setDATATYPEDEFINITIONBINARYFILEREF(String)
	 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionComplexType_DATATYPEDEFINITIONBINARYFILEREF()
	 * @model dataType="era.foss.model.core.rif.REF"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-BINARY-FILE-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDATATYPEDEFINITIONBINARYFILEREF();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeDefinitionComplexType#getDATATYPEDEFINITIONBINARYFILEREF <em>DATATYPEDEFINITIONBINARYFILEREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATATYPEDEFINITIONBINARYFILEREF</em>' attribute.
	 * @see #getDATATYPEDEFINITIONBINARYFILEREF()
	 * @generated
	 */
	void setDATATYPEDEFINITIONBINARYFILEREF(String value);

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONDOCUMENTREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONDOCUMENTREF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONDOCUMENTREF</em>' attribute.
	 * @see #setDATATYPEDEFINITIONDOCUMENTREF(String)
	 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionComplexType_DATATYPEDEFINITIONDOCUMENTREF()
	 * @model dataType="era.foss.model.core.rif.REF"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-DOCUMENT-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDATATYPEDEFINITIONDOCUMENTREF();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeDefinitionComplexType#getDATATYPEDEFINITIONDOCUMENTREF <em>DATATYPEDEFINITIONDOCUMENTREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATATYPEDEFINITIONDOCUMENTREF</em>' attribute.
	 * @see #getDATATYPEDEFINITIONDOCUMENTREF()
	 * @generated
	 */
	void setDATATYPEDEFINITIONDOCUMENTREF(String value);

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONXMLDATAREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONXMLDATAREF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONXMLDATAREF</em>' attribute.
	 * @see #setDATATYPEDEFINITIONXMLDATAREF(String)
	 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionComplexType_DATATYPEDEFINITIONXMLDATAREF()
	 * @model dataType="era.foss.model.core.rif.REF"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-XML-DATA-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDATATYPEDEFINITIONXMLDATAREF();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeDefinitionComplexType#getDATATYPEDEFINITIONXMLDATAREF <em>DATATYPEDEFINITIONXMLDATAREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATATYPEDEFINITIONXMLDATAREF</em>' attribute.
	 * @see #getDATATYPEDEFINITIONXMLDATAREF()
	 * @generated
	 */
	void setDATATYPEDEFINITIONXMLDATAREF(String value);

} // AttributeDefinitionComplexType
