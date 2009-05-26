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
 * A representation of the model object '<em><b>Default Value4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.DefaultValue4#getATTRIBUTEVALUEFILEREFERENCE <em>ATTRIBUTEVALUEFILEREFERENCE</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getDefaultValue4()
 * @model extendedMetaData="name='DEFAULT-VALUE4_._type' kind='elementOnly'"
 * @generated
 */
public interface DefaultValue4 extends EObject {
    /**
     * Returns the value of the '<em><b>ATTRIBUTEVALUEFILEREFERENCE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ATTRIBUTEVALUEFILEREFERENCE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ATTRIBUTEVALUEFILEREFERENCE</em>' containment reference.
     * @see #setATTRIBUTEVALUEFILEREFERENCE(AttributeValueFileReference)
     * @see era.foss.model.core.rif.RifPackage#getDefaultValue4_ATTRIBUTEVALUEFILEREFERENCE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-FILE-REFERENCE' namespace='##targetNamespace'"
     * @generated
     */
    AttributeValueFileReference getATTRIBUTEVALUEFILEREFERENCE();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.DefaultValue4#getATTRIBUTEVALUEFILEREFERENCE <em>ATTRIBUTEVALUEFILEREFERENCE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ATTRIBUTEVALUEFILEREFERENCE</em>' containment reference.
     * @see #getATTRIBUTEVALUEFILEREFERENCE()
     * @generated
     */
    void setATTRIBUTEVALUEFILEREFERENCE( AttributeValueFileReference value );

} // DefaultValue4
