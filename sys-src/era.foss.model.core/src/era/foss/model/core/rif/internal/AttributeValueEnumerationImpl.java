/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AttributeValueEnumeration;
import era.foss.model.core.rif.AttributeValueEnumerationDefinition;
import era.foss.model.core.rif.AttributeValueEnumerationValues;
import era.foss.model.core.rif.RifPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValueEnumerationImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValueEnumerationImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValueEnumerationImpl#getDEFINITION <em>DEFINITION</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValueEnumerationImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValueEnumerationImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValueEnumerationImpl#getVALUES <em>VALUES</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeValueEnumerationImpl extends EObjectImpl implements AttributeValueEnumeration {
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
     * The cached value of the '{@link #getDEFINITION() <em>DEFINITION</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDEFINITION()
     * @generated
     * @ordered
     */
    protected AttributeValueEnumerationDefinition dEFINITION;

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
     * The cached value of the '{@link #getVALUES() <em>VALUES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVALUES()
     * @generated
     * @ordered
     */
    protected AttributeValueEnumerationValues vALUES;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeValueEnumerationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return RifPackage.Literals.ATTRIBUTE_VALUE_ENUMERATION;
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
            RifPackage.ATTRIBUTE_VALUE_ENUMERATION__LONGNAME,
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
            RifPackage.ATTRIBUTE_VALUE_ENUMERATION__DESC,
            oldDESC,
            dESC ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueEnumerationDefinition getDEFINITION() {
        return dEFINITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDEFINITION( AttributeValueEnumerationDefinition newDEFINITION,
                                                 NotificationChain msgs ) {
        AttributeValueEnumerationDefinition oldDEFINITION = dEFINITION;
        dEFINITION = newDEFINITION;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.ATTRIBUTE_VALUE_ENUMERATION__DEFINITION,
                oldDEFINITION,
                newDEFINITION );
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
    public void setDEFINITION( AttributeValueEnumerationDefinition newDEFINITION ) {
        if( newDEFINITION != dEFINITION ) {
            NotificationChain msgs = null;
            if( dEFINITION != null ) msgs = ((InternalEObject)dEFINITION).eInverseRemove( this,
                                                                                          EOPPOSITE_FEATURE_BASE
                                                                                              - RifPackage.ATTRIBUTE_VALUE_ENUMERATION__DEFINITION,
                                                                                          null,
                                                                                          msgs );
            if( newDEFINITION != null ) msgs = ((InternalEObject)newDEFINITION).eInverseAdd( this,
                                                                                             EOPPOSITE_FEATURE_BASE
                                                                                                 - RifPackage.ATTRIBUTE_VALUE_ENUMERATION__DEFINITION,
                                                                                             null,
                                                                                             msgs );
            msgs = basicSetDEFINITION( newDEFINITION, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ATTRIBUTE_VALUE_ENUMERATION__DEFINITION,
            newDEFINITION,
            newDEFINITION ) );
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
            RifPackage.ATTRIBUTE_VALUE_ENUMERATION__IDENTIFIER,
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
            RifPackage.ATTRIBUTE_VALUE_ENUMERATION__LASTCHANGE,
            oldLASTCHANGE,
            lASTCHANGE ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueEnumerationValues getVALUES() {
        return vALUES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVALUES( AttributeValueEnumerationValues newVALUES, NotificationChain msgs ) {
        AttributeValueEnumerationValues oldVALUES = vALUES;
        vALUES = newVALUES;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.ATTRIBUTE_VALUE_ENUMERATION__VALUES,
                oldVALUES,
                newVALUES );
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
    public void setVALUES( AttributeValueEnumerationValues newVALUES ) {
        if( newVALUES != vALUES ) {
            NotificationChain msgs = null;
            if( vALUES != null ) msgs = ((InternalEObject)vALUES).eInverseRemove( this, EOPPOSITE_FEATURE_BASE
                - RifPackage.ATTRIBUTE_VALUE_ENUMERATION__VALUES, null, msgs );
            if( newVALUES != null ) msgs = ((InternalEObject)newVALUES).eInverseAdd( this, EOPPOSITE_FEATURE_BASE
                - RifPackage.ATTRIBUTE_VALUE_ENUMERATION__VALUES, null, msgs );
            msgs = basicSetVALUES( newVALUES, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ATTRIBUTE_VALUE_ENUMERATION__VALUES,
            newVALUES,
            newVALUES ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__DEFINITION:
            return basicSetDEFINITION( null, msgs );
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__VALUES:
            return basicSetVALUES( null, msgs );
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
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__LONGNAME:
            return getLONGNAME();
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__DESC:
            return getDESC();
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__DEFINITION:
            return getDEFINITION();
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__IDENTIFIER:
            return getIDENTIFIER();
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__LASTCHANGE:
            return getLASTCHANGE();
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__VALUES:
            return getVALUES();
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
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__LONGNAME:
            setLONGNAME( (String)newValue );
            return;
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__DESC:
            setDESC( (String)newValue );
            return;
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__DEFINITION:
            setDEFINITION( (AttributeValueEnumerationDefinition)newValue );
            return;
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__IDENTIFIER:
            setIDENTIFIER( (String)newValue );
            return;
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__LASTCHANGE:
            setLASTCHANGE( (String)newValue );
            return;
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__VALUES:
            setVALUES( (AttributeValueEnumerationValues)newValue );
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
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__LONGNAME:
            setLONGNAME( LONGNAME_EDEFAULT );
            return;
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__DESC:
            setDESC( DESC_EDEFAULT );
            return;
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__DEFINITION:
            setDEFINITION( (AttributeValueEnumerationDefinition)null );
            return;
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__IDENTIFIER:
            setIDENTIFIER( IDENTIFIER_EDEFAULT );
            return;
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__LASTCHANGE:
            setLASTCHANGE( LASTCHANGE_EDEFAULT );
            return;
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__VALUES:
            setVALUES( (AttributeValueEnumerationValues)null );
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
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__LONGNAME:
            return LONGNAME_EDEFAULT == null ? lONGNAME != null : !LONGNAME_EDEFAULT.equals( lONGNAME );
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__DESC:
            return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT.equals( dESC );
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__DEFINITION:
            return dEFINITION != null;
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__IDENTIFIER:
            return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals( iDENTIFIER );
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__LASTCHANGE:
            return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null : !LASTCHANGE_EDEFAULT.equals( lASTCHANGE );
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION__VALUES:
            return vALUES != null;
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

} //AttributeValueEnumerationImpl
