/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.erf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see era.foss.erf.ErfPackage
 * @generated
 */
public interface ErfFactory extends EFactory {

    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ErfFactory eINSTANCE = era.foss.erf.impl.ErfFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Spec Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Spec Object</em>'.
     * @generated
     */
    SpecObject createSpecObject();

    /**
     * Returns a new object of class '<em>Spec Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Spec Type</em>'.
     * @generated
     */
    SpecType createSpecType();

    /**
     * Returns a new object of class '<em>Attribute Value Simple</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Attribute Value Simple</em>'.
     * @generated
     */
    AttributeValueSimple createAttributeValueSimple();

    /**
     * Returns a new object of class '<em>Datatype Definition Integer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Datatype Definition Integer</em>'.
     * @generated
     */
    DatatypeDefinitionInteger createDatatypeDefinitionInteger();

    /**
     * Returns a new object of class '<em>Datatype Definition String</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Datatype Definition String</em>'.
     * @generated
     */
    DatatypeDefinitionString createDatatypeDefinitionString();

    /**
     * Returns a new object of class '<em>Attribute Definition Simple</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Attribute Definition Simple</em>'.
     * @generated
     */
    AttributeDefinitionSimple createAttributeDefinitionSimple();

    /**
     * Returns a new object of class '<em>ERF</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ERF</em>'.
     * @generated
     */
    ERF createERF();

    /**
     * Returns a new object of class '<em>Content</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Content</em>'.
     * @generated
     */
    Content createContent();

    /**
     * Returns a new object of class '<em>Spec Relation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Spec Relation</em>'.
     * @generated
     */
    SpecRelation createSpecRelation();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ErfPackage getErfPackage();

} //ErfFactory
