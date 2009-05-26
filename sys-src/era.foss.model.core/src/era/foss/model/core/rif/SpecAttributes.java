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
 * A representation of the model object '<em><b>Spec Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.SpecAttributes#getGroup <em>Group</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecAttributes#getATTRIBUTEDEFINITIONCOMPLEX <em>ATTRIBUTEDEFINITIONCOMPLEX</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecAttributes#getATTRIBUTEDEFINITIONENUMERATION <em>ATTRIBUTEDEFINITIONENUMERATION</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecAttributes#getATTRIBUTEDEFINITIONSIMPLE <em>ATTRIBUTEDEFINITIONSIMPLE</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getSpecAttributes()
 * @model extendedMetaData="name='SPEC-ATTRIBUTES_._type' kind='elementOnly'"
 * @generated
 */
public interface SpecAttributes extends EObject {
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
     * @see era.foss.model.core.rif.RifPackage#getSpecAttributes_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='group:0'"
     * @generated
     */
    FeatureMap getGroup();

    /**
     * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONCOMPLEX</b></em>' containment reference list.
     * The list contents are of type {@link era.foss.model.core.rif.AttributeDefinitionComplex}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ATTRIBUTEDEFINITIONCOMPLEX</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ATTRIBUTEDEFINITIONCOMPLEX</em>' containment reference list.
     * @see era.foss.model.core.rif.RifPackage#getSpecAttributes_ATTRIBUTEDEFINITIONCOMPLEX()
     * @model type="era.foss.model.core.rif.AttributeDefinitionComplex" containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-COMPLEX' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList getATTRIBUTEDEFINITIONCOMPLEX();

    /**
     * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONENUMERATION</b></em>' containment reference list.
     * The list contents are of type {@link era.foss.model.core.rif.AttributeDefinitionEnumeration}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ATTRIBUTEDEFINITIONENUMERATION</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ATTRIBUTEDEFINITIONENUMERATION</em>' containment reference list.
     * @see era.foss.model.core.rif.RifPackage#getSpecAttributes_ATTRIBUTEDEFINITIONENUMERATION()
     * @model type="era.foss.model.core.rif.AttributeDefinitionEnumeration" containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-ENUMERATION' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList getATTRIBUTEDEFINITIONENUMERATION();

    /**
     * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONSIMPLE</b></em>' containment reference list.
     * The list contents are of type {@link era.foss.model.core.rif.AttributeDefinitionSimple}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ATTRIBUTEDEFINITIONSIMPLE</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ATTRIBUTEDEFINITIONSIMPLE</em>' containment reference list.
     * @see era.foss.model.core.rif.RifPackage#getSpecAttributes_ATTRIBUTEDEFINITIONSIMPLE()
     * @model type="era.foss.model.core.rif.AttributeDefinitionSimple" containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-SIMPLE' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList getATTRIBUTEDEFINITIONSIMPLE();

} // SpecAttributes
