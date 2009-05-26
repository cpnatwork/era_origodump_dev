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
 * A representation of the literals of the enumeration '<em><b>DATATYPEDEFINITIONDOCUMENTFORMATENUM</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see era.foss.model.core.rif.RifPackage#getDATATYPEDEFINITIONDOCUMENTFORMATENUM()
 * @model extendedMetaData="name='DATATYPE-DEFINITION-DOCUMENT-FORMAT-ENUM'"
 * @generated
 */
public final class DATATYPEDEFINITIONDOCUMENTFORMATENUM extends AbstractEnumerator {
    /**
     * The '<em><b>XHTML</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>XHTML</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #XHTML_LITERAL
     * @model
     * @generated
     * @ordered
     */
    public static final int XHTML = 0;

    /**
     * The '<em><b>RTF</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>RTF</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RTF_LITERAL
     * @model
     * @generated
     * @ordered
     */
    public static final int RTF = 1;

    /**
     * The '<em><b>XHTML</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #XHTML
     * @generated
     * @ordered
     */
    public static final DATATYPEDEFINITIONDOCUMENTFORMATENUM XHTML_LITERAL = new DATATYPEDEFINITIONDOCUMENTFORMATENUM(
        XHTML,
        "XHTML",
        "XHTML" );

    /**
     * The '<em><b>RTF</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RTF
     * @generated
     * @ordered
     */
    public static final DATATYPEDEFINITIONDOCUMENTFORMATENUM RTF_LITERAL = new DATATYPEDEFINITIONDOCUMENTFORMATENUM(
        RTF,
        "RTF",
        "RTF" );

    /**
     * An array of all the '<em><b>DATATYPEDEFINITIONDOCUMENTFORMATENUM</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final DATATYPEDEFINITIONDOCUMENTFORMATENUM[] VALUES_ARRAY = new DATATYPEDEFINITIONDOCUMENTFORMATENUM[]{
        XHTML_LITERAL,
        RTF_LITERAL,};

    /**
     * A public read-only list of all the '<em><b>DATATYPEDEFINITIONDOCUMENTFORMATENUM</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>DATATYPEDEFINITIONDOCUMENTFORMATENUM</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DATATYPEDEFINITIONDOCUMENTFORMATENUM get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            DATATYPEDEFINITIONDOCUMENTFORMATENUM result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>DATATYPEDEFINITIONDOCUMENTFORMATENUM</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DATATYPEDEFINITIONDOCUMENTFORMATENUM getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            DATATYPEDEFINITIONDOCUMENTFORMATENUM result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>DATATYPEDEFINITIONDOCUMENTFORMATENUM</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DATATYPEDEFINITIONDOCUMENTFORMATENUM get( int value ) {
        switch (value) {
        case XHTML:
            return XHTML_LITERAL;
        case RTF:
            return RTF_LITERAL;
        }
        return null;
    }

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private DATATYPEDEFINITIONDOCUMENTFORMATENUM( int value, String name, String literal ) {
        super( value, name, literal );
    }

} //DATATYPEDEFINITIONDOCUMENTFORMATENUM
