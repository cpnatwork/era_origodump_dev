/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype Definition String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionString#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionString#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionString#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionString#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionString#getMAXLENGTH <em>MAXLENGTH</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionString()
 * @model extendedMetaData="name='DATATYPE-DEFINITION-STRING_._type' kind='elementOnly'"
 * @generated
 */
public interface DatatypeDefinitionString extends EObject {
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
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionString_LONGNAME()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLONGNAME();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionString#getLONGNAME <em>LONGNAME</em>}' attribute.
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
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionString_DESC()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDESC();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionString#getDESC <em>DESC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DESC</em>' attribute.
	 * @see #getDESC()
	 * @generated
	 */
	void setDESC(String value);

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
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionString_IDENTIFIER()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIDENTIFIER();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionString#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
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
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionString_LASTCHANGE()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLASTCHANGE();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionString#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LASTCHANGE</em>' attribute.
	 * @see #getLASTCHANGE()
	 * @generated
	 */
	void setLASTCHANGE(String value);

	/**
	 * Returns the value of the '<em><b>MAXLENGTH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MAXLENGTH</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MAXLENGTH</em>' attribute.
	 * @see #setMAXLENGTH(BigInteger)
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionString_MAXLENGTH()
	 * @model dataType="era.foss.model.core.rif.INTEGER"
	 *        extendedMetaData="kind='element' name='MAX-LENGTH' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMAXLENGTH();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionString#getMAXLENGTH <em>MAXLENGTH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MAXLENGTH</em>' attribute.
	 * @see #getMAXLENGTH()
	 * @generated
	 */
	void setMAXLENGTH(BigInteger value);

} // DatatypeDefinitionString
