/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ACCESSPOLICYACCESSMODEENUM</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see era.foss.model.core.rif.RifPackage#getACCESSPOLICYACCESSMODEENUM()
 * @model extendedMetaData="name='ACCESS-POLICY-ACCESS-MODE-ENUM'"
 * @generated
 */
public final class ACCESSPOLICYACCESSMODEENUM extends AbstractEnumerator {
    /**
     * The '<em><b>EDIT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>EDIT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EDIT_LITERAL
     * @model
     * @generated
     * @ordered
     */
    public static final int EDIT = 0;

    /**
     * The '<em><b>DELETE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DELETE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DELETE_LITERAL
     * @model
     * @generated
     * @ordered
     */
    public static final int DELETE = 1;

    /**
     * The '<em><b>CREATE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CREATE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CREATE_LITERAL
     * @model
     * @generated
     * @ordered
     */
    public static final int CREATE = 2;

    /**
     * The '<em><b>EDIT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EDIT
     * @generated
     * @ordered
     */
    public static final ACCESSPOLICYACCESSMODEENUM EDIT_LITERAL = new ACCESSPOLICYACCESSMODEENUM(
        EDIT,
        "EDIT",
        "EDIT" );

    /**
     * The '<em><b>DELETE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DELETE
     * @generated
     * @ordered
     */
    public static final ACCESSPOLICYACCESSMODEENUM DELETE_LITERAL = new ACCESSPOLICYACCESSMODEENUM(
        DELETE,
        "DELETE",
        "DELETE" );

    /**
     * The '<em><b>CREATE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CREATE
     * @generated
     * @ordered
     */
    public static final ACCESSPOLICYACCESSMODEENUM CREATE_LITERAL = new ACCESSPOLICYACCESSMODEENUM(
        CREATE,
        "CREATE",
        "CREATE" );

    /**
     * An array of all the '<em><b>ACCESSPOLICYACCESSMODEENUM</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ACCESSPOLICYACCESSMODEENUM[] VALUES_ARRAY = new ACCESSPOLICYACCESSMODEENUM[]{
        EDIT_LITERAL,
        DELETE_LITERAL,
        CREATE_LITERAL,};

    /**
     * A public read-only list of all the '<em><b>ACCESSPOLICYACCESSMODEENUM</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>ACCESSPOLICYACCESSMODEENUM</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ACCESSPOLICYACCESSMODEENUM get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            ACCESSPOLICYACCESSMODEENUM result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>ACCESSPOLICYACCESSMODEENUM</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ACCESSPOLICYACCESSMODEENUM getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            ACCESSPOLICYACCESSMODEENUM result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>ACCESSPOLICYACCESSMODEENUM</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ACCESSPOLICYACCESSMODEENUM get( int value ) {
        switch (value) {
        case EDIT:
            return EDIT_LITERAL;
        case DELETE:
            return DELETE_LITERAL;
        case CREATE:
            return CREATE_LITERAL;
        }
        return null;
    }

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private ACCESSPOLICYACCESSMODEENUM( int value, String name, String literal ) {
        super( value, name, literal );
    }

} //ACCESSPOLICYACCESSMODEENUM
