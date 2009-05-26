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
 * A representation of the model object '<em><b>Access Policy Spec Groups</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.AccessPolicySpecGroups#getGroup <em>Group</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AccessPolicySpecGroups#getSPECGROUPREF <em>SPECGROUPREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getAccessPolicySpecGroups()
 * @model extendedMetaData="name='SPEC-GROUPS_._type' kind='elementOnly'"
 * @generated
 */
public interface AccessPolicySpecGroups extends EObject {
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
     * @see era.foss.model.core.rif.RifPackage#getAccessPolicySpecGroups_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='group:0'"
     * @generated
     */
    FeatureMap getGroup();

    /**
     * Returns the value of the '<em><b>SPECGROUPREF</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SPECGROUPREF</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SPECGROUPREF</em>' attribute list.
     * @see era.foss.model.core.rif.RifPackage#getAccessPolicySpecGroups_SPECGROUPREF()
     * @model unique="false" dataType="era.foss.model.core.rif.REF" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SPEC-GROUP-REF' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList getSPECGROUPREF();

} // AccessPolicySpecGroups
