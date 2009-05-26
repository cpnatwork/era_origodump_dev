/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AttributeDefinitionComplexType;
import era.foss.model.core.rif.RifPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Definition Complex Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionComplexTypeImpl#getDATATYPEDEFINITIONBINARYFILEREF <em>DATATYPEDEFINITIONBINARYFILEREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionComplexTypeImpl#getDATATYPEDEFINITIONDOCUMENTREF <em>DATATYPEDEFINITIONDOCUMENTREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionComplexTypeImpl#getDATATYPEDEFINITIONXMLDATAREF <em>DATATYPEDEFINITIONXMLDATAREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeDefinitionComplexTypeImpl extends EObjectImpl implements AttributeDefinitionComplexType {
    /**
     * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected int booleans = 0;

    /**
     * The default value of the '{@link #getDATATYPEDEFINITIONBINARYFILEREF() <em>DATATYPEDEFINITIONBINARYFILEREF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDATATYPEDEFINITIONBINARYFILEREF()
     * @generated
     * @ordered
     */
    protected static final String DATATYPEDEFINITIONBINARYFILEREF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDATATYPEDEFINITIONBINARYFILEREF() <em>DATATYPEDEFINITIONBINARYFILEREF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDATATYPEDEFINITIONBINARYFILEREF()
     * @generated
     * @ordered
     */
    protected String dATATYPEDEFINITIONBINARYFILEREF = DATATYPEDEFINITIONBINARYFILEREF_EDEFAULT;

    /**
     * The default value of the '{@link #getDATATYPEDEFINITIONDOCUMENTREF() <em>DATATYPEDEFINITIONDOCUMENTREF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDATATYPEDEFINITIONDOCUMENTREF()
     * @generated
     * @ordered
     */
    protected static final String DATATYPEDEFINITIONDOCUMENTREF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDATATYPEDEFINITIONDOCUMENTREF() <em>DATATYPEDEFINITIONDOCUMENTREF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDATATYPEDEFINITIONDOCUMENTREF()
     * @generated
     * @ordered
     */
    protected String dATATYPEDEFINITIONDOCUMENTREF = DATATYPEDEFINITIONDOCUMENTREF_EDEFAULT;

    /**
     * The default value of the '{@link #getDATATYPEDEFINITIONXMLDATAREF() <em>DATATYPEDEFINITIONXMLDATAREF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDATATYPEDEFINITIONXMLDATAREF()
     * @generated
     * @ordered
     */
    protected static final String DATATYPEDEFINITIONXMLDATAREF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDATATYPEDEFINITIONXMLDATAREF() <em>DATATYPEDEFINITIONXMLDATAREF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDATATYPEDEFINITIONXMLDATAREF()
     * @generated
     * @ordered
     */
    protected String dATATYPEDEFINITIONXMLDATAREF = DATATYPEDEFINITIONXMLDATAREF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeDefinitionComplexTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return RifPackage.Literals.ATTRIBUTE_DEFINITION_COMPLEX_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDATATYPEDEFINITIONBINARYFILEREF() {
        return dATATYPEDEFINITIONBINARYFILEREF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDATATYPEDEFINITIONBINARYFILEREF( String newDATATYPEDEFINITIONBINARYFILEREF ) {
        String oldDATATYPEDEFINITIONBINARYFILEREF = dATATYPEDEFINITIONBINARYFILEREF;
        dATATYPEDEFINITIONBINARYFILEREF = newDATATYPEDEFINITIONBINARYFILEREF;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_TYPE__DATATYPEDEFINITIONBINARYFILEREF,
            oldDATATYPEDEFINITIONBINARYFILEREF,
            dATATYPEDEFINITIONBINARYFILEREF ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDATATYPEDEFINITIONDOCUMENTREF() {
        return dATATYPEDEFINITIONDOCUMENTREF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDATATYPEDEFINITIONDOCUMENTREF( String newDATATYPEDEFINITIONDOCUMENTREF ) {
        String oldDATATYPEDEFINITIONDOCUMENTREF = dATATYPEDEFINITIONDOCUMENTREF;
        dATATYPEDEFINITIONDOCUMENTREF = newDATATYPEDEFINITIONDOCUMENTREF;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_TYPE__DATATYPEDEFINITIONDOCUMENTREF,
            oldDATATYPEDEFINITIONDOCUMENTREF,
            dATATYPEDEFINITIONDOCUMENTREF ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDATATYPEDEFINITIONXMLDATAREF() {
        return dATATYPEDEFINITIONXMLDATAREF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDATATYPEDEFINITIONXMLDATAREF( String newDATATYPEDEFINITIONXMLDATAREF ) {
        String oldDATATYPEDEFINITIONXMLDATAREF = dATATYPEDEFINITIONXMLDATAREF;
        dATATYPEDEFINITIONXMLDATAREF = newDATATYPEDEFINITIONXMLDATAREF;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_TYPE__DATATYPEDEFINITIONXMLDATAREF,
            oldDATATYPEDEFINITIONXMLDATAREF,
            dATATYPEDEFINITIONXMLDATAREF ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch (featureID) {
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_TYPE__DATATYPEDEFINITIONBINARYFILEREF:
            return getDATATYPEDEFINITIONBINARYFILEREF();
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_TYPE__DATATYPEDEFINITIONDOCUMENTREF:
            return getDATATYPEDEFINITIONDOCUMENTREF();
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_TYPE__DATATYPEDEFINITIONXMLDATAREF:
            return getDATATYPEDEFINITIONXMLDATAREF();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eSet( int featureID, Object newValue ) {
        switch (featureID) {
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_TYPE__DATATYPEDEFINITIONBINARYFILEREF:
            setDATATYPEDEFINITIONBINARYFILEREF( (String)newValue );
            return;
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_TYPE__DATATYPEDEFINITIONDOCUMENTREF:
            setDATATYPEDEFINITIONDOCUMENTREF( (String)newValue );
            return;
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_TYPE__DATATYPEDEFINITIONXMLDATAREF:
            setDATATYPEDEFINITIONXMLDATAREF( (String)newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eUnset( int featureID ) {
        switch (featureID) {
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_TYPE__DATATYPEDEFINITIONBINARYFILEREF:
            setDATATYPEDEFINITIONBINARYFILEREF( DATATYPEDEFINITIONBINARYFILEREF_EDEFAULT );
            return;
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_TYPE__DATATYPEDEFINITIONDOCUMENTREF:
            setDATATYPEDEFINITIONDOCUMENTREF( DATATYPEDEFINITIONDOCUMENTREF_EDEFAULT );
            return;
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_TYPE__DATATYPEDEFINITIONXMLDATAREF:
            setDATATYPEDEFINITIONXMLDATAREF( DATATYPEDEFINITIONXMLDATAREF_EDEFAULT );
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean eIsSet( int featureID ) {
        switch (featureID) {
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_TYPE__DATATYPEDEFINITIONBINARYFILEREF:
            return DATATYPEDEFINITIONBINARYFILEREF_EDEFAULT == null
                ? dATATYPEDEFINITIONBINARYFILEREF != null
                : !DATATYPEDEFINITIONBINARYFILEREF_EDEFAULT.equals( dATATYPEDEFINITIONBINARYFILEREF );
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_TYPE__DATATYPEDEFINITIONDOCUMENTREF:
            return DATATYPEDEFINITIONDOCUMENTREF_EDEFAULT == null
                ? dATATYPEDEFINITIONDOCUMENTREF != null
                : !DATATYPEDEFINITIONDOCUMENTREF_EDEFAULT.equals( dATATYPEDEFINITIONDOCUMENTREF );
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_TYPE__DATATYPEDEFINITIONXMLDATAREF:
            return DATATYPEDEFINITIONXMLDATAREF_EDEFAULT == null
                ? dATATYPEDEFINITIONXMLDATAREF != null
                : !DATATYPEDEFINITIONXMLDATAREF_EDEFAULT.equals( dATATYPEDEFINITIONXMLDATAREF );
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (dATATYPEDEFINITIONBINARYFILEREF: " );
        result.append( dATATYPEDEFINITIONBINARYFILEREF );
        result.append( ", dATATYPEDEFINITIONDOCUMENTREF: " );
        result.append( dATATYPEDEFINITIONDOCUMENTREF );
        result.append( ", dATATYPEDEFINITIONXMLDATAREF: " );
        result.append( dATATYPEDEFINITIONXMLDATAREF );
        result.append( ')' );
        return result.toString();
    }

} //AttributeDefinitionComplexTypeImpl
