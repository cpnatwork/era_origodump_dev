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
 * A representation of the model object '<em><b>Attribute Value File Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.AttributeValueFileReference#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeValueFileReference#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeValueFileReference#getDEFINITION <em>DEFINITION</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeValueFileReference#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeValueFileReference#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeValueFileReference#getPATHTOFILE <em>PATHTOFILE</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getAttributeValueFileReference()
 * @model extendedMetaData="name='ATTRIBUTE-VALUE-FILE-REFERENCE_._type' kind='elementOnly'"
 * @generated
 */
public interface AttributeValueFileReference extends EObject {
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
	 * @see era.foss.model.core.rif.RifPackage#getAttributeValueFileReference_LONGNAME()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLONGNAME();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeValueFileReference#getLONGNAME <em>LONGNAME</em>}' attribute.
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
	 * @see era.foss.model.core.rif.RifPackage#getAttributeValueFileReference_DESC()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDESC();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeValueFileReference#getDESC <em>DESC</em>}' attribute.
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
	 * @see #setDEFINITION(AttributeValueFileReferenceDefinition)
	 * @see era.foss.model.core.rif.RifPackage#getAttributeValueFileReference_DEFINITION()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DEFINITION' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributeValueFileReferenceDefinition getDEFINITION();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeValueFileReference#getDEFINITION <em>DEFINITION</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DEFINITION</em>' containment reference.
	 * @see #getDEFINITION()
	 * @generated
	 */
	void setDEFINITION(AttributeValueFileReferenceDefinition value);

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
	 * @see era.foss.model.core.rif.RifPackage#getAttributeValueFileReference_IDENTIFIER()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIDENTIFIER();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeValueFileReference#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
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
	 * @see era.foss.model.core.rif.RifPackage#getAttributeValueFileReference_LASTCHANGE()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLASTCHANGE();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeValueFileReference#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LASTCHANGE</em>' attribute.
	 * @see #getLASTCHANGE()
	 * @generated
	 */
	void setLASTCHANGE(String value);

	/**
	 * Returns the value of the '<em><b>PATHTOFILE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PATHTOFILE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PATHTOFILE</em>' attribute.
	 * @see #setPATHTOFILE(String)
	 * @see era.foss.model.core.rif.RifPackage#getAttributeValueFileReference_PATHTOFILE()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='PATH-TO-FILE' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPATHTOFILE();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeValueFileReference#getPATHTOFILE <em>PATHTOFILE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PATHTOFILE</em>' attribute.
	 * @see #getPATHTOFILE()
	 * @generated
	 */
	void setPATHTOFILE(String value);

} // AttributeValueFileReference
