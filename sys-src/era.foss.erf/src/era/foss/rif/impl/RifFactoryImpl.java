/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.rif.impl;

import era.foss.rif.*;

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
public class RifFactoryImpl extends EFactoryImpl implements RifFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static RifFactory init() {
        try {
            RifFactory theRifFactory = (RifFactory)EPackage.Registry.INSTANCE.getEFactory( "http:///era/foss/rif.ecore" );
            if( theRifFactory != null ) {
                return theRifFactory;
            }
        } catch( Exception exception ) {
            EcorePlugin.INSTANCE.log( exception );
        }
        return new RifFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RifFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create( EClass eClass ) {
        switch (eClass.getClassifierID()) {
        case RifPackage.RIF:
            return createRIF();
        case RifPackage.SPEC_OBJECT:
            return createSpecObject();
        case RifPackage.SPEC_TYPE:
            return createSpecType();
        case RifPackage.ATTRIBUTE_VALUE_SIMPLE:
            return createAttributeValueSimple();
        case RifPackage.DATATYPE_DEFINITION_INTEGER:
            return createDatatypeDefinitionInteger();
        case RifPackage.DATATYPE_DEFINITION_STRING:
            return createDatatypeDefinitionString();
        case RifPackage.RIF_CONTENT:
            return createRIFContent();
        case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE:
            return createAttributeDefinitionSimple();
        default:
            throw new IllegalArgumentException( "The class '" + eClass.getName() + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RIF createRIF() {
        RIFImpl rif = new RIFImpl();
        return rif;
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
    public RIFContent createRIFContent() {
        RIFContentImpl rifContent = new RIFContentImpl();
        return rifContent;
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
    public RifPackage getRifPackage() {
        return (RifPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static RifPackage getPackage() {
        return RifPackage.eINSTANCE;
    }

} //RifFactoryImpl
