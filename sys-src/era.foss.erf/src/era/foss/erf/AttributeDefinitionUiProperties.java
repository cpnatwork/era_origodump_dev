package era.foss.erf;

import org.eclipse.emf.ecore.EObject;

/**
 * @model
 * 
 */
public interface AttributeDefinitionUiProperties extends EObject {

    /**
     * @model unique="false" default="true" required="true" ordered="false"
     * @Not generated
     * @return
     */
    boolean isEditorShowLabel();

    /**
     * Sets the value of the '{@link era.foss.erf.AttributeDefinitionUiProperties#isEditorShowLabel <em>Editor Show Label</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Editor Show Label</em>' attribute.
     * @see #isEditorShowLabel()
     * @generated
     */
    void setEditorShowLabel( boolean value );

    /**
     * @model unique="false" default="1" lowerBound="1" upperBound="1" ordered="false"
     * @Not generated
     * @return
     */
    int getEditorRowNumber();

    /**
     * Sets the value of the '{@link era.foss.erf.AttributeDefinitionUiProperties#getEditorRowNumber <em>Editor Row Number</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Editor Row Number</em>' attribute.
     * @see #getEditorRowNumber()
     * @generated
     */
    void setEditorRowNumber( int value );

    /**
     * @model unique="false" default="1" lowerBound="1" upperBound="1" ordered="false"
     * @Not generated
     * @return
     */
    int getEditorColumnSpan();

    /**
     * Sets the value of the '{@link era.foss.erf.AttributeDefinitionUiProperties#getEditorColumnSpan <em>Editor Column Span</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Editor Column Span</em>' attribute.
     * @see #getEditorColumnSpan()
     * @generated
     */
    void setEditorColumnSpan( int value );

}
