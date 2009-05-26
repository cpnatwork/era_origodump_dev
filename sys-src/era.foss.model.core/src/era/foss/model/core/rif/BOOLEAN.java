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
 * A representation of the literals of the enumeration '<em><b>BOOLEAN</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see era.foss.model.core.rif.RifPackage#getBOOLEAN()
 * @model extendedMetaData="name='BOOLEAN'"
 * @generated
 */
public final class BOOLEAN extends AbstractEnumerator {
    /**
     * The '<em><b>TRUE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>TRUE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TRUE_LITERAL
     * @model
     * @generated
     * @ordered
     */
    public static final int TRUE = 0;

    /**
     * The '<em><b>FALSE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>FALSE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FALSE_LITERAL
     * @model
     * @generated
     * @ordered
     */
    public static final int FALSE = 1;

    /**
     * The '<em><b>TRUE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TRUE
     * @generated
     * @ordered
     */
    public static final BOOLEAN TRUE_LITERAL = new BOOLEAN( TRUE, "TRUE", "TRUE" );

    /**
     * The '<em><b>FALSE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FALSE
     * @generated
     * @ordered
     */
    public static final BOOLEAN FALSE_LITERAL = new BOOLEAN( FALSE, "FALSE", "FALSE" );

    /**
     * An array of all the '<em><b>BOOLEAN</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final BOOLEAN[] VALUES_ARRAY = new BOOLEAN[]{TRUE_LITERAL, FALSE_LITERAL,};

    /**
     * A public read-only list of all the '<em><b>BOOLEAN</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>BOOLEAN</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static BOOLEAN get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            BOOLEAN result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>BOOLEAN</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static BOOLEAN getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            BOOLEAN result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>BOOLEAN</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static BOOLEAN get( int value ) {
        switch (value) {
        case TRUE:
            return TRUE_LITERAL;
        case FALSE:
            return FALSE_LITERAL;
        }
        return null;
    }

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private BOOLEAN( int value, String name, String literal ) {
        super( value, name, literal );
    }

} //BOOLEAN
