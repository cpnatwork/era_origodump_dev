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
 * A representation of the model object '<em><b>Relation Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.RelationGroup#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.RelationGroup#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.RelationGroup#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.RelationGroup#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.RelationGroup#getRELATIONTYPE <em>RELATIONTYPE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.RelationGroup#getSPECRELATIONS <em>SPECRELATIONS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.RelationGroup#getTARGETGROUP <em>TARGETGROUP</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getRelationGroup()
 * @model extendedMetaData="name='RELATION-GROUP_._type' kind='elementOnly'"
 * @generated
 */
public interface RelationGroup extends EObject {
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
     * @see era.foss.model.core.rif.RifPackage#getRelationGroup_LONGNAME()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
     * @generated
     */
    String getLONGNAME();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.RelationGroup#getLONGNAME <em>LONGNAME</em>}' attribute.
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
     * @see era.foss.model.core.rif.RifPackage#getRelationGroup_DESC()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
     * @generated
     */
    String getDESC();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.RelationGroup#getDESC <em>DESC</em>}' attribute.
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
     * @see era.foss.model.core.rif.RifPackage#getRelationGroup_IDENTIFIER()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
     * @generated
     */
    String getIDENTIFIER();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.RelationGroup#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
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
     * @see era.foss.model.core.rif.RifPackage#getRelationGroup_LASTCHANGE()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
     * @generated
     */
    String getLASTCHANGE();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.RelationGroup#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>LASTCHANGE</em>' attribute.
     * @see #getLASTCHANGE()
     * @generated
     */
    void setLASTCHANGE( String value );

    /**
     * Returns the value of the '<em><b>RELATIONTYPE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RELATIONTYPE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RELATIONTYPE</em>' containment reference.
     * @see #setRELATIONTYPE(RelationType)
     * @see era.foss.model.core.rif.RifPackage#getRelationGroup_RELATIONTYPE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='RELATION-TYPE' namespace='##targetNamespace'"
     * @generated
     */
    RelationType getRELATIONTYPE();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.RelationGroup#getRELATIONTYPE <em>RELATIONTYPE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RELATIONTYPE</em>' containment reference.
     * @see #getRELATIONTYPE()
     * @generated
     */
    void setRELATIONTYPE( RelationType value );

    /**
     * Returns the value of the '<em><b>SPECRELATIONS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SPECRELATIONS</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SPECRELATIONS</em>' containment reference.
     * @see #setSPECRELATIONS(RelationGroupSpecRelations)
     * @see era.foss.model.core.rif.RifPackage#getRelationGroup_SPECRELATIONS()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SPEC-RELATIONS' namespace='##targetNamespace'"
     * @generated
     */
    RelationGroupSpecRelations getSPECRELATIONS();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.RelationGroup#getSPECRELATIONS <em>SPECRELATIONS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SPECRELATIONS</em>' containment reference.
     * @see #getSPECRELATIONS()
     * @generated
     */
    void setSPECRELATIONS( RelationGroupSpecRelations value );

    /**
     * Returns the value of the '<em><b>TARGETGROUP</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TARGETGROUP</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TARGETGROUP</em>' containment reference.
     * @see #setTARGETGROUP(TargetGroup)
     * @see era.foss.model.core.rif.RifPackage#getRelationGroup_TARGETGROUP()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='TARGET-GROUP' namespace='##targetNamespace'"
     * @generated
     */
    TargetGroup getTARGETGROUP();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.RelationGroup#getTARGETGROUP <em>TARGETGROUP</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TARGETGROUP</em>' containment reference.
     * @see #getTARGETGROUP()
     * @generated
     */
    void setTARGETGROUP( TargetGroup value );

} // RelationGroup
