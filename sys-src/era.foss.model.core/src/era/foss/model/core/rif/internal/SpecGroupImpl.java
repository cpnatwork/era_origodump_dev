/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.RifPackage;
import era.foss.model.core.rif.SpecGroup;
import era.foss.model.core.rif.SpecGroupRelationGroups;
import era.foss.model.core.rif.SpecGroupSpecObjects;
import era.foss.model.core.rif.SpecGroupType;
import era.foss.model.core.rif.SpecGroupValues;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spec Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.SpecGroupImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecGroupImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecGroupImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecGroupImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecGroupImpl#getRELATIONGROUPS <em>RELATIONGROUPS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecGroupImpl#getSPECOBJECTS <em>SPECOBJECTS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecGroupImpl#getTYPE <em>TYPE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecGroupImpl#getVALUES <em>VALUES</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecGroupImpl extends EObjectImpl implements SpecGroup {
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
     * The cached value of the '{@link #getRELATIONGROUPS() <em>RELATIONGROUPS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRELATIONGROUPS()
     * @generated
     * @ordered
     */
    protected SpecGroupRelationGroups rELATIONGROUPS;

    /**
     * The cached value of the '{@link #getSPECOBJECTS() <em>SPECOBJECTS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSPECOBJECTS()
     * @generated
     * @ordered
     */
    protected SpecGroupSpecObjects sPECOBJECTS;

    /**
     * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected SpecGroupType tYPE;

    /**
     * The cached value of the '{@link #getVALUES() <em>VALUES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVALUES()
     * @generated
     * @ordered
     */
    protected SpecGroupValues vALUES;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SpecGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return RifPackage.Literals.SPEC_GROUP;
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
            RifPackage.SPEC_GROUP__LONGNAME,
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
            RifPackage.SPEC_GROUP__DESC,
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
            RifPackage.SPEC_GROUP__IDENTIFIER,
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
            RifPackage.SPEC_GROUP__LASTCHANGE,
            oldLASTCHANGE,
            lASTCHANGE ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecGroupRelationGroups getRELATIONGROUPS() {
        return rELATIONGROUPS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRELATIONGROUPS( SpecGroupRelationGroups newRELATIONGROUPS, NotificationChain msgs ) {
        SpecGroupRelationGroups oldRELATIONGROUPS = rELATIONGROUPS;
        rELATIONGROUPS = newRELATIONGROUPS;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.SPEC_GROUP__RELATIONGROUPS,
                oldRELATIONGROUPS,
                newRELATIONGROUPS );
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
    public void setRELATIONGROUPS( SpecGroupRelationGroups newRELATIONGROUPS ) {
        if( newRELATIONGROUPS != rELATIONGROUPS ) {
            NotificationChain msgs = null;
            if( rELATIONGROUPS != null ) msgs = ((InternalEObject)rELATIONGROUPS).eInverseRemove( this,
                                                                                                  EOPPOSITE_FEATURE_BASE
                                                                                                      - RifPackage.SPEC_GROUP__RELATIONGROUPS,
                                                                                                  null,
                                                                                                  msgs );
            if( newRELATIONGROUPS != null ) msgs = ((InternalEObject)newRELATIONGROUPS).eInverseAdd( this,
                                                                                                     EOPPOSITE_FEATURE_BASE
                                                                                                         - RifPackage.SPEC_GROUP__RELATIONGROUPS,
                                                                                                     null,
                                                                                                     msgs );
            msgs = basicSetRELATIONGROUPS( newRELATIONGROUPS, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.SPEC_GROUP__RELATIONGROUPS,
            newRELATIONGROUPS,
            newRELATIONGROUPS ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecGroupSpecObjects getSPECOBJECTS() {
        return sPECOBJECTS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSPECOBJECTS( SpecGroupSpecObjects newSPECOBJECTS, NotificationChain msgs ) {
        SpecGroupSpecObjects oldSPECOBJECTS = sPECOBJECTS;
        sPECOBJECTS = newSPECOBJECTS;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.SPEC_GROUP__SPECOBJECTS,
                oldSPECOBJECTS,
                newSPECOBJECTS );
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
    public void setSPECOBJECTS( SpecGroupSpecObjects newSPECOBJECTS ) {
        if( newSPECOBJECTS != sPECOBJECTS ) {
            NotificationChain msgs = null;
            if( sPECOBJECTS != null ) msgs = ((InternalEObject)sPECOBJECTS).eInverseRemove( this,
                                                                                            EOPPOSITE_FEATURE_BASE
                                                                                                - RifPackage.SPEC_GROUP__SPECOBJECTS,
                                                                                            null,
                                                                                            msgs );
            if( newSPECOBJECTS != null ) msgs = ((InternalEObject)newSPECOBJECTS).eInverseAdd( this,
                                                                                               EOPPOSITE_FEATURE_BASE
                                                                                                   - RifPackage.SPEC_GROUP__SPECOBJECTS,
                                                                                               null,
                                                                                               msgs );
            msgs = basicSetSPECOBJECTS( newSPECOBJECTS, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.SPEC_GROUP__SPECOBJECTS,
            newSPECOBJECTS,
            newSPECOBJECTS ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecGroupType getTYPE() {
        return tYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTYPE( SpecGroupType newTYPE, NotificationChain msgs ) {
        SpecGroupType oldTYPE = tYPE;
        tYPE = newTYPE;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.SPEC_GROUP__TYPE,
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
    public void setTYPE( SpecGroupType newTYPE ) {
        if( newTYPE != tYPE ) {
            NotificationChain msgs = null;
            if( tYPE != null ) msgs = ((InternalEObject)tYPE).eInverseRemove( this, EOPPOSITE_FEATURE_BASE
                - RifPackage.SPEC_GROUP__TYPE, null, msgs );
            if( newTYPE != null ) msgs = ((InternalEObject)newTYPE).eInverseAdd( this, EOPPOSITE_FEATURE_BASE
                - RifPackage.SPEC_GROUP__TYPE, null, msgs );
            msgs = basicSetTYPE( newTYPE, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.SPEC_GROUP__TYPE,
            newTYPE,
            newTYPE ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecGroupValues getVALUES() {
        return vALUES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVALUES( SpecGroupValues newVALUES, NotificationChain msgs ) {
        SpecGroupValues oldVALUES = vALUES;
        vALUES = newVALUES;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.SPEC_GROUP__VALUES,
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
    public void setVALUES( SpecGroupValues newVALUES ) {
        if( newVALUES != vALUES ) {
            NotificationChain msgs = null;
            if( vALUES != null ) msgs = ((InternalEObject)vALUES).eInverseRemove( this, EOPPOSITE_FEATURE_BASE
                - RifPackage.SPEC_GROUP__VALUES, null, msgs );
            if( newVALUES != null ) msgs = ((InternalEObject)newVALUES).eInverseAdd( this, EOPPOSITE_FEATURE_BASE
                - RifPackage.SPEC_GROUP__VALUES, null, msgs );
            msgs = basicSetVALUES( newVALUES, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.SPEC_GROUP__VALUES,
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
        case RifPackage.SPEC_GROUP__RELATIONGROUPS:
            return basicSetRELATIONGROUPS( null, msgs );
        case RifPackage.SPEC_GROUP__SPECOBJECTS:
            return basicSetSPECOBJECTS( null, msgs );
        case RifPackage.SPEC_GROUP__TYPE:
            return basicSetTYPE( null, msgs );
        case RifPackage.SPEC_GROUP__VALUES:
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
        case RifPackage.SPEC_GROUP__LONGNAME:
            return getLONGNAME();
        case RifPackage.SPEC_GROUP__DESC:
            return getDESC();
        case RifPackage.SPEC_GROUP__IDENTIFIER:
            return getIDENTIFIER();
        case RifPackage.SPEC_GROUP__LASTCHANGE:
            return getLASTCHANGE();
        case RifPackage.SPEC_GROUP__RELATIONGROUPS:
            return getRELATIONGROUPS();
        case RifPackage.SPEC_GROUP__SPECOBJECTS:
            return getSPECOBJECTS();
        case RifPackage.SPEC_GROUP__TYPE:
            return getTYPE();
        case RifPackage.SPEC_GROUP__VALUES:
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
        case RifPackage.SPEC_GROUP__LONGNAME:
            setLONGNAME( (String)newValue );
            return;
        case RifPackage.SPEC_GROUP__DESC:
            setDESC( (String)newValue );
            return;
        case RifPackage.SPEC_GROUP__IDENTIFIER:
            setIDENTIFIER( (String)newValue );
            return;
        case RifPackage.SPEC_GROUP__LASTCHANGE:
            setLASTCHANGE( (String)newValue );
            return;
        case RifPackage.SPEC_GROUP__RELATIONGROUPS:
            setRELATIONGROUPS( (SpecGroupRelationGroups)newValue );
            return;
        case RifPackage.SPEC_GROUP__SPECOBJECTS:
            setSPECOBJECTS( (SpecGroupSpecObjects)newValue );
            return;
        case RifPackage.SPEC_GROUP__TYPE:
            setTYPE( (SpecGroupType)newValue );
            return;
        case RifPackage.SPEC_GROUP__VALUES:
            setVALUES( (SpecGroupValues)newValue );
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
        case RifPackage.SPEC_GROUP__LONGNAME:
            setLONGNAME( LONGNAME_EDEFAULT );
            return;
        case RifPackage.SPEC_GROUP__DESC:
            setDESC( DESC_EDEFAULT );
            return;
        case RifPackage.SPEC_GROUP__IDENTIFIER:
            setIDENTIFIER( IDENTIFIER_EDEFAULT );
            return;
        case RifPackage.SPEC_GROUP__LASTCHANGE:
            setLASTCHANGE( LASTCHANGE_EDEFAULT );
            return;
        case RifPackage.SPEC_GROUP__RELATIONGROUPS:
            setRELATIONGROUPS( (SpecGroupRelationGroups)null );
            return;
        case RifPackage.SPEC_GROUP__SPECOBJECTS:
            setSPECOBJECTS( (SpecGroupSpecObjects)null );
            return;
        case RifPackage.SPEC_GROUP__TYPE:
            setTYPE( (SpecGroupType)null );
            return;
        case RifPackage.SPEC_GROUP__VALUES:
            setVALUES( (SpecGroupValues)null );
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
        case RifPackage.SPEC_GROUP__LONGNAME:
            return LONGNAME_EDEFAULT == null ? lONGNAME != null : !LONGNAME_EDEFAULT.equals( lONGNAME );
        case RifPackage.SPEC_GROUP__DESC:
            return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT.equals( dESC );
        case RifPackage.SPEC_GROUP__IDENTIFIER:
            return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals( iDENTIFIER );
        case RifPackage.SPEC_GROUP__LASTCHANGE:
            return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null : !LASTCHANGE_EDEFAULT.equals( lASTCHANGE );
        case RifPackage.SPEC_GROUP__RELATIONGROUPS:
            return rELATIONGROUPS != null;
        case RifPackage.SPEC_GROUP__SPECOBJECTS:
            return sPECOBJECTS != null;
        case RifPackage.SPEC_GROUP__TYPE:
            return tYPE != null;
        case RifPackage.SPEC_GROUP__VALUES:
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

} //SpecGroupImpl
