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
 * A representation of the model object '<em><b>Spec Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.SpecHierarchy#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecHierarchy#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecHierarchy#getCHILDREN <em>CHILDREN</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecHierarchy#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecHierarchy#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.SpecHierarchy#getOBJECT <em>OBJECT</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getSpecHierarchy()
 * @model extendedMetaData="name='SPEC-HIERARCHY_._type' kind='elementOnly'"
 * @generated
 */
public interface SpecHierarchy extends EObject {
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
     * @see era.foss.model.core.rif.RifPackage#getSpecHierarchy_LONGNAME()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
     * @generated
     */
    String getLONGNAME();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.SpecHierarchy#getLONGNAME <em>LONGNAME</em>}' attribute.
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
     * @see era.foss.model.core.rif.RifPackage#getSpecHierarchy_DESC()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
     * @generated
     */
    String getDESC();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.SpecHierarchy#getDESC <em>DESC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESC</em>' attribute.
     * @see #getDESC()
     * @generated
     */
    void setDESC( String value );

    /**
     * Returns the value of the '<em><b>CHILDREN</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CHILDREN</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CHILDREN</em>' containment reference.
     * @see #setCHILDREN(SpecHierarchyChildren)
     * @see era.foss.model.core.rif.RifPackage#getSpecHierarchy_CHILDREN()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='CHILDREN' namespace='##targetNamespace'"
     * @generated
     */
    SpecHierarchyChildren getCHILDREN();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.SpecHierarchy#getCHILDREN <em>CHILDREN</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CHILDREN</em>' containment reference.
     * @see #getCHILDREN()
     * @generated
     */
    void setCHILDREN( SpecHierarchyChildren value );

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
     * @see era.foss.model.core.rif.RifPackage#getSpecHierarchy_IDENTIFIER()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
     * @generated
     */
    String getIDENTIFIER();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.SpecHierarchy#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
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
     * @see era.foss.model.core.rif.RifPackage#getSpecHierarchy_LASTCHANGE()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
     * @generated
     */
    String getLASTCHANGE();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.SpecHierarchy#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>LASTCHANGE</em>' attribute.
     * @see #getLASTCHANGE()
     * @generated
     */
    void setLASTCHANGE( String value );

    /**
     * Returns the value of the '<em><b>OBJECT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>OBJECT</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>OBJECT</em>' containment reference.
     * @see #setOBJECT(era.foss.model.core.rif.Object)
     * @see era.foss.model.core.rif.RifPackage#getSpecHierarchy_OBJECT()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='OBJECT' namespace='##targetNamespace'"
     * @generated
     */
    era.foss.model.core.rif.Object getOBJECT();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.SpecHierarchy#getOBJECT <em>OBJECT</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>OBJECT</em>' containment reference.
     * @see #getOBJECT()
     * @generated
     */
    void setOBJECT( era.foss.model.core.rif.Object value );

} // SpecHierarchy
