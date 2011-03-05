/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.erf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see era.foss.erf.ErfFactory
 * @model kind="package"
 * @generated
 */
public interface ErfPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "erf";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://era/foss/erf";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "era.foss.erf";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ErfPackage eINSTANCE = era.foss.erf.impl.ErfPackageImpl.init();

    /**
     * The meta object id for the '{@link era.foss.erf.impl.AttributeDefinitionImpl <em>Attribute Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.erf.impl.AttributeDefinitionImpl
     * @see era.foss.erf.impl.ErfPackageImpl#getAttributeDefinition()
     * @generated
     */
    int ATTRIBUTE_DEFINITION = 0;

    /**
     * The meta object id for the '{@link era.foss.erf.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.erf.impl.AttributeValueImpl
     * @see era.foss.erf.impl.ErfPackageImpl#getAttributeValue()
     * @generated
     */
    int ATTRIBUTE_VALUE = 1;

    /**
     * The meta object id for the '{@link era.foss.erf.impl.DatatypeDefinitionImpl <em>Datatype Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.erf.impl.DatatypeDefinitionImpl
     * @see era.foss.erf.impl.ErfPackageImpl#getDatatypeDefinition()
     * @generated
     */
    int DATATYPE_DEFINITION = 2;

    /**
     * The meta object id for the '{@link era.foss.erf.impl.SpecElementWithUserDefinedAttributesImpl <em>Spec Element With User Defined Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.erf.impl.SpecElementWithUserDefinedAttributesImpl
     * @see era.foss.erf.impl.ErfPackageImpl#getSpecElementWithUserDefinedAttributes()
     * @generated
     */
    int SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES = 3;

    /**
     * The meta object id for the '{@link era.foss.erf.impl.SpecObjectImpl <em>Spec Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.erf.impl.SpecObjectImpl
     * @see era.foss.erf.impl.ErfPackageImpl#getSpecObject()
     * @generated
     */
    int SPEC_OBJECT = 4;

    /**
     * The meta object id for the '{@link era.foss.erf.impl.SpecTypeImpl <em>Spec Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.erf.impl.SpecTypeImpl
     * @see era.foss.erf.impl.ErfPackageImpl#getSpecType()
     * @generated
     */
    int SPEC_TYPE = 5;

    /**
     * The meta object id for the '{@link java.util.Map <em>Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.Map
     * @see era.foss.erf.impl.ErfPackageImpl#getMap()
     * @generated
     */
    int MAP = 6;

    /**
     * The meta object id for the '{@link era.foss.erf.impl.AttributeValueSimpleImpl <em>Attribute Value Simple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.erf.impl.AttributeValueSimpleImpl
     * @see era.foss.erf.impl.ErfPackageImpl#getAttributeValueSimple()
     * @generated
     */
    int ATTRIBUTE_VALUE_SIMPLE = 7;

    /**
     * The meta object id for the '{@link era.foss.erf.impl.DatatypeDefinitionSimpleImpl <em>Datatype Definition Simple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.erf.impl.DatatypeDefinitionSimpleImpl
     * @see era.foss.erf.impl.ErfPackageImpl#getDatatypeDefinitionSimple()
     * @generated
     */
    int DATATYPE_DEFINITION_SIMPLE = 9;

    /**
     * The meta object id for the '{@link era.foss.erf.impl.DatatypeDefinitionIntegerImpl <em>Datatype Definition Integer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.erf.impl.DatatypeDefinitionIntegerImpl
     * @see era.foss.erf.impl.ErfPackageImpl#getDatatypeDefinitionInteger()
     * @generated
     */
    int DATATYPE_DEFINITION_INTEGER = 8;

    /**
     * The meta object id for the '{@link era.foss.erf.impl.DatatypeDefinitionStringImpl <em>Datatype Definition String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.erf.impl.DatatypeDefinitionStringImpl
     * @see era.foss.erf.impl.ErfPackageImpl#getDatatypeDefinitionString()
     * @generated
     */
    int DATATYPE_DEFINITION_STRING = 10;

    /**
     * The meta object id for the '{@link era.foss.erf.impl.IdentifiableImpl <em>Identifiable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.erf.impl.IdentifiableImpl
     * @see era.foss.erf.impl.ErfPackageImpl#getIdentifiable()
     * @generated
     */
    int IDENTIFIABLE = 11;

    /**
     * The feature id for the '<em><b>ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIABLE__ID = 0;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIABLE__DESC = 1;

    /**
     * The feature id for the '<em><b>Long Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIABLE__LONG_NAME = 2;

    /**
     * The number of structural features of the '<em>Identifiable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIABLE_FEATURE_COUNT = 3;

    /**
     * The feature id for the '<em><b>ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_DEFINITION__ID = IDENTIFIABLE__ID;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_DEFINITION__DESC = IDENTIFIABLE__DESC;

    /**
     * The feature id for the '<em><b>Long Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_DEFINITION__LONG_NAME = IDENTIFIABLE__LONG_NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_DEFINITION__TYPE = IDENTIFIABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ident</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_DEFINITION__IDENT = IDENTIFIABLE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Unique</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_DEFINITION__UNIQUE = IDENTIFIABLE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Attribute Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_DEFINITION_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_VALUE__ID = IDENTIFIABLE__ID;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_VALUE__DESC = IDENTIFIABLE__DESC;

    /**
     * The feature id for the '<em><b>Long Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_VALUE__LONG_NAME = IDENTIFIABLE__LONG_NAME;

    /**
     * The number of structural features of the '<em>Attribute Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_VALUE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATATYPE_DEFINITION__ID = IDENTIFIABLE__ID;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATATYPE_DEFINITION__DESC = IDENTIFIABLE__DESC;

    /**
     * The feature id for the '<em><b>Long Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATATYPE_DEFINITION__LONG_NAME = IDENTIFIABLE__LONG_NAME;

    /**
     * The number of structural features of the '<em>Datatype Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATATYPE_DEFINITION_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__ID = IDENTIFIABLE__ID;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__DESC = IDENTIFIABLE__DESC;

    /**
     * The feature id for the '<em><b>Long Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__LONG_NAME = IDENTIFIABLE__LONG_NAME;

    /**
     * The feature id for the '<em><b>Values</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__VALUES = IDENTIFIABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__TYPE = IDENTIFIABLE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Spec Element With User Defined Attributes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEC_OBJECT__ID = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__ID;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEC_OBJECT__DESC = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__DESC;

    /**
     * The feature id for the '<em><b>Long Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEC_OBJECT__LONG_NAME = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__LONG_NAME;

    /**
     * The feature id for the '<em><b>Values</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEC_OBJECT__VALUES = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__VALUES;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEC_OBJECT__TYPE = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__TYPE;

    /**
     * The number of structural features of the '<em>Spec Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEC_OBJECT_FEATURE_COUNT = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEC_TYPE__ID = IDENTIFIABLE__ID;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEC_TYPE__DESC = IDENTIFIABLE__DESC;

    /**
     * The feature id for the '<em><b>Long Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEC_TYPE__LONG_NAME = IDENTIFIABLE__LONG_NAME;

    /**
     * The feature id for the '<em><b>Spec Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEC_TYPE__SPEC_ATTRIBUTES = IDENTIFIABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Spec Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEC_TYPE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Map</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAP_FEATURE_COUNT = 0;

    /**
     * The feature id for the '<em><b>ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_VALUE_SIMPLE__ID = ATTRIBUTE_VALUE__ID;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_VALUE_SIMPLE__DESC = ATTRIBUTE_VALUE__DESC;

    /**
     * The feature id for the '<em><b>Long Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_VALUE_SIMPLE__LONG_NAME = ATTRIBUTE_VALUE__LONG_NAME;

    /**
     * The feature id for the '<em><b>The Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_VALUE_SIMPLE__THE_VALUE = ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_VALUE_SIMPLE__DEFINITION = ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Attribute Value Simple</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_VALUE_SIMPLE_FEATURE_COUNT = ATTRIBUTE_VALUE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATATYPE_DEFINITION_SIMPLE__ID = DATATYPE_DEFINITION__ID;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATATYPE_DEFINITION_SIMPLE__DESC = DATATYPE_DEFINITION__DESC;

    /**
     * The feature id for the '<em><b>Long Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATATYPE_DEFINITION_SIMPLE__LONG_NAME = DATATYPE_DEFINITION__LONG_NAME;

    /**
     * The number of structural features of the '<em>Datatype Definition Simple</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT = DATATYPE_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATATYPE_DEFINITION_INTEGER__ID = DATATYPE_DEFINITION_SIMPLE__ID;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATATYPE_DEFINITION_INTEGER__DESC = DATATYPE_DEFINITION_SIMPLE__DESC;

    /**
     * The feature id for the '<em><b>Long Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATATYPE_DEFINITION_INTEGER__LONG_NAME = DATATYPE_DEFINITION_SIMPLE__LONG_NAME;

    /**
     * The feature id for the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATATYPE_DEFINITION_INTEGER__MAX = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATATYPE_DEFINITION_INTEGER__MIN = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Datatype Definition Integer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATATYPE_DEFINITION_INTEGER_FEATURE_COUNT = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATATYPE_DEFINITION_STRING__ID = DATATYPE_DEFINITION_SIMPLE__ID;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATATYPE_DEFINITION_STRING__DESC = DATATYPE_DEFINITION_SIMPLE__DESC;

    /**
     * The feature id for the '<em><b>Long Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATATYPE_DEFINITION_STRING__LONG_NAME = DATATYPE_DEFINITION_SIMPLE__LONG_NAME;

    /**
     * The feature id for the '<em><b>Max Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATATYPE_DEFINITION_STRING__MAX_LENGTH = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Datatype Definition String</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATATYPE_DEFINITION_STRING_FEATURE_COUNT = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link era.foss.erf.impl.AttributeDefinitionSimpleImpl <em>Attribute Definition Simple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.erf.impl.AttributeDefinitionSimpleImpl
     * @see era.foss.erf.impl.ErfPackageImpl#getAttributeDefinitionSimple()
     * @generated
     */
    int ATTRIBUTE_DEFINITION_SIMPLE = 12;

    /**
     * The feature id for the '<em><b>ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_DEFINITION_SIMPLE__ID = ATTRIBUTE_DEFINITION__ID;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_DEFINITION_SIMPLE__DESC = ATTRIBUTE_DEFINITION__DESC;

    /**
     * The feature id for the '<em><b>Long Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_DEFINITION_SIMPLE__LONG_NAME = ATTRIBUTE_DEFINITION__LONG_NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_DEFINITION_SIMPLE__TYPE = ATTRIBUTE_DEFINITION__TYPE;

    /**
     * The feature id for the '<em><b>Ident</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_DEFINITION_SIMPLE__IDENT = ATTRIBUTE_DEFINITION__IDENT;

    /**
     * The feature id for the '<em><b>Unique</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_DEFINITION_SIMPLE__UNIQUE = ATTRIBUTE_DEFINITION__UNIQUE;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE = ATTRIBUTE_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Attribute Definition Simple</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_DEFINITION_SIMPLE_FEATURE_COUNT = ATTRIBUTE_DEFINITION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link era.foss.erf.impl.ERFImpl <em>ERF</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.erf.impl.ERFImpl
     * @see era.foss.erf.impl.ErfPackageImpl#getERF()
     * @generated
     */
    int ERF = 13;

    /**
     * The feature id for the '<em><b>Core Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERF__CORE_CONTENT = 0;

    /**
     * The number of structural features of the '<em>ERF</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERF_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link era.foss.erf.impl.ContentImpl <em>Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.erf.impl.ContentImpl
     * @see era.foss.erf.impl.ErfPackageImpl#getContent()
     * @generated
     */
    int CONTENT = 14;

    /**
     * The feature id for the '<em><b>Spec Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTENT__SPEC_OBJECTS = 0;

    /**
     * The feature id for the '<em><b>Spec Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTENT__SPEC_TYPES = 1;

    /**
     * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTENT__DATA_TYPES = 2;

    /**
     * The number of structural features of the '<em>Content</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTENT_FEATURE_COUNT = 3;

    /**
     * Returns the meta object for class '{@link era.foss.erf.AttributeDefinition <em>Attribute Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Definition</em>'.
     * @see era.foss.erf.AttributeDefinition
     * @generated
     */
    EClass getAttributeDefinition();

    /**
     * Returns the meta object for the reference '{@link era.foss.erf.AttributeDefinition#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see era.foss.erf.AttributeDefinition#getType()
     * @see #getAttributeDefinition()
     * @generated
     */
    EReference getAttributeDefinition_Type();

    /**
     * Returns the meta object for the attribute '{@link era.foss.erf.AttributeDefinition#isIdent <em>Ident</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ident</em>'.
     * @see era.foss.erf.AttributeDefinition#isIdent()
     * @see #getAttributeDefinition()
     * @generated
     */
    EAttribute getAttributeDefinition_Ident();

    /**
     * Returns the meta object for the attribute '{@link era.foss.erf.AttributeDefinition#isUnique <em>Unique</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Unique</em>'.
     * @see era.foss.erf.AttributeDefinition#isUnique()
     * @see #getAttributeDefinition()
     * @generated
     */
    EAttribute getAttributeDefinition_Unique();

    /**
     * Returns the meta object for class '{@link era.foss.erf.AttributeValue <em>Attribute Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Value</em>'.
     * @see era.foss.erf.AttributeValue
     * @generated
     */
    EClass getAttributeValue();

    /**
     * Returns the meta object for class '{@link era.foss.erf.DatatypeDefinition <em>Datatype Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Datatype Definition</em>'.
     * @see era.foss.erf.DatatypeDefinition
     * @generated
     */
    EClass getDatatypeDefinition();

    /**
     * Returns the meta object for class '{@link era.foss.erf.SpecElementWithUserDefinedAttributes <em>Spec Element With User Defined Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Spec Element With User Defined Attributes</em>'.
     * @see era.foss.erf.SpecElementWithUserDefinedAttributes
     * @generated
     */
    EClass getSpecElementWithUserDefinedAttributes();

    /**
     * Returns the meta object for the containment reference list '{@link era.foss.erf.SpecElementWithUserDefinedAttributes#getValues <em>Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Values</em>'.
     * @see era.foss.erf.SpecElementWithUserDefinedAttributes#getValues()
     * @see #getSpecElementWithUserDefinedAttributes()
     * @generated
     */
    EReference getSpecElementWithUserDefinedAttributes_Values();

    /**
     * Returns the meta object for the reference '{@link era.foss.erf.SpecElementWithUserDefinedAttributes#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see era.foss.erf.SpecElementWithUserDefinedAttributes#getType()
     * @see #getSpecElementWithUserDefinedAttributes()
     * @generated
     */
    EReference getSpecElementWithUserDefinedAttributes_Type();

    /**
     * Returns the meta object for class '{@link era.foss.erf.SpecObject <em>Spec Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Spec Object</em>'.
     * @see era.foss.erf.SpecObject
     * @generated
     */
    EClass getSpecObject();

    /**
     * Returns the meta object for class '{@link era.foss.erf.SpecType <em>Spec Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Spec Type</em>'.
     * @see era.foss.erf.SpecType
     * @generated
     */
    EClass getSpecType();

    /**
     * Returns the meta object for the containment reference list '{@link era.foss.erf.SpecType#getSpecAttributes <em>Spec Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Spec Attributes</em>'.
     * @see era.foss.erf.SpecType#getSpecAttributes()
     * @see #getSpecType()
     * @generated
     */
    EReference getSpecType_SpecAttributes();

    /**
     * Returns the meta object for class '{@link java.util.Map <em>Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Map</em>'.
     * @see java.util.Map
     * @model instanceClass="java.util.Map" typeParameters="T T1"
     * @generated
     */
    EClass getMap();

    /**
     * Returns the meta object for class '{@link era.foss.erf.AttributeValueSimple <em>Attribute Value Simple</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Value Simple</em>'.
     * @see era.foss.erf.AttributeValueSimple
     * @generated
     */
    EClass getAttributeValueSimple();

    /**
     * Returns the meta object for the attribute '{@link era.foss.erf.AttributeValueSimple#getTheValue <em>The Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>The Value</em>'.
     * @see era.foss.erf.AttributeValueSimple#getTheValue()
     * @see #getAttributeValueSimple()
     * @generated
     */
    EAttribute getAttributeValueSimple_TheValue();

    /**
     * Returns the meta object for the reference '{@link era.foss.erf.AttributeValueSimple#getDefinition <em>Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Definition</em>'.
     * @see era.foss.erf.AttributeValueSimple#getDefinition()
     * @see #getAttributeValueSimple()
     * @generated
     */
    EReference getAttributeValueSimple_Definition();

    /**
     * Returns the meta object for class '{@link era.foss.erf.DatatypeDefinitionInteger <em>Datatype Definition Integer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Datatype Definition Integer</em>'.
     * @see era.foss.erf.DatatypeDefinitionInteger
     * @generated
     */
    EClass getDatatypeDefinitionInteger();

    /**
     * Returns the meta object for the attribute '{@link era.foss.erf.DatatypeDefinitionInteger#getMax <em>Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max</em>'.
     * @see era.foss.erf.DatatypeDefinitionInteger#getMax()
     * @see #getDatatypeDefinitionInteger()
     * @generated
     */
    EAttribute getDatatypeDefinitionInteger_Max();

    /**
     * Returns the meta object for the attribute '{@link era.foss.erf.DatatypeDefinitionInteger#getMin <em>Min</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min</em>'.
     * @see era.foss.erf.DatatypeDefinitionInteger#getMin()
     * @see #getDatatypeDefinitionInteger()
     * @generated
     */
    EAttribute getDatatypeDefinitionInteger_Min();

    /**
     * Returns the meta object for class '{@link era.foss.erf.DatatypeDefinitionSimple <em>Datatype Definition Simple</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Datatype Definition Simple</em>'.
     * @see era.foss.erf.DatatypeDefinitionSimple
     * @generated
     */
    EClass getDatatypeDefinitionSimple();

    /**
     * Returns the meta object for class '{@link era.foss.erf.DatatypeDefinitionString <em>Datatype Definition String</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Datatype Definition String</em>'.
     * @see era.foss.erf.DatatypeDefinitionString
     * @generated
     */
    EClass getDatatypeDefinitionString();

    /**
     * Returns the meta object for the attribute '{@link era.foss.erf.DatatypeDefinitionString#getMaxLength <em>Max Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Length</em>'.
     * @see era.foss.erf.DatatypeDefinitionString#getMaxLength()
     * @see #getDatatypeDefinitionString()
     * @generated
     */
    EAttribute getDatatypeDefinitionString_MaxLength();

    /**
     * Returns the meta object for class '{@link era.foss.erf.Identifiable <em>Identifiable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identifiable</em>'.
     * @see era.foss.erf.Identifiable
     * @generated
     */
    EClass getIdentifiable();

    /**
     * Returns the meta object for the attribute '{@link era.foss.erf.Identifiable#getID <em>ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ID</em>'.
     * @see era.foss.erf.Identifiable#getID()
     * @see #getIdentifiable()
     * @generated
     */
    EAttribute getIdentifiable_ID();

    /**
     * Returns the meta object for the attribute '{@link era.foss.erf.Identifiable#getDesc <em>Desc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Desc</em>'.
     * @see era.foss.erf.Identifiable#getDesc()
     * @see #getIdentifiable()
     * @generated
     */
    EAttribute getIdentifiable_Desc();

    /**
     * Returns the meta object for the attribute '{@link era.foss.erf.Identifiable#getLongName <em>Long Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Long Name</em>'.
     * @see era.foss.erf.Identifiable#getLongName()
     * @see #getIdentifiable()
     * @generated
     */
    EAttribute getIdentifiable_LongName();

    /**
     * Returns the meta object for class '{@link era.foss.erf.AttributeDefinitionSimple <em>Attribute Definition Simple</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Definition Simple</em>'.
     * @see era.foss.erf.AttributeDefinitionSimple
     * @generated
     */
    EClass getAttributeDefinitionSimple();

    /**
     * Returns the meta object for the containment reference '{@link era.foss.erf.AttributeDefinitionSimple#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Default Value</em>'.
     * @see era.foss.erf.AttributeDefinitionSimple#getDefaultValue()
     * @see #getAttributeDefinitionSimple()
     * @generated
     */
    EReference getAttributeDefinitionSimple_DefaultValue();

    /**
     * Returns the meta object for class '{@link era.foss.erf.ERF <em>ERF</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ERF</em>'.
     * @see era.foss.erf.ERF
     * @generated
     */
    EClass getERF();

    /**
     * Returns the meta object for the containment reference '{@link era.foss.erf.ERF#getCoreContent <em>Core Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Core Content</em>'.
     * @see era.foss.erf.ERF#getCoreContent()
     * @see #getERF()
     * @generated
     */
    EReference getERF_CoreContent();

    /**
     * Returns the meta object for class '{@link era.foss.erf.Content <em>Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Content</em>'.
     * @see era.foss.erf.Content
     * @generated
     */
    EClass getContent();

    /**
     * Returns the meta object for the containment reference list '{@link era.foss.erf.Content#getSpecObjects <em>Spec Objects</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Spec Objects</em>'.
     * @see era.foss.erf.Content#getSpecObjects()
     * @see #getContent()
     * @generated
     */
    EReference getContent_SpecObjects();

    /**
     * Returns the meta object for the containment reference list '{@link era.foss.erf.Content#getSpecTypes <em>Spec Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Spec Types</em>'.
     * @see era.foss.erf.Content#getSpecTypes()
     * @see #getContent()
     * @generated
     */
    EReference getContent_SpecTypes();

    /**
     * Returns the meta object for the containment reference list '{@link era.foss.erf.Content#getDataTypes <em>Data Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Types</em>'.
     * @see era.foss.erf.Content#getDataTypes()
     * @see #getContent()
     * @generated
     */
    EReference getContent_DataTypes();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ErfFactory getErfFactory();

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
         * The meta object literal for the '{@link era.foss.erf.impl.AttributeDefinitionImpl <em>Attribute Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.erf.impl.AttributeDefinitionImpl
         * @see era.foss.erf.impl.ErfPackageImpl#getAttributeDefinition()
         * @generated
         */
        EClass ATTRIBUTE_DEFINITION = eINSTANCE.getAttributeDefinition();
        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE_DEFINITION__TYPE = eINSTANCE.getAttributeDefinition_Type();
        /**
         * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_DEFINITION__IDENT = eINSTANCE.getAttributeDefinition_Ident();
        /**
         * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_DEFINITION__UNIQUE = eINSTANCE.getAttributeDefinition_Unique();
        /**
         * The meta object literal for the '{@link era.foss.erf.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.erf.impl.AttributeValueImpl
         * @see era.foss.erf.impl.ErfPackageImpl#getAttributeValue()
         * @generated
         */
        EClass ATTRIBUTE_VALUE = eINSTANCE.getAttributeValue();
        /**
         * The meta object literal for the '{@link era.foss.erf.impl.DatatypeDefinitionImpl <em>Datatype Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.erf.impl.DatatypeDefinitionImpl
         * @see era.foss.erf.impl.ErfPackageImpl#getDatatypeDefinition()
         * @generated
         */
        EClass DATATYPE_DEFINITION = eINSTANCE.getDatatypeDefinition();
        /**
         * The meta object literal for the '{@link era.foss.erf.impl.SpecElementWithUserDefinedAttributesImpl <em>Spec Element With User Defined Attributes</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.erf.impl.SpecElementWithUserDefinedAttributesImpl
         * @see era.foss.erf.impl.ErfPackageImpl#getSpecElementWithUserDefinedAttributes()
         * @generated
         */
        EClass SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES = eINSTANCE.getSpecElementWithUserDefinedAttributes();
        /**
         * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__VALUES = eINSTANCE.getSpecElementWithUserDefinedAttributes_Values();
        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__TYPE = eINSTANCE.getSpecElementWithUserDefinedAttributes_Type();
        /**
         * The meta object literal for the '{@link era.foss.erf.impl.SpecObjectImpl <em>Spec Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.erf.impl.SpecObjectImpl
         * @see era.foss.erf.impl.ErfPackageImpl#getSpecObject()
         * @generated
         */
        EClass SPEC_OBJECT = eINSTANCE.getSpecObject();
        /**
         * The meta object literal for the '{@link era.foss.erf.impl.SpecTypeImpl <em>Spec Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.erf.impl.SpecTypeImpl
         * @see era.foss.erf.impl.ErfPackageImpl#getSpecType()
         * @generated
         */
        EClass SPEC_TYPE = eINSTANCE.getSpecType();
        /**
         * The meta object literal for the '<em><b>Spec Attributes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SPEC_TYPE__SPEC_ATTRIBUTES = eINSTANCE.getSpecType_SpecAttributes();
        /**
         * The meta object literal for the '{@link java.util.Map <em>Map</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.Map
         * @see era.foss.erf.impl.ErfPackageImpl#getMap()
         * @generated
         */
        EClass MAP = eINSTANCE.getMap();
        /**
         * The meta object literal for the '{@link era.foss.erf.impl.AttributeValueSimpleImpl <em>Attribute Value Simple</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.erf.impl.AttributeValueSimpleImpl
         * @see era.foss.erf.impl.ErfPackageImpl#getAttributeValueSimple()
         * @generated
         */
        EClass ATTRIBUTE_VALUE_SIMPLE = eINSTANCE.getAttributeValueSimple();
        /**
         * The meta object literal for the '<em><b>The Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_VALUE_SIMPLE__THE_VALUE = eINSTANCE.getAttributeValueSimple_TheValue();
        /**
         * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE_VALUE_SIMPLE__DEFINITION = eINSTANCE.getAttributeValueSimple_Definition();
        /**
         * The meta object literal for the '{@link era.foss.erf.impl.DatatypeDefinitionIntegerImpl <em>Datatype Definition Integer</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.erf.impl.DatatypeDefinitionIntegerImpl
         * @see era.foss.erf.impl.ErfPackageImpl#getDatatypeDefinitionInteger()
         * @generated
         */
        EClass DATATYPE_DEFINITION_INTEGER = eINSTANCE.getDatatypeDefinitionInteger();
        /**
         * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATATYPE_DEFINITION_INTEGER__MAX = eINSTANCE.getDatatypeDefinitionInteger_Max();
        /**
         * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATATYPE_DEFINITION_INTEGER__MIN = eINSTANCE.getDatatypeDefinitionInteger_Min();
        /**
         * The meta object literal for the '{@link era.foss.erf.impl.DatatypeDefinitionSimpleImpl <em>Datatype Definition Simple</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.erf.impl.DatatypeDefinitionSimpleImpl
         * @see era.foss.erf.impl.ErfPackageImpl#getDatatypeDefinitionSimple()
         * @generated
         */
        EClass DATATYPE_DEFINITION_SIMPLE = eINSTANCE.getDatatypeDefinitionSimple();
        /**
         * The meta object literal for the '{@link era.foss.erf.impl.DatatypeDefinitionStringImpl <em>Datatype Definition String</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.erf.impl.DatatypeDefinitionStringImpl
         * @see era.foss.erf.impl.ErfPackageImpl#getDatatypeDefinitionString()
         * @generated
         */
        EClass DATATYPE_DEFINITION_STRING = eINSTANCE.getDatatypeDefinitionString();
        /**
         * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATATYPE_DEFINITION_STRING__MAX_LENGTH = eINSTANCE.getDatatypeDefinitionString_MaxLength();
        /**
         * The meta object literal for the '{@link era.foss.erf.impl.IdentifiableImpl <em>Identifiable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.erf.impl.IdentifiableImpl
         * @see era.foss.erf.impl.ErfPackageImpl#getIdentifiable()
         * @generated
         */
        EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();
        /**
         * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IDENTIFIABLE__ID = eINSTANCE.getIdentifiable_ID();
        /**
         * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IDENTIFIABLE__DESC = eINSTANCE.getIdentifiable_Desc();
        /**
         * The meta object literal for the '<em><b>Long Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IDENTIFIABLE__LONG_NAME = eINSTANCE.getIdentifiable_LongName();
        /**
         * The meta object literal for the '{@link era.foss.erf.impl.AttributeDefinitionSimpleImpl <em>Attribute Definition Simple</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.erf.impl.AttributeDefinitionSimpleImpl
         * @see era.foss.erf.impl.ErfPackageImpl#getAttributeDefinitionSimple()
         * @generated
         */
        EClass ATTRIBUTE_DEFINITION_SIMPLE = eINSTANCE.getAttributeDefinitionSimple();
        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE = eINSTANCE.getAttributeDefinitionSimple_DefaultValue();
        /**
         * The meta object literal for the '{@link era.foss.erf.impl.ERFImpl <em>ERF</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.erf.impl.ERFImpl
         * @see era.foss.erf.impl.ErfPackageImpl#getERF()
         * @generated
         */
        EClass ERF = eINSTANCE.getERF();
        /**
         * The meta object literal for the '<em><b>Core Content</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ERF__CORE_CONTENT = eINSTANCE.getERF_CoreContent();
        /**
         * The meta object literal for the '{@link era.foss.erf.impl.ContentImpl <em>Content</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.erf.impl.ContentImpl
         * @see era.foss.erf.impl.ErfPackageImpl#getContent()
         * @generated
         */
        EClass CONTENT = eINSTANCE.getContent();
        /**
         * The meta object literal for the '<em><b>Spec Objects</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTENT__SPEC_OBJECTS = eINSTANCE.getContent_SpecObjects();
        /**
         * The meta object literal for the '<em><b>Spec Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTENT__SPEC_TYPES = eINSTANCE.getContent_SpecTypes();
        /**
         * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTENT__DATA_TYPES = eINSTANCE.getContent_DataTypes();

    }

} //ErfPackage
