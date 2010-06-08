/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.rif.util;

import era.foss.rif.*;

import java.util.List;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see era.foss.rif.RifPackage
 * @generated
 */
public class RifSwitch<T2> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static RifPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RifSwitch() {
        if( modelPackage == null ) {
            modelPackage = RifPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public T2 doSwitch( EObject theEObject ) {
        return doSwitch( theEObject.eClass(), theEObject );
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T2 doSwitch( EClass theEClass, EObject theEObject ) {
        if( theEClass.eContainer() == modelPackage ) {
            return doSwitch( theEClass.getClassifierID(), theEObject );
        } else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return eSuperTypes.isEmpty() ? defaultCase( theEObject ) : doSwitch( eSuperTypes.get( 0 ), theEObject );
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T2 doSwitch( int classifierID, EObject theEObject ) {
        switch (classifierID) {
        case RifPackage.RIF: {
            RIF rif = (RIF)theEObject;
            T2 result = caseRIF( rif );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_DEFINITION: {
            AttributeDefinition attributeDefinition = (AttributeDefinition)theEObject;
            T2 result = caseAttributeDefinition( attributeDefinition );
            if( result == null ) result = caseIdentifiable( attributeDefinition );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_VALUE: {
            AttributeValue attributeValue = (AttributeValue)theEObject;
            T2 result = caseAttributeValue( attributeValue );
            if( result == null ) result = caseIdentifiable( attributeValue );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.DATATYPE_DEFINITION: {
            DatatypeDefinition datatypeDefinition = (DatatypeDefinition)theEObject;
            T2 result = caseDatatypeDefinition( datatypeDefinition );
            if( result == null ) result = caseIdentifiable( datatypeDefinition );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES: {
            SpecElementWithUserDefinedAttributes specElementWithUserDefinedAttributes = (SpecElementWithUserDefinedAttributes)theEObject;
            T2 result = caseSpecElementWithUserDefinedAttributes( specElementWithUserDefinedAttributes );
            if( result == null ) result = caseIdentifiable( specElementWithUserDefinedAttributes );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.SPEC_OBJECT: {
            SpecObject specObject = (SpecObject)theEObject;
            T2 result = caseSpecObject( specObject );
            if( result == null ) result = caseSpecElementWithUserDefinedAttributes( specObject );
            if( result == null ) result = caseIdentifiable( specObject );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.SPEC_TYPE: {
            SpecType specType = (SpecType)theEObject;
            T2 result = caseSpecType( specType );
            if( result == null ) result = caseIdentifiable( specType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_VALUE_SIMPLE: {
            AttributeValueSimple attributeValueSimple = (AttributeValueSimple)theEObject;
            T2 result = caseAttributeValueSimple( attributeValueSimple );
            if( result == null ) result = caseAttributeValue( attributeValueSimple );
            if( result == null ) result = caseIdentifiable( attributeValueSimple );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.DATATYPE_DEFINITION_INTEGER: {
            DatatypeDefinitionInteger datatypeDefinitionInteger = (DatatypeDefinitionInteger)theEObject;
            T2 result = caseDatatypeDefinitionInteger( datatypeDefinitionInteger );
            if( result == null ) result = caseDatatypeDefinitionSimple( datatypeDefinitionInteger );
            if( result == null ) result = caseDatatypeDefinition( datatypeDefinitionInteger );
            if( result == null ) result = caseIdentifiable( datatypeDefinitionInteger );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.DATATYPE_DEFINITION_SIMPLE: {
            DatatypeDefinitionSimple datatypeDefinitionSimple = (DatatypeDefinitionSimple)theEObject;
            T2 result = caseDatatypeDefinitionSimple( datatypeDefinitionSimple );
            if( result == null ) result = caseDatatypeDefinition( datatypeDefinitionSimple );
            if( result == null ) result = caseIdentifiable( datatypeDefinitionSimple );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.DATATYPE_DEFINITION_STRING: {
            DatatypeDefinitionString datatypeDefinitionString = (DatatypeDefinitionString)theEObject;
            T2 result = caseDatatypeDefinitionString( datatypeDefinitionString );
            if( result == null ) result = caseDatatypeDefinitionSimple( datatypeDefinitionString );
            if( result == null ) result = caseDatatypeDefinition( datatypeDefinitionString );
            if( result == null ) result = caseIdentifiable( datatypeDefinitionString );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.RIF_CONTENT: {
            RIFContent rifContent = (RIFContent)theEObject;
            T2 result = caseRIFContent( rifContent );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.IDENTIFIABLE: {
            Identifiable identifiable = (Identifiable)theEObject;
            T2 result = caseIdentifiable( identifiable );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE: {
            AttributeDefinitionSimple attributeDefinitionSimple = (AttributeDefinitionSimple)theEObject;
            T2 result = caseAttributeDefinitionSimple( attributeDefinitionSimple );
            if( result == null ) result = caseAttributeDefinition( attributeDefinitionSimple );
            if( result == null ) result = caseIdentifiable( attributeDefinitionSimple );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        default:
            return defaultCase( theEObject );
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>RIF</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>RIF</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T2 caseRIF( RIF object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T2 caseAttributeDefinition( AttributeDefinition object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T2 caseAttributeValue( AttributeValue object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Datatype Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Datatype Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T2 caseDatatypeDefinition( DatatypeDefinition object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Element With User Defined Attributes</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Element With User Defined Attributes</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T2 caseSpecElementWithUserDefinedAttributes( SpecElementWithUserDefinedAttributes object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T2 caseSpecObject( SpecObject object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T2 caseSpecType( SpecType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Map</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Map</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public <T, T1> T2 caseMap( Map<T, T1> object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Value Simple</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Value Simple</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T2 caseAttributeValueSimple( AttributeValueSimple object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Datatype Definition Integer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Datatype Definition Integer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T2 caseDatatypeDefinitionInteger( DatatypeDefinitionInteger object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Datatype Definition Simple</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Datatype Definition Simple</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T2 caseDatatypeDefinitionSimple( DatatypeDefinitionSimple object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Datatype Definition String</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Datatype Definition String</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T2 caseDatatypeDefinitionString( DatatypeDefinitionString object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>RIF Content</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>RIF Content</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T2 caseRIFContent( RIFContent object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T2 caseIdentifiable( Identifiable object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Definition Simple</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Definition Simple</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T2 caseAttributeDefinitionSimple( AttributeDefinitionSimple object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public T2 defaultCase( EObject object ) {
        return null;
    }

} //RifSwitch
