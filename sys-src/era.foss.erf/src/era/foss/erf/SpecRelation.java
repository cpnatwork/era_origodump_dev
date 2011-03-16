/**
 * 
 */
package era.foss.erf;

/**
 * @model
 */
public interface SpecRelation extends SpecElementWithUserDefinedAttributes {

    /**
     * @model kind="reference" opposite="targets" required="true"
     */
    public SpecObject getSource();

    /**
     * Sets the value of the '{@link era.foss.erf.SpecRelation#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource( SpecObject value );

    /**
     * @model kind="reference" opposite="sources" required="true"
     */
    public SpecObject getTarget();

    /**
     * Sets the value of the '{@link era.foss.erf.SpecRelation#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget( SpecObject value );

}
