/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AttributeDefinitionComplex;
import era.foss.model.core.rif.AttributeDefinitionComplexDefaultValue;
import era.foss.model.core.rif.AttributeDefinitionComplexType;
import era.foss.model.core.rif.DefaultValue2;
import era.foss.model.core.rif.DefaultValue3;
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
 * An implementation of the model object '<em><b>Attribute Definition Complex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionComplexImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionComplexImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionComplexImpl#getDEFAULTVALUE <em>DEFAULTVALUE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionComplexImpl#getDEFAULTVALUE2 <em>DEFAULTVALUE2</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionComplexImpl#getDEFAULTVALUE3 <em>DEFAULTVALUE3</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionComplexImpl#getDEFAULTVALUE4 <em>DEFAULTVALUE4</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionComplexImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionComplexImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionComplexImpl#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeDefinitionComplexImpl extends EObjectImpl implements AttributeDefinitionComplex {
    /**
     * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected int booleans = 0;

    /**
     * The default value of the '{@link #getLONGNAME() <em>LONGNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLONGNAME()
     * @generated
     * @ordered
     */
    protected static final String LONGNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLONGNAME() <em>LONGNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLONGNAME()
     * @generated
     * @ordered
     */
    protected String lONGNAME = LONGNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getDESC() <em>DESC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDESC()
     * @generated
     * @ordered
     */
    protected static final String DESC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDESC() <em>DESC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDESC()
     * @generated
     * @ordered
     */
    protected String dESC = DESC_EDEFAULT;

    /**
     * The cached value of the '{@link #getDEFAULTVALUE() <em>DEFAULTVALUE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDEFAULTVALUE()
     * @generated
     * @ordered
     */
    protected AttributeDefinitionComplexDefaultValue dEFAULTVALUE;

    /**
     * The cached value of the '{@link #getDEFAULTVALUE2() <em>DEFAULTVALUE2</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDEFAULTVALUE2()
     * @generated
     * @ordered
     */
    protected DefaultValue2 dEFAULTVALUE2;

    /**
     * The cached value of the '{@link #getDEFAULTVALUE3() <em>DEFAULTVALUE3</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDEFAULTVALUE3()
     * @generated
     * @ordered
     */
    protected DefaultValue3 dEFAULTVALUE3;

    /**
     * The cached value of the '{@link #getDEFAULTVALUE4() <em>DEFAULTVALUE4</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDEFAULTVALUE4()
     * @generated
     * @ordered
     */
    protected DefaultValue4 dEFAULTVALUE4;

    /**
     * The default value of the '{@link #getIDENTIFIER() <em>IDENTIFIER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIDENTIFIER()
     * @generated
     * @ordered
     */
    protected static final String IDENTIFIER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIDENTIFIER() <em>IDENTIFIER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIDENTIFIER()
     * @generated
     * @ordered
     */
    protected String iDENTIFIER = IDENTIFIER_EDEFAULT;

    /**
     * The default value of the '{@link #getLASTCHANGE() <em>LASTCHANGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLASTCHANGE()
     * @generated
     * @ordered
     */
    protected static final String LASTCHANGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLASTCHANGE() <em>LASTCHANGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLASTCHANGE()
     * @generated
     * @ordered
     */
    protected String lASTCHANGE = LASTCHANGE_EDEFAULT;

    /**
     * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected AttributeDefinitionComplexType tYPE;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeDefinitionComplexImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return RifPackage.Literals.ATTRIBUTE_DEFINITION_COMPLEX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLONGNAME() {
        return lONGNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLONGNAME( String newLONGNAME ) {
        String oldLONGNAME = lONGNAME;
        lONGNAME = newLONGNAME;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__LONGNAME,
            oldLONGNAME,
            lONGNAME ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDESC() {
        return dESC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDESC( String newDESC ) {
        String oldDESC = dESC;
        dESC = newDESC;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DESC,
            oldDESC,
            dESC ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeDefinitionComplexDefaultValue getDEFAULTVALUE() {
        return dEFAULTVALUE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDEFAULTVALUE( AttributeDefinitionComplexDefaultValue newDEFAULTVALUE,
                                                   NotificationChain msgs ) {
        AttributeDefinitionComplexDefaultValue oldDEFAULTVALUE = dEFAULTVALUE;
        dEFAULTVALUE = newDEFAULTVALUE;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE,
                oldDEFAULTVALUE,
                newDEFAULTVALUE );
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
    public void setDEFAULTVALUE( AttributeDefinitionComplexDefaultValue newDEFAULTVALUE ) {
        if( newDEFAULTVALUE != dEFAULTVALUE ) {
            NotificationChain msgs = null;
            if( dEFAULTVALUE != null ) msgs = ((InternalEObject)dEFAULTVALUE).eInverseRemove( this,
                                                                                              EOPPOSITE_FEATURE_BASE
                                                                                                  - RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE,
                                                                                              null,
                                                                                              msgs );
            if( newDEFAULTVALUE != null ) msgs = ((InternalEObject)newDEFAULTVALUE).eInverseAdd( this,
                                                                                                 EOPPOSITE_FEATURE_BASE
                                                                                                     - RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE,
                                                                                                 null,
                                                                                                 msgs );
            msgs = basicSetDEFAULTVALUE( newDEFAULTVALUE, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE,
            newDEFAULTVALUE,
            newDEFAULTVALUE ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefaultValue2 getDEFAULTVALUE2() {
        return dEFAULTVALUE2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDEFAULTVALUE2( DefaultValue2 newDEFAULTVALUE2, NotificationChain msgs ) {
        DefaultValue2 oldDEFAULTVALUE2 = dEFAULTVALUE2;
        dEFAULTVALUE2 = newDEFAULTVALUE2;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE2,
                oldDEFAULTVALUE2,
                newDEFAULTVALUE2 );
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
    public void setDEFAULTVALUE2( DefaultValue2 newDEFAULTVALUE2 ) {
        if( newDEFAULTVALUE2 != dEFAULTVALUE2 ) {
            NotificationChain msgs = null;
            if( dEFAULTVALUE2 != null ) msgs = ((InternalEObject)dEFAULTVALUE2).eInverseRemove( this,
                                                                                                EOPPOSITE_FEATURE_BASE
                                                                                                    - RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE2,
                                                                                                null,
                                                                                                msgs );
            if( newDEFAULTVALUE2 != null ) msgs = ((InternalEObject)newDEFAULTVALUE2).eInverseAdd( this,
                                                                                                   EOPPOSITE_FEATURE_BASE
                                                                                                       - RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE2,
                                                                                                   null,
                                                                                                   msgs );
            msgs = basicSetDEFAULTVALUE2( newDEFAULTVALUE2, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE2,
            newDEFAULTVALUE2,
            newDEFAULTVALUE2 ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefaultValue3 getDEFAULTVALUE3() {
        return dEFAULTVALUE3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDEFAULTVALUE3( DefaultValue3 newDEFAULTVALUE3, NotificationChain msgs ) {
        DefaultValue3 oldDEFAULTVALUE3 = dEFAULTVALUE3;
        dEFAULTVALUE3 = newDEFAULTVALUE3;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE3,
                oldDEFAULTVALUE3,
                newDEFAULTVALUE3 );
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
    public void setDEFAULTVALUE3( DefaultValue3 newDEFAULTVALUE3 ) {
        if( newDEFAULTVALUE3 != dEFAULTVALUE3 ) {
            NotificationChain msgs = null;
            if( dEFAULTVALUE3 != null ) msgs = ((InternalEObject)dEFAULTVALUE3).eInverseRemove( this,
                                                                                                EOPPOSITE_FEATURE_BASE
                                                                                                    - RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE3,
                                                                                                null,
                                                                                                msgs );
            if( newDEFAULTVALUE3 != null ) msgs = ((InternalEObject)newDEFAULTVALUE3).eInverseAdd( this,
                                                                                                   EOPPOSITE_FEATURE_BASE
                                                                                                       - RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE3,
                                                                                                   null,
                                                                                                   msgs );
            msgs = basicSetDEFAULTVALUE3( newDEFAULTVALUE3, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE3,
            newDEFAULTVALUE3,
            newDEFAULTVALUE3 ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefaultValue4 getDEFAULTVALUE4() {
        return dEFAULTVALUE4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDEFAULTVALUE4( DefaultValue4 newDEFAULTVALUE4, NotificationChain msgs ) {
        DefaultValue4 oldDEFAULTVALUE4 = dEFAULTVALUE4;
        dEFAULTVALUE4 = newDEFAULTVALUE4;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE4,
                oldDEFAULTVALUE4,
                newDEFAULTVALUE4 );
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
    public void setDEFAULTVALUE4( DefaultValue4 newDEFAULTVALUE4 ) {
        if( newDEFAULTVALUE4 != dEFAULTVALUE4 ) {
            NotificationChain msgs = null;
            if( dEFAULTVALUE4 != null ) msgs = ((InternalEObject)dEFAULTVALUE4).eInverseRemove( this,
                                                                                                EOPPOSITE_FEATURE_BASE
                                                                                                    - RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE4,
                                                                                                null,
                                                                                                msgs );
            if( newDEFAULTVALUE4 != null ) msgs = ((InternalEObject)newDEFAULTVALUE4).eInverseAdd( this,
                                                                                                   EOPPOSITE_FEATURE_BASE
                                                                                                       - RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE4,
                                                                                                   null,
                                                                                                   msgs );
            msgs = basicSetDEFAULTVALUE4( newDEFAULTVALUE4, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE4,
            newDEFAULTVALUE4,
            newDEFAULTVALUE4 ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getIDENTIFIER() {
        return iDENTIFIER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIDENTIFIER( String newIDENTIFIER ) {
        String oldIDENTIFIER = iDENTIFIER;
        iDENTIFIER = newIDENTIFIER;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__IDENTIFIER,
            oldIDENTIFIER,
            iDENTIFIER ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLASTCHANGE() {
        return lASTCHANGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLASTCHANGE( String newLASTCHANGE ) {
        String oldLASTCHANGE = lASTCHANGE;
        lASTCHANGE = newLASTCHANGE;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__LASTCHANGE,
            oldLASTCHANGE,
            lASTCHANGE ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeDefinitionComplexType getTYPE() {
        return tYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTYPE( AttributeDefinitionComplexType newTYPE, NotificationChain msgs ) {
        AttributeDefinitionComplexType oldTYPE = tYPE;
        tYPE = newTYPE;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__TYPE,
                oldTYPE,
                newTYPE );
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
    public void setTYPE( AttributeDefinitionComplexType newTYPE ) {
        if( newTYPE != tYPE ) {
            NotificationChain msgs = null;
            if( tYPE != null ) msgs = ((InternalEObject)tYPE).eInverseRemove( this, EOPPOSITE_FEATURE_BASE
                - RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__TYPE, null, msgs );
            if( newTYPE != null ) msgs = ((InternalEObject)newTYPE).eInverseAdd( this, EOPPOSITE_FEATURE_BASE
                - RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__TYPE, null, msgs );
            msgs = basicSetTYPE( newTYPE, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__TYPE,
            newTYPE,
            newTYPE ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE:
            return basicSetDEFAULTVALUE( null, msgs );
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE2:
            return basicSetDEFAULTVALUE2( null, msgs );
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE3:
            return basicSetDEFAULTVALUE3( null, msgs );
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE4:
            return basicSetDEFAULTVALUE4( null, msgs );
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__TYPE:
            return basicSetTYPE( null, msgs );
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
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__LONGNAME:
            return getLONGNAME();
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DESC:
            return getDESC();
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE:
            return getDEFAULTVALUE();
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE2:
            return getDEFAULTVALUE2();
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE3:
            return getDEFAULTVALUE3();
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE4:
            return getDEFAULTVALUE4();
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__IDENTIFIER:
            return getIDENTIFIER();
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__LASTCHANGE:
            return getLASTCHANGE();
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__TYPE:
            return getTYPE();
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
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__LONGNAME:
            setLONGNAME( (String)newValue );
            return;
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DESC:
            setDESC( (String)newValue );
            return;
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE:
            setDEFAULTVALUE( (AttributeDefinitionComplexDefaultValue)newValue );
            return;
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE2:
            setDEFAULTVALUE2( (DefaultValue2)newValue );
            return;
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE3:
            setDEFAULTVALUE3( (DefaultValue3)newValue );
            return;
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE4:
            setDEFAULTVALUE4( (DefaultValue4)newValue );
            return;
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__IDENTIFIER:
            setIDENTIFIER( (String)newValue );
            return;
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__LASTCHANGE:
            setLASTCHANGE( (String)newValue );
            return;
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__TYPE:
            setTYPE( (AttributeDefinitionComplexType)newValue );
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
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__LONGNAME:
            setLONGNAME( LONGNAME_EDEFAULT );
            return;
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DESC:
            setDESC( DESC_EDEFAULT );
            return;
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE:
            setDEFAULTVALUE( (AttributeDefinitionComplexDefaultValue)null );
            return;
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE2:
            setDEFAULTVALUE2( (DefaultValue2)null );
            return;
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE3:
            setDEFAULTVALUE3( (DefaultValue3)null );
            return;
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE4:
            setDEFAULTVALUE4( (DefaultValue4)null );
            return;
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__IDENTIFIER:
            setIDENTIFIER( IDENTIFIER_EDEFAULT );
            return;
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__LASTCHANGE:
            setLASTCHANGE( LASTCHANGE_EDEFAULT );
            return;
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__TYPE:
            setTYPE( (AttributeDefinitionComplexType)null );
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
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__LONGNAME:
            return LONGNAME_EDEFAULT == null ? lONGNAME != null : !LONGNAME_EDEFAULT.equals( lONGNAME );
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DESC:
            return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT.equals( dESC );
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE:
            return dEFAULTVALUE != null;
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE2:
            return dEFAULTVALUE2 != null;
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE3:
            return dEFAULTVALUE3 != null;
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE4:
            return dEFAULTVALUE4 != null;
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__IDENTIFIER:
            return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals( iDENTIFIER );
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__LASTCHANGE:
            return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null : !LASTCHANGE_EDEFAULT.equals( lASTCHANGE );
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX__TYPE:
            return tYPE != null;
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
        result.append( " (lONGNAME: " );
        result.append( lONGNAME );
        result.append( ", dESC: " );
        result.append( dESC );
        result.append( ", iDENTIFIER: " );
        result.append( iDENTIFIER );
        result.append( ", lASTCHANGE: " );
        result.append( lASTCHANGE );
        result.append( ')' );
        return result.toString();
    }

} //AttributeDefinitionComplexImpl
