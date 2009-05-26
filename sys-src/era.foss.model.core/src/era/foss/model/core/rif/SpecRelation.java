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
 * A representation of the model object '<em><b>Spec Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.SpecRelation#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecRelation#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecRelation#getSOURCE <em>SOURCE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecRelation#getTARGET <em>TARGET</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecRelation#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecRelation#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecRelation#getTYPE <em>TYPE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecRelation#getVALUES <em>VALUES</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getSpecRelation()
 * @model extendedMetaData="name='SPEC-RELATION_._type' kind='elementOnly'"
 * @generated
 */
public interface SpecRelation extends EObject {
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
     * @see era.foss.model.core.rif.RifPackage#getSpecRelation_LONGNAME()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
     * @generated
     */
    String getLONGNAME();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.SpecRelation#getLONGNAME <em>LONGNAME</em>}' attribute.
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
     * @see era.foss.model.core.rif.RifPackage#getSpecRelation_DESC()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
     * @generated
     */
    String getDESC();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.SpecRelation#getDESC <em>DESC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESC</em>' attribute.
     * @see #getDESC()
     * @generated
     */
    void setDESC( String value );

    /**
     * Returns the value of the '<em><b>SOURCE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SOURCE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SOURCE</em>' containment reference.
     * @see #setSOURCE(Source)
     * @see era.foss.model.core.rif.RifPackage#getSpecRelation_SOURCE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SOURCE' namespace='##targetNamespace'"
     * @generated
     */
    Source getSOURCE();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.SpecRelation#getSOURCE <em>SOURCE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SOURCE</em>' containment reference.
     * @see #getSOURCE()
     * @generated
     */
    void setSOURCE( Source value );

    /**
     * Returns the value of the '<em><b>TARGET</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TARGET</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TARGET</em>' containment reference.
     * @see #setTARGET(Target)
     * @see era.foss.model.core.rif.RifPackage#getSpecRelation_TARGET()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='TARGET' namespace='##targetNamespace'"
     * @generated
     */
    Target getTARGET();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.SpecRelation#getTARGET <em>TARGET</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TARGET</em>' containment reference.
     * @see #getTARGET()
     * @generated
     */
    void setTARGET( Target value );

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
     * @see era.foss.model.core.rif.RifPackage#getSpecRelation_IDENTIFIER()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
     * @generated
     */
    String getIDENTIFIER();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.SpecRelation#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
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
     * @see era.foss.model.core.rif.RifPackage#getSpecRelation_LASTCHANGE()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
     * @generated
     */
    String getLASTCHANGE();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.SpecRelation#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>LASTCHANGE</em>' attribute.
     * @see #getLASTCHANGE()
     * @generated
     */
    void setLASTCHANGE( String value );

    /**
     * Returns the value of the '<em><b>TYPE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TYPE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TYPE</em>' containment reference.
     * @see #setTYPE(SpecRelationType)
     * @see era.foss.model.core.rif.RifPackage#getSpecRelation_TYPE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='TYPE' namespace='##targetNamespace'"
     * @generated
     */
    SpecRelationType getTYPE();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.SpecRelation#getTYPE <em>TYPE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TYPE</em>' containment reference.
     * @see #getTYPE()
     * @generated
     */
    void setTYPE( SpecRelationType value );

    /**
     * Returns the value of the '<em><b>VALUES</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>VALUES</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>VALUES</em>' containment reference.
     * @see #setVALUES(SpecRelationValues)
     * @see era.foss.model.core.rif.RifPackage#getSpecRelation_VALUES()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='VALUES' namespace='##targetNamespace'"
     * @generated
     */
    SpecRelationValues getVALUES();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.SpecRelation#getVALUES <em>VALUES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VALUES</em>' containment reference.
     * @see #getVALUES()
     * @generated
     */
    void setVALUES( SpecRelationValues value );

} // SpecRelation
