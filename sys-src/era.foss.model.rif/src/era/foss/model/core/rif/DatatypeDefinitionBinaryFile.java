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
 * A representation of the model object '<em><b>Datatype Definition Binary File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getAPPLICATION <em>APPLICATION</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getEMBEDDED <em>EMBEDDED</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getFILENAMESUFFIX <em>FILENAMESUFFIX</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getFORMATNAME <em>FORMATNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getMIMETYPE <em>MIMETYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionBinaryFile()
 * @model extendedMetaData="name='DATATYPE-DEFINITION-BINARY-FILE_._type' kind='elementOnly'"
 * @generated
 */
public interface DatatypeDefinitionBinaryFile extends EObject {
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
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionBinaryFile_LONGNAME()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLONGNAME();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getLONGNAME <em>LONGNAME</em>}' attribute.
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
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionBinaryFile_DESC()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDESC();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getDESC <em>DESC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DESC</em>' attribute.
	 * @see #getDESC()
	 * @generated
	 */
	void setDESC(String value);

	/**
	 * Returns the value of the '<em><b>APPLICATION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APPLICATION</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APPLICATION</em>' attribute.
	 * @see #setAPPLICATION(String)
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionBinaryFile_APPLICATION()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='APPLICATION' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAPPLICATION();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getAPPLICATION <em>APPLICATION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APPLICATION</em>' attribute.
	 * @see #getAPPLICATION()
	 * @generated
	 */
	void setAPPLICATION(String value);

	/**
	 * Returns the value of the '<em><b>EMBEDDED</b></em>' attribute.
	 * The literals are from the enumeration {@link era.foss.model.core.rif.BOOLEAN}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EMBEDDED</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EMBEDDED</em>' attribute.
	 * @see era.foss.model.core.rif.BOOLEAN
	 * @see #isSetEMBEDDED()
	 * @see #unsetEMBEDDED()
	 * @see #setEMBEDDED(BOOLEAN)
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionBinaryFile_EMBEDDED()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EMBEDDED' namespace='##targetNamespace'"
	 * @generated
	 */
	BOOLEAN getEMBEDDED();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getEMBEDDED <em>EMBEDDED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EMBEDDED</em>' attribute.
	 * @see era.foss.model.core.rif.BOOLEAN
	 * @see #isSetEMBEDDED()
	 * @see #unsetEMBEDDED()
	 * @see #getEMBEDDED()
	 * @generated
	 */
	void setEMBEDDED(BOOLEAN value);

	/**
	 * Unsets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getEMBEDDED <em>EMBEDDED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEMBEDDED()
	 * @see #getEMBEDDED()
	 * @see #setEMBEDDED(BOOLEAN)
	 * @generated
	 */
	void unsetEMBEDDED();

	/**
	 * Returns whether the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getEMBEDDED <em>EMBEDDED</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>EMBEDDED</em>' attribute is set.
	 * @see #unsetEMBEDDED()
	 * @see #getEMBEDDED()
	 * @see #setEMBEDDED(BOOLEAN)
	 * @generated
	 */
	boolean isSetEMBEDDED();

	/**
	 * Returns the value of the '<em><b>FILENAMESUFFIX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FILENAMESUFFIX</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FILENAMESUFFIX</em>' attribute.
	 * @see #setFILENAMESUFFIX(String)
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionBinaryFile_FILENAMESUFFIX()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='FILENAME-SUFFIX' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFILENAMESUFFIX();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getFILENAMESUFFIX <em>FILENAMESUFFIX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FILENAMESUFFIX</em>' attribute.
	 * @see #getFILENAMESUFFIX()
	 * @generated
	 */
	void setFILENAMESUFFIX(String value);

	/**
	 * Returns the value of the '<em><b>FORMATNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FORMATNAME</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FORMATNAME</em>' attribute.
	 * @see #setFORMATNAME(String)
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionBinaryFile_FORMATNAME()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='FORMAT-NAME' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFORMATNAME();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getFORMATNAME <em>FORMATNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FORMATNAME</em>' attribute.
	 * @see #getFORMATNAME()
	 * @generated
	 */
	void setFORMATNAME(String value);

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
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionBinaryFile_IDENTIFIER()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIDENTIFIER();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
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
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionBinaryFile_LASTCHANGE()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLASTCHANGE();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LASTCHANGE</em>' attribute.
	 * @see #getLASTCHANGE()
	 * @generated
	 */
	void setLASTCHANGE(String value);

	/**
	 * Returns the value of the '<em><b>MIMETYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MIMETYPE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MIMETYPE</em>' attribute.
	 * @see #setMIMETYPE(String)
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionBinaryFile_MIMETYPE()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='MIME-TYPE' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMIMETYPE();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getMIMETYPE <em>MIMETYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MIMETYPE</em>' attribute.
	 * @see #getMIMETYPE()
	 * @generated
	 */
	void setMIMETYPE(String value);

} // DatatypeDefinitionBinaryFile
