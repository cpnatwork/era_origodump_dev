package era.foss.rif;

/**
 * @model
 * @author schorsch
 *
 */
public interface AttributeDefinitionSimple extends AttributeDefinition {
	/**
	 * @model containment="true"
	 * @return
	 */
	public AttributeValueSimple getDefaultValue();

	/**
	 * Sets the value of the '{@link era.foss.rif.AttributeDefinitionSimple#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(AttributeValueSimple value);

}
