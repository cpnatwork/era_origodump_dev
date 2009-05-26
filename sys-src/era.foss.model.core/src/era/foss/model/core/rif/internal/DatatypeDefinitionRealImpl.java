/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.DatatypeDefinitionReal;
import era.foss.model.core.rif.RifPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype Definition Real</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionRealImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionRealImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionRealImpl#getACCURACY <em>ACCURACY</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionRealImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionRealImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionRealImpl#getMAX <em>MAX</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionRealImpl#getMIN <em>MIN</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatatypeDefinitionRealImpl extends EObjectImpl implements DatatypeDefinitionReal {
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
     * The default value of the '{@link #getACCURACY() <em>ACCURACY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getACCURACY()
     * @generated
     * @ordered
     */
    protected static final BigInteger ACCURACY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getACCURACY() <em>ACCURACY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getACCURACY()
     * @generated
     * @ordered
     */
    protected BigInteger aCCURACY = ACCURACY_EDEFAULT;

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
    protected static final float MAX_EDEFAULT = 0.0F;

    /**
     * The cached value of the '{@link #getMAX() <em>MAX</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMAX()
     * @generated
     * @ordered
     */
    protected float mAX = MAX_EDEFAULT;

    /**
     * The flag representing whether the MAX attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected static final int MAX_ESETFLAG = 1 << 0;

    /**
     * The default value of the '{@link #getMIN() <em>MIN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMIN()
     * @generated
     * @ordered
     */
    protected static final float MIN_EDEFAULT = 0.0F;

    /**
     * The cached value of the '{@link #getMIN() <em>MIN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMIN()
     * @generated
     * @ordered
     */
    protected float mIN = MIN_EDEFAULT;

    /**
     * The flag representing whether the MIN attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected static final int MIN_ESETFLAG = 1 << 1;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DatatypeDefinitionRealImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return RifPackage.Literals.DATATYPE_DEFINITION_REAL;
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
            RifPackage.DATATYPE_DEFINITION_REAL__LONGNAME,
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
            RifPackage.DATATYPE_DEFINITION_REAL__DESC,
            oldDESC,
            dESC ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger getACCURACY() {
        return aCCURACY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setACCURACY( BigInteger newACCURACY ) {
        BigInteger oldACCURACY = aCCURACY;
        aCCURACY = newACCURACY;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.DATATYPE_DEFINITION_REAL__ACCURACY,
            oldACCURACY,
            aCCURACY ) );
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
            RifPackage.DATATYPE_DEFINITION_REAL__IDENTIFIER,
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
            RifPackage.DATATYPE_DEFINITION_REAL__LASTCHANGE,
            oldLASTCHANGE,
            lASTCHANGE ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public float getMAX() {
        return mAX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMAX( float newMAX ) {
        float oldMAX = mAX;
        mAX = newMAX;
        boolean oldMAXESet = (booleans & MAX_ESETFLAG) != 0;
        booleans |= MAX_ESETFLAG;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.DATATYPE_DEFINITION_REAL__MAX,
            oldMAX,
            mAX,
            !oldMAXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMAX() {
        float oldMAX = mAX;
        boolean oldMAXESet = (booleans & MAX_ESETFLAG) != 0;
        mAX = MAX_EDEFAULT;
        booleans &= ~MAX_ESETFLAG;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.UNSET,
            RifPackage.DATATYPE_DEFINITION_REAL__MAX,
            oldMAX,
            MAX_EDEFAULT,
            oldMAXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetMAX() {
        return (booleans & MAX_ESETFLAG) != 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public float getMIN() {
        return mIN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMIN( float newMIN ) {
        float oldMIN = mIN;
        mIN = newMIN;
        boolean oldMINESet = (booleans & MIN_ESETFLAG) != 0;
        booleans |= MIN_ESETFLAG;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.DATATYPE_DEFINITION_REAL__MIN,
            oldMIN,
            mIN,
            !oldMINESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMIN() {
        float oldMIN = mIN;
        boolean oldMINESet = (booleans & MIN_ESETFLAG) != 0;
        mIN = MIN_EDEFAULT;
        booleans &= ~MIN_ESETFLAG;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.UNSET,
            RifPackage.DATATYPE_DEFINITION_REAL__MIN,
            oldMIN,
            MIN_EDEFAULT,
            oldMINESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetMIN() {
        return (booleans & MIN_ESETFLAG) != 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch (featureID) {
        case RifPackage.DATATYPE_DEFINITION_REAL__LONGNAME:
            return getLONGNAME();
        case RifPackage.DATATYPE_DEFINITION_REAL__DESC:
            return getDESC();
        case RifPackage.DATATYPE_DEFINITION_REAL__ACCURACY:
            return getACCURACY();
        case RifPackage.DATATYPE_DEFINITION_REAL__IDENTIFIER:
            return getIDENTIFIER();
        case RifPackage.DATATYPE_DEFINITION_REAL__LASTCHANGE:
            return getLASTCHANGE();
        case RifPackage.DATATYPE_DEFINITION_REAL__MAX:
            return new Float( getMAX() );
        case RifPackage.DATATYPE_DEFINITION_REAL__MIN:
            return new Float( getMIN() );
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
        case RifPackage.DATATYPE_DEFINITION_REAL__LONGNAME:
            setLONGNAME( (String)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITION_REAL__DESC:
            setDESC( (String)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITION_REAL__ACCURACY:
            setACCURACY( (BigInteger)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITION_REAL__IDENTIFIER:
            setIDENTIFIER( (String)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITION_REAL__LASTCHANGE:
            setLASTCHANGE( (String)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITION_REAL__MAX:
            setMAX( ((Float)newValue).floatValue() );
            return;
        case RifPackage.DATATYPE_DEFINITION_REAL__MIN:
            setMIN( ((Float)newValue).floatValue() );
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
        case RifPackage.DATATYPE_DEFINITION_REAL__LONGNAME:
            setLONGNAME( LONGNAME_EDEFAULT );
            return;
        case RifPackage.DATATYPE_DEFINITION_REAL__DESC:
            setDESC( DESC_EDEFAULT );
            return;
        case RifPackage.DATATYPE_DEFINITION_REAL__ACCURACY:
            setACCURACY( ACCURACY_EDEFAULT );
            return;
        case RifPackage.DATATYPE_DEFINITION_REAL__IDENTIFIER:
            setIDENTIFIER( IDENTIFIER_EDEFAULT );
            return;
        case RifPackage.DATATYPE_DEFINITION_REAL__LASTCHANGE:
            setLASTCHANGE( LASTCHANGE_EDEFAULT );
            return;
        case RifPackage.DATATYPE_DEFINITION_REAL__MAX:
            unsetMAX();
            return;
        case RifPackage.DATATYPE_DEFINITION_REAL__MIN:
            unsetMIN();
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
        case RifPackage.DATATYPE_DEFINITION_REAL__LONGNAME:
            return LONGNAME_EDEFAULT == null ? lONGNAME != null : !LONGNAME_EDEFAULT.equals( lONGNAME );
        case RifPackage.DATATYPE_DEFINITION_REAL__DESC:
            return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT.equals( dESC );
        case RifPackage.DATATYPE_DEFINITION_REAL__ACCURACY:
            return ACCURACY_EDEFAULT == null ? aCCURACY != null : !ACCURACY_EDEFAULT.equals( aCCURACY );
        case RifPackage.DATATYPE_DEFINITION_REAL__IDENTIFIER:
            return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals( iDENTIFIER );
        case RifPackage.DATATYPE_DEFINITION_REAL__LASTCHANGE:
            return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null : !LASTCHANGE_EDEFAULT.equals( lASTCHANGE );
        case RifPackage.DATATYPE_DEFINITION_REAL__MAX:
            return isSetMAX();
        case RifPackage.DATATYPE_DEFINITION_REAL__MIN:
            return isSetMIN();
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
        result.append( ", aCCURACY: " );
        result.append( aCCURACY );
        result.append( ", iDENTIFIER: " );
        result.append( iDENTIFIER );
        result.append( ", lASTCHANGE: " );
        result.append( lASTCHANGE );
        result.append( ", mAX: " );
        if( (booleans & MAX_ESETFLAG) != 0 ) result.append( mAX );
        else result.append( "<unset>" );
        result.append( ", mIN: " );
        if( (booleans & MIN_ESETFLAG) != 0 ) result.append( mIN );
        else result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DatatypeDefinitionRealImpl
