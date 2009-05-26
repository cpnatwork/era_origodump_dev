/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.DatatypeDefinitionInteger;
import era.foss.model.core.rif.RifPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype Definition Integer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionIntegerImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionIntegerImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionIntegerImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionIntegerImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionIntegerImpl#getMAX <em>MAX</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionIntegerImpl#getMIN <em>MIN</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatatypeDefinitionIntegerImpl extends EObjectImpl implements DatatypeDefinitionInteger {
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
     * The default value of the '{@link #getMAX() <em>MAX</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMAX()
     * @generated
     * @ordered
     */
    protected static final BigInteger MAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMAX() <em>MAX</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMAX()
     * @generated
     * @ordered
     */
    protected BigInteger mAX = MAX_EDEFAULT;

    /**
     * The default value of the '{@link #getMIN() <em>MIN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMIN()
     * @generated
     * @ordered
     */
    protected static final BigInteger MIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMIN() <em>MIN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMIN()
     * @generated
     * @ordered
     */
    protected BigInteger mIN = MIN_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DatatypeDefinitionIntegerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return RifPackage.Literals.DATATYPE_DEFINITION_INTEGER;
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
            RifPackage.DATATYPE_DEFINITION_INTEGER__LONGNAME,
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
            RifPackage.DATATYPE_DEFINITION_INTEGER__DESC,
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
            RifPackage.DATATYPE_DEFINITION_INTEGER__IDENTIFIER,
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
            RifPackage.DATATYPE_DEFINITION_INTEGER__LASTCHANGE,
            oldLASTCHANGE,
            lASTCHANGE ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger getMAX() {
        return mAX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMAX( BigInteger newMAX ) {
        BigInteger oldMAX = mAX;
        mAX = newMAX;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.DATATYPE_DEFINITION_INTEGER__MAX,
            oldMAX,
            mAX ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger getMIN() {
        return mIN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMIN( BigInteger newMIN ) {
        BigInteger oldMIN = mIN;
        mIN = newMIN;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.DATATYPE_DEFINITION_INTEGER__MIN,
            oldMIN,
            mIN ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch (featureID) {
        case RifPackage.DATATYPE_DEFINITION_INTEGER__LONGNAME:
            return getLONGNAME();
        case RifPackage.DATATYPE_DEFINITION_INTEGER__DESC:
            return getDESC();
        case RifPackage.DATATYPE_DEFINITION_INTEGER__IDENTIFIER:
            return getIDENTIFIER();
        case RifPackage.DATATYPE_DEFINITION_INTEGER__LASTCHANGE:
            return getLASTCHANGE();
        case RifPackage.DATATYPE_DEFINITION_INTEGER__MAX:
            return getMAX();
        case RifPackage.DATATYPE_DEFINITION_INTEGER__MIN:
            return getMIN();
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
        case RifPackage.DATATYPE_DEFINITION_INTEGER__LONGNAME:
            setLONGNAME( (String)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITION_INTEGER__DESC:
            setDESC( (String)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITION_INTEGER__IDENTIFIER:
            setIDENTIFIER( (String)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITION_INTEGER__LASTCHANGE:
            setLASTCHANGE( (String)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITION_INTEGER__MAX:
            setMAX( (BigInteger)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITION_INTEGER__MIN:
            setMIN( (BigInteger)newValue );
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
        case RifPackage.DATATYPE_DEFINITION_INTEGER__LONGNAME:
            setLONGNAME( LONGNAME_EDEFAULT );
            return;
        case RifPackage.DATATYPE_DEFINITION_INTEGER__DESC:
            setDESC( DESC_EDEFAULT );
            return;
        case RifPackage.DATATYPE_DEFINITION_INTEGER__IDENTIFIER:
            setIDENTIFIER( IDENTIFIER_EDEFAULT );
            return;
        case RifPackage.DATATYPE_DEFINITION_INTEGER__LASTCHANGE:
            setLASTCHANGE( LASTCHANGE_EDEFAULT );
            return;
        case RifPackage.DATATYPE_DEFINITION_INTEGER__MAX:
            setMAX( MAX_EDEFAULT );
            return;
        case RifPackage.DATATYPE_DEFINITION_INTEGER__MIN:
            setMIN( MIN_EDEFAULT );
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
        case RifPackage.DATATYPE_DEFINITION_INTEGER__LONGNAME:
            return LONGNAME_EDEFAULT == null ? lONGNAME != null : !LONGNAME_EDEFAULT.equals( lONGNAME );
        case RifPackage.DATATYPE_DEFINITION_INTEGER__DESC:
            return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT.equals( dESC );
        case RifPackage.DATATYPE_DEFINITION_INTEGER__IDENTIFIER:
            return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals( iDENTIFIER );
        case RifPackage.DATATYPE_DEFINITION_INTEGER__LASTCHANGE:
            return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null : !LASTCHANGE_EDEFAULT.equals( lASTCHANGE );
        case RifPackage.DATATYPE_DEFINITION_INTEGER__MAX:
            return MAX_EDEFAULT == null ? mAX != null : !MAX_EDEFAULT.equals( mAX );
        case RifPackage.DATATYPE_DEFINITION_INTEGER__MIN:
            return MIN_EDEFAULT == null ? mIN != null : !MIN_EDEFAULT.equals( mIN );
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
        result.append( ", mAX: " );
        result.append( mAX );
        result.append( ", mIN: " );
        result.append( mIN );
        result.append( ')' );
        return result.toString();
    }

} //DatatypeDefinitionIntegerImpl
