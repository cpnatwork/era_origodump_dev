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
 * A representation of the model object '<em><b>Spec Object Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.SpecObjectValues#getGroup <em>Group</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecObjectValues#getATTRIBUTEVALUEEMBEDDEDDOCUMENT <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecObjectValues#getATTRIBUTEVALUEEMBEDDEDFILE <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecObjectValues#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecObjectValues#getATTRIBUTEVALUEFILEREFERENCE <em>ATTRIBUTEVALUEFILEREFERENCE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecObjectValues#getATTRIBUTEVALUESIMPLE <em>ATTRIBUTEVALUESIMPLE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecObjectValues#getATTRIBUTEVALUEXMLDATA <em>ATTRIBUTEVALUEXMLDATA</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getSpecObjectValues()
 * @model extendedMetaData="name='VALUES_._type' kind='elementOnly'"
 * @generated
 */
public interface SpecObjectValues extends EObject {
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
	 * @see era.foss.model.core.rif.RifPackage#getSpecObjectValues_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>' containment reference list.
	 * The list contents are of type {@link era.foss.model.core.rif.AttributeValueEmbeddedDocument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>' containment reference list.
	 * @see era.foss.model.core.rif.RifPackage#getSpecObjectValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENT()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-EMBEDDED-DOCUMENT' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AttributeValueEmbeddedDocument> getATTRIBUTEVALUEEMBEDDEDDOCUMENT();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILE</b></em>' containment reference list.
	 * The list contents are of type {@link era.foss.model.core.rif.AttributeValueEmbeddedFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUEEMBEDDEDFILE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUEEMBEDDEDFILE</em>' containment reference list.
	 * @see era.foss.model.core.rif.RifPackage#getSpecObjectValues_ATTRIBUTEVALUEEMBEDDEDFILE()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-EMBEDDED-FILE' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AttributeValueEmbeddedFile> getATTRIBUTEVALUEEMBEDDEDFILE();

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
	 * @see era.foss.model.core.rif.RifPackage#getSpecObjectValues_ATTRIBUTEVALUEENUMERATION()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-ENUMERATION' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AttributeValueEnumeration> getATTRIBUTEVALUEENUMERATION();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUEFILEREFERENCE</b></em>' containment reference list.
	 * The list contents are of type {@link era.foss.model.core.rif.AttributeValueFileReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUEFILEREFERENCE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUEFILEREFERENCE</em>' containment reference list.
	 * @see era.foss.model.core.rif.RifPackage#getSpecObjectValues_ATTRIBUTEVALUEFILEREFERENCE()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-FILE-REFERENCE' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AttributeValueFileReference> getATTRIBUTEVALUEFILEREFERENCE();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUESIMPLE</b></em>' containment reference list.
	 * The list contents are of type {@link era.foss.model.core.rif.AttributeValueSimple}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUESIMPLE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUESIMPLE</em>' containment reference list.
	 * @see era.foss.model.core.rif.RifPackage#getSpecObjectValues_ATTRIBUTEVALUESIMPLE()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-SIMPLE' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AttributeValueSimple> getATTRIBUTEVALUESIMPLE();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>' containment reference list.
	 * The list contents are of type {@link era.foss.model.core.rif.AttributeValueXmlData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUEXMLDATA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUEXMLDATA</em>' containment reference list.
	 * @see era.foss.model.core.rif.RifPackage#getSpecObjectValues_ATTRIBUTEVALUEXMLDATA()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-XML-DATA' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AttributeValueXmlData> getATTRIBUTEVALUEXMLDATA();

} // SpecObjectValues
