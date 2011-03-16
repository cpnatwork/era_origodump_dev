/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.erf.impl;

import era.foss.erf.ERF;
import era.foss.erf.Content;
import era.foss.erf.ErfPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.erf.impl.ERFImpl#getCoreContent <em>Core Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ERFImpl extends EObjectImpl implements ERF {

    /**
     * The cached value of the '{@link #getCoreContent() <em>Core Content</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoreContent()
     * @generated
     * @ordered
     */
    protected Content coreContent;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ERFImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ErfPackage.Literals.ERF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Content getCoreContent() {
        return coreContent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCoreContent( Content newCoreContent, NotificationChain msgs ) {
        Content oldCoreContent = coreContent;
        coreContent = newCoreContent;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this,
                                                                    Notification.SET,
                                                                    ErfPackage.ERF__CORE_CONTENT,
                                                                    oldCoreContent,
                                                                    newCoreContent );
            if( msgs == null ) msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCoreContent( Content newCoreContent ) {
        if( newCoreContent != coreContent ) {
            NotificationChain msgs = null;
            if( coreContent != null )
                msgs = ( (InternalEObject)coreContent ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE
                        - ErfPackage.ERF__CORE_CONTENT, null, msgs );
            if( newCoreContent != null )
                msgs = ( (InternalEObject)newCoreContent ).eInverseAdd( this, EOPPOSITE_FEATURE_BASE
                        - ErfPackage.ERF__CORE_CONTENT, null, msgs );
            msgs = basicSetCoreContent( newCoreContent, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this,
                                            Notification.SET,
                                            ErfPackage.ERF__CORE_CONTENT,
                                            newCoreContent,
                                            newCoreContent ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
            case ErfPackage.ERF__CORE_CONTENT:
                return basicSetCoreContent( null, msgs );
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
            case ErfPackage.ERF__CORE_CONTENT:
                return getCoreContent();
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
        switch( featureID ) {
            case ErfPackage.ERF__CORE_CONTENT:
                setCoreContent( (Content)newValue );
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
            case ErfPackage.ERF__CORE_CONTENT:
                setCoreContent( (Content)null );
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
            case ErfPackage.ERF__CORE_CONTENT:
                return coreContent != null;
        }
        return super.eIsSet( featureID );
    }

} //ERFImpl
