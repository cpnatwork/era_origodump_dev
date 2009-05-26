/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value Xml Data Xml Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.AttributeValueXmlDataXmlContent#getXMLCONTENT <em>XMLCONTENT</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getAttributeValueXmlDataXmlContent()
 * @model extendedMetaData="name='XML-CONTENT_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface AttributeValueXmlDataXmlContent extends EObject {
    /**
     * Returns the value of the '<em><b>XMLCONTENT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XMLCONTENT</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XMLCONTENT</em>' containment reference.
     * @see #setXMLCONTENT(XmlContentXmlContent)
     * @see era.foss.model.core.rif.RifPackage#getAttributeValueXmlDataXmlContent_XMLCONTENT()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='XML-CONTENT' namespace='##targetNamespace'"
     * @generated
     */
    XmlContentXmlContent getXMLCONTENT();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.AttributeValueXmlDataXmlContent#getXMLCONTENT <em>XMLCONTENT</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XMLCONTENT</em>' containment reference.
     * @see #getXMLCONTENT()
     * @generated
     */
    void setXMLCONTENT( XmlContentXmlContent value );

} // AttributeValueXmlDataXmlContent
