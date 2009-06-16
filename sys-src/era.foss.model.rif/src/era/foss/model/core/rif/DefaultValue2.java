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
 * A representation of the model object '<em><b>Default Value2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.DefaultValue2#getATTRIBUTEVALUEEMBEDDEDFILE <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getDefaultValue2()
 * @model extendedMetaData="name='DEFAULT-VALUE2_._type' kind='elementOnly'"
 * @generated
 */
public interface DefaultValue2 extends EObject {
	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUEEMBEDDEDFILE</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUEEMBEDDEDFILE</em>' containment reference.
	 * @see #setATTRIBUTEVALUEEMBEDDEDFILE(AttributeValueEmbeddedFile)
	 * @see era.foss.model.core.rif.RifPackage#getDefaultValue2_ATTRIBUTEVALUEEMBEDDEDFILE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-EMBEDDED-FILE' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributeValueEmbeddedFile getATTRIBUTEVALUEEMBEDDEDFILE();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.DefaultValue2#getATTRIBUTEVALUEEMBEDDEDFILE <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ATTRIBUTEVALUEEMBEDDEDFILE</em>' containment reference.
	 * @see #getATTRIBUTEVALUEEMBEDDEDFILE()
	 * @generated
	 */
	void setATTRIBUTEVALUEEMBEDDEDFILE(AttributeValueEmbeddedFile value);

} // DefaultValue2
