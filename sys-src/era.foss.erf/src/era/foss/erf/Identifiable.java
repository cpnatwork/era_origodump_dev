package era.foss.erf;

import org.eclipse.emf.ecore.EObject;

/**
 * @model abstract="true"
 * @author schorsch
 *
 */
public interface Identifiable extends EObject {

	/**
	 * @model lowerBound="1" upperBound="1" unsettable="true" unique="true"
	 */
	public String getID();

	/**
	 * Sets the value of the '{@link era.foss.erf.Identifiable#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #isSetID()
	 * @see #unsetID()
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Unsets the value of the '{@link era.foss.erf.Identifiable#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetID()
	 * @see #getID()
	 * @see #setID(String)
	 * @generated
	 */
	void unsetID();

	/**
	 * Returns whether the value of the '{@link era.foss.erf.Identifiable#getID <em>ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID</em>' attribute is set.
	 * @see #unsetID()
	 * @see #getID()
	 * @see #setID(String)
	 * @generated
	 */
	boolean isSetID();

	/**
	 * @model default=""
	 */
	public String getDesc();

	/**
	 * Sets the value of the '{@link era.foss.erf.Identifiable#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

	/**
	 * @model default="" 
	 */
	public String getLongName();

	/**
	 * Sets the value of the '{@link era.foss.erf.Identifiable#getLongName <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Name</em>' attribute.
	 * @see #getLongName()
	 * @generated
	 */
	void setLongName(String value);
}
