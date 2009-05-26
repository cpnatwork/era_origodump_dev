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
 * A representation of the model object '<em><b>Access Policy Relation Groups</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.AccessPolicyRelationGroups#getGroup <em>Group</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AccessPolicyRelationGroups#getRELATIONGROUPREF <em>RELATIONGROUPREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getAccessPolicyRelationGroups()
 * @model extendedMetaData="name='RELATION-GROUPS_._type' kind='elementOnly'"
 * @generated
 */
public interface AccessPolicyRelationGroups extends EObject {
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
     * @see era.foss.model.core.rif.RifPackage#getAccessPolicyRelationGroups_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='group:0'"
     * @generated
     */
    FeatureMap getGroup();

    /**
     * Returns the value of the '<em><b>RELATIONGROUPREF</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RELATIONGROUPREF</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RELATIONGROUPREF</em>' attribute list.
     * @see era.foss.model.core.rif.RifPackage#getAccessPolicyRelationGroups_RELATIONGROUPREF()
     * @model unique="false" dataType="era.foss.model.core.rif.REF" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='RELATION-GROUP-REF' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList getRELATIONGROUPREF();

} // AccessPolicyRelationGroups
