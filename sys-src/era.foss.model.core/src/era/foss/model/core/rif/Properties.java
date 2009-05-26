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
 * A representation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.Properties#getEMBEDDEDVALUE <em>EMBEDDEDVALUE</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getProperties()
 * @model extendedMetaData="name='PROPERTIES_._type' kind='elementOnly'"
 * @generated
 */
public interface Properties extends EObject {
    /**
     * Returns the value of the '<em><b>EMBEDDEDVALUE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EMBEDDEDVALUE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EMBEDDEDVALUE</em>' containment reference.
     * @see #setEMBEDDEDVALUE(EmbeddedValue)
     * @see era.foss.model.core.rif.RifPackage#getProperties_EMBEDDEDVALUE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='EMBEDDED-VALUE' namespace='##targetNamespace'"
     * @generated
     */
    EmbeddedValue getEMBEDDEDVALUE();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.Properties#getEMBEDDEDVALUE <em>EMBEDDEDVALUE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EMBEDDEDVALUE</em>' containment reference.
     * @see #getEMBEDDEDVALUE()
     * @generated
     */
    void setEMBEDDEDVALUE( EmbeddedValue value );

} // Properties
