/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AccessPolicies;
import era.foss.model.core.rif.RifPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Policies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.AccessPoliciesImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AccessPoliciesImpl#getACCESSPOLICY <em>ACCESSPOLICY</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccessPoliciesImpl extends EObjectImpl implements AccessPolicies {
    /**
     * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected int booleans = 0;

    /**
     * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap group;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AccessPoliciesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return RifPackage.Literals.ACCESS_POLICIES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getGroup() {
        if( group == null ) {
            group = new BasicFeatureMap( this, RifPackage.ACCESS_POLICIES__GROUP );
        }
        return group;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getACCESSPOLICY() {
        return getGroup().list( RifPackage.Literals.ACCESS_POLICIES__ACCESSPOLICY );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
        case RifPackage.ACCESS_POLICIES__GROUP:
            return ((InternalEList)getGroup()).basicRemove( otherEnd, msgs );
        case RifPackage.ACCESS_POLICIES__ACCESSPOLICY:
            return ((InternalEList)getACCESSPOLICY()).basicRemove( otherEnd, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch (featureID) {
        case RifPackage.ACCESS_POLICIES__GROUP:
            if( coreType ) return getGroup();
            return ((FeatureMap.Internal)getGroup()).getWrapper();
        case RifPackage.ACCESS_POLICIES__ACCESSPOLICY:
            return getACCESSPOLICY();
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
        case RifPackage.ACCESS_POLICIES__GROUP:
            ((FeatureMap.Internal)getGroup()).set( newValue );
            return;
        case RifPackage.ACCESS_POLICIES__ACCESSPOLICY:
            getACCESSPOLICY().clear();
            getACCESSPOLICY().addAll( (Collection)newValue );
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
        case RifPackage.ACCESS_POLICIES__GROUP:
            getGroup().clear();
            return;
        case RifPackage.ACCESS_POLICIES__ACCESSPOLICY:
            getACCESSPOLICY().clear();
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
        case RifPackage.ACCESS_POLICIES__GROUP:
            return group != null && !group.isEmpty();
        case RifPackage.ACCESS_POLICIES__ACCESSPOLICY:
            return !getACCESSPOLICY().isEmpty();
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
        result.append( " (group: " );
        result.append( group );
        result.append( ')' );
        return result.toString();
    }

} //AccessPoliciesImpl
