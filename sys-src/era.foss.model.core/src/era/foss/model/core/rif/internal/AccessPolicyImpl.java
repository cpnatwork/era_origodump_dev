/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.ACCESSPOLICYACCESSMODEENUM;
import era.foss.model.core.rif.AccessPolicy;
import era.foss.model.core.rif.AccessPolicyRelationGroups;
import era.foss.model.core.rif.AccessPolicySpecGroups;
import era.foss.model.core.rif.AccessPolicySpecHierarchyRoots;
import era.foss.model.core.rif.AccessPolicySpecObjects;
import era.foss.model.core.rif.AccessPolicySpecRelations;
import era.foss.model.core.rif.AccessPolicySpecTypes;
import era.foss.model.core.rif.AttributeDefinitions;
import era.foss.model.core.rif.AttributeValues;
import era.foss.model.core.rif.DatatypeDefinitions;
import era.foss.model.core.rif.RifPackage;
import era.foss.model.core.rif.SpecHierarchies;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.AccessPolicyImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AccessPolicyImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AccessPolicyImpl#getACCESSMODE <em>ACCESSMODE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AccessPolicyImpl#getATTRIBUTEDEFINITIONS <em>ATTRIBUTEDEFINITIONS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AccessPolicyImpl#getATTRIBUTEVALUES <em>ATTRIBUTEVALUES</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AccessPolicyImpl#getDATATYPEDEFINITIONS <em>DATATYPEDEFINITIONS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AccessPolicyImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AccessPolicyImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AccessPolicyImpl#getRELATIONGROUPS <em>RELATIONGROUPS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AccessPolicyImpl#getSPECGROUPS <em>SPECGROUPS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AccessPolicyImpl#getSPECHIERARCHIES <em>SPECHIERARCHIES</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AccessPolicyImpl#getSPECHIERARCHYROOTS <em>SPECHIERARCHYROOTS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AccessPolicyImpl#getSPECOBJECTS <em>SPECOBJECTS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AccessPolicyImpl#getSPECRELATIONS <em>SPECRELATIONS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AccessPolicyImpl#getSPECTYPES <em>SPECTYPES</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccessPolicyImpl extends EObjectImpl implements AccessPolicy {
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
     * The default value of the '{@link #getACCESSMODE() <em>ACCESSMODE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getACCESSMODE()
     * @generated
     * @ordered
     */
    protected static final ACCESSPOLICYACCESSMODEENUM ACCESSMODE_EDEFAULT = ACCESSPOLICYACCESSMODEENUM.EDIT_LITERAL;

    /**
     * The cached value of the '{@link #getACCESSMODE() <em>ACCESSMODE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getACCESSMODE()
     * @generated
     * @ordered
     */
    protected ACCESSPOLICYACCESSMODEENUM aCCESSMODE = ACCESSMODE_EDEFAULT;

    /**
     * The flag representing whether the ACCESSMODE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected static final int ACCESSMODE_ESETFLAG = 1 << 0;

    /**
     * The cached value of the '{@link #getATTRIBUTEDEFINITIONS() <em>ATTRIBUTEDEFINITIONS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getATTRIBUTEDEFINITIONS()
     * @generated
     * @ordered
     */
    protected AttributeDefinitions aTTRIBUTEDEFINITIONS;

    /**
     * The cached value of the '{@link #getATTRIBUTEVALUES() <em>ATTRIBUTEVALUES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getATTRIBUTEVALUES()
     * @generated
     * @ordered
     */
    protected AttributeValues aTTRIBUTEVALUES;

    /**
     * The cached value of the '{@link #getDATATYPEDEFINITIONS() <em>DATATYPEDEFINITIONS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDATATYPEDEFINITIONS()
     * @generated
     * @ordered
     */
    protected DatatypeDefinitions dATATYPEDEFINITIONS;

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
    protected AccessPolicyRelationGroups rELATIONGROUPS;

    /**
     * The cached value of the '{@link #getSPECGROUPS() <em>SPECGROUPS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSPECGROUPS()
     * @generated
     * @ordered
     */
    protected AccessPolicySpecGroups sPECGROUPS;

    /**
     * The cached value of the '{@link #getSPECHIERARCHIES() <em>SPECHIERARCHIES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSPECHIERARCHIES()
     * @generated
     * @ordered
     */
    protected SpecHierarchies sPECHIERARCHIES;

    /**
     * The cached value of the '{@link #getSPECHIERARCHYROOTS() <em>SPECHIERARCHYROOTS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSPECHIERARCHYROOTS()
     * @generated
     * @ordered
     */
    protected AccessPolicySpecHierarchyRoots sPECHIERARCHYROOTS;

    /**
     * The cached value of the '{@link #getSPECOBJECTS() <em>SPECOBJECTS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSPECOBJECTS()
     * @generated
     * @ordered
     */
    protected AccessPolicySpecObjects sPECOBJECTS;

    /**
     * The cached value of the '{@link #getSPECRELATIONS() <em>SPECRELATIONS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSPECRELATIONS()
     * @generated
     * @ordered
     */
    protected AccessPolicySpecRelations sPECRELATIONS;

    /**
     * The cached value of the '{@link #getSPECTYPES() <em>SPECTYPES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSPECTYPES()
     * @generated
     * @ordered
     */
    protected AccessPolicySpecTypes sPECTYPES;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AccessPolicyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return RifPackage.Literals.ACCESS_POLICY;
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
            RifPackage.ACCESS_POLICY__LONGNAME,
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
            RifPackage.ACCESS_POLICY__DESC,
            oldDESC,
            dESC ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ACCESSPOLICYACCESSMODEENUM getACCESSMODE() {
        return aCCESSMODE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setACCESSMODE( ACCESSPOLICYACCESSMODEENUM newACCESSMODE ) {
        ACCESSPOLICYACCESSMODEENUM oldACCESSMODE = aCCESSMODE;
        aCCESSMODE = newACCESSMODE == null ? ACCESSMODE_EDEFAULT : newACCESSMODE;
        boolean oldACCESSMODEESet = (booleans & ACCESSMODE_ESETFLAG) != 0;
        booleans |= ACCESSMODE_ESETFLAG;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ACCESS_POLICY__ACCESSMODE,
            oldACCESSMODE,
            aCCESSMODE,
            !oldACCESSMODEESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetACCESSMODE() {
        ACCESSPOLICYACCESSMODEENUM oldACCESSMODE = aCCESSMODE;
        boolean oldACCESSMODEESet = (booleans & ACCESSMODE_ESETFLAG) != 0;
        aCCESSMODE = ACCESSMODE_EDEFAULT;
        booleans &= ~ACCESSMODE_ESETFLAG;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.UNSET,
            RifPackage.ACCESS_POLICY__ACCESSMODE,
            oldACCESSMODE,
            ACCESSMODE_EDEFAULT,
            oldACCESSMODEESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetACCESSMODE() {
        return (booleans & ACCESSMODE_ESETFLAG) != 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeDefinitions getATTRIBUTEDEFINITIONS() {
        return aTTRIBUTEDEFINITIONS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetATTRIBUTEDEFINITIONS( AttributeDefinitions newATTRIBUTEDEFINITIONS,
                                                           NotificationChain msgs ) {
        AttributeDefinitions oldATTRIBUTEDEFINITIONS = aTTRIBUTEDEFINITIONS;
        aTTRIBUTEDEFINITIONS = newATTRIBUTEDEFINITIONS;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.ACCESS_POLICY__ATTRIBUTEDEFINITIONS,
                oldATTRIBUTEDEFINITIONS,
                newATTRIBUTEDEFINITIONS );
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
    public void setATTRIBUTEDEFINITIONS( AttributeDefinitions newATTRIBUTEDEFINITIONS ) {
        if( newATTRIBUTEDEFINITIONS != aTTRIBUTEDEFINITIONS ) {
            NotificationChain msgs = null;
            if( aTTRIBUTEDEFINITIONS != null ) msgs = ((InternalEObject)aTTRIBUTEDEFINITIONS).eInverseRemove( this,
                                                                                                              EOPPOSITE_FEATURE_BASE
                                                                                                                  - RifPackage.ACCESS_POLICY__ATTRIBUTEDEFINITIONS,
                                                                                                              null,
                                                                                                              msgs );
            if( newATTRIBUTEDEFINITIONS != null ) msgs = ((InternalEObject)newATTRIBUTEDEFINITIONS).eInverseAdd( this,
                                                                                                                 EOPPOSITE_FEATURE_BASE
                                                                                                                     - RifPackage.ACCESS_POLICY__ATTRIBUTEDEFINITIONS,
                                                                                                                 null,
                                                                                                                 msgs );
            msgs = basicSetATTRIBUTEDEFINITIONS( newATTRIBUTEDEFINITIONS, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ACCESS_POLICY__ATTRIBUTEDEFINITIONS,
            newATTRIBUTEDEFINITIONS,
            newATTRIBUTEDEFINITIONS ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValues getATTRIBUTEVALUES() {
        return aTTRIBUTEVALUES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetATTRIBUTEVALUES( AttributeValues newATTRIBUTEVALUES, NotificationChain msgs ) {
        AttributeValues oldATTRIBUTEVALUES = aTTRIBUTEVALUES;
        aTTRIBUTEVALUES = newATTRIBUTEVALUES;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.ACCESS_POLICY__ATTRIBUTEVALUES,
                oldATTRIBUTEVALUES,
                newATTRIBUTEVALUES );
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
    public void setATTRIBUTEVALUES( AttributeValues newATTRIBUTEVALUES ) {
        if( newATTRIBUTEVALUES != aTTRIBUTEVALUES ) {
            NotificationChain msgs = null;
            if( aTTRIBUTEVALUES != null ) msgs = ((InternalEObject)aTTRIBUTEVALUES).eInverseRemove( this,
                                                                                                    EOPPOSITE_FEATURE_BASE
                                                                                                        - RifPackage.ACCESS_POLICY__ATTRIBUTEVALUES,
                                                                                                    null,
                                                                                                    msgs );
            if( newATTRIBUTEVALUES != null ) msgs = ((InternalEObject)newATTRIBUTEVALUES).eInverseAdd( this,
                                                                                                       EOPPOSITE_FEATURE_BASE
                                                                                                           - RifPackage.ACCESS_POLICY__ATTRIBUTEVALUES,
                                                                                                       null,
                                                                                                       msgs );
            msgs = basicSetATTRIBUTEVALUES( newATTRIBUTEVALUES, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ACCESS_POLICY__ATTRIBUTEVALUES,
            newATTRIBUTEVALUES,
            newATTRIBUTEVALUES ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeDefinitions getDATATYPEDEFINITIONS() {
        return dATATYPEDEFINITIONS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDATATYPEDEFINITIONS( DatatypeDefinitions newDATATYPEDEFINITIONS,
                                                          NotificationChain msgs ) {
        DatatypeDefinitions oldDATATYPEDEFINITIONS = dATATYPEDEFINITIONS;
        dATATYPEDEFINITIONS = newDATATYPEDEFINITIONS;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.ACCESS_POLICY__DATATYPEDEFINITIONS,
                oldDATATYPEDEFINITIONS,
                newDATATYPEDEFINITIONS );
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
    public void setDATATYPEDEFINITIONS( DatatypeDefinitions newDATATYPEDEFINITIONS ) {
        if( newDATATYPEDEFINITIONS != dATATYPEDEFINITIONS ) {
            NotificationChain msgs = null;
            if( dATATYPEDEFINITIONS != null ) msgs = ((InternalEObject)dATATYPEDEFINITIONS).eInverseRemove( this,
                                                                                                            EOPPOSITE_FEATURE_BASE
                                                                                                                - RifPackage.ACCESS_POLICY__DATATYPEDEFINITIONS,
                                                                                                            null,
                                                                                                            msgs );
            if( newDATATYPEDEFINITIONS != null ) msgs = ((InternalEObject)newDATATYPEDEFINITIONS).eInverseAdd( this,
                                                                                                               EOPPOSITE_FEATURE_BASE
                                                                                                                   - RifPackage.ACCESS_POLICY__DATATYPEDEFINITIONS,
                                                                                                               null,
                                                                                                               msgs );
            msgs = basicSetDATATYPEDEFINITIONS( newDATATYPEDEFINITIONS, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ACCESS_POLICY__DATATYPEDEFINITIONS,
            newDATATYPEDEFINITIONS,
            newDATATYPEDEFINITIONS ) );
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
            RifPackage.ACCESS_POLICY__IDENTIFIER,
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
            RifPackage.ACCESS_POLICY__LASTCHANGE,
            oldLASTCHANGE,
            lASTCHANGE ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AccessPolicyRelationGroups getRELATIONGROUPS() {
        return rELATIONGROUPS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRELATIONGROUPS( AccessPolicyRelationGroups newRELATIONGROUPS,
                                                     NotificationChain msgs ) {
        AccessPolicyRelationGroups oldRELATIONGROUPS = rELATIONGROUPS;
        rELATIONGROUPS = newRELATIONGROUPS;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.ACCESS_POLICY__RELATIONGROUPS,
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
    public void setRELATIONGROUPS( AccessPolicyRelationGroups newRELATIONGROUPS ) {
        if( newRELATIONGROUPS != rELATIONGROUPS ) {
            NotificationChain msgs = null;
            if( rELATIONGROUPS != null ) msgs = ((InternalEObject)rELATIONGROUPS).eInverseRemove( this,
                                                                                                  EOPPOSITE_FEATURE_BASE
                                                                                                      - RifPackage.ACCESS_POLICY__RELATIONGROUPS,
                                                                                                  null,
                                                                                                  msgs );
            if( newRELATIONGROUPS != null ) msgs = ((InternalEObject)newRELATIONGROUPS).eInverseAdd( this,
                                                                                                     EOPPOSITE_FEATURE_BASE
                                                                                                         - RifPackage.ACCESS_POLICY__RELATIONGROUPS,
                                                                                                     null,
                                                                                                     msgs );
            msgs = basicSetRELATIONGROUPS( newRELATIONGROUPS, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ACCESS_POLICY__RELATIONGROUPS,
            newRELATIONGROUPS,
            newRELATIONGROUPS ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AccessPolicySpecGroups getSPECGROUPS() {
        return sPECGROUPS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSPECGROUPS( AccessPolicySpecGroups newSPECGROUPS, NotificationChain msgs ) {
        AccessPolicySpecGroups oldSPECGROUPS = sPECGROUPS;
        sPECGROUPS = newSPECGROUPS;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.ACCESS_POLICY__SPECGROUPS,
                oldSPECGROUPS,
                newSPECGROUPS );
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
    public void setSPECGROUPS( AccessPolicySpecGroups newSPECGROUPS ) {
        if( newSPECGROUPS != sPECGROUPS ) {
            NotificationChain msgs = null;
            if( sPECGROUPS != null ) msgs = ((InternalEObject)sPECGROUPS).eInverseRemove( this,
                                                                                          EOPPOSITE_FEATURE_BASE
                                                                                              - RifPackage.ACCESS_POLICY__SPECGROUPS,
                                                                                          null,
                                                                                          msgs );
            if( newSPECGROUPS != null ) msgs = ((InternalEObject)newSPECGROUPS).eInverseAdd( this,
                                                                                             EOPPOSITE_FEATURE_BASE
                                                                                                 - RifPackage.ACCESS_POLICY__SPECGROUPS,
                                                                                             null,
                                                                                             msgs );
            msgs = basicSetSPECGROUPS( newSPECGROUPS, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ACCESS_POLICY__SPECGROUPS,
            newSPECGROUPS,
            newSPECGROUPS ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecHierarchies getSPECHIERARCHIES() {
        return sPECHIERARCHIES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSPECHIERARCHIES( SpecHierarchies newSPECHIERARCHIES, NotificationChain msgs ) {
        SpecHierarchies oldSPECHIERARCHIES = sPECHIERARCHIES;
        sPECHIERARCHIES = newSPECHIERARCHIES;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.ACCESS_POLICY__SPECHIERARCHIES,
                oldSPECHIERARCHIES,
                newSPECHIERARCHIES );
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
    public void setSPECHIERARCHIES( SpecHierarchies newSPECHIERARCHIES ) {
        if( newSPECHIERARCHIES != sPECHIERARCHIES ) {
            NotificationChain msgs = null;
            if( sPECHIERARCHIES != null ) msgs = ((InternalEObject)sPECHIERARCHIES).eInverseRemove( this,
                                                                                                    EOPPOSITE_FEATURE_BASE
                                                                                                        - RifPackage.ACCESS_POLICY__SPECHIERARCHIES,
                                                                                                    null,
                                                                                                    msgs );
            if( newSPECHIERARCHIES != null ) msgs = ((InternalEObject)newSPECHIERARCHIES).eInverseAdd( this,
                                                                                                       EOPPOSITE_FEATURE_BASE
                                                                                                           - RifPackage.ACCESS_POLICY__SPECHIERARCHIES,
                                                                                                       null,
                                                                                                       msgs );
            msgs = basicSetSPECHIERARCHIES( newSPECHIERARCHIES, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ACCESS_POLICY__SPECHIERARCHIES,
            newSPECHIERARCHIES,
            newSPECHIERARCHIES ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AccessPolicySpecHierarchyRoots getSPECHIERARCHYROOTS() {
        return sPECHIERARCHYROOTS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSPECHIERARCHYROOTS( AccessPolicySpecHierarchyRoots newSPECHIERARCHYROOTS,
                                                         NotificationChain msgs ) {
        AccessPolicySpecHierarchyRoots oldSPECHIERARCHYROOTS = sPECHIERARCHYROOTS;
        sPECHIERARCHYROOTS = newSPECHIERARCHYROOTS;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.ACCESS_POLICY__SPECHIERARCHYROOTS,
                oldSPECHIERARCHYROOTS,
                newSPECHIERARCHYROOTS );
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
    public void setSPECHIERARCHYROOTS( AccessPolicySpecHierarchyRoots newSPECHIERARCHYROOTS ) {
        if( newSPECHIERARCHYROOTS != sPECHIERARCHYROOTS ) {
            NotificationChain msgs = null;
            if( sPECHIERARCHYROOTS != null ) msgs = ((InternalEObject)sPECHIERARCHYROOTS).eInverseRemove( this,
                                                                                                          EOPPOSITE_FEATURE_BASE
                                                                                                              - RifPackage.ACCESS_POLICY__SPECHIERARCHYROOTS,
                                                                                                          null,
                                                                                                          msgs );
            if( newSPECHIERARCHYROOTS != null ) msgs = ((InternalEObject)newSPECHIERARCHYROOTS).eInverseAdd( this,
                                                                                                             EOPPOSITE_FEATURE_BASE
                                                                                                                 - RifPackage.ACCESS_POLICY__SPECHIERARCHYROOTS,
                                                                                                             null,
                                                                                                             msgs );
            msgs = basicSetSPECHIERARCHYROOTS( newSPECHIERARCHYROOTS, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ACCESS_POLICY__SPECHIERARCHYROOTS,
            newSPECHIERARCHYROOTS,
            newSPECHIERARCHYROOTS ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AccessPolicySpecObjects getSPECOBJECTS() {
        return sPECOBJECTS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSPECOBJECTS( AccessPolicySpecObjects newSPECOBJECTS, NotificationChain msgs ) {
        AccessPolicySpecObjects oldSPECOBJECTS = sPECOBJECTS;
        sPECOBJECTS = newSPECOBJECTS;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.ACCESS_POLICY__SPECOBJECTS,
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
    public void setSPECOBJECTS( AccessPolicySpecObjects newSPECOBJECTS ) {
        if( newSPECOBJECTS != sPECOBJECTS ) {
            NotificationChain msgs = null;
            if( sPECOBJECTS != null ) msgs = ((InternalEObject)sPECOBJECTS).eInverseRemove( this,
                                                                                            EOPPOSITE_FEATURE_BASE
                                                                                                - RifPackage.ACCESS_POLICY__SPECOBJECTS,
                                                                                            null,
                                                                                            msgs );
            if( newSPECOBJECTS != null ) msgs = ((InternalEObject)newSPECOBJECTS).eInverseAdd( this,
                                                                                               EOPPOSITE_FEATURE_BASE
                                                                                                   - RifPackage.ACCESS_POLICY__SPECOBJECTS,
                                                                                               null,
                                                                                               msgs );
            msgs = basicSetSPECOBJECTS( newSPECOBJECTS, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ACCESS_POLICY__SPECOBJECTS,
            newSPECOBJECTS,
            newSPECOBJECTS ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AccessPolicySpecRelations getSPECRELATIONS() {
        return sPECRELATIONS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSPECRELATIONS( AccessPolicySpecRelations newSPECRELATIONS, NotificationChain msgs ) {
        AccessPolicySpecRelations oldSPECRELATIONS = sPECRELATIONS;
        sPECRELATIONS = newSPECRELATIONS;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.ACCESS_POLICY__SPECRELATIONS,
                oldSPECRELATIONS,
                newSPECRELATIONS );
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
    public void setSPECRELATIONS( AccessPolicySpecRelations newSPECRELATIONS ) {
        if( newSPECRELATIONS != sPECRELATIONS ) {
            NotificationChain msgs = null;
            if( sPECRELATIONS != null ) msgs = ((InternalEObject)sPECRELATIONS).eInverseRemove( this,
                                                                                                EOPPOSITE_FEATURE_BASE
                                                                                                    - RifPackage.ACCESS_POLICY__SPECRELATIONS,
                                                                                                null,
                                                                                                msgs );
            if( newSPECRELATIONS != null ) msgs = ((InternalEObject)newSPECRELATIONS).eInverseAdd( this,
                                                                                                   EOPPOSITE_FEATURE_BASE
                                                                                                       - RifPackage.ACCESS_POLICY__SPECRELATIONS,
                                                                                                   null,
                                                                                                   msgs );
            msgs = basicSetSPECRELATIONS( newSPECRELATIONS, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ACCESS_POLICY__SPECRELATIONS,
            newSPECRELATIONS,
            newSPECRELATIONS ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AccessPolicySpecTypes getSPECTYPES() {
        return sPECTYPES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSPECTYPES( AccessPolicySpecTypes newSPECTYPES, NotificationChain msgs ) {
        AccessPolicySpecTypes oldSPECTYPES = sPECTYPES;
        sPECTYPES = newSPECTYPES;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.ACCESS_POLICY__SPECTYPES,
                oldSPECTYPES,
                newSPECTYPES );
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
    public void setSPECTYPES( AccessPolicySpecTypes newSPECTYPES ) {
        if( newSPECTYPES != sPECTYPES ) {
            NotificationChain msgs = null;
            if( sPECTYPES != null ) msgs = ((InternalEObject)sPECTYPES).eInverseRemove( this, EOPPOSITE_FEATURE_BASE
                - RifPackage.ACCESS_POLICY__SPECTYPES, null, msgs );
            if( newSPECTYPES != null ) msgs = ((InternalEObject)newSPECTYPES).eInverseAdd( this,
                                                                                           EOPPOSITE_FEATURE_BASE
                                                                                               - RifPackage.ACCESS_POLICY__SPECTYPES,
                                                                                           null,
                                                                                           msgs );
            msgs = basicSetSPECTYPES( newSPECTYPES, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ACCESS_POLICY__SPECTYPES,
            newSPECTYPES,
            newSPECTYPES ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
        case RifPackage.ACCESS_POLICY__ATTRIBUTEDEFINITIONS:
            return basicSetATTRIBUTEDEFINITIONS( null, msgs );
        case RifPackage.ACCESS_POLICY__ATTRIBUTEVALUES:
            return basicSetATTRIBUTEVALUES( null, msgs );
        case RifPackage.ACCESS_POLICY__DATATYPEDEFINITIONS:
            return basicSetDATATYPEDEFINITIONS( null, msgs );
        case RifPackage.ACCESS_POLICY__RELATIONGROUPS:
            return basicSetRELATIONGROUPS( null, msgs );
        case RifPackage.ACCESS_POLICY__SPECGROUPS:
            return basicSetSPECGROUPS( null, msgs );
        case RifPackage.ACCESS_POLICY__SPECHIERARCHIES:
            return basicSetSPECHIERARCHIES( null, msgs );
        case RifPackage.ACCESS_POLICY__SPECHIERARCHYROOTS:
            return basicSetSPECHIERARCHYROOTS( null, msgs );
        case RifPackage.ACCESS_POLICY__SPECOBJECTS:
            return basicSetSPECOBJECTS( null, msgs );
        case RifPackage.ACCESS_POLICY__SPECRELATIONS:
            return basicSetSPECRELATIONS( null, msgs );
        case RifPackage.ACCESS_POLICY__SPECTYPES:
            return basicSetSPECTYPES( null, msgs );
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
        case RifPackage.ACCESS_POLICY__LONGNAME:
            return getLONGNAME();
        case RifPackage.ACCESS_POLICY__DESC:
            return getDESC();
        case RifPackage.ACCESS_POLICY__ACCESSMODE:
            return getACCESSMODE();
        case RifPackage.ACCESS_POLICY__ATTRIBUTEDEFINITIONS:
            return getATTRIBUTEDEFINITIONS();
        case RifPackage.ACCESS_POLICY__ATTRIBUTEVALUES:
            return getATTRIBUTEVALUES();
        case RifPackage.ACCESS_POLICY__DATATYPEDEFINITIONS:
            return getDATATYPEDEFINITIONS();
        case RifPackage.ACCESS_POLICY__IDENTIFIER:
            return getIDENTIFIER();
        case RifPackage.ACCESS_POLICY__LASTCHANGE:
            return getLASTCHANGE();
        case RifPackage.ACCESS_POLICY__RELATIONGROUPS:
            return getRELATIONGROUPS();
        case RifPackage.ACCESS_POLICY__SPECGROUPS:
            return getSPECGROUPS();
        case RifPackage.ACCESS_POLICY__SPECHIERARCHIES:
            return getSPECHIERARCHIES();
        case RifPackage.ACCESS_POLICY__SPECHIERARCHYROOTS:
            return getSPECHIERARCHYROOTS();
        case RifPackage.ACCESS_POLICY__SPECOBJECTS:
            return getSPECOBJECTS();
        case RifPackage.ACCESS_POLICY__SPECRELATIONS:
            return getSPECRELATIONS();
        case RifPackage.ACCESS_POLICY__SPECTYPES:
            return getSPECTYPES();
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
        case RifPackage.ACCESS_POLICY__LONGNAME:
            setLONGNAME( (String)newValue );
            return;
        case RifPackage.ACCESS_POLICY__DESC:
            setDESC( (String)newValue );
            return;
        case RifPackage.ACCESS_POLICY__ACCESSMODE:
            setACCESSMODE( (ACCESSPOLICYACCESSMODEENUM)newValue );
            return;
        case RifPackage.ACCESS_POLICY__ATTRIBUTEDEFINITIONS:
            setATTRIBUTEDEFINITIONS( (AttributeDefinitions)newValue );
            return;
        case RifPackage.ACCESS_POLICY__ATTRIBUTEVALUES:
            setATTRIBUTEVALUES( (AttributeValues)newValue );
            return;
        case RifPackage.ACCESS_POLICY__DATATYPEDEFINITIONS:
            setDATATYPEDEFINITIONS( (DatatypeDefinitions)newValue );
            return;
        case RifPackage.ACCESS_POLICY__IDENTIFIER:
            setIDENTIFIER( (String)newValue );
            return;
        case RifPackage.ACCESS_POLICY__LASTCHANGE:
            setLASTCHANGE( (String)newValue );
            return;
        case RifPackage.ACCESS_POLICY__RELATIONGROUPS:
            setRELATIONGROUPS( (AccessPolicyRelationGroups)newValue );
            return;
        case RifPackage.ACCESS_POLICY__SPECGROUPS:
            setSPECGROUPS( (AccessPolicySpecGroups)newValue );
            return;
        case RifPackage.ACCESS_POLICY__SPECHIERARCHIES:
            setSPECHIERARCHIES( (SpecHierarchies)newValue );
            return;
        case RifPackage.ACCESS_POLICY__SPECHIERARCHYROOTS:
            setSPECHIERARCHYROOTS( (AccessPolicySpecHierarchyRoots)newValue );
            return;
        case RifPackage.ACCESS_POLICY__SPECOBJECTS:
            setSPECOBJECTS( (AccessPolicySpecObjects)newValue );
            return;
        case RifPackage.ACCESS_POLICY__SPECRELATIONS:
            setSPECRELATIONS( (AccessPolicySpecRelations)newValue );
            return;
        case RifPackage.ACCESS_POLICY__SPECTYPES:
            setSPECTYPES( (AccessPolicySpecTypes)newValue );
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
        case RifPackage.ACCESS_POLICY__LONGNAME:
            setLONGNAME( LONGNAME_EDEFAULT );
            return;
        case RifPackage.ACCESS_POLICY__DESC:
            setDESC( DESC_EDEFAULT );
            return;
        case RifPackage.ACCESS_POLICY__ACCESSMODE:
            unsetACCESSMODE();
            return;
        case RifPackage.ACCESS_POLICY__ATTRIBUTEDEFINITIONS:
            setATTRIBUTEDEFINITIONS( (AttributeDefinitions)null );
            return;
        case RifPackage.ACCESS_POLICY__ATTRIBUTEVALUES:
            setATTRIBUTEVALUES( (AttributeValues)null );
            return;
        case RifPackage.ACCESS_POLICY__DATATYPEDEFINITIONS:
            setDATATYPEDEFINITIONS( (DatatypeDefinitions)null );
            return;
        case RifPackage.ACCESS_POLICY__IDENTIFIER:
            setIDENTIFIER( IDENTIFIER_EDEFAULT );
            return;
        case RifPackage.ACCESS_POLICY__LASTCHANGE:
            setLASTCHANGE( LASTCHANGE_EDEFAULT );
            return;
        case RifPackage.ACCESS_POLICY__RELATIONGROUPS:
            setRELATIONGROUPS( (AccessPolicyRelationGroups)null );
            return;
        case RifPackage.ACCESS_POLICY__SPECGROUPS:
            setSPECGROUPS( (AccessPolicySpecGroups)null );
            return;
        case RifPackage.ACCESS_POLICY__SPECHIERARCHIES:
            setSPECHIERARCHIES( (SpecHierarchies)null );
            return;
        case RifPackage.ACCESS_POLICY__SPECHIERARCHYROOTS:
            setSPECHIERARCHYROOTS( (AccessPolicySpecHierarchyRoots)null );
            return;
        case RifPackage.ACCESS_POLICY__SPECOBJECTS:
            setSPECOBJECTS( (AccessPolicySpecObjects)null );
            return;
        case RifPackage.ACCESS_POLICY__SPECRELATIONS:
            setSPECRELATIONS( (AccessPolicySpecRelations)null );
            return;
        case RifPackage.ACCESS_POLICY__SPECTYPES:
            setSPECTYPES( (AccessPolicySpecTypes)null );
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
        case RifPackage.ACCESS_POLICY__LONGNAME:
            return LONGNAME_EDEFAULT == null ? lONGNAME != null : !LONGNAME_EDEFAULT.equals( lONGNAME );
        case RifPackage.ACCESS_POLICY__DESC:
            return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT.equals( dESC );
        case RifPackage.ACCESS_POLICY__ACCESSMODE:
            return isSetACCESSMODE();
        case RifPackage.ACCESS_POLICY__ATTRIBUTEDEFINITIONS:
            return aTTRIBUTEDEFINITIONS != null;
        case RifPackage.ACCESS_POLICY__ATTRIBUTEVALUES:
            return aTTRIBUTEVALUES != null;
        case RifPackage.ACCESS_POLICY__DATATYPEDEFINITIONS:
            return dATATYPEDEFINITIONS != null;
        case RifPackage.ACCESS_POLICY__IDENTIFIER:
            return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals( iDENTIFIER );
        case RifPackage.ACCESS_POLICY__LASTCHANGE:
            return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null : !LASTCHANGE_EDEFAULT.equals( lASTCHANGE );
        case RifPackage.ACCESS_POLICY__RELATIONGROUPS:
            return rELATIONGROUPS != null;
        case RifPackage.ACCESS_POLICY__SPECGROUPS:
            return sPECGROUPS != null;
        case RifPackage.ACCESS_POLICY__SPECHIERARCHIES:
            return sPECHIERARCHIES != null;
        case RifPackage.ACCESS_POLICY__SPECHIERARCHYROOTS:
            return sPECHIERARCHYROOTS != null;
        case RifPackage.ACCESS_POLICY__SPECOBJECTS:
            return sPECOBJECTS != null;
        case RifPackage.ACCESS_POLICY__SPECRELATIONS:
            return sPECRELATIONS != null;
        case RifPackage.ACCESS_POLICY__SPECTYPES:
            return sPECTYPES != null;
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
        result.append( ", aCCESSMODE: " );
        if( (booleans & ACCESSMODE_ESETFLAG) != 0 ) result.append( aCCESSMODE );
        else result.append( "<unset>" );
        result.append( ", iDENTIFIER: " );
        result.append( iDENTIFIER );
        result.append( ", lASTCHANGE: " );
        result.append( lASTCHANGE );
        result.append( ')' );
        return result.toString();
    }

} //AccessPolicyImpl
