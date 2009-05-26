/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AttributeValueEmbeddedFile;
import era.foss.model.core.rif.DefaultValue2;
import era.foss.model.core.rif.RifPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Value2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.DefaultValue2Impl#getATTRIBUTEVALUEEMBEDDEDFILE <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultValue2Impl extends EObjectImpl implements DefaultValue2 {
    /**
     * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected int booleans = 0;

    /**
     * The cached value of the '{@link #getATTRIBUTEVALUEEMBEDDEDFILE() <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getATTRIBUTEVALUEEMBEDDEDFILE()
     * @generated
     * @ordered
     */
    protected AttributeValueEmbeddedFile aTTRIBUTEVALUEEMBEDDEDFILE;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DefaultValue2Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return RifPackage.Literals.DEFAULT_VALUE2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueEmbeddedFile getATTRIBUTEVALUEEMBEDDEDFILE() {
        return aTTRIBUTEVALUEEMBEDDEDFILE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetATTRIBUTEVALUEEMBEDDEDFILE( AttributeValueEmbeddedFile newATTRIBUTEVALUEEMBEDDEDFILE,
                                                                 NotificationChain msgs ) {
        AttributeValueEmbeddedFile oldATTRIBUTEVALUEEMBEDDEDFILE = aTTRIBUTEVALUEEMBEDDEDFILE;
        aTTRIBUTEVALUEEMBEDDEDFILE = newATTRIBUTEVALUEEMBEDDEDFILE;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.DEFAULT_VALUE2__ATTRIBUTEVALUEEMBEDDEDFILE,
                oldATTRIBUTEVALUEEMBEDDEDFILE,
                newATTRIBUTEVALUEEMBEDDEDFILE );
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
    public void setATTRIBUTEVALUEEMBEDDEDFILE( AttributeValueEmbeddedFile newATTRIBUTEVALUEEMBEDDEDFILE ) {
        if( newATTRIBUTEVALUEEMBEDDEDFILE != aTTRIBUTEVALUEEMBEDDEDFILE ) {
            NotificationChain msgs = null;
            if( aTTRIBUTEVALUEEMBEDDEDFILE != null ) msgs = ((InternalEObject)aTTRIBUTEVALUEEMBEDDEDFILE).eInverseRemove( this,
                                                                                                                          EOPPOSITE_FEATURE_BASE
                                                                                                                              - RifPackage.DEFAULT_VALUE2__ATTRIBUTEVALUEEMBEDDEDFILE,
                                                                                                                          null,
                                                                                                                          msgs );
            if( newATTRIBUTEVALUEEMBEDDEDFILE != null ) msgs = ((InternalEObject)newATTRIBUTEVALUEEMBEDDEDFILE).eInverseAdd( this,
                                                                                                                             EOPPOSITE_FEATURE_BASE
                                                                                                                                 - RifPackage.DEFAULT_VALUE2__ATTRIBUTEVALUEEMBEDDEDFILE,
                                                                                                                             null,
                                                                                                                             msgs );
            msgs = basicSetATTRIBUTEVALUEEMBEDDEDFILE( newATTRIBUTEVALUEEMBEDDEDFILE, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.DEFAULT_VALUE2__ATTRIBUTEVALUEEMBEDDEDFILE,
            newATTRIBUTEVALUEEMBEDDEDFILE,
            newATTRIBUTEVALUEEMBEDDEDFILE ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
        case RifPackage.DEFAULT_VALUE2__ATTRIBUTEVALUEEMBEDDEDFILE:
            return basicSetATTRIBUTEVALUEEMBEDDEDFILE( null, msgs );
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
        case RifPackage.DEFAULT_VALUE2__ATTRIBUTEVALUEEMBEDDEDFILE:
            return getATTRIBUTEVALUEEMBEDDEDFILE();
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
        case RifPackage.DEFAULT_VALUE2__ATTRIBUTEVALUEEMBEDDEDFILE:
            setATTRIBUTEVALUEEMBEDDEDFILE( (AttributeValueEmbeddedFile)newValue );
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
        case RifPackage.DEFAULT_VALUE2__ATTRIBUTEVALUEEMBEDDEDFILE:
            setATTRIBUTEVALUEEMBEDDEDFILE( (AttributeValueEmbeddedFile)null );
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
        case RifPackage.DEFAULT_VALUE2__ATTRIBUTEVALUEEMBEDDEDFILE:
            return aTTRIBUTEVALUEEMBEDDEDFILE != null;
        }
        return super.eIsSet( featureID );
    }

} //DefaultValue2Impl
