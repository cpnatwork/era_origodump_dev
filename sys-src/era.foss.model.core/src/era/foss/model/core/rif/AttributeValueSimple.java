/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.AttributeValueSimple#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeValueSimple#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeValueSimple#getDEFINITION <em>DEFINITION</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeValueSimple#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeValueSimple#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeValueSimple#getTHEVALUE <em>THEVALUE</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getAttributeValueSimple()
 * @model extendedMetaData="name='ATTRIBUTE-VALUE-SIMPLE_._type' kind='elementOnly'"
 * @generated
 */
public interface AttributeValueSimple extends EObject {
	/**
	 * Returns the value of the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LONGNAME</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LONGNAME</em>' attribute.
	 * @see #setLONGNAME(String)
	 * @see era.foss.model.core.rif.RifPackage#getAttributeValueSimple_LONGNAME()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLONGNAME();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeValueSimple#getLONGNAME <em>LONGNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LONGNAME</em>' attribute.
	 * @see #getLONGNAME()
	 * @generated
	 */
	void setLONGNAME(String value);

	/**
	 * Returns the value of the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DESC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DESC</em>' attribute.
	 * @see #setDESC(String)
	 * @see era.foss.model.core.rif.RifPackage#getAttributeValueSimple_DESC()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDESC();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeValueSimple#getDESC <em>DESC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DESC</em>' attribute.
	 * @see #getDESC()
	 * @generated
	 */
	void setDESC(String value);

	/**
	 * Returns the value of the '<em><b>DEFINITION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DEFINITION</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DEFINITION</em>' containment reference.
	 * @see #setDEFINITION(AttributeValueSimpleDefinition)
	 * @see era.foss.model.core.rif.RifPackage#getAttributeValueSimple_DEFINITION()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DEFINITION' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributeValueSimpleDefinition getDEFINITION();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeValueSimple#getDEFINITION <em>DEFINITION</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DEFINITION</em>' containment reference.
	 * @see #getDEFINITION()
	 * @generated
	 */
	void setDEFINITION(AttributeValueSimpleDefinition value);

	/**
	 * Returns the value of the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IDENTIFIER</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IDENTIFIER</em>' attribute.
	 * @see #setIDENTIFIER(String)
	 * @see era.foss.model.core.rif.RifPackage#getAttributeValueSimple_IDENTIFIER()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIDENTIFIER();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeValueSimple#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDENTIFIER</em>' attribute.
	 * @see #getIDENTIFIER()
	 * @generated
	 */
	void setIDENTIFIER(String value);

	/**
	 * Returns the value of the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LASTCHANGE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LASTCHANGE</em>' attribute.
	 * @see #setLASTCHANGE(String)
	 * @see era.foss.model.core.rif.RifPackage#getAttributeValueSimple_LASTCHANGE()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLASTCHANGE();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeValueSimple#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LASTCHANGE</em>' attribute.
	 * @see #getLASTCHANGE()
	 * @generated
	 */
	void setLASTCHANGE(String value);

	/**
	 * Returns the value of the '<em><b>THEVALUE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>THEVALUE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>THEVALUE</em>' attribute.
	 * @see #setTHEVALUE(String)
	 * @see era.foss.model.core.rif.RifPackage#getAttributeValueSimple_THEVALUE()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='THE-VALUE' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTHEVALUE();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeValueSimple#getTHEVALUE <em>THEVALUE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>THEVALUE</em>' attribute.
	 * @see #getTHEVALUE()
	 * @generated
	 */
	void setTHEVALUE(String value);

} // AttributeValueSimple
