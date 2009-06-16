/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value Embedded Document Xhtml Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.AttributeValueEmbeddedDocumentXhtmlContent#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getAttributeValueEmbeddedDocumentXhtmlContent()
 * @model extendedMetaData="name='XHTML-CONTENT_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface AttributeValueEmbeddedDocumentXhtmlContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see era.foss.model.core.rif.RifPackage#getAttributeValueEmbeddedDocumentXhtmlContent_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='http://automotive-his.de/schema/rif-xhtml' name=':0' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

} // AttributeValueEmbeddedDocumentXhtmlContent
