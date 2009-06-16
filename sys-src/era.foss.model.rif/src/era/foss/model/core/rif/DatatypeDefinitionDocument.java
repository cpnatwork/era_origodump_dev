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
 * A representation of the model object '<em><b>Datatype Definition Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionDocument#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionDocument#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionDocument#getEMBEDDED <em>EMBEDDED</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionDocument#getFORMAT <em>FORMAT</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionDocument#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionDocument#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionDocument()
 * @model extendedMetaData="name='DATATYPE-DEFINITION-DOCUMENT_._type' kind='elementOnly'"
 * @generated
 */
public interface DatatypeDefinitionDocument extends EObject {
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
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionDocument_LONGNAME()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLONGNAME();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionDocument#getLONGNAME <em>LONGNAME</em>}' attribute.
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
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionDocument_DESC()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDESC();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionDocument#getDESC <em>DESC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DESC</em>' attribute.
	 * @see #getDESC()
	 * @generated
	 */
	void setDESC(String value);

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
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionDocument_EMBEDDED()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EMBEDDED' namespace='##targetNamespace'"
	 * @generated
	 */
	BOOLEAN getEMBEDDED();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionDocument#getEMBEDDED <em>EMBEDDED</em>}' attribute.
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
	 * Unsets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionDocument#getEMBEDDED <em>EMBEDDED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEMBEDDED()
	 * @see #getEMBEDDED()
	 * @see #setEMBEDDED(BOOLEAN)
	 * @generated
	 */
	void unsetEMBEDDED();

	/**
	 * Returns whether the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionDocument#getEMBEDDED <em>EMBEDDED</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>FORMAT</b></em>' attribute.
	 * The literals are from the enumeration {@link era.foss.model.core.rif.DATATYPEDEFINITIONDOCUMENTFORMATENUM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FORMAT</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FORMAT</em>' attribute.
	 * @see era.foss.model.core.rif.DATATYPEDEFINITIONDOCUMENTFORMATENUM
	 * @see #isSetFORMAT()
	 * @see #unsetFORMAT()
	 * @see #setFORMAT(DATATYPEDEFINITIONDOCUMENTFORMATENUM)
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionDocument_FORMAT()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='FORMAT' namespace='##targetNamespace'"
	 * @generated
	 */
	DATATYPEDEFINITIONDOCUMENTFORMATENUM getFORMAT();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionDocument#getFORMAT <em>FORMAT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FORMAT</em>' attribute.
	 * @see era.foss.model.core.rif.DATATYPEDEFINITIONDOCUMENTFORMATENUM
	 * @see #isSetFORMAT()
	 * @see #unsetFORMAT()
	 * @see #getFORMAT()
	 * @generated
	 */
	void setFORMAT(DATATYPEDEFINITIONDOCUMENTFORMATENUM value);

	/**
	 * Unsets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionDocument#getFORMAT <em>FORMAT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFORMAT()
	 * @see #getFORMAT()
	 * @see #setFORMAT(DATATYPEDEFINITIONDOCUMENTFORMATENUM)
	 * @generated
	 */
	void unsetFORMAT();

	/**
	 * Returns whether the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionDocument#getFORMAT <em>FORMAT</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>FORMAT</em>' attribute is set.
	 * @see #unsetFORMAT()
	 * @see #getFORMAT()
	 * @see #setFORMAT(DATATYPEDEFINITIONDOCUMENTFORMATENUM)
	 * @generated
	 */
	boolean isSetFORMAT();

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
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionDocument_IDENTIFIER()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIDENTIFIER();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionDocument#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
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
	 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionDocument_LASTCHANGE()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLASTCHANGE();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionDocument#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LASTCHANGE</em>' attribute.
	 * @see #getLASTCHANGE()
	 * @generated
	 */
	void setLASTCHANGE(String value);

} // DatatypeDefinitionDocument
