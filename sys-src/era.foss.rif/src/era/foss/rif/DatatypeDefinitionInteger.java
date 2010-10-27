package era.foss.rif;

/**
 * @model
 * @author schorsch
 *
 */
public interface DatatypeDefinitionInteger extends DatatypeDefinitionSimple {

    /**
     * @model 
     * @return
     */
    public int getMax();

    /**
     * Sets the value of the '{@link era.foss.rif.DatatypeDefinitionInteger#getMax <em>Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max</em>' attribute.
     * @see #getMax()
     * @generated
     */
    void setMax( int value );

    /**
     * @model
     * @return
     */
    public int getMin();

    /**
     * Sets the value of the '{@link era.foss.rif.DatatypeDefinitionInteger#getMin <em>Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min</em>' attribute.
     * @see #getMin()
     * @generated
     */
    void setMin( int value );
}
