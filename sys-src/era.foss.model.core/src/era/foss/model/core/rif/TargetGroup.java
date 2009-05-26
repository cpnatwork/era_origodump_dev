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
 * A representation of the model object '<em><b>Target Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.TargetGroup#getSPECGROUPREF <em>SPECGROUPREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see era.foss.model.core.rif.RifPackage#getTargetGroup()
 * @model extendedMetaData="name='TARGET-GROUP_._type' kind='elementOnly'"
 * @generated
 */
public interface TargetGroup extends EObject {
    /**
     * Returns the value of the '<em><b>SPECGROUPREF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SPECGROUPREF</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SPECGROUPREF</em>' attribute.
     * @see #setSPECGROUPREF(String)
     * @see era.foss.model.core.rif.RifPackage#getTargetGroup_SPECGROUPREF()
     * @model dataType="era.foss.model.core.rif.REF"
     *        extendedMetaData="kind='element' name='SPEC-GROUP-REF' namespace='##targetNamespace'"
     * @generated
     */
    String getSPECGROUPREF();

    /**
     * Sets the value of the '{@link era.foss.model.core.rif.TargetGroup#getSPECGROUPREF <em>SPECGROUPREF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SPECGROUPREF</em>' attribute.
     * @see #getSPECGROUPREF()
     * @generated
     */
    void setSPECGROUPREF( String value );

} // TargetGroup
