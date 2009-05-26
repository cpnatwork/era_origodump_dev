/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.ACCESSPOLICYACCESSMODEENUM;
import era.foss.model.core.rif.AccessPolicies;
import era.foss.model.core.rif.AccessPolicy;
import era.foss.model.core.rif.AccessPolicyRelationGroups;
import era.foss.model.core.rif.AccessPolicySpecGroups;
import era.foss.model.core.rif.AccessPolicySpecHierarchyRoots;
import era.foss.model.core.rif.AccessPolicySpecObjects;
import era.foss.model.core.rif.AccessPolicySpecRelations;
import era.foss.model.core.rif.AccessPolicySpecTypes;
import era.foss.model.core.rif.AttributeDefinitionComplex;
import era.foss.model.core.rif.AttributeDefinitionComplexDefaultValue;
import era.foss.model.core.rif.AttributeDefinitionComplexType;
import era.foss.model.core.rif.AttributeDefinitionEnumeration;
import era.foss.model.core.rif.AttributeDefinitionEnumerationDefaultValue;
import era.foss.model.core.rif.AttributeDefinitionEnumerationType;
import era.foss.model.core.rif.AttributeDefinitionSimple;
import era.foss.model.core.rif.AttributeDefinitionSimpleDefaultValue;
import era.foss.model.core.rif.AttributeDefinitionSimpleType;
import era.foss.model.core.rif.AttributeDefinitions;
import era.foss.model.core.rif.AttributeValueEmbeddedDocument;
import era.foss.model.core.rif.AttributeValueEmbeddedDocumentDefinition;
import era.foss.model.core.rif.AttributeValueEmbeddedDocumentXhtmlContent;
import era.foss.model.core.rif.AttributeValueEmbeddedFile;
import era.foss.model.core.rif.AttributeValueEmbeddedFileBinaryContent;
import era.foss.model.core.rif.AttributeValueEmbeddedFileDefinition;
import era.foss.model.core.rif.AttributeValueEnumeration;
import era.foss.model.core.rif.AttributeValueEnumerationDefinition;
import era.foss.model.core.rif.AttributeValueEnumerationValues;
import era.foss.model.core.rif.AttributeValueFileReference;
import era.foss.model.core.rif.AttributeValueFileReferenceDefinition;
import era.foss.model.core.rif.AttributeValueSimple;
import era.foss.model.core.rif.AttributeValueSimpleDefinition;
import era.foss.model.core.rif.AttributeValueXmlData;
import era.foss.model.core.rif.AttributeValueXmlDataDefinition;
import era.foss.model.core.rif.AttributeValueXmlDataXmlContent;
import era.foss.model.core.rif.AttributeValues;
import era.foss.model.core.rif.BOOLEAN;
import era.foss.model.core.rif.BinaryContent;
import era.foss.model.core.rif.DATATYPEDEFINITIONDOCUMENTFORMATENUM;
import era.foss.model.core.rif.DatatypeDefinitionBinaryFile;
import era.foss.model.core.rif.DatatypeDefinitionBoolean;
import era.foss.model.core.rif.DatatypeDefinitionDocument;
import era.foss.model.core.rif.DatatypeDefinitionEnumeration;
import era.foss.model.core.rif.DatatypeDefinitionInteger;
import era.foss.model.core.rif.DatatypeDefinitionReal;
import era.foss.model.core.rif.DatatypeDefinitionString;
import era.foss.model.core.rif.DatatypeDefinitionXmlData;
import era.foss.model.core.rif.DatatypeDefinitions;
import era.foss.model.core.rif.Datatypes;
import era.foss.model.core.rif.DefaultValue2;
import era.foss.model.core.rif.DefaultValue3;
import era.foss.model.core.rif.DefaultValue4;
import era.foss.model.core.rif.DocumentRoot;
import era.foss.model.core.rif.EmbeddedValue;
import era.foss.model.core.rif.EnumValue;
import era.foss.model.core.rif.Properties;
import era.foss.model.core.rif.RelationGroup;
import era.foss.model.core.rif.RelationGroupSpecRelations;
import era.foss.model.core.rif.RelationType;
import era.foss.model.core.rif.Rif;
import era.foss.model.core.rif.RifFactory;
import era.foss.model.core.rif.RifPackage;
import era.foss.model.core.rif.RifSpecGroups;
import era.foss.model.core.rif.RifSpecHierarchyRoots;
import era.foss.model.core.rif.RifSpecObjects;
import era.foss.model.core.rif.RifSpecRelations;
import era.foss.model.core.rif.RifSpecTypes;
import era.foss.model.core.rif.Source;
import era.foss.model.core.rif.SpecAttributes;
import era.foss.model.core.rif.SpecGroup;
import era.foss.model.core.rif.SpecGroupRelationGroups;
import era.foss.model.core.rif.SpecGroupSpecObjects;
import era.foss.model.core.rif.SpecGroupType;
import era.foss.model.core.rif.SpecGroupValues;
import era.foss.model.core.rif.SpecHierarchies;
import era.foss.model.core.rif.SpecHierarchy;
import era.foss.model.core.rif.SpecHierarchyChildren;
import era.foss.model.core.rif.SpecHierarchyRoot;
import era.foss.model.core.rif.SpecHierarchyRootChildren;
import era.foss.model.core.rif.SpecHierarchyRootType;
import era.foss.model.core.rif.SpecHierarchyRootValues;
import era.foss.model.core.rif.SpecObject;
import era.foss.model.core.rif.SpecObjectType;
import era.foss.model.core.rif.SpecObjectValues;
import era.foss.model.core.rif.SpecRelation;
import era.foss.model.core.rif.SpecRelationType;
import era.foss.model.core.rif.SpecRelationValues;
import era.foss.model.core.rif.SpecType;
import era.foss.model.core.rif.SpecifiedValues;
import era.foss.model.core.rif.Target;
import era.foss.model.core.rif.TargetGroup;
import era.foss.model.core.rif.XhtmlContent;
import era.foss.model.core.rif.XmlContentXmlContent;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RifFactoryImpl extends EFactoryImpl implements RifFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static RifFactory init() {
        try {
            RifFactory theRifFactory = (RifFactory)EPackage.Registry.INSTANCE.getEFactory( "http://automotive-his.de/schema/rif" );
            if( theRifFactory != null ) {
                return theRifFactory;
            }
        } catch( Exception exception ) {
            EcorePlugin.INSTANCE.log( exception );
        }
        return new RifFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RifFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject create( EClass eClass ) {
        switch (eClass.getClassifierID()) {
        case RifPackage.ACCESS_POLICIES:
            return createAccessPolicies();
        case RifPackage.ACCESS_POLICY:
            return createAccessPolicy();
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX:
            return createAttributeDefinitionComplex();
        case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION:
            return createAttributeDefinitionEnumeration();
        case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE:
            return createAttributeDefinitionSimple();
        case RifPackage.ATTRIBUTE_DEFINITIONS:
            return createAttributeDefinitions();
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT:
            return createAttributeValueEmbeddedDocument();
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE:
            return createAttributeValueEmbeddedFile();
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION:
            return createAttributeValueEnumeration();
        case RifPackage.ATTRIBUTE_VALUE_FILE_REFERENCE:
            return createAttributeValueFileReference();
        case RifPackage.ATTRIBUTE_VALUE_SIMPLE:
            return createAttributeValueSimple();
        case RifPackage.ATTRIBUTE_VALUES:
            return createAttributeValues();
        case RifPackage.ATTRIBUTE_VALUE_XML_DATA:
            return createAttributeValueXmlData();
        case RifPackage.BINARY_CONTENT:
            return createBinaryContent();
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE_BINARY_CONTENT:
            return createAttributeValueEmbeddedFileBinaryContent();
        case RifPackage.SPEC_HIERARCHY_CHILDREN:
            return createSpecHierarchyChildren();
        case RifPackage.SPEC_HIERARCHY_ROOT_CHILDREN:
            return createSpecHierarchyRootChildren();
        case RifPackage.DATATYPE_DEFINITION_BINARY_FILE:
            return createDatatypeDefinitionBinaryFile();
        case RifPackage.DATATYPE_DEFINITION_BOOLEAN:
            return createDatatypeDefinitionBoolean();
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT:
            return createDatatypeDefinitionDocument();
        case RifPackage.DATATYPE_DEFINITION_ENUMERATION:
            return createDatatypeDefinitionEnumeration();
        case RifPackage.DATATYPE_DEFINITION_INTEGER:
            return createDatatypeDefinitionInteger();
        case RifPackage.DATATYPE_DEFINITION_REAL:
            return createDatatypeDefinitionReal();
        case RifPackage.DATATYPE_DEFINITION_STRING:
            return createDatatypeDefinitionString();
        case RifPackage.DATATYPE_DEFINITIONS:
            return createDatatypeDefinitions();
        case RifPackage.DATATYPE_DEFINITION_XML_DATA:
            return createDatatypeDefinitionXmlData();
        case RifPackage.DATATYPES:
            return createDatatypes();
        case RifPackage.DEFAULT_VALUE2:
            return createDefaultValue2();
        case RifPackage.DEFAULT_VALUE3:
            return createDefaultValue3();
        case RifPackage.DEFAULT_VALUE4:
            return createDefaultValue4();
        case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_DEFAULT_VALUE:
            return createAttributeDefinitionSimpleDefaultValue();
        case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION_DEFAULT_VALUE:
            return createAttributeDefinitionEnumerationDefaultValue();
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_DEFAULT_VALUE:
            return createAttributeDefinitionComplexDefaultValue();
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT_DEFINITION:
            return createAttributeValueEmbeddedDocumentDefinition();
        case RifPackage.ATTRIBUTE_VALUE_FILE_REFERENCE_DEFINITION:
            return createAttributeValueFileReferenceDefinition();
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE_DEFINITION:
            return createAttributeValueEmbeddedFileDefinition();
        case RifPackage.ATTRIBUTE_VALUE_SIMPLE_DEFINITION:
            return createAttributeValueSimpleDefinition();
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION_DEFINITION:
            return createAttributeValueEnumerationDefinition();
        case RifPackage.ATTRIBUTE_VALUE_XML_DATA_DEFINITION:
            return createAttributeValueXmlDataDefinition();
        case RifPackage.DOCUMENT_ROOT:
            return createDocumentRoot();
        case RifPackage.EMBEDDED_VALUE:
            return createEmbeddedValue();
        case RifPackage.ENUM_VALUE:
            return createEnumValue();
        case RifPackage.OBJECT:
            return createObject();
        case RifPackage.PROPERTIES:
            return createProperties();
        case RifPackage.SPEC_GROUP_RELATION_GROUPS:
            return createSpecGroupRelationGroups();
        case RifPackage.ACCESS_POLICY_RELATION_GROUPS:
            return createAccessPolicyRelationGroups();
        case RifPackage.RELATION_GROUP:
            return createRelationGroup();
        case RifPackage.RELATION_TYPE:
            return createRelationType();
        case RifPackage.RIF:
            return createRif();
        case RifPackage.SOURCE:
            return createSource();
        case RifPackage.SPEC_ATTRIBUTES:
            return createSpecAttributes();
        case RifPackage.RIF_SPEC_GROUPS:
            return createRifSpecGroups();
        case RifPackage.ACCESS_POLICY_SPEC_GROUPS:
            return createAccessPolicySpecGroups();
        case RifPackage.SPEC_GROUP:
            return createSpecGroup();
        case RifPackage.SPEC_HIERARCHIES:
            return createSpecHierarchies();
        case RifPackage.RIF_SPEC_HIERARCHY_ROOTS:
            return createRifSpecHierarchyRoots();
        case RifPackage.ACCESS_POLICY_SPEC_HIERARCHY_ROOTS:
            return createAccessPolicySpecHierarchyRoots();
        case RifPackage.SPEC_HIERARCHY_ROOT:
            return createSpecHierarchyRoot();
        case RifPackage.SPEC_HIERARCHY:
            return createSpecHierarchy();
        case RifPackage.SPECIFIED_VALUES:
            return createSpecifiedValues();
        case RifPackage.SPEC_GROUP_SPEC_OBJECTS:
            return createSpecGroupSpecObjects();
        case RifPackage.RIF_SPEC_OBJECTS:
            return createRifSpecObjects();
        case RifPackage.ACCESS_POLICY_SPEC_OBJECTS:
            return createAccessPolicySpecObjects();
        case RifPackage.SPEC_OBJECT:
            return createSpecObject();
        case RifPackage.RIF_SPEC_RELATIONS:
            return createRifSpecRelations();
        case RifPackage.RELATION_GROUP_SPEC_RELATIONS:
            return createRelationGroupSpecRelations();
        case RifPackage.ACCESS_POLICY_SPEC_RELATIONS:
            return createAccessPolicySpecRelations();
        case RifPackage.SPEC_RELATION:
            return createSpecRelation();
        case RifPackage.RIF_SPEC_TYPES:
            return createRifSpecTypes();
        case RifPackage.ACCESS_POLICY_SPEC_TYPES:
            return createAccessPolicySpecTypes();
        case RifPackage.SPEC_TYPE:
            return createSpecType();
        case RifPackage.TARGET_GROUP:
            return createTargetGroup();
        case RifPackage.TARGET:
            return createTarget();
        case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_TYPE:
            return createAttributeDefinitionSimpleType();
        case RifPackage.SPEC_RELATION_TYPE:
            return createSpecRelationType();
        case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION_TYPE:
            return createAttributeDefinitionEnumerationType();
        case RifPackage.SPEC_OBJECT_TYPE:
            return createSpecObjectType();
        case RifPackage.SPEC_HIERARCHY_ROOT_TYPE:
            return createSpecHierarchyRootType();
        case RifPackage.SPEC_GROUP_TYPE:
            return createSpecGroupType();
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_TYPE:
            return createAttributeDefinitionComplexType();
        case RifPackage.SPEC_OBJECT_VALUES:
            return createSpecObjectValues();
        case RifPackage.SPEC_RELATION_VALUES:
            return createSpecRelationValues();
        case RifPackage.SPEC_GROUP_VALUES:
            return createSpecGroupValues();
        case RifPackage.SPEC_HIERARCHY_ROOT_VALUES:
            return createSpecHierarchyRootValues();
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION_VALUES:
            return createAttributeValueEnumerationValues();
        case RifPackage.XHTML_CONTENT:
            return createXhtmlContent();
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT_XHTML_CONTENT:
            return createAttributeValueEmbeddedDocumentXhtmlContent();
        case RifPackage.XML_CONTENT_XML_CONTENT:
            return createXmlContentXmlContent();
        case RifPackage.ATTRIBUTE_VALUE_XML_DATA_XML_CONTENT:
            return createAttributeValueXmlDataXmlContent();
        default:
            throw new IllegalArgumentException( "The class '" + eClass.getName() + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createFromString( EDataType eDataType, String initialValue ) {
        switch (eDataType.getClassifierID()) {
        case RifPackage.ACCESSPOLICYACCESSMODEENUM:
            return createACCESSPOLICYACCESSMODEENUMFromString( eDataType, initialValue );
        case RifPackage.BOOLEAN:
            return createBOOLEANFromString( eDataType, initialValue );
        case RifPackage.DATATYPEDEFINITIONDOCUMENTFORMATENUM:
            return createDATATYPEDEFINITIONDOCUMENTFORMATENUMFromString( eDataType, initialValue );
        case RifPackage.ACCESSPOLICYACCESSMODEENUM_OBJECT:
            return createACCESSPOLICYACCESSMODEENUMObjectFromString( eDataType, initialValue );
        case RifPackage.BOOLEAN_OBJECT:
            return createBOOLEANObjectFromString( eDataType, initialValue );
        case RifPackage.DATATYPEDEFINITIONDOCUMENTFORMATENUM_OBJECT:
            return createDATATYPEDEFINITIONDOCUMENTFORMATENUMObjectFromString( eDataType, initialValue );
        case RifPackage.FLOAT:
            return createFLOATFromString( eDataType, initialValue );
        case RifPackage.FLOAT_OBJECT:
            return createFLOATObjectFromString( eDataType, initialValue );
        case RifPackage.INTEGER:
            return createINTEGERFromString( eDataType, initialValue );
        case RifPackage.REF:
            return createREFFromString( eDataType, initialValue );
        case RifPackage.STRING:
            return createSTRINGFromString( eDataType, initialValue );
        default:
            throw new IllegalArgumentException( "The datatype '"
                + eDataType.getName()
                + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertToString( EDataType eDataType, Object instanceValue ) {
        switch (eDataType.getClassifierID()) {
        case RifPackage.ACCESSPOLICYACCESSMODEENUM:
            return convertACCESSPOLICYACCESSMODEENUMToString( eDataType, instanceValue );
        case RifPackage.BOOLEAN:
            return convertBOOLEANToString( eDataType, instanceValue );
        case RifPackage.DATATYPEDEFINITIONDOCUMENTFORMATENUM:
            return convertDATATYPEDEFINITIONDOCUMENTFORMATENUMToString( eDataType, instanceValue );
        case RifPackage.ACCESSPOLICYACCESSMODEENUM_OBJECT:
            return convertACCESSPOLICYACCESSMODEENUMObjectToString( eDataType, instanceValue );
        case RifPackage.BOOLEAN_OBJECT:
            return convertBOOLEANObjectToString( eDataType, instanceValue );
        case RifPackage.DATATYPEDEFINITIONDOCUMENTFORMATENUM_OBJECT:
            return convertDATATYPEDEFINITIONDOCUMENTFORMATENUMObjectToString( eDataType, instanceValue );
        case RifPackage.FLOAT:
            return convertFLOATToString( eDataType, instanceValue );
        case RifPackage.FLOAT_OBJECT:
            return convertFLOATObjectToString( eDataType, instanceValue );
        case RifPackage.INTEGER:
            return convertINTEGERToString( eDataType, instanceValue );
        case RifPackage.REF:
            return convertREFToString( eDataType, instanceValue );
        case RifPackage.STRING:
            return convertSTRINGToString( eDataType, instanceValue );
        default:
            throw new IllegalArgumentException( "The datatype '"
                + eDataType.getName()
                + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AccessPolicies createAccessPolicies() {
        AccessPoliciesImpl accessPolicies = new AccessPoliciesImpl();
        return accessPolicies;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AccessPolicy createAccessPolicy() {
        AccessPolicyImpl accessPolicy = new AccessPolicyImpl();
        return accessPolicy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeDefinitionComplex createAttributeDefinitionComplex() {
        AttributeDefinitionComplexImpl attributeDefinitionComplex = new AttributeDefinitionComplexImpl();
        return attributeDefinitionComplex;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeDefinitionEnumeration createAttributeDefinitionEnumeration() {
        AttributeDefinitionEnumerationImpl attributeDefinitionEnumeration = new AttributeDefinitionEnumerationImpl();
        return attributeDefinitionEnumeration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeDefinitionSimple createAttributeDefinitionSimple() {
        AttributeDefinitionSimpleImpl attributeDefinitionSimple = new AttributeDefinitionSimpleImpl();
        return attributeDefinitionSimple;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeDefinitions createAttributeDefinitions() {
        AttributeDefinitionsImpl attributeDefinitions = new AttributeDefinitionsImpl();
        return attributeDefinitions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueEmbeddedDocument createAttributeValueEmbeddedDocument() {
        AttributeValueEmbeddedDocumentImpl attributeValueEmbeddedDocument = new AttributeValueEmbeddedDocumentImpl();
        return attributeValueEmbeddedDocument;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueEmbeddedFile createAttributeValueEmbeddedFile() {
        AttributeValueEmbeddedFileImpl attributeValueEmbeddedFile = new AttributeValueEmbeddedFileImpl();
        return attributeValueEmbeddedFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueEnumeration createAttributeValueEnumeration() {
        AttributeValueEnumerationImpl attributeValueEnumeration = new AttributeValueEnumerationImpl();
        return attributeValueEnumeration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueFileReference createAttributeValueFileReference() {
        AttributeValueFileReferenceImpl attributeValueFileReference = new AttributeValueFileReferenceImpl();
        return attributeValueFileReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueSimple createAttributeValueSimple() {
        AttributeValueSimpleImpl attributeValueSimple = new AttributeValueSimpleImpl();
        return attributeValueSimple;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValues createAttributeValues() {
        AttributeValuesImpl attributeValues = new AttributeValuesImpl();
        return attributeValues;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueXmlData createAttributeValueXmlData() {
        AttributeValueXmlDataImpl attributeValueXmlData = new AttributeValueXmlDataImpl();
        return attributeValueXmlData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BinaryContent createBinaryContent() {
        BinaryContentImpl binaryContent = new BinaryContentImpl();
        return binaryContent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueEmbeddedFileBinaryContent createAttributeValueEmbeddedFileBinaryContent() {
        AttributeValueEmbeddedFileBinaryContentImpl attributeValueEmbeddedFileBinaryContent = new AttributeValueEmbeddedFileBinaryContentImpl();
        return attributeValueEmbeddedFileBinaryContent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecHierarchyChildren createSpecHierarchyChildren() {
        SpecHierarchyChildrenImpl specHierarchyChildren = new SpecHierarchyChildrenImpl();
        return specHierarchyChildren;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecHierarchyRootChildren createSpecHierarchyRootChildren() {
        SpecHierarchyRootChildrenImpl specHierarchyRootChildren = new SpecHierarchyRootChildrenImpl();
        return specHierarchyRootChildren;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeDefinitionBinaryFile createDatatypeDefinitionBinaryFile() {
        DatatypeDefinitionBinaryFileImpl datatypeDefinitionBinaryFile = new DatatypeDefinitionBinaryFileImpl();
        return datatypeDefinitionBinaryFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeDefinitionBoolean createDatatypeDefinitionBoolean() {
        DatatypeDefinitionBooleanImpl datatypeDefinitionBoolean = new DatatypeDefinitionBooleanImpl();
        return datatypeDefinitionBoolean;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeDefinitionDocument createDatatypeDefinitionDocument() {
        DatatypeDefinitionDocumentImpl datatypeDefinitionDocument = new DatatypeDefinitionDocumentImpl();
        return datatypeDefinitionDocument;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeDefinitionEnumeration createDatatypeDefinitionEnumeration() {
        DatatypeDefinitionEnumerationImpl datatypeDefinitionEnumeration = new DatatypeDefinitionEnumerationImpl();
        return datatypeDefinitionEnumeration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeDefinitionInteger createDatatypeDefinitionInteger() {
        DatatypeDefinitionIntegerImpl datatypeDefinitionInteger = new DatatypeDefinitionIntegerImpl();
        return datatypeDefinitionInteger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeDefinitionReal createDatatypeDefinitionReal() {
        DatatypeDefinitionRealImpl datatypeDefinitionReal = new DatatypeDefinitionRealImpl();
        return datatypeDefinitionReal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeDefinitionString createDatatypeDefinitionString() {
        DatatypeDefinitionStringImpl datatypeDefinitionString = new DatatypeDefinitionStringImpl();
        return datatypeDefinitionString;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeDefinitions createDatatypeDefinitions() {
        DatatypeDefinitionsImpl datatypeDefinitions = new DatatypeDefinitionsImpl();
        return datatypeDefinitions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeDefinitionXmlData createDatatypeDefinitionXmlData() {
        DatatypeDefinitionXmlDataImpl datatypeDefinitionXmlData = new DatatypeDefinitionXmlDataImpl();
        return datatypeDefinitionXmlData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Datatypes createDatatypes() {
        DatatypesImpl datatypes = new DatatypesImpl();
        return datatypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefaultValue2 createDefaultValue2() {
        DefaultValue2Impl defaultValue2 = new DefaultValue2Impl();
        return defaultValue2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefaultValue3 createDefaultValue3() {
        DefaultValue3Impl defaultValue3 = new DefaultValue3Impl();
        return defaultValue3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefaultValue4 createDefaultValue4() {
        DefaultValue4Impl defaultValue4 = new DefaultValue4Impl();
        return defaultValue4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeDefinitionSimpleDefaultValue createAttributeDefinitionSimpleDefaultValue() {
        AttributeDefinitionSimpleDefaultValueImpl attributeDefinitionSimpleDefaultValue = new AttributeDefinitionSimpleDefaultValueImpl();
        return attributeDefinitionSimpleDefaultValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeDefinitionEnumerationDefaultValue createAttributeDefinitionEnumerationDefaultValue() {
        AttributeDefinitionEnumerationDefaultValueImpl attributeDefinitionEnumerationDefaultValue = new AttributeDefinitionEnumerationDefaultValueImpl();
        return attributeDefinitionEnumerationDefaultValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeDefinitionComplexDefaultValue createAttributeDefinitionComplexDefaultValue() {
        AttributeDefinitionComplexDefaultValueImpl attributeDefinitionComplexDefaultValue = new AttributeDefinitionComplexDefaultValueImpl();
        return attributeDefinitionComplexDefaultValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueEmbeddedDocumentDefinition createAttributeValueEmbeddedDocumentDefinition() {
        AttributeValueEmbeddedDocumentDefinitionImpl attributeValueEmbeddedDocumentDefinition = new AttributeValueEmbeddedDocumentDefinitionImpl();
        return attributeValueEmbeddedDocumentDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueFileReferenceDefinition createAttributeValueFileReferenceDefinition() {
        AttributeValueFileReferenceDefinitionImpl attributeValueFileReferenceDefinition = new AttributeValueFileReferenceDefinitionImpl();
        return attributeValueFileReferenceDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueEmbeddedFileDefinition createAttributeValueEmbeddedFileDefinition() {
        AttributeValueEmbeddedFileDefinitionImpl attributeValueEmbeddedFileDefinition = new AttributeValueEmbeddedFileDefinitionImpl();
        return attributeValueEmbeddedFileDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueSimpleDefinition createAttributeValueSimpleDefinition() {
        AttributeValueSimpleDefinitionImpl attributeValueSimpleDefinition = new AttributeValueSimpleDefinitionImpl();
        return attributeValueSimpleDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueEnumerationDefinition createAttributeValueEnumerationDefinition() {
        AttributeValueEnumerationDefinitionImpl attributeValueEnumerationDefinition = new AttributeValueEnumerationDefinitionImpl();
        return attributeValueEnumerationDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueXmlDataDefinition createAttributeValueXmlDataDefinition() {
        AttributeValueXmlDataDefinitionImpl attributeValueXmlDataDefinition = new AttributeValueXmlDataDefinitionImpl();
        return attributeValueXmlDataDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EmbeddedValue createEmbeddedValue() {
        EmbeddedValueImpl embeddedValue = new EmbeddedValueImpl();
        return embeddedValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EnumValue createEnumValue() {
        EnumValueImpl enumValue = new EnumValueImpl();
        return enumValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public era.foss.model.core.rif.Object createObject() {
        ObjectImpl object = new ObjectImpl();
        return object;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Properties createProperties() {
        PropertiesImpl properties = new PropertiesImpl();
        return properties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecGroupRelationGroups createSpecGroupRelationGroups() {
        SpecGroupRelationGroupsImpl specGroupRelationGroups = new SpecGroupRelationGroupsImpl();
        return specGroupRelationGroups;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AccessPolicyRelationGroups createAccessPolicyRelationGroups() {
        AccessPolicyRelationGroupsImpl accessPolicyRelationGroups = new AccessPolicyRelationGroupsImpl();
        return accessPolicyRelationGroups;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelationGroup createRelationGroup() {
        RelationGroupImpl relationGroup = new RelationGroupImpl();
        return relationGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelationType createRelationType() {
        RelationTypeImpl relationType = new RelationTypeImpl();
        return relationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Rif createRif() {
        RifImpl rif = new RifImpl();
        return rif;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Source createSource() {
        SourceImpl source = new SourceImpl();
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecAttributes createSpecAttributes() {
        SpecAttributesImpl specAttributes = new SpecAttributesImpl();
        return specAttributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RifSpecGroups createRifSpecGroups() {
        RifSpecGroupsImpl rifSpecGroups = new RifSpecGroupsImpl();
        return rifSpecGroups;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AccessPolicySpecGroups createAccessPolicySpecGroups() {
        AccessPolicySpecGroupsImpl accessPolicySpecGroups = new AccessPolicySpecGroupsImpl();
        return accessPolicySpecGroups;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecGroup createSpecGroup() {
        SpecGroupImpl specGroup = new SpecGroupImpl();
        return specGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecHierarchies createSpecHierarchies() {
        SpecHierarchiesImpl specHierarchies = new SpecHierarchiesImpl();
        return specHierarchies;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RifSpecHierarchyRoots createRifSpecHierarchyRoots() {
        RifSpecHierarchyRootsImpl rifSpecHierarchyRoots = new RifSpecHierarchyRootsImpl();
        return rifSpecHierarchyRoots;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AccessPolicySpecHierarchyRoots createAccessPolicySpecHierarchyRoots() {
        AccessPolicySpecHierarchyRootsImpl accessPolicySpecHierarchyRoots = new AccessPolicySpecHierarchyRootsImpl();
        return accessPolicySpecHierarchyRoots;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecHierarchyRoot createSpecHierarchyRoot() {
        SpecHierarchyRootImpl specHierarchyRoot = new SpecHierarchyRootImpl();
        return specHierarchyRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecHierarchy createSpecHierarchy() {
        SpecHierarchyImpl specHierarchy = new SpecHierarchyImpl();
        return specHierarchy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecifiedValues createSpecifiedValues() {
        SpecifiedValuesImpl specifiedValues = new SpecifiedValuesImpl();
        return specifiedValues;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecGroupSpecObjects createSpecGroupSpecObjects() {
        SpecGroupSpecObjectsImpl specGroupSpecObjects = new SpecGroupSpecObjectsImpl();
        return specGroupSpecObjects;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RifSpecObjects createRifSpecObjects() {
        RifSpecObjectsImpl rifSpecObjects = new RifSpecObjectsImpl();
        return rifSpecObjects;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AccessPolicySpecObjects createAccessPolicySpecObjects() {
        AccessPolicySpecObjectsImpl accessPolicySpecObjects = new AccessPolicySpecObjectsImpl();
        return accessPolicySpecObjects;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecObject createSpecObject() {
        SpecObjectImpl specObject = new SpecObjectImpl();
        return specObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RifSpecRelations createRifSpecRelations() {
        RifSpecRelationsImpl rifSpecRelations = new RifSpecRelationsImpl();
        return rifSpecRelations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelationGroupSpecRelations createRelationGroupSpecRelations() {
        RelationGroupSpecRelationsImpl relationGroupSpecRelations = new RelationGroupSpecRelationsImpl();
        return relationGroupSpecRelations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AccessPolicySpecRelations createAccessPolicySpecRelations() {
        AccessPolicySpecRelationsImpl accessPolicySpecRelations = new AccessPolicySpecRelationsImpl();
        return accessPolicySpecRelations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecRelation createSpecRelation() {
        SpecRelationImpl specRelation = new SpecRelationImpl();
        return specRelation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RifSpecTypes createRifSpecTypes() {
        RifSpecTypesImpl rifSpecTypes = new RifSpecTypesImpl();
        return rifSpecTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AccessPolicySpecTypes createAccessPolicySpecTypes() {
        AccessPolicySpecTypesImpl accessPolicySpecTypes = new AccessPolicySpecTypesImpl();
        return accessPolicySpecTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecType createSpecType() {
        SpecTypeImpl specType = new SpecTypeImpl();
        return specType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TargetGroup createTargetGroup() {
        TargetGroupImpl targetGroup = new TargetGroupImpl();
        return targetGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Target createTarget() {
        TargetImpl target = new TargetImpl();
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeDefinitionSimpleType createAttributeDefinitionSimpleType() {
        AttributeDefinitionSimpleTypeImpl attributeDefinitionSimpleType = new AttributeDefinitionSimpleTypeImpl();
        return attributeDefinitionSimpleType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecRelationType createSpecRelationType() {
        SpecRelationTypeImpl specRelationType = new SpecRelationTypeImpl();
        return specRelationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeDefinitionEnumerationType createAttributeDefinitionEnumerationType() {
        AttributeDefinitionEnumerationTypeImpl attributeDefinitionEnumerationType = new AttributeDefinitionEnumerationTypeImpl();
        return attributeDefinitionEnumerationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecObjectType createSpecObjectType() {
        SpecObjectTypeImpl specObjectType = new SpecObjectTypeImpl();
        return specObjectType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecHierarchyRootType createSpecHierarchyRootType() {
        SpecHierarchyRootTypeImpl specHierarchyRootType = new SpecHierarchyRootTypeImpl();
        return specHierarchyRootType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecGroupType createSpecGroupType() {
        SpecGroupTypeImpl specGroupType = new SpecGroupTypeImpl();
        return specGroupType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeDefinitionComplexType createAttributeDefinitionComplexType() {
        AttributeDefinitionComplexTypeImpl attributeDefinitionComplexType = new AttributeDefinitionComplexTypeImpl();
        return attributeDefinitionComplexType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecObjectValues createSpecObjectValues() {
        SpecObjectValuesImpl specObjectValues = new SpecObjectValuesImpl();
        return specObjectValues;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecRelationValues createSpecRelationValues() {
        SpecRelationValuesImpl specRelationValues = new SpecRelationValuesImpl();
        return specRelationValues;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecGroupValues createSpecGroupValues() {
        SpecGroupValuesImpl specGroupValues = new SpecGroupValuesImpl();
        return specGroupValues;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecHierarchyRootValues createSpecHierarchyRootValues() {
        SpecHierarchyRootValuesImpl specHierarchyRootValues = new SpecHierarchyRootValuesImpl();
        return specHierarchyRootValues;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueEnumerationValues createAttributeValueEnumerationValues() {
        AttributeValueEnumerationValuesImpl attributeValueEnumerationValues = new AttributeValueEnumerationValuesImpl();
        return attributeValueEnumerationValues;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XhtmlContent createXhtmlContent() {
        XhtmlContentImpl xhtmlContent = new XhtmlContentImpl();
        return xhtmlContent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueEmbeddedDocumentXhtmlContent createAttributeValueEmbeddedDocumentXhtmlContent() {
        AttributeValueEmbeddedDocumentXhtmlContentImpl attributeValueEmbeddedDocumentXhtmlContent = new AttributeValueEmbeddedDocumentXhtmlContentImpl();
        return attributeValueEmbeddedDocumentXhtmlContent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XmlContentXmlContent createXmlContentXmlContent() {
        XmlContentXmlContentImpl xmlContentXmlContent = new XmlContentXmlContentImpl();
        return xmlContentXmlContent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueXmlDataXmlContent createAttributeValueXmlDataXmlContent() {
        AttributeValueXmlDataXmlContentImpl attributeValueXmlDataXmlContent = new AttributeValueXmlDataXmlContentImpl();
        return attributeValueXmlDataXmlContent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ACCESSPOLICYACCESSMODEENUM createACCESSPOLICYACCESSMODEENUMFromString( EDataType eDataType,
                                                                                  String initialValue ) {
        ACCESSPOLICYACCESSMODEENUM result = ACCESSPOLICYACCESSMODEENUM.get( initialValue );
        if( result == null ) throw new IllegalArgumentException( "The value '"
            + initialValue
            + "' is not a valid enumerator of '"
            + eDataType.getName()
            + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertACCESSPOLICYACCESSMODEENUMToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BOOLEAN createBOOLEANFromString( EDataType eDataType, String initialValue ) {
        BOOLEAN result = BOOLEAN.get( initialValue );
        if( result == null ) throw new IllegalArgumentException( "The value '"
            + initialValue
            + "' is not a valid enumerator of '"
            + eDataType.getName()
            + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBOOLEANToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DATATYPEDEFINITIONDOCUMENTFORMATENUM createDATATYPEDEFINITIONDOCUMENTFORMATENUMFromString( EDataType eDataType,
                                                                                                      String initialValue ) {
        DATATYPEDEFINITIONDOCUMENTFORMATENUM result = DATATYPEDEFINITIONDOCUMENTFORMATENUM.get( initialValue );
        if( result == null ) throw new IllegalArgumentException( "The value '"
            + initialValue
            + "' is not a valid enumerator of '"
            + eDataType.getName()
            + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDATATYPEDEFINITIONDOCUMENTFORMATENUMToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ACCESSPOLICYACCESSMODEENUM createACCESSPOLICYACCESSMODEENUMObjectFromString( EDataType eDataType,
                                                                                        String initialValue ) {
        return createACCESSPOLICYACCESSMODEENUMFromString( RifPackage.Literals.ACCESSPOLICYACCESSMODEENUM,
                                                           initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertACCESSPOLICYACCESSMODEENUMObjectToString( EDataType eDataType, Object instanceValue ) {
        return convertACCESSPOLICYACCESSMODEENUMToString( RifPackage.Literals.ACCESSPOLICYACCESSMODEENUM,
                                                          instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BOOLEAN createBOOLEANObjectFromString( EDataType eDataType, String initialValue ) {
        return createBOOLEANFromString( RifPackage.Literals.BOOLEAN, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBOOLEANObjectToString( EDataType eDataType, Object instanceValue ) {
        return convertBOOLEANToString( RifPackage.Literals.BOOLEAN, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DATATYPEDEFINITIONDOCUMENTFORMATENUM createDATATYPEDEFINITIONDOCUMENTFORMATENUMObjectFromString( EDataType eDataType,
                                                                                                            String initialValue ) {
        return createDATATYPEDEFINITIONDOCUMENTFORMATENUMFromString( RifPackage.Literals.DATATYPEDEFINITIONDOCUMENTFORMATENUM,
                                                                     initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDATATYPEDEFINITIONDOCUMENTFORMATENUMObjectToString( EDataType eDataType, Object instanceValue ) {
        return convertDATATYPEDEFINITIONDOCUMENTFORMATENUMToString( RifPackage.Literals.DATATYPEDEFINITIONDOCUMENTFORMATENUM,
                                                                    instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Float createFLOATFromString( EDataType eDataType, String initialValue ) {
        return (Float)XMLTypeFactory.eINSTANCE.createFromString( XMLTypePackage.Literals.FLOAT, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertFLOATToString( EDataType eDataType, Object instanceValue ) {
        return XMLTypeFactory.eINSTANCE.convertToString( XMLTypePackage.Literals.FLOAT, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Float createFLOATObjectFromString( EDataType eDataType, String initialValue ) {
        return createFLOATFromString( RifPackage.Literals.FLOAT, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertFLOATObjectToString( EDataType eDataType, Object instanceValue ) {
        return convertFLOATToString( RifPackage.Literals.FLOAT, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger createINTEGERFromString( EDataType eDataType, String initialValue ) {
        return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString( XMLTypePackage.Literals.INTEGER, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertINTEGERToString( EDataType eDataType, Object instanceValue ) {
        return XMLTypeFactory.eINSTANCE.convertToString( XMLTypePackage.Literals.INTEGER, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createREFFromString( EDataType eDataType, String initialValue ) {
        return (String)XMLTypeFactory.eINSTANCE.createFromString( XMLTypePackage.Literals.STRING, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertREFToString( EDataType eDataType, Object instanceValue ) {
        return XMLTypeFactory.eINSTANCE.convertToString( XMLTypePackage.Literals.STRING, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createSTRINGFromString( EDataType eDataType, String initialValue ) {
        return (String)XMLTypeFactory.eINSTANCE.createFromString( XMLTypePackage.Literals.STRING, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSTRINGToString( EDataType eDataType, Object instanceValue ) {
        return XMLTypeFactory.eINSTANCE.convertToString( XMLTypePackage.Literals.STRING, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RifPackage getRifPackage() {
        return (RifPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    public static RifPackage getPackage() {
        return RifPackage.eINSTANCE;
    }

} //RifFactoryImpl
