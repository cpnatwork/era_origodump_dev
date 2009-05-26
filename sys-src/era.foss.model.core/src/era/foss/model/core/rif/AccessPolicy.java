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
 * A representation of the model object '<em><b>Access Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.AccessPolicy#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AccessPolicy#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AccessPolicy#getACCESSMODE <em>ACCESSMODE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AccessPolicy#getATTRIBUTEDEFINITIONS <em>ATTRIBUTEDEFINITIONS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AccessPolicy#getATTRIBUTEVALUES <em>ATTRIBUTEVALUES</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AccessPolicy#getDATATYPEDEFINITIONS <em>DATATYPEDEFINITIONS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AccessPolicy#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AccessPolicy#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AccessPolicy#getRELATIONGROUPS <em>RELATIONGROUPS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AccessPolicy#getSPECGROUPS <em>SPECGROUPS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AccessPolicy#getSPECHIERARCHIES <em>SPECHIERARCHIES</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AccessPolicy#getSPECHIERARCHYROOTS <em>SPECHIERARCHYROOTS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AccessPolicy#getSPECOBJECTS <em>SPECOBJECTS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AccessPolicy#getSPECRELATIONS <em>SPECRELATIONS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.AccessPolicy#getSPECTYPES <em>SPECTYPES</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getAccessPolicy()
 * @model extendedMetaData="name='ACCESS-POLICY_._type' kind='elementOnly'"
 * @generated
 */
public interface AccessPolicy extends EObject {
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
     * @see era.foss.model.core.rif.RifPackage#getAccessPolicy_LONGNAME()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
     * @generated
     */
    String getLONGNAME();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.AccessPolicy#getLONGNAME <em>LONGNAME</em>}' attribute.
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
     * @see era.foss.model.core.rif.RifPackage#getAccessPolicy_DESC()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
     * @generated
     */
    String getDESC();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.AccessPolicy#getDESC <em>DESC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESC</em>' attribute.
     * @see #getDESC()
     * @generated
     */
    void setDESC( String value );

    /**
     * Returns the value of the '<em><b>ACCESSMODE</b></em>' attribute.
     * The literals are from the enumeration {@link era.foss.model.core.rif.ACCESSPOLICYACCESSMODEENUM}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ACCESSMODE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ACCESSMODE</em>' attribute.
     * @see era.foss.model.core.rif.ACCESSPOLICYACCESSMODEENUM
     * @see #isSetACCESSMODE()
     * @see #unsetACCESSMODE()
     * @see #setACCESSMODE(ACCESSPOLICYACCESSMODEENUM)
     * @see era.foss.model.core.rif.RifPackage#getAccessPolicy_ACCESSMODE()
     * @model unsettable="true"
     *        extendedMetaData="kind='element' name='ACCESS-MODE' namespace='##targetNamespace'"
     * @generated
     */
    ACCESSPOLICYACCESSMODEENUM getACCESSMODE();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.AccessPolicy#getACCESSMODE <em>ACCESSMODE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ACCESSMODE</em>' attribute.
     * @see era.foss.model.core.rif.ACCESSPOLICYACCESSMODEENUM
     * @see #isSetACCESSMODE()
     * @see #unsetACCESSMODE()
     * @see #getACCESSMODE()
     * @generated
     */
    void setACCESSMODE( ACCESSPOLICYACCESSMODEENUM value );

    /**
     * Unsets the value of the '{@link era.foss.model.core.rif.AccessPolicy#getACCESSMODE <em>ACCESSMODE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetACCESSMODE()
     * @see #getACCESSMODE()
     * @see #setACCESSMODE(ACCESSPOLICYACCESSMODEENUM)
     * @generated
     */
    void unsetACCESSMODE();

    /**
     * Returns whether the value of the '{@link era.foss.model.core.rif.AccessPolicy#getACCESSMODE <em>ACCESSMODE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ACCESSMODE</em>' attribute is set.
     * @see #unsetACCESSMODE()
     * @see #getACCESSMODE()
     * @see #setACCESSMODE(ACCESSPOLICYACCESSMODEENUM)
     * @generated
     */
    boolean isSetACCESSMODE();

