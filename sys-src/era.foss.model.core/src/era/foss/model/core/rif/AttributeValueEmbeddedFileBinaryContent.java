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
 * A representation of the model object '<em><b>Attribute Value Embedded File Binary Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.AttributeValueEmbeddedFileBinaryContent#getBINARYCONTENT <em>BINARYCONTENT</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getAttributeValueEmbeddedFileBinaryContent()
 * @model extendedMetaData="name='BINARY-CONTENT_._type' kind='elementOnly'"
 * @generated
 */
public interface AttributeValueEmbeddedFileBinaryContent extends EObject {
	/**
	 * Returns the value of the '<em><b>BINARYCONTENT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BINARYCONTENT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BINARYCONTENT</em>' containment reference.
	 * @see #setBINARYCONTENT(BinaryContent)
	 * @see era.foss.model.core.rif.RifPackage#getAttributeValueEmbeddedFileBinaryContent_BINARYCONTENT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BINARY-CONTENT' namespace='##targetNamespace'"
	 * @generated
	 */
	BinaryContent getBINARYCONTENT();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeValueEmbeddedFileBinaryContent#getBINARYCONTENT <em>BINARYCONTENT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BINARYCONTENT</em>' containment reference.
	 * @see #getBINARYCONTENT()
	 * @generated
	 */
	void setBINARYCONTENT(BinaryContent value);

} // AttributeValueEmbeddedFileBinaryContent
