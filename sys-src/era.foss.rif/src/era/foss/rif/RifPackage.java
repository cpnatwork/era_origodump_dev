/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.rif;

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
 * @see era.foss.rif.RifFactory
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
    String eNAME = "rif";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http:///era/foss/rif.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "era.foss.rif";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    RifPackage eINSTANCE = era.foss.rif.impl.RifPackageImpl.init();

    /**
     * The meta object id for the '{@link era.foss.rif.impl.RIFImpl <em>RIF</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.rif.impl.RIFImpl
     * @see era.foss.rif.impl.RifPackageImpl#getRIF()
     * @generated
     */
    int RIF = 0;

    /**
     * The feature id for the '<em><b>Core Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIF__CORE_CONTENT = 0;

    /**
     * The number of structural features of the '<em>RIF</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIF_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link era.foss.rif.impl.AttributeDefinitionImpl <em>Attribute Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.rif.impl.AttributeDefinitionImpl
     * @see era.foss.rif.impl.RifPackageImpl#getAttributeDefinition()
     * @generated
     */
    int ATTRIBUTE_DEFINITION = 1;

    /**
     * The meta object id for the '{@link era.foss.rif.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.rif.impl.AttributeValueImpl
     * @see era.foss.rif.impl.RifPackageImpl#getAttributeValue()
     * @generated
     */
    int ATTRIBUTE_VALUE = 2;

    /**
     * The meta object id for the '{@link era.foss.rif.impl.DatatypeDefinitionImpl <em>Datatype Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.rif.impl.DatatypeDefinitionImpl
     * @see era.foss.rif.impl.RifPackageImpl#getDatatypeDefinition()
     * @generated
     */
    int DATATYPE_DEFINITION = 3;

    /**
     * The meta object id for the '{@link era.foss.rif.impl.SpecElementWithUserDefinedAttributesImpl <em>Spec Element With User Defined Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.rif.impl.SpecElementWithUserDefinedAttributesImpl
     * @see era.foss.rif.impl.RifPackageImpl#getSpecElementWithUserDefinedAttributes()
     * @generated
     */
    int SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES = 4;

    /**
     * The meta object id for the '{@link era.foss.rif.impl.SpecObjectImpl <em>Spec Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.rif.impl.SpecObjectImpl
     * @see era.foss.rif.impl.RifPackageImpl#getSpecObject()
     * @generated
     */
    int SPEC_OBJECT = 5;

    /**
     * The meta object id for the '{@link era.foss.rif.impl.SpecTypeImpl <em>Spec Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.rif.impl.SpecTypeImpl
     * @see era.foss.rif.impl.RifPackageImpl#getSpecType()
     * @generated
     */
    int SPEC_TYPE = 6;

    /**
     * The meta object id for the '{@link java.util.Map <em>Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.Map
     * @see era.foss.rif.impl.RifPackageImpl#getMap()
     * @generated
     */
    int MAP = 7;

    /**
     * The meta object id for the '{@link era.foss.rif.impl.AttributeValueSimpleImpl <em>Attribute Value Simple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.rif.impl.AttributeValueSimpleImpl
     * @see era.foss.rif.impl.RifPackageImpl#getAttributeValueSimple()
     * @generated
     */
    int ATTRIBUTE_VALUE_SIMPLE = 8;

    /**
     * The meta object id for the '{@link era.foss.rif.impl.DatatypeDefinitionSimpleImpl <em>Datatype Definition Simple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.rif.impl.DatatypeDefinitionSimpleImpl
     * @see era.foss.rif.impl.RifPackageImpl#getDatatypeDefinitionSimple()
     * @generated
     */
    int DATATYPE_DEFINITION_SIMPLE = 10;

    /**
     * The meta object id for the '{@link era.foss.rif.impl.DatatypeDefinitionIntegerImpl <em>Datatype Definition Integer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.rif.impl.DatatypeDefinitionIntegerImpl
     * @see era.foss.rif.impl.RifPackageImpl#getDatatypeDefinitionInteger()
     * @generated
     */
    int DATATYPE_DEFINITION_INTEGER = 9;

    /**
     * The meta object id for the '{@link era.foss.rif.impl.DatatypeDefinitionStringImpl <em>Datatype Definition String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.rif.impl.DatatypeDefinitionStringImpl
     * @see era.foss.rif.impl.RifPackageImpl#getDatatypeDefinitionString()
     * @generated
     */
    int DATATYPE_DEFINITION_STRING = 11;

    /**
     * The meta object id for the '{@link era.foss.rif.impl.RIFContentImpl <em>RIF Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.rif.impl.RIFContentImpl
     * @see era.foss.rif.impl.RifPackageImpl#getRIFContent()
     * @generated
     */
    int RIF_CONTENT = 12;

    /**
     * The meta object id for the '{@link era.foss.rif.impl.IdentifiableImpl <em>Identifiable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.rif.impl.IdentifiableImpl
     * @see era.foss.rif.impl.RifPackageImpl#getIdentifiable()
     * @generated
     */
    int IDENTIFIABLE = 13;

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
     * The number of structural features of the '<em>Attribute Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_DEFINITION_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;

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
     * The feature id for the '<em><b>Spec Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIF_CONTENT__SPEC_OBJECTS = 0;

    /**
     * The feature id for the '<em><b>Spec Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIF_CONTENT__SPEC_TYPES = 1;

    /**
     * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIF_CONTENT__DATA_TYPES = 2;

    /**
     * The number of structural features of the '<em>RIF Content</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIF_CONTENT_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link era.foss.rif.impl.AttributeDefinitionSimpleImpl <em>Attribute Definition Simple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see era.foss.rif.impl.AttributeDefinitionSimpleImpl
     * @see era.foss.rif.impl.RifPackageImpl#getAttributeDefinitionSimple()
     * @generated
     */
    int ATTRIBUTE_DEFINITION_SIMPLE = 14;

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
     * Returns the meta object for class '{@link era.foss.rif.RIF <em>RIF</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>RIF</em>'.
     * @see era.foss.rif.RIF
     * @generated
     */
    EClass getRIF();

    /**
     * Returns the meta object for the containment reference '{@link era.foss.rif.RIF#getCoreContent <em>Core Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Core Content</em>'.
     * @see era.foss.rif.RIF#getCoreContent()
     * @see #getRIF()
     * @generated
     */
    EReference getRIF_CoreContent();

    /**
     * Returns the meta object for class '{@link era.foss.rif.AttributeDefinition <em>Attribute Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Definition</em>'.
     * @see era.foss.rif.AttributeDefinition
     * @generated
     */
    EClass getAttributeDefinition();

    /**
     * Returns the meta object for the reference '{@link era.foss.rif.AttributeDefinition#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see era.foss.rif.AttributeDefinition#getType()
     * @see #getAttributeDefinition()
     * @generated
     */
    EReference getAttributeDefinition_Type();

    /**
     * Returns the meta object for class '{@link era.foss.rif.AttributeValue <em>Attribute Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Value</em>'.
     * @see era.foss.rif.AttributeValue
     * @generated
     */
    EClass getAttributeValue();

    /**
     * Returns the meta object for class '{@link era.foss.rif.DatatypeDefinition <em>Datatype Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Datatype Definition</em>'.
     * @see era.foss.rif.DatatypeDefinition
     * @generated
     */
    EClass getDatatypeDefinition();

    /**
     * Returns the meta object for class '{@link era.foss.rif.SpecElementWithUserDefinedAttributes <em>Spec Element With User Defined Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Spec Element With User Defined Attributes</em>'.
     * @see era.foss.rif.SpecElementWithUserDefinedAttributes
     * @generated
     */
    EClass getSpecElementWithUserDefinedAttributes();

    /**
     * Returns the meta object for the containment reference list '{@link era.foss.rif.SpecElementWithUserDefinedAttributes#getValues <em>Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Values</em>'.
     * @see era.foss.rif.SpecElementWithUserDefinedAttributes#getValues()
     * @see #getSpecElementWithUserDefinedAttributes()
     * @generated
     */
    EReference getSpecElementWithUserDefinedAttributes_Values();

    /**
     * Returns the meta object for the reference '{@link era.foss.rif.SpecElementWithUserDefinedAttributes#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see era.foss.rif.SpecElementWithUserDefinedAttributes#getType()
     * @see #getSpecElementWithUserDefinedAttributes()
     * @generated
     */
    EReference getSpecElementWithUserDefinedAttributes_Type();

    /**
     * Returns the meta object for class '{@link era.foss.rif.SpecObject <em>Spec Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Spec Object</em>'.
     * @see era.foss.rif.SpecObject
     * @generated
     */
    EClass getSpecObject();

    /**
     * Returns the meta object for class '{@link era.foss.rif.SpecType <em>Spec Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Spec Type</em>'.
     * @see era.foss.rif.SpecType
     * @generated
     */
    EClass getSpecType();

    /**
     * Returns the meta object for the containment reference list '{@link era.foss.rif.SpecType#getSpecAttributes <em>Spec Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Spec Attributes</em>'.
     * @see era.foss.rif.SpecType#getSpecAttributes()
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
     * Returns the meta object for class '{@link era.foss.rif.AttributeValueSimple <em>Attribute Value Simple</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Value Simple</em>'.
     * @see era.foss.rif.AttributeValueSimple
     * @generated
     */
    EClass getAttributeValueSimple();

    /**
     * Returns the meta object for the attribute '{@link era.foss.rif.AttributeValueSimple#getTheValue <em>The Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>The Value</em>'.
     * @see era.foss.rif.AttributeValueSimple#getTheValue()
     * @see #getAttributeValueSimple()
     * @generated
     */
    EAttribute getAttributeValueSimple_TheValue();

    /**
     * Returns the meta object for the reference '{@link era.foss.rif.AttributeValueSimple#getDefinition <em>Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Definition</em>'.
     * @see era.foss.rif.AttributeValueSimple#getDefinition()
     * @see #getAttributeValueSimple()
     * @generated
     */
    EReference getAttributeValueSimple_Definition();

    /**
     * Returns the meta object for class '{@link era.foss.rif.DatatypeDefinitionInteger <em>Datatype Definition Integer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Datatype Definition Integer</em>'.
     * @see era.foss.rif.DatatypeDefinitionInteger
     * @generated
     */
    EClass getDatatypeDefinitionInteger();

    /**
     * Returns the meta object for the attribute '{@link era.foss.rif.DatatypeDefinitionInteger#getMax <em>Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max</em>'.
     * @see era.foss.rif.DatatypeDefinitionInteger#getMax()
     * @see #getDatatypeDefinitionInteger()
     * @generated
     */
    EAttribute getDatatypeDefinitionInteger_Max();

    /**
     * Returns the meta object for the attribute '{@link era.foss.rif.DatatypeDefinitionInteger#getMin <em>Min</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min</em>'.
     * @see era.foss.rif.DatatypeDefinitionInteger#getMin()
     * @see #getDatatypeDefinitionInteger()
     * @generated
     */
    EAttribute getDatatypeDefinitionInteger_Min();

    /**
     * Returns the meta object for class '{@link era.foss.rif.DatatypeDefinitionSimple <em>Datatype Definition Simple</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Datatype Definition Simple</em>'.
     * @see era.foss.rif.DatatypeDefinitionSimple
     * @generated
     */
    EClass getDatatypeDefinitionSimple();

    /**
     * Returns the meta object for class '{@link era.foss.rif.DatatypeDefinitionString <em>Datatype Definition String</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Datatype Definition String</em>'.
     * @see era.foss.rif.DatatypeDefinitionString
     * @generated
     */
    EClass getDatatypeDefinitionString();

    /**
     * Returns the meta object for the attribute '{@link era.foss.rif.DatatypeDefinitionString#getMaxLength <em>Max Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Length</em>'.
     * @see era.foss.rif.DatatypeDefinitionString#getMaxLength()
     * @see #getDatatypeDefinitionString()
     * @generated
     */
    EAttribute getDatatypeDefinitionString_MaxLength();

    /**
     * Returns the meta object for class '{@link era.foss.rif.RIFContent <em>RIF Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>RIF Content</em>'.
     * @see era.foss.rif.RIFContent
     * @generated
     */
    EClass getRIFContent();

    /**
     * Returns the meta object for the containment reference list '{@link era.foss.rif.RIFContent#getSpecObjects <em>Spec Objects</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Spec Objects</em>'.
     * @see era.foss.rif.RIFContent#getSpecObjects()
     * @see #getRIFContent()
     * @generated
     */
    EReference getRIFContent_SpecObjects();

    /**
     * Returns the meta object for the containment reference list '{@link era.foss.rif.RIFContent#getSpecTypes <em>Spec Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Spec Types</em>'.
     * @see era.foss.rif.RIFContent#getSpecTypes()
     * @see #getRIFContent()
     * @generated
     */
    EReference getRIFContent_SpecTypes();

    /**
     * Returns the meta object for the containment reference list '{@link era.foss.rif.RIFContent#getDataTypes <em>Data Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Types</em>'.
     * @see era.foss.rif.RIFContent#getDataTypes()
     * @see #getRIFContent()
     * @generated
     */
    EReference getRIFContent_DataTypes();

    /**
     * Returns the meta object for class '{@link era.foss.rif.Identifiable <em>Identifiable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identifiable</em>'.
     * @see era.foss.rif.Identifiable
     * @generated
     */
    EClass getIdentifiable();

    /**
     * Returns the meta object for the attribute '{@link era.foss.rif.Identifiable#getID <em>ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ID</em>'.
     * @see era.foss.rif.Identifiable#getID()
     * @see #getIdentifiable()
     * @generated
     */
    EAttribute getIdentifiable_ID();

    /**
     * Returns the meta object for the attribute '{@link era.foss.rif.Identifiable#getDesc <em>Desc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Desc</em>'.
     * @see era.foss.rif.Identifiable#getDesc()
     * @see #getIdentifiable()
     * @generated
     */
    EAttribute getIdentifiable_Desc();

    /**
     * Returns the meta object for the attribute '{@link era.foss.rif.Identifiable#getLongName <em>Long Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Long Name</em>'.
     * @see era.foss.rif.Identifiable#getLongName()
     * @see #getIdentifiable()
     * @generated
     */
    EAttribute getIdentifiable_LongName();

    /**
     * Returns the meta object for class '{@link era.foss.rif.AttributeDefinitionSimple <em>Attribute Definition Simple</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Definition Simple</em>'.
     * @see era.foss.rif.AttributeDefinitionSimple
     * @generated
     */
    EClass getAttributeDefinitionSimple();

    /**
     * Returns the meta object for the containment reference '{@link era.foss.rif.AttributeDefinitionSimple#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Default Value</em>'.
     * @see era.foss.rif.AttributeDefinitionSimple#getDefaultValue()
     * @see #getAttributeDefinitionSimple()
     * @generated
     */
    EReference getAttributeDefinitionSimple_DefaultValue();

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
         * The meta object literal for the '{@link era.foss.rif.impl.RIFImpl <em>RIF</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.rif.impl.RIFImpl
         * @see era.foss.rif.impl.RifPackageImpl#getRIF()
         * @generated
         */
        EClass RIF = eINSTANCE.getRIF();
        /**
         * The meta object literal for the '<em><b>Core Content</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RIF__CORE_CONTENT = eINSTANCE.getRIF_CoreContent();
        /**
         * The meta object literal for the '{@link era.foss.rif.impl.AttributeDefinitionImpl <em>Attribute Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.rif.impl.AttributeDefinitionImpl
         * @see era.foss.rif.impl.RifPackageImpl#getAttributeDefinition()
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
         * The meta object literal for the '{@link era.foss.rif.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.rif.impl.AttributeValueImpl
         * @see era.foss.rif.impl.RifPackageImpl#getAttributeValue()
         * @generated
         */
        EClass ATTRIBUTE_VALUE = eINSTANCE.getAttributeValue();
        /**
         * The meta object literal for the '{@link era.foss.rif.impl.DatatypeDefinitionImpl <em>Datatype Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.rif.impl.DatatypeDefinitionImpl
         * @see era.foss.rif.impl.RifPackageImpl#getDatatypeDefinition()
         * @generated
         */
        EClass DATATYPE_DEFINITION = eINSTANCE.getDatatypeDefinition();
        /**
         * The meta object literal for the '{@link era.foss.rif.impl.SpecElementWithUserDefinedAttributesImpl <em>Spec Element With User Defined Attributes</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.rif.impl.SpecElementWithUserDefinedAttributesImpl
         * @see era.foss.rif.impl.RifPackageImpl#getSpecElementWithUserDefinedAttributes()
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
         * The meta object literal for the '{@link era.foss.rif.impl.SpecObjectImpl <em>Spec Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.rif.impl.SpecObjectImpl
         * @see era.foss.rif.impl.RifPackageImpl#getSpecObject()
         * @generated
         */
        EClass SPEC_OBJECT = eINSTANCE.getSpecObject();
        /**
         * The meta object literal for the '{@link era.foss.rif.impl.SpecTypeImpl <em>Spec Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.rif.impl.SpecTypeImpl
         * @see era.foss.rif.impl.RifPackageImpl#getSpecType()
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
         * @see era.foss.rif.impl.RifPackageImpl#getMap()
         * @generated
         */
        EClass MAP = eINSTANCE.getMap();
        /**
         * The meta object literal for the '{@link era.foss.rif.impl.AttributeValueSimpleImpl <em>Attribute Value Simple</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.rif.impl.AttributeValueSimpleImpl
         * @see era.foss.rif.impl.RifPackageImpl#getAttributeValueSimple()
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
         * The meta object literal for the '{@link era.foss.rif.impl.DatatypeDefinitionIntegerImpl <em>Datatype Definition Integer</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.rif.impl.DatatypeDefinitionIntegerImpl
         * @see era.foss.rif.impl.RifPackageImpl#getDatatypeDefinitionInteger()
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
         * The meta object literal for the '{@link era.foss.rif.impl.DatatypeDefinitionSimpleImpl <em>Datatype Definition Simple</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.rif.impl.DatatypeDefinitionSimpleImpl
         * @see era.foss.rif.impl.RifPackageImpl#getDatatypeDefinitionSimple()
         * @generated
         */
        EClass DATATYPE_DEFINITION_SIMPLE = eINSTANCE.getDatatypeDefinitionSimple();
        /**
         * The meta object literal for the '{@link era.foss.rif.impl.DatatypeDefinitionStringImpl <em>Datatype Definition String</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.rif.impl.DatatypeDefinitionStringImpl
         * @see era.foss.rif.impl.RifPackageImpl#getDatatypeDefinitionString()
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
         * The meta object literal for the '{@link era.foss.rif.impl.RIFContentImpl <em>RIF Content</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.rif.impl.RIFContentImpl
         * @see era.foss.rif.impl.RifPackageImpl#getRIFContent()
         * @generated
         */
        EClass RIF_CONTENT = eINSTANCE.getRIFContent();
        /**
         * The meta object literal for the '<em><b>Spec Objects</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RIF_CONTENT__SPEC_OBJECTS = eINSTANCE.getRIFContent_SpecObjects();
        /**
         * The meta object literal for the '<em><b>Spec Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RIF_CONTENT__SPEC_TYPES = eINSTANCE.getRIFContent_SpecTypes();
        /**
         * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RIF_CONTENT__DATA_TYPES = eINSTANCE.getRIFContent_DataTypes();
        /**
         * The meta object literal for the '{@link era.foss.rif.impl.IdentifiableImpl <em>Identifiable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.rif.impl.IdentifiableImpl
         * @see era.foss.rif.impl.RifPackageImpl#getIdentifiable()
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
         * The meta object literal for the '{@link era.foss.rif.impl.AttributeDefinitionSimpleImpl <em>Attribute Definition Simple</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see era.foss.rif.impl.AttributeDefinitionSimpleImpl
         * @see era.foss.rif.impl.RifPackageImpl#getAttributeDefinitionSimple()
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

    }

} //RifPackage
