/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.erf.impl;

import era.foss.erf.DatatypeDefinitionString;
import era.foss.erf.ErfPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype Definition String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.erf.impl.DatatypeDefinitionStringImpl#getMaxLength <em>Max Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatatypeDefinitionStringImpl extends DatatypeDefinitionSimpleImpl implements DatatypeDefinitionString {
    /**
     * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxLength()
     * @generated
     * @ordered
     */
    protected static final int MAX_LENGTH_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxLength()
     * @generated
     * @ordered
     */
    protected int maxLength = MAX_LENGTH_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DatatypeDefinitionStringImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ErfPackage.Literals.DATATYPE_DEFINITION_STRING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMaxLength() {
        return maxLength;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxLength( int newMaxLength ) {
        int oldMaxLength = maxLength;
        maxLength = newMaxLength;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            ErfPackage.DATATYPE_DEFINITION_STRING__MAX_LENGTH,
            oldMaxLength,
            maxLength ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch (featureID) {
        case ErfPackage.DATATYPE_DEFINITION_STRING__MAX_LENGTH:
            return getMaxLength();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch (featureID) {
        case ErfPackage.DATATYPE_DEFINITION_STRING__MAX_LENGTH:
            setMaxLength( (Integer)newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch (featureID) {
        case ErfPackage.DATATYPE_DEFINITION_STRING__MAX_LENGTH:
            setMaxLength( MAX_LENGTH_EDEFAULT );
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch (featureID) {
        case ErfPackage.DATATYPE_DEFINITION_STRING__MAX_LENGTH:
            return maxLength != MAX_LENGTH_EDEFAULT;
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (maxLength: " );
        result.append( maxLength );
        result.append( ')' );
        return result.toString();
    }

} //DatatypeDefinitionStringImpl
