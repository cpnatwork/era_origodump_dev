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

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DATATYPEDEFINITIONDOCUMENTFORMATENUM</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see era.foss.model.core.rif.RifPackage#getDATATYPEDEFINITIONDOCUMENTFORMATENUM()
 * @model extendedMetaData="name='DATATYPE-DEFINITION-DOCUMENT-FORMAT-ENUM'"
 * @generated
 */
public enum DATATYPEDEFINITIONDOCUMENTFORMATENUM implements Enumerator {
	/**
	 * The '<em><b>XHTML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XHTML_VALUE
	 * @generated
	 * @ordered
	 */
	XHTML(0, "XHTML", "XHTML"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>RTF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTF_VALUE
	 * @generated
	 * @ordered
	 */
	RTF(1, "RTF", "RTF"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>XHTML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XHTML</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XHTML
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XHTML_VALUE = 0;

	/**
	 * The '<em><b>RTF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RTF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RTF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RTF_VALUE = 1;

	/**
	 * An array of all the '<em><b>DATATYPEDEFINITIONDOCUMENTFORMATENUM</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DATATYPEDEFINITIONDOCUMENTFORMATENUM[] VALUES_ARRAY = new DATATYPEDEFINITIONDOCUMENTFORMATENUM[] {
			XHTML, RTF, };

	/**
	 * A public read-only list of all the '<em><b>DATATYPEDEFINITIONDOCUMENTFORMATENUM</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DATATYPEDEFINITIONDOCUMENTFORMATENUM> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DATATYPEDEFINITIONDOCUMENTFORMATENUM</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DATATYPEDEFINITIONDOCUMENTFORMATENUM get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DATATYPEDEFINITIONDOCUMENTFORMATENUM result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
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
	public static DATATYPEDEFINITIONDOCUMENTFORMATENUM getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DATATYPEDEFINITIONDOCUMENTFORMATENUM result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
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
	public static DATATYPEDEFINITIONDOCUMENTFORMATENUM get(int value) {
		switch (value) {
		case XHTML_VALUE:
			return XHTML;
		case RTF_VALUE:
			return RTF;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DATATYPEDEFINITIONDOCUMENTFORMATENUM(int value, String name,
			String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //DATATYPEDEFINITIONDOCUMENTFORMATENUM
