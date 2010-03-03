package era.foss.rif;

/**
 * @model
 * @author schorsch
 *
 */
public interface DatatypeDefinitionString extends DatatypeDefinitionSimple {
    /**
     * @model lowerBound="1" upperBound="1" default="2147483647"
     */
    public int getMaxLength();

    /**
     * Sets the value of the '{@link era.foss.rif.DatatypeDefinitionString#getMaxLength <em>Max Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Length</em>' attribute.
     * @see #getMaxLength()
     * @generated
     */
    void setMaxLength( int value );
}
