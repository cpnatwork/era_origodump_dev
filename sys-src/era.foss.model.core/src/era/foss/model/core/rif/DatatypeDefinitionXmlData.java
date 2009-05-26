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
 * A representation of the model object '<em><b>Datatype Definition Xml Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionXmlData#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionXmlData#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionXmlData#getEMBEDDED <em>EMBEDDED</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionXmlData#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionXmlData#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionXmlData#getNAMESPACEURI <em>NAMESPACEURI</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionXmlData#getSCHEMALOCATION <em>SCHEMALOCATION</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionXmlData()
 * @model extendedMetaData="name='DATATYPE-DEFINITION-XML-DATA_._type' kind='elementOnly'"
 * @generated
 */
public interface DatatypeDefinitionXmlData extends EObject {
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
     * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionXmlData_LONGNAME()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
     * @generated
     */
    String getLONGNAME();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionXmlData#getLONGNAME <em>LONGNAME</em>}' attribute.
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
     * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionXmlData_DESC()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
     * @generated
     */
    String getDESC();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionXmlData#getDESC <em>DESC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESC</em>' attribute.
     * @see #getDESC()
     * @generated
     */
    void setDESC( String value );

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
     * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionXmlData_EMBEDDED()
     * @model unsettable="true"
     *        extendedMetaData="kind='element' name='EMBEDDED' namespace='##targetNamespace'"
     * @generated
     */
    BOOLEAN getEMBEDDED();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionXmlData#getEMBEDDED <em>EMBEDDED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EMBEDDED</em>' attribute.
     * @see era.foss.model.core.rif.BOOLEAN
     * @see #isSetEMBEDDED()
     * @see #unsetEMBEDDED()
     * @see #getEMBEDDED()
     * @generated
     */
    void setEMBEDDED( BOOLEAN value );

    /**
     * Unsets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionXmlData#getEMBEDDED <em>EMBEDDED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEMBEDDED()
     * @see #getEMBEDDED()
     * @see #setEMBEDDED(BOOLEAN)
     * @generated
     */
    void unsetEMBEDDED();

    /**
     * Returns whether the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionXmlData#getEMBEDDED <em>EMBEDDED</em>}' attribute is set.
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
     * Returns the value of the '<em><b>IDENTIFIER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>IDENTIFIER</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>IDENTIFIER</em>' attribute.
     * @see #setIDENTIFIER(String)
     * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionXmlData_IDENTIFIER()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
     * @generated
     */
    String getIDENTIFIER();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionXmlData#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
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
     * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionXmlData_LASTCHANGE()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
     * @generated
     */
    String getLASTCHANGE();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionXmlData#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>LASTCHANGE</em>' attribute.
     * @see #getLASTCHANGE()
     * @generated
     */
    void setLASTCHANGE( String value );

    /**
     * Returns the value of the '<em><b>NAMESPACEURI</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>NAMESPACEURI</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>NAMESPACEURI</em>' attribute.
     * @see #setNAMESPACEURI(String)
     * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionXmlData_NAMESPACEURI()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='NAME-SPACE-URI' namespace='##targetNamespace'"
     * @generated
     */
    String getNAMESPACEURI();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionXmlData#getNAMESPACEURI <em>NAMESPACEURI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAMESPACEURI</em>' attribute.
     * @see #getNAMESPACEURI()
     * @generated
     */
    void setNAMESPACEURI( String value );

    /**
     * Returns the value of the '<em><b>SCHEMALOCATION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SCHEMALOCATION</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SCHEMALOCATION</em>' attribute.
     * @see #setSCHEMALOCATION(String)
     * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionXmlData_SCHEMALOCATION()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='SCHEMA-LOCATION' namespace='##targetNamespace'"
     * @generated
     */
    String getSCHEMALOCATION();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionXmlData#getSCHEMALOCATION <em>SCHEMALOCATION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SCHEMALOCATION</em>' attribute.
     * @see #getSCHEMALOCATION()
     * @generated
     */
    void setSCHEMALOCATION( String value );

} // DatatypeDefinitionXmlData
