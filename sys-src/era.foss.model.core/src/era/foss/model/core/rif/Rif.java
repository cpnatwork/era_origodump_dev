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
 * A representation of the model object '<em><b>Rif</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.Rif#getSPECHIERARCHYROOTS <em>SPECHIERARCHYROOTS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.Rif#getACCESSPOLICIES <em>ACCESSPOLICIES</em>}</li>
 *   <li>{@link era.foss.model.core.rif.Rif#getAUTHOR <em>AUTHOR</em>}</li>
 *   <li>{@link era.foss.model.core.rif.Rif#getCOMMENT <em>COMMENT</em>}</li>
 *   <li>{@link era.foss.model.core.rif.Rif#getCOUNTRYCODE <em>COUNTRYCODE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.Rif#getCREATIONTIME <em>CREATIONTIME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.Rif#getDATATYPES <em>DATATYPES</em>}</li>
 *   <li>{@link era.foss.model.core.rif.Rif#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.Rif#getSOURCETOOLID <em>SOURCETOOLID</em>}</li>
 *   <li>{@link era.foss.model.core.rif.Rif#getSPECGROUPS <em>SPECGROUPS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.Rif#getSPECOBJECTS <em>SPECOBJECTS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.Rif#getSPECRELATIONS <em>SPECRELATIONS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.Rif#getSPECTYPES <em>SPECTYPES</em>}</li>
 *   <li>{@link era.foss.model.core.rif.Rif#getTITLE <em>TITLE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.Rif#getVERSION <em>VERSION</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getRif()
 * @model extendedMetaData="name='RIF_._type' kind='elementOnly'"
 * @generated
 */
public interface Rif extends EObject {
    /**
     * Returns the value of the '<em><b>SPECHIERARCHYROOTS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SPECHIERARCHYROOTS</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SPECHIERARCHYROOTS</em>' containment reference.
     * @see #setSPECHIERARCHYROOTS(RifSpecHierarchyRoots)
     * @see era.foss.model.core.rif.RifPackage#getRif_SPECHIERARCHYROOTS()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SPEC-HIERARCHY-ROOTS' namespace='##targetNamespace'"
     * @generated
     */
    RifSpecHierarchyRoots getSPECHIERARCHYROOTS();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.Rif#getSPECHIERARCHYROOTS <em>SPECHIERARCHYROOTS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SPECHIERARCHYROOTS</em>' containment reference.
     * @see #getSPECHIERARCHYROOTS()
     * @generated
     */
    void setSPECHIERARCHYROOTS( RifSpecHierarchyRoots value );

    /**
     * Returns the value of the '<em><b>ACCESSPOLICIES</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ACCESSPOLICIES</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ACCESSPOLICIES</em>' containment reference.
     * @see #setACCESSPOLICIES(AccessPolicies)
     * @see era.foss.model.core.rif.RifPackage#getRif_ACCESSPOLICIES()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ACCESS-POLICIES' namespace='##targetNamespace'"
     * @generated
     */
    AccessPolicies getACCESSPOLICIES();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.Rif#getACCESSPOLICIES <em>ACCESSPOLICIES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ACCESSPOLICIES</em>' containment reference.
     * @see #getACCESSPOLICIES()
     * @generated
     */
    void setACCESSPOLICIES( AccessPolicies value );

    /**
     * Returns the value of the '<em><b>AUTHOR</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>AUTHOR</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>AUTHOR</em>' attribute.
     * @see #setAUTHOR(String)
     * @see era.foss.model.core.rif.RifPackage#getRif_AUTHOR()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='AUTHOR' namespace='##targetNamespace'"
     * @generated
     */
    String getAUTHOR();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.Rif#getAUTHOR <em>AUTHOR</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>AUTHOR</em>' attribute.
     * @see #getAUTHOR()
     * @generated
     */
    void setAUTHOR( String value );

    /**
     * Returns the value of the '<em><b>COMMENT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>COMMENT</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>COMMENT</em>' attribute.
     * @see #setCOMMENT(String)
     * @see era.foss.model.core.rif.RifPackage#getRif_COMMENT()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='COMMENT' namespace='##targetNamespace'"
     * @generated
     */
    String getCOMMENT();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.Rif#getCOMMENT <em>COMMENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>COMMENT</em>' attribute.
     * @see #getCOMMENT()
     * @generated
     */
    void setCOMMENT( String value );

    /**
     * Returns the value of the '<em><b>COUNTRYCODE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>COUNTRYCODE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>COUNTRYCODE</em>' attribute.
     * @see #setCOUNTRYCODE(String)
     * @see era.foss.model.core.rif.RifPackage#getRif_COUNTRYCODE()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='COUNTRY-CODE' namespace='##targetNamespace'"
     * @generated
     */
    String getCOUNTRYCODE();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.Rif#getCOUNTRYCODE <em>COUNTRYCODE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>COUNTRYCODE</em>' attribute.
     * @see #getCOUNTRYCODE()
     * @generated
     */
    void setCOUNTRYCODE( String value );

    /**
     * Returns the value of the '<em><b>CREATIONTIME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CREATIONTIME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CREATIONTIME</em>' attribute.
     * @see #setCREATIONTIME(String)
     * @see era.foss.model.core.rif.RifPackage#getRif_CREATIONTIME()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='CREATION-TIME' namespace='##targetNamespace'"
     * @generated
     */
    String getCREATIONTIME();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.Rif#getCREATIONTIME <em>CREATIONTIME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CREATIONTIME</em>' attribute.
     * @see #getCREATIONTIME()
     * @generated
     */
    void setCREATIONTIME( String value );

    /**
     * Returns the value of the '<em><b>DATATYPES</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DATATYPES</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DATATYPES</em>' containment reference.
     * @see #setDATATYPES(Datatypes)
     * @see era.foss.model.core.rif.RifPackage#getRif_DATATYPES()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='DATATYPES' namespace='##targetNamespace'"
     * @generated
     */
    Datatypes getDATATYPES();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.Rif#getDATATYPES <em>DATATYPES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DATATYPES</em>' containment reference.
     * @see #getDATATYPES()
     * @generated
     */
    void setDATATYPES( Datatypes value );

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
     * @see era.foss.model.core.rif.RifPackage#getRif_IDENTIFIER()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
     * @generated
     */
    String getIDENTIFIER();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.Rif#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>IDENTIFIER</em>' attribute.
     * @see #getIDENTIFIER()
     * @generated
     */
    void setIDENTIFIER( String value );

    /**
     * Returns the value of the '<em><b>SOURCETOOLID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SOURCETOOLID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SOURCETOOLID</em>' attribute.
     * @see #setSOURCETOOLID(String)
     * @see era.foss.model.core.rif.RifPackage#getRif_SOURCETOOLID()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='SOURCE-TOOL-ID' namespace='##targetNamespace'"
     * @generated
     */
    String getSOURCETOOLID();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.Rif#getSOURCETOOLID <em>SOURCETOOLID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SOURCETOOLID</em>' attribute.
     * @see #getSOURCETOOLID()
     * @generated
     */
    void setSOURCETOOLID( String value );

    /**
     * Returns the value of the '<em><b>SPECGROUPS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SPECGROUPS</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SPECGROUPS</em>' containment reference.
     * @see #setSPECGROUPS(RifSpecGroups)
     * @see era.foss.model.core.rif.RifPackage#getRif_SPECGROUPS()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SPEC-GROUPS' namespace='##targetNamespace'"
     * @generated
     */
    RifSpecGroups getSPECGROUPS();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.Rif#getSPECGROUPS <em>SPECGROUPS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SPECGROUPS</em>' containment reference.
     * @see #getSPECGROUPS()
     * @generated
     */
    void setSPECGROUPS( RifSpecGroups value );

    /**
     * Returns the value of the '<em><b>SPECOBJECTS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SPECOBJECTS</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SPECOBJECTS</em>' containment reference.
     * @see #setSPECOBJECTS(RifSpecObjects)
     * @see era.foss.model.core.rif.RifPackage#getRif_SPECOBJECTS()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SPEC-OBJECTS' namespace='##targetNamespace'"
     * @generated
     */
    RifSpecObjects getSPECOBJECTS();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.Rif#getSPECOBJECTS <em>SPECOBJECTS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SPECOBJECTS</em>' containment reference.
     * @see #getSPECOBJECTS()
     * @generated
     */
    void setSPECOBJECTS( RifSpecObjects value );

    /**
     * Returns the value of the '<em><b>SPECRELATIONS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SPECRELATIONS</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SPECRELATIONS</em>' containment reference.
     * @see #setSPECRELATIONS(RifSpecRelations)
     * @see era.foss.model.core.rif.RifPackage#getRif_SPECRELATIONS()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SPEC-RELATIONS' namespace='##targetNamespace'"
     * @generated
     */
    RifSpecRelations getSPECRELATIONS();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.Rif#getSPECRELATIONS <em>SPECRELATIONS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SPECRELATIONS</em>' containment reference.
     * @see #getSPECRELATIONS()
     * @generated
     */
    void setSPECRELATIONS( RifSpecRelations value );

    /**
     * Returns the value of the '<em><b>SPECTYPES</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SPECTYPES</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SPECTYPES</em>' containment reference.
     * @see #setSPECTYPES(RifSpecTypes)
     * @see era.foss.model.core.rif.RifPackage#getRif_SPECTYPES()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SPEC-TYPES' namespace='##targetNamespace'"
     * @generated
     */
    RifSpecTypes getSPECTYPES();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.Rif#getSPECTYPES <em>SPECTYPES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SPECTYPES</em>' containment reference.
     * @see #getSPECTYPES()
     * @generated
     */
    void setSPECTYPES( RifSpecTypes value );

    /**
     * Returns the value of the '<em><b>TITLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TITLE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TITLE</em>' attribute.
     * @see #setTITLE(String)
     * @see era.foss.model.core.rif.RifPackage#getRif_TITLE()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='TITLE' namespace='##targetNamespace'"
     * @generated
     */
    String getTITLE();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.Rif#getTITLE <em>TITLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TITLE</em>' attribute.
     * @see #getTITLE()
     * @generated
     */
    void setTITLE( String value );

    /**
     * Returns the value of the '<em><b>VERSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>VERSION</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>VERSION</em>' attribute.
     * @see #setVERSION(String)
     * @see era.foss.model.core.rif.RifPackage#getRif_VERSION()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='VERSION' namespace='##targetNamespace'"
     * @generated
     */
    String getVERSION();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.Rif#getVERSION <em>VERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VERSION</em>' attribute.
     * @see #getVERSION()
     * @generated
     */
    void setVERSION( String value );

} // Rif
