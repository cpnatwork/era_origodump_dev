package era.foss.erf;

/**
 * @model abstract="true"
 *
 */
public interface AttributeDefinition extends Identifiable {

    /**
     * @model lowerBound="1"
     * @Not generated
     * @return
     */
    public DatatypeDefinition getType();

    /**
     * The value assigned to this attribute definition is used as ID
     * 
     * @model unique="true" default="false" required="true" ordered="false" annotation="UI Detail='true'"
     * @Not generated
     */
    boolean isIdent();

    /**
     * The value assigned to this attribute definition must be unique
     * 
     * @model unique="false" default="false" required="true" ordered="false" annotation="UI Detail='true'"
     * @Not generated
     */
    boolean isUnique();

    /**
     * Sets the value of the '{@link era.foss.erf.AttributeDefinition#isUnique <em>Unique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unique</em>' attribute.
     * @see #isUnique()
     * @generated
     */
    void setUnique( boolean value );

    /**
     * Sets the value of the '{@link era.foss.erf.AttributeDefinition#isIdent <em>Ident</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ident</em>' attribute.
     * @see #isIdent()
     * @generated
     */
    void setIdent( boolean value );

    /**
     * Sets the value of the '{@link era.foss.erf.AttributeDefinition#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType( DatatypeDefinition value );

}
