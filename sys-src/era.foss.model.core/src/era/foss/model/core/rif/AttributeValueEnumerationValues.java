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
 * A representation of the model object '<em><b>Attribute Value Enumeration Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.AttributeValueEnumerationValues#getGroup <em>Group</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeValueEnumerationValues#getENUMVALUEREF <em>ENUMVALUEREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getAttributeValueEnumerationValues()
 * @model extendedMetaData="name='VALUES_._4_._type' kind='elementOnly'"
 * @generated
 */
public interface AttributeValueEnumerationValues extends EObject {
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
     * @see era.foss.model.core.rif.RifPackage#getAttributeValueEnumerationValues_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='group:0'"
     * @generated
     */
    FeatureMap getGroup();

    /**
     * Returns the value of the '<em><b>ENUMVALUEREF</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ENUMVALUEREF</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ENUMVALUEREF</em>' attribute list.
     * @see era.foss.model.core.rif.RifPackage#getAttributeValueEnumerationValues_ENUMVALUEREF()
     * @model unique="false" dataType="era.foss.model.core.rif.REF" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ENUM-VALUE-REF' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList getENUMVALUEREF();

} // AttributeValueEnumerationValues
