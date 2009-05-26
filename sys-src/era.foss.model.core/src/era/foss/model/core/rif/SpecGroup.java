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
 * A representation of the model object '<em><b>Spec Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.SpecGroup#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecGroup#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecGroup#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecGroup#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecGroup#getRELATIONGROUPS <em>RELATIONGROUPS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecGroup#getSPECOBJECTS <em>SPECOBJECTS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecGroup#getTYPE <em>TYPE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecGroup#getVALUES <em>VALUES</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getSpecGroup()
 * @model extendedMetaData="name='SPEC-GROUP_._type' kind='elementOnly'"
 * @generated
 */
public interface SpecGroup extends EObject {
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
     * @see era.foss.model.core.rif.RifPackage#getSpecGroup_LONGNAME()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
     * @generated
     */
    String getLONGNAME();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.SpecGroup#getLONGNAME <em>LONGNAME</em>}' attribute.
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
     * @see era.foss.model.core.rif.RifPackage#getSpecGroup_DESC()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
     * @generated
     */
    String getDESC();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.SpecGroup#getDESC <em>DESC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESC</em>' attribute.
     * @see #getDESC()
     * @generated
     */
    void setDESC( String value );

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
     * @see era.foss.model.core.rif.RifPackage#getSpecGroup_IDENTIFIER()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
     * @generated
     */
    String getIDENTIFIER();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.SpecGroup#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
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
     * @see era.foss.model.core.rif.RifPackage#getSpecGroup_LASTCHANGE()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
     * @generated
     */
    String getLASTCHANGE();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.SpecGroup#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
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
     * @see #setRELATIONGROUPS(SpecGroupRelationGroups)
     * @see era.foss.model.core.rif.RifPackage#getSpecGroup_RELATIONGROUPS()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='RELATION-GROUPS' namespace='##targetNamespace'"
     * @generated
     */
    SpecGroupRelationGroups getRELATIONGROUPS();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.SpecGroup#getRELATIONGROUPS <em>RELATIONGROUPS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RELATIONGROUPS</em>' containment reference.
     * @see #getRELATIONGROUPS()
     * @generated
     */
    void setRELATIONGROUPS( SpecGroupRelationGroups value );

    /**
     * Returns the value of the '<em><b>SPECOBJECTS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SPECOBJECTS</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SPECOBJECTS</em>' containment reference.
     * @see #setSPECOBJECTS(SpecGroupSpecObjects)
     * @see era.foss.model.core.rif.RifPackage#getSpecGroup_SPECOBJECTS()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SPEC-OBJECTS' namespace='##targetNamespace'"
     * @generated
     */
    SpecGroupSpecObjects getSPECOBJECTS();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.SpecGroup#getSPECOBJECTS <em>SPECOBJECTS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SPECOBJECTS</em>' containment reference.
     * @see #getSPECOBJECTS()
     * @generated
     */
    void setSPECOBJECTS( SpecGroupSpecObjects value );

    /**
     * Returns the value of the '<em><b>TYPE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TYPE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TYPE</em>' containment reference.
     * @see #setTYPE(SpecGroupType)
     * @see era.foss.model.core.rif.RifPackage#getSpecGroup_TYPE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='TYPE' namespace='##targetNamespace'"
     * @generated
     */
    SpecGroupType getTYPE();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.SpecGroup#getTYPE <em>TYPE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TYPE</em>' containment reference.
     * @see #getTYPE()
     * @generated
     */
    void setTYPE( SpecGroupType value );

    /**
     * Returns the value of the '<em><b>VALUES</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>VALUES</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>VALUES</em>' containment reference.
     * @see #setVALUES(SpecGroupValues)
     * @see era.foss.model.core.rif.RifPackage#getSpecGroup_VALUES()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='VALUES' namespace='##targetNamespace'"
     * @generated
     */
    SpecGroupValues getVALUES();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.SpecGroup#getVALUES <em>VALUES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VALUES</em>' containment reference.
     * @see #getVALUES()
     * @generated
     */
    void setVALUES( SpecGroupValues value );

} // SpecGroup
