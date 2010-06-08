/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.rif;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see era.foss.rif.RifPackage
 * @generated
 */
public interface RifFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    RifFactory eINSTANCE = era.foss.rif.impl.RifFactoryImpl.init();

    /**
     * Returns a new object of class '<em>RIF</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>RIF</em>'.
     * @generated
     */
    RIF createRIF();

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
     * Returns a new object of class '<em>RIF Content</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>RIF Content</em>'.
     * @generated
     */
    RIFContent createRIFContent();

    /**
     * Returns a new object of class '<em>Attribute Definition Simple</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Attribute Definition Simple</em>'.
     * @generated
     */
    AttributeDefinitionSimple createAttributeDefinitionSimple();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    RifPackage getRifPackage();

} //RifFactory
