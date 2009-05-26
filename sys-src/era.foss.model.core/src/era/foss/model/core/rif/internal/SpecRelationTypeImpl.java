/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.RifPackage;
import era.foss.model.core.rif.SpecRelationType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spec Relation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.SpecRelationTypeImpl#getSPECTYPEREF <em>SPECTYPEREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecRelationTypeImpl extends EObjectImpl implements SpecRelationType {
    /**
     * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected int booleans = 0;

    /**
     * The default value of the '{@link #getSPECTYPEREF() <em>SPECTYPEREF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSPECTYPEREF()
     * @generated
     * @ordered
     */
    protected static final String SPECTYPEREF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSPECTYPEREF() <em>SPECTYPEREF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSPECTYPEREF()
     * @generated
     * @ordered
     */
    protected String sPECTYPEREF = SPECTYPEREF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SpecRelationTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return RifPackage.Literals.SPEC_RELATION_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSPECTYPEREF() {
        return sPECTYPEREF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSPECTYPEREF( String newSPECTYPEREF ) {
        String oldSPECTYPEREF = sPECTYPEREF;
        sPECTYPEREF = newSPECTYPEREF;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.SPEC_RELATION_TYPE__SPECTYPEREF,
            oldSPECTYPEREF,
            sPECTYPEREF ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch (featureID) {
        case RifPackage.SPEC_RELATION_TYPE__SPECTYPEREF:
            return getSPECTYPEREF();
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
        case RifPackage.SPEC_RELATION_TYPE__SPECTYPEREF:
            setSPECTYPEREF( (String)newValue );
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
        case RifPackage.SPEC_RELATION_TYPE__SPECTYPEREF:
            setSPECTYPEREF( SPECTYPEREF_EDEFAULT );
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
        case RifPackage.SPEC_RELATION_TYPE__SPECTYPEREF:
            return SPECTYPEREF_EDEFAULT == null ? sPECTYPEREF != null : !SPECTYPEREF_EDEFAULT.equals( sPECTYPEREF );
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
        result.append( " (sPECTYPEREF: " );
        result.append( sPECTYPEREF );
        result.append( ')' );
        return result.toString();
    }

} //SpecRelationTypeImpl
