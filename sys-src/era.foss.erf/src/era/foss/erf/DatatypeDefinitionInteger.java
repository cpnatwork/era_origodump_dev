package era.foss.erf;

/**
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NonNegative MaxGreaterThanMin'"
 * @author schorsch
 *
 */
public interface DatatypeDefinitionInteger extends DatatypeDefinitionSimple {

    /**
     * @model unsettable="true" unique="false" ordered="false"
     * @return
     */
    public Integer getMax();

    /**
     * Sets the value of the '{@link era.foss.erf.DatatypeDefinitionInteger#getMax <em>Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max</em>' attribute.
     * @see #isSetMax()
     * @see #unsetMax()
     * @see #getMax()
     * @generated
     */
    void setMax( Integer value );

    /**
     * Unsets the value of the '{@link era.foss.erf.DatatypeDefinitionInteger#getMax <em>Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMax()
     * @see #getMax()
     * @see #setMax(Integer)
     * @generated
     */
    void unsetMax();

    /**
     * Returns whether the value of the '{@link era.foss.erf.DatatypeDefinitionInteger#getMax <em>Max</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max</em>' attribute is set.
     * @see #unsetMax()
     * @see #getMax()
     * @see #setMax(Integer)
     * @generated
     */
    boolean isSetMax();

    /**
     * @model unsettable="true" unique="false" ordered="false"
     * @return 
     */
    public Integer getMin();

    /**
     * Sets the value of the '{@link era.foss.erf.DatatypeDefinitionInteger#getMin <em>Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min</em>' attribute.
     * @see #isSetMin()
     * @see #unsetMin()
     * @see #getMin()
     * @generated
     */
    void setMin( Integer value );

    /**
     * Unsets the value of the '{@link era.foss.erf.DatatypeDefinitionInteger#getMin <em>Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMin()
     * @see #getMin()
     * @see #setMin(Integer)
     * @generated
     */
    void unsetMin();

    /**
     * Returns whether the value of the '{@link era.foss.erf.DatatypeDefinitionInteger#getMin <em>Min</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min</em>' attribute is set.
     * @see #unsetMin()
     * @see #getMin()
     * @see #setMin(Integer)
     * @generated
     */
    boolean isSetMin();
}
