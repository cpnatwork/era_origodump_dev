/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.EmbeddedValue;
import era.foss.model.core.rif.RifPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Embedded Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.EmbeddedValueImpl#getKEY <em>KEY</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.EmbeddedValueImpl#getOTHERCONTENT <em>OTHERCONTENT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmbeddedValueImpl extends EObjectImpl implements EmbeddedValue {
    /**
     * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected int booleans = 0;

    /**
     * The default value of the '{@link #getKEY() <em>KEY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKEY()
     * @generated
     * @ordered
     */
    protected static final BigInteger KEY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKEY() <em>KEY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKEY()
     * @generated
     * @ordered
     */
    protected BigInteger kEY = KEY_EDEFAULT;

    /**
     * The default value of the '{@link #getOTHERCONTENT() <em>OTHERCONTENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOTHERCONTENT()
     * @generated
     * @ordered
     */
    protected static final String OTHERCONTENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOTHERCONTENT() <em>OTHERCONTENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOTHERCONTENT()
     * @generated
     * @ordered
     */
    protected String oTHERCONTENT = OTHERCONTENT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EmbeddedValueImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return RifPackage.Literals.EMBEDDED_VALUE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger getKEY() {
        return kEY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKEY( BigInteger newKEY ) {
        BigInteger oldKEY = kEY;
        kEY = newKEY;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.EMBEDDED_VALUE__KEY,
            oldKEY,
            kEY ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOTHERCONTENT() {
        return oTHERCONTENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOTHERCONTENT( String newOTHERCONTENT ) {
        String oldOTHERCONTENT = oTHERCONTENT;
        oTHERCONTENT = newOTHERCONTENT;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.EMBEDDED_VALUE__OTHERCONTENT,
            oldOTHERCONTENT,
            oTHERCONTENT ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch (featureID) {
        case RifPackage.EMBEDDED_VALUE__KEY:
            return getKEY();
        case RifPackage.EMBEDDED_VALUE__OTHERCONTENT:
            return getOTHERCONTENT();
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
        case RifPackage.EMBEDDED_VALUE__KEY:
            setKEY( (BigInteger)newValue );
            return;
        case RifPackage.EMBEDDED_VALUE__OTHERCONTENT:
            setOTHERCONTENT( (String)newValue );
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
        case RifPackage.EMBEDDED_VALUE__KEY:
            setKEY( KEY_EDEFAULT );
            return;
        case RifPackage.EMBEDDED_VALUE__OTHERCONTENT:
            setOTHERCONTENT( OTHERCONTENT_EDEFAULT );
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
        case RifPackage.EMBEDDED_VALUE__KEY:
            return KEY_EDEFAULT == null ? kEY != null : !KEY_EDEFAULT.equals( kEY );
        case RifPackage.EMBEDDED_VALUE__OTHERCONTENT:
            return OTHERCONTENT_EDEFAULT == null
                ? oTHERCONTENT != null
                : !OTHERCONTENT_EDEFAULT.equals( oTHERCONTENT );
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
        result.append( " (kEY: " );
        result.append( kEY );
        result.append( ", oTHERCONTENT: " );
        result.append( oTHERCONTENT );
        result.append( ')' );
        return result.toString();
    }

} //EmbeddedValueImpl
