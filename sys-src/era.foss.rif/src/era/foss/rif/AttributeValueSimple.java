package era.foss.rif;

/**
 * @model
 * @author poldi
 *
 */
public interface AttributeValueSimple extends AttributeValue {

    /**
     * @model lowerBound="1"
     */
    public String getTheValue();

    /**
     * Sets the value of the '{@link era.foss.rif.AttributeValueSimple#getTheValue <em>The Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>The Value</em>' attribute.
     * @see #getTheValue()
     * @generated
     */
    void setTheValue( String value );

    /**
     * @model lowerBound="1"
     * @return
     */
    public AttributeDefinitionSimple getDefinition();

    /**
     * Sets the value of the '{@link era.foss.rif.AttributeValueSimple#getDefinition <em>Definition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Definition</em>' reference.
     * @see #getDefinition()
     * @generated
     */
    void setDefinition( AttributeDefinitionSimple value );

}
