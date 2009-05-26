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
 * A representation of the model object '<em><b>Datatype Definition Real</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionReal#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionReal#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionReal#getACCURACY <em>ACCURACY</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionReal#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionReal#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionReal#getMAX <em>MAX</em>}</li>
 *   <li>{@link era.foss.model.core.rif.DatatypeDefinitionReal#getMIN <em>MIN</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionReal()
 * @model extendedMetaData="name='DATATYPE-DEFINITION-REAL_._type' kind='elementOnly'"
 * @generated
 */
public interface DatatypeDefinitionReal extends EObject {
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
     * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionReal_LONGNAME()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
     * @generated
     */
    String getLONGNAME();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionReal#getLONGNAME <em>LONGNAME</em>}' attribute.
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
     * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionReal_DESC()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
     * @generated
     */
    String getDESC();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionReal#getDESC <em>DESC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESC</em>' attribute.
     * @see #getDESC()
     * @generated
     */
    void setDESC( String value );

    /**
     * Returns the value of the '<em><b>ACCURACY</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ACCURACY</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ACCURACY</em>' attribute.
     * @see #setACCURACY(BigInteger)
     * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionReal_ACCURACY()
     * @model dataType="era.foss.model.core.rif.INTEGER"
     *        extendedMetaData="kind='element' name='ACCURACY' namespace='##targetNamespace'"
     * @generated
     */
    BigInteger getACCURACY();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionReal#getACCURACY <em>ACCURACY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ACCURACY</em>' attribute.
     * @see #getACCURACY()
     * @generated
     */
    void setACCURACY( BigInteger value );

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
     * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionReal_IDENTIFIER()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
     * @generated
     */
    String getIDENTIFIER();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionReal#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
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
     * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionReal_LASTCHANGE()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
     * @generated
     */
    String getLASTCHANGE();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionReal#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
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
     * @see #isSetMAX()
     * @see #unsetMAX()
     * @see #setMAX(float)
     * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionReal_MAX()
     * @model unsettable="true" dataType="era.foss.model.core.rif.FLOAT"
     *        extendedMetaData="kind='element' name='MAX' namespace='##targetNamespace'"
     * @generated
     */
    float getMAX();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionReal#getMAX <em>MAX</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MAX</em>' attribute.
     * @see #isSetMAX()
     * @see #unsetMAX()
     * @see #getMAX()
     * @generated
     */
    void setMAX( float value );

    /**
     * Unsets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionReal#getMAX <em>MAX</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMAX()
     * @see #getMAX()
     * @see #setMAX(float)
     * @generated
     */
    void unsetMAX();

    /**
     * Returns whether the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionReal#getMAX <em>MAX</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>MAX</em>' attribute is set.
     * @see #unsetMAX()
     * @see #getMAX()
     * @see #setMAX(float)
     * @generated
     */
    boolean isSetMAX();

    /**
     * Returns the value of the '<em><b>MIN</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MIN</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MIN</em>' attribute.
     * @see #isSetMIN()
     * @see #unsetMIN()
     * @see #setMIN(float)
     * @see era.foss.model.core.rif.RifPackage#getDatatypeDefinitionReal_MIN()
     * @model unsettable="true" dataType="era.foss.model.core.rif.FLOAT"
     *        extendedMetaData="kind='element' name='MIN' namespace='##targetNamespace'"
     * @generated
     */
    float getMIN();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionReal#getMIN <em>MIN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MIN</em>' attribute.
     * @see #isSetMIN()
     * @see #unsetMIN()
     * @see #getMIN()
     * @generated
     */
    void setMIN( float value );

    /**
     * Unsets the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionReal#getMIN <em>MIN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMIN()
     * @see #getMIN()
     * @see #setMIN(float)
     * @generated
     */
    void unsetMIN();

    /**
     * Returns whether the value of the '{@link era.foss.model.core.rif.DatatypeDefinitionReal#getMIN <em>MIN</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>MIN</em>' attribute is set.
     * @see #unsetMIN()
     * @see #getMIN()
     * @see #setMIN(float)
     * @generated
     */
    boolean isSetMIN();

} // DatatypeDefinitionReal
