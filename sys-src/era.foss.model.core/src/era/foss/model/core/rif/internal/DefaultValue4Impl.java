/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AttributeValueFileReference;
import era.foss.model.core.rif.DefaultValue4;
import era.foss.model.core.rif.RifPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Value4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.DefaultValue4Impl#getATTRIBUTEVALUEFILEREFERENCE <em>ATTRIBUTEVALUEFILEREFERENCE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultValue4Impl extends EObjectImpl implements DefaultValue4 {
    /**
     * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected int booleans = 0;

    /**
     * The cached value of the '{@link #getATTRIBUTEVALUEFILEREFERENCE() <em>ATTRIBUTEVALUEFILEREFERENCE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getATTRIBUTEVALUEFILEREFERENCE()
     * @generated
     * @ordered
     */
    protected AttributeValueFileReference aTTRIBUTEVALUEFILEREFERENCE;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DefaultValue4Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return RifPackage.Literals.DEFAULT_VALUE4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueFileReference getATTRIBUTEVALUEFILEREFERENCE() {
        return aTTRIBUTEVALUEFILEREFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetATTRIBUTEVALUEFILEREFERENCE( AttributeValueFileReference newATTRIBUTEVALUEFILEREFERENCE,
                                                                  NotificationChain msgs ) {
        AttributeValueFileReference oldATTRIBUTEVALUEFILEREFERENCE = aTTRIBUTEVALUEFILEREFERENCE;
        aTTRIBUTEVALUEFILEREFERENCE = newATTRIBUTEVALUEFILEREFERENCE;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.DEFAULT_VALUE4__ATTRIBUTEVALUEFILEREFERENCE,
                oldATTRIBUTEVALUEFILEREFERENCE,
                newATTRIBUTEVALUEFILEREFERENCE );
            if( msgs == null ) msgs = notification;
            else msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setATTRIBUTEVALUEFILEREFERENCE( AttributeValueFileReference newATTRIBUTEVALUEFILEREFERENCE ) {
        if( newATTRIBUTEVALUEFILEREFERENCE != aTTRIBUTEVALUEFILEREFERENCE ) {
            NotificationChain msgs = null;
            if( aTTRIBUTEVALUEFILEREFERENCE != null ) msgs = ((InternalEObject)aTTRIBUTEVALUEFILEREFERENCE).eInverseRemove( this,
                                                                                                                            EOPPOSITE_FEATURE_BASE
                                                                                                                                - RifPackage.DEFAULT_VALUE4__ATTRIBUTEVALUEFILEREFERENCE,
                                                                                                                            null,
                                                                                                                            msgs );
            if( newATTRIBUTEVALUEFILEREFERENCE != null ) msgs = ((InternalEObject)newATTRIBUTEVALUEFILEREFERENCE).eInverseAdd( this,
                                                                                                                               EOPPOSITE_FEATURE_BASE
                                                                                                                                   - RifPackage.DEFAULT_VALUE4__ATTRIBUTEVALUEFILEREFERENCE,
                                                                                                                               null,
                                                                                                                               msgs );
            msgs = basicSetATTRIBUTEVALUEFILEREFERENCE( newATTRIBUTEVALUEFILEREFERENCE, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.DEFAULT_VALUE4__ATTRIBUTEVALUEFILEREFERENCE,
            newATTRIBUTEVALUEFILEREFERENCE,
            newATTRIBUTEVALUEFILEREFERENCE ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
        case RifPackage.DEFAULT_VALUE4__ATTRIBUTEVALUEFILEREFERENCE:
            return basicSetATTRIBUTEVALUEFILEREFERENCE( null, msgs );
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
        case RifPackage.DEFAULT_VALUE4__ATTRIBUTEVALUEFILEREFERENCE:
            return getATTRIBUTEVALUEFILEREFERENCE();
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
        case RifPackage.DEFAULT_VALUE4__ATTRIBUTEVALUEFILEREFERENCE:
            setATTRIBUTEVALUEFILEREFERENCE( (AttributeValueFileReference)newValue );
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
        case RifPackage.DEFAULT_VALUE4__ATTRIBUTEVALUEFILEREFERENCE:
            setATTRIBUTEVALUEFILEREFERENCE( (AttributeValueFileReference)null );
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
        case RifPackage.DEFAULT_VALUE4__ATTRIBUTEVALUEFILEREFERENCE:
            return aTTRIBUTEVALUEFILEREFERENCE != null;
        }
        return super.eIsSet( featureID );
    }

} //DefaultValue4Impl
