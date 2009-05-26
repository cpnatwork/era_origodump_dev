/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AttributeValueEmbeddedDocument;
import era.foss.model.core.rif.AttributeValueEmbeddedDocumentDefinition;
import era.foss.model.core.rif.AttributeValueEmbeddedDocumentXhtmlContent;
import era.foss.model.core.rif.RifPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value Embedded Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValueEmbeddedDocumentImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValueEmbeddedDocumentImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValueEmbeddedDocumentImpl#getDEFINITION <em>DEFINITION</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValueEmbeddedDocumentImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValueEmbeddedDocumentImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValueEmbeddedDocumentImpl#getXHTMLCONTENT <em>XHTMLCONTENT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeValueEmbeddedDocumentImpl extends EObjectImpl implements AttributeValueEmbeddedDocument {
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
    protected AttributeValueEmbeddedDocumentDefinition dEFINITION;

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
     * The cached value of the '{@link #getXHTMLCONTENT() <em>XHTMLCONTENT</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXHTMLCONTENT()
     * @generated
     * @ordered
     */
    protected AttributeValueEmbeddedDocumentXhtmlContent xHTMLCONTENT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeValueEmbeddedDocumentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return RifPackage.Literals.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT;
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
            RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__LONGNAME,
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
            RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DESC,
            oldDESC,
            dESC ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueEmbeddedDocumentDefinition getDEFINITION() {
        return dEFINITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDEFINITION( AttributeValueEmbeddedDocumentDefinition newDEFINITION,
                                                 NotificationChain msgs ) {
        AttributeValueEmbeddedDocumentDefinition oldDEFINITION = dEFINITION;
        dEFINITION = newDEFINITION;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DEFINITION,
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
    public void setDEFINITION( AttributeValueEmbeddedDocumentDefinition newDEFINITION ) {
        if( newDEFINITION != dEFINITION ) {
            NotificationChain msgs = null;
            if( dEFINITION != null ) msgs = ((InternalEObject)dEFINITION).eInverseRemove( this,
                                                                                          EOPPOSITE_FEATURE_BASE
                                                                                              - RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DEFINITION,
                                                                                          null,
                                                                                          msgs );
            if( newDEFINITION != null ) msgs = ((InternalEObject)newDEFINITION).eInverseAdd( this,
                                                                                             EOPPOSITE_FEATURE_BASE
                                                                                                 - RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DEFINITION,
                                                                                             null,
                                                                                             msgs );
            msgs = basicSetDEFINITION( newDEFINITION, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DEFINITION,
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
            RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__IDENTIFIER,
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
            RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__LASTCHANGE,
            oldLASTCHANGE,
            lASTCHANGE ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueEmbeddedDocumentXhtmlContent getXHTMLCONTENT() {
        return xHTMLCONTENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetXHTMLCONTENT( AttributeValueEmbeddedDocumentXhtmlContent newXHTMLCONTENT,
                                                   NotificationChain msgs ) {
        AttributeValueEmbeddedDocumentXhtmlContent oldXHTMLCONTENT = xHTMLCONTENT;
        xHTMLCONTENT = newXHTMLCONTENT;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__XHTMLCONTENT,
                oldXHTMLCONTENT,
                newXHTMLCONTENT );
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
    public void setXHTMLCONTENT( AttributeValueEmbeddedDocumentXhtmlContent newXHTMLCONTENT ) {
        if( newXHTMLCONTENT != xHTMLCONTENT ) {
            NotificationChain msgs = null;
            if( xHTMLCONTENT != null ) msgs = ((InternalEObject)xHTMLCONTENT).eInverseRemove( this,
                                                                                              EOPPOSITE_FEATURE_BASE
                                                                                                  - RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__XHTMLCONTENT,
                                                                                              null,
                                                                                              msgs );
            if( newXHTMLCONTENT != null ) msgs = ((InternalEObject)newXHTMLCONTENT).eInverseAdd( this,
                                                                                                 EOPPOSITE_FEATURE_BASE
                                                                                                     - RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__XHTMLCONTENT,
                                                                                                 null,
                                                                                                 msgs );
            msgs = basicSetXHTMLCONTENT( newXHTMLCONTENT, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__XHTMLCONTENT,
            newXHTMLCONTENT,
            newXHTMLCONTENT ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DEFINITION:
            return basicSetDEFINITION( null, msgs );
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__XHTMLCONTENT:
            return basicSetXHTMLCONTENT( null, msgs );
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
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__LONGNAME:
            return getLONGNAME();
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DESC:
            return getDESC();
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DEFINITION:
            return getDEFINITION();
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__IDENTIFIER:
            return getIDENTIFIER();
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__LASTCHANGE:
            return getLASTCHANGE();
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__XHTMLCONTENT:
            return getXHTMLCONTENT();
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
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__LONGNAME:
            setLONGNAME( (String)newValue );
            return;
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DESC:
            setDESC( (String)newValue );
            return;
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DEFINITION:
            setDEFINITION( (AttributeValueEmbeddedDocumentDefinition)newValue );
            return;
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__IDENTIFIER:
            setIDENTIFIER( (String)newValue );
            return;
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__LASTCHANGE:
            setLASTCHANGE( (String)newValue );
            return;
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__XHTMLCONTENT:
            setXHTMLCONTENT( (AttributeValueEmbeddedDocumentXhtmlContent)newValue );
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
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__LONGNAME:
            setLONGNAME( LONGNAME_EDEFAULT );
            return;
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DESC:
            setDESC( DESC_EDEFAULT );
            return;
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DEFINITION:
            setDEFINITION( (AttributeValueEmbeddedDocumentDefinition)null );
            return;
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__IDENTIFIER:
            setIDENTIFIER( IDENTIFIER_EDEFAULT );
            return;
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__LASTCHANGE:
            setLASTCHANGE( LASTCHANGE_EDEFAULT );
            return;
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__XHTMLCONTENT:
            setXHTMLCONTENT( (AttributeValueEmbeddedDocumentXhtmlContent)null );
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
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__LONGNAME:
            return LONGNAME_EDEFAULT == null ? lONGNAME != null : !LONGNAME_EDEFAULT.equals( lONGNAME );
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DESC:
            return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT.equals( dESC );
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DEFINITION:
            return dEFINITION != null;
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__IDENTIFIER:
            return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals( iDENTIFIER );
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__LASTCHANGE:
            return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null : !LASTCHANGE_EDEFAULT.equals( lASTCHANGE );
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__XHTMLCONTENT:
            return xHTMLCONTENT != null;
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

} //AttributeValueEmbeddedDocumentImpl
