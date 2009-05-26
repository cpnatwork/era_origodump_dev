/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AccessPolicies;
import era.foss.model.core.rif.Datatypes;
import era.foss.model.core.rif.Rif;
import era.foss.model.core.rif.RifPackage;
import era.foss.model.core.rif.RifSpecGroups;
import era.foss.model.core.rif.RifSpecHierarchyRoots;
import era.foss.model.core.rif.RifSpecObjects;
import era.foss.model.core.rif.RifSpecRelations;
import era.foss.model.core.rif.RifSpecTypes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rif</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.RifImpl#getSPECHIERARCHYROOTS <em>SPECHIERARCHYROOTS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.RifImpl#getACCESSPOLICIES <em>ACCESSPOLICIES</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.RifImpl#getAUTHOR <em>AUTHOR</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.RifImpl#getCOMMENT <em>COMMENT</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.RifImpl#getCOUNTRYCODE <em>COUNTRYCODE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.RifImpl#getCREATIONTIME <em>CREATIONTIME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.RifImpl#getDATATYPES <em>DATATYPES</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.RifImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.RifImpl#getSOURCETOOLID <em>SOURCETOOLID</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.RifImpl#getSPECGROUPS <em>SPECGROUPS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.RifImpl#getSPECOBJECTS <em>SPECOBJECTS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.RifImpl#getSPECRELATIONS <em>SPECRELATIONS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.RifImpl#getSPECTYPES <em>SPECTYPES</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.RifImpl#getTITLE <em>TITLE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.RifImpl#getVERSION <em>VERSION</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RifImpl extends EObjectImpl implements Rif {
    /**
     * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected int booleans = 0;

    /**
     * The cached value of the '{@link #getSPECHIERARCHYROOTS() <em>SPECHIERARCHYROOTS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSPECHIERARCHYROOTS()
     * @generated
     * @ordered
     */
    protected RifSpecHierarchyRoots sPECHIERARCHYROOTS;

    /**
     * The cached value of the '{@link #getACCESSPOLICIES() <em>ACCESSPOLICIES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getACCESSPOLICIES()
     * @generated
     * @ordered
     */
    protected AccessPolicies aCCESSPOLICIES;

    /**
     * The default value of the '{@link #getAUTHOR() <em>AUTHOR</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAUTHOR()
     * @generated
     * @ordered
     */
    protected static final String AUTHOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAUTHOR() <em>AUTHOR</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAUTHOR()
     * @generated
     * @ordered
     */
    protected String aUTHOR = AUTHOR_EDEFAULT;

    /**
     * The default value of the '{@link #getCOMMENT() <em>COMMENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCOMMENT()
     * @generated
     * @ordered
     */
    protected static final String COMMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCOMMENT() <em>COMMENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCOMMENT()
     * @generated
     * @ordered
     */
    protected String cOMMENT = COMMENT_EDEFAULT;

    /**
     * The default value of the '{@link #getCOUNTRYCODE() <em>COUNTRYCODE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCOUNTRYCODE()
     * @generated
     * @ordered
     */
    protected static final String COUNTRYCODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCOUNTRYCODE() <em>COUNTRYCODE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCOUNTRYCODE()
     * @generated
     * @ordered
     */
    protected String cOUNTRYCODE = COUNTRYCODE_EDEFAULT;

    /**
     * The default value of the '{@link #getCREATIONTIME() <em>CREATIONTIME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCREATIONTIME()
     * @generated
     * @ordered
     */
    protected static final String CREATIONTIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCREATIONTIME() <em>CREATIONTIME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCREATIONTIME()
     * @generated
     * @ordered
     */
    protected String cREATIONTIME = CREATIONTIME_EDEFAULT;

    /**
     * The cached value of the '{@link #getDATATYPES() <em>DATATYPES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDATATYPES()
     * @generated
     * @ordered
     */
    protected Datatypes dATATYPES;

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
     * The default value of the '{@link #getSOURCETOOLID() <em>SOURCETOOLID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSOURCETOOLID()
     * @generated
     * @ordered
     */
    protected static final String SOURCETOOLID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSOURCETOOLID() <em>SOURCETOOLID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSOURCETOOLID()
     * @generated
     * @ordered
     */
    protected String sOURCETOOLID = SOURCETOOLID_EDEFAULT;

    /**
     * The cached value of the '{@link #getSPECGROUPS() <em>SPECGROUPS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSPECGROUPS()
     * @generated
     * @ordered
     */
    protected RifSpecGroups sPECGROUPS;

    /**
     * The cached value of the '{@link #getSPECOBJECTS() <em>SPECOBJECTS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSPECOBJECTS()
     * @generated
     * @ordered
     */
    protected RifSpecObjects sPECOBJECTS;

    /**
     * The cached value of the '{@link #getSPECRELATIONS() <em>SPECRELATIONS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSPECRELATIONS()
     * @generated
     * @ordered
     */
    protected RifSpecRelations sPECRELATIONS;

    /**
     * The cached value of the '{@link #getSPECTYPES() <em>SPECTYPES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSPECTYPES()
     * @generated
     * @ordered
     */
    protected RifSpecTypes sPECTYPES;

    /**
     * The default value of the '{@link #getTITLE() <em>TITLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTITLE()
     * @generated
     * @ordered
     */
    protected static final String TITLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTITLE() <em>TITLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTITLE()
     * @generated
     * @ordered
     */
    protected String tITLE = TITLE_EDEFAULT;

    /**
     * The default value of the '{@link #getVERSION() <em>VERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVERSION()
     * @generated
     * @ordered
     */
    protected static final String VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVERSION() <em>VERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVERSION()
     * @generated
     * @ordered
     */
    protected String vERSION = VERSION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RifImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return RifPackage.Literals.RIF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RifSpecHierarchyRoots getSPECHIERARCHYROOTS() {
        return sPECHIERARCHYROOTS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSPECHIERARCHYROOTS( RifSpecHierarchyRoots newSPECHIERARCHYROOTS,
                                                         NotificationChain msgs ) {
        RifSpecHierarchyRoots oldSPECHIERARCHYROOTS = sPECHIERARCHYROOTS;
        sPECHIERARCHYROOTS = newSPECHIERARCHYROOTS;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.RIF__SPECHIERARCHYROOTS,
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
    public void setSPECHIERARCHYROOTS( RifSpecHierarchyRoots newSPECHIERARCHYROOTS ) {
        if( newSPECHIERARCHYROOTS != sPECHIERARCHYROOTS ) {
            NotificationChain msgs = null;
            if( sPECHIERARCHYROOTS != null ) msgs = ((InternalEObject)sPECHIERARCHYROOTS).eInverseRemove( this,
                                                                                                          EOPPOSITE_FEATURE_BASE
                                                                                                              - RifPackage.RIF__SPECHIERARCHYROOTS,
                                                                                                          null,
                                                                                                          msgs );
            if( newSPECHIERARCHYROOTS != null ) msgs = ((InternalEObject)newSPECHIERARCHYROOTS).eInverseAdd( this,
                                                                                                             EOPPOSITE_FEATURE_BASE
                                                                                                                 - RifPackage.RIF__SPECHIERARCHYROOTS,
                                                                                                             null,
                                                                                                             msgs );
            msgs = basicSetSPECHIERARCHYROOTS( newSPECHIERARCHYROOTS, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.RIF__SPECHIERARCHYROOTS,
            newSPECHIERARCHYROOTS,
            newSPECHIERARCHYROOTS ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AccessPolicies getACCESSPOLICIES() {
        return aCCESSPOLICIES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetACCESSPOLICIES( AccessPolicies newACCESSPOLICIES, NotificationChain msgs ) {
        AccessPolicies oldACCESSPOLICIES = aCCESSPOLICIES;
        aCCESSPOLICIES = newACCESSPOLICIES;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.RIF__ACCESSPOLICIES,
                oldACCESSPOLICIES,
                newACCESSPOLICIES );
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
    public void setACCESSPOLICIES( AccessPolicies newACCESSPOLICIES ) {
        if( newACCESSPOLICIES != aCCESSPOLICIES ) {
            NotificationChain msgs = null;
            if( aCCESSPOLICIES != null ) msgs = ((InternalEObject)aCCESSPOLICIES).eInverseRemove( this,
                                                                                                  EOPPOSITE_FEATURE_BASE
                                                                                                      - RifPackage.RIF__ACCESSPOLICIES,
                                                                                                  null,
                                                                                                  msgs );
            if( newACCESSPOLICIES != null ) msgs = ((InternalEObject)newACCESSPOLICIES).eInverseAdd( this,
                                                                                                     EOPPOSITE_FEATURE_BASE
                                                                                                         - RifPackage.RIF__ACCESSPOLICIES,
                                                                                                     null,
                                                                                                     msgs );
            msgs = basicSetACCESSPOLICIES( newACCESSPOLICIES, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.RIF__ACCESSPOLICIES,
            newACCESSPOLICIES,
            newACCESSPOLICIES ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAUTHOR() {
        return aUTHOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAUTHOR( String newAUTHOR ) {
        String oldAUTHOR = aUTHOR;
        aUTHOR = newAUTHOR;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.RIF__AUTHOR,
            oldAUTHOR,
            aUTHOR ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCOMMENT() {
        return cOMMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCOMMENT( String newCOMMENT ) {
        String oldCOMMENT = cOMMENT;
        cOMMENT = newCOMMENT;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.RIF__COMMENT,
            oldCOMMENT,
            cOMMENT ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCOUNTRYCODE() {
        return cOUNTRYCODE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCOUNTRYCODE( String newCOUNTRYCODE ) {
        String oldCOUNTRYCODE = cOUNTRYCODE;
        cOUNTRYCODE = newCOUNTRYCODE;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.RIF__COUNTRYCODE,
            oldCOUNTRYCODE,
            cOUNTRYCODE ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCREATIONTIME() {
        return cREATIONTIME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCREATIONTIME( String newCREATIONTIME ) {
        String oldCREATIONTIME = cREATIONTIME;
        cREATIONTIME = newCREATIONTIME;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.RIF__CREATIONTIME,
            oldCREATIONTIME,
            cREATIONTIME ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Datatypes getDATATYPES() {
        return dATATYPES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDATATYPES( Datatypes newDATATYPES, NotificationChain msgs ) {
        Datatypes oldDATATYPES = dATATYPES;
        dATATYPES = newDATATYPES;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.RIF__DATATYPES,
                oldDATATYPES,
                newDATATYPES );
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
    public void setDATATYPES( Datatypes newDATATYPES ) {
        if( newDATATYPES != dATATYPES ) {
            NotificationChain msgs = null;
            if( dATATYPES != null ) msgs = ((InternalEObject)dATATYPES).eInverseRemove( this, EOPPOSITE_FEATURE_BASE
                - RifPackage.RIF__DATATYPES, null, msgs );
            if( newDATATYPES != null ) msgs = ((InternalEObject)newDATATYPES).eInverseAdd( this,
                                                                                           EOPPOSITE_FEATURE_BASE
                                                                                               - RifPackage.RIF__DATATYPES,
                                                                                           null,
                                                                                           msgs );
            msgs = basicSetDATATYPES( newDATATYPES, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.RIF__DATATYPES,
            newDATATYPES,
            newDATATYPES ) );
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
            RifPackage.RIF__IDENTIFIER,
            oldIDENTIFIER,
            iDENTIFIER ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSOURCETOOLID() {
        return sOURCETOOLID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSOURCETOOLID( String newSOURCETOOLID ) {
        String oldSOURCETOOLID = sOURCETOOLID;
        sOURCETOOLID = newSOURCETOOLID;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.RIF__SOURCETOOLID,
            oldSOURCETOOLID,
            sOURCETOOLID ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RifSpecGroups getSPECGROUPS() {
        return sPECGROUPS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSPECGROUPS( RifSpecGroups newSPECGROUPS, NotificationChain msgs ) {
        RifSpecGroups oldSPECGROUPS = sPECGROUPS;
        sPECGROUPS = newSPECGROUPS;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.RIF__SPECGROUPS,
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
    public void setSPECGROUPS( RifSpecGroups newSPECGROUPS ) {
        if( newSPECGROUPS != sPECGROUPS ) {
            NotificationChain msgs = null;
            if( sPECGROUPS != null ) msgs = ((InternalEObject)sPECGROUPS).eInverseRemove( this,
                                                                                          EOPPOSITE_FEATURE_BASE
                                                                                              - RifPackage.RIF__SPECGROUPS,
                                                                                          null,
                                                                                          msgs );
            if( newSPECGROUPS != null ) msgs = ((InternalEObject)newSPECGROUPS).eInverseAdd( this,
                                                                                             EOPPOSITE_FEATURE_BASE
                                                                                                 - RifPackage.RIF__SPECGROUPS,
                                                                                             null,
                                                                                             msgs );
            msgs = basicSetSPECGROUPS( newSPECGROUPS, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.RIF__SPECGROUPS,
            newSPECGROUPS,
            newSPECGROUPS ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RifSpecObjects getSPECOBJECTS() {
        return sPECOBJECTS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSPECOBJECTS( RifSpecObjects newSPECOBJECTS, NotificationChain msgs ) {
        RifSpecObjects oldSPECOBJECTS = sPECOBJECTS;
        sPECOBJECTS = newSPECOBJECTS;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.RIF__SPECOBJECTS,
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
    public void setSPECOBJECTS( RifSpecObjects newSPECOBJECTS ) {
        if( newSPECOBJECTS != sPECOBJECTS ) {
            NotificationChain msgs = null;
            if( sPECOBJECTS != null ) msgs = ((InternalEObject)sPECOBJECTS).eInverseRemove( this,
                                                                                            EOPPOSITE_FEATURE_BASE
                                                                                                - RifPackage.RIF__SPECOBJECTS,
                                                                                            null,
                                                                                            msgs );
            if( newSPECOBJECTS != null ) msgs = ((InternalEObject)newSPECOBJECTS).eInverseAdd( this,
                                                                                               EOPPOSITE_FEATURE_BASE
                                                                                                   - RifPackage.RIF__SPECOBJECTS,
                                                                                               null,
                                                                                               msgs );
            msgs = basicSetSPECOBJECTS( newSPECOBJECTS, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.RIF__SPECOBJECTS,
            newSPECOBJECTS,
            newSPECOBJECTS ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RifSpecRelations getSPECRELATIONS() {
        return sPECRELATIONS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSPECRELATIONS( RifSpecRelations newSPECRELATIONS, NotificationChain msgs ) {
        RifSpecRelations oldSPECRELATIONS = sPECRELATIONS;
        sPECRELATIONS = newSPECRELATIONS;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.RIF__SPECRELATIONS,
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
    public void setSPECRELATIONS( RifSpecRelations newSPECRELATIONS ) {
        if( newSPECRELATIONS != sPECRELATIONS ) {
            NotificationChain msgs = null;
            if( sPECRELATIONS != null ) msgs = ((InternalEObject)sPECRELATIONS).eInverseRemove( this,
                                                                                                EOPPOSITE_FEATURE_BASE
                                                                                                    - RifPackage.RIF__SPECRELATIONS,
                                                                                                null,
                                                                                                msgs );
            if( newSPECRELATIONS != null ) msgs = ((InternalEObject)newSPECRELATIONS).eInverseAdd( this,
                                                                                                   EOPPOSITE_FEATURE_BASE
                                                                                                       - RifPackage.RIF__SPECRELATIONS,
                                                                                                   null,
                                                                                                   msgs );
            msgs = basicSetSPECRELATIONS( newSPECRELATIONS, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.RIF__SPECRELATIONS,
            newSPECRELATIONS,
            newSPECRELATIONS ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RifSpecTypes getSPECTYPES() {
        return sPECTYPES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSPECTYPES( RifSpecTypes newSPECTYPES, NotificationChain msgs ) {
        RifSpecTypes oldSPECTYPES = sPECTYPES;
        sPECTYPES = newSPECTYPES;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.RIF__SPECTYPES,
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
    public void setSPECTYPES( RifSpecTypes newSPECTYPES ) {
        if( newSPECTYPES != sPECTYPES ) {
            NotificationChain msgs = null;
            if( sPECTYPES != null ) msgs = ((InternalEObject)sPECTYPES).eInverseRemove( this, EOPPOSITE_FEATURE_BASE
                - RifPackage.RIF__SPECTYPES, null, msgs );
            if( newSPECTYPES != null ) msgs = ((InternalEObject)newSPECTYPES).eInverseAdd( this,
                                                                                           EOPPOSITE_FEATURE_BASE
                                                                                               - RifPackage.RIF__SPECTYPES,
                                                                                           null,
                                                                                           msgs );
            msgs = basicSetSPECTYPES( newSPECTYPES, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.RIF__SPECTYPES,
            newSPECTYPES,
            newSPECTYPES ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTITLE() {
        return tITLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTITLE( String newTITLE ) {
        String oldTITLE = tITLE;
        tITLE = newTITLE;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.RIF__TITLE,
            oldTITLE,
            tITLE ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVERSION() {
        return vERSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVERSION( String newVERSION ) {
        String oldVERSION = vERSION;
        vERSION = newVERSION;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.RIF__VERSION,
            oldVERSION,
            vERSION ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
        case RifPackage.RIF__SPECHIERARCHYROOTS:
            return basicSetSPECHIERARCHYROOTS( null, msgs );
        case RifPackage.RIF__ACCESSPOLICIES:
            return basicSetACCESSPOLICIES( null, msgs );
        case RifPackage.RIF__DATATYPES:
            return basicSetDATATYPES( null, msgs );
        case RifPackage.RIF__SPECGROUPS:
            return basicSetSPECGROUPS( null, msgs );
        case RifPackage.RIF__SPECOBJECTS:
            return basicSetSPECOBJECTS( null, msgs );
        case RifPackage.RIF__SPECRELATIONS:
            return basicSetSPECRELATIONS( null, msgs );
        case RifPackage.RIF__SPECTYPES:
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
        case RifPackage.RIF__SPECHIERARCHYROOTS:
            return getSPECHIERARCHYROOTS();
        case RifPackage.RIF__ACCESSPOLICIES:
            return getACCESSPOLICIES();
        case RifPackage.RIF__AUTHOR:
            return getAUTHOR();
        case RifPackage.RIF__COMMENT:
            return getCOMMENT();
        case RifPackage.RIF__COUNTRYCODE:
            return getCOUNTRYCODE();
        case RifPackage.RIF__CREATIONTIME:
            return getCREATIONTIME();
        case RifPackage.RIF__DATATYPES:
            return getDATATYPES();
        case RifPackage.RIF__IDENTIFIER:
            return getIDENTIFIER();
        case RifPackage.RIF__SOURCETOOLID:
            return getSOURCETOOLID();
        case RifPackage.RIF__SPECGROUPS:
            return getSPECGROUPS();
        case RifPackage.RIF__SPECOBJECTS:
            return getSPECOBJECTS();
        case RifPackage.RIF__SPECRELATIONS:
            return getSPECRELATIONS();
        case RifPackage.RIF__SPECTYPES:
            return getSPECTYPES();
        case RifPackage.RIF__TITLE:
            return getTITLE();
        case RifPackage.RIF__VERSION:
            return getVERSION();
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
        case RifPackage.RIF__SPECHIERARCHYROOTS:
            setSPECHIERARCHYROOTS( (RifSpecHierarchyRoots)newValue );
            return;
        case RifPackage.RIF__ACCESSPOLICIES:
            setACCESSPOLICIES( (AccessPolicies)newValue );
            return;
        case RifPackage.RIF__AUTHOR:
            setAUTHOR( (String)newValue );
            return;
        case RifPackage.RIF__COMMENT:
            setCOMMENT( (String)newValue );
            return;
        case RifPackage.RIF__COUNTRYCODE:
            setCOUNTRYCODE( (String)newValue );
            return;
        case RifPackage.RIF__CREATIONTIME:
            setCREATIONTIME( (String)newValue );
            return;
        case RifPackage.RIF__DATATYPES:
            setDATATYPES( (Datatypes)newValue );
            return;
        case RifPackage.RIF__IDENTIFIER:
            setIDENTIFIER( (String)newValue );
            return;
        case RifPackage.RIF__SOURCETOOLID:
            setSOURCETOOLID( (String)newValue );
            return;
        case RifPackage.RIF__SPECGROUPS:
            setSPECGROUPS( (RifSpecGroups)newValue );
            return;
        case RifPackage.RIF__SPECOBJECTS:
            setSPECOBJECTS( (RifSpecObjects)newValue );
            return;
        case RifPackage.RIF__SPECRELATIONS:
            setSPECRELATIONS( (RifSpecRelations)newValue );
            return;
        case RifPackage.RIF__SPECTYPES:
            setSPECTYPES( (RifSpecTypes)newValue );
            return;
        case RifPackage.RIF__TITLE:
            setTITLE( (String)newValue );
            return;
        case RifPackage.RIF__VERSION:
            setVERSION( (String)newValue );
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
        case RifPackage.RIF__SPECHIERARCHYROOTS:
            setSPECHIERARCHYROOTS( (RifSpecHierarchyRoots)null );
            return;
        case RifPackage.RIF__ACCESSPOLICIES:
            setACCESSPOLICIES( (AccessPolicies)null );
            return;
        case RifPackage.RIF__AUTHOR:
            setAUTHOR( AUTHOR_EDEFAULT );
            return;
        case RifPackage.RIF__COMMENT:
            setCOMMENT( COMMENT_EDEFAULT );
            return;
        case RifPackage.RIF__COUNTRYCODE:
            setCOUNTRYCODE( COUNTRYCODE_EDEFAULT );
            return;
        case RifPackage.RIF__CREATIONTIME:
            setCREATIONTIME( CREATIONTIME_EDEFAULT );
            return;
        case RifPackage.RIF__DATATYPES:
            setDATATYPES( (Datatypes)null );
            return;
        case RifPackage.RIF__IDENTIFIER:
            setIDENTIFIER( IDENTIFIER_EDEFAULT );
            return;
        case RifPackage.RIF__SOURCETOOLID:
            setSOURCETOOLID( SOURCETOOLID_EDEFAULT );
            return;
        case RifPackage.RIF__SPECGROUPS:
            setSPECGROUPS( (RifSpecGroups)null );
            return;
        case RifPackage.RIF__SPECOBJECTS:
            setSPECOBJECTS( (RifSpecObjects)null );
            return;
        case RifPackage.RIF__SPECRELATIONS:
            setSPECRELATIONS( (RifSpecRelations)null );
            return;
        case RifPackage.RIF__SPECTYPES:
            setSPECTYPES( (RifSpecTypes)null );
            return;
        case RifPackage.RIF__TITLE:
            setTITLE( TITLE_EDEFAULT );
            return;
        case RifPackage.RIF__VERSION:
            setVERSION( VERSION_EDEFAULT );
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
        case RifPackage.RIF__SPECHIERARCHYROOTS:
            return sPECHIERARCHYROOTS != null;
        case RifPackage.RIF__ACCESSPOLICIES:
            return aCCESSPOLICIES != null;
        case RifPackage.RIF__AUTHOR:
            return AUTHOR_EDEFAULT == null ? aUTHOR != null : !AUTHOR_EDEFAULT.equals( aUTHOR );
        case RifPackage.RIF__COMMENT:
            return COMMENT_EDEFAULT == null ? cOMMENT != null : !COMMENT_EDEFAULT.equals( cOMMENT );
        case RifPackage.RIF__COUNTRYCODE:
            return COUNTRYCODE_EDEFAULT == null ? cOUNTRYCODE != null : !COUNTRYCODE_EDEFAULT.equals( cOUNTRYCODE );
        case RifPackage.RIF__CREATIONTIME:
            return CREATIONTIME_EDEFAULT == null
                ? cREATIONTIME != null
                : !CREATIONTIME_EDEFAULT.equals( cREATIONTIME );
        case RifPackage.RIF__DATATYPES:
            return dATATYPES != null;
        case RifPackage.RIF__IDENTIFIER:
            return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals( iDENTIFIER );
        case RifPackage.RIF__SOURCETOOLID:
            return SOURCETOOLID_EDEFAULT == null
                ? sOURCETOOLID != null
                : !SOURCETOOLID_EDEFAULT.equals( sOURCETOOLID );
        case RifPackage.RIF__SPECGROUPS:
            return sPECGROUPS != null;
        case RifPackage.RIF__SPECOBJECTS:
            return sPECOBJECTS != null;
        case RifPackage.RIF__SPECRELATIONS:
            return sPECRELATIONS != null;
        case RifPackage.RIF__SPECTYPES:
            return sPECTYPES != null;
        case RifPackage.RIF__TITLE:
            return TITLE_EDEFAULT == null ? tITLE != null : !TITLE_EDEFAULT.equals( tITLE );
        case RifPackage.RIF__VERSION:
            return VERSION_EDEFAULT == null ? vERSION != null : !VERSION_EDEFAULT.equals( vERSION );
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
        result.append( " (aUTHOR: " );
        result.append( aUTHOR );
        result.append( ", cOMMENT: " );
        result.append( cOMMENT );
        result.append( ", cOUNTRYCODE: " );
        result.append( cOUNTRYCODE );
        result.append( ", cREATIONTIME: " );
        result.append( cREATIONTIME );
        result.append( ", iDENTIFIER: " );
        result.append( iDENTIFIER );
        result.append( ", sOURCETOOLID: " );
        result.append( sOURCETOOLID );
        result.append( ", tITLE: " );
        result.append( tITLE );
        result.append( ", vERSION: " );
        result.append( vERSION );
        result.append( ')' );
        return result.toString();
    }

} //RifImpl
