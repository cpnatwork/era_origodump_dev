/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AttributeValueXmlDataXmlContent;
import era.foss.model.core.rif.RifPackage;
import era.foss.model.core.rif.XmlContentXmlContent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value Xml Data Xml Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValueXmlDataXmlContentImpl#getXMLCONTENT <em>XMLCONTENT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeValueXmlDataXmlContentImpl extends EObjectImpl implements AttributeValueXmlDataXmlContent {
    /**
     * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected int booleans = 0;

    /**
     * The cached value of the '{@link #getXMLCONTENT() <em>XMLCONTENT</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXMLCONTENT()
     * @generated
     * @ordered
     */
    protected XmlContentXmlContent xMLCONTENT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeValueXmlDataXmlContentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return RifPackage.Literals.ATTRIBUTE_VALUE_XML_DATA_XML_CONTENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XmlContentXmlContent getXMLCONTENT() {
        return xMLCONTENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetXMLCONTENT( XmlContentXmlContent newXMLCONTENT, NotificationChain msgs ) {
        XmlContentXmlContent oldXMLCONTENT = xMLCONTENT;
        xMLCONTENT = newXMLCONTENT;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                RifPackage.ATTRIBUTE_VALUE_XML_DATA_XML_CONTENT__XMLCONTENT,
                oldXMLCONTENT,
                newXMLCONTENT );
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
    public void setXMLCONTENT( XmlContentXmlContent newXMLCONTENT ) {
        if( newXMLCONTENT != xMLCONTENT ) {
            NotificationChain msgs = null;
            if( xMLCONTENT != null ) msgs = ((InternalEObject)xMLCONTENT).eInverseRemove( this,
                                                                                          EOPPOSITE_FEATURE_BASE
                                                                                              - RifPackage.ATTRIBUTE_VALUE_XML_DATA_XML_CONTENT__XMLCONTENT,
                                                                                          null,
                                                                                          msgs );
            if( newXMLCONTENT != null ) msgs = ((InternalEObject)newXMLCONTENT).eInverseAdd( this,
                                                                                             EOPPOSITE_FEATURE_BASE
                                                                                                 - RifPackage.ATTRIBUTE_VALUE_XML_DATA_XML_CONTENT__XMLCONTENT,
                                                                                             null,
                                                                                             msgs );
            msgs = basicSetXMLCONTENT( newXMLCONTENT, msgs );
            if( msgs != null ) msgs.dispatch();
        } else if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ATTRIBUTE_VALUE_XML_DATA_XML_CONTENT__XMLCONTENT,
            newXMLCONTENT,
            newXMLCONTENT ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
        case RifPackage.ATTRIBUTE_VALUE_XML_DATA_XML_CONTENT__XMLCONTENT:
            return basicSetXMLCONTENT( null, msgs );
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
        case RifPackage.ATTRIBUTE_VALUE_XML_DATA_XML_CONTENT__XMLCONTENT:
            return getXMLCONTENT();
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
        case RifPackage.ATTRIBUTE_VALUE_XML_DATA_XML_CONTENT__XMLCONTENT:
            setXMLCONTENT( (XmlContentXmlContent)newValue );
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
        case RifPackage.ATTRIBUTE_VALUE_XML_DATA_XML_CONTENT__XMLCONTENT:
            setXMLCONTENT( (XmlContentXmlContent)null );
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
        case RifPackage.ATTRIBUTE_VALUE_XML_DATA_XML_CONTENT__XMLCONTENT:
            return xMLCONTENT != null;
        }
        return super.eIsSet( featureID );
    }

} //AttributeValueXmlDataXmlContentImpl
