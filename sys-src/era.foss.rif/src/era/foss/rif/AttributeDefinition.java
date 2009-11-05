package era.foss.rif;

/**
 * @model abstract="true"
 * @author poldi
 *
 */
public interface AttributeDefinition extends Identifiable {

	/**
	 * @model lowerBound="1"
	 * @return
	 */
	public DatatypeDefinition getType();

	/**
	 * Sets the value of the '{@link era.foss.rif.AttributeDefinition#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DatatypeDefinition value);

}
