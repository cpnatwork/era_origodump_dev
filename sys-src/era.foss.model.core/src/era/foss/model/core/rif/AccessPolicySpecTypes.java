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
 * A representation of the model object '<em><b>Access Policy Spec Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.AccessPolicySpecTypes#getGroup <em>Group</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AccessPolicySpecTypes#getSPECTYPEREF <em>SPECTYPEREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getAccessPolicySpecTypes()
 * @model extendedMetaData="name='SPEC-TYPES_._type' kind='elementOnly'"
 * @generated
 */
public interface AccessPolicySpecTypes extends EObject {
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
	 * @see era.foss.model.core.rif.RifPackage#getAccessPolicySpecTypes_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>SPECTYPEREF</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECTYPEREF</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECTYPEREF</em>' attribute list.
	 * @see era.foss.model.core.rif.RifPackage#getAccessPolicySpecTypes_SPECTYPEREF()
	 * @model unique="false" dataType="era.foss.model.core.rif.REF" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SPEC-TYPE-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getSPECTYPEREF();

} // AccessPolicySpecTypes
