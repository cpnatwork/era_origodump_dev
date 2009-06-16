/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see era.foss.model.core.rif.RifFactory
 * @model kind="package"
 * @generated
 */
public interface RifPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rif"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://automotive-his.de/schema/rif"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rif"; //$NON-NLS-1$

	/**
	 * The package content type ID.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eCONTENT_TYPE = "text/rif"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RifPackage eINSTANCE = era.foss.model.core.rif.internal.RifPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AccessPoliciesImpl <em>Access Policies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AccessPoliciesImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAccessPolicies()
	 * @generated
	 */
	int ACCESS_POLICIES = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICIES__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ACCESSPOLICY</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICIES__ACCESSPOLICY = 1;

	/**
	 * The number of structural features of the '<em>Access Policies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICIES_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AccessPolicyImpl <em>Access Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AccessPolicyImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAccessPolicy()
	 * @generated
	 */
	int ACCESS_POLICY = 1;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__DESC = 1;

	/**
	 * The feature id for the '<em><b>ACCESSMODE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__ACCESSMODE = 2;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__ATTRIBUTEDEFINITIONS = 3;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__ATTRIBUTEVALUES = 4;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__DATATYPEDEFINITIONS = 5;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__LASTCHANGE = 7;

	/**
	 * The feature id for the '<em><b>RELATIONGROUPS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__RELATIONGROUPS = 8;

	/**
	 * The feature id for the '<em><b>SPECGROUPS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__SPECGROUPS = 9;

	/**
	 * The feature id for the '<em><b>SPECHIERARCHIES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__SPECHIERARCHIES = 10;

	/**
	 * The feature id for the '<em><b>SPECHIERARCHYROOTS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__SPECHIERARCHYROOTS = 11;

	/**
	 * The feature id for the '<em><b>SPECOBJECTS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__SPECOBJECTS = 12;

	/**
	 * The feature id for the '<em><b>SPECRELATIONS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__SPECRELATIONS = 13;

	/**
	 * The feature id for the '<em><b>SPECTYPES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__SPECTYPES = 14;

	/**
	 * The number of structural features of the '<em>Access Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeDefinitionComplexImpl <em>Attribute Definition Complex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeDefinitionComplexImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeDefinitionComplex()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX__DESC = 1;

	/**
	 * The feature id for the '<em><b>DEFAULTVALUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE = 2;

	/**
	 * The feature id for the '<em><b>DEFAULTVALUE2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE2 = 3;

	/**
	 * The feature id for the '<em><b>DEFAULTVALUE3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE3 = 4;

	/**
	 * The feature id for the '<em><b>DEFAULTVALUE4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE4 = 5;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX__LASTCHANGE = 7;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX__TYPE = 8;

	/**
	 * The number of structural features of the '<em>Attribute Definition Complex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeDefinitionEnumerationImpl <em>Attribute Definition Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeDefinitionEnumerationImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeDefinitionEnumeration()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION = 3;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION__DESC = 1;

	/**
	 * The feature id for the '<em><b>DEFAULTVALUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULTVALUE = 2;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION__LASTCHANGE = 4;

	/**
	 * The feature id for the '<em><b>MULTIVALUED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION__MULTIVALUED = 5;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION__TYPE = 6;

	/**
	 * The number of structural features of the '<em>Attribute Definition Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeDefinitionSimpleImpl <em>Attribute Definition Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeDefinitionSimpleImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeDefinitionSimple()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE = 4;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE__DESC = 1;

	/**
	 * The feature id for the '<em><b>DEFAULTVALUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE__DEFAULTVALUE = 2;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE__LASTCHANGE = 4;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Attribute Definition Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeDefinitionsImpl <em>Attribute Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeDefinitionsImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeDefinitions()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITIONS = 5;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITIONS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEXREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITIONS__ATTRIBUTEDEFINITIONCOMPLEXREF = 1;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONENUMERATIONREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITIONS__ATTRIBUTEDEFINITIONENUMERATIONREF = 2;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONSIMPLEREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITIONS__ATTRIBUTEDEFINITIONSIMPLEREF = 3;

	/**
	 * The number of structural features of the '<em>Attribute Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITIONS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeValueEmbeddedDocumentImpl <em>Attribute Value Embedded Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeValueEmbeddedDocumentImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueEmbeddedDocument()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT = 6;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DESC = 1;

	/**
	 * The feature id for the '<em><b>DEFINITION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__LASTCHANGE = 4;

	/**
	 * The feature id for the '<em><b>XHTMLCONTENT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__XHTMLCONTENT = 5;

	/**
	 * The number of structural features of the '<em>Attribute Value Embedded Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeValueEmbeddedFileImpl <em>Attribute Value Embedded File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeValueEmbeddedFileImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueEmbeddedFile()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_FILE = 7;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_FILE__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_FILE__DESC = 1;

	/**
	 * The feature id for the '<em><b>BINARYCONTENT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_FILE__BINARYCONTENT = 2;

	/**
	 * The feature id for the '<em><b>DEFINITION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_FILE__DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_FILE__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_FILE__LASTCHANGE = 5;

	/**
	 * The number of structural features of the '<em>Attribute Value Embedded File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_FILE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeValueEnumerationImpl <em>Attribute Value Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeValueEnumerationImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueEnumeration()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_ENUMERATION = 8;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ENUMERATION__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ENUMERATION__DESC = 1;

	/**
	 * The feature id for the '<em><b>DEFINITION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ENUMERATION__DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ENUMERATION__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ENUMERATION__LASTCHANGE = 4;

	/**
	 * The feature id for the '<em><b>VALUES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ENUMERATION__VALUES = 5;

	/**
	 * The number of structural features of the '<em>Attribute Value Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ENUMERATION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeValueFileReferenceImpl <em>Attribute Value File Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeValueFileReferenceImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueFileReference()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_FILE_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FILE_REFERENCE__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FILE_REFERENCE__DESC = 1;

	/**
	 * The feature id for the '<em><b>DEFINITION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FILE_REFERENCE__DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FILE_REFERENCE__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FILE_REFERENCE__LASTCHANGE = 4;

	/**
	 * The feature id for the '<em><b>PATHTOFILE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FILE_REFERENCE__PATHTOFILE = 5;

	/**
	 * The number of structural features of the '<em>Attribute Value File Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FILE_REFERENCE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeValueSimpleImpl <em>Attribute Value Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeValueSimpleImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueSimple()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_SIMPLE = 10;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SIMPLE__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SIMPLE__DESC = 1;

	/**
	 * The feature id for the '<em><b>DEFINITION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SIMPLE__DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SIMPLE__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SIMPLE__LASTCHANGE = 4;

	/**
	 * The feature id for the '<em><b>THEVALUE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SIMPLE__THEVALUE = 5;

	/**
	 * The number of structural features of the '<em>Attribute Value Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SIMPLE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeValuesImpl <em>Attribute Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeValuesImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValues()
	 * @generated
	 */
	int ATTRIBUTE_VALUES = 11;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUES__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF = 1;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILEREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUES__ATTRIBUTEVALUEEMBEDDEDFILEREF = 2;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEENUMERATIONREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUES__ATTRIBUTEVALUEENUMERATIONREF = 3;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEFILEREFERENCEREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUES__ATTRIBUTEVALUEFILEREFERENCEREF = 4;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUESIMPLEREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUES__ATTRIBUTEVALUESIMPLEREF = 5;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEXMLDATAREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUES__ATTRIBUTEVALUEXMLDATAREF = 6;

	/**
	 * The number of structural features of the '<em>Attribute Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUES_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeValueXmlDataImpl <em>Attribute Value Xml Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeValueXmlDataImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueXmlData()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_XML_DATA = 12;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_XML_DATA__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_XML_DATA__DESC = 1;

	/**
	 * The feature id for the '<em><b>DEFINITION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_XML_DATA__DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_XML_DATA__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_XML_DATA__LASTCHANGE = 4;

	/**
	 * The feature id for the '<em><b>XMLCONTENT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_XML_DATA__XMLCONTENT = 5;

	/**
	 * The number of structural features of the '<em>Attribute Value Xml Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_XML_DATA_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.BinaryContentImpl <em>Binary Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.BinaryContentImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getBinaryContent()
	 * @generated
	 */
	int BINARY_CONTENT = 13;

	/**
	 * The number of structural features of the '<em>Binary Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeValueEmbeddedFileBinaryContentImpl <em>Attribute Value Embedded File Binary Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeValueEmbeddedFileBinaryContentImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueEmbeddedFileBinaryContent()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_FILE_BINARY_CONTENT = 14;

	/**
	 * The feature id for the '<em><b>BINARYCONTENT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_FILE_BINARY_CONTENT__BINARYCONTENT = 0;

	/**
	 * The number of structural features of the '<em>Attribute Value Embedded File Binary Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_FILE_BINARY_CONTENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.SpecHierarchyChildrenImpl <em>Spec Hierarchy Children</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.SpecHierarchyChildrenImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecHierarchyChildren()
	 * @generated
	 */
	int SPEC_HIERARCHY_CHILDREN = 15;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_CHILDREN__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECHIERARCHY</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_CHILDREN__SPECHIERARCHY = 1;

	/**
	 * The number of structural features of the '<em>Spec Hierarchy Children</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_CHILDREN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.SpecHierarchyRootChildrenImpl <em>Spec Hierarchy Root Children</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.SpecHierarchyRootChildrenImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecHierarchyRootChildren()
	 * @generated
	 */
	int SPEC_HIERARCHY_ROOT_CHILDREN = 16;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT_CHILDREN__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECHIERARCHY</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT_CHILDREN__SPECHIERARCHY = 1;

	/**
	 * The number of structural features of the '<em>Spec Hierarchy Root Children</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT_CHILDREN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.DatatypeDefinitionBinaryFileImpl <em>Datatype Definition Binary File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.DatatypeDefinitionBinaryFileImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDatatypeDefinitionBinaryFile()
	 * @generated
	 */
	int DATATYPE_DEFINITION_BINARY_FILE = 17;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BINARY_FILE__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BINARY_FILE__DESC = 1;

	/**
	 * The feature id for the '<em><b>APPLICATION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BINARY_FILE__APPLICATION = 2;

	/**
	 * The feature id for the '<em><b>EMBEDDED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BINARY_FILE__EMBEDDED = 3;

	/**
	 * The feature id for the '<em><b>FILENAMESUFFIX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BINARY_FILE__FILENAMESUFFIX = 4;

	/**
	 * The feature id for the '<em><b>FORMATNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BINARY_FILE__FORMATNAME = 5;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BINARY_FILE__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BINARY_FILE__LASTCHANGE = 7;

	/**
	 * The feature id for the '<em><b>MIMETYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BINARY_FILE__MIMETYPE = 8;

	/**
	 * The number of structural features of the '<em>Datatype Definition Binary File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BINARY_FILE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.DatatypeDefinitionBooleanImpl <em>Datatype Definition Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.DatatypeDefinitionBooleanImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDatatypeDefinitionBoolean()
	 * @generated
	 */
	int DATATYPE_DEFINITION_BOOLEAN = 18;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BOOLEAN__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BOOLEAN__DESC = 1;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BOOLEAN__IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BOOLEAN__LASTCHANGE = 3;

	/**
	 * The number of structural features of the '<em>Datatype Definition Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BOOLEAN_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.DatatypeDefinitionDocumentImpl <em>Datatype Definition Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.DatatypeDefinitionDocumentImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDatatypeDefinitionDocument()
	 * @generated
	 */
	int DATATYPE_DEFINITION_DOCUMENT = 19;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DOCUMENT__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DOCUMENT__DESC = 1;

	/**
	 * The feature id for the '<em><b>EMBEDDED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DOCUMENT__EMBEDDED = 2;

	/**
	 * The feature id for the '<em><b>FORMAT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DOCUMENT__FORMAT = 3;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DOCUMENT__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DOCUMENT__LASTCHANGE = 5;

	/**
	 * The number of structural features of the '<em>Datatype Definition Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DOCUMENT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.DatatypeDefinitionEnumerationImpl <em>Datatype Definition Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.DatatypeDefinitionEnumerationImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDatatypeDefinitionEnumeration()
	 * @generated
	 */
	int DATATYPE_DEFINITION_ENUMERATION = 20;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_ENUMERATION__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_ENUMERATION__DESC = 1;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_ENUMERATION__IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_ENUMERATION__LASTCHANGE = 3;

	/**
	 * The feature id for the '<em><b>SPECIFIEDVALUES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_ENUMERATION__SPECIFIEDVALUES = 4;

	/**
	 * The number of structural features of the '<em>Datatype Definition Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_ENUMERATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.DatatypeDefinitionIntegerImpl <em>Datatype Definition Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.DatatypeDefinitionIntegerImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDatatypeDefinitionInteger()
	 * @generated
	 */
	int DATATYPE_DEFINITION_INTEGER = 21;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_INTEGER__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_INTEGER__DESC = 1;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_INTEGER__IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_INTEGER__LASTCHANGE = 3;

	/**
	 * The feature id for the '<em><b>MAX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_INTEGER__MAX = 4;

	/**
	 * The feature id for the '<em><b>MIN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_INTEGER__MIN = 5;

	/**
	 * The number of structural features of the '<em>Datatype Definition Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_INTEGER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.DatatypeDefinitionRealImpl <em>Datatype Definition Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.DatatypeDefinitionRealImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDatatypeDefinitionReal()
	 * @generated
	 */
	int DATATYPE_DEFINITION_REAL = 22;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL__DESC = 1;

	/**
	 * The feature id for the '<em><b>ACCURACY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL__ACCURACY = 2;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL__LASTCHANGE = 4;

	/**
	 * The feature id for the '<em><b>MAX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL__MAX = 5;

	/**
	 * The feature id for the '<em><b>MIN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL__MIN = 6;

	/**
	 * The number of structural features of the '<em>Datatype Definition Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.DatatypeDefinitionStringImpl <em>Datatype Definition String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.DatatypeDefinitionStringImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDatatypeDefinitionString()
	 * @generated
	 */
	int DATATYPE_DEFINITION_STRING = 23;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_STRING__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_STRING__DESC = 1;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_STRING__IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_STRING__LASTCHANGE = 3;

	/**
	 * The feature id for the '<em><b>MAXLENGTH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_STRING__MAXLENGTH = 4;

	/**
	 * The number of structural features of the '<em>Datatype Definition String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_STRING_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.DatatypeDefinitionsImpl <em>Datatype Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.DatatypeDefinitionsImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDatatypeDefinitions()
	 * @generated
	 */
	int DATATYPE_DEFINITIONS = 24;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITIONS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONBINARYFILEREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITIONS__DATATYPEDEFINITIONBINARYFILEREF = 1;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONBOOLEANREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITIONS__DATATYPEDEFINITIONBOOLEANREF = 2;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONDOCUMENTREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITIONS__DATATYPEDEFINITIONDOCUMENTREF = 3;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONENUMERATIONREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITIONS__DATATYPEDEFINITIONENUMERATIONREF = 4;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONINTEGERREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITIONS__DATATYPEDEFINITIONINTEGERREF = 5;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONREALREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITIONS__DATATYPEDEFINITIONREALREF = 6;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONSTRINGREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITIONS__DATATYPEDEFINITIONSTRINGREF = 7;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONXMLDATAREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITIONS__DATATYPEDEFINITIONXMLDATAREF = 8;

	/**
	 * The number of structural features of the '<em>Datatype Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITIONS_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.DatatypeDefinitionXmlDataImpl <em>Datatype Definition Xml Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.DatatypeDefinitionXmlDataImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDatatypeDefinitionXmlData()
	 * @generated
	 */
	int DATATYPE_DEFINITION_XML_DATA = 25;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_XML_DATA__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_XML_DATA__DESC = 1;

	/**
	 * The feature id for the '<em><b>EMBEDDED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_XML_DATA__EMBEDDED = 2;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_XML_DATA__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_XML_DATA__LASTCHANGE = 4;

	/**
	 * The feature id for the '<em><b>NAMESPACEURI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_XML_DATA__NAMESPACEURI = 5;

	/**
	 * The feature id for the '<em><b>SCHEMALOCATION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_XML_DATA__SCHEMALOCATION = 6;

	/**
	 * The number of structural features of the '<em>Datatype Definition Xml Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_XML_DATA_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.DatatypesImpl <em>Datatypes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.DatatypesImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDatatypes()
	 * @generated
	 */
	int DATATYPES = 26;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES__GROUP = 0;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONBINARYFILE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES__DATATYPEDEFINITIONBINARYFILE = 1;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONBOOLEAN</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES__DATATYPEDEFINITIONBOOLEAN = 2;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONDOCUMENT</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES__DATATYPEDEFINITIONDOCUMENT = 3;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONENUMERATION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES__DATATYPEDEFINITIONENUMERATION = 4;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONINTEGER</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES__DATATYPEDEFINITIONINTEGER = 5;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONREAL</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES__DATATYPEDEFINITIONREAL = 6;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONSTRING</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES__DATATYPEDEFINITIONSTRING = 7;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONXMLDATA</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES__DATATYPEDEFINITIONXMLDATA = 8;

	/**
	 * The number of structural features of the '<em>Datatypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.DefaultValue2Impl <em>Default Value2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.DefaultValue2Impl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDefaultValue2()
	 * @generated
	 */
	int DEFAULT_VALUE2 = 27;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE2__ATTRIBUTEVALUEEMBEDDEDFILE = 0;

	/**
	 * The number of structural features of the '<em>Default Value2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE2_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.DefaultValue3Impl <em>Default Value3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.DefaultValue3Impl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDefaultValue3()
	 * @generated
	 */
	int DEFAULT_VALUE3 = 28;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE3__ATTRIBUTEVALUEEMBEDDEDDOCUMENT = 0;

	/**
	 * The number of structural features of the '<em>Default Value3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE3_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.DefaultValue4Impl <em>Default Value4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.DefaultValue4Impl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDefaultValue4()
	 * @generated
	 */
	int DEFAULT_VALUE4 = 29;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEFILEREFERENCE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE4__ATTRIBUTEVALUEFILEREFERENCE = 0;

	/**
	 * The number of structural features of the '<em>Default Value4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE4_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeDefinitionSimpleDefaultValueImpl <em>Attribute Definition Simple Default Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeDefinitionSimpleDefaultValueImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeDefinitionSimpleDefaultValue()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE_DEFAULT_VALUE = 30;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUESIMPLE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE_DEFAULT_VALUE__ATTRIBUTEVALUESIMPLE = 0;

	/**
	 * The number of structural features of the '<em>Attribute Definition Simple Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE_DEFAULT_VALUE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeDefinitionEnumerationDefaultValueImpl <em>Attribute Definition Enumeration Default Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeDefinitionEnumerationDefaultValueImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeDefinitionEnumerationDefaultValue()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION_DEFAULT_VALUE = 31;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION_DEFAULT_VALUE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION_DEFAULT_VALUE__ATTRIBUTEVALUEENUMERATION = 1;

	/**
	 * The number of structural features of the '<em>Attribute Definition Enumeration Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION_DEFAULT_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeDefinitionComplexDefaultValueImpl <em>Attribute Definition Complex Default Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeDefinitionComplexDefaultValueImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeDefinitionComplexDefaultValue()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX_DEFAULT_VALUE = 32;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX_DEFAULT_VALUE__ATTRIBUTEVALUEXMLDATA = 0;

	/**
	 * The number of structural features of the '<em>Attribute Definition Complex Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX_DEFAULT_VALUE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeValueEmbeddedDocumentDefinitionImpl <em>Attribute Value Embedded Document Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeValueEmbeddedDocumentDefinitionImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueEmbeddedDocumentDefinition()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT_DEFINITION = 33;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEXREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT_DEFINITION__ATTRIBUTEDEFINITIONCOMPLEXREF = 0;

	/**
	 * The number of structural features of the '<em>Attribute Value Embedded Document Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeValueFileReferenceDefinitionImpl <em>Attribute Value File Reference Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeValueFileReferenceDefinitionImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueFileReferenceDefinition()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_FILE_REFERENCE_DEFINITION = 34;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEXREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FILE_REFERENCE_DEFINITION__ATTRIBUTEDEFINITIONCOMPLEXREF = 0;

	/**
	 * The number of structural features of the '<em>Attribute Value File Reference Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FILE_REFERENCE_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeValueEmbeddedFileDefinitionImpl <em>Attribute Value Embedded File Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeValueEmbeddedFileDefinitionImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueEmbeddedFileDefinition()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_FILE_DEFINITION = 35;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEXREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_FILE_DEFINITION__ATTRIBUTEDEFINITIONCOMPLEXREF = 0;

	/**
	 * The number of structural features of the '<em>Attribute Value Embedded File Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_FILE_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeValueSimpleDefinitionImpl <em>Attribute Value Simple Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeValueSimpleDefinitionImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueSimpleDefinition()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_SIMPLE_DEFINITION = 36;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONSIMPLEREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SIMPLE_DEFINITION__ATTRIBUTEDEFINITIONSIMPLEREF = 0;

	/**
	 * The number of structural features of the '<em>Attribute Value Simple Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SIMPLE_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeValueEnumerationDefinitionImpl <em>Attribute Value Enumeration Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeValueEnumerationDefinitionImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueEnumerationDefinition()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_ENUMERATION_DEFINITION = 37;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONENUMERATIONREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ENUMERATION_DEFINITION__ATTRIBUTEDEFINITIONENUMERATIONREF = 0;

	/**
	 * The number of structural features of the '<em>Attribute Value Enumeration Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ENUMERATION_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeValueXmlDataDefinitionImpl <em>Attribute Value Xml Data Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeValueXmlDataDefinitionImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueXmlDataDefinition()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_XML_DATA_DEFINITION = 38;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEXREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_XML_DATA_DEFINITION__ATTRIBUTEDEFINITIONCOMPLEXREF = 0;

	/**
	 * The number of structural features of the '<em>Attribute Value Xml Data Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_XML_DATA_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.DocumentRootImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 39;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>ACCESSPOLICY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACCESSPOLICY = 3;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEX</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ATTRIBUTEDEFINITIONCOMPLEX = 4;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONENUMERATION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ATTRIBUTEDEFINITIONENUMERATION = 5;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONSIMPLE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ATTRIBUTEDEFINITIONSIMPLE = 6;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDDOCUMENT = 7;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDFILE = 8;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ATTRIBUTEVALUEENUMERATION = 9;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEFILEREFERENCE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ATTRIBUTEVALUEFILEREFERENCE = 10;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUESIMPLE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ATTRIBUTEVALUESIMPLE = 11;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ATTRIBUTEVALUEXMLDATA = 12;

	/**
	 * The feature id for the '<em><b>BINARYCONTENT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BINARYCONTENT = 13;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONBINARYFILE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATATYPEDEFINITIONBINARYFILE = 14;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONBOOLEAN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATATYPEDEFINITIONBOOLEAN = 15;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONDOCUMENT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATATYPEDEFINITIONDOCUMENT = 16;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONENUMERATION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATATYPEDEFINITIONENUMERATION = 17;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONINTEGER</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATATYPEDEFINITIONINTEGER = 18;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONREAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATATYPEDEFINITIONREAL = 19;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONSTRING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATATYPEDEFINITIONSTRING = 20;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONXMLDATA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATATYPEDEFINITIONXMLDATA = 21;

	/**
	 * The feature id for the '<em><b>EMBEDDEDVALUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EMBEDDEDVALUE = 22;

	/**
	 * The feature id for the '<em><b>ENUMVALUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENUMVALUE = 23;

	/**
	 * The feature id for the '<em><b>RELATIONGROUP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RELATIONGROUP = 24;

	/**
	 * The feature id for the '<em><b>RIF</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RIF = 25;

	/**
	 * The feature id for the '<em><b>SPECGROUP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPECGROUP = 26;

	/**
	 * The feature id for the '<em><b>SPECHIERARCHY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPECHIERARCHY = 27;

	/**
	 * The feature id for the '<em><b>SPECHIERARCHYROOT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPECHIERARCHYROOT = 28;

	/**
	 * The feature id for the '<em><b>SPECOBJECT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPECOBJECT = 29;

	/**
	 * The feature id for the '<em><b>SPECRELATION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPECRELATION = 30;

	/**
	 * The feature id for the '<em><b>SPECTYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPECTYPE = 31;

	/**
	 * The feature id for the '<em><b>XHTMLCONTENT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XHTMLCONTENT = 32;

	/**
	 * The feature id for the '<em><b>XMLCONTENT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLCONTENT = 33;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ID = 34;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 35;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.EmbeddedValueImpl <em>Embedded Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.EmbeddedValueImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getEmbeddedValue()
	 * @generated
	 */
	int EMBEDDED_VALUE = 40;

	/**
	 * The feature id for the '<em><b>KEY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_VALUE__KEY = 0;

	/**
	 * The feature id for the '<em><b>OTHERCONTENT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_VALUE__OTHERCONTENT = 1;

	/**
	 * The number of structural features of the '<em>Embedded Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.EnumValueImpl <em>Enum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.EnumValueImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getEnumValue()
	 * @generated
	 */
	int ENUM_VALUE = 41;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__DESC = 1;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__LASTCHANGE = 3;

	/**
	 * The feature id for the '<em><b>PROPERTIES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__PROPERTIES = 4;

	/**
	 * The number of structural features of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.ObjectImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 42;

	/**
	 * The feature id for the '<em><b>SPECOBJECTREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__SPECOBJECTREF = 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.PropertiesImpl <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.PropertiesImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 43;

	/**
	 * The feature id for the '<em><b>EMBEDDEDVALUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__EMBEDDEDVALUE = 0;

	/**
	 * The number of structural features of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.SpecGroupRelationGroupsImpl <em>Spec Group Relation Groups</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.SpecGroupRelationGroupsImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecGroupRelationGroups()
	 * @generated
	 */
	int SPEC_GROUP_RELATION_GROUPS = 44;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP_RELATION_GROUPS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>RELATIONGROUP</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP_RELATION_GROUPS__RELATIONGROUP = 1;

	/**
	 * The number of structural features of the '<em>Spec Group Relation Groups</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP_RELATION_GROUPS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AccessPolicyRelationGroupsImpl <em>Access Policy Relation Groups</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AccessPolicyRelationGroupsImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAccessPolicyRelationGroups()
	 * @generated
	 */
	int ACCESS_POLICY_RELATION_GROUPS = 45;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY_RELATION_GROUPS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>RELATIONGROUPREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY_RELATION_GROUPS__RELATIONGROUPREF = 1;

	/**
	 * The number of structural features of the '<em>Access Policy Relation Groups</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY_RELATION_GROUPS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.RelationGroupImpl <em>Relation Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.RelationGroupImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getRelationGroup()
	 * @generated
	 */
	int RELATION_GROUP = 46;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP__DESC = 1;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP__IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP__LASTCHANGE = 3;

	/**
	 * The feature id for the '<em><b>RELATIONTYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP__RELATIONTYPE = 4;

	/**
	 * The feature id for the '<em><b>SPECRELATIONS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP__SPECRELATIONS = 5;

	/**
	 * The feature id for the '<em><b>TARGETGROUP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP__TARGETGROUP = 6;

	/**
	 * The number of structural features of the '<em>Relation Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.RelationTypeImpl <em>Relation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.RelationTypeImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getRelationType()
	 * @generated
	 */
	int RELATION_TYPE = 47;

	/**
	 * The feature id for the '<em><b>SPECTYPEREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__SPECTYPEREF = 0;

	/**
	 * The number of structural features of the '<em>Relation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.RifImpl <em>Rif</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.RifImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getRif()
	 * @generated
	 */
	int RIF = 48;

	/**
	 * The feature id for the '<em><b>SPECHIERARCHYROOTS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__SPECHIERARCHYROOTS = 0;

	/**
	 * The feature id for the '<em><b>ACCESSPOLICIES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__ACCESSPOLICIES = 1;

	/**
	 * The feature id for the '<em><b>AUTHOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__AUTHOR = 2;

	/**
	 * The feature id for the '<em><b>COMMENT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__COMMENT = 3;

	/**
	 * The feature id for the '<em><b>COUNTRYCODE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__COUNTRYCODE = 4;

	/**
	 * The feature id for the '<em><b>CREATIONTIME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__CREATIONTIME = 5;

	/**
	 * The feature id for the '<em><b>DATATYPES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__DATATYPES = 6;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>SOURCETOOLID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__SOURCETOOLID = 8;

	/**
	 * The feature id for the '<em><b>SPECGROUPS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__SPECGROUPS = 9;

	/**
	 * The feature id for the '<em><b>SPECOBJECTS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__SPECOBJECTS = 10;

	/**
	 * The feature id for the '<em><b>SPECRELATIONS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__SPECRELATIONS = 11;

	/**
	 * The feature id for the '<em><b>SPECTYPES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__SPECTYPES = 12;

	/**
	 * The feature id for the '<em><b>TITLE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__TITLE = 13;

	/**
	 * The feature id for the '<em><b>VERSION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__VERSION = 14;

	/**
	 * The number of structural features of the '<em>Rif</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.SourceImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 49;

	/**
	 * The feature id for the '<em><b>SPECOBJECTREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__SPECOBJECTREF = 0;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.SpecAttributesImpl <em>Spec Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.SpecAttributesImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecAttributes()
	 * @generated
	 */
	int SPEC_ATTRIBUTES = 50;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_ATTRIBUTES__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEX</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONCOMPLEX = 1;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONENUMERATION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONENUMERATION = 2;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONSIMPLE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONSIMPLE = 3;

	/**
	 * The number of structural features of the '<em>Spec Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_ATTRIBUTES_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.RifSpecGroupsImpl <em>Spec Groups</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.RifSpecGroupsImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getRifSpecGroups()
	 * @generated
	 */
	int RIF_SPEC_GROUPS = 51;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_SPEC_GROUPS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECGROUP</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_SPEC_GROUPS__SPECGROUP = 1;

	/**
	 * The number of structural features of the '<em>Spec Groups</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_SPEC_GROUPS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AccessPolicySpecGroupsImpl <em>Access Policy Spec Groups</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AccessPolicySpecGroupsImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAccessPolicySpecGroups()
	 * @generated
	 */
	int ACCESS_POLICY_SPEC_GROUPS = 52;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY_SPEC_GROUPS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECGROUPREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY_SPEC_GROUPS__SPECGROUPREF = 1;

	/**
	 * The number of structural features of the '<em>Access Policy Spec Groups</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY_SPEC_GROUPS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.SpecGroupImpl <em>Spec Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.SpecGroupImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecGroup()
	 * @generated
	 */
	int SPEC_GROUP = 53;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP__DESC = 1;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP__IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP__LASTCHANGE = 3;

	/**
	 * The feature id for the '<em><b>RELATIONGROUPS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP__RELATIONGROUPS = 4;

	/**
	 * The feature id for the '<em><b>SPECOBJECTS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP__SPECOBJECTS = 5;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP__TYPE = 6;

	/**
	 * The feature id for the '<em><b>VALUES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP__VALUES = 7;

	/**
	 * The number of structural features of the '<em>Spec Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.SpecHierarchiesImpl <em>Spec Hierarchies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.SpecHierarchiesImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecHierarchies()
	 * @generated
	 */
	int SPEC_HIERARCHIES = 54;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHIES__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECHIERARCHYREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHIES__SPECHIERARCHYREF = 1;

	/**
	 * The number of structural features of the '<em>Spec Hierarchies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHIES_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.RifSpecHierarchyRootsImpl <em>Spec Hierarchy Roots</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.RifSpecHierarchyRootsImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getRifSpecHierarchyRoots()
	 * @generated
	 */
	int RIF_SPEC_HIERARCHY_ROOTS = 55;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_SPEC_HIERARCHY_ROOTS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECHIERARCHYROOT</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_SPEC_HIERARCHY_ROOTS__SPECHIERARCHYROOT = 1;

	/**
	 * The number of structural features of the '<em>Spec Hierarchy Roots</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_SPEC_HIERARCHY_ROOTS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AccessPolicySpecHierarchyRootsImpl <em>Access Policy Spec Hierarchy Roots</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AccessPolicySpecHierarchyRootsImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAccessPolicySpecHierarchyRoots()
	 * @generated
	 */
	int ACCESS_POLICY_SPEC_HIERARCHY_ROOTS = 56;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY_SPEC_HIERARCHY_ROOTS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECHIERARCHYROOTREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY_SPEC_HIERARCHY_ROOTS__SPECHIERARCHYROOTREF = 1;

	/**
	 * The number of structural features of the '<em>Access Policy Spec Hierarchy Roots</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY_SPEC_HIERARCHY_ROOTS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.SpecHierarchyRootImpl <em>Spec Hierarchy Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.SpecHierarchyRootImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecHierarchyRoot()
	 * @generated
	 */
	int SPEC_HIERARCHY_ROOT = 57;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT__DESC = 1;

	/**
	 * The feature id for the '<em><b>CHILDREN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT__CHILDREN = 2;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT__LASTCHANGE = 4;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT__TYPE = 5;

	/**
	 * The feature id for the '<em><b>VALUES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT__VALUES = 6;

	/**
	 * The number of structural features of the '<em>Spec Hierarchy Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.SpecHierarchyImpl <em>Spec Hierarchy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.SpecHierarchyImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecHierarchy()
	 * @generated
	 */
	int SPEC_HIERARCHY = 58;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY__DESC = 1;

	/**
	 * The feature id for the '<em><b>CHILDREN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY__CHILDREN = 2;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY__LASTCHANGE = 4;

	/**
	 * The feature id for the '<em><b>OBJECT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY__OBJECT = 5;

	/**
	 * The number of structural features of the '<em>Spec Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.SpecifiedValuesImpl <em>Specified Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.SpecifiedValuesImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecifiedValues()
	 * @generated
	 */
	int SPECIFIED_VALUES = 59;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_VALUES__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ENUMVALUE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_VALUES__ENUMVALUE = 1;

	/**
	 * The number of structural features of the '<em>Specified Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_VALUES_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.SpecGroupSpecObjectsImpl <em>Spec Group Spec Objects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.SpecGroupSpecObjectsImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecGroupSpecObjects()
	 * @generated
	 */
	int SPEC_GROUP_SPEC_OBJECTS = 60;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP_SPEC_OBJECTS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECOBJECTREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP_SPEC_OBJECTS__SPECOBJECTREF = 1;

	/**
	 * The number of structural features of the '<em>Spec Group Spec Objects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP_SPEC_OBJECTS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.RifSpecObjectsImpl <em>Spec Objects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.RifSpecObjectsImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getRifSpecObjects()
	 * @generated
	 */
	int RIF_SPEC_OBJECTS = 61;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_SPEC_OBJECTS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECOBJECT</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_SPEC_OBJECTS__SPECOBJECT = 1;

	/**
	 * The number of structural features of the '<em>Spec Objects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_SPEC_OBJECTS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AccessPolicySpecObjectsImpl <em>Access Policy Spec Objects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AccessPolicySpecObjectsImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAccessPolicySpecObjects()
	 * @generated
	 */
	int ACCESS_POLICY_SPEC_OBJECTS = 62;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY_SPEC_OBJECTS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECOBJECTREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY_SPEC_OBJECTS__SPECOBJECTREF = 1;

	/**
	 * The number of structural features of the '<em>Access Policy Spec Objects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY_SPEC_OBJECTS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.SpecObjectImpl <em>Spec Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.SpecObjectImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecObject()
	 * @generated
	 */
	int SPEC_OBJECT = 63;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT__DESC = 1;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT__IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT__LASTCHANGE = 3;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT__TYPE = 4;

	/**
	 * The feature id for the '<em><b>VALUES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT__VALUES = 5;

	/**
	 * The number of structural features of the '<em>Spec Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.RifSpecRelationsImpl <em>Spec Relations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.RifSpecRelationsImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getRifSpecRelations()
	 * @generated
	 */
	int RIF_SPEC_RELATIONS = 64;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_SPEC_RELATIONS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECRELATION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_SPEC_RELATIONS__SPECRELATION = 1;

	/**
	 * The number of structural features of the '<em>Spec Relations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_SPEC_RELATIONS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.RelationGroupSpecRelationsImpl <em>Relation Group Spec Relations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.RelationGroupSpecRelationsImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getRelationGroupSpecRelations()
	 * @generated
	 */
	int RELATION_GROUP_SPEC_RELATIONS = 65;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP_SPEC_RELATIONS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECRELATIONREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP_SPEC_RELATIONS__SPECRELATIONREF = 1;

	/**
	 * The number of structural features of the '<em>Relation Group Spec Relations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP_SPEC_RELATIONS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AccessPolicySpecRelationsImpl <em>Access Policy Spec Relations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AccessPolicySpecRelationsImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAccessPolicySpecRelations()
	 * @generated
	 */
	int ACCESS_POLICY_SPEC_RELATIONS = 66;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY_SPEC_RELATIONS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECRELATIONREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY_SPEC_RELATIONS__SPECRELATIONREF = 1;

	/**
	 * The number of structural features of the '<em>Access Policy Spec Relations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY_SPEC_RELATIONS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.SpecRelationImpl <em>Spec Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.SpecRelationImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecRelation()
	 * @generated
	 */
	int SPEC_RELATION = 67;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__DESC = 1;

	/**
	 * The feature id for the '<em><b>SOURCE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>TARGET</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__TARGET = 3;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__LASTCHANGE = 5;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__TYPE = 6;

	/**
	 * The feature id for the '<em><b>VALUES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__VALUES = 7;

	/**
	 * The number of structural features of the '<em>Spec Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.RifSpecTypesImpl <em>Spec Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.RifSpecTypesImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getRifSpecTypes()
	 * @generated
	 */
	int RIF_SPEC_TYPES = 68;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_SPEC_TYPES__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECTYPE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_SPEC_TYPES__SPECTYPE = 1;

	/**
	 * The number of structural features of the '<em>Spec Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_SPEC_TYPES_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AccessPolicySpecTypesImpl <em>Access Policy Spec Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AccessPolicySpecTypesImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAccessPolicySpecTypes()
	 * @generated
	 */
	int ACCESS_POLICY_SPEC_TYPES = 69;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY_SPEC_TYPES__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECTYPEREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY_SPEC_TYPES__SPECTYPEREF = 1;

	/**
	 * The number of structural features of the '<em>Access Policy Spec Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY_SPEC_TYPES_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.SpecTypeImpl <em>Spec Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.SpecTypeImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecType()
	 * @generated
	 */
	int SPEC_TYPE = 70;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_TYPE__LONGNAME = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_TYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_TYPE__IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_TYPE__LASTCHANGE = 3;

	/**
	 * The feature id for the '<em><b>SPECATTRIBUTES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_TYPE__SPECATTRIBUTES = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_TYPE__ID = 5;

	/**
	 * The number of structural features of the '<em>Spec Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.TargetGroupImpl <em>Target Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.TargetGroupImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getTargetGroup()
	 * @generated
	 */
	int TARGET_GROUP = 71;

	/**
	 * The feature id for the '<em><b>SPECGROUPREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP__SPECGROUPREF = 0;

	/**
	 * The number of structural features of the '<em>Target Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.TargetImpl <em>Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.TargetImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getTarget()
	 * @generated
	 */
	int TARGET = 72;

	/**
	 * The feature id for the '<em><b>SPECOBJECTREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__SPECOBJECTREF = 0;

	/**
	 * The number of structural features of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeDefinitionSimpleTypeImpl <em>Attribute Definition Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeDefinitionSimpleTypeImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeDefinitionSimpleType()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE_TYPE = 73;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONBOOLEANREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONBOOLEANREF = 0;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONINTEGERREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONINTEGERREF = 1;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONREALREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONREALREF = 2;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONSTRINGREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONSTRINGREF = 3;

	/**
	 * The number of structural features of the '<em>Attribute Definition Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.SpecRelationTypeImpl <em>Spec Relation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.SpecRelationTypeImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecRelationType()
	 * @generated
	 */
	int SPEC_RELATION_TYPE = 74;

	/**
	 * The feature id for the '<em><b>SPECTYPEREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION_TYPE__SPECTYPEREF = 0;

	/**
	 * The number of structural features of the '<em>Spec Relation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeDefinitionEnumerationTypeImpl <em>Attribute Definition Enumeration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeDefinitionEnumerationTypeImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeDefinitionEnumerationType()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION_TYPE = 75;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONENUMERATIONREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION_TYPE__DATATYPEDEFINITIONENUMERATIONREF = 0;

	/**
	 * The number of structural features of the '<em>Attribute Definition Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.SpecObjectTypeImpl <em>Spec Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.SpecObjectTypeImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecObjectType()
	 * @generated
	 */
	int SPEC_OBJECT_TYPE = 76;

	/**
	 * The feature id for the '<em><b>SPECTYPEREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT_TYPE__SPECTYPEREF = 0;

	/**
	 * The number of structural features of the '<em>Spec Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.SpecHierarchyRootTypeImpl <em>Spec Hierarchy Root Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.SpecHierarchyRootTypeImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecHierarchyRootType()
	 * @generated
	 */
	int SPEC_HIERARCHY_ROOT_TYPE = 77;

	/**
	 * The feature id for the '<em><b>SPECTYPEREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT_TYPE__SPECTYPEREF = 0;

	/**
	 * The number of structural features of the '<em>Spec Hierarchy Root Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.SpecGroupTypeImpl <em>Spec Group Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.SpecGroupTypeImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecGroupType()
	 * @generated
	 */
	int SPEC_GROUP_TYPE = 78;

	/**
	 * The feature id for the '<em><b>SPECTYPEREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP_TYPE__SPECTYPEREF = 0;

	/**
	 * The number of structural features of the '<em>Spec Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeDefinitionComplexTypeImpl <em>Attribute Definition Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeDefinitionComplexTypeImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeDefinitionComplexType()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX_TYPE = 79;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONBINARYFILEREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX_TYPE__DATATYPEDEFINITIONBINARYFILEREF = 0;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONDOCUMENTREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX_TYPE__DATATYPEDEFINITIONDOCUMENTREF = 1;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONXMLDATAREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX_TYPE__DATATYPEDEFINITIONXMLDATAREF = 2;

	/**
	 * The number of structural features of the '<em>Attribute Definition Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.SpecObjectValuesImpl <em>Spec Object Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.SpecObjectValuesImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecObjectValues()
	 * @generated
	 */
	int SPEC_OBJECT_VALUES = 80;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT_VALUES__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT_VALUES__ATTRIBUTEVALUEEMBEDDEDFILE = 2;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT_VALUES__ATTRIBUTEVALUEENUMERATION = 3;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEFILEREFERENCE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT_VALUES__ATTRIBUTEVALUEFILEREFERENCE = 4;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUESIMPLE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT_VALUES__ATTRIBUTEVALUESIMPLE = 5;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT_VALUES__ATTRIBUTEVALUEXMLDATA = 6;

	/**
	 * The number of structural features of the '<em>Spec Object Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT_VALUES_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.SpecRelationValuesImpl <em>Spec Relation Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.SpecRelationValuesImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecRelationValues()
	 * @generated
	 */
	int SPEC_RELATION_VALUES = 81;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION_VALUES__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION_VALUES__ATTRIBUTEVALUEEMBEDDEDFILE = 2;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION_VALUES__ATTRIBUTEVALUEENUMERATION = 3;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEFILEREFERENCE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION_VALUES__ATTRIBUTEVALUEFILEREFERENCE = 4;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUESIMPLE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION_VALUES__ATTRIBUTEVALUESIMPLE = 5;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION_VALUES__ATTRIBUTEVALUEXMLDATA = 6;

	/**
	 * The number of structural features of the '<em>Spec Relation Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION_VALUES_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.SpecGroupValuesImpl <em>Spec Group Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.SpecGroupValuesImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecGroupValues()
	 * @generated
	 */
	int SPEC_GROUP_VALUES = 82;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP_VALUES__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP_VALUES__ATTRIBUTEVALUEEMBEDDEDFILE = 2;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP_VALUES__ATTRIBUTEVALUEENUMERATION = 3;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEFILEREFERENCE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP_VALUES__ATTRIBUTEVALUEFILEREFERENCE = 4;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUESIMPLE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP_VALUES__ATTRIBUTEVALUESIMPLE = 5;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP_VALUES__ATTRIBUTEVALUEXMLDATA = 6;

	/**
	 * The number of structural features of the '<em>Spec Group Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP_VALUES_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.SpecHierarchyRootValuesImpl <em>Spec Hierarchy Root Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.SpecHierarchyRootValuesImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecHierarchyRootValues()
	 * @generated
	 */
	int SPEC_HIERARCHY_ROOT_VALUES = 83;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT_VALUES__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT_VALUES__ATTRIBUTEVALUEEMBEDDEDFILE = 2;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT_VALUES__ATTRIBUTEVALUEENUMERATION = 3;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEFILEREFERENCE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT_VALUES__ATTRIBUTEVALUEFILEREFERENCE = 4;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUESIMPLE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT_VALUES__ATTRIBUTEVALUESIMPLE = 5;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT_VALUES__ATTRIBUTEVALUEXMLDATA = 6;

	/**
	 * The number of structural features of the '<em>Spec Hierarchy Root Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT_VALUES_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeValueEnumerationValuesImpl <em>Attribute Value Enumeration Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeValueEnumerationValuesImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueEnumerationValues()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_ENUMERATION_VALUES = 84;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ENUMERATION_VALUES__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ENUMVALUEREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ENUMERATION_VALUES__ENUMVALUEREF = 1;

	/**
	 * The number of structural features of the '<em>Attribute Value Enumeration Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ENUMERATION_VALUES_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.XhtmlContentImpl <em>Xhtml Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.XhtmlContentImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getXhtmlContent()
	 * @generated
	 */
	int XHTML_CONTENT = 85;

	/**
	 * The number of structural features of the '<em>Xhtml Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeValueEmbeddedDocumentXhtmlContentImpl <em>Attribute Value Embedded Document Xhtml Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeValueEmbeddedDocumentXhtmlContentImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueEmbeddedDocumentXhtmlContent()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT_XHTML_CONTENT = 86;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT_XHTML_CONTENT__ANY = 0;

	/**
	 * The number of structural features of the '<em>Attribute Value Embedded Document Xhtml Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT_XHTML_CONTENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.XmlContentXmlContentImpl <em>Xml Content Xml Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.XmlContentXmlContentImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getXmlContentXmlContent()
	 * @generated
	 */
	int XML_CONTENT_XML_CONTENT = 87;

	/**
	 * The number of structural features of the '<em>Xml Content Xml Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONTENT_XML_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.internal.AttributeValueXmlDataXmlContentImpl <em>Attribute Value Xml Data Xml Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.AttributeValueXmlDataXmlContentImpl
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueXmlDataXmlContent()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_XML_DATA_XML_CONTENT = 88;

	/**
	 * The feature id for the '<em><b>XMLCONTENT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_XML_DATA_XML_CONTENT__XMLCONTENT = 0;

	/**
	 * The number of structural features of the '<em>Attribute Value Xml Data Xml Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_XML_DATA_XML_CONTENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.ACCESSPOLICYACCESSMODEENUM <em>ACCESSPOLICYACCESSMODEENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.ACCESSPOLICYACCESSMODEENUM
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getACCESSPOLICYACCESSMODEENUM()
	 * @generated
	 */
	int ACCESSPOLICYACCESSMODEENUM = 89;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.BOOLEAN <em>BOOLEAN</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.BOOLEAN
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getBOOLEAN()
	 * @generated
	 */
	int BOOLEAN = 90;

	/**
	 * The meta object id for the '{@link era.foss.model.core.rif.DATATYPEDEFINITIONDOCUMENTFORMATENUM <em>DATATYPEDEFINITIONDOCUMENTFORMATENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.DATATYPEDEFINITIONDOCUMENTFORMATENUM
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDATATYPEDEFINITIONDOCUMENTFORMATENUM()
	 * @generated
	 */
	int DATATYPEDEFINITIONDOCUMENTFORMATENUM = 91;

	/**
	 * The meta object id for the '<em>ACCESSPOLICYACCESSMODEENUM Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.ACCESSPOLICYACCESSMODEENUM
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getACCESSPOLICYACCESSMODEENUMObject()
	 * @generated
	 */
	int ACCESSPOLICYACCESSMODEENUM_OBJECT = 92;

	/**
	 * The meta object id for the '<em>BOOLEAN Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.BOOLEAN
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getBOOLEANObject()
	 * @generated
	 */
	int BOOLEAN_OBJECT = 93;

	/**
	 * The meta object id for the '<em>DATATYPEDEFINITIONDOCUMENTFORMATENUM Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.DATATYPEDEFINITIONDOCUMENTFORMATENUM
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDATATYPEDEFINITIONDOCUMENTFORMATENUMObject()
	 * @generated
	 */
	int DATATYPEDEFINITIONDOCUMENTFORMATENUM_OBJECT = 94;

	/**
	 * The meta object id for the '<em>FLOAT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getFLOAT()
	 * @generated
	 */
	int FLOAT = 95;

	/**
	 * The meta object id for the '<em>FLOAT Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getFLOATObject()
	 * @generated
	 */
	int FLOAT_OBJECT = 96;

	/**
	 * The meta object id for the '<em>INTEGER</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getINTEGER()
	 * @generated
	 */
	int INTEGER = 97;

	/**
	 * The meta object id for the '<em>REF</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getREF()
	 * @generated
	 */
	int REF = 98;

	/**
	 * The meta object id for the '<em>STRING</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSTRING()
	 * @generated
	 */
	int STRING = 99;

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AccessPolicies <em>Access Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Policies</em>'.
	 * @see era.foss.model.core.rif.AccessPolicies
	 * @generated
	 */
	EClass getAccessPolicies();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AccessPolicies#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.AccessPolicies#getGroup()
	 * @see #getAccessPolicies()
	 * @generated
	 */
	EAttribute getAccessPolicies_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.AccessPolicies#getACCESSPOLICY <em>ACCESSPOLICY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ACCESSPOLICY</em>'.
	 * @see era.foss.model.core.rif.AccessPolicies#getACCESSPOLICY()
	 * @see #getAccessPolicies()
	 * @generated
	 */
	EReference getAccessPolicies_ACCESSPOLICY();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AccessPolicy <em>Access Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Policy</em>'.
	 * @see era.foss.model.core.rif.AccessPolicy
	 * @generated
	 */
	EClass getAccessPolicy();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AccessPolicy#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.AccessPolicy#getLONGNAME()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EAttribute getAccessPolicy_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AccessPolicy#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.AccessPolicy#getDESC()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EAttribute getAccessPolicy_DESC();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AccessPolicy#getACCESSMODE <em>ACCESSMODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ACCESSMODE</em>'.
	 * @see era.foss.model.core.rif.AccessPolicy#getACCESSMODE()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EAttribute getAccessPolicy_ACCESSMODE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AccessPolicy#getATTRIBUTEDEFINITIONS <em>ATTRIBUTEDEFINITIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEDEFINITIONS</em>'.
	 * @see era.foss.model.core.rif.AccessPolicy#getATTRIBUTEDEFINITIONS()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EReference getAccessPolicy_ATTRIBUTEDEFINITIONS();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AccessPolicy#getATTRIBUTEVALUES <em>ATTRIBUTEVALUES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUES</em>'.
	 * @see era.foss.model.core.rif.AccessPolicy#getATTRIBUTEVALUES()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EReference getAccessPolicy_ATTRIBUTEVALUES();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AccessPolicy#getDATATYPEDEFINITIONS <em>DATATYPEDEFINITIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DATATYPEDEFINITIONS</em>'.
	 * @see era.foss.model.core.rif.AccessPolicy#getDATATYPEDEFINITIONS()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EReference getAccessPolicy_DATATYPEDEFINITIONS();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AccessPolicy#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.AccessPolicy#getIDENTIFIER()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EAttribute getAccessPolicy_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AccessPolicy#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.AccessPolicy#getLASTCHANGE()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EAttribute getAccessPolicy_LASTCHANGE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AccessPolicy#getRELATIONGROUPS <em>RELATIONGROUPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RELATIONGROUPS</em>'.
	 * @see era.foss.model.core.rif.AccessPolicy#getRELATIONGROUPS()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EReference getAccessPolicy_RELATIONGROUPS();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AccessPolicy#getSPECGROUPS <em>SPECGROUPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECGROUPS</em>'.
	 * @see era.foss.model.core.rif.AccessPolicy#getSPECGROUPS()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EReference getAccessPolicy_SPECGROUPS();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AccessPolicy#getSPECHIERARCHIES <em>SPECHIERARCHIES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECHIERARCHIES</em>'.
	 * @see era.foss.model.core.rif.AccessPolicy#getSPECHIERARCHIES()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EReference getAccessPolicy_SPECHIERARCHIES();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AccessPolicy#getSPECHIERARCHYROOTS <em>SPECHIERARCHYROOTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECHIERARCHYROOTS</em>'.
	 * @see era.foss.model.core.rif.AccessPolicy#getSPECHIERARCHYROOTS()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EReference getAccessPolicy_SPECHIERARCHYROOTS();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AccessPolicy#getSPECOBJECTS <em>SPECOBJECTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECOBJECTS</em>'.
	 * @see era.foss.model.core.rif.AccessPolicy#getSPECOBJECTS()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EReference getAccessPolicy_SPECOBJECTS();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AccessPolicy#getSPECRELATIONS <em>SPECRELATIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECRELATIONS</em>'.
	 * @see era.foss.model.core.rif.AccessPolicy#getSPECRELATIONS()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EReference getAccessPolicy_SPECRELATIONS();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AccessPolicy#getSPECTYPES <em>SPECTYPES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECTYPES</em>'.
	 * @see era.foss.model.core.rif.AccessPolicy#getSPECTYPES()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EReference getAccessPolicy_SPECTYPES();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeDefinitionComplex <em>Attribute Definition Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition Complex</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionComplex
	 * @generated
	 */
	EClass getAttributeDefinitionComplex();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeDefinitionComplex#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionComplex#getLONGNAME()
	 * @see #getAttributeDefinitionComplex()
	 * @generated
	 */
	EAttribute getAttributeDefinitionComplex_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeDefinitionComplex#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionComplex#getDESC()
	 * @see #getAttributeDefinitionComplex()
	 * @generated
	 */
	EAttribute getAttributeDefinitionComplex_DESC();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AttributeDefinitionComplex#getDEFAULTVALUE <em>DEFAULTVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFAULTVALUE</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionComplex#getDEFAULTVALUE()
	 * @see #getAttributeDefinitionComplex()
	 * @generated
	 */
	EReference getAttributeDefinitionComplex_DEFAULTVALUE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AttributeDefinitionComplex#getDEFAULTVALUE2 <em>DEFAULTVALUE2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFAULTVALUE2</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionComplex#getDEFAULTVALUE2()
	 * @see #getAttributeDefinitionComplex()
	 * @generated
	 */
	EReference getAttributeDefinitionComplex_DEFAULTVALUE2();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AttributeDefinitionComplex#getDEFAULTVALUE3 <em>DEFAULTVALUE3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFAULTVALUE3</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionComplex#getDEFAULTVALUE3()
	 * @see #getAttributeDefinitionComplex()
	 * @generated
	 */
	EReference getAttributeDefinitionComplex_DEFAULTVALUE3();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AttributeDefinitionComplex#getDEFAULTVALUE4 <em>DEFAULTVALUE4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFAULTVALUE4</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionComplex#getDEFAULTVALUE4()
	 * @see #getAttributeDefinitionComplex()
	 * @generated
	 */
	EReference getAttributeDefinitionComplex_DEFAULTVALUE4();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeDefinitionComplex#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionComplex#getIDENTIFIER()
	 * @see #getAttributeDefinitionComplex()
	 * @generated
	 */
	EAttribute getAttributeDefinitionComplex_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeDefinitionComplex#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionComplex#getLASTCHANGE()
	 * @see #getAttributeDefinitionComplex()
	 * @generated
	 */
	EAttribute getAttributeDefinitionComplex_LASTCHANGE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AttributeDefinitionComplex#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TYPE</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionComplex#getTYPE()
	 * @see #getAttributeDefinitionComplex()
	 * @generated
	 */
	EReference getAttributeDefinitionComplex_TYPE();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeDefinitionEnumeration <em>Attribute Definition Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition Enumeration</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionEnumeration
	 * @generated
	 */
	EClass getAttributeDefinitionEnumeration();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeDefinitionEnumeration#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionEnumeration#getLONGNAME()
	 * @see #getAttributeDefinitionEnumeration()
	 * @generated
	 */
	EAttribute getAttributeDefinitionEnumeration_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeDefinitionEnumeration#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionEnumeration#getDESC()
	 * @see #getAttributeDefinitionEnumeration()
	 * @generated
	 */
	EAttribute getAttributeDefinitionEnumeration_DESC();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AttributeDefinitionEnumeration#getDEFAULTVALUE <em>DEFAULTVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFAULTVALUE</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionEnumeration#getDEFAULTVALUE()
	 * @see #getAttributeDefinitionEnumeration()
	 * @generated
	 */
	EReference getAttributeDefinitionEnumeration_DEFAULTVALUE();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeDefinitionEnumeration#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionEnumeration#getIDENTIFIER()
	 * @see #getAttributeDefinitionEnumeration()
	 * @generated
	 */
	EAttribute getAttributeDefinitionEnumeration_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeDefinitionEnumeration#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionEnumeration#getLASTCHANGE()
	 * @see #getAttributeDefinitionEnumeration()
	 * @generated
	 */
	EAttribute getAttributeDefinitionEnumeration_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeDefinitionEnumeration#getMULTIVALUED <em>MULTIVALUED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MULTIVALUED</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionEnumeration#getMULTIVALUED()
	 * @see #getAttributeDefinitionEnumeration()
	 * @generated
	 */
	EAttribute getAttributeDefinitionEnumeration_MULTIVALUED();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AttributeDefinitionEnumeration#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TYPE</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionEnumeration#getTYPE()
	 * @see #getAttributeDefinitionEnumeration()
	 * @generated
	 */
	EReference getAttributeDefinitionEnumeration_TYPE();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeDefinitionSimple <em>Attribute Definition Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition Simple</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionSimple
	 * @generated
	 */
	EClass getAttributeDefinitionSimple();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeDefinitionSimple#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionSimple#getLONGNAME()
	 * @see #getAttributeDefinitionSimple()
	 * @generated
	 */
	EAttribute getAttributeDefinitionSimple_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeDefinitionSimple#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionSimple#getDESC()
	 * @see #getAttributeDefinitionSimple()
	 * @generated
	 */
	EAttribute getAttributeDefinitionSimple_DESC();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AttributeDefinitionSimple#getDEFAULTVALUE <em>DEFAULTVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFAULTVALUE</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionSimple#getDEFAULTVALUE()
	 * @see #getAttributeDefinitionSimple()
	 * @generated
	 */
	EReference getAttributeDefinitionSimple_DEFAULTVALUE();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeDefinitionSimple#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionSimple#getIDENTIFIER()
	 * @see #getAttributeDefinitionSimple()
	 * @generated
	 */
	EAttribute getAttributeDefinitionSimple_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeDefinitionSimple#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionSimple#getLASTCHANGE()
	 * @see #getAttributeDefinitionSimple()
	 * @generated
	 */
	EAttribute getAttributeDefinitionSimple_LASTCHANGE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AttributeDefinitionSimple#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TYPE</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionSimple#getTYPE()
	 * @see #getAttributeDefinitionSimple()
	 * @generated
	 */
	EReference getAttributeDefinitionSimple_TYPE();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeDefinitions <em>Attribute Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definitions</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitions
	 * @generated
	 */
	EClass getAttributeDefinitions();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AttributeDefinitions#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitions#getGroup()
	 * @see #getAttributeDefinitions()
	 * @generated
	 */
	EAttribute getAttributeDefinitions_Group();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AttributeDefinitions#getATTRIBUTEDEFINITIONCOMPLEXREF <em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitions#getATTRIBUTEDEFINITIONCOMPLEXREF()
	 * @see #getAttributeDefinitions()
	 * @generated
	 */
	EAttribute getAttributeDefinitions_ATTRIBUTEDEFINITIONCOMPLEXREF();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AttributeDefinitions#getATTRIBUTEDEFINITIONENUMERATIONREF <em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitions#getATTRIBUTEDEFINITIONENUMERATIONREF()
	 * @see #getAttributeDefinitions()
	 * @generated
	 */
	EAttribute getAttributeDefinitions_ATTRIBUTEDEFINITIONENUMERATIONREF();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AttributeDefinitions#getATTRIBUTEDEFINITIONSIMPLEREF <em>ATTRIBUTEDEFINITIONSIMPLEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>ATTRIBUTEDEFINITIONSIMPLEREF</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitions#getATTRIBUTEDEFINITIONSIMPLEREF()
	 * @see #getAttributeDefinitions()
	 * @generated
	 */
	EAttribute getAttributeDefinitions_ATTRIBUTEDEFINITIONSIMPLEREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeValueEmbeddedDocument <em>Attribute Value Embedded Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Embedded Document</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEmbeddedDocument
	 * @generated
	 */
	EClass getAttributeValueEmbeddedDocument();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueEmbeddedDocument#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEmbeddedDocument#getLONGNAME()
	 * @see #getAttributeValueEmbeddedDocument()
	 * @generated
	 */
	EAttribute getAttributeValueEmbeddedDocument_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueEmbeddedDocument#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEmbeddedDocument#getDESC()
	 * @see #getAttributeValueEmbeddedDocument()
	 * @generated
	 */
	EAttribute getAttributeValueEmbeddedDocument_DESC();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AttributeValueEmbeddedDocument#getDEFINITION <em>DEFINITION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFINITION</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEmbeddedDocument#getDEFINITION()
	 * @see #getAttributeValueEmbeddedDocument()
	 * @generated
	 */
	EReference getAttributeValueEmbeddedDocument_DEFINITION();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueEmbeddedDocument#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEmbeddedDocument#getIDENTIFIER()
	 * @see #getAttributeValueEmbeddedDocument()
	 * @generated
	 */
	EAttribute getAttributeValueEmbeddedDocument_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueEmbeddedDocument#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEmbeddedDocument#getLASTCHANGE()
	 * @see #getAttributeValueEmbeddedDocument()
	 * @generated
	 */
	EAttribute getAttributeValueEmbeddedDocument_LASTCHANGE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AttributeValueEmbeddedDocument#getXHTMLCONTENT <em>XHTMLCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XHTMLCONTENT</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEmbeddedDocument#getXHTMLCONTENT()
	 * @see #getAttributeValueEmbeddedDocument()
	 * @generated
	 */
	EReference getAttributeValueEmbeddedDocument_XHTMLCONTENT();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeValueEmbeddedFile <em>Attribute Value Embedded File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Embedded File</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEmbeddedFile
	 * @generated
	 */
	EClass getAttributeValueEmbeddedFile();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueEmbeddedFile#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEmbeddedFile#getLONGNAME()
	 * @see #getAttributeValueEmbeddedFile()
	 * @generated
	 */
	EAttribute getAttributeValueEmbeddedFile_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueEmbeddedFile#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEmbeddedFile#getDESC()
	 * @see #getAttributeValueEmbeddedFile()
	 * @generated
	 */
	EAttribute getAttributeValueEmbeddedFile_DESC();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AttributeValueEmbeddedFile#getBINARYCONTENT <em>BINARYCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BINARYCONTENT</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEmbeddedFile#getBINARYCONTENT()
	 * @see #getAttributeValueEmbeddedFile()
	 * @generated
	 */
	EReference getAttributeValueEmbeddedFile_BINARYCONTENT();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AttributeValueEmbeddedFile#getDEFINITION <em>DEFINITION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFINITION</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEmbeddedFile#getDEFINITION()
	 * @see #getAttributeValueEmbeddedFile()
	 * @generated
	 */
	EReference getAttributeValueEmbeddedFile_DEFINITION();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueEmbeddedFile#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEmbeddedFile#getIDENTIFIER()
	 * @see #getAttributeValueEmbeddedFile()
	 * @generated
	 */
	EAttribute getAttributeValueEmbeddedFile_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueEmbeddedFile#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEmbeddedFile#getLASTCHANGE()
	 * @see #getAttributeValueEmbeddedFile()
	 * @generated
	 */
	EAttribute getAttributeValueEmbeddedFile_LASTCHANGE();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeValueEnumeration <em>Attribute Value Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Enumeration</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEnumeration
	 * @generated
	 */
	EClass getAttributeValueEnumeration();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueEnumeration#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEnumeration#getLONGNAME()
	 * @see #getAttributeValueEnumeration()
	 * @generated
	 */
	EAttribute getAttributeValueEnumeration_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueEnumeration#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEnumeration#getDESC()
	 * @see #getAttributeValueEnumeration()
	 * @generated
	 */
	EAttribute getAttributeValueEnumeration_DESC();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AttributeValueEnumeration#getDEFINITION <em>DEFINITION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFINITION</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEnumeration#getDEFINITION()
	 * @see #getAttributeValueEnumeration()
	 * @generated
	 */
	EReference getAttributeValueEnumeration_DEFINITION();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueEnumeration#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEnumeration#getIDENTIFIER()
	 * @see #getAttributeValueEnumeration()
	 * @generated
	 */
	EAttribute getAttributeValueEnumeration_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueEnumeration#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEnumeration#getLASTCHANGE()
	 * @see #getAttributeValueEnumeration()
	 * @generated
	 */
	EAttribute getAttributeValueEnumeration_LASTCHANGE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AttributeValueEnumeration#getVALUES <em>VALUES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VALUES</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEnumeration#getVALUES()
	 * @see #getAttributeValueEnumeration()
	 * @generated
	 */
	EReference getAttributeValueEnumeration_VALUES();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeValueFileReference <em>Attribute Value File Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value File Reference</em>'.
	 * @see era.foss.model.core.rif.AttributeValueFileReference
	 * @generated
	 */
	EClass getAttributeValueFileReference();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueFileReference#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.AttributeValueFileReference#getLONGNAME()
	 * @see #getAttributeValueFileReference()
	 * @generated
	 */
	EAttribute getAttributeValueFileReference_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueFileReference#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.AttributeValueFileReference#getDESC()
	 * @see #getAttributeValueFileReference()
	 * @generated
	 */
	EAttribute getAttributeValueFileReference_DESC();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AttributeValueFileReference#getDEFINITION <em>DEFINITION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFINITION</em>'.
	 * @see era.foss.model.core.rif.AttributeValueFileReference#getDEFINITION()
	 * @see #getAttributeValueFileReference()
	 * @generated
	 */
	EReference getAttributeValueFileReference_DEFINITION();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueFileReference#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.AttributeValueFileReference#getIDENTIFIER()
	 * @see #getAttributeValueFileReference()
	 * @generated
	 */
	EAttribute getAttributeValueFileReference_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueFileReference#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.AttributeValueFileReference#getLASTCHANGE()
	 * @see #getAttributeValueFileReference()
	 * @generated
	 */
	EAttribute getAttributeValueFileReference_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueFileReference#getPATHTOFILE <em>PATHTOFILE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PATHTOFILE</em>'.
	 * @see era.foss.model.core.rif.AttributeValueFileReference#getPATHTOFILE()
	 * @see #getAttributeValueFileReference()
	 * @generated
	 */
	EAttribute getAttributeValueFileReference_PATHTOFILE();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeValueSimple <em>Attribute Value Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Simple</em>'.
	 * @see era.foss.model.core.rif.AttributeValueSimple
	 * @generated
	 */
	EClass getAttributeValueSimple();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueSimple#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.AttributeValueSimple#getLONGNAME()
	 * @see #getAttributeValueSimple()
	 * @generated
	 */
	EAttribute getAttributeValueSimple_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueSimple#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.AttributeValueSimple#getDESC()
	 * @see #getAttributeValueSimple()
	 * @generated
	 */
	EAttribute getAttributeValueSimple_DESC();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AttributeValueSimple#getDEFINITION <em>DEFINITION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFINITION</em>'.
	 * @see era.foss.model.core.rif.AttributeValueSimple#getDEFINITION()
	 * @see #getAttributeValueSimple()
	 * @generated
	 */
	EReference getAttributeValueSimple_DEFINITION();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueSimple#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.AttributeValueSimple#getIDENTIFIER()
	 * @see #getAttributeValueSimple()
	 * @generated
	 */
	EAttribute getAttributeValueSimple_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueSimple#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.AttributeValueSimple#getLASTCHANGE()
	 * @see #getAttributeValueSimple()
	 * @generated
	 */
	EAttribute getAttributeValueSimple_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueSimple#getTHEVALUE <em>THEVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>THEVALUE</em>'.
	 * @see era.foss.model.core.rif.AttributeValueSimple#getTHEVALUE()
	 * @see #getAttributeValueSimple()
	 * @generated
	 */
	EAttribute getAttributeValueSimple_THEVALUE();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeValues <em>Attribute Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Values</em>'.
	 * @see era.foss.model.core.rif.AttributeValues
	 * @generated
	 */
	EClass getAttributeValues();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AttributeValues#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.AttributeValues#getGroup()
	 * @see #getAttributeValues()
	 * @generated
	 */
	EAttribute getAttributeValues_Group();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AttributeValues#getATTRIBUTEVALUEEMBEDDEDDOCUMENTREF <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF</em>'.
	 * @see era.foss.model.core.rif.AttributeValues#getATTRIBUTEVALUEEMBEDDEDDOCUMENTREF()
	 * @see #getAttributeValues()
	 * @generated
	 */
	EAttribute getAttributeValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AttributeValues#getATTRIBUTEVALUEEMBEDDEDFILEREF <em>ATTRIBUTEVALUEEMBEDDEDFILEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>ATTRIBUTEVALUEEMBEDDEDFILEREF</em>'.
	 * @see era.foss.model.core.rif.AttributeValues#getATTRIBUTEVALUEEMBEDDEDFILEREF()
	 * @see #getAttributeValues()
	 * @generated
	 */
	EAttribute getAttributeValues_ATTRIBUTEVALUEEMBEDDEDFILEREF();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AttributeValues#getATTRIBUTEVALUEENUMERATIONREF <em>ATTRIBUTEVALUEENUMERATIONREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>ATTRIBUTEVALUEENUMERATIONREF</em>'.
	 * @see era.foss.model.core.rif.AttributeValues#getATTRIBUTEVALUEENUMERATIONREF()
	 * @see #getAttributeValues()
	 * @generated
	 */
	EAttribute getAttributeValues_ATTRIBUTEVALUEENUMERATIONREF();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AttributeValues#getATTRIBUTEVALUEFILEREFERENCEREF <em>ATTRIBUTEVALUEFILEREFERENCEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>ATTRIBUTEVALUEFILEREFERENCEREF</em>'.
	 * @see era.foss.model.core.rif.AttributeValues#getATTRIBUTEVALUEFILEREFERENCEREF()
	 * @see #getAttributeValues()
	 * @generated
	 */
	EAttribute getAttributeValues_ATTRIBUTEVALUEFILEREFERENCEREF();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AttributeValues#getATTRIBUTEVALUESIMPLEREF <em>ATTRIBUTEVALUESIMPLEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>ATTRIBUTEVALUESIMPLEREF</em>'.
	 * @see era.foss.model.core.rif.AttributeValues#getATTRIBUTEVALUESIMPLEREF()
	 * @see #getAttributeValues()
	 * @generated
	 */
	EAttribute getAttributeValues_ATTRIBUTEVALUESIMPLEREF();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AttributeValues#getATTRIBUTEVALUEXMLDATAREF <em>ATTRIBUTEVALUEXMLDATAREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>ATTRIBUTEVALUEXMLDATAREF</em>'.
	 * @see era.foss.model.core.rif.AttributeValues#getATTRIBUTEVALUEXMLDATAREF()
	 * @see #getAttributeValues()
	 * @generated
	 */
	EAttribute getAttributeValues_ATTRIBUTEVALUEXMLDATAREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeValueXmlData <em>Attribute Value Xml Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Xml Data</em>'.
	 * @see era.foss.model.core.rif.AttributeValueXmlData
	 * @generated
	 */
	EClass getAttributeValueXmlData();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueXmlData#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.AttributeValueXmlData#getLONGNAME()
	 * @see #getAttributeValueXmlData()
	 * @generated
	 */
	EAttribute getAttributeValueXmlData_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueXmlData#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.AttributeValueXmlData#getDESC()
	 * @see #getAttributeValueXmlData()
	 * @generated
	 */
	EAttribute getAttributeValueXmlData_DESC();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AttributeValueXmlData#getDEFINITION <em>DEFINITION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFINITION</em>'.
	 * @see era.foss.model.core.rif.AttributeValueXmlData#getDEFINITION()
	 * @see #getAttributeValueXmlData()
	 * @generated
	 */
	EReference getAttributeValueXmlData_DEFINITION();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueXmlData#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.AttributeValueXmlData#getIDENTIFIER()
	 * @see #getAttributeValueXmlData()
	 * @generated
	 */
	EAttribute getAttributeValueXmlData_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueXmlData#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.AttributeValueXmlData#getLASTCHANGE()
	 * @see #getAttributeValueXmlData()
	 * @generated
	 */
	EAttribute getAttributeValueXmlData_LASTCHANGE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AttributeValueXmlData#getXMLCONTENT <em>XMLCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XMLCONTENT</em>'.
	 * @see era.foss.model.core.rif.AttributeValueXmlData#getXMLCONTENT()
	 * @see #getAttributeValueXmlData()
	 * @generated
	 */
	EReference getAttributeValueXmlData_XMLCONTENT();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.BinaryContent <em>Binary Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Content</em>'.
	 * @see era.foss.model.core.rif.BinaryContent
	 * @generated
	 */
	EClass getBinaryContent();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeValueEmbeddedFileBinaryContent <em>Attribute Value Embedded File Binary Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Embedded File Binary Content</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEmbeddedFileBinaryContent
	 * @generated
	 */
	EClass getAttributeValueEmbeddedFileBinaryContent();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AttributeValueEmbeddedFileBinaryContent#getBINARYCONTENT <em>BINARYCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BINARYCONTENT</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEmbeddedFileBinaryContent#getBINARYCONTENT()
	 * @see #getAttributeValueEmbeddedFileBinaryContent()
	 * @generated
	 */
	EReference getAttributeValueEmbeddedFileBinaryContent_BINARYCONTENT();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.SpecHierarchyChildren <em>Spec Hierarchy Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Hierarchy Children</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchyChildren
	 * @generated
	 */
	EClass getSpecHierarchyChildren();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.SpecHierarchyChildren#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchyChildren#getGroup()
	 * @see #getSpecHierarchyChildren()
	 * @generated
	 */
	EAttribute getSpecHierarchyChildren_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecHierarchyChildren#getSPECHIERARCHY <em>SPECHIERARCHY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPECHIERARCHY</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchyChildren#getSPECHIERARCHY()
	 * @see #getSpecHierarchyChildren()
	 * @generated
	 */
	EReference getSpecHierarchyChildren_SPECHIERARCHY();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.SpecHierarchyRootChildren <em>Spec Hierarchy Root Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Hierarchy Root Children</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchyRootChildren
	 * @generated
	 */
	EClass getSpecHierarchyRootChildren();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.SpecHierarchyRootChildren#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchyRootChildren#getGroup()
	 * @see #getSpecHierarchyRootChildren()
	 * @generated
	 */
	EAttribute getSpecHierarchyRootChildren_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecHierarchyRootChildren#getSPECHIERARCHY <em>SPECHIERARCHY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPECHIERARCHY</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchyRootChildren#getSPECHIERARCHY()
	 * @see #getSpecHierarchyRootChildren()
	 * @generated
	 */
	EReference getSpecHierarchyRootChildren_SPECHIERARCHY();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile <em>Datatype Definition Binary File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition Binary File</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionBinaryFile
	 * @generated
	 */
	EClass getDatatypeDefinitionBinaryFile();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getLONGNAME()
	 * @see #getDatatypeDefinitionBinaryFile()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionBinaryFile_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getDESC()
	 * @see #getDatatypeDefinitionBinaryFile()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionBinaryFile_DESC();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getAPPLICATION <em>APPLICATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>APPLICATION</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getAPPLICATION()
	 * @see #getDatatypeDefinitionBinaryFile()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionBinaryFile_APPLICATION();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getEMBEDDED <em>EMBEDDED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EMBEDDED</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getEMBEDDED()
	 * @see #getDatatypeDefinitionBinaryFile()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionBinaryFile_EMBEDDED();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getFILENAMESUFFIX <em>FILENAMESUFFIX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FILENAMESUFFIX</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getFILENAMESUFFIX()
	 * @see #getDatatypeDefinitionBinaryFile()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionBinaryFile_FILENAMESUFFIX();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getFORMATNAME <em>FORMATNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FORMATNAME</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getFORMATNAME()
	 * @see #getDatatypeDefinitionBinaryFile()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionBinaryFile_FORMATNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getIDENTIFIER()
	 * @see #getDatatypeDefinitionBinaryFile()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionBinaryFile_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getLASTCHANGE()
	 * @see #getDatatypeDefinitionBinaryFile()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionBinaryFile_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getMIMETYPE <em>MIMETYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MIMETYPE</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionBinaryFile#getMIMETYPE()
	 * @see #getDatatypeDefinitionBinaryFile()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionBinaryFile_MIMETYPE();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.DatatypeDefinitionBoolean <em>Datatype Definition Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition Boolean</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionBoolean
	 * @generated
	 */
	EClass getDatatypeDefinitionBoolean();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionBoolean#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionBoolean#getLONGNAME()
	 * @see #getDatatypeDefinitionBoolean()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionBoolean_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionBoolean#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionBoolean#getDESC()
	 * @see #getDatatypeDefinitionBoolean()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionBoolean_DESC();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionBoolean#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionBoolean#getIDENTIFIER()
	 * @see #getDatatypeDefinitionBoolean()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionBoolean_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionBoolean#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionBoolean#getLASTCHANGE()
	 * @see #getDatatypeDefinitionBoolean()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionBoolean_LASTCHANGE();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.DatatypeDefinitionDocument <em>Datatype Definition Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition Document</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionDocument
	 * @generated
	 */
	EClass getDatatypeDefinitionDocument();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionDocument#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionDocument#getLONGNAME()
	 * @see #getDatatypeDefinitionDocument()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionDocument_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionDocument#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionDocument#getDESC()
	 * @see #getDatatypeDefinitionDocument()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionDocument_DESC();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionDocument#getEMBEDDED <em>EMBEDDED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EMBEDDED</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionDocument#getEMBEDDED()
	 * @see #getDatatypeDefinitionDocument()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionDocument_EMBEDDED();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionDocument#getFORMAT <em>FORMAT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FORMAT</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionDocument#getFORMAT()
	 * @see #getDatatypeDefinitionDocument()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionDocument_FORMAT();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionDocument#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionDocument#getIDENTIFIER()
	 * @see #getDatatypeDefinitionDocument()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionDocument_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionDocument#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionDocument#getLASTCHANGE()
	 * @see #getDatatypeDefinitionDocument()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionDocument_LASTCHANGE();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.DatatypeDefinitionEnumeration <em>Datatype Definition Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition Enumeration</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionEnumeration
	 * @generated
	 */
	EClass getDatatypeDefinitionEnumeration();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionEnumeration#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionEnumeration#getLONGNAME()
	 * @see #getDatatypeDefinitionEnumeration()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionEnumeration_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionEnumeration#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionEnumeration#getDESC()
	 * @see #getDatatypeDefinitionEnumeration()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionEnumeration_DESC();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionEnumeration#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionEnumeration#getIDENTIFIER()
	 * @see #getDatatypeDefinitionEnumeration()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionEnumeration_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionEnumeration#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionEnumeration#getLASTCHANGE()
	 * @see #getDatatypeDefinitionEnumeration()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionEnumeration_LASTCHANGE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DatatypeDefinitionEnumeration#getSPECIFIEDVALUES <em>SPECIFIEDVALUES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECIFIEDVALUES</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionEnumeration#getSPECIFIEDVALUES()
	 * @see #getDatatypeDefinitionEnumeration()
	 * @generated
	 */
	EReference getDatatypeDefinitionEnumeration_SPECIFIEDVALUES();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.DatatypeDefinitionInteger <em>Datatype Definition Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition Integer</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionInteger
	 * @generated
	 */
	EClass getDatatypeDefinitionInteger();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionInteger#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionInteger#getLONGNAME()
	 * @see #getDatatypeDefinitionInteger()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionInteger_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionInteger#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionInteger#getDESC()
	 * @see #getDatatypeDefinitionInteger()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionInteger_DESC();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionInteger#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionInteger#getIDENTIFIER()
	 * @see #getDatatypeDefinitionInteger()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionInteger_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionInteger#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionInteger#getLASTCHANGE()
	 * @see #getDatatypeDefinitionInteger()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionInteger_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionInteger#getMAX <em>MAX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAX</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionInteger#getMAX()
	 * @see #getDatatypeDefinitionInteger()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionInteger_MAX();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionInteger#getMIN <em>MIN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MIN</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionInteger#getMIN()
	 * @see #getDatatypeDefinitionInteger()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionInteger_MIN();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.DatatypeDefinitionReal <em>Datatype Definition Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition Real</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionReal
	 * @generated
	 */
	EClass getDatatypeDefinitionReal();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionReal#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionReal#getLONGNAME()
	 * @see #getDatatypeDefinitionReal()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionReal_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionReal#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionReal#getDESC()
	 * @see #getDatatypeDefinitionReal()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionReal_DESC();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionReal#getACCURACY <em>ACCURACY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ACCURACY</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionReal#getACCURACY()
	 * @see #getDatatypeDefinitionReal()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionReal_ACCURACY();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionReal#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionReal#getIDENTIFIER()
	 * @see #getDatatypeDefinitionReal()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionReal_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionReal#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionReal#getLASTCHANGE()
	 * @see #getDatatypeDefinitionReal()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionReal_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionReal#getMAX <em>MAX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAX</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionReal#getMAX()
	 * @see #getDatatypeDefinitionReal()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionReal_MAX();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionReal#getMIN <em>MIN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MIN</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionReal#getMIN()
	 * @see #getDatatypeDefinitionReal()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionReal_MIN();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.DatatypeDefinitionString <em>Datatype Definition String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition String</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionString
	 * @generated
	 */
	EClass getDatatypeDefinitionString();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionString#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionString#getLONGNAME()
	 * @see #getDatatypeDefinitionString()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionString_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionString#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionString#getDESC()
	 * @see #getDatatypeDefinitionString()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionString_DESC();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionString#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionString#getIDENTIFIER()
	 * @see #getDatatypeDefinitionString()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionString_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionString#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionString#getLASTCHANGE()
	 * @see #getDatatypeDefinitionString()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionString_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionString#getMAXLENGTH <em>MAXLENGTH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAXLENGTH</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionString#getMAXLENGTH()
	 * @see #getDatatypeDefinitionString()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionString_MAXLENGTH();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.DatatypeDefinitions <em>Datatype Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definitions</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitions
	 * @generated
	 */
	EClass getDatatypeDefinitions();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.DatatypeDefinitions#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitions#getGroup()
	 * @see #getDatatypeDefinitions()
	 * @generated
	 */
	EAttribute getDatatypeDefinitions_Group();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.DatatypeDefinitions#getDATATYPEDEFINITIONBINARYFILEREF <em>DATATYPEDEFINITIONBINARYFILEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>DATATYPEDEFINITIONBINARYFILEREF</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitions#getDATATYPEDEFINITIONBINARYFILEREF()
	 * @see #getDatatypeDefinitions()
	 * @generated
	 */
	EAttribute getDatatypeDefinitions_DATATYPEDEFINITIONBINARYFILEREF();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.DatatypeDefinitions#getDATATYPEDEFINITIONBOOLEANREF <em>DATATYPEDEFINITIONBOOLEANREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>DATATYPEDEFINITIONBOOLEANREF</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitions#getDATATYPEDEFINITIONBOOLEANREF()
	 * @see #getDatatypeDefinitions()
	 * @generated
	 */
	EAttribute getDatatypeDefinitions_DATATYPEDEFINITIONBOOLEANREF();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.DatatypeDefinitions#getDATATYPEDEFINITIONDOCUMENTREF <em>DATATYPEDEFINITIONDOCUMENTREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>DATATYPEDEFINITIONDOCUMENTREF</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitions#getDATATYPEDEFINITIONDOCUMENTREF()
	 * @see #getDatatypeDefinitions()
	 * @generated
	 */
	EAttribute getDatatypeDefinitions_DATATYPEDEFINITIONDOCUMENTREF();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.DatatypeDefinitions#getDATATYPEDEFINITIONENUMERATIONREF <em>DATATYPEDEFINITIONENUMERATIONREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>DATATYPEDEFINITIONENUMERATIONREF</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitions#getDATATYPEDEFINITIONENUMERATIONREF()
	 * @see #getDatatypeDefinitions()
	 * @generated
	 */
	EAttribute getDatatypeDefinitions_DATATYPEDEFINITIONENUMERATIONREF();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.DatatypeDefinitions#getDATATYPEDEFINITIONINTEGERREF <em>DATATYPEDEFINITIONINTEGERREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>DATATYPEDEFINITIONINTEGERREF</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitions#getDATATYPEDEFINITIONINTEGERREF()
	 * @see #getDatatypeDefinitions()
	 * @generated
	 */
	EAttribute getDatatypeDefinitions_DATATYPEDEFINITIONINTEGERREF();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.DatatypeDefinitions#getDATATYPEDEFINITIONREALREF <em>DATATYPEDEFINITIONREALREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>DATATYPEDEFINITIONREALREF</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitions#getDATATYPEDEFINITIONREALREF()
	 * @see #getDatatypeDefinitions()
	 * @generated
	 */
	EAttribute getDatatypeDefinitions_DATATYPEDEFINITIONREALREF();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.DatatypeDefinitions#getDATATYPEDEFINITIONSTRINGREF <em>DATATYPEDEFINITIONSTRINGREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>DATATYPEDEFINITIONSTRINGREF</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitions#getDATATYPEDEFINITIONSTRINGREF()
	 * @see #getDatatypeDefinitions()
	 * @generated
	 */
	EAttribute getDatatypeDefinitions_DATATYPEDEFINITIONSTRINGREF();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.DatatypeDefinitions#getDATATYPEDEFINITIONXMLDATAREF <em>DATATYPEDEFINITIONXMLDATAREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>DATATYPEDEFINITIONXMLDATAREF</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitions#getDATATYPEDEFINITIONXMLDATAREF()
	 * @see #getDatatypeDefinitions()
	 * @generated
	 */
	EAttribute getDatatypeDefinitions_DATATYPEDEFINITIONXMLDATAREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.DatatypeDefinitionXmlData <em>Datatype Definition Xml Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition Xml Data</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionXmlData
	 * @generated
	 */
	EClass getDatatypeDefinitionXmlData();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionXmlData#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionXmlData#getLONGNAME()
	 * @see #getDatatypeDefinitionXmlData()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionXmlData_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionXmlData#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionXmlData#getDESC()
	 * @see #getDatatypeDefinitionXmlData()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionXmlData_DESC();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionXmlData#getEMBEDDED <em>EMBEDDED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EMBEDDED</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionXmlData#getEMBEDDED()
	 * @see #getDatatypeDefinitionXmlData()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionXmlData_EMBEDDED();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionXmlData#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionXmlData#getIDENTIFIER()
	 * @see #getDatatypeDefinitionXmlData()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionXmlData_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionXmlData#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionXmlData#getLASTCHANGE()
	 * @see #getDatatypeDefinitionXmlData()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionXmlData_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionXmlData#getNAMESPACEURI <em>NAMESPACEURI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NAMESPACEURI</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionXmlData#getNAMESPACEURI()
	 * @see #getDatatypeDefinitionXmlData()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionXmlData_NAMESPACEURI();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DatatypeDefinitionXmlData#getSCHEMALOCATION <em>SCHEMALOCATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SCHEMALOCATION</em>'.
	 * @see era.foss.model.core.rif.DatatypeDefinitionXmlData#getSCHEMALOCATION()
	 * @see #getDatatypeDefinitionXmlData()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionXmlData_SCHEMALOCATION();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.Datatypes <em>Datatypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatypes</em>'.
	 * @see era.foss.model.core.rif.Datatypes
	 * @generated
	 */
	EClass getDatatypes();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.Datatypes#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.Datatypes#getGroup()
	 * @see #getDatatypes()
	 * @generated
	 */
	EAttribute getDatatypes_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.Datatypes#getDATATYPEDEFINITIONBINARYFILE <em>DATATYPEDEFINITIONBINARYFILE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DATATYPEDEFINITIONBINARYFILE</em>'.
	 * @see era.foss.model.core.rif.Datatypes#getDATATYPEDEFINITIONBINARYFILE()
	 * @see #getDatatypes()
	 * @generated
	 */
	EReference getDatatypes_DATATYPEDEFINITIONBINARYFILE();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.Datatypes#getDATATYPEDEFINITIONBOOLEAN <em>DATATYPEDEFINITIONBOOLEAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DATATYPEDEFINITIONBOOLEAN</em>'.
	 * @see era.foss.model.core.rif.Datatypes#getDATATYPEDEFINITIONBOOLEAN()
	 * @see #getDatatypes()
	 * @generated
	 */
	EReference getDatatypes_DATATYPEDEFINITIONBOOLEAN();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.Datatypes#getDATATYPEDEFINITIONDOCUMENT <em>DATATYPEDEFINITIONDOCUMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DATATYPEDEFINITIONDOCUMENT</em>'.
	 * @see era.foss.model.core.rif.Datatypes#getDATATYPEDEFINITIONDOCUMENT()
	 * @see #getDatatypes()
	 * @generated
	 */
	EReference getDatatypes_DATATYPEDEFINITIONDOCUMENT();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.Datatypes#getDATATYPEDEFINITIONENUMERATION <em>DATATYPEDEFINITIONENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DATATYPEDEFINITIONENUMERATION</em>'.
	 * @see era.foss.model.core.rif.Datatypes#getDATATYPEDEFINITIONENUMERATION()
	 * @see #getDatatypes()
	 * @generated
	 */
	EReference getDatatypes_DATATYPEDEFINITIONENUMERATION();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.Datatypes#getDATATYPEDEFINITIONINTEGER <em>DATATYPEDEFINITIONINTEGER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DATATYPEDEFINITIONINTEGER</em>'.
	 * @see era.foss.model.core.rif.Datatypes#getDATATYPEDEFINITIONINTEGER()
	 * @see #getDatatypes()
	 * @generated
	 */
	EReference getDatatypes_DATATYPEDEFINITIONINTEGER();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.Datatypes#getDATATYPEDEFINITIONREAL <em>DATATYPEDEFINITIONREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DATATYPEDEFINITIONREAL</em>'.
	 * @see era.foss.model.core.rif.Datatypes#getDATATYPEDEFINITIONREAL()
	 * @see #getDatatypes()
	 * @generated
	 */
	EReference getDatatypes_DATATYPEDEFINITIONREAL();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.Datatypes#getDATATYPEDEFINITIONSTRING <em>DATATYPEDEFINITIONSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DATATYPEDEFINITIONSTRING</em>'.
	 * @see era.foss.model.core.rif.Datatypes#getDATATYPEDEFINITIONSTRING()
	 * @see #getDatatypes()
	 * @generated
	 */
	EReference getDatatypes_DATATYPEDEFINITIONSTRING();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.Datatypes#getDATATYPEDEFINITIONXMLDATA <em>DATATYPEDEFINITIONXMLDATA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DATATYPEDEFINITIONXMLDATA</em>'.
	 * @see era.foss.model.core.rif.Datatypes#getDATATYPEDEFINITIONXMLDATA()
	 * @see #getDatatypes()
	 * @generated
	 */
	EReference getDatatypes_DATATYPEDEFINITIONXMLDATA();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.DefaultValue2 <em>Default Value2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Value2</em>'.
	 * @see era.foss.model.core.rif.DefaultValue2
	 * @generated
	 */
	EClass getDefaultValue2();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DefaultValue2#getATTRIBUTEVALUEEMBEDDEDFILE <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUEEMBEDDEDFILE</em>'.
	 * @see era.foss.model.core.rif.DefaultValue2#getATTRIBUTEVALUEEMBEDDEDFILE()
	 * @see #getDefaultValue2()
	 * @generated
	 */
	EReference getDefaultValue2_ATTRIBUTEVALUEEMBEDDEDFILE();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.DefaultValue3 <em>Default Value3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Value3</em>'.
	 * @see era.foss.model.core.rif.DefaultValue3
	 * @generated
	 */
	EClass getDefaultValue3();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DefaultValue3#getATTRIBUTEVALUEEMBEDDEDDOCUMENT <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>'.
	 * @see era.foss.model.core.rif.DefaultValue3#getATTRIBUTEVALUEEMBEDDEDDOCUMENT()
	 * @see #getDefaultValue3()
	 * @generated
	 */
	EReference getDefaultValue3_ATTRIBUTEVALUEEMBEDDEDDOCUMENT();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.DefaultValue4 <em>Default Value4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Value4</em>'.
	 * @see era.foss.model.core.rif.DefaultValue4
	 * @generated
	 */
	EClass getDefaultValue4();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DefaultValue4#getATTRIBUTEVALUEFILEREFERENCE <em>ATTRIBUTEVALUEFILEREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUEFILEREFERENCE</em>'.
	 * @see era.foss.model.core.rif.DefaultValue4#getATTRIBUTEVALUEFILEREFERENCE()
	 * @see #getDefaultValue4()
	 * @generated
	 */
	EReference getDefaultValue4_ATTRIBUTEVALUEFILEREFERENCE();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeDefinitionSimpleDefaultValue <em>Attribute Definition Simple Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition Simple Default Value</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionSimpleDefaultValue
	 * @generated
	 */
	EClass getAttributeDefinitionSimpleDefaultValue();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AttributeDefinitionSimpleDefaultValue#getATTRIBUTEVALUESIMPLE <em>ATTRIBUTEVALUESIMPLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUESIMPLE</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionSimpleDefaultValue#getATTRIBUTEVALUESIMPLE()
	 * @see #getAttributeDefinitionSimpleDefaultValue()
	 * @generated
	 */
	EReference getAttributeDefinitionSimpleDefaultValue_ATTRIBUTEVALUESIMPLE();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeDefinitionEnumerationDefaultValue <em>Attribute Definition Enumeration Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition Enumeration Default Value</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionEnumerationDefaultValue
	 * @generated
	 */
	EClass getAttributeDefinitionEnumerationDefaultValue();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AttributeDefinitionEnumerationDefaultValue#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionEnumerationDefaultValue#getGroup()
	 * @see #getAttributeDefinitionEnumerationDefaultValue()
	 * @generated
	 */
	EAttribute getAttributeDefinitionEnumerationDefaultValue_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.AttributeDefinitionEnumerationDefaultValue#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEENUMERATION</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionEnumerationDefaultValue#getATTRIBUTEVALUEENUMERATION()
	 * @see #getAttributeDefinitionEnumerationDefaultValue()
	 * @generated
	 */
	EReference getAttributeDefinitionEnumerationDefaultValue_ATTRIBUTEVALUEENUMERATION();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeDefinitionComplexDefaultValue <em>Attribute Definition Complex Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition Complex Default Value</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionComplexDefaultValue
	 * @generated
	 */
	EClass getAttributeDefinitionComplexDefaultValue();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AttributeDefinitionComplexDefaultValue#getATTRIBUTEVALUEXMLDATA <em>ATTRIBUTEVALUEXMLDATA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUEXMLDATA</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionComplexDefaultValue#getATTRIBUTEVALUEXMLDATA()
	 * @see #getAttributeDefinitionComplexDefaultValue()
	 * @generated
	 */
	EReference getAttributeDefinitionComplexDefaultValue_ATTRIBUTEVALUEXMLDATA();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeValueEmbeddedDocumentDefinition <em>Attribute Value Embedded Document Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Embedded Document Definition</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEmbeddedDocumentDefinition
	 * @generated
	 */
	EClass getAttributeValueEmbeddedDocumentDefinition();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueEmbeddedDocumentDefinition#getATTRIBUTEDEFINITIONCOMPLEXREF <em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEmbeddedDocumentDefinition#getATTRIBUTEDEFINITIONCOMPLEXREF()
	 * @see #getAttributeValueEmbeddedDocumentDefinition()
	 * @generated
	 */
	EAttribute getAttributeValueEmbeddedDocumentDefinition_ATTRIBUTEDEFINITIONCOMPLEXREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeValueFileReferenceDefinition <em>Attribute Value File Reference Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value File Reference Definition</em>'.
	 * @see era.foss.model.core.rif.AttributeValueFileReferenceDefinition
	 * @generated
	 */
	EClass getAttributeValueFileReferenceDefinition();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueFileReferenceDefinition#getATTRIBUTEDEFINITIONCOMPLEXREF <em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>'.
	 * @see era.foss.model.core.rif.AttributeValueFileReferenceDefinition#getATTRIBUTEDEFINITIONCOMPLEXREF()
	 * @see #getAttributeValueFileReferenceDefinition()
	 * @generated
	 */
	EAttribute getAttributeValueFileReferenceDefinition_ATTRIBUTEDEFINITIONCOMPLEXREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeValueEmbeddedFileDefinition <em>Attribute Value Embedded File Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Embedded File Definition</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEmbeddedFileDefinition
	 * @generated
	 */
	EClass getAttributeValueEmbeddedFileDefinition();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueEmbeddedFileDefinition#getATTRIBUTEDEFINITIONCOMPLEXREF <em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEmbeddedFileDefinition#getATTRIBUTEDEFINITIONCOMPLEXREF()
	 * @see #getAttributeValueEmbeddedFileDefinition()
	 * @generated
	 */
	EAttribute getAttributeValueEmbeddedFileDefinition_ATTRIBUTEDEFINITIONCOMPLEXREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeValueSimpleDefinition <em>Attribute Value Simple Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Simple Definition</em>'.
	 * @see era.foss.model.core.rif.AttributeValueSimpleDefinition
	 * @generated
	 */
	EClass getAttributeValueSimpleDefinition();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueSimpleDefinition#getATTRIBUTEDEFINITIONSIMPLEREF <em>ATTRIBUTEDEFINITIONSIMPLEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ATTRIBUTEDEFINITIONSIMPLEREF</em>'.
	 * @see era.foss.model.core.rif.AttributeValueSimpleDefinition#getATTRIBUTEDEFINITIONSIMPLEREF()
	 * @see #getAttributeValueSimpleDefinition()
	 * @generated
	 */
	EAttribute getAttributeValueSimpleDefinition_ATTRIBUTEDEFINITIONSIMPLEREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeValueEnumerationDefinition <em>Attribute Value Enumeration Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Enumeration Definition</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEnumerationDefinition
	 * @generated
	 */
	EClass getAttributeValueEnumerationDefinition();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueEnumerationDefinition#getATTRIBUTEDEFINITIONENUMERATIONREF <em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEnumerationDefinition#getATTRIBUTEDEFINITIONENUMERATIONREF()
	 * @see #getAttributeValueEnumerationDefinition()
	 * @generated
	 */
	EAttribute getAttributeValueEnumerationDefinition_ATTRIBUTEDEFINITIONENUMERATIONREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeValueXmlDataDefinition <em>Attribute Value Xml Data Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Xml Data Definition</em>'.
	 * @see era.foss.model.core.rif.AttributeValueXmlDataDefinition
	 * @generated
	 */
	EClass getAttributeValueXmlDataDefinition();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeValueXmlDataDefinition#getATTRIBUTEDEFINITIONCOMPLEXREF <em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>'.
	 * @see era.foss.model.core.rif.AttributeValueXmlDataDefinition#getATTRIBUTEDEFINITIONCOMPLEXREF()
	 * @see #getAttributeValueXmlDataDefinition()
	 * @generated
	 */
	EAttribute getAttributeValueXmlDataDefinition_ATTRIBUTEDEFINITIONCOMPLEXREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link era.foss.model.core.rif.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link era.foss.model.core.rif.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getACCESSPOLICY <em>ACCESSPOLICY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ACCESSPOLICY</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getACCESSPOLICY()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ACCESSPOLICY();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getATTRIBUTEDEFINITIONCOMPLEX <em>ATTRIBUTEDEFINITIONCOMPLEX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEDEFINITIONCOMPLEX</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getATTRIBUTEDEFINITIONCOMPLEX()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ATTRIBUTEDEFINITIONCOMPLEX();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getATTRIBUTEDEFINITIONENUMERATION <em>ATTRIBUTEDEFINITIONENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEDEFINITIONENUMERATION</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getATTRIBUTEDEFINITIONENUMERATION()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ATTRIBUTEDEFINITIONENUMERATION();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getATTRIBUTEDEFINITIONSIMPLE <em>ATTRIBUTEDEFINITIONSIMPLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEDEFINITIONSIMPLE</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getATTRIBUTEDEFINITIONSIMPLE()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ATTRIBUTEDEFINITIONSIMPLE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getATTRIBUTEVALUEEMBEDDEDDOCUMENT <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getATTRIBUTEVALUEEMBEDDEDDOCUMENT()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ATTRIBUTEVALUEEMBEDDEDDOCUMENT();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getATTRIBUTEVALUEEMBEDDEDFILE <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUEEMBEDDEDFILE</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getATTRIBUTEVALUEEMBEDDEDFILE()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ATTRIBUTEVALUEEMBEDDEDFILE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUEENUMERATION</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getATTRIBUTEVALUEENUMERATION()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ATTRIBUTEVALUEENUMERATION();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getATTRIBUTEVALUEFILEREFERENCE <em>ATTRIBUTEVALUEFILEREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUEFILEREFERENCE</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getATTRIBUTEVALUEFILEREFERENCE()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ATTRIBUTEVALUEFILEREFERENCE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getATTRIBUTEVALUESIMPLE <em>ATTRIBUTEVALUESIMPLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUESIMPLE</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getATTRIBUTEVALUESIMPLE()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ATTRIBUTEVALUESIMPLE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getATTRIBUTEVALUEXMLDATA <em>ATTRIBUTEVALUEXMLDATA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUEXMLDATA</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getATTRIBUTEVALUEXMLDATA()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ATTRIBUTEVALUEXMLDATA();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getBINARYCONTENT <em>BINARYCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BINARYCONTENT</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getBINARYCONTENT()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BINARYCONTENT();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getDATATYPEDEFINITIONBINARYFILE <em>DATATYPEDEFINITIONBINARYFILE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DATATYPEDEFINITIONBINARYFILE</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getDATATYPEDEFINITIONBINARYFILE()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DATATYPEDEFINITIONBINARYFILE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getDATATYPEDEFINITIONBOOLEAN <em>DATATYPEDEFINITIONBOOLEAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DATATYPEDEFINITIONBOOLEAN</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getDATATYPEDEFINITIONBOOLEAN()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DATATYPEDEFINITIONBOOLEAN();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getDATATYPEDEFINITIONDOCUMENT <em>DATATYPEDEFINITIONDOCUMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DATATYPEDEFINITIONDOCUMENT</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getDATATYPEDEFINITIONDOCUMENT()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DATATYPEDEFINITIONDOCUMENT();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getDATATYPEDEFINITIONENUMERATION <em>DATATYPEDEFINITIONENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DATATYPEDEFINITIONENUMERATION</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getDATATYPEDEFINITIONENUMERATION()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DATATYPEDEFINITIONENUMERATION();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getDATATYPEDEFINITIONINTEGER <em>DATATYPEDEFINITIONINTEGER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DATATYPEDEFINITIONINTEGER</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getDATATYPEDEFINITIONINTEGER()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DATATYPEDEFINITIONINTEGER();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getDATATYPEDEFINITIONREAL <em>DATATYPEDEFINITIONREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DATATYPEDEFINITIONREAL</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getDATATYPEDEFINITIONREAL()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DATATYPEDEFINITIONREAL();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getDATATYPEDEFINITIONSTRING <em>DATATYPEDEFINITIONSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DATATYPEDEFINITIONSTRING</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getDATATYPEDEFINITIONSTRING()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DATATYPEDEFINITIONSTRING();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getDATATYPEDEFINITIONXMLDATA <em>DATATYPEDEFINITIONXMLDATA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DATATYPEDEFINITIONXMLDATA</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getDATATYPEDEFINITIONXMLDATA()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DATATYPEDEFINITIONXMLDATA();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getEMBEDDEDVALUE <em>EMBEDDEDVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EMBEDDEDVALUE</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getEMBEDDEDVALUE()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EMBEDDEDVALUE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getENUMVALUE <em>ENUMVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ENUMVALUE</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getENUMVALUE()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ENUMVALUE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getRELATIONGROUP <em>RELATIONGROUP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RELATIONGROUP</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getRELATIONGROUP()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RELATIONGROUP();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getRIF <em>RIF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RIF</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getRIF()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RIF();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getSPECGROUP <em>SPECGROUP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECGROUP</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getSPECGROUP()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SPECGROUP();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getSPECHIERARCHY <em>SPECHIERARCHY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECHIERARCHY</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getSPECHIERARCHY()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SPECHIERARCHY();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getSPECHIERARCHYROOT <em>SPECHIERARCHYROOT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECHIERARCHYROOT</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getSPECHIERARCHYROOT()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SPECHIERARCHYROOT();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getSPECOBJECT <em>SPECOBJECT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECOBJECT</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getSPECOBJECT()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SPECOBJECT();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getSPECRELATION <em>SPECRELATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECRELATION</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getSPECRELATION()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SPECRELATION();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getSPECTYPE <em>SPECTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECTYPE</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getSPECTYPE()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SPECTYPE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getXHTMLCONTENT <em>XHTMLCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XHTMLCONTENT</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getXHTMLCONTENT()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XHTMLCONTENT();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.DocumentRoot#getXMLCONTENT <em>XMLCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XMLCONTENT</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getXMLCONTENT()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLCONTENT();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.DocumentRoot#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see era.foss.model.core.rif.DocumentRoot#getID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ID();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.EmbeddedValue <em>Embedded Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embedded Value</em>'.
	 * @see era.foss.model.core.rif.EmbeddedValue
	 * @generated
	 */
	EClass getEmbeddedValue();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.EmbeddedValue#getKEY <em>KEY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>KEY</em>'.
	 * @see era.foss.model.core.rif.EmbeddedValue#getKEY()
	 * @see #getEmbeddedValue()
	 * @generated
	 */
	EAttribute getEmbeddedValue_KEY();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.EmbeddedValue#getOTHERCONTENT <em>OTHERCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OTHERCONTENT</em>'.
	 * @see era.foss.model.core.rif.EmbeddedValue#getOTHERCONTENT()
	 * @see #getEmbeddedValue()
	 * @generated
	 */
	EAttribute getEmbeddedValue_OTHERCONTENT();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Value</em>'.
	 * @see era.foss.model.core.rif.EnumValue
	 * @generated
	 */
	EClass getEnumValue();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.EnumValue#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.EnumValue#getLONGNAME()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.EnumValue#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.EnumValue#getDESC()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_DESC();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.EnumValue#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.EnumValue#getIDENTIFIER()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.EnumValue#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.EnumValue#getLASTCHANGE()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_LASTCHANGE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.EnumValue#getPROPERTIES <em>PROPERTIES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>PROPERTIES</em>'.
	 * @see era.foss.model.core.rif.EnumValue#getPROPERTIES()
	 * @see #getEnumValue()
	 * @generated
	 */
	EReference getEnumValue_PROPERTIES();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see era.foss.model.core.rif.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.Object#getSPECOBJECTREF <em>SPECOBJECTREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SPECOBJECTREF</em>'.
	 * @see era.foss.model.core.rif.Object#getSPECOBJECTREF()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_SPECOBJECTREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see era.foss.model.core.rif.Properties
	 * @generated
	 */
	EClass getProperties();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.Properties#getEMBEDDEDVALUE <em>EMBEDDEDVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EMBEDDEDVALUE</em>'.
	 * @see era.foss.model.core.rif.Properties#getEMBEDDEDVALUE()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_EMBEDDEDVALUE();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.SpecGroupRelationGroups <em>Spec Group Relation Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Group Relation Groups</em>'.
	 * @see era.foss.model.core.rif.SpecGroupRelationGroups
	 * @generated
	 */
	EClass getSpecGroupRelationGroups();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.SpecGroupRelationGroups#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.SpecGroupRelationGroups#getGroup()
	 * @see #getSpecGroupRelationGroups()
	 * @generated
	 */
	EAttribute getSpecGroupRelationGroups_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecGroupRelationGroups#getRELATIONGROUP <em>RELATIONGROUP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RELATIONGROUP</em>'.
	 * @see era.foss.model.core.rif.SpecGroupRelationGroups#getRELATIONGROUP()
	 * @see #getSpecGroupRelationGroups()
	 * @generated
	 */
	EReference getSpecGroupRelationGroups_RELATIONGROUP();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AccessPolicyRelationGroups <em>Access Policy Relation Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Policy Relation Groups</em>'.
	 * @see era.foss.model.core.rif.AccessPolicyRelationGroups
	 * @generated
	 */
	EClass getAccessPolicyRelationGroups();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AccessPolicyRelationGroups#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.AccessPolicyRelationGroups#getGroup()
	 * @see #getAccessPolicyRelationGroups()
	 * @generated
	 */
	EAttribute getAccessPolicyRelationGroups_Group();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AccessPolicyRelationGroups#getRELATIONGROUPREF <em>RELATIONGROUPREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>RELATIONGROUPREF</em>'.
	 * @see era.foss.model.core.rif.AccessPolicyRelationGroups#getRELATIONGROUPREF()
	 * @see #getAccessPolicyRelationGroups()
	 * @generated
	 */
	EAttribute getAccessPolicyRelationGroups_RELATIONGROUPREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.RelationGroup <em>Relation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Group</em>'.
	 * @see era.foss.model.core.rif.RelationGroup
	 * @generated
	 */
	EClass getRelationGroup();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.RelationGroup#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.RelationGroup#getLONGNAME()
	 * @see #getRelationGroup()
	 * @generated
	 */
	EAttribute getRelationGroup_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.RelationGroup#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.RelationGroup#getDESC()
	 * @see #getRelationGroup()
	 * @generated
	 */
	EAttribute getRelationGroup_DESC();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.RelationGroup#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.RelationGroup#getIDENTIFIER()
	 * @see #getRelationGroup()
	 * @generated
	 */
	EAttribute getRelationGroup_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.RelationGroup#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.RelationGroup#getLASTCHANGE()
	 * @see #getRelationGroup()
	 * @generated
	 */
	EAttribute getRelationGroup_LASTCHANGE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.RelationGroup#getRELATIONTYPE <em>RELATIONTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RELATIONTYPE</em>'.
	 * @see era.foss.model.core.rif.RelationGroup#getRELATIONTYPE()
	 * @see #getRelationGroup()
	 * @generated
	 */
	EReference getRelationGroup_RELATIONTYPE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.RelationGroup#getSPECRELATIONS <em>SPECRELATIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECRELATIONS</em>'.
	 * @see era.foss.model.core.rif.RelationGroup#getSPECRELATIONS()
	 * @see #getRelationGroup()
	 * @generated
	 */
	EReference getRelationGroup_SPECRELATIONS();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.RelationGroup#getTARGETGROUP <em>TARGETGROUP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TARGETGROUP</em>'.
	 * @see era.foss.model.core.rif.RelationGroup#getTARGETGROUP()
	 * @see #getRelationGroup()
	 * @generated
	 */
	EReference getRelationGroup_TARGETGROUP();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.RelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Type</em>'.
	 * @see era.foss.model.core.rif.RelationType
	 * @generated
	 */
	EClass getRelationType();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.RelationType#getSPECTYPEREF <em>SPECTYPEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SPECTYPEREF</em>'.
	 * @see era.foss.model.core.rif.RelationType#getSPECTYPEREF()
	 * @see #getRelationType()
	 * @generated
	 */
	EAttribute getRelationType_SPECTYPEREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.Rif <em>Rif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rif</em>'.
	 * @see era.foss.model.core.rif.Rif
	 * @generated
	 */
	EClass getRif();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.Rif#getSPECHIERARCHYROOTS <em>SPECHIERARCHYROOTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECHIERARCHYROOTS</em>'.
	 * @see era.foss.model.core.rif.Rif#getSPECHIERARCHYROOTS()
	 * @see #getRif()
	 * @generated
	 */
	EReference getRif_SPECHIERARCHYROOTS();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.Rif#getACCESSPOLICIES <em>ACCESSPOLICIES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ACCESSPOLICIES</em>'.
	 * @see era.foss.model.core.rif.Rif#getACCESSPOLICIES()
	 * @see #getRif()
	 * @generated
	 */
	EReference getRif_ACCESSPOLICIES();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.Rif#getAUTHOR <em>AUTHOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AUTHOR</em>'.
	 * @see era.foss.model.core.rif.Rif#getAUTHOR()
	 * @see #getRif()
	 * @generated
	 */
	EAttribute getRif_AUTHOR();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.Rif#getCOMMENT <em>COMMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>COMMENT</em>'.
	 * @see era.foss.model.core.rif.Rif#getCOMMENT()
	 * @see #getRif()
	 * @generated
	 */
	EAttribute getRif_COMMENT();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.Rif#getCOUNTRYCODE <em>COUNTRYCODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>COUNTRYCODE</em>'.
	 * @see era.foss.model.core.rif.Rif#getCOUNTRYCODE()
	 * @see #getRif()
	 * @generated
	 */
	EAttribute getRif_COUNTRYCODE();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.Rif#getCREATIONTIME <em>CREATIONTIME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CREATIONTIME</em>'.
	 * @see era.foss.model.core.rif.Rif#getCREATIONTIME()
	 * @see #getRif()
	 * @generated
	 */
	EAttribute getRif_CREATIONTIME();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.Rif#getDATATYPES <em>DATATYPES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DATATYPES</em>'.
	 * @see era.foss.model.core.rif.Rif#getDATATYPES()
	 * @see #getRif()
	 * @generated
	 */
	EReference getRif_DATATYPES();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.Rif#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.Rif#getIDENTIFIER()
	 * @see #getRif()
	 * @generated
	 */
	EAttribute getRif_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.Rif#getSOURCETOOLID <em>SOURCETOOLID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SOURCETOOLID</em>'.
	 * @see era.foss.model.core.rif.Rif#getSOURCETOOLID()
	 * @see #getRif()
	 * @generated
	 */
	EAttribute getRif_SOURCETOOLID();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.Rif#getSPECGROUPS <em>SPECGROUPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECGROUPS</em>'.
	 * @see era.foss.model.core.rif.Rif#getSPECGROUPS()
	 * @see #getRif()
	 * @generated
	 */
	EReference getRif_SPECGROUPS();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.Rif#getSPECOBJECTS <em>SPECOBJECTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECOBJECTS</em>'.
	 * @see era.foss.model.core.rif.Rif#getSPECOBJECTS()
	 * @see #getRif()
	 * @generated
	 */
	EReference getRif_SPECOBJECTS();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.Rif#getSPECRELATIONS <em>SPECRELATIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECRELATIONS</em>'.
	 * @see era.foss.model.core.rif.Rif#getSPECRELATIONS()
	 * @see #getRif()
	 * @generated
	 */
	EReference getRif_SPECRELATIONS();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.Rif#getSPECTYPES <em>SPECTYPES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECTYPES</em>'.
	 * @see era.foss.model.core.rif.Rif#getSPECTYPES()
	 * @see #getRif()
	 * @generated
	 */
	EReference getRif_SPECTYPES();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.Rif#getTITLE <em>TITLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TITLE</em>'.
	 * @see era.foss.model.core.rif.Rif#getTITLE()
	 * @see #getRif()
	 * @generated
	 */
	EAttribute getRif_TITLE();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.Rif#getVERSION <em>VERSION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VERSION</em>'.
	 * @see era.foss.model.core.rif.Rif#getVERSION()
	 * @see #getRif()
	 * @generated
	 */
	EAttribute getRif_VERSION();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see era.foss.model.core.rif.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.Source#getSPECOBJECTREF <em>SPECOBJECTREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SPECOBJECTREF</em>'.
	 * @see era.foss.model.core.rif.Source#getSPECOBJECTREF()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_SPECOBJECTREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.SpecAttributes <em>Spec Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Attributes</em>'.
	 * @see era.foss.model.core.rif.SpecAttributes
	 * @generated
	 */
	EClass getSpecAttributes();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.SpecAttributes#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.SpecAttributes#getGroup()
	 * @see #getSpecAttributes()
	 * @generated
	 */
	EAttribute getSpecAttributes_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecAttributes#getATTRIBUTEDEFINITIONCOMPLEX <em>ATTRIBUTEDEFINITIONCOMPLEX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONCOMPLEX</em>'.
	 * @see era.foss.model.core.rif.SpecAttributes#getATTRIBUTEDEFINITIONCOMPLEX()
	 * @see #getSpecAttributes()
	 * @generated
	 */
	EReference getSpecAttributes_ATTRIBUTEDEFINITIONCOMPLEX();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecAttributes#getATTRIBUTEDEFINITIONENUMERATION <em>ATTRIBUTEDEFINITIONENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONENUMERATION</em>'.
	 * @see era.foss.model.core.rif.SpecAttributes#getATTRIBUTEDEFINITIONENUMERATION()
	 * @see #getSpecAttributes()
	 * @generated
	 */
	EReference getSpecAttributes_ATTRIBUTEDEFINITIONENUMERATION();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecAttributes#getATTRIBUTEDEFINITIONSIMPLE <em>ATTRIBUTEDEFINITIONSIMPLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONSIMPLE</em>'.
	 * @see era.foss.model.core.rif.SpecAttributes#getATTRIBUTEDEFINITIONSIMPLE()
	 * @see #getSpecAttributes()
	 * @generated
	 */
	EReference getSpecAttributes_ATTRIBUTEDEFINITIONSIMPLE();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.RifSpecGroups <em>Spec Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Groups</em>'.
	 * @see era.foss.model.core.rif.RifSpecGroups
	 * @generated
	 */
	EClass getRifSpecGroups();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.RifSpecGroups#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.RifSpecGroups#getGroup()
	 * @see #getRifSpecGroups()
	 * @generated
	 */
	EAttribute getRifSpecGroups_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.RifSpecGroups#getSPECGROUP <em>SPECGROUP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPECGROUP</em>'.
	 * @see era.foss.model.core.rif.RifSpecGroups#getSPECGROUP()
	 * @see #getRifSpecGroups()
	 * @generated
	 */
	EReference getRifSpecGroups_SPECGROUP();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AccessPolicySpecGroups <em>Access Policy Spec Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Policy Spec Groups</em>'.
	 * @see era.foss.model.core.rif.AccessPolicySpecGroups
	 * @generated
	 */
	EClass getAccessPolicySpecGroups();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AccessPolicySpecGroups#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.AccessPolicySpecGroups#getGroup()
	 * @see #getAccessPolicySpecGroups()
	 * @generated
	 */
	EAttribute getAccessPolicySpecGroups_Group();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AccessPolicySpecGroups#getSPECGROUPREF <em>SPECGROUPREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>SPECGROUPREF</em>'.
	 * @see era.foss.model.core.rif.AccessPolicySpecGroups#getSPECGROUPREF()
	 * @see #getAccessPolicySpecGroups()
	 * @generated
	 */
	EAttribute getAccessPolicySpecGroups_SPECGROUPREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.SpecGroup <em>Spec Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Group</em>'.
	 * @see era.foss.model.core.rif.SpecGroup
	 * @generated
	 */
	EClass getSpecGroup();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecGroup#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.SpecGroup#getLONGNAME()
	 * @see #getSpecGroup()
	 * @generated
	 */
	EAttribute getSpecGroup_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecGroup#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.SpecGroup#getDESC()
	 * @see #getSpecGroup()
	 * @generated
	 */
	EAttribute getSpecGroup_DESC();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecGroup#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.SpecGroup#getIDENTIFIER()
	 * @see #getSpecGroup()
	 * @generated
	 */
	EAttribute getSpecGroup_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecGroup#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.SpecGroup#getLASTCHANGE()
	 * @see #getSpecGroup()
	 * @generated
	 */
	EAttribute getSpecGroup_LASTCHANGE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.SpecGroup#getRELATIONGROUPS <em>RELATIONGROUPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RELATIONGROUPS</em>'.
	 * @see era.foss.model.core.rif.SpecGroup#getRELATIONGROUPS()
	 * @see #getSpecGroup()
	 * @generated
	 */
	EReference getSpecGroup_RELATIONGROUPS();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.SpecGroup#getSPECOBJECTS <em>SPECOBJECTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECOBJECTS</em>'.
	 * @see era.foss.model.core.rif.SpecGroup#getSPECOBJECTS()
	 * @see #getSpecGroup()
	 * @generated
	 */
	EReference getSpecGroup_SPECOBJECTS();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.SpecGroup#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TYPE</em>'.
	 * @see era.foss.model.core.rif.SpecGroup#getTYPE()
	 * @see #getSpecGroup()
	 * @generated
	 */
	EReference getSpecGroup_TYPE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.SpecGroup#getVALUES <em>VALUES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VALUES</em>'.
	 * @see era.foss.model.core.rif.SpecGroup#getVALUES()
	 * @see #getSpecGroup()
	 * @generated
	 */
	EReference getSpecGroup_VALUES();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.SpecHierarchies <em>Spec Hierarchies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Hierarchies</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchies
	 * @generated
	 */
	EClass getSpecHierarchies();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.SpecHierarchies#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchies#getGroup()
	 * @see #getSpecHierarchies()
	 * @generated
	 */
	EAttribute getSpecHierarchies_Group();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.SpecHierarchies#getSPECHIERARCHYREF <em>SPECHIERARCHYREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>SPECHIERARCHYREF</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchies#getSPECHIERARCHYREF()
	 * @see #getSpecHierarchies()
	 * @generated
	 */
	EAttribute getSpecHierarchies_SPECHIERARCHYREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.RifSpecHierarchyRoots <em>Spec Hierarchy Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Hierarchy Roots</em>'.
	 * @see era.foss.model.core.rif.RifSpecHierarchyRoots
	 * @generated
	 */
	EClass getRifSpecHierarchyRoots();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.RifSpecHierarchyRoots#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.RifSpecHierarchyRoots#getGroup()
	 * @see #getRifSpecHierarchyRoots()
	 * @generated
	 */
	EAttribute getRifSpecHierarchyRoots_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.RifSpecHierarchyRoots#getSPECHIERARCHYROOT <em>SPECHIERARCHYROOT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPECHIERARCHYROOT</em>'.
	 * @see era.foss.model.core.rif.RifSpecHierarchyRoots#getSPECHIERARCHYROOT()
	 * @see #getRifSpecHierarchyRoots()
	 * @generated
	 */
	EReference getRifSpecHierarchyRoots_SPECHIERARCHYROOT();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AccessPolicySpecHierarchyRoots <em>Access Policy Spec Hierarchy Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Policy Spec Hierarchy Roots</em>'.
	 * @see era.foss.model.core.rif.AccessPolicySpecHierarchyRoots
	 * @generated
	 */
	EClass getAccessPolicySpecHierarchyRoots();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AccessPolicySpecHierarchyRoots#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.AccessPolicySpecHierarchyRoots#getGroup()
	 * @see #getAccessPolicySpecHierarchyRoots()
	 * @generated
	 */
	EAttribute getAccessPolicySpecHierarchyRoots_Group();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AccessPolicySpecHierarchyRoots#getSPECHIERARCHYROOTREF <em>SPECHIERARCHYROOTREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>SPECHIERARCHYROOTREF</em>'.
	 * @see era.foss.model.core.rif.AccessPolicySpecHierarchyRoots#getSPECHIERARCHYROOTREF()
	 * @see #getAccessPolicySpecHierarchyRoots()
	 * @generated
	 */
	EAttribute getAccessPolicySpecHierarchyRoots_SPECHIERARCHYROOTREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.SpecHierarchyRoot <em>Spec Hierarchy Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Hierarchy Root</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchyRoot
	 * @generated
	 */
	EClass getSpecHierarchyRoot();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecHierarchyRoot#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchyRoot#getLONGNAME()
	 * @see #getSpecHierarchyRoot()
	 * @generated
	 */
	EAttribute getSpecHierarchyRoot_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecHierarchyRoot#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchyRoot#getDESC()
	 * @see #getSpecHierarchyRoot()
	 * @generated
	 */
	EAttribute getSpecHierarchyRoot_DESC();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.SpecHierarchyRoot#getCHILDREN <em>CHILDREN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CHILDREN</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchyRoot#getCHILDREN()
	 * @see #getSpecHierarchyRoot()
	 * @generated
	 */
	EReference getSpecHierarchyRoot_CHILDREN();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecHierarchyRoot#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchyRoot#getIDENTIFIER()
	 * @see #getSpecHierarchyRoot()
	 * @generated
	 */
	EAttribute getSpecHierarchyRoot_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecHierarchyRoot#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchyRoot#getLASTCHANGE()
	 * @see #getSpecHierarchyRoot()
	 * @generated
	 */
	EAttribute getSpecHierarchyRoot_LASTCHANGE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.SpecHierarchyRoot#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TYPE</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchyRoot#getTYPE()
	 * @see #getSpecHierarchyRoot()
	 * @generated
	 */
	EReference getSpecHierarchyRoot_TYPE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.SpecHierarchyRoot#getVALUES <em>VALUES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VALUES</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchyRoot#getVALUES()
	 * @see #getSpecHierarchyRoot()
	 * @generated
	 */
	EReference getSpecHierarchyRoot_VALUES();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.SpecHierarchy <em>Spec Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Hierarchy</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchy
	 * @generated
	 */
	EClass getSpecHierarchy();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecHierarchy#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchy#getLONGNAME()
	 * @see #getSpecHierarchy()
	 * @generated
	 */
	EAttribute getSpecHierarchy_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecHierarchy#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchy#getDESC()
	 * @see #getSpecHierarchy()
	 * @generated
	 */
	EAttribute getSpecHierarchy_DESC();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.SpecHierarchy#getCHILDREN <em>CHILDREN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CHILDREN</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchy#getCHILDREN()
	 * @see #getSpecHierarchy()
	 * @generated
	 */
	EReference getSpecHierarchy_CHILDREN();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecHierarchy#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchy#getIDENTIFIER()
	 * @see #getSpecHierarchy()
	 * @generated
	 */
	EAttribute getSpecHierarchy_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecHierarchy#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchy#getLASTCHANGE()
	 * @see #getSpecHierarchy()
	 * @generated
	 */
	EAttribute getSpecHierarchy_LASTCHANGE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.SpecHierarchy#getOBJECT <em>OBJECT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>OBJECT</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchy#getOBJECT()
	 * @see #getSpecHierarchy()
	 * @generated
	 */
	EReference getSpecHierarchy_OBJECT();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.SpecifiedValues <em>Specified Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specified Values</em>'.
	 * @see era.foss.model.core.rif.SpecifiedValues
	 * @generated
	 */
	EClass getSpecifiedValues();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.SpecifiedValues#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.SpecifiedValues#getGroup()
	 * @see #getSpecifiedValues()
	 * @generated
	 */
	EAttribute getSpecifiedValues_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecifiedValues#getENUMVALUE <em>ENUMVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ENUMVALUE</em>'.
	 * @see era.foss.model.core.rif.SpecifiedValues#getENUMVALUE()
	 * @see #getSpecifiedValues()
	 * @generated
	 */
	EReference getSpecifiedValues_ENUMVALUE();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.SpecGroupSpecObjects <em>Spec Group Spec Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Group Spec Objects</em>'.
	 * @see era.foss.model.core.rif.SpecGroupSpecObjects
	 * @generated
	 */
	EClass getSpecGroupSpecObjects();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.SpecGroupSpecObjects#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.SpecGroupSpecObjects#getGroup()
	 * @see #getSpecGroupSpecObjects()
	 * @generated
	 */
	EAttribute getSpecGroupSpecObjects_Group();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.SpecGroupSpecObjects#getSPECOBJECTREF <em>SPECOBJECTREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>SPECOBJECTREF</em>'.
	 * @see era.foss.model.core.rif.SpecGroupSpecObjects#getSPECOBJECTREF()
	 * @see #getSpecGroupSpecObjects()
	 * @generated
	 */
	EAttribute getSpecGroupSpecObjects_SPECOBJECTREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.RifSpecObjects <em>Spec Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Objects</em>'.
	 * @see era.foss.model.core.rif.RifSpecObjects
	 * @generated
	 */
	EClass getRifSpecObjects();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.RifSpecObjects#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.RifSpecObjects#getGroup()
	 * @see #getRifSpecObjects()
	 * @generated
	 */
	EAttribute getRifSpecObjects_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.RifSpecObjects#getSPECOBJECT <em>SPECOBJECT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPECOBJECT</em>'.
	 * @see era.foss.model.core.rif.RifSpecObjects#getSPECOBJECT()
	 * @see #getRifSpecObjects()
	 * @generated
	 */
	EReference getRifSpecObjects_SPECOBJECT();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AccessPolicySpecObjects <em>Access Policy Spec Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Policy Spec Objects</em>'.
	 * @see era.foss.model.core.rif.AccessPolicySpecObjects
	 * @generated
	 */
	EClass getAccessPolicySpecObjects();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AccessPolicySpecObjects#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.AccessPolicySpecObjects#getGroup()
	 * @see #getAccessPolicySpecObjects()
	 * @generated
	 */
	EAttribute getAccessPolicySpecObjects_Group();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AccessPolicySpecObjects#getSPECOBJECTREF <em>SPECOBJECTREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>SPECOBJECTREF</em>'.
	 * @see era.foss.model.core.rif.AccessPolicySpecObjects#getSPECOBJECTREF()
	 * @see #getAccessPolicySpecObjects()
	 * @generated
	 */
	EAttribute getAccessPolicySpecObjects_SPECOBJECTREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.SpecObject <em>Spec Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Object</em>'.
	 * @see era.foss.model.core.rif.SpecObject
	 * @generated
	 */
	EClass getSpecObject();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecObject#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.SpecObject#getLONGNAME()
	 * @see #getSpecObject()
	 * @generated
	 */
	EAttribute getSpecObject_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecObject#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.SpecObject#getDESC()
	 * @see #getSpecObject()
	 * @generated
	 */
	EAttribute getSpecObject_DESC();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecObject#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.SpecObject#getIDENTIFIER()
	 * @see #getSpecObject()
	 * @generated
	 */
	EAttribute getSpecObject_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecObject#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.SpecObject#getLASTCHANGE()
	 * @see #getSpecObject()
	 * @generated
	 */
	EAttribute getSpecObject_LASTCHANGE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.SpecObject#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TYPE</em>'.
	 * @see era.foss.model.core.rif.SpecObject#getTYPE()
	 * @see #getSpecObject()
	 * @generated
	 */
	EReference getSpecObject_TYPE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.SpecObject#getVALUES <em>VALUES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VALUES</em>'.
	 * @see era.foss.model.core.rif.SpecObject#getVALUES()
	 * @see #getSpecObject()
	 * @generated
	 */
	EReference getSpecObject_VALUES();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.RifSpecRelations <em>Spec Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Relations</em>'.
	 * @see era.foss.model.core.rif.RifSpecRelations
	 * @generated
	 */
	EClass getRifSpecRelations();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.RifSpecRelations#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.RifSpecRelations#getGroup()
	 * @see #getRifSpecRelations()
	 * @generated
	 */
	EAttribute getRifSpecRelations_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.RifSpecRelations#getSPECRELATION <em>SPECRELATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPECRELATION</em>'.
	 * @see era.foss.model.core.rif.RifSpecRelations#getSPECRELATION()
	 * @see #getRifSpecRelations()
	 * @generated
	 */
	EReference getRifSpecRelations_SPECRELATION();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.RelationGroupSpecRelations <em>Relation Group Spec Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Group Spec Relations</em>'.
	 * @see era.foss.model.core.rif.RelationGroupSpecRelations
	 * @generated
	 */
	EClass getRelationGroupSpecRelations();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.RelationGroupSpecRelations#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.RelationGroupSpecRelations#getGroup()
	 * @see #getRelationGroupSpecRelations()
	 * @generated
	 */
	EAttribute getRelationGroupSpecRelations_Group();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.RelationGroupSpecRelations#getSPECRELATIONREF <em>SPECRELATIONREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>SPECRELATIONREF</em>'.
	 * @see era.foss.model.core.rif.RelationGroupSpecRelations#getSPECRELATIONREF()
	 * @see #getRelationGroupSpecRelations()
	 * @generated
	 */
	EAttribute getRelationGroupSpecRelations_SPECRELATIONREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AccessPolicySpecRelations <em>Access Policy Spec Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Policy Spec Relations</em>'.
	 * @see era.foss.model.core.rif.AccessPolicySpecRelations
	 * @generated
	 */
	EClass getAccessPolicySpecRelations();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AccessPolicySpecRelations#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.AccessPolicySpecRelations#getGroup()
	 * @see #getAccessPolicySpecRelations()
	 * @generated
	 */
	EAttribute getAccessPolicySpecRelations_Group();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AccessPolicySpecRelations#getSPECRELATIONREF <em>SPECRELATIONREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>SPECRELATIONREF</em>'.
	 * @see era.foss.model.core.rif.AccessPolicySpecRelations#getSPECRELATIONREF()
	 * @see #getAccessPolicySpecRelations()
	 * @generated
	 */
	EAttribute getAccessPolicySpecRelations_SPECRELATIONREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.SpecRelation <em>Spec Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Relation</em>'.
	 * @see era.foss.model.core.rif.SpecRelation
	 * @generated
	 */
	EClass getSpecRelation();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecRelation#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.SpecRelation#getLONGNAME()
	 * @see #getSpecRelation()
	 * @generated
	 */
	EAttribute getSpecRelation_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecRelation#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.SpecRelation#getDESC()
	 * @see #getSpecRelation()
	 * @generated
	 */
	EAttribute getSpecRelation_DESC();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.SpecRelation#getSOURCE <em>SOURCE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SOURCE</em>'.
	 * @see era.foss.model.core.rif.SpecRelation#getSOURCE()
	 * @see #getSpecRelation()
	 * @generated
	 */
	EReference getSpecRelation_SOURCE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.SpecRelation#getTARGET <em>TARGET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TARGET</em>'.
	 * @see era.foss.model.core.rif.SpecRelation#getTARGET()
	 * @see #getSpecRelation()
	 * @generated
	 */
	EReference getSpecRelation_TARGET();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecRelation#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.SpecRelation#getIDENTIFIER()
	 * @see #getSpecRelation()
	 * @generated
	 */
	EAttribute getSpecRelation_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecRelation#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.SpecRelation#getLASTCHANGE()
	 * @see #getSpecRelation()
	 * @generated
	 */
	EAttribute getSpecRelation_LASTCHANGE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.SpecRelation#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TYPE</em>'.
	 * @see era.foss.model.core.rif.SpecRelation#getTYPE()
	 * @see #getSpecRelation()
	 * @generated
	 */
	EReference getSpecRelation_TYPE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.SpecRelation#getVALUES <em>VALUES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VALUES</em>'.
	 * @see era.foss.model.core.rif.SpecRelation#getVALUES()
	 * @see #getSpecRelation()
	 * @generated
	 */
	EReference getSpecRelation_VALUES();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.RifSpecTypes <em>Spec Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Types</em>'.
	 * @see era.foss.model.core.rif.RifSpecTypes
	 * @generated
	 */
	EClass getRifSpecTypes();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.RifSpecTypes#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.RifSpecTypes#getGroup()
	 * @see #getRifSpecTypes()
	 * @generated
	 */
	EAttribute getRifSpecTypes_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.RifSpecTypes#getSPECTYPE <em>SPECTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPECTYPE</em>'.
	 * @see era.foss.model.core.rif.RifSpecTypes#getSPECTYPE()
	 * @see #getRifSpecTypes()
	 * @generated
	 */
	EReference getRifSpecTypes_SPECTYPE();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AccessPolicySpecTypes <em>Access Policy Spec Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Policy Spec Types</em>'.
	 * @see era.foss.model.core.rif.AccessPolicySpecTypes
	 * @generated
	 */
	EClass getAccessPolicySpecTypes();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AccessPolicySpecTypes#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.AccessPolicySpecTypes#getGroup()
	 * @see #getAccessPolicySpecTypes()
	 * @generated
	 */
	EAttribute getAccessPolicySpecTypes_Group();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AccessPolicySpecTypes#getSPECTYPEREF <em>SPECTYPEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>SPECTYPEREF</em>'.
	 * @see era.foss.model.core.rif.AccessPolicySpecTypes#getSPECTYPEREF()
	 * @see #getAccessPolicySpecTypes()
	 * @generated
	 */
	EAttribute getAccessPolicySpecTypes_SPECTYPEREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.SpecType <em>Spec Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Type</em>'.
	 * @see era.foss.model.core.rif.SpecType
	 * @generated
	 */
	EClass getSpecType();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecType#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see era.foss.model.core.rif.SpecType#getLONGNAME()
	 * @see #getSpecType()
	 * @generated
	 */
	EAttribute getSpecType_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecType#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see era.foss.model.core.rif.SpecType#getDESC()
	 * @see #getSpecType()
	 * @generated
	 */
	EAttribute getSpecType_DESC();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecType#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see era.foss.model.core.rif.SpecType#getIDENTIFIER()
	 * @see #getSpecType()
	 * @generated
	 */
	EAttribute getSpecType_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecType#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see era.foss.model.core.rif.SpecType#getLASTCHANGE()
	 * @see #getSpecType()
	 * @generated
	 */
	EAttribute getSpecType_LASTCHANGE();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.SpecType#getSPECATTRIBUTES <em>SPECATTRIBUTES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECATTRIBUTES</em>'.
	 * @see era.foss.model.core.rif.SpecType#getSPECATTRIBUTES()
	 * @see #getSpecType()
	 * @generated
	 */
	EReference getSpecType_SPECATTRIBUTES();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see era.foss.model.core.rif.SpecType#getID()
	 * @see #getSpecType()
	 * @generated
	 */
	EAttribute getSpecType_ID();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.TargetGroup <em>Target Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Group</em>'.
	 * @see era.foss.model.core.rif.TargetGroup
	 * @generated
	 */
	EClass getTargetGroup();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.TargetGroup#getSPECGROUPREF <em>SPECGROUPREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SPECGROUPREF</em>'.
	 * @see era.foss.model.core.rif.TargetGroup#getSPECGROUPREF()
	 * @see #getTargetGroup()
	 * @generated
	 */
	EAttribute getTargetGroup_SPECGROUPREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target</em>'.
	 * @see era.foss.model.core.rif.Target
	 * @generated
	 */
	EClass getTarget();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.Target#getSPECOBJECTREF <em>SPECOBJECTREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SPECOBJECTREF</em>'.
	 * @see era.foss.model.core.rif.Target#getSPECOBJECTREF()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_SPECOBJECTREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeDefinitionSimpleType <em>Attribute Definition Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition Simple Type</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionSimpleType
	 * @generated
	 */
	EClass getAttributeDefinitionSimpleType();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeDefinitionSimpleType#getDATATYPEDEFINITIONBOOLEANREF <em>DATATYPEDEFINITIONBOOLEANREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATATYPEDEFINITIONBOOLEANREF</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionSimpleType#getDATATYPEDEFINITIONBOOLEANREF()
	 * @see #getAttributeDefinitionSimpleType()
	 * @generated
	 */
	EAttribute getAttributeDefinitionSimpleType_DATATYPEDEFINITIONBOOLEANREF();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeDefinitionSimpleType#getDATATYPEDEFINITIONINTEGERREF <em>DATATYPEDEFINITIONINTEGERREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATATYPEDEFINITIONINTEGERREF</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionSimpleType#getDATATYPEDEFINITIONINTEGERREF()
	 * @see #getAttributeDefinitionSimpleType()
	 * @generated
	 */
	EAttribute getAttributeDefinitionSimpleType_DATATYPEDEFINITIONINTEGERREF();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeDefinitionSimpleType#getDATATYPEDEFINITIONREALREF <em>DATATYPEDEFINITIONREALREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATATYPEDEFINITIONREALREF</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionSimpleType#getDATATYPEDEFINITIONREALREF()
	 * @see #getAttributeDefinitionSimpleType()
	 * @generated
	 */
	EAttribute getAttributeDefinitionSimpleType_DATATYPEDEFINITIONREALREF();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeDefinitionSimpleType#getDATATYPEDEFINITIONSTRINGREF <em>DATATYPEDEFINITIONSTRINGREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATATYPEDEFINITIONSTRINGREF</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionSimpleType#getDATATYPEDEFINITIONSTRINGREF()
	 * @see #getAttributeDefinitionSimpleType()
	 * @generated
	 */
	EAttribute getAttributeDefinitionSimpleType_DATATYPEDEFINITIONSTRINGREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.SpecRelationType <em>Spec Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Relation Type</em>'.
	 * @see era.foss.model.core.rif.SpecRelationType
	 * @generated
	 */
	EClass getSpecRelationType();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecRelationType#getSPECTYPEREF <em>SPECTYPEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SPECTYPEREF</em>'.
	 * @see era.foss.model.core.rif.SpecRelationType#getSPECTYPEREF()
	 * @see #getSpecRelationType()
	 * @generated
	 */
	EAttribute getSpecRelationType_SPECTYPEREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeDefinitionEnumerationType <em>Attribute Definition Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition Enumeration Type</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionEnumerationType
	 * @generated
	 */
	EClass getAttributeDefinitionEnumerationType();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeDefinitionEnumerationType#getDATATYPEDEFINITIONENUMERATIONREF <em>DATATYPEDEFINITIONENUMERATIONREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATATYPEDEFINITIONENUMERATIONREF</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionEnumerationType#getDATATYPEDEFINITIONENUMERATIONREF()
	 * @see #getAttributeDefinitionEnumerationType()
	 * @generated
	 */
	EAttribute getAttributeDefinitionEnumerationType_DATATYPEDEFINITIONENUMERATIONREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.SpecObjectType <em>Spec Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Object Type</em>'.
	 * @see era.foss.model.core.rif.SpecObjectType
	 * @generated
	 */
	EClass getSpecObjectType();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecObjectType#getSPECTYPEREF <em>SPECTYPEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SPECTYPEREF</em>'.
	 * @see era.foss.model.core.rif.SpecObjectType#getSPECTYPEREF()
	 * @see #getSpecObjectType()
	 * @generated
	 */
	EAttribute getSpecObjectType_SPECTYPEREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.SpecHierarchyRootType <em>Spec Hierarchy Root Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Hierarchy Root Type</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchyRootType
	 * @generated
	 */
	EClass getSpecHierarchyRootType();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecHierarchyRootType#getSPECTYPEREF <em>SPECTYPEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SPECTYPEREF</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchyRootType#getSPECTYPEREF()
	 * @see #getSpecHierarchyRootType()
	 * @generated
	 */
	EAttribute getSpecHierarchyRootType_SPECTYPEREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.SpecGroupType <em>Spec Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Group Type</em>'.
	 * @see era.foss.model.core.rif.SpecGroupType
	 * @generated
	 */
	EClass getSpecGroupType();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.SpecGroupType#getSPECTYPEREF <em>SPECTYPEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SPECTYPEREF</em>'.
	 * @see era.foss.model.core.rif.SpecGroupType#getSPECTYPEREF()
	 * @see #getSpecGroupType()
	 * @generated
	 */
	EAttribute getSpecGroupType_SPECTYPEREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeDefinitionComplexType <em>Attribute Definition Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition Complex Type</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionComplexType
	 * @generated
	 */
	EClass getAttributeDefinitionComplexType();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeDefinitionComplexType#getDATATYPEDEFINITIONBINARYFILEREF <em>DATATYPEDEFINITIONBINARYFILEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATATYPEDEFINITIONBINARYFILEREF</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionComplexType#getDATATYPEDEFINITIONBINARYFILEREF()
	 * @see #getAttributeDefinitionComplexType()
	 * @generated
	 */
	EAttribute getAttributeDefinitionComplexType_DATATYPEDEFINITIONBINARYFILEREF();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeDefinitionComplexType#getDATATYPEDEFINITIONDOCUMENTREF <em>DATATYPEDEFINITIONDOCUMENTREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATATYPEDEFINITIONDOCUMENTREF</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionComplexType#getDATATYPEDEFINITIONDOCUMENTREF()
	 * @see #getAttributeDefinitionComplexType()
	 * @generated
	 */
	EAttribute getAttributeDefinitionComplexType_DATATYPEDEFINITIONDOCUMENTREF();

	/**
	 * Returns the meta object for the attribute '{@link era.foss.model.core.rif.AttributeDefinitionComplexType#getDATATYPEDEFINITIONXMLDATAREF <em>DATATYPEDEFINITIONXMLDATAREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATATYPEDEFINITIONXMLDATAREF</em>'.
	 * @see era.foss.model.core.rif.AttributeDefinitionComplexType#getDATATYPEDEFINITIONXMLDATAREF()
	 * @see #getAttributeDefinitionComplexType()
	 * @generated
	 */
	EAttribute getAttributeDefinitionComplexType_DATATYPEDEFINITIONXMLDATAREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.SpecObjectValues <em>Spec Object Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Object Values</em>'.
	 * @see era.foss.model.core.rif.SpecObjectValues
	 * @generated
	 */
	EClass getSpecObjectValues();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.SpecObjectValues#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.SpecObjectValues#getGroup()
	 * @see #getSpecObjectValues()
	 * @generated
	 */
	EAttribute getSpecObjectValues_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecObjectValues#getATTRIBUTEVALUEEMBEDDEDDOCUMENT <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>'.
	 * @see era.foss.model.core.rif.SpecObjectValues#getATTRIBUTEVALUEEMBEDDEDDOCUMENT()
	 * @see #getSpecObjectValues()
	 * @generated
	 */
	EReference getSpecObjectValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENT();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecObjectValues#getATTRIBUTEVALUEEMBEDDEDFILE <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEEMBEDDEDFILE</em>'.
	 * @see era.foss.model.core.rif.SpecObjectValues#getATTRIBUTEVALUEEMBEDDEDFILE()
	 * @see #getSpecObjectValues()
	 * @generated
	 */
	EReference getSpecObjectValues_ATTRIBUTEVALUEEMBEDDEDFILE();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecObjectValues#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEENUMERATION</em>'.
	 * @see era.foss.model.core.rif.SpecObjectValues#getATTRIBUTEVALUEENUMERATION()
	 * @see #getSpecObjectValues()
	 * @generated
	 */
	EReference getSpecObjectValues_ATTRIBUTEVALUEENUMERATION();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecObjectValues#getATTRIBUTEVALUEFILEREFERENCE <em>ATTRIBUTEVALUEFILEREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEFILEREFERENCE</em>'.
	 * @see era.foss.model.core.rif.SpecObjectValues#getATTRIBUTEVALUEFILEREFERENCE()
	 * @see #getSpecObjectValues()
	 * @generated
	 */
	EReference getSpecObjectValues_ATTRIBUTEVALUEFILEREFERENCE();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecObjectValues#getATTRIBUTEVALUESIMPLE <em>ATTRIBUTEVALUESIMPLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUESIMPLE</em>'.
	 * @see era.foss.model.core.rif.SpecObjectValues#getATTRIBUTEVALUESIMPLE()
	 * @see #getSpecObjectValues()
	 * @generated
	 */
	EReference getSpecObjectValues_ATTRIBUTEVALUESIMPLE();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecObjectValues#getATTRIBUTEVALUEXMLDATA <em>ATTRIBUTEVALUEXMLDATA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEXMLDATA</em>'.
	 * @see era.foss.model.core.rif.SpecObjectValues#getATTRIBUTEVALUEXMLDATA()
	 * @see #getSpecObjectValues()
	 * @generated
	 */
	EReference getSpecObjectValues_ATTRIBUTEVALUEXMLDATA();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.SpecRelationValues <em>Spec Relation Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Relation Values</em>'.
	 * @see era.foss.model.core.rif.SpecRelationValues
	 * @generated
	 */
	EClass getSpecRelationValues();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.SpecRelationValues#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.SpecRelationValues#getGroup()
	 * @see #getSpecRelationValues()
	 * @generated
	 */
	EAttribute getSpecRelationValues_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecRelationValues#getATTRIBUTEVALUEEMBEDDEDDOCUMENT <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>'.
	 * @see era.foss.model.core.rif.SpecRelationValues#getATTRIBUTEVALUEEMBEDDEDDOCUMENT()
	 * @see #getSpecRelationValues()
	 * @generated
	 */
	EReference getSpecRelationValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENT();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecRelationValues#getATTRIBUTEVALUEEMBEDDEDFILE <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEEMBEDDEDFILE</em>'.
	 * @see era.foss.model.core.rif.SpecRelationValues#getATTRIBUTEVALUEEMBEDDEDFILE()
	 * @see #getSpecRelationValues()
	 * @generated
	 */
	EReference getSpecRelationValues_ATTRIBUTEVALUEEMBEDDEDFILE();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecRelationValues#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEENUMERATION</em>'.
	 * @see era.foss.model.core.rif.SpecRelationValues#getATTRIBUTEVALUEENUMERATION()
	 * @see #getSpecRelationValues()
	 * @generated
	 */
	EReference getSpecRelationValues_ATTRIBUTEVALUEENUMERATION();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecRelationValues#getATTRIBUTEVALUEFILEREFERENCE <em>ATTRIBUTEVALUEFILEREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEFILEREFERENCE</em>'.
	 * @see era.foss.model.core.rif.SpecRelationValues#getATTRIBUTEVALUEFILEREFERENCE()
	 * @see #getSpecRelationValues()
	 * @generated
	 */
	EReference getSpecRelationValues_ATTRIBUTEVALUEFILEREFERENCE();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecRelationValues#getATTRIBUTEVALUESIMPLE <em>ATTRIBUTEVALUESIMPLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUESIMPLE</em>'.
	 * @see era.foss.model.core.rif.SpecRelationValues#getATTRIBUTEVALUESIMPLE()
	 * @see #getSpecRelationValues()
	 * @generated
	 */
	EReference getSpecRelationValues_ATTRIBUTEVALUESIMPLE();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecRelationValues#getATTRIBUTEVALUEXMLDATA <em>ATTRIBUTEVALUEXMLDATA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEXMLDATA</em>'.
	 * @see era.foss.model.core.rif.SpecRelationValues#getATTRIBUTEVALUEXMLDATA()
	 * @see #getSpecRelationValues()
	 * @generated
	 */
	EReference getSpecRelationValues_ATTRIBUTEVALUEXMLDATA();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.SpecGroupValues <em>Spec Group Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Group Values</em>'.
	 * @see era.foss.model.core.rif.SpecGroupValues
	 * @generated
	 */
	EClass getSpecGroupValues();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.SpecGroupValues#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.SpecGroupValues#getGroup()
	 * @see #getSpecGroupValues()
	 * @generated
	 */
	EAttribute getSpecGroupValues_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecGroupValues#getATTRIBUTEVALUEEMBEDDEDDOCUMENT <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>'.
	 * @see era.foss.model.core.rif.SpecGroupValues#getATTRIBUTEVALUEEMBEDDEDDOCUMENT()
	 * @see #getSpecGroupValues()
	 * @generated
	 */
	EReference getSpecGroupValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENT();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecGroupValues#getATTRIBUTEVALUEEMBEDDEDFILE <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEEMBEDDEDFILE</em>'.
	 * @see era.foss.model.core.rif.SpecGroupValues#getATTRIBUTEVALUEEMBEDDEDFILE()
	 * @see #getSpecGroupValues()
	 * @generated
	 */
	EReference getSpecGroupValues_ATTRIBUTEVALUEEMBEDDEDFILE();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecGroupValues#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEENUMERATION</em>'.
	 * @see era.foss.model.core.rif.SpecGroupValues#getATTRIBUTEVALUEENUMERATION()
	 * @see #getSpecGroupValues()
	 * @generated
	 */
	EReference getSpecGroupValues_ATTRIBUTEVALUEENUMERATION();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecGroupValues#getATTRIBUTEVALUEFILEREFERENCE <em>ATTRIBUTEVALUEFILEREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEFILEREFERENCE</em>'.
	 * @see era.foss.model.core.rif.SpecGroupValues#getATTRIBUTEVALUEFILEREFERENCE()
	 * @see #getSpecGroupValues()
	 * @generated
	 */
	EReference getSpecGroupValues_ATTRIBUTEVALUEFILEREFERENCE();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecGroupValues#getATTRIBUTEVALUESIMPLE <em>ATTRIBUTEVALUESIMPLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUESIMPLE</em>'.
	 * @see era.foss.model.core.rif.SpecGroupValues#getATTRIBUTEVALUESIMPLE()
	 * @see #getSpecGroupValues()
	 * @generated
	 */
	EReference getSpecGroupValues_ATTRIBUTEVALUESIMPLE();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecGroupValues#getATTRIBUTEVALUEXMLDATA <em>ATTRIBUTEVALUEXMLDATA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEXMLDATA</em>'.
	 * @see era.foss.model.core.rif.SpecGroupValues#getATTRIBUTEVALUEXMLDATA()
	 * @see #getSpecGroupValues()
	 * @generated
	 */
	EReference getSpecGroupValues_ATTRIBUTEVALUEXMLDATA();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.SpecHierarchyRootValues <em>Spec Hierarchy Root Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Hierarchy Root Values</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchyRootValues
	 * @generated
	 */
	EClass getSpecHierarchyRootValues();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.SpecHierarchyRootValues#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchyRootValues#getGroup()
	 * @see #getSpecHierarchyRootValues()
	 * @generated
	 */
	EAttribute getSpecHierarchyRootValues_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecHierarchyRootValues#getATTRIBUTEVALUEEMBEDDEDDOCUMENT <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchyRootValues#getATTRIBUTEVALUEEMBEDDEDDOCUMENT()
	 * @see #getSpecHierarchyRootValues()
	 * @generated
	 */
	EReference getSpecHierarchyRootValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENT();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecHierarchyRootValues#getATTRIBUTEVALUEEMBEDDEDFILE <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEEMBEDDEDFILE</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchyRootValues#getATTRIBUTEVALUEEMBEDDEDFILE()
	 * @see #getSpecHierarchyRootValues()
	 * @generated
	 */
	EReference getSpecHierarchyRootValues_ATTRIBUTEVALUEEMBEDDEDFILE();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecHierarchyRootValues#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEENUMERATION</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchyRootValues#getATTRIBUTEVALUEENUMERATION()
	 * @see #getSpecHierarchyRootValues()
	 * @generated
	 */
	EReference getSpecHierarchyRootValues_ATTRIBUTEVALUEENUMERATION();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecHierarchyRootValues#getATTRIBUTEVALUEFILEREFERENCE <em>ATTRIBUTEVALUEFILEREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEFILEREFERENCE</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchyRootValues#getATTRIBUTEVALUEFILEREFERENCE()
	 * @see #getSpecHierarchyRootValues()
	 * @generated
	 */
	EReference getSpecHierarchyRootValues_ATTRIBUTEVALUEFILEREFERENCE();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecHierarchyRootValues#getATTRIBUTEVALUESIMPLE <em>ATTRIBUTEVALUESIMPLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUESIMPLE</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchyRootValues#getATTRIBUTEVALUESIMPLE()
	 * @see #getSpecHierarchyRootValues()
	 * @generated
	 */
	EReference getSpecHierarchyRootValues_ATTRIBUTEVALUESIMPLE();

	/**
	 * Returns the meta object for the containment reference list '{@link era.foss.model.core.rif.SpecHierarchyRootValues#getATTRIBUTEVALUEXMLDATA <em>ATTRIBUTEVALUEXMLDATA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEXMLDATA</em>'.
	 * @see era.foss.model.core.rif.SpecHierarchyRootValues#getATTRIBUTEVALUEXMLDATA()
	 * @see #getSpecHierarchyRootValues()
	 * @generated
	 */
	EReference getSpecHierarchyRootValues_ATTRIBUTEVALUEXMLDATA();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeValueEnumerationValues <em>Attribute Value Enumeration Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Enumeration Values</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEnumerationValues
	 * @generated
	 */
	EClass getAttributeValueEnumerationValues();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AttributeValueEnumerationValues#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEnumerationValues#getGroup()
	 * @see #getAttributeValueEnumerationValues()
	 * @generated
	 */
	EAttribute getAttributeValueEnumerationValues_Group();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AttributeValueEnumerationValues#getENUMVALUEREF <em>ENUMVALUEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>ENUMVALUEREF</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEnumerationValues#getENUMVALUEREF()
	 * @see #getAttributeValueEnumerationValues()
	 * @generated
	 */
	EAttribute getAttributeValueEnumerationValues_ENUMVALUEREF();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.XhtmlContent <em>Xhtml Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xhtml Content</em>'.
	 * @see era.foss.model.core.rif.XhtmlContent
	 * @generated
	 */
	EClass getXhtmlContent();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeValueEmbeddedDocumentXhtmlContent <em>Attribute Value Embedded Document Xhtml Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Embedded Document Xhtml Content</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEmbeddedDocumentXhtmlContent
	 * @generated
	 */
	EClass getAttributeValueEmbeddedDocumentXhtmlContent();

	/**
	 * Returns the meta object for the attribute list '{@link era.foss.model.core.rif.AttributeValueEmbeddedDocumentXhtmlContent#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see era.foss.model.core.rif.AttributeValueEmbeddedDocumentXhtmlContent#getAny()
	 * @see #getAttributeValueEmbeddedDocumentXhtmlContent()
	 * @generated
	 */
	EAttribute getAttributeValueEmbeddedDocumentXhtmlContent_Any();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.XmlContentXmlContent <em>Xml Content Xml Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Content Xml Content</em>'.
	 * @see era.foss.model.core.rif.XmlContentXmlContent
	 * @generated
	 */
	EClass getXmlContentXmlContent();

	/**
	 * Returns the meta object for class '{@link era.foss.model.core.rif.AttributeValueXmlDataXmlContent <em>Attribute Value Xml Data Xml Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Xml Data Xml Content</em>'.
	 * @see era.foss.model.core.rif.AttributeValueXmlDataXmlContent
	 * @generated
	 */
	EClass getAttributeValueXmlDataXmlContent();

	/**
	 * Returns the meta object for the containment reference '{@link era.foss.model.core.rif.AttributeValueXmlDataXmlContent#getXMLCONTENT <em>XMLCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XMLCONTENT</em>'.
	 * @see era.foss.model.core.rif.AttributeValueXmlDataXmlContent#getXMLCONTENT()
	 * @see #getAttributeValueXmlDataXmlContent()
	 * @generated
	 */
	EReference getAttributeValueXmlDataXmlContent_XMLCONTENT();

	/**
	 * Returns the meta object for enum '{@link era.foss.model.core.rif.ACCESSPOLICYACCESSMODEENUM <em>ACCESSPOLICYACCESSMODEENUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ACCESSPOLICYACCESSMODEENUM</em>'.
	 * @see era.foss.model.core.rif.ACCESSPOLICYACCESSMODEENUM
	 * @generated
	 */
	EEnum getACCESSPOLICYACCESSMODEENUM();

	/**
	 * Returns the meta object for enum '{@link era.foss.model.core.rif.BOOLEAN <em>BOOLEAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>BOOLEAN</em>'.
	 * @see era.foss.model.core.rif.BOOLEAN
	 * @generated
	 */
	EEnum getBOOLEAN();

	/**
	 * Returns the meta object for enum '{@link era.foss.model.core.rif.DATATYPEDEFINITIONDOCUMENTFORMATENUM <em>DATATYPEDEFINITIONDOCUMENTFORMATENUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DATATYPEDEFINITIONDOCUMENTFORMATENUM</em>'.
	 * @see era.foss.model.core.rif.DATATYPEDEFINITIONDOCUMENTFORMATENUM
	 * @generated
	 */
	EEnum getDATATYPEDEFINITIONDOCUMENTFORMATENUM();

	/**
	 * Returns the meta object for data type '{@link era.foss.model.core.rif.ACCESSPOLICYACCESSMODEENUM <em>ACCESSPOLICYACCESSMODEENUM Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ACCESSPOLICYACCESSMODEENUM Object</em>'.
	 * @see era.foss.model.core.rif.ACCESSPOLICYACCESSMODEENUM
	 * @model instanceClass="era.foss.model.core.rif.ACCESSPOLICYACCESSMODEENUM"
	 *        extendedMetaData="name='ACCESS-POLICY-ACCESS-MODE-ENUM:Object' baseType='ACCESS-POLICY-ACCESS-MODE-ENUM'"
	 * @generated
	 */
	EDataType getACCESSPOLICYACCESSMODEENUMObject();

	/**
	 * Returns the meta object for data type '{@link era.foss.model.core.rif.BOOLEAN <em>BOOLEAN Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BOOLEAN Object</em>'.
	 * @see era.foss.model.core.rif.BOOLEAN
	 * @model instanceClass="era.foss.model.core.rif.BOOLEAN"
	 *        extendedMetaData="name='BOOLEAN:Object' baseType='BOOLEAN'"
	 * @generated
	 */
	EDataType getBOOLEANObject();

	/**
	 * Returns the meta object for data type '{@link era.foss.model.core.rif.DATATYPEDEFINITIONDOCUMENTFORMATENUM <em>DATATYPEDEFINITIONDOCUMENTFORMATENUM Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DATATYPEDEFINITIONDOCUMENTFORMATENUM Object</em>'.
	 * @see era.foss.model.core.rif.DATATYPEDEFINITIONDOCUMENTFORMATENUM
	 * @model instanceClass="era.foss.model.core.rif.DATATYPEDEFINITIONDOCUMENTFORMATENUM"
	 *        extendedMetaData="name='DATATYPE-DEFINITION-DOCUMENT-FORMAT-ENUM:Object' baseType='DATATYPE-DEFINITION-DOCUMENT-FORMAT-ENUM'"
	 * @generated
	 */
	EDataType getDATATYPEDEFINITIONDOCUMENTFORMATENUMObject();

	/**
	 * Returns the meta object for data type '<em>FLOAT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>FLOAT</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='FLOAT' baseType='http://www.eclipse.org/emf/2003/XMLType#float'"
	 * @generated
	 */
	EDataType getFLOAT();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>FLOAT Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>FLOAT Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='FLOAT:Object' baseType='FLOAT'"
	 * @generated
	 */
	EDataType getFLOATObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>INTEGER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>INTEGER</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='INTEGER' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getINTEGER();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>REF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>REF</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='REF' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getREF();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>STRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>STRING</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='STRING' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getSTRING();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RifFactory getRifFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AccessPoliciesImpl <em>Access Policies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AccessPoliciesImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAccessPolicies()
		 * @generated
		 */
		EClass ACCESS_POLICIES = eINSTANCE.getAccessPolicies();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_POLICIES__GROUP = eINSTANCE.getAccessPolicies_Group();

		/**
		 * The meta object literal for the '<em><b>ACCESSPOLICY</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_POLICIES__ACCESSPOLICY = eINSTANCE
				.getAccessPolicies_ACCESSPOLICY();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AccessPolicyImpl <em>Access Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AccessPolicyImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAccessPolicy()
		 * @generated
		 */
		EClass ACCESS_POLICY = eINSTANCE.getAccessPolicy();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_POLICY__LONGNAME = eINSTANCE
				.getAccessPolicy_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_POLICY__DESC = eINSTANCE.getAccessPolicy_DESC();

		/**
		 * The meta object literal for the '<em><b>ACCESSMODE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_POLICY__ACCESSMODE = eINSTANCE
				.getAccessPolicy_ACCESSMODE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_POLICY__ATTRIBUTEDEFINITIONS = eINSTANCE
				.getAccessPolicy_ATTRIBUTEDEFINITIONS();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_POLICY__ATTRIBUTEVALUES = eINSTANCE
				.getAccessPolicy_ATTRIBUTEVALUES();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_POLICY__DATATYPEDEFINITIONS = eINSTANCE
				.getAccessPolicy_DATATYPEDEFINITIONS();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_POLICY__IDENTIFIER = eINSTANCE
				.getAccessPolicy_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_POLICY__LASTCHANGE = eINSTANCE
				.getAccessPolicy_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>RELATIONGROUPS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_POLICY__RELATIONGROUPS = eINSTANCE
				.getAccessPolicy_RELATIONGROUPS();

		/**
		 * The meta object literal for the '<em><b>SPECGROUPS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_POLICY__SPECGROUPS = eINSTANCE
				.getAccessPolicy_SPECGROUPS();

		/**
		 * The meta object literal for the '<em><b>SPECHIERARCHIES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_POLICY__SPECHIERARCHIES = eINSTANCE
				.getAccessPolicy_SPECHIERARCHIES();

		/**
		 * The meta object literal for the '<em><b>SPECHIERARCHYROOTS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_POLICY__SPECHIERARCHYROOTS = eINSTANCE
				.getAccessPolicy_SPECHIERARCHYROOTS();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECTS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_POLICY__SPECOBJECTS = eINSTANCE
				.getAccessPolicy_SPECOBJECTS();

		/**
		 * The meta object literal for the '<em><b>SPECRELATIONS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_POLICY__SPECRELATIONS = eINSTANCE
				.getAccessPolicy_SPECRELATIONS();

		/**
		 * The meta object literal for the '<em><b>SPECTYPES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_POLICY__SPECTYPES = eINSTANCE
				.getAccessPolicy_SPECTYPES();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeDefinitionComplexImpl <em>Attribute Definition Complex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeDefinitionComplexImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeDefinitionComplex()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION_COMPLEX = eINSTANCE
				.getAttributeDefinitionComplex();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_COMPLEX__LONGNAME = eINSTANCE
				.getAttributeDefinitionComplex_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_COMPLEX__DESC = eINSTANCE
				.getAttributeDefinitionComplex_DESC();

		/**
		 * The meta object literal for the '<em><b>DEFAULTVALUE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE = eINSTANCE
				.getAttributeDefinitionComplex_DEFAULTVALUE();

		/**
		 * The meta object literal for the '<em><b>DEFAULTVALUE2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE2 = eINSTANCE
				.getAttributeDefinitionComplex_DEFAULTVALUE2();

		/**
		 * The meta object literal for the '<em><b>DEFAULTVALUE3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE3 = eINSTANCE
				.getAttributeDefinitionComplex_DEFAULTVALUE3();

		/**
		 * The meta object literal for the '<em><b>DEFAULTVALUE4</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE4 = eINSTANCE
				.getAttributeDefinitionComplex_DEFAULTVALUE4();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_COMPLEX__IDENTIFIER = eINSTANCE
				.getAttributeDefinitionComplex_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_COMPLEX__LASTCHANGE = eINSTANCE
				.getAttributeDefinitionComplex_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_COMPLEX__TYPE = eINSTANCE
				.getAttributeDefinitionComplex_TYPE();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeDefinitionEnumerationImpl <em>Attribute Definition Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeDefinitionEnumerationImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeDefinitionEnumeration()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION_ENUMERATION = eINSTANCE
				.getAttributeDefinitionEnumeration();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_ENUMERATION__LONGNAME = eINSTANCE
				.getAttributeDefinitionEnumeration_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_ENUMERATION__DESC = eINSTANCE
				.getAttributeDefinitionEnumeration_DESC();

		/**
		 * The meta object literal for the '<em><b>DEFAULTVALUE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULTVALUE = eINSTANCE
				.getAttributeDefinitionEnumeration_DEFAULTVALUE();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_ENUMERATION__IDENTIFIER = eINSTANCE
				.getAttributeDefinitionEnumeration_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_ENUMERATION__LASTCHANGE = eINSTANCE
				.getAttributeDefinitionEnumeration_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>MULTIVALUED</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_ENUMERATION__MULTIVALUED = eINSTANCE
				.getAttributeDefinitionEnumeration_MULTIVALUED();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_ENUMERATION__TYPE = eINSTANCE
				.getAttributeDefinitionEnumeration_TYPE();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeDefinitionSimpleImpl <em>Attribute Definition Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeDefinitionSimpleImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeDefinitionSimple()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION_SIMPLE = eINSTANCE
				.getAttributeDefinitionSimple();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_SIMPLE__LONGNAME = eINSTANCE
				.getAttributeDefinitionSimple_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_SIMPLE__DESC = eINSTANCE
				.getAttributeDefinitionSimple_DESC();

		/**
		 * The meta object literal for the '<em><b>DEFAULTVALUE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_SIMPLE__DEFAULTVALUE = eINSTANCE
				.getAttributeDefinitionSimple_DEFAULTVALUE();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_SIMPLE__IDENTIFIER = eINSTANCE
				.getAttributeDefinitionSimple_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_SIMPLE__LASTCHANGE = eINSTANCE
				.getAttributeDefinitionSimple_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_SIMPLE__TYPE = eINSTANCE
				.getAttributeDefinitionSimple_TYPE();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeDefinitionsImpl <em>Attribute Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeDefinitionsImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeDefinitions()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITIONS = eINSTANCE.getAttributeDefinitions();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITIONS__GROUP = eINSTANCE
				.getAttributeDefinitions_Group();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEXREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITIONS__ATTRIBUTEDEFINITIONCOMPLEXREF = eINSTANCE
				.getAttributeDefinitions_ATTRIBUTEDEFINITIONCOMPLEXREF();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONENUMERATIONREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITIONS__ATTRIBUTEDEFINITIONENUMERATIONREF = eINSTANCE
				.getAttributeDefinitions_ATTRIBUTEDEFINITIONENUMERATIONREF();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONSIMPLEREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITIONS__ATTRIBUTEDEFINITIONSIMPLEREF = eINSTANCE
				.getAttributeDefinitions_ATTRIBUTEDEFINITIONSIMPLEREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeValueEmbeddedDocumentImpl <em>Attribute Value Embedded Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeValueEmbeddedDocumentImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueEmbeddedDocument()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT = eINSTANCE
				.getAttributeValueEmbeddedDocument();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__LONGNAME = eINSTANCE
				.getAttributeValueEmbeddedDocument_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DESC = eINSTANCE
				.getAttributeValueEmbeddedDocument_DESC();

		/**
		 * The meta object literal for the '<em><b>DEFINITION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DEFINITION = eINSTANCE
				.getAttributeValueEmbeddedDocument_DEFINITION();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__IDENTIFIER = eINSTANCE
				.getAttributeValueEmbeddedDocument_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__LASTCHANGE = eINSTANCE
				.getAttributeValueEmbeddedDocument_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>XHTMLCONTENT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__XHTMLCONTENT = eINSTANCE
				.getAttributeValueEmbeddedDocument_XHTMLCONTENT();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeValueEmbeddedFileImpl <em>Attribute Value Embedded File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeValueEmbeddedFileImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueEmbeddedFile()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_EMBEDDED_FILE = eINSTANCE
				.getAttributeValueEmbeddedFile();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_EMBEDDED_FILE__LONGNAME = eINSTANCE
				.getAttributeValueEmbeddedFile_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_EMBEDDED_FILE__DESC = eINSTANCE
				.getAttributeValueEmbeddedFile_DESC();

		/**
		 * The meta object literal for the '<em><b>BINARYCONTENT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_EMBEDDED_FILE__BINARYCONTENT = eINSTANCE
				.getAttributeValueEmbeddedFile_BINARYCONTENT();

		/**
		 * The meta object literal for the '<em><b>DEFINITION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_EMBEDDED_FILE__DEFINITION = eINSTANCE
				.getAttributeValueEmbeddedFile_DEFINITION();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_EMBEDDED_FILE__IDENTIFIER = eINSTANCE
				.getAttributeValueEmbeddedFile_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_EMBEDDED_FILE__LASTCHANGE = eINSTANCE
				.getAttributeValueEmbeddedFile_LASTCHANGE();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeValueEnumerationImpl <em>Attribute Value Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeValueEnumerationImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueEnumeration()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_ENUMERATION = eINSTANCE
				.getAttributeValueEnumeration();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_ENUMERATION__LONGNAME = eINSTANCE
				.getAttributeValueEnumeration_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_ENUMERATION__DESC = eINSTANCE
				.getAttributeValueEnumeration_DESC();

		/**
		 * The meta object literal for the '<em><b>DEFINITION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_ENUMERATION__DEFINITION = eINSTANCE
				.getAttributeValueEnumeration_DEFINITION();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_ENUMERATION__IDENTIFIER = eINSTANCE
				.getAttributeValueEnumeration_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_ENUMERATION__LASTCHANGE = eINSTANCE
				.getAttributeValueEnumeration_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>VALUES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_ENUMERATION__VALUES = eINSTANCE
				.getAttributeValueEnumeration_VALUES();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeValueFileReferenceImpl <em>Attribute Value File Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeValueFileReferenceImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueFileReference()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_FILE_REFERENCE = eINSTANCE
				.getAttributeValueFileReference();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_FILE_REFERENCE__LONGNAME = eINSTANCE
				.getAttributeValueFileReference_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_FILE_REFERENCE__DESC = eINSTANCE
				.getAttributeValueFileReference_DESC();

		/**
		 * The meta object literal for the '<em><b>DEFINITION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_FILE_REFERENCE__DEFINITION = eINSTANCE
				.getAttributeValueFileReference_DEFINITION();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_FILE_REFERENCE__IDENTIFIER = eINSTANCE
				.getAttributeValueFileReference_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_FILE_REFERENCE__LASTCHANGE = eINSTANCE
				.getAttributeValueFileReference_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>PATHTOFILE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_FILE_REFERENCE__PATHTOFILE = eINSTANCE
				.getAttributeValueFileReference_PATHTOFILE();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeValueSimpleImpl <em>Attribute Value Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeValueSimpleImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueSimple()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_SIMPLE = eINSTANCE.getAttributeValueSimple();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_SIMPLE__LONGNAME = eINSTANCE
				.getAttributeValueSimple_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_SIMPLE__DESC = eINSTANCE
				.getAttributeValueSimple_DESC();

		/**
		 * The meta object literal for the '<em><b>DEFINITION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_SIMPLE__DEFINITION = eINSTANCE
				.getAttributeValueSimple_DEFINITION();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_SIMPLE__IDENTIFIER = eINSTANCE
				.getAttributeValueSimple_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_SIMPLE__LASTCHANGE = eINSTANCE
				.getAttributeValueSimple_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>THEVALUE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_SIMPLE__THEVALUE = eINSTANCE
				.getAttributeValueSimple_THEVALUE();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeValuesImpl <em>Attribute Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeValuesImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValues()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUES = eINSTANCE.getAttributeValues();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUES__GROUP = eINSTANCE
				.getAttributeValues_Group();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF = eINSTANCE
				.getAttributeValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILEREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUES__ATTRIBUTEVALUEEMBEDDEDFILEREF = eINSTANCE
				.getAttributeValues_ATTRIBUTEVALUEEMBEDDEDFILEREF();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEENUMERATIONREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUES__ATTRIBUTEVALUEENUMERATIONREF = eINSTANCE
				.getAttributeValues_ATTRIBUTEVALUEENUMERATIONREF();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEFILEREFERENCEREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUES__ATTRIBUTEVALUEFILEREFERENCEREF = eINSTANCE
				.getAttributeValues_ATTRIBUTEVALUEFILEREFERENCEREF();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUESIMPLEREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUES__ATTRIBUTEVALUESIMPLEREF = eINSTANCE
				.getAttributeValues_ATTRIBUTEVALUESIMPLEREF();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEXMLDATAREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUES__ATTRIBUTEVALUEXMLDATAREF = eINSTANCE
				.getAttributeValues_ATTRIBUTEVALUEXMLDATAREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeValueXmlDataImpl <em>Attribute Value Xml Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeValueXmlDataImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueXmlData()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_XML_DATA = eINSTANCE.getAttributeValueXmlData();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_XML_DATA__LONGNAME = eINSTANCE
				.getAttributeValueXmlData_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_XML_DATA__DESC = eINSTANCE
				.getAttributeValueXmlData_DESC();

		/**
		 * The meta object literal for the '<em><b>DEFINITION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_XML_DATA__DEFINITION = eINSTANCE
				.getAttributeValueXmlData_DEFINITION();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_XML_DATA__IDENTIFIER = eINSTANCE
				.getAttributeValueXmlData_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_XML_DATA__LASTCHANGE = eINSTANCE
				.getAttributeValueXmlData_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>XMLCONTENT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_XML_DATA__XMLCONTENT = eINSTANCE
				.getAttributeValueXmlData_XMLCONTENT();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.BinaryContentImpl <em>Binary Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.BinaryContentImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getBinaryContent()
		 * @generated
		 */
		EClass BINARY_CONTENT = eINSTANCE.getBinaryContent();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeValueEmbeddedFileBinaryContentImpl <em>Attribute Value Embedded File Binary Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeValueEmbeddedFileBinaryContentImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueEmbeddedFileBinaryContent()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_EMBEDDED_FILE_BINARY_CONTENT = eINSTANCE
				.getAttributeValueEmbeddedFileBinaryContent();

		/**
		 * The meta object literal for the '<em><b>BINARYCONTENT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_EMBEDDED_FILE_BINARY_CONTENT__BINARYCONTENT = eINSTANCE
				.getAttributeValueEmbeddedFileBinaryContent_BINARYCONTENT();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.SpecHierarchyChildrenImpl <em>Spec Hierarchy Children</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.SpecHierarchyChildrenImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecHierarchyChildren()
		 * @generated
		 */
		EClass SPEC_HIERARCHY_CHILDREN = eINSTANCE.getSpecHierarchyChildren();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_HIERARCHY_CHILDREN__GROUP = eINSTANCE
				.getSpecHierarchyChildren_Group();

		/**
		 * The meta object literal for the '<em><b>SPECHIERARCHY</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_HIERARCHY_CHILDREN__SPECHIERARCHY = eINSTANCE
				.getSpecHierarchyChildren_SPECHIERARCHY();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.SpecHierarchyRootChildrenImpl <em>Spec Hierarchy Root Children</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.SpecHierarchyRootChildrenImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecHierarchyRootChildren()
		 * @generated
		 */
		EClass SPEC_HIERARCHY_ROOT_CHILDREN = eINSTANCE
				.getSpecHierarchyRootChildren();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_HIERARCHY_ROOT_CHILDREN__GROUP = eINSTANCE
				.getSpecHierarchyRootChildren_Group();

		/**
		 * The meta object literal for the '<em><b>SPECHIERARCHY</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_HIERARCHY_ROOT_CHILDREN__SPECHIERARCHY = eINSTANCE
				.getSpecHierarchyRootChildren_SPECHIERARCHY();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.DatatypeDefinitionBinaryFileImpl <em>Datatype Definition Binary File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.DatatypeDefinitionBinaryFileImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDatatypeDefinitionBinaryFile()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_BINARY_FILE = eINSTANCE
				.getDatatypeDefinitionBinaryFile();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_BINARY_FILE__LONGNAME = eINSTANCE
				.getDatatypeDefinitionBinaryFile_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_BINARY_FILE__DESC = eINSTANCE
				.getDatatypeDefinitionBinaryFile_DESC();

		/**
		 * The meta object literal for the '<em><b>APPLICATION</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_BINARY_FILE__APPLICATION = eINSTANCE
				.getDatatypeDefinitionBinaryFile_APPLICATION();

		/**
		 * The meta object literal for the '<em><b>EMBEDDED</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_BINARY_FILE__EMBEDDED = eINSTANCE
				.getDatatypeDefinitionBinaryFile_EMBEDDED();

		/**
		 * The meta object literal for the '<em><b>FILENAMESUFFIX</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_BINARY_FILE__FILENAMESUFFIX = eINSTANCE
				.getDatatypeDefinitionBinaryFile_FILENAMESUFFIX();

		/**
		 * The meta object literal for the '<em><b>FORMATNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_BINARY_FILE__FORMATNAME = eINSTANCE
				.getDatatypeDefinitionBinaryFile_FORMATNAME();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_BINARY_FILE__IDENTIFIER = eINSTANCE
				.getDatatypeDefinitionBinaryFile_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_BINARY_FILE__LASTCHANGE = eINSTANCE
				.getDatatypeDefinitionBinaryFile_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>MIMETYPE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_BINARY_FILE__MIMETYPE = eINSTANCE
				.getDatatypeDefinitionBinaryFile_MIMETYPE();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.DatatypeDefinitionBooleanImpl <em>Datatype Definition Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.DatatypeDefinitionBooleanImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDatatypeDefinitionBoolean()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_BOOLEAN = eINSTANCE
				.getDatatypeDefinitionBoolean();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_BOOLEAN__LONGNAME = eINSTANCE
				.getDatatypeDefinitionBoolean_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_BOOLEAN__DESC = eINSTANCE
				.getDatatypeDefinitionBoolean_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_BOOLEAN__IDENTIFIER = eINSTANCE
				.getDatatypeDefinitionBoolean_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_BOOLEAN__LASTCHANGE = eINSTANCE
				.getDatatypeDefinitionBoolean_LASTCHANGE();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.DatatypeDefinitionDocumentImpl <em>Datatype Definition Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.DatatypeDefinitionDocumentImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDatatypeDefinitionDocument()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_DOCUMENT = eINSTANCE
				.getDatatypeDefinitionDocument();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_DOCUMENT__LONGNAME = eINSTANCE
				.getDatatypeDefinitionDocument_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_DOCUMENT__DESC = eINSTANCE
				.getDatatypeDefinitionDocument_DESC();

		/**
		 * The meta object literal for the '<em><b>EMBEDDED</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_DOCUMENT__EMBEDDED = eINSTANCE
				.getDatatypeDefinitionDocument_EMBEDDED();

		/**
		 * The meta object literal for the '<em><b>FORMAT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_DOCUMENT__FORMAT = eINSTANCE
				.getDatatypeDefinitionDocument_FORMAT();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_DOCUMENT__IDENTIFIER = eINSTANCE
				.getDatatypeDefinitionDocument_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_DOCUMENT__LASTCHANGE = eINSTANCE
				.getDatatypeDefinitionDocument_LASTCHANGE();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.DatatypeDefinitionEnumerationImpl <em>Datatype Definition Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.DatatypeDefinitionEnumerationImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDatatypeDefinitionEnumeration()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_ENUMERATION = eINSTANCE
				.getDatatypeDefinitionEnumeration();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_ENUMERATION__LONGNAME = eINSTANCE
				.getDatatypeDefinitionEnumeration_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_ENUMERATION__DESC = eINSTANCE
				.getDatatypeDefinitionEnumeration_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_ENUMERATION__IDENTIFIER = eINSTANCE
				.getDatatypeDefinitionEnumeration_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_ENUMERATION__LASTCHANGE = eINSTANCE
				.getDatatypeDefinitionEnumeration_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>SPECIFIEDVALUES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPE_DEFINITION_ENUMERATION__SPECIFIEDVALUES = eINSTANCE
				.getDatatypeDefinitionEnumeration_SPECIFIEDVALUES();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.DatatypeDefinitionIntegerImpl <em>Datatype Definition Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.DatatypeDefinitionIntegerImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDatatypeDefinitionInteger()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_INTEGER = eINSTANCE
				.getDatatypeDefinitionInteger();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_INTEGER__LONGNAME = eINSTANCE
				.getDatatypeDefinitionInteger_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_INTEGER__DESC = eINSTANCE
				.getDatatypeDefinitionInteger_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_INTEGER__IDENTIFIER = eINSTANCE
				.getDatatypeDefinitionInteger_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_INTEGER__LASTCHANGE = eINSTANCE
				.getDatatypeDefinitionInteger_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>MAX</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_INTEGER__MAX = eINSTANCE
				.getDatatypeDefinitionInteger_MAX();

		/**
		 * The meta object literal for the '<em><b>MIN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_INTEGER__MIN = eINSTANCE
				.getDatatypeDefinitionInteger_MIN();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.DatatypeDefinitionRealImpl <em>Datatype Definition Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.DatatypeDefinitionRealImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDatatypeDefinitionReal()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_REAL = eINSTANCE.getDatatypeDefinitionReal();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_REAL__LONGNAME = eINSTANCE
				.getDatatypeDefinitionReal_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_REAL__DESC = eINSTANCE
				.getDatatypeDefinitionReal_DESC();

		/**
		 * The meta object literal for the '<em><b>ACCURACY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_REAL__ACCURACY = eINSTANCE
				.getDatatypeDefinitionReal_ACCURACY();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_REAL__IDENTIFIER = eINSTANCE
				.getDatatypeDefinitionReal_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_REAL__LASTCHANGE = eINSTANCE
				.getDatatypeDefinitionReal_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>MAX</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_REAL__MAX = eINSTANCE
				.getDatatypeDefinitionReal_MAX();

		/**
		 * The meta object literal for the '<em><b>MIN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_REAL__MIN = eINSTANCE
				.getDatatypeDefinitionReal_MIN();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.DatatypeDefinitionStringImpl <em>Datatype Definition String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.DatatypeDefinitionStringImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDatatypeDefinitionString()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_STRING = eINSTANCE
				.getDatatypeDefinitionString();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_STRING__LONGNAME = eINSTANCE
				.getDatatypeDefinitionString_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_STRING__DESC = eINSTANCE
				.getDatatypeDefinitionString_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_STRING__IDENTIFIER = eINSTANCE
				.getDatatypeDefinitionString_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_STRING__LASTCHANGE = eINSTANCE
				.getDatatypeDefinitionString_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>MAXLENGTH</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_STRING__MAXLENGTH = eINSTANCE
				.getDatatypeDefinitionString_MAXLENGTH();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.DatatypeDefinitionsImpl <em>Datatype Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.DatatypeDefinitionsImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDatatypeDefinitions()
		 * @generated
		 */
		EClass DATATYPE_DEFINITIONS = eINSTANCE.getDatatypeDefinitions();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITIONS__GROUP = eINSTANCE
				.getDatatypeDefinitions_Group();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONBINARYFILEREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITIONS__DATATYPEDEFINITIONBINARYFILEREF = eINSTANCE
				.getDatatypeDefinitions_DATATYPEDEFINITIONBINARYFILEREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONBOOLEANREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITIONS__DATATYPEDEFINITIONBOOLEANREF = eINSTANCE
				.getDatatypeDefinitions_DATATYPEDEFINITIONBOOLEANREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONDOCUMENTREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITIONS__DATATYPEDEFINITIONDOCUMENTREF = eINSTANCE
				.getDatatypeDefinitions_DATATYPEDEFINITIONDOCUMENTREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONENUMERATIONREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITIONS__DATATYPEDEFINITIONENUMERATIONREF = eINSTANCE
				.getDatatypeDefinitions_DATATYPEDEFINITIONENUMERATIONREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONINTEGERREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITIONS__DATATYPEDEFINITIONINTEGERREF = eINSTANCE
				.getDatatypeDefinitions_DATATYPEDEFINITIONINTEGERREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONREALREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITIONS__DATATYPEDEFINITIONREALREF = eINSTANCE
				.getDatatypeDefinitions_DATATYPEDEFINITIONREALREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONSTRINGREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITIONS__DATATYPEDEFINITIONSTRINGREF = eINSTANCE
				.getDatatypeDefinitions_DATATYPEDEFINITIONSTRINGREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONXMLDATAREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITIONS__DATATYPEDEFINITIONXMLDATAREF = eINSTANCE
				.getDatatypeDefinitions_DATATYPEDEFINITIONXMLDATAREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.DatatypeDefinitionXmlDataImpl <em>Datatype Definition Xml Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.DatatypeDefinitionXmlDataImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDatatypeDefinitionXmlData()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_XML_DATA = eINSTANCE
				.getDatatypeDefinitionXmlData();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_XML_DATA__LONGNAME = eINSTANCE
				.getDatatypeDefinitionXmlData_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_XML_DATA__DESC = eINSTANCE
				.getDatatypeDefinitionXmlData_DESC();

		/**
		 * The meta object literal for the '<em><b>EMBEDDED</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_XML_DATA__EMBEDDED = eINSTANCE
				.getDatatypeDefinitionXmlData_EMBEDDED();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_XML_DATA__IDENTIFIER = eINSTANCE
				.getDatatypeDefinitionXmlData_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_XML_DATA__LASTCHANGE = eINSTANCE
				.getDatatypeDefinitionXmlData_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>NAMESPACEURI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_XML_DATA__NAMESPACEURI = eINSTANCE
				.getDatatypeDefinitionXmlData_NAMESPACEURI();

		/**
		 * The meta object literal for the '<em><b>SCHEMALOCATION</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_XML_DATA__SCHEMALOCATION = eINSTANCE
				.getDatatypeDefinitionXmlData_SCHEMALOCATION();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.DatatypesImpl <em>Datatypes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.DatatypesImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDatatypes()
		 * @generated
		 */
		EClass DATATYPES = eINSTANCE.getDatatypes();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPES__GROUP = eINSTANCE.getDatatypes_Group();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONBINARYFILE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPES__DATATYPEDEFINITIONBINARYFILE = eINSTANCE
				.getDatatypes_DATATYPEDEFINITIONBINARYFILE();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONBOOLEAN</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPES__DATATYPEDEFINITIONBOOLEAN = eINSTANCE
				.getDatatypes_DATATYPEDEFINITIONBOOLEAN();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONDOCUMENT</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPES__DATATYPEDEFINITIONDOCUMENT = eINSTANCE
				.getDatatypes_DATATYPEDEFINITIONDOCUMENT();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONENUMERATION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPES__DATATYPEDEFINITIONENUMERATION = eINSTANCE
				.getDatatypes_DATATYPEDEFINITIONENUMERATION();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONINTEGER</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPES__DATATYPEDEFINITIONINTEGER = eINSTANCE
				.getDatatypes_DATATYPEDEFINITIONINTEGER();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONREAL</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPES__DATATYPEDEFINITIONREAL = eINSTANCE
				.getDatatypes_DATATYPEDEFINITIONREAL();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONSTRING</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPES__DATATYPEDEFINITIONSTRING = eINSTANCE
				.getDatatypes_DATATYPEDEFINITIONSTRING();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONXMLDATA</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPES__DATATYPEDEFINITIONXMLDATA = eINSTANCE
				.getDatatypes_DATATYPEDEFINITIONXMLDATA();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.DefaultValue2Impl <em>Default Value2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.DefaultValue2Impl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDefaultValue2()
		 * @generated
		 */
		EClass DEFAULT_VALUE2 = eINSTANCE.getDefaultValue2();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_VALUE2__ATTRIBUTEVALUEEMBEDDEDFILE = eINSTANCE
				.getDefaultValue2_ATTRIBUTEVALUEEMBEDDEDFILE();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.DefaultValue3Impl <em>Default Value3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.DefaultValue3Impl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDefaultValue3()
		 * @generated
		 */
		EClass DEFAULT_VALUE3 = eINSTANCE.getDefaultValue3();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_VALUE3__ATTRIBUTEVALUEEMBEDDEDDOCUMENT = eINSTANCE
				.getDefaultValue3_ATTRIBUTEVALUEEMBEDDEDDOCUMENT();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.DefaultValue4Impl <em>Default Value4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.DefaultValue4Impl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDefaultValue4()
		 * @generated
		 */
		EClass DEFAULT_VALUE4 = eINSTANCE.getDefaultValue4();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEFILEREFERENCE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_VALUE4__ATTRIBUTEVALUEFILEREFERENCE = eINSTANCE
				.getDefaultValue4_ATTRIBUTEVALUEFILEREFERENCE();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeDefinitionSimpleDefaultValueImpl <em>Attribute Definition Simple Default Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeDefinitionSimpleDefaultValueImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeDefinitionSimpleDefaultValue()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION_SIMPLE_DEFAULT_VALUE = eINSTANCE
				.getAttributeDefinitionSimpleDefaultValue();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUESIMPLE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_SIMPLE_DEFAULT_VALUE__ATTRIBUTEVALUESIMPLE = eINSTANCE
				.getAttributeDefinitionSimpleDefaultValue_ATTRIBUTEVALUESIMPLE();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeDefinitionEnumerationDefaultValueImpl <em>Attribute Definition Enumeration Default Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeDefinitionEnumerationDefaultValueImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeDefinitionEnumerationDefaultValue()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION_ENUMERATION_DEFAULT_VALUE = eINSTANCE
				.getAttributeDefinitionEnumerationDefaultValue();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_ENUMERATION_DEFAULT_VALUE__GROUP = eINSTANCE
				.getAttributeDefinitionEnumerationDefaultValue_Group();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_ENUMERATION_DEFAULT_VALUE__ATTRIBUTEVALUEENUMERATION = eINSTANCE
				.getAttributeDefinitionEnumerationDefaultValue_ATTRIBUTEVALUEENUMERATION();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeDefinitionComplexDefaultValueImpl <em>Attribute Definition Complex Default Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeDefinitionComplexDefaultValueImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeDefinitionComplexDefaultValue()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION_COMPLEX_DEFAULT_VALUE = eINSTANCE
				.getAttributeDefinitionComplexDefaultValue();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_COMPLEX_DEFAULT_VALUE__ATTRIBUTEVALUEXMLDATA = eINSTANCE
				.getAttributeDefinitionComplexDefaultValue_ATTRIBUTEVALUEXMLDATA();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeValueEmbeddedDocumentDefinitionImpl <em>Attribute Value Embedded Document Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeValueEmbeddedDocumentDefinitionImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueEmbeddedDocumentDefinition()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT_DEFINITION = eINSTANCE
				.getAttributeValueEmbeddedDocumentDefinition();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEXREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT_DEFINITION__ATTRIBUTEDEFINITIONCOMPLEXREF = eINSTANCE
				.getAttributeValueEmbeddedDocumentDefinition_ATTRIBUTEDEFINITIONCOMPLEXREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeValueFileReferenceDefinitionImpl <em>Attribute Value File Reference Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeValueFileReferenceDefinitionImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueFileReferenceDefinition()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_FILE_REFERENCE_DEFINITION = eINSTANCE
				.getAttributeValueFileReferenceDefinition();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEXREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_FILE_REFERENCE_DEFINITION__ATTRIBUTEDEFINITIONCOMPLEXREF = eINSTANCE
				.getAttributeValueFileReferenceDefinition_ATTRIBUTEDEFINITIONCOMPLEXREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeValueEmbeddedFileDefinitionImpl <em>Attribute Value Embedded File Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeValueEmbeddedFileDefinitionImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueEmbeddedFileDefinition()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_EMBEDDED_FILE_DEFINITION = eINSTANCE
				.getAttributeValueEmbeddedFileDefinition();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEXREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_EMBEDDED_FILE_DEFINITION__ATTRIBUTEDEFINITIONCOMPLEXREF = eINSTANCE
				.getAttributeValueEmbeddedFileDefinition_ATTRIBUTEDEFINITIONCOMPLEXREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeValueSimpleDefinitionImpl <em>Attribute Value Simple Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeValueSimpleDefinitionImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueSimpleDefinition()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_SIMPLE_DEFINITION = eINSTANCE
				.getAttributeValueSimpleDefinition();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONSIMPLEREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_SIMPLE_DEFINITION__ATTRIBUTEDEFINITIONSIMPLEREF = eINSTANCE
				.getAttributeValueSimpleDefinition_ATTRIBUTEDEFINITIONSIMPLEREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeValueEnumerationDefinitionImpl <em>Attribute Value Enumeration Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeValueEnumerationDefinitionImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueEnumerationDefinition()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_ENUMERATION_DEFINITION = eINSTANCE
				.getAttributeValueEnumerationDefinition();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONENUMERATIONREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_ENUMERATION_DEFINITION__ATTRIBUTEDEFINITIONENUMERATIONREF = eINSTANCE
				.getAttributeValueEnumerationDefinition_ATTRIBUTEDEFINITIONENUMERATIONREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeValueXmlDataDefinitionImpl <em>Attribute Value Xml Data Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeValueXmlDataDefinitionImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueXmlDataDefinition()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_XML_DATA_DEFINITION = eINSTANCE
				.getAttributeValueXmlDataDefinition();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEXREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_XML_DATA_DEFINITION__ATTRIBUTEDEFINITIONCOMPLEXREF = eINSTANCE
				.getAttributeValueXmlDataDefinition_ATTRIBUTEDEFINITIONCOMPLEXREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.DocumentRootImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE
				.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE
				.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>ACCESSPOLICY</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ACCESSPOLICY = eINSTANCE
				.getDocumentRoot_ACCESSPOLICY();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEX</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ATTRIBUTEDEFINITIONCOMPLEX = eINSTANCE
				.getDocumentRoot_ATTRIBUTEDEFINITIONCOMPLEX();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONENUMERATION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ATTRIBUTEDEFINITIONENUMERATION = eINSTANCE
				.getDocumentRoot_ATTRIBUTEDEFINITIONENUMERATION();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONSIMPLE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ATTRIBUTEDEFINITIONSIMPLE = eINSTANCE
				.getDocumentRoot_ATTRIBUTEDEFINITIONSIMPLE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDDOCUMENT = eINSTANCE
				.getDocumentRoot_ATTRIBUTEVALUEEMBEDDEDDOCUMENT();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDFILE = eINSTANCE
				.getDocumentRoot_ATTRIBUTEVALUEEMBEDDEDFILE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ATTRIBUTEVALUEENUMERATION = eINSTANCE
				.getDocumentRoot_ATTRIBUTEVALUEENUMERATION();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEFILEREFERENCE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ATTRIBUTEVALUEFILEREFERENCE = eINSTANCE
				.getDocumentRoot_ATTRIBUTEVALUEFILEREFERENCE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUESIMPLE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ATTRIBUTEVALUESIMPLE = eINSTANCE
				.getDocumentRoot_ATTRIBUTEVALUESIMPLE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ATTRIBUTEVALUEXMLDATA = eINSTANCE
				.getDocumentRoot_ATTRIBUTEVALUEXMLDATA();

		/**
		 * The meta object literal for the '<em><b>BINARYCONTENT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BINARYCONTENT = eINSTANCE
				.getDocumentRoot_BINARYCONTENT();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONBINARYFILE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATATYPEDEFINITIONBINARYFILE = eINSTANCE
				.getDocumentRoot_DATATYPEDEFINITIONBINARYFILE();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONBOOLEAN</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATATYPEDEFINITIONBOOLEAN = eINSTANCE
				.getDocumentRoot_DATATYPEDEFINITIONBOOLEAN();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONDOCUMENT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATATYPEDEFINITIONDOCUMENT = eINSTANCE
				.getDocumentRoot_DATATYPEDEFINITIONDOCUMENT();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONENUMERATION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATATYPEDEFINITIONENUMERATION = eINSTANCE
				.getDocumentRoot_DATATYPEDEFINITIONENUMERATION();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONINTEGER</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATATYPEDEFINITIONINTEGER = eINSTANCE
				.getDocumentRoot_DATATYPEDEFINITIONINTEGER();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONREAL</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATATYPEDEFINITIONREAL = eINSTANCE
				.getDocumentRoot_DATATYPEDEFINITIONREAL();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONSTRING</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATATYPEDEFINITIONSTRING = eINSTANCE
				.getDocumentRoot_DATATYPEDEFINITIONSTRING();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONXMLDATA</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATATYPEDEFINITIONXMLDATA = eINSTANCE
				.getDocumentRoot_DATATYPEDEFINITIONXMLDATA();

		/**
		 * The meta object literal for the '<em><b>EMBEDDEDVALUE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EMBEDDEDVALUE = eINSTANCE
				.getDocumentRoot_EMBEDDEDVALUE();

		/**
		 * The meta object literal for the '<em><b>ENUMVALUE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENUMVALUE = eINSTANCE
				.getDocumentRoot_ENUMVALUE();

		/**
		 * The meta object literal for the '<em><b>RELATIONGROUP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RELATIONGROUP = eINSTANCE
				.getDocumentRoot_RELATIONGROUP();

		/**
		 * The meta object literal for the '<em><b>RIF</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RIF = eINSTANCE.getDocumentRoot_RIF();

		/**
		 * The meta object literal for the '<em><b>SPECGROUP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPECGROUP = eINSTANCE
				.getDocumentRoot_SPECGROUP();

		/**
		 * The meta object literal for the '<em><b>SPECHIERARCHY</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPECHIERARCHY = eINSTANCE
				.getDocumentRoot_SPECHIERARCHY();

		/**
		 * The meta object literal for the '<em><b>SPECHIERARCHYROOT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPECHIERARCHYROOT = eINSTANCE
				.getDocumentRoot_SPECHIERARCHYROOT();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPECOBJECT = eINSTANCE
				.getDocumentRoot_SPECOBJECT();

		/**
		 * The meta object literal for the '<em><b>SPECRELATION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPECRELATION = eINSTANCE
				.getDocumentRoot_SPECRELATION();

		/**
		 * The meta object literal for the '<em><b>SPECTYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPECTYPE = eINSTANCE
				.getDocumentRoot_SPECTYPE();

		/**
		 * The meta object literal for the '<em><b>XHTMLCONTENT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XHTMLCONTENT = eINSTANCE
				.getDocumentRoot_XHTMLCONTENT();

		/**
		 * The meta object literal for the '<em><b>XMLCONTENT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLCONTENT = eINSTANCE
				.getDocumentRoot_XMLCONTENT();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ID = eINSTANCE.getDocumentRoot_ID();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.EmbeddedValueImpl <em>Embedded Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.EmbeddedValueImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getEmbeddedValue()
		 * @generated
		 */
		EClass EMBEDDED_VALUE = eINSTANCE.getEmbeddedValue();

		/**
		 * The meta object literal for the '<em><b>KEY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDED_VALUE__KEY = eINSTANCE.getEmbeddedValue_KEY();

		/**
		 * The meta object literal for the '<em><b>OTHERCONTENT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDED_VALUE__OTHERCONTENT = eINSTANCE
				.getEmbeddedValue_OTHERCONTENT();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.EnumValueImpl <em>Enum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.EnumValueImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getEnumValue()
		 * @generated
		 */
		EClass ENUM_VALUE = eINSTANCE.getEnumValue();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_VALUE__LONGNAME = eINSTANCE.getEnumValue_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_VALUE__DESC = eINSTANCE.getEnumValue_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_VALUE__IDENTIFIER = eINSTANCE.getEnumValue_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_VALUE__LASTCHANGE = eINSTANCE.getEnumValue_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>PROPERTIES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_VALUE__PROPERTIES = eINSTANCE.getEnumValue_PROPERTIES();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.ObjectImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECTREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__SPECOBJECTREF = eINSTANCE.getObject_SPECOBJECTREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.PropertiesImpl <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.PropertiesImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getProperties()
		 * @generated
		 */
		EClass PROPERTIES = eINSTANCE.getProperties();

		/**
		 * The meta object literal for the '<em><b>EMBEDDEDVALUE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES__EMBEDDEDVALUE = eINSTANCE
				.getProperties_EMBEDDEDVALUE();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.SpecGroupRelationGroupsImpl <em>Spec Group Relation Groups</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.SpecGroupRelationGroupsImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecGroupRelationGroups()
		 * @generated
		 */
		EClass SPEC_GROUP_RELATION_GROUPS = eINSTANCE
				.getSpecGroupRelationGroups();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_GROUP_RELATION_GROUPS__GROUP = eINSTANCE
				.getSpecGroupRelationGroups_Group();

		/**
		 * The meta object literal for the '<em><b>RELATIONGROUP</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_GROUP_RELATION_GROUPS__RELATIONGROUP = eINSTANCE
				.getSpecGroupRelationGroups_RELATIONGROUP();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AccessPolicyRelationGroupsImpl <em>Access Policy Relation Groups</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AccessPolicyRelationGroupsImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAccessPolicyRelationGroups()
		 * @generated
		 */
		EClass ACCESS_POLICY_RELATION_GROUPS = eINSTANCE
				.getAccessPolicyRelationGroups();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_POLICY_RELATION_GROUPS__GROUP = eINSTANCE
				.getAccessPolicyRelationGroups_Group();

		/**
		 * The meta object literal for the '<em><b>RELATIONGROUPREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_POLICY_RELATION_GROUPS__RELATIONGROUPREF = eINSTANCE
				.getAccessPolicyRelationGroups_RELATIONGROUPREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.RelationGroupImpl <em>Relation Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.RelationGroupImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getRelationGroup()
		 * @generated
		 */
		EClass RELATION_GROUP = eINSTANCE.getRelationGroup();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_GROUP__LONGNAME = eINSTANCE
				.getRelationGroup_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_GROUP__DESC = eINSTANCE.getRelationGroup_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_GROUP__IDENTIFIER = eINSTANCE
				.getRelationGroup_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_GROUP__LASTCHANGE = eINSTANCE
				.getRelationGroup_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>RELATIONTYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_GROUP__RELATIONTYPE = eINSTANCE
				.getRelationGroup_RELATIONTYPE();

		/**
		 * The meta object literal for the '<em><b>SPECRELATIONS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_GROUP__SPECRELATIONS = eINSTANCE
				.getRelationGroup_SPECRELATIONS();

		/**
		 * The meta object literal for the '<em><b>TARGETGROUP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_GROUP__TARGETGROUP = eINSTANCE
				.getRelationGroup_TARGETGROUP();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.RelationTypeImpl <em>Relation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.RelationTypeImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getRelationType()
		 * @generated
		 */
		EClass RELATION_TYPE = eINSTANCE.getRelationType();

		/**
		 * The meta object literal for the '<em><b>SPECTYPEREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_TYPE__SPECTYPEREF = eINSTANCE
				.getRelationType_SPECTYPEREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.RifImpl <em>Rif</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.RifImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getRif()
		 * @generated
		 */
		EClass RIF = eINSTANCE.getRif();

		/**
		 * The meta object literal for the '<em><b>SPECHIERARCHYROOTS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF__SPECHIERARCHYROOTS = eINSTANCE
				.getRif_SPECHIERARCHYROOTS();

		/**
		 * The meta object literal for the '<em><b>ACCESSPOLICIES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF__ACCESSPOLICIES = eINSTANCE.getRif_ACCESSPOLICIES();

		/**
		 * The meta object literal for the '<em><b>AUTHOR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF__AUTHOR = eINSTANCE.getRif_AUTHOR();

		/**
		 * The meta object literal for the '<em><b>COMMENT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF__COMMENT = eINSTANCE.getRif_COMMENT();

		/**
		 * The meta object literal for the '<em><b>COUNTRYCODE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF__COUNTRYCODE = eINSTANCE.getRif_COUNTRYCODE();

		/**
		 * The meta object literal for the '<em><b>CREATIONTIME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF__CREATIONTIME = eINSTANCE.getRif_CREATIONTIME();

		/**
		 * The meta object literal for the '<em><b>DATATYPES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF__DATATYPES = eINSTANCE.getRif_DATATYPES();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF__IDENTIFIER = eINSTANCE.getRif_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>SOURCETOOLID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF__SOURCETOOLID = eINSTANCE.getRif_SOURCETOOLID();

		/**
		 * The meta object literal for the '<em><b>SPECGROUPS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF__SPECGROUPS = eINSTANCE.getRif_SPECGROUPS();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECTS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF__SPECOBJECTS = eINSTANCE.getRif_SPECOBJECTS();

		/**
		 * The meta object literal for the '<em><b>SPECRELATIONS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF__SPECRELATIONS = eINSTANCE.getRif_SPECRELATIONS();

		/**
		 * The meta object literal for the '<em><b>SPECTYPES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF__SPECTYPES = eINSTANCE.getRif_SPECTYPES();

		/**
		 * The meta object literal for the '<em><b>TITLE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF__TITLE = eINSTANCE.getRif_TITLE();

		/**
		 * The meta object literal for the '<em><b>VERSION</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF__VERSION = eINSTANCE.getRif_VERSION();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.SourceImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECTREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__SPECOBJECTREF = eINSTANCE.getSource_SPECOBJECTREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.SpecAttributesImpl <em>Spec Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.SpecAttributesImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecAttributes()
		 * @generated
		 */
		EClass SPEC_ATTRIBUTES = eINSTANCE.getSpecAttributes();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_ATTRIBUTES__GROUP = eINSTANCE.getSpecAttributes_Group();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEX</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONCOMPLEX = eINSTANCE
				.getSpecAttributes_ATTRIBUTEDEFINITIONCOMPLEX();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONENUMERATION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONENUMERATION = eINSTANCE
				.getSpecAttributes_ATTRIBUTEDEFINITIONENUMERATION();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONSIMPLE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONSIMPLE = eINSTANCE
				.getSpecAttributes_ATTRIBUTEDEFINITIONSIMPLE();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.RifSpecGroupsImpl <em>Spec Groups</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.RifSpecGroupsImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getRifSpecGroups()
		 * @generated
		 */
		EClass RIF_SPEC_GROUPS = eINSTANCE.getRifSpecGroups();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF_SPEC_GROUPS__GROUP = eINSTANCE.getRifSpecGroups_Group();

		/**
		 * The meta object literal for the '<em><b>SPECGROUP</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF_SPEC_GROUPS__SPECGROUP = eINSTANCE
				.getRifSpecGroups_SPECGROUP();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AccessPolicySpecGroupsImpl <em>Access Policy Spec Groups</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AccessPolicySpecGroupsImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAccessPolicySpecGroups()
		 * @generated
		 */
		EClass ACCESS_POLICY_SPEC_GROUPS = eINSTANCE
				.getAccessPolicySpecGroups();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_POLICY_SPEC_GROUPS__GROUP = eINSTANCE
				.getAccessPolicySpecGroups_Group();

		/**
		 * The meta object literal for the '<em><b>SPECGROUPREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_POLICY_SPEC_GROUPS__SPECGROUPREF = eINSTANCE
				.getAccessPolicySpecGroups_SPECGROUPREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.SpecGroupImpl <em>Spec Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.SpecGroupImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecGroup()
		 * @generated
		 */
		EClass SPEC_GROUP = eINSTANCE.getSpecGroup();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_GROUP__LONGNAME = eINSTANCE.getSpecGroup_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_GROUP__DESC = eINSTANCE.getSpecGroup_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_GROUP__IDENTIFIER = eINSTANCE.getSpecGroup_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_GROUP__LASTCHANGE = eINSTANCE.getSpecGroup_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>RELATIONGROUPS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_GROUP__RELATIONGROUPS = eINSTANCE
				.getSpecGroup_RELATIONGROUPS();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECTS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_GROUP__SPECOBJECTS = eINSTANCE
				.getSpecGroup_SPECOBJECTS();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_GROUP__TYPE = eINSTANCE.getSpecGroup_TYPE();

		/**
		 * The meta object literal for the '<em><b>VALUES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_GROUP__VALUES = eINSTANCE.getSpecGroup_VALUES();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.SpecHierarchiesImpl <em>Spec Hierarchies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.SpecHierarchiesImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecHierarchies()
		 * @generated
		 */
		EClass SPEC_HIERARCHIES = eINSTANCE.getSpecHierarchies();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_HIERARCHIES__GROUP = eINSTANCE
				.getSpecHierarchies_Group();

		/**
		 * The meta object literal for the '<em><b>SPECHIERARCHYREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_HIERARCHIES__SPECHIERARCHYREF = eINSTANCE
				.getSpecHierarchies_SPECHIERARCHYREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.RifSpecHierarchyRootsImpl <em>Spec Hierarchy Roots</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.RifSpecHierarchyRootsImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getRifSpecHierarchyRoots()
		 * @generated
		 */
		EClass RIF_SPEC_HIERARCHY_ROOTS = eINSTANCE.getRifSpecHierarchyRoots();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF_SPEC_HIERARCHY_ROOTS__GROUP = eINSTANCE
				.getRifSpecHierarchyRoots_Group();

		/**
		 * The meta object literal for the '<em><b>SPECHIERARCHYROOT</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF_SPEC_HIERARCHY_ROOTS__SPECHIERARCHYROOT = eINSTANCE
				.getRifSpecHierarchyRoots_SPECHIERARCHYROOT();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AccessPolicySpecHierarchyRootsImpl <em>Access Policy Spec Hierarchy Roots</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AccessPolicySpecHierarchyRootsImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAccessPolicySpecHierarchyRoots()
		 * @generated
		 */
		EClass ACCESS_POLICY_SPEC_HIERARCHY_ROOTS = eINSTANCE
				.getAccessPolicySpecHierarchyRoots();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_POLICY_SPEC_HIERARCHY_ROOTS__GROUP = eINSTANCE
				.getAccessPolicySpecHierarchyRoots_Group();

		/**
		 * The meta object literal for the '<em><b>SPECHIERARCHYROOTREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_POLICY_SPEC_HIERARCHY_ROOTS__SPECHIERARCHYROOTREF = eINSTANCE
				.getAccessPolicySpecHierarchyRoots_SPECHIERARCHYROOTREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.SpecHierarchyRootImpl <em>Spec Hierarchy Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.SpecHierarchyRootImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecHierarchyRoot()
		 * @generated
		 */
		EClass SPEC_HIERARCHY_ROOT = eINSTANCE.getSpecHierarchyRoot();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_HIERARCHY_ROOT__LONGNAME = eINSTANCE
				.getSpecHierarchyRoot_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_HIERARCHY_ROOT__DESC = eINSTANCE
				.getSpecHierarchyRoot_DESC();

		/**
		 * The meta object literal for the '<em><b>CHILDREN</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_HIERARCHY_ROOT__CHILDREN = eINSTANCE
				.getSpecHierarchyRoot_CHILDREN();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_HIERARCHY_ROOT__IDENTIFIER = eINSTANCE
				.getSpecHierarchyRoot_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_HIERARCHY_ROOT__LASTCHANGE = eINSTANCE
				.getSpecHierarchyRoot_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_HIERARCHY_ROOT__TYPE = eINSTANCE
				.getSpecHierarchyRoot_TYPE();

		/**
		 * The meta object literal for the '<em><b>VALUES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_HIERARCHY_ROOT__VALUES = eINSTANCE
				.getSpecHierarchyRoot_VALUES();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.SpecHierarchyImpl <em>Spec Hierarchy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.SpecHierarchyImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecHierarchy()
		 * @generated
		 */
		EClass SPEC_HIERARCHY = eINSTANCE.getSpecHierarchy();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_HIERARCHY__LONGNAME = eINSTANCE
				.getSpecHierarchy_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_HIERARCHY__DESC = eINSTANCE.getSpecHierarchy_DESC();

		/**
		 * The meta object literal for the '<em><b>CHILDREN</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_HIERARCHY__CHILDREN = eINSTANCE
				.getSpecHierarchy_CHILDREN();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_HIERARCHY__IDENTIFIER = eINSTANCE
				.getSpecHierarchy_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_HIERARCHY__LASTCHANGE = eINSTANCE
				.getSpecHierarchy_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>OBJECT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_HIERARCHY__OBJECT = eINSTANCE.getSpecHierarchy_OBJECT();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.SpecifiedValuesImpl <em>Specified Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.SpecifiedValuesImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecifiedValues()
		 * @generated
		 */
		EClass SPECIFIED_VALUES = eINSTANCE.getSpecifiedValues();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFIED_VALUES__GROUP = eINSTANCE
				.getSpecifiedValues_Group();

		/**
		 * The meta object literal for the '<em><b>ENUMVALUE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIED_VALUES__ENUMVALUE = eINSTANCE
				.getSpecifiedValues_ENUMVALUE();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.SpecGroupSpecObjectsImpl <em>Spec Group Spec Objects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.SpecGroupSpecObjectsImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecGroupSpecObjects()
		 * @generated
		 */
		EClass SPEC_GROUP_SPEC_OBJECTS = eINSTANCE.getSpecGroupSpecObjects();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_GROUP_SPEC_OBJECTS__GROUP = eINSTANCE
				.getSpecGroupSpecObjects_Group();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECTREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_GROUP_SPEC_OBJECTS__SPECOBJECTREF = eINSTANCE
				.getSpecGroupSpecObjects_SPECOBJECTREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.RifSpecObjectsImpl <em>Spec Objects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.RifSpecObjectsImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getRifSpecObjects()
		 * @generated
		 */
		EClass RIF_SPEC_OBJECTS = eINSTANCE.getRifSpecObjects();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF_SPEC_OBJECTS__GROUP = eINSTANCE
				.getRifSpecObjects_Group();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECT</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF_SPEC_OBJECTS__SPECOBJECT = eINSTANCE
				.getRifSpecObjects_SPECOBJECT();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AccessPolicySpecObjectsImpl <em>Access Policy Spec Objects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AccessPolicySpecObjectsImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAccessPolicySpecObjects()
		 * @generated
		 */
		EClass ACCESS_POLICY_SPEC_OBJECTS = eINSTANCE
				.getAccessPolicySpecObjects();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_POLICY_SPEC_OBJECTS__GROUP = eINSTANCE
				.getAccessPolicySpecObjects_Group();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECTREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_POLICY_SPEC_OBJECTS__SPECOBJECTREF = eINSTANCE
				.getAccessPolicySpecObjects_SPECOBJECTREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.SpecObjectImpl <em>Spec Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.SpecObjectImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecObject()
		 * @generated
		 */
		EClass SPEC_OBJECT = eINSTANCE.getSpecObject();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_OBJECT__LONGNAME = eINSTANCE.getSpecObject_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_OBJECT__DESC = eINSTANCE.getSpecObject_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_OBJECT__IDENTIFIER = eINSTANCE
				.getSpecObject_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_OBJECT__LASTCHANGE = eINSTANCE
				.getSpecObject_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_OBJECT__TYPE = eINSTANCE.getSpecObject_TYPE();

		/**
		 * The meta object literal for the '<em><b>VALUES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_OBJECT__VALUES = eINSTANCE.getSpecObject_VALUES();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.RifSpecRelationsImpl <em>Spec Relations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.RifSpecRelationsImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getRifSpecRelations()
		 * @generated
		 */
		EClass RIF_SPEC_RELATIONS = eINSTANCE.getRifSpecRelations();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF_SPEC_RELATIONS__GROUP = eINSTANCE
				.getRifSpecRelations_Group();

		/**
		 * The meta object literal for the '<em><b>SPECRELATION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF_SPEC_RELATIONS__SPECRELATION = eINSTANCE
				.getRifSpecRelations_SPECRELATION();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.RelationGroupSpecRelationsImpl <em>Relation Group Spec Relations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.RelationGroupSpecRelationsImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getRelationGroupSpecRelations()
		 * @generated
		 */
		EClass RELATION_GROUP_SPEC_RELATIONS = eINSTANCE
				.getRelationGroupSpecRelations();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_GROUP_SPEC_RELATIONS__GROUP = eINSTANCE
				.getRelationGroupSpecRelations_Group();

		/**
		 * The meta object literal for the '<em><b>SPECRELATIONREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_GROUP_SPEC_RELATIONS__SPECRELATIONREF = eINSTANCE
				.getRelationGroupSpecRelations_SPECRELATIONREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AccessPolicySpecRelationsImpl <em>Access Policy Spec Relations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AccessPolicySpecRelationsImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAccessPolicySpecRelations()
		 * @generated
		 */
		EClass ACCESS_POLICY_SPEC_RELATIONS = eINSTANCE
				.getAccessPolicySpecRelations();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_POLICY_SPEC_RELATIONS__GROUP = eINSTANCE
				.getAccessPolicySpecRelations_Group();

		/**
		 * The meta object literal for the '<em><b>SPECRELATIONREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_POLICY_SPEC_RELATIONS__SPECRELATIONREF = eINSTANCE
				.getAccessPolicySpecRelations_SPECRELATIONREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.SpecRelationImpl <em>Spec Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.SpecRelationImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecRelation()
		 * @generated
		 */
		EClass SPEC_RELATION = eINSTANCE.getSpecRelation();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_RELATION__LONGNAME = eINSTANCE
				.getSpecRelation_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_RELATION__DESC = eINSTANCE.getSpecRelation_DESC();

		/**
		 * The meta object literal for the '<em><b>SOURCE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_RELATION__SOURCE = eINSTANCE.getSpecRelation_SOURCE();

		/**
		 * The meta object literal for the '<em><b>TARGET</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_RELATION__TARGET = eINSTANCE.getSpecRelation_TARGET();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_RELATION__IDENTIFIER = eINSTANCE
				.getSpecRelation_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_RELATION__LASTCHANGE = eINSTANCE
				.getSpecRelation_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_RELATION__TYPE = eINSTANCE.getSpecRelation_TYPE();

		/**
		 * The meta object literal for the '<em><b>VALUES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_RELATION__VALUES = eINSTANCE.getSpecRelation_VALUES();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.RifSpecTypesImpl <em>Spec Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.RifSpecTypesImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getRifSpecTypes()
		 * @generated
		 */
		EClass RIF_SPEC_TYPES = eINSTANCE.getRifSpecTypes();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF_SPEC_TYPES__GROUP = eINSTANCE.getRifSpecTypes_Group();

		/**
		 * The meta object literal for the '<em><b>SPECTYPE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF_SPEC_TYPES__SPECTYPE = eINSTANCE
				.getRifSpecTypes_SPECTYPE();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AccessPolicySpecTypesImpl <em>Access Policy Spec Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AccessPolicySpecTypesImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAccessPolicySpecTypes()
		 * @generated
		 */
		EClass ACCESS_POLICY_SPEC_TYPES = eINSTANCE.getAccessPolicySpecTypes();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_POLICY_SPEC_TYPES__GROUP = eINSTANCE
				.getAccessPolicySpecTypes_Group();

		/**
		 * The meta object literal for the '<em><b>SPECTYPEREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_POLICY_SPEC_TYPES__SPECTYPEREF = eINSTANCE
				.getAccessPolicySpecTypes_SPECTYPEREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.SpecTypeImpl <em>Spec Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.SpecTypeImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecType()
		 * @generated
		 */
		EClass SPEC_TYPE = eINSTANCE.getSpecType();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_TYPE__LONGNAME = eINSTANCE.getSpecType_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_TYPE__DESC = eINSTANCE.getSpecType_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_TYPE__IDENTIFIER = eINSTANCE.getSpecType_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_TYPE__LASTCHANGE = eINSTANCE.getSpecType_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>SPECATTRIBUTES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_TYPE__SPECATTRIBUTES = eINSTANCE
				.getSpecType_SPECATTRIBUTES();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_TYPE__ID = eINSTANCE.getSpecType_ID();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.TargetGroupImpl <em>Target Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.TargetGroupImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getTargetGroup()
		 * @generated
		 */
		EClass TARGET_GROUP = eINSTANCE.getTargetGroup();

		/**
		 * The meta object literal for the '<em><b>SPECGROUPREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_GROUP__SPECGROUPREF = eINSTANCE
				.getTargetGroup_SPECGROUPREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.TargetImpl <em>Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.TargetImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getTarget()
		 * @generated
		 */
		EClass TARGET = eINSTANCE.getTarget();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECTREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__SPECOBJECTREF = eINSTANCE.getTarget_SPECOBJECTREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeDefinitionSimpleTypeImpl <em>Attribute Definition Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeDefinitionSimpleTypeImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeDefinitionSimpleType()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION_SIMPLE_TYPE = eINSTANCE
				.getAttributeDefinitionSimpleType();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONBOOLEANREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONBOOLEANREF = eINSTANCE
				.getAttributeDefinitionSimpleType_DATATYPEDEFINITIONBOOLEANREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONINTEGERREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONINTEGERREF = eINSTANCE
				.getAttributeDefinitionSimpleType_DATATYPEDEFINITIONINTEGERREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONREALREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONREALREF = eINSTANCE
				.getAttributeDefinitionSimpleType_DATATYPEDEFINITIONREALREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONSTRINGREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONSTRINGREF = eINSTANCE
				.getAttributeDefinitionSimpleType_DATATYPEDEFINITIONSTRINGREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.SpecRelationTypeImpl <em>Spec Relation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.SpecRelationTypeImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecRelationType()
		 * @generated
		 */
		EClass SPEC_RELATION_TYPE = eINSTANCE.getSpecRelationType();

		/**
		 * The meta object literal for the '<em><b>SPECTYPEREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_RELATION_TYPE__SPECTYPEREF = eINSTANCE
				.getSpecRelationType_SPECTYPEREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeDefinitionEnumerationTypeImpl <em>Attribute Definition Enumeration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeDefinitionEnumerationTypeImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeDefinitionEnumerationType()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION_ENUMERATION_TYPE = eINSTANCE
				.getAttributeDefinitionEnumerationType();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONENUMERATIONREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_ENUMERATION_TYPE__DATATYPEDEFINITIONENUMERATIONREF = eINSTANCE
				.getAttributeDefinitionEnumerationType_DATATYPEDEFINITIONENUMERATIONREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.SpecObjectTypeImpl <em>Spec Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.SpecObjectTypeImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecObjectType()
		 * @generated
		 */
		EClass SPEC_OBJECT_TYPE = eINSTANCE.getSpecObjectType();

		/**
		 * The meta object literal for the '<em><b>SPECTYPEREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_OBJECT_TYPE__SPECTYPEREF = eINSTANCE
				.getSpecObjectType_SPECTYPEREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.SpecHierarchyRootTypeImpl <em>Spec Hierarchy Root Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.SpecHierarchyRootTypeImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecHierarchyRootType()
		 * @generated
		 */
		EClass SPEC_HIERARCHY_ROOT_TYPE = eINSTANCE.getSpecHierarchyRootType();

		/**
		 * The meta object literal for the '<em><b>SPECTYPEREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_HIERARCHY_ROOT_TYPE__SPECTYPEREF = eINSTANCE
				.getSpecHierarchyRootType_SPECTYPEREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.SpecGroupTypeImpl <em>Spec Group Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.SpecGroupTypeImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecGroupType()
		 * @generated
		 */
		EClass SPEC_GROUP_TYPE = eINSTANCE.getSpecGroupType();

		/**
		 * The meta object literal for the '<em><b>SPECTYPEREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_GROUP_TYPE__SPECTYPEREF = eINSTANCE
				.getSpecGroupType_SPECTYPEREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeDefinitionComplexTypeImpl <em>Attribute Definition Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeDefinitionComplexTypeImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeDefinitionComplexType()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION_COMPLEX_TYPE = eINSTANCE
				.getAttributeDefinitionComplexType();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONBINARYFILEREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_COMPLEX_TYPE__DATATYPEDEFINITIONBINARYFILEREF = eINSTANCE
				.getAttributeDefinitionComplexType_DATATYPEDEFINITIONBINARYFILEREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONDOCUMENTREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_COMPLEX_TYPE__DATATYPEDEFINITIONDOCUMENTREF = eINSTANCE
				.getAttributeDefinitionComplexType_DATATYPEDEFINITIONDOCUMENTREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONXMLDATAREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_COMPLEX_TYPE__DATATYPEDEFINITIONXMLDATAREF = eINSTANCE
				.getAttributeDefinitionComplexType_DATATYPEDEFINITIONXMLDATAREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.SpecObjectValuesImpl <em>Spec Object Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.SpecObjectValuesImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecObjectValues()
		 * @generated
		 */
		EClass SPEC_OBJECT_VALUES = eINSTANCE.getSpecObjectValues();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_OBJECT_VALUES__GROUP = eINSTANCE
				.getSpecObjectValues_Group();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_OBJECT_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENT = eINSTANCE
				.getSpecObjectValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENT();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_OBJECT_VALUES__ATTRIBUTEVALUEEMBEDDEDFILE = eINSTANCE
				.getSpecObjectValues_ATTRIBUTEVALUEEMBEDDEDFILE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_OBJECT_VALUES__ATTRIBUTEVALUEENUMERATION = eINSTANCE
				.getSpecObjectValues_ATTRIBUTEVALUEENUMERATION();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEFILEREFERENCE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_OBJECT_VALUES__ATTRIBUTEVALUEFILEREFERENCE = eINSTANCE
				.getSpecObjectValues_ATTRIBUTEVALUEFILEREFERENCE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUESIMPLE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_OBJECT_VALUES__ATTRIBUTEVALUESIMPLE = eINSTANCE
				.getSpecObjectValues_ATTRIBUTEVALUESIMPLE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_OBJECT_VALUES__ATTRIBUTEVALUEXMLDATA = eINSTANCE
				.getSpecObjectValues_ATTRIBUTEVALUEXMLDATA();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.SpecRelationValuesImpl <em>Spec Relation Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.SpecRelationValuesImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecRelationValues()
		 * @generated
		 */
		EClass SPEC_RELATION_VALUES = eINSTANCE.getSpecRelationValues();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_RELATION_VALUES__GROUP = eINSTANCE
				.getSpecRelationValues_Group();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_RELATION_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENT = eINSTANCE
				.getSpecRelationValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENT();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_RELATION_VALUES__ATTRIBUTEVALUEEMBEDDEDFILE = eINSTANCE
				.getSpecRelationValues_ATTRIBUTEVALUEEMBEDDEDFILE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_RELATION_VALUES__ATTRIBUTEVALUEENUMERATION = eINSTANCE
				.getSpecRelationValues_ATTRIBUTEVALUEENUMERATION();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEFILEREFERENCE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_RELATION_VALUES__ATTRIBUTEVALUEFILEREFERENCE = eINSTANCE
				.getSpecRelationValues_ATTRIBUTEVALUEFILEREFERENCE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUESIMPLE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_RELATION_VALUES__ATTRIBUTEVALUESIMPLE = eINSTANCE
				.getSpecRelationValues_ATTRIBUTEVALUESIMPLE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_RELATION_VALUES__ATTRIBUTEVALUEXMLDATA = eINSTANCE
				.getSpecRelationValues_ATTRIBUTEVALUEXMLDATA();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.SpecGroupValuesImpl <em>Spec Group Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.SpecGroupValuesImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecGroupValues()
		 * @generated
		 */
		EClass SPEC_GROUP_VALUES = eINSTANCE.getSpecGroupValues();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_GROUP_VALUES__GROUP = eINSTANCE
				.getSpecGroupValues_Group();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_GROUP_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENT = eINSTANCE
				.getSpecGroupValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENT();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_GROUP_VALUES__ATTRIBUTEVALUEEMBEDDEDFILE = eINSTANCE
				.getSpecGroupValues_ATTRIBUTEVALUEEMBEDDEDFILE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_GROUP_VALUES__ATTRIBUTEVALUEENUMERATION = eINSTANCE
				.getSpecGroupValues_ATTRIBUTEVALUEENUMERATION();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEFILEREFERENCE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_GROUP_VALUES__ATTRIBUTEVALUEFILEREFERENCE = eINSTANCE
				.getSpecGroupValues_ATTRIBUTEVALUEFILEREFERENCE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUESIMPLE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_GROUP_VALUES__ATTRIBUTEVALUESIMPLE = eINSTANCE
				.getSpecGroupValues_ATTRIBUTEVALUESIMPLE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_GROUP_VALUES__ATTRIBUTEVALUEXMLDATA = eINSTANCE
				.getSpecGroupValues_ATTRIBUTEVALUEXMLDATA();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.SpecHierarchyRootValuesImpl <em>Spec Hierarchy Root Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.SpecHierarchyRootValuesImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSpecHierarchyRootValues()
		 * @generated
		 */
		EClass SPEC_HIERARCHY_ROOT_VALUES = eINSTANCE
				.getSpecHierarchyRootValues();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_HIERARCHY_ROOT_VALUES__GROUP = eINSTANCE
				.getSpecHierarchyRootValues_Group();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_HIERARCHY_ROOT_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENT = eINSTANCE
				.getSpecHierarchyRootValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENT();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_HIERARCHY_ROOT_VALUES__ATTRIBUTEVALUEEMBEDDEDFILE = eINSTANCE
				.getSpecHierarchyRootValues_ATTRIBUTEVALUEEMBEDDEDFILE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_HIERARCHY_ROOT_VALUES__ATTRIBUTEVALUEENUMERATION = eINSTANCE
				.getSpecHierarchyRootValues_ATTRIBUTEVALUEENUMERATION();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEFILEREFERENCE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_HIERARCHY_ROOT_VALUES__ATTRIBUTEVALUEFILEREFERENCE = eINSTANCE
				.getSpecHierarchyRootValues_ATTRIBUTEVALUEFILEREFERENCE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUESIMPLE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_HIERARCHY_ROOT_VALUES__ATTRIBUTEVALUESIMPLE = eINSTANCE
				.getSpecHierarchyRootValues_ATTRIBUTEVALUESIMPLE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_HIERARCHY_ROOT_VALUES__ATTRIBUTEVALUEXMLDATA = eINSTANCE
				.getSpecHierarchyRootValues_ATTRIBUTEVALUEXMLDATA();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeValueEnumerationValuesImpl <em>Attribute Value Enumeration Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeValueEnumerationValuesImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueEnumerationValues()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_ENUMERATION_VALUES = eINSTANCE
				.getAttributeValueEnumerationValues();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_ENUMERATION_VALUES__GROUP = eINSTANCE
				.getAttributeValueEnumerationValues_Group();

		/**
		 * The meta object literal for the '<em><b>ENUMVALUEREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_ENUMERATION_VALUES__ENUMVALUEREF = eINSTANCE
				.getAttributeValueEnumerationValues_ENUMVALUEREF();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.XhtmlContentImpl <em>Xhtml Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.XhtmlContentImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getXhtmlContent()
		 * @generated
		 */
		EClass XHTML_CONTENT = eINSTANCE.getXhtmlContent();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeValueEmbeddedDocumentXhtmlContentImpl <em>Attribute Value Embedded Document Xhtml Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeValueEmbeddedDocumentXhtmlContentImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueEmbeddedDocumentXhtmlContent()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT_XHTML_CONTENT = eINSTANCE
				.getAttributeValueEmbeddedDocumentXhtmlContent();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT_XHTML_CONTENT__ANY = eINSTANCE
				.getAttributeValueEmbeddedDocumentXhtmlContent_Any();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.XmlContentXmlContentImpl <em>Xml Content Xml Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.XmlContentXmlContentImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getXmlContentXmlContent()
		 * @generated
		 */
		EClass XML_CONTENT_XML_CONTENT = eINSTANCE.getXmlContentXmlContent();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.internal.AttributeValueXmlDataXmlContentImpl <em>Attribute Value Xml Data Xml Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.AttributeValueXmlDataXmlContentImpl
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getAttributeValueXmlDataXmlContent()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_XML_DATA_XML_CONTENT = eINSTANCE
				.getAttributeValueXmlDataXmlContent();

		/**
		 * The meta object literal for the '<em><b>XMLCONTENT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_XML_DATA_XML_CONTENT__XMLCONTENT = eINSTANCE
				.getAttributeValueXmlDataXmlContent_XMLCONTENT();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.ACCESSPOLICYACCESSMODEENUM <em>ACCESSPOLICYACCESSMODEENUM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.ACCESSPOLICYACCESSMODEENUM
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getACCESSPOLICYACCESSMODEENUM()
		 * @generated
		 */
		EEnum ACCESSPOLICYACCESSMODEENUM = eINSTANCE
				.getACCESSPOLICYACCESSMODEENUM();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.BOOLEAN <em>BOOLEAN</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.BOOLEAN
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getBOOLEAN()
		 * @generated
		 */
		EEnum BOOLEAN = eINSTANCE.getBOOLEAN();

		/**
		 * The meta object literal for the '{@link era.foss.model.core.rif.DATATYPEDEFINITIONDOCUMENTFORMATENUM <em>DATATYPEDEFINITIONDOCUMENTFORMATENUM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.DATATYPEDEFINITIONDOCUMENTFORMATENUM
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDATATYPEDEFINITIONDOCUMENTFORMATENUM()
		 * @generated
		 */
		EEnum DATATYPEDEFINITIONDOCUMENTFORMATENUM = eINSTANCE
				.getDATATYPEDEFINITIONDOCUMENTFORMATENUM();

		/**
		 * The meta object literal for the '<em>ACCESSPOLICYACCESSMODEENUM Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.ACCESSPOLICYACCESSMODEENUM
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getACCESSPOLICYACCESSMODEENUMObject()
		 * @generated
		 */
		EDataType ACCESSPOLICYACCESSMODEENUM_OBJECT = eINSTANCE
				.getACCESSPOLICYACCESSMODEENUMObject();

		/**
		 * The meta object literal for the '<em>BOOLEAN Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.BOOLEAN
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getBOOLEANObject()
		 * @generated
		 */
		EDataType BOOLEAN_OBJECT = eINSTANCE.getBOOLEANObject();

		/**
		 * The meta object literal for the '<em>DATATYPEDEFINITIONDOCUMENTFORMATENUM Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.DATATYPEDEFINITIONDOCUMENTFORMATENUM
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getDATATYPEDEFINITIONDOCUMENTFORMATENUMObject()
		 * @generated
		 */
		EDataType DATATYPEDEFINITIONDOCUMENTFORMATENUM_OBJECT = eINSTANCE
				.getDATATYPEDEFINITIONDOCUMENTFORMATENUMObject();

		/**
		 * The meta object literal for the '<em>FLOAT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getFLOAT()
		 * @generated
		 */
		EDataType FLOAT = eINSTANCE.getFLOAT();

		/**
		 * The meta object literal for the '<em>FLOAT Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getFLOATObject()
		 * @generated
		 */
		EDataType FLOAT_OBJECT = eINSTANCE.getFLOATObject();

		/**
		 * The meta object literal for the '<em>INTEGER</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getINTEGER()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getINTEGER();

		/**
		 * The meta object literal for the '<em>REF</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getREF()
		 * @generated
		 */
		EDataType REF = eINSTANCE.getREF();

		/**
		 * The meta object literal for the '<em>STRING</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see era.foss.model.core.rif.internal.RifPackageImpl#getSTRING()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getSTRING();

	}

} //RifPackage
