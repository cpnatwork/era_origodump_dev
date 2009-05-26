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
 * A representation of the model object '<em><b>Embedded Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.EmbeddedValue#getKEY <em>KEY</em>}</li>
 *   <li>{@link era.foss.model.core.rif.EmbeddedValue#getOTHERCONTENT <em>OTHERCONTENT</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getEmbeddedValue()
 * @model extendedMetaData="name='EMBEDDED-VALUE_._type' kind='elementOnly'"
 * @generated
 */
public interface EmbeddedValue extends EObject {
    /**
     * Returns the value of the '<em><b>KEY</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>KEY</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>KEY</em>' attribute.
     * @see #setKEY(BigInteger)
     * @see era.foss.model.core.rif.RifPackage#getEmbeddedValue_KEY()
     * @model dataType="era.foss.model.core.rif.INTEGER"
     *        extendedMetaData="kind='element' name='KEY' namespace='##targetNamespace'"
     * @generated
     */
    BigInteger getKEY();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.EmbeddedValue#getKEY <em>KEY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>KEY</em>' attribute.
     * @see #getKEY()
     * @generated
     */
    void setKEY( BigInteger value );

    /**
     * Returns the value of the '<em><b>OTHERCONTENT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>OTHERCONTENT</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>OTHERCONTENT</em>' attribute.
     * @see #setOTHERCONTENT(String)
     * @see era.foss.model.core.rif.RifPackage#getEmbeddedValue_OTHERCONTENT()
     * @model dataType="era.foss.model.core.rif.STRING"
     *        extendedMetaData="kind='element' name='OTHER-CONTENT' namespace='##targetNamespace'"
     * @generated
     */
    String getOTHERCONTENT();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.EmbeddedValue#getOTHERCONTENT <em>OTHERCONTENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>OTHERCONTENT</em>' attribute.
     * @see #getOTHERCONTENT()
     * @generated
     */
    void setOTHERCONTENT( String value );

} // EmbeddedValue
