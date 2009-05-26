/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.DatatypeDefinitionEnumeration;
import era.foss.model.core.rif.RifPackage;
import era.foss.model.core.rif.SpecifiedValues;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype Definition Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionEnumerationImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionEnumerationImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionEnumerationImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionEnumerationImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionEnumerationImpl#getSPECIFIEDVALUES <em>SPECIFIEDVALUES</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatatypeDefinitionEnumerationImpl extends EObjectImpl implements DatatypeDefinitionEnumeration {
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
     * The cached value of the '{@link #getSPECIFIEDVALUES() <em>SPECIFIEDVALUES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSPECIFIEDVALUES()
     * @generated
     * @ordered
     */
    protected SpecifiedValues sPECIFIEDVALUES;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DatatypeDefinitionEnumerationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return RifPackage.Literals.DATATYPE_DEFINITION_ENUMERATION;
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
            RifPackage.DATATYPE_DEFINITION_ENUMERATION__LONGNAME,
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
            RifPackage.DATATYPE_DEFINITION_ENUMERATION__DESC,
            oldDESC,
            dESC ) );
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
            RifPackage.DATATYPE_DEFINITION_ENUMERATION__IDENTIFIER,
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
            RifPackage.DATATYPE_DEFINITION_ENUMERATION__LASTCHANGE,
            oldLASTCHANGE,
            lASTCHANGE ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecifiedValues getSPECIFIEDVALUES() {
        return sPECIFIEDVALUES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSPECIFIEDVALUES( SpecifiedValues newSPECIFIEDVALUES, NotificationChain msgs ) {
        SpecifiedValues oldSPECIFIEDVALUES = sPECIFIEDVALUES;
        sPECIFIEDVALUES = newSPECIFIEDVALUES;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.DATATYPE_DEFINITION_ENUMERATION__SPECIFIEDVALUES,
                oldSPECIFIEDVALUES,
                newSPECIFIEDVALUES );
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
    public void setSPECIFIEDVALUES( SpecifiedValues newSPECIFIEDVALUES ) {
        if( newSPECIFIEDVALUES != sPECIFIEDVALUES ) {
            NotificationChain msgs = null;
            if( sPECIFIEDVALUES != null ) msgs = ((InternalEObject)sPECIFIEDVALUES).eInverseRemove( this,
                                                                                                    EOPPOSITE_FEATURE_BASE
                                                                                                        - RifPackage.DATATYPE_DEFINITION_ENUMERATION__SPECIFIEDVALUES,
                                                                                                    null,
                                                                                                    msgs );
            if( newSPECIFIEDVALUES != null ) msgs = ((InternalEObject)newSPECIFIEDVALUES).eInverseAdd( this,
                                                                                                       EOPPOSITE_FEATURE_BASE
                                                                                                           - RifPackage.DATATYPE_DEFINITION_ENUMERATION__SPECIFIEDVALUES,
                                                                                                       null,
                                                                                                       msgs );
            msgs = basicSetSPECIFIEDVALUES( newSPECIFIEDVALUES, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.DATATYPE_DEFINITION_ENUMERATION__SPECIFIEDVALUES,
            newSPECIFIEDVALUES,
            newSPECIFIEDVALUES ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
        case RifPackage.DATATYPE_DEFINITION_ENUMERATION__SPECIFIEDVALUES:
            return basicSetSPECIFIEDVALUES( null, msgs );
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
        case RifPackage.DATATYPE_DEFINITION_ENUMERATION__LONGNAME:
            return getLONGNAME();
        case RifPackage.DATATYPE_DEFINITION_ENUMERATION__DESC:
            return getDESC();
        case RifPackage.DATATYPE_DEFINITION_ENUMERATION__IDENTIFIER:
            return getIDENTIFIER();
        case RifPackage.DATATYPE_DEFINITION_ENUMERATION__LASTCHANGE:
            return getLASTCHANGE();
        case RifPackage.DATATYPE_DEFINITION_ENUMERATION__SPECIFIEDVALUES:
            return getSPECIFIEDVALUES();
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
        case RifPackage.DATATYPE_DEFINITION_ENUMERATION__LONGNAME:
            setLONGNAME( (String)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITION_ENUMERATION__DESC:
            setDESC( (String)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITION_ENUMERATION__IDENTIFIER:
            setIDENTIFIER( (String)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITION_ENUMERATION__LASTCHANGE:
            setLASTCHANGE( (String)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITION_ENUMERATION__SPECIFIEDVALUES:
            setSPECIFIEDVALUES( (SpecifiedValues)newValue );
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
        case RifPackage.DATATYPE_DEFINITION_ENUMERATION__LONGNAME:
            setLONGNAME( LONGNAME_EDEFAULT );
            return;
        case RifPackage.DATATYPE_DEFINITION_ENUMERATION__DESC:
            setDESC( DESC_EDEFAULT );
            return;
        case RifPackage.DATATYPE_DEFINITION_ENUMERATION__IDENTIFIER:
            setIDENTIFIER( IDENTIFIER_EDEFAULT );
            return;
        case RifPackage.DATATYPE_DEFINITION_ENUMERATION__LASTCHANGE:
            setLASTCHANGE( LASTCHANGE_EDEFAULT );
            return;
        case RifPackage.DATATYPE_DEFINITION_ENUMERATION__SPECIFIEDVALUES:
            setSPECIFIEDVALUES( (SpecifiedValues)null );
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
        case RifPackage.DATATYPE_DEFINITION_ENUMERATION__LONGNAME:
            return LONGNAME_EDEFAULT == null ? lONGNAME != null : !LONGNAME_EDEFAULT.equals( lONGNAME );
        case RifPackage.DATATYPE_DEFINITION_ENUMERATION__DESC:
            return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT.equals( dESC );
        case RifPackage.DATATYPE_DEFINITION_ENUMERATION__IDENTIFIER:
            return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals( iDENTIFIER );
        case RifPackage.DATATYPE_DEFINITION_ENUMERATION__LASTCHANGE:
            return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null : !LASTCHANGE_EDEFAULT.equals( lASTCHANGE );
        case RifPackage.DATATYPE_DEFINITION_ENUMERATION__SPECIFIEDVALUES:
            return sPECIFIEDVALUES != null;
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

} //DatatypeDefinitionEnumerationImpl
