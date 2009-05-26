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
 * A representation of the model object '<em><b>Default Value3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.DefaultValue3#getATTRIBUTEVALUEEMBEDDEDDOCUMENT <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getDefaultValue3()
 * @model extendedMetaData="name='DEFAULT-VALUE3_._type' kind='elementOnly'"
 * @generated
 */
public interface DefaultValue3 extends EObject {
    /**
     * Returns the value of the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>' containment reference.
     * @see #setATTRIBUTEVALUEEMBEDDEDDOCUMENT(AttributeValueEmbeddedDocument)
     * @see era.foss.model.core.rif.RifPackage#getDefaultValue3_ATTRIBUTEVALUEEMBEDDEDDOCUMENT()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-EMBEDDED-DOCUMENT' namespace='##targetNamespace'"
     * @generated
     */
    AttributeValueEmbeddedDocument getATTRIBUTEVALUEEMBEDDEDDOCUMENT();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.DefaultValue3#getATTRIBUTEVALUEEMBEDDEDDOCUMENT <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>' containment reference.
     * @see #getATTRIBUTEVALUEEMBEDDEDDOCUMENT()
     * @generated
     */
    void setATTRIBUTEVALUEEMBEDDEDDOCUMENT( AttributeValueEmbeddedDocument value );

} // DefaultValue3
