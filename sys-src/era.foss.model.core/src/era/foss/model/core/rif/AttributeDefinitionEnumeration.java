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
 * A representation of the model object '<em><b>Attribute Definition Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitionEnumeration#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitionEnumeration#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitionEnumeration#getDEFAULTVALUE <em>DEFAULTVALUE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitionEnumeration#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitionEnumeration#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitionEnumeration#getMULTIVALUED <em>MULTIVALUED</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitionEnumeration#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionEnumeration()
 * @model extendedMetaData="name='ATTRIBUTE-DEFINITION-ENUMERATION_._type' kind='elementOnly'"
 * @generated
 */
public interface AttributeDefinitionEnumeration extends EObject {
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
     * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionEnumeration_LONGNAME()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
     * @generated
     */
    String getLONGNAME();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.AttributeDefinitionEnumeration#getLONGNAME <em>LONGNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>LONGNAME</em>' attribute.
     * @see #getLONGNAME()
     * @generated
     */
    void setLONGNAME( String value );

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
     * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionEnumeration_DESC()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
     * @generated
     */
    String getDESC();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.AttributeDefinitionEnumeration#getDESC <em>DESC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESC</em>' attribute.
     * @see #getDESC()
     * @generated
     */
    void setDESC( String value );

    /**
     * Returns the value of the '<em><b>DEFAULTVALUE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DEFAULTVALUE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DEFAULTVALUE</em>' containment reference.
     * @see #setDEFAULTVALUE(AttributeDefinitionEnumerationDefaultValue)
     * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionEnumeration_DEFAULTVALUE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='DEFAULT-VALUE' namespace='##targetNamespace'"
     * @generated
     */
    AttributeDefinitionEnumerationDefaultValue getDEFAULTVALUE();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.AttributeDefinitionEnumeration#getDEFAULTVALUE <em>DEFAULTVALUE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DEFAULTVALUE</em>' containment reference.
     * @see #getDEFAULTVALUE()
     * @generated
     */
    void setDEFAULTVALUE( AttributeDefinitionEnumerationDefaultValue value );

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
     * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionEnumeration_IDENTIFIER()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
     * @generated
     */
    String getIDENTIFIER();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.AttributeDefinitionEnumeration#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>IDENTIFIER</em>' attribute.
     * @see #getIDENTIFIER()
     * @generated
     */
    void setIDENTIFIER( String value );

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
     * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionEnumeration_LASTCHANGE()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
     * @generated
     */
    String getLASTCHANGE();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.AttributeDefinitionEnumeration#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>LASTCHANGE</em>' attribute.
     * @see #getLASTCHANGE()
     * @generated
     */
    void setLASTCHANGE( String value );

    /**
     * Returns the value of the '<em><b>MULTIVALUED</b></em>' attribute.
     * The literals are from the enumeration {@link era.foss.model.core.rif.BOOLEAN}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MULTIVALUED</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MULTIVALUED</em>' attribute.
     * @see era.foss.model.core.rif.BOOLEAN
     * @see #isSetMULTIVALUED()
     * @see #unsetMULTIVALUED()
     * @see #setMULTIVALUED(BOOLEAN)
     * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionEnumeration_MULTIVALUED()
     * @model unsettable="true"
     *        extendedMetaData="kind='element' name='MULTI-VALUED' namespace='##targetNamespace'"
     * @generated
     */
    BOOLEAN getMULTIVALUED();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.AttributeDefinitionEnumeration#getMULTIVALUED <em>MULTIVALUED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MULTIVALUED</em>' attribute.
     * @see era.foss.model.core.rif.BOOLEAN
     * @see #isSetMULTIVALUED()
     * @see #unsetMULTIVALUED()
     * @see #getMULTIVALUED()
     * @generated
     */
    void setMULTIVALUED( BOOLEAN value );

    /**
     * Unsets the value of the '{@link era.foss.model.core.rif.AttributeDefinitionEnumeration#getMULTIVALUED <em>MULTIVALUED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMULTIVALUED()
     * @see #getMULTIVALUED()
     * @see #setMULTIVALUED(BOOLEAN)
     * @generated
     */
    void unsetMULTIVALUED();

    /**
     * Returns whether the value of the '{@link era.foss.model.core.rif.AttributeDefinitionEnumeration#getMULTIVALUED <em>MULTIVALUED</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>MULTIVALUED</em>' attribute is set.
     * @see #unsetMULTIVALUED()
     * @see #getMULTIVALUED()
     * @see #setMULTIVALUED(BOOLEAN)
     * @generated
     */
    boolean isSetMULTIVALUED();

    /**
     * Returns the value of the '<em><b>TYPE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TYPE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TYPE</em>' containment reference.
     * @see #setTYPE(AttributeDefinitionEnumerationType)
     * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionEnumeration_TYPE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='TYPE' namespace='##targetNamespace'"
     * @generated
     */
    AttributeDefinitionEnumerationType getTYPE();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.AttributeDefinitionEnumeration#getTYPE <em>TYPE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TYPE</em>' containment reference.
     * @see #getTYPE()
     * @generated
     */
    void setTYPE( AttributeDefinitionEnumerationType value );

} // AttributeDefinitionEnumeration
