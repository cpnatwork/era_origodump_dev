package era.foss.erf;

/**
 * @model
 * @author schorsch
 *
 */
public interface DatatypeDefinitionString extends DatatypeDefinitionSimple {
    /**
     * @model
     */
    public int getMaxLength();

    /**
     * Sets the value of the '{@link era.foss.erf.DatatypeDefinitionString#getMaxLength <em>Max Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Length</em>' attribute.
     * @see #getMaxLength()
     * @generated
     */
    void setMaxLength( int value );
}