    /**
     * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ATTRIBUTEDEFINITIONS</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ATTRIBUTEDEFINITIONS</em>' containment reference.
     * @see #setATTRIBUTEDEFINITIONS(AttributeDefinitions)
     * @see era.foss.model.core.rif.RifPackage#getAccessPolicy_ATTRIBUTEDEFINITIONS()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITIONS' namespace='##targetNamespace'"
     * @generated
     */
    AttributeDefinitions getATTRIBUTEDEFINITIONS();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.AccessPolicy#getATTRIBUTEDEFINITIONS <em>ATTRIBUTEDEFINITIONS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ATTRIBUTEDEFINITIONS</em>' containment reference.
     * @see #getATTRIBUTEDEFINITIONS()
     * @generated
     */
    void setATTRIBUTEDEFINITIONS( AttributeDefinitions value );

    /**
     * Returns the value of the '<em><b>ATTRIBUTEVALUES</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ATTRIBUTEVALUES</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ATTRIBUTEVALUES</em>' containment reference.
     * @see #setATTRIBUTEVALUES(AttributeValues)
     * @see era.foss.model.core.rif.RifPackage#getAccessPolicy_ATTRIBUTEVALUES()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUES' namespace='##targetNamespace'"
     * @generated
     */
    AttributeValues getATTRIBUTEVALUES();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.AccessPolicy#getATTRIBUTEVALUES <em>ATTRIBUTEVALUES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ATTRIBUTEVALUES</em>' containment reference.
     * @see #getATTRIBUTEVALUES()
     * @generated
     */
    void setATTRIBUTEVALUES( AttributeValues value );

    /**
     * Returns the value of the '<em><b>DATATYPEDEFINITIONS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DATATYPEDEFINITIONS</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DATATYPEDEFINITIONS</em>' containment reference.
     * @see #setDATATYPEDEFINITIONS(DatatypeDefinitions)
     * @see era.foss.model.core.rif.RifPackage#getAccessPolicy_DATATYPEDEFINITIONS()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='DATATYPE-DEFINITIONS' namespace='##targetNamespace'"
     * @generated
     */
    DatatypeDefinitions getDATATYPEDEFINITIONS();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.AccessPolicy#getDATATYPEDEFINITIONS <em>DATATYPEDEFINITIONS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DATATYPEDEFINITIONS</em>' containment reference.
     * @see #getDATATYPEDEFINITIONS()
     * @generated
     */
    void setDATATYPEDEFINITIONS( DatatypeDefinitions value );

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
     * @see era.foss.model.core.rif.RifPackage#getAccessPolicy_IDENTIFIER()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
     * @generated
     */
    String getIDENTIFIER();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.AccessPolicy#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
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
     * @see era.foss.model.core.rif.RifPackage#getAccessPolicy_LASTCHANGE()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
     * @generated
     */
    String getLASTCHANGE();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.AccessPolicy#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>LASTCHANGE</em>' attribute.
     * @see #getLASTCHANGE()
     * @generated
     */
    void setLASTCHANGE( String value );

    /**
     * Returns the value of the '<em><b>RELATIONGROUPS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RELATIONGROUPS</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RELATIONGROUPS</em>' containment reference.
     * @see #setRELATIONGROUPS(AccessPolicyRelationGroups)
     * @see era.foss.model.core.rif.RifPackage#getAccessPolicy_RELATIONGROUPS()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='RELATION-GROUPS' namespace='##targetNamespace'"
     * @generated
     */
    AccessPolicyRelationGroups getRELATIONGROUPS();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.AccessPolicy#getRELATIONGROUPS <em>RELATIONGROUPS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RELATIONGROUPS</em>' containment reference.
     * @see #getRELATIONGROUPS()
     * @generated
     */
    void setRELATIONGROUPS( AccessPolicyRelationGroups value );

    /**
     * Returns the value of the '<em><b>SPECGROUPS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SPECGROUPS</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SPECGROUPS</em>' containment reference.
     * @see #setSPECGROUPS(AccessPolicySpecGroups)
     * @see era.foss.model.core.rif.RifPackage#getAccessPolicy_SPECGROUPS()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SPEC-GROUPS' namespace='##targetNamespace'"
     * @generated
     */
    AccessPolicySpecGroups getSPECGROUPS();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.AccessPolicy#getSPECGROUPS <em>SPECGROUPS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SPECGROUPS</em>' containment reference.
     * @see #getSPECGROUPS()
     * @generated
     */
    void setSPECGROUPS( AccessPolicySpecGroups value );

