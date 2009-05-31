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
 * A representation of the model object '<em><b>Relation Group Spec Relations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.RelationGroupSpecRelations#getGroup <em>Group</em>}</li>
 *   <li>{@link era.foss.model.core.rif.RelationGroupSpecRelations#getSPECRELATIONREF <em>SPECRELATIONREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getRelationGroupSpecRelations()
 * @model extendedMetaData="name='SPEC-RELATIONS_._2_._type' kind='elementOnly'"
 * @generated
 */
public interface RelationGroupSpecRelations extends EObject {
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
	 * @see era.foss.model.core.rif.RifPackage#getRelationGroupSpecRelations_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>SPECRELATIONREF</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECRELATIONREF</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECRELATIONREF</em>' attribute list.
	 * @see era.foss.model.core.rif.RifPackage#getRelationGroupSpecRelations_SPECRELATIONREF()
	 * @model unique="false" dataType="era.foss.model.core.rif.REF" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SPEC-RELATION-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getSPECRELATIONREF();

} // RelationGroupSpecRelations
