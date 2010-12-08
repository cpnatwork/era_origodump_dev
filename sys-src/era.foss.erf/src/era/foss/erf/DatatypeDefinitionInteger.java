package era.foss.erf;

/**
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NonNegative MaxGreaterThanMin'"
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
	 * Sets the value of the '{@link era.foss.erf.DatatypeDefinitionInteger#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

	/**
	 * @model
	 * @return
	 */
	public int getMin();

	/**
	 * Sets the value of the '{@link era.foss.erf.DatatypeDefinitionInteger#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);
}
