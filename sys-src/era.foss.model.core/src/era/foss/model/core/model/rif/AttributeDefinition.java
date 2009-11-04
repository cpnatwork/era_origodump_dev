package era.foss.model.core.model.rif;

import org.eclipse.emf.ecore.EObject;

/**
 * @model
 * @author poldi
 *
 */
public interface AttributeDefinition extends EObject {
    
    /**
     * @model
     * @return
     */
    public DatatypeDefinition getType();

    /**
     * Sets the value of the '{@link era.foss.model.core.model.rif.AttributeDefinition#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(DatatypeDefinition value);

}
