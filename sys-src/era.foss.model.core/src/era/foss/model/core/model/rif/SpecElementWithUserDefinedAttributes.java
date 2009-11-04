package era.foss.model.core.model.rif;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;

/**
 * @model
 * @author poldi
 *
 */
public interface SpecElementWithUserDefinedAttributes extends EObject {

    /**
     * @model containment="true"
     */
    public abstract Map<AttributeDefinition, AttributeValue> getValues();
    
    /**
     * Sets the value of the '{@link era.foss.model.core.model.rif.SpecElementWithUserDefinedAttributes#getValues <em>Values</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Values</em>' containment reference.
     * @see #getValues()
     * @generated
     */
    void setValues(Map<AttributeDefinition, AttributeValue> value);

    /**
     * @model
     */
    public SpecType getType();

    /**
     * Sets the value of the '{@link era.foss.model.core.model.rif.SpecElementWithUserDefinedAttributes#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(SpecType value);

}