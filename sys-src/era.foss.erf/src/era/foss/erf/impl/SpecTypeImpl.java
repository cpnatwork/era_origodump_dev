/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.erf.impl;

import era.foss.erf.AttributeDefinition;
import era.foss.erf.ErfPackage;
import era.foss.erf.SpecType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spec Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.erf.impl.SpecTypeImpl#getSpecAttributes <em>Spec Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecTypeImpl extends IdentifiableImpl implements SpecType {

    /**
     * The cached value of the '{@link #getSpecAttributes() <em>Spec Attributes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecAttributes()
     * @generated
     * @ordered
     */
    protected EList<AttributeDefinition> specAttributes;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SpecTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ErfPackage.Literals.SPEC_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AttributeDefinition> getSpecAttributes() {
        if( specAttributes == null ) {
            specAttributes = new EObjectContainmentEList<AttributeDefinition>( AttributeDefinition.class,
                                                                               this,
                                                                               ErfPackage.SPEC_TYPE__SPEC_ATTRIBUTES );
        }
        return specAttributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
            case ErfPackage.SPEC_TYPE__SPEC_ATTRIBUTES:
                return ( (InternalEList<?>)getSpecAttributes() ).basicRemove( otherEnd, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
            case ErfPackage.SPEC_TYPE__SPEC_ATTRIBUTES:
                return getSpecAttributes();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
            case ErfPackage.SPEC_TYPE__SPEC_ATTRIBUTES:
                getSpecAttributes().clear();
                getSpecAttributes().addAll( (Collection<? extends AttributeDefinition>)newValue );
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
        switch( featureID ) {
            case ErfPackage.SPEC_TYPE__SPEC_ATTRIBUTES:
                getSpecAttributes().clear();
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
        switch( featureID ) {
            case ErfPackage.SPEC_TYPE__SPEC_ATTRIBUTES:
                return specAttributes != null && !specAttributes.isEmpty();
        }
        return super.eIsSet( featureID );
    }

} //SpecTypeImpl
