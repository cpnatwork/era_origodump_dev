package era.foss.erf;

/**
 * @model
 * @author schorsch
 *
 */
public interface DatatypeDefinitionString extends DatatypeDefinitionSimple {
    /**
     * @model unsettable="true" unique="false" ordered="false"
     */
    public Integer getMaxLength();

    /**
     * Sets the value of the '{@link era.foss.erf.DatatypeDefinitionString#getMaxLength <em>Max Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Length</em>' attribute.
     * @see #isSetMaxLength()
     * @see #unsetMaxLength()
     * @see #getMaxLength()
     * @generated
     */
    void setMaxLength( Integer value );

    /**
     * Unsets the value of the '{@link era.foss.erf.DatatypeDefinitionString#getMaxLength <em>Max Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxLength()
     * @see #getMaxLength()
     * @see #setMaxLength(Integer)
     * @generated
     */
    void unsetMaxLength();

    /**
     * Returns whether the value of the '{@link era.foss.erf.DatatypeDefinitionString#getMaxLength <em>Max Length</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Length</em>' attribute is set.
     * @see #unsetMaxLength()
     * @see #getMaxLength()
     * @see #setMaxLength(Integer)
     * @generated
     */
    boolean isSetMaxLength();
}
