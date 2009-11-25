package era.foss.model.core.model.rif;

/**
 * @model
 * @author poldi
 *
 */
public interface SimpleAttributeValue extends AttributeValue {
    
    /**
     * @model
     */
    public String getTheValue();

    /**
     * Sets the value of the '{@link era.foss.model.core.model.rif.SimpleAttributeValue#getTheValue <em>The Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>The Value</em>' attribute.
     * @see #getTheValue()
     * @generated
     */
    void setTheValue(String value);

}
