package era.foss.rif;

import org.eclipse.emf.common.util.EList;

/**
 * @model abstract="true"
 * @author poldi
 *
 */
public interface SpecElementWithUserDefinedAttributes extends Identifiable {

    /**
     * @model containment="true"
     */
    public EList<AttributeValue> getValues();

    /**
     * @model
     */
    public SpecType getType();

    /**
     * Sets the value of the '{@link era.foss.rif.SpecElementWithUserDefinedAttributes#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType( SpecType value );

}