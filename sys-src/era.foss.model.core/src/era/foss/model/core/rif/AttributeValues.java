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
 * A representation of the model object '<em><b>Attribute Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.AttributeValues#getGroup <em>Group</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeValues#getATTRIBUTEVALUEEMBEDDEDDOCUMENTREF <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeValues#getATTRIBUTEVALUEEMBEDDEDFILEREF <em>ATTRIBUTEVALUEEMBEDDEDFILEREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeValues#getATTRIBUTEVALUEENUMERATIONREF <em>ATTRIBUTEVALUEENUMERATIONREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeValues#getATTRIBUTEVALUEFILEREFERENCEREF <em>ATTRIBUTEVALUEFILEREFERENCEREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeValues#getATTRIBUTEVALUESIMPLEREF <em>ATTRIBUTEVALUESIMPLEREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeValues#getATTRIBUTEVALUEXMLDATAREF <em>ATTRIBUTEVALUEXMLDATAREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getAttributeValues()
 * @model extendedMetaData="name='ATTRIBUTE-VALUES_._type' kind='elementOnly'"
 * @generated
 */
public interface AttributeValues extends EObject {
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
     * @see era.foss.model.core.rif.RifPackage#getAttributeValues_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='group:0'"
     * @generated
     */
    FeatureMap getGroup();

    /**
     * Returns the value of the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF</em>' attribute list.
     * @see era.foss.model.core.rif.RifPackage#getAttributeValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF()
     * @model unique="false" dataType="era.foss.model.core.rif.REF" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-EMBEDDED-DOCUMENT-REF' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList getATTRIBUTEVALUEEMBEDDEDDOCUMENTREF();

    /**
     * Returns the value of the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILEREF</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ATTRIBUTEVALUEEMBEDDEDFILEREF</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ATTRIBUTEVALUEEMBEDDEDFILEREF</em>' attribute list.
     * @see era.foss.model.core.rif.RifPackage#getAttributeValues_ATTRIBUTEVALUEEMBEDDEDFILEREF()
     * @model unique="false" dataType="era.foss.model.core.rif.REF" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-EMBEDDED-FILE-REF' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList getATTRIBUTEVALUEEMBEDDEDFILEREF();

    /**
     * Returns the value of the '<em><b>ATTRIBUTEVALUEENUMERATIONREF</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ATTRIBUTEVALUEENUMERATIONREF</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ATTRIBUTEVALUEENUMERATIONREF</em>' attribute list.
     * @see era.foss.model.core.rif.RifPackage#getAttributeValues_ATTRIBUTEVALUEENUMERATIONREF()
     * @model unique="false" dataType="era.foss.model.core.rif.REF" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-ENUMERATION-REF' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList getATTRIBUTEVALUEENUMERATIONREF();

    /**
     * Returns the value of the '<em><b>ATTRIBUTEVALUEFILEREFERENCEREF</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ATTRIBUTEVALUEFILEREFERENCEREF</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ATTRIBUTEVALUEFILEREFERENCEREF</em>' attribute list.
     * @see era.foss.model.core.rif.RifPackage#getAttributeValues_ATTRIBUTEVALUEFILEREFERENCEREF()
     * @model unique="false" dataType="era.foss.model.core.rif.REF" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-FILE-REFERENCE-REF' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList getATTRIBUTEVALUEFILEREFERENCEREF();

    /**
     * Returns the value of the '<em><b>ATTRIBUTEVALUESIMPLEREF</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ATTRIBUTEVALUESIMPLEREF</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ATTRIBUTEVALUESIMPLEREF</em>' attribute list.
     * @see era.foss.model.core.rif.RifPackage#getAttributeValues_ATTRIBUTEVALUESIMPLEREF()
     * @model unique="false" dataType="era.foss.model.core.rif.REF" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-SIMPLE-REF' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList getATTRIBUTEVALUESIMPLEREF();

    /**
     * Returns the value of the '<em><b>ATTRIBUTEVALUEXMLDATAREF</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ATTRIBUTEVALUEXMLDATAREF</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ATTRIBUTEVALUEXMLDATAREF</em>' attribute list.
     * @see era.foss.model.core.rif.RifPackage#getAttributeValues_ATTRIBUTEVALUEXMLDATAREF()
     * @model unique="false" dataType="era.foss.model.core.rif.REF" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-XML-DATA-REF' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList getATTRIBUTEVALUEXMLDATAREF();

} // AttributeValues
