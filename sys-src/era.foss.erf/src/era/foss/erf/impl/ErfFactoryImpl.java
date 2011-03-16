/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.erf.impl;

import era.foss.erf.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ErfFactoryImpl extends EFactoryImpl implements ErfFactory {

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ErfFactory init() {
        try {
            ErfFactory theErfFactory = (ErfFactory)EPackage.Registry.INSTANCE.getEFactory( "http://era/foss/erf" );
            if( theErfFactory != null ) {
                return theErfFactory;
            }
        } catch( Exception exception ) {
            EcorePlugin.INSTANCE.log( exception );
        }
        return new ErfFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ErfFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create( EClass eClass ) {
        switch( eClass.getClassifierID() ) {
            case ErfPackage.SPEC_OBJECT:
                return createSpecObject();
            case ErfPackage.SPEC_TYPE:
                return createSpecType();
            case ErfPackage.ATTRIBUTE_VALUE_SIMPLE:
                return createAttributeValueSimple();
            case ErfPackage.DATATYPE_DEFINITION_INTEGER:
                return createDatatypeDefinitionInteger();
            case ErfPackage.DATATYPE_DEFINITION_STRING:
                return createDatatypeDefinitionString();
            case ErfPackage.ATTRIBUTE_DEFINITION_SIMPLE:
                return createAttributeDefinitionSimple();
            case ErfPackage.ERF:
                return createERF();
            case ErfPackage.CONTENT:
                return createContent();
            case ErfPackage.SPEC_RELATION:
                return createSpecRelation();
            default:
                throw new IllegalArgumentException( "The class '" + eClass.getName() + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecObject createSpecObject() {
        SpecObjectImpl specObject = new SpecObjectImpl();
        return specObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecType createSpecType() {
        SpecTypeImpl specType = new SpecTypeImpl();
        return specType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueSimple createAttributeValueSimple() {
        AttributeValueSimpleImpl attributeValueSimple = new AttributeValueSimpleImpl();
        return attributeValueSimple;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeDefinitionInteger createDatatypeDefinitionInteger() {
        DatatypeDefinitionIntegerImpl datatypeDefinitionInteger = new DatatypeDefinitionIntegerImpl();
        return datatypeDefinitionInteger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeDefinitionString createDatatypeDefinitionString() {
        DatatypeDefinitionStringImpl datatypeDefinitionString = new DatatypeDefinitionStringImpl();
        return datatypeDefinitionString;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeDefinitionSimple createAttributeDefinitionSimple() {
        AttributeDefinitionSimpleImpl attributeDefinitionSimple = new AttributeDefinitionSimpleImpl();
        return attributeDefinitionSimple;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ERF createERF() {
        ERFImpl erf = new ERFImpl();
        return erf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Content createContent() {
        ContentImpl content = new ContentImpl();
        return content;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecRelation createSpecRelation() {
        SpecRelationImpl specRelation = new SpecRelationImpl();
        return specRelation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ErfPackage getErfPackage() {
        return (ErfPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ErfPackage getPackage() {
        return ErfPackage.eINSTANCE;
    }

} //ErfFactoryImpl
