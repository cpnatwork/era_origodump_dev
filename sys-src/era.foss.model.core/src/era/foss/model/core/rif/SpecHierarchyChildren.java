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
 * A representation of the model object '<em><b>Spec Hierarchy Children</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.SpecHierarchyChildren#getGroup <em>Group</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecHierarchyChildren#getSPECHIERARCHY <em>SPECHIERARCHY</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getSpecHierarchyChildren()
 * @model extendedMetaData="name='CHILDREN_._type' kind='elementOnly'"
 * @generated
 */
public interface SpecHierarchyChildren extends EObject {
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
	 * @see era.foss.model.core.rif.RifPackage#getSpecHierarchyChildren_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>SPECHIERARCHY</b></em>' containment reference list.
	 * The list contents are of type {@link era.foss.model.core.rif.SpecHierarchy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECHIERARCHY</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECHIERARCHY</em>' containment reference list.
	 * @see era.foss.model.core.rif.RifPackage#getSpecHierarchyChildren_SPECHIERARCHY()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SPEC-HIERARCHY' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SpecHierarchy> getSPECHIERARCHY();

} // SpecHierarchyChildren
