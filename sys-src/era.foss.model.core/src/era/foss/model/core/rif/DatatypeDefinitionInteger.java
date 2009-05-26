/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype Definition Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionInteger#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionInteger#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionInteger#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionInteger#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionInteger#getMAX <em>MAX</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionInteger#getMIN <em>MIN</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionInteger()
 * @model extendedMetaData="name='DATATYPE-DEFINITION-INTEGER_._type' kind='elementOnly'"
 * @generated
 */
public interface DatatypeDefinitionInteger extends EObject {
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
     * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionInteger_LONGNAME()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
     * @generated
     */
    String getLONGNAME();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionInteger#getLONGNAME <em>LONGNAME</em>}' attribute.
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
     * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionInteger_DESC()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
     * @generated
     */
    String getDESC();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionInteger#getDESC <em>DESC</em>}' attribute.
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
     * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionInteger_IDENTIFIER()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
     * @generated
     */
    String getIDENTIFIER();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionInteger#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
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
     * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionInteger_LASTCHANGE()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
     * @generated
     */
    String getLASTCHANGE();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionInteger#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>LASTCHANGE</em>' attribute.
     * @see #getLASTCHANGE()
     * @generated
     */
    void setLASTCHANGE( String value );

    /**
     * Returns the value of the '<em><b>MAX</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MAX</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MAX</em>' attribute.
     * @see #setMAX(BigInteger)
     * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionInteger_MAX()
     * @model dataType="era.foss.model.core.rif.INTEGER"
     *        extendedMetaData="kind='element' name='MAX' namespace='##targetNamespace'"
     * @generated
     */
    BigInteger getMAX();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionInteger#getMAX <em>MAX</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MAX</em>' attribute.
     * @see #getMAX()
     * @generated
     */
    void setMAX( BigInteger value );

    /**
     * Returns the value of the '<em><b>MIN</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MIN</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MIN</em>' attribute.
     * @see #setMIN(BigInteger)
     * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionInteger_MIN()
     * @model dataType="era.foss.model.core.rif.INTEGER"
     *        extendedMetaData="kind='element' name='MIN' namespace='##targetNamespace'"
     * @generated
     */
    BigInteger getMIN();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionInteger#getMIN <em>MIN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MIN</em>' attribute.
     * @see #getMIN()
     * @generated
     */
    void setMIN( BigInteger value );

} // DatatypeDefinitionInteger
