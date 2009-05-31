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
 * A representation of the model object '<em><b>Attribute Definition Complex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitionComplex#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitionComplex#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitionComplex#getDEFAULTVALUE <em>DEFAULTVALUE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitionComplex#getDEFAULTVALUE2 <em>DEFAULTVALUE2</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitionComplex#getDEFAULTVALUE3 <em>DEFAULTVALUE3</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitionComplex#getDEFAULTVALUE4 <em>DEFAULTVALUE4</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitionComplex#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitionComplex#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitionComplex#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionComplex()
 * @model extendedMetaData="name='ATTRIBUTE-DEFINITION-COMPLEX_._type' kind='elementOnly'"
 * @generated
 */
public interface AttributeDefinitionComplex extends EObject {
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
	 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionComplex_LONGNAME()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLONGNAME();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeDefinitionComplex#getLONGNAME <em>LONGNAME</em>}' attribute.
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
	 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionComplex_DESC()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDESC();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeDefinitionComplex#getDESC <em>DESC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DESC</em>' attribute.
	 * @see #getDESC()
	 * @generated
	 */
	void setDESC(String value);

	/**
	 * Returns the value of the '<em><b>DEFAULTVALUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DEFAULTVALUE</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DEFAULTVALUE</em>' containment reference.
	 * @see #setDEFAULTVALUE(AttributeDefinitionComplexDefaultValue)
	 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionComplex_DEFAULTVALUE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DEFAULT-VALUE' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributeDefinitionComplexDefaultValue getDEFAULTVALUE();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeDefinitionComplex#getDEFAULTVALUE <em>DEFAULTVALUE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DEFAULTVALUE</em>' containment reference.
	 * @see #getDEFAULTVALUE()
	 * @generated
	 */
	void setDEFAULTVALUE(AttributeDefinitionComplexDefaultValue value);

	/**
	 * Returns the value of the '<em><b>DEFAULTVALUE2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DEFAULTVALUE2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DEFAULTVALUE2</em>' containment reference.
	 * @see #setDEFAULTVALUE2(DefaultValue2)
	 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionComplex_DEFAULTVALUE2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DEFAULT-VALUE2' namespace='##targetNamespace'"
	 * @generated
	 */
	DefaultValue2 getDEFAULTVALUE2();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeDefinitionComplex#getDEFAULTVALUE2 <em>DEFAULTVALUE2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DEFAULTVALUE2</em>' containment reference.
	 * @see #getDEFAULTVALUE2()
	 * @generated
	 */
	void setDEFAULTVALUE2(DefaultValue2 value);

	/**
	 * Returns the value of the '<em><b>DEFAULTVALUE3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DEFAULTVALUE3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DEFAULTVALUE3</em>' containment reference.
	 * @see #setDEFAULTVALUE3(DefaultValue3)
	 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionComplex_DEFAULTVALUE3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DEFAULT-VALUE3' namespace='##targetNamespace'"
	 * @generated
	 */
	DefaultValue3 getDEFAULTVALUE3();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeDefinitionComplex#getDEFAULTVALUE3 <em>DEFAULTVALUE3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DEFAULTVALUE3</em>' containment reference.
	 * @see #getDEFAULTVALUE3()
	 * @generated
	 */
	void setDEFAULTVALUE3(DefaultValue3 value);

	/**
	 * Returns the value of the '<em><b>DEFAULTVALUE4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DEFAULTVALUE4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DEFAULTVALUE4</em>' containment reference.
	 * @see #setDEFAULTVALUE4(DefaultValue4)
	 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionComplex_DEFAULTVALUE4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DEFAULT-VALUE4' namespace='##targetNamespace'"
	 * @generated
	 */
	DefaultValue4 getDEFAULTVALUE4();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeDefinitionComplex#getDEFAULTVALUE4 <em>DEFAULTVALUE4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DEFAULTVALUE4</em>' containment reference.
	 * @see #getDEFAULTVALUE4()
	 * @generated
	 */
	void setDEFAULTVALUE4(DefaultValue4 value);

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
	 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionComplex_IDENTIFIER()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIDENTIFIER();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeDefinitionComplex#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
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
	 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionComplex_LASTCHANGE()
	 * @model dataType="era.foss.model.core.rif.STRING"
	 *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLASTCHANGE();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeDefinitionComplex#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LASTCHANGE</em>' attribute.
	 * @see #getLASTCHANGE()
	 * @generated
	 */
	void setLASTCHANGE(String value);

	/**
	 * Returns the value of the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TYPE</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TYPE</em>' containment reference.
	 * @see #setTYPE(AttributeDefinitionComplexType)
	 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionComplex_TYPE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TYPE' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributeDefinitionComplexType getTYPE();

	/**
	 * Sets the value of the '{@link era.foss.model.core.rif.AttributeDefinitionComplex#getTYPE <em>TYPE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TYPE</em>' containment reference.
	 * @see #getTYPE()
	 * @generated
	 */
	void setTYPE(AttributeDefinitionComplexType value);

} // AttributeDefinitionComplex