    /**
     * Returns the value of the '<em><b>SPECHIERARCHIES</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SPECHIERARCHIES</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SPECHIERARCHIES</em>' containment reference.
     * @see #setSPECHIERARCHIES(SpecHierarchies)
     * @see era.foss.model.core.rif.RifPackage#getAccessPolicy_SPECHIERARCHIES()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SPEC-HIERARCHIES' namespace='##targetNamespace'"
     * @generated
     */
    SpecHierarchies getSPECHIERARCHIES();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.AccessPolicy#getSPECHIERARCHIES <em>SPECHIERARCHIES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SPECHIERARCHIES</em>' containment reference.
     * @see #getSPECHIERARCHIES()
     * @generated
     */
    void setSPECHIERARCHIES( SpecHierarchies value );

    /**
     * Returns the value of the '<em><b>SPECHIERARCHYROOTS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SPECHIERARCHYROOTS</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SPECHIERARCHYROOTS</em>' containment reference.
     * @see #setSPECHIERARCHYROOTS(AccessPolicySpecHierarchyRoots)
     * @see era.foss.model.core.rif.RifPackage#getAccessPolicy_SPECHIERARCHYROOTS()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SPEC-HIERARCHY-ROOTS' namespace='##targetNamespace'"
     * @generated
     */
    AccessPolicySpecHierarchyRoots getSPECHIERARCHYROOTS();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.AccessPolicy#getSPECHIERARCHYROOTS <em>SPECHIERARCHYROOTS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SPECHIERARCHYROOTS</em>' containment reference.
     * @see #getSPECHIERARCHYROOTS()
     * @generated
     */
    void setSPECHIERARCHYROOTS( AccessPolicySpecHierarchyRoots value );

    /**
     * Returns the value of the '<em><b>SPECOBJECTS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SPECOBJECTS</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SPECOBJECTS</em>' containment reference.
     * @see #setSPECOBJECTS(AccessPolicySpecObjects)
     * @see era.foss.model.core.rif.RifPackage#getAccessPolicy_SPECOBJECTS()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SPEC-OBJECTS' namespace='##targetNamespace'"
     * @generated
     */
    AccessPolicySpecObjects getSPECOBJECTS();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.AccessPolicy#getSPECOBJECTS <em>SPECOBJECTS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SPECOBJECTS</em>' containment reference.
     * @see #getSPECOBJECTS()
     * @generated
     */
    void setSPECOBJECTS( AccessPolicySpecObjects value );

    /**
     * Returns the value of the '<em><b>SPECRELATIONS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SPECRELATIONS</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SPECRELATIONS</em>' containment reference.
     * @see #setSPECRELATIONS(AccessPolicySpecRelations)
     * @see era.foss.model.core.rif.RifPackage#getAccessPolicy_SPECRELATIONS()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SPEC-RELATIONS' namespace='##targetNamespace'"
     * @generated
     */
    AccessPolicySpecRelations getSPECRELATIONS();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.AccessPolicy#getSPECRELATIONS <em>SPECRELATIONS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SPECRELATIONS</em>' containment reference.
     * @see #getSPECRELATIONS()
     * @generated
     */
    void setSPECRELATIONS( AccessPolicySpecRelations value );

    /**
     * Returns the value of the '<em><b>SPECTYPES</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SPECTYPES</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SPECTYPES</em>' containment reference.
     * @see #setSPECTYPES(AccessPolicySpecTypes)
     * @see era.foss.model.core.rif.RifPackage#getAccessPolicy_SPECTYPES()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SPEC-TYPES' namespace='##targetNamespace'"
     * @generated
     */
    AccessPolicySpecTypes getSPECTYPES();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.AccessPolicy#getSPECTYPES <em>SPECTYPES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SPECTYPES</em>' containment reference.
     * @see #getSPECTYPES()
     * @generated
     */
    void setSPECTYPES( AccessPolicySpecTypes value );

} // AccessPolicy
