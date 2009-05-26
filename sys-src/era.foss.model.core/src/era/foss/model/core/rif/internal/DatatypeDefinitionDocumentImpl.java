/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.BOOLEAN;
import era.foss.model.core.rif.DATATYPEDEFINITIONDOCUMENTFORMATENUM;
import era.foss.model.core.rif.DatatypeDefinitionDocument;
import era.foss.model.core.rif.RifPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype Definition Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionDocumentImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionDocumentImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionDocumentImpl#getEMBEDDED <em>EMBEDDED</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionDocumentImpl#getFORMAT <em>FORMAT</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionDocumentImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionDocumentImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatatypeDefinitionDocumentImpl extends EObjectImpl implements DatatypeDefinitionDocument {
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
     * The default value of the '{@link #getFORMAT() <em>FORMAT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFORMAT()
     * @generated
     * @ordered
     */
    protected static final DATATYPEDEFINITIONDOCUMENTFORMATENUM FORMAT_EDEFAULT = DATATYPEDEFINITIONDOCUMENTFORMATENUM.XHTML_LITERAL;

    /**
     * The cached value of the '{@link #getFORMAT() <em>FORMAT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFORMAT()
     * @generated
     * @ordered
     */
    protected DATATYPEDEFINITIONDOCUMENTFORMATENUM fORMAT = FORMAT_EDEFAULT;

    /**
     * The flag representing whether the FORMAT attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected static final int FORMAT_ESETFLAG = 1 << 1;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DatatypeDefinitionDocumentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return RifPackage.Literals.DATATYPE_DEFINITION_DOCUMENT;
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
            RifPackage.DATATYPE_DEFINITION_DOCUMENT__LONGNAME,
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
            RifPackage.DATATYPE_DEFINITION_DOCUMENT__DESC,
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
            RifPackage.DATATYPE_DEFINITION_DOCUMENT__EMBEDDED,
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
            RifPackage.DATATYPE_DEFINITION_DOCUMENT__EMBEDDED,
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
    public DATATYPEDEFINITIONDOCUMENTFORMATENUM getFORMAT() {
        return fORMAT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFORMAT( DATATYPEDEFINITIONDOCUMENTFORMATENUM newFORMAT ) {
        DATATYPEDEFINITIONDOCUMENTFORMATENUM oldFORMAT = fORMAT;
        fORMAT = newFORMAT == null ? FORMAT_EDEFAULT : newFORMAT;
        boolean oldFORMATESet = (booleans & FORMAT_ESETFLAG) != 0;
        booleans |= FORMAT_ESETFLAG;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.DATATYPE_DEFINITION_DOCUMENT__FORMAT,
            oldFORMAT,
            fORMAT,
            !oldFORMATESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetFORMAT() {
        DATATYPEDEFINITIONDOCUMENTFORMATENUM oldFORMAT = fORMAT;
        boolean oldFORMATESet = (booleans & FORMAT_ESETFLAG) != 0;
        fORMAT = FORMAT_EDEFAULT;
        booleans &= ~FORMAT_ESETFLAG;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.UNSET,
            RifPackage.DATATYPE_DEFINITION_DOCUMENT__FORMAT,
            oldFORMAT,
            FORMAT_EDEFAULT,
            oldFORMATESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetFORMAT() {
        return (booleans & FORMAT_ESETFLAG) != 0;
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
            RifPackage.DATATYPE_DEFINITION_DOCUMENT__IDENTIFIER,
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
            RifPackage.DATATYPE_DEFINITION_DOCUMENT__LASTCHANGE,
            oldLASTCHANGE,
            lASTCHANGE ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch (featureID) {
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT__LONGNAME:
            return getLONGNAME();
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT__DESC:
            return getDESC();
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT__EMBEDDED:
            return getEMBEDDED();
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT__FORMAT:
            return getFORMAT();
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT__IDENTIFIER:
            return getIDENTIFIER();
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT__LASTCHANGE:
            return getLASTCHANGE();
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
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT__LONGNAME:
            setLONGNAME( (String)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT__DESC:
            setDESC( (String)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT__EMBEDDED:
            setEMBEDDED( (BOOLEAN)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT__FORMAT:
            setFORMAT( (DATATYPEDEFINITIONDOCUMENTFORMATENUM)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT__IDENTIFIER:
            setIDENTIFIER( (String)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT__LASTCHANGE:
            setLASTCHANGE( (String)newValue );
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
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT__LONGNAME:
            setLONGNAME( LONGNAME_EDEFAULT );
            return;
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT__DESC:
            setDESC( DESC_EDEFAULT );
            return;
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT__EMBEDDED:
            unsetEMBEDDED();
            return;
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT__FORMAT:
            unsetFORMAT();
            return;
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT__IDENTIFIER:
            setIDENTIFIER( IDENTIFIER_EDEFAULT );
            return;
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT__LASTCHANGE:
            setLASTCHANGE( LASTCHANGE_EDEFAULT );
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
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT__LONGNAME:
            return LONGNAME_EDEFAULT == null ? lONGNAME != null : !LONGNAME_EDEFAULT.equals( lONGNAME );
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT__DESC:
            return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT.equals( dESC );
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT__EMBEDDED:
            return isSetEMBEDDED();
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT__FORMAT:
            return isSetFORMAT();
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT__IDENTIFIER:
            return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals( iDENTIFIER );
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT__LASTCHANGE:
            return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null : !LASTCHANGE_EDEFAULT.equals( lASTCHANGE );
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
        result.append( ", fORMAT: " );
        if( (booleans & FORMAT_ESETFLAG) != 0 ) result.append( fORMAT );
        else result.append( "<unset>" );
        result.append( ", iDENTIFIER: " );
        result.append( iDENTIFIER );
        result.append( ", lASTCHANGE: " );
        result.append( lASTCHANGE );
        result.append( ')' );
        return result.toString();
    }

} //DatatypeDefinitionDocumentImpl
