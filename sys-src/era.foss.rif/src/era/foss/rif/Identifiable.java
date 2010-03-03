package era.foss.rif;

import org.eclipse.emf.ecore.EObject;

/**
 * @model abstract="true"
 * @author schorsch
 *
 */
public interface Identifiable extends EObject {

    /**
     * @model lowerBound="1" upperBound="1"
     */
    public String getID();

    /**
     * Sets the value of the '{@link era.foss.rif.Identifiable#getID <em>ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ID</em>' attribute.
     * @see #getID()
     * @generated
     */
    void setID( String value );

    /**
     * @model default=""
     */
    public String getDesc();

    /**
     * Sets the value of the '{@link era.foss.rif.Identifiable#getDesc <em>Desc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Desc</em>' attribute.
     * @see #getDesc()
     * @generated
     */
    void setDesc( String value );

    /**
     * @model default="" 
     */
    public String getLongName();

    /**
     * Sets the value of the '{@link era.foss.rif.Identifiable#getLongName <em>Long Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Long Name</em>' attribute.
     * @see #getLongName()
     * @generated
     */
    void setLongName( String value );
}
