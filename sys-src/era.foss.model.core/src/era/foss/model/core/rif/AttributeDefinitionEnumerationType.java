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
 * A representation of the model object '<em><b>Attribute Definition Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.AttributeDefinitionEnumerationType#getDATATYPEDEFINITIONENUMERATIONREF <em>DATATYPEDEFINITIONENUMERATIONREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionEnumerationType()
 * @model extendedMetaData="name='TYPE_._2_._type' kind='elementOnly'"
 * @generated
 */
public interface AttributeDefinitionEnumerationType extends EObject {
    /**
     * Returns the value of the '<em><b>DATATYPEDEFINITIONENUMERATIONREF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DATATYPEDEFINITIONENUMERATIONREF</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DATATYPEDEFINITIONENUMERATIONREF</em>' attribute.
     * @see #setDATATYPEDEFINITIONENUMERATIONREF(String)
     * @see era.foss.model.core.rif.RifPackage#getAttributeDefinitionEnumerationType_DATATYPEDEFINITIONENUMERATIONREF()
     * @model dataType="era.foss.model.core.rif.REF"
     *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-ENUMERATION-REF' namespace='##targetNamespace'"
     * @generated
     */
    String getDATATYPEDEFINITIONENUMERATIONREF();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.AttributeDefinitionEnumerationType#getDATATYPEDEFINITIONENUMERATIONREF <em>DATATYPEDEFINITIONENUMERATIONREF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DATATYPEDEFINITIONENUMERATIONREF</em>' attribute.
     * @see #getDATATYPEDEFINITIONENUMERATIONREF()
     * @generated
     */
    void setDATATYPEDEFINITIONENUMERATIONREF( String value );

} // AttributeDefinitionEnumerationType
