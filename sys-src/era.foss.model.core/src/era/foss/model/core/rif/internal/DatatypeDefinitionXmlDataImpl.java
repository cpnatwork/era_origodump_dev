/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.BOOLEAN;
import era.foss.model.core.rif.DatatypeDefinitionXmlData;
import era.foss.model.core.rif.RifPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype Definition Xml Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionXmlDataImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionXmlDataImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionXmlDataImpl#getEMBEDDED <em>EMBEDDED</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionXmlDataImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionXmlDataImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionXmlDataImpl#getNAMESPACEURI <em>NAMESPACEURI</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionXmlDataImpl#getSCHEMALOCATION <em>SCHEMALOCATION</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatatypeDefinitionXmlDataImpl extends EObjectImpl implements DatatypeDefinitionXmlData {
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
     * The default value of the '{@link #getEMBEDDED() <em>EMBEDDED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEMBEDDED()
     * @generated
     * @ordered
     */
    protected static final BOOLEAN EMBEDDED_EDEFAULT = BOOLEAN.TRUE_LITERAL;

    /**
     * The cached value of the '{@link #getEMBEDDED() <em>EMBEDDED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEMBEDDED()
     * @generated
     * @ordered
     */
    protected BOOLEAN eMBEDDED = EMBEDDED_EDEFAULT;

    /**
     * The flag representing whether the EMBEDDED attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected static final int EMBEDDED_ESETFLAG = 1 << 0;

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
     * The default value of the '{@link #getNAMESPACEURI() <em>NAMESPACEURI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNAMESPACEURI()
     * @generated
     * @ordered
     */
    protected static final String NAMESPACEURI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNAMESPACEURI() <em>NAMESPACEURI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNAMESPACEURI()
     * @generated
     * @ordered
     */
    protected String nAMESPACEURI = NAMESPACEURI_EDEFAULT;

    /**
     * The default value of the '{@link #getSCHEMALOCATION() <em>SCHEMALOCATION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSCHEMALOCATION()
     * @generated
     * @ordered
     */
    protected static final String SCHEMALOCATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSCHEMALOCATION() <em>SCHEMALOCATION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSCHEMALOCATION()
     * @generated
     * @ordered
     */
    protected String sCHEMALOCATION = SCHEMALOCATION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DatatypeDefinitionXmlDataImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return RifPackage.Literals.DATATYPE_DEFINITION_XML_DATA;
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
            RifPackage.DATATYPE_DEFINITION_XML_DATA__LONGNAME,
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
            RifPackage.DATATYPE_DEFINITION_XML_DATA__DESC,
            oldDESC,
            dESC ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BOOLEAN getEMBEDDED() {
        return eMBEDDED;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEMBEDDED( BOOLEAN newEMBEDDED ) {
        BOOLEAN oldEMBEDDED = eMBEDDED;
        eMBEDDED = newEMBEDDED == null ? EMBEDDED_EDEFAULT : newEMBEDDED;
        boolean oldEMBEDDEDESet = (booleans & EMBEDDED_ESETFLAG) != 0;
        booleans |= EMBEDDED_ESETFLAG;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.DATATYPE_DEFINITION_XML_DATA__EMBEDDED,
            oldEMBEDDED,
            eMBEDDED,
            !oldEMBEDDEDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetEMBEDDED() {
        BOOLEAN oldEMBEDDED = eMBEDDED;
        boolean oldEMBEDDEDESet = (booleans & EMBEDDED_ESETFLAG) != 0;
        eMBEDDED = EMBEDDED_EDEFAULT;
        booleans &= ~EMBEDDED_ESETFLAG;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.UNSET,
            RifPackage.DATATYPE_DEFINITION_XML_DATA__EMBEDDED,
            oldEMBEDDED,
            EMBEDDED_EDEFAULT,
            oldEMBEDDEDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetEMBEDDED() {
        return (booleans & EMBEDDED_ESETFLAG) != 0;
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
            RifPackage.DATATYPE_DEFINITION_XML_DATA__IDENTIFIER,
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
            RifPackage.DATATYPE_DEFINITION_XML_DATA__LASTCHANGE,
            oldLASTCHANGE,
            lASTCHANGE ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNAMESPACEURI() {
        return nAMESPACEURI;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNAMESPACEURI( String newNAMESPACEURI ) {
        String oldNAMESPACEURI = nAMESPACEURI;
        nAMESPACEURI = newNAMESPACEURI;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.DATATYPE_DEFINITION_XML_DATA__NAMESPACEURI,
            oldNAMESPACEURI,
            nAMESPACEURI ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSCHEMALOCATION() {
        return sCHEMALOCATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSCHEMALOCATION( String newSCHEMALOCATION ) {
        String oldSCHEMALOCATION = sCHEMALOCATION;
        sCHEMALOCATION = newSCHEMALOCATION;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.DATATYPE_DEFINITION_XML_DATA__SCHEMALOCATION,
            oldSCHEMALOCATION,
            sCHEMALOCATION ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch (featureID) {
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__LONGNAME:
            return getLONGNAME();
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__DESC:
            return getDESC();
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__EMBEDDED:
            return getEMBEDDED();
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__IDENTIFIER:
            return getIDENTIFIER();
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__LASTCHANGE:
            return getLASTCHANGE();
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__NAMESPACEURI:
            return getNAMESPACEURI();
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__SCHEMALOCATION:
            return getSCHEMALOCATION();
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
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__LONGNAME:
            setLONGNAME( (String)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__DESC:
            setDESC( (String)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__EMBEDDED:
            setEMBEDDED( (BOOLEAN)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__IDENTIFIER:
            setIDENTIFIER( (String)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__LASTCHANGE:
            setLASTCHANGE( (String)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__NAMESPACEURI:
            setNAMESPACEURI( (String)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__SCHEMALOCATION:
            setSCHEMALOCATION( (String)newValue );
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
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__LONGNAME:
            setLONGNAME( LONGNAME_EDEFAULT );
            return;
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__DESC:
            setDESC( DESC_EDEFAULT );
            return;
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__EMBEDDED:
            unsetEMBEDDED();
            return;
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__IDENTIFIER:
            setIDENTIFIER( IDENTIFIER_EDEFAULT );
            return;
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__LASTCHANGE:
            setLASTCHANGE( LASTCHANGE_EDEFAULT );
            return;
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__NAMESPACEURI:
            setNAMESPACEURI( NAMESPACEURI_EDEFAULT );
            return;
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__SCHEMALOCATION:
            setSCHEMALOCATION( SCHEMALOCATION_EDEFAULT );
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
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__LONGNAME:
            return LONGNAME_EDEFAULT == null ? lONGNAME != null : !LONGNAME_EDEFAULT.equals( lONGNAME );
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__DESC:
            return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT.equals( dESC );
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__EMBEDDED:
            return isSetEMBEDDED();
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__IDENTIFIER:
            return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals( iDENTIFIER );
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__LASTCHANGE:
            return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null : !LASTCHANGE_EDEFAULT.equals( lASTCHANGE );
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__NAMESPACEURI:
            return NAMESPACEURI_EDEFAULT == null
                ? nAMESPACEURI != null
                : !NAMESPACEURI_EDEFAULT.equals( nAMESPACEURI );
        case RifPackage.DATATYPE_DEFINITION_XML_DATA__SCHEMALOCATION:
            return SCHEMALOCATION_EDEFAULT == null
                ? sCHEMALOCATION != null
                : !SCHEMALOCATION_EDEFAULT.equals( sCHEMALOCATION );
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
        result.append( ", eMBEDDED: " );
        if( (booleans & EMBEDDED_ESETFLAG) != 0 ) result.append( eMBEDDED );
        else result.append( "<unset>" );
        result.append( ", iDENTIFIER: " );
        result.append( iDENTIFIER );
        result.append( ", lASTCHANGE: " );
        result.append( lASTCHANGE );
        result.append( ", nAMESPACEURI: " );
        result.append( nAMESPACEURI );
        result.append( ", sCHEMALOCATION: " );
        result.append( sCHEMALOCATION );
        result.append( ')' );
        return result.toString();
    }

} //DatatypeDefinitionXmlDataImpl
