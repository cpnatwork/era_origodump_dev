/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.util;

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
import era.foss.model.core.rif.BinaryContent;
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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see era.foss.model.core.rif.RifPackage
 * @generated
 */
public class RifSwitch {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static RifPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RifSwitch() {
        if( modelPackage == null ) {
            modelPackage = RifPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public Object doSwitch( EObject theEObject ) {
        return doSwitch( theEObject.eClass(), theEObject );
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected Object doSwitch( EClass theEClass, EObject theEObject ) {
        if( theEClass.eContainer() == modelPackage ) {
            return doSwitch( theEClass.getClassifierID(), theEObject );
        } else {
            List eSuperTypes = theEClass.getESuperTypes();
            return eSuperTypes.isEmpty() ? defaultCase( theEObject ) : doSwitch( (EClass)eSuperTypes.get( 0 ),
                                                                                 theEObject );
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected Object doSwitch( int classifierID, EObject theEObject ) {
        switch (classifierID) {
        case RifPackage.ACCESS_POLICIES: {
            AccessPolicies accessPolicies = (AccessPolicies)theEObject;
            Object result = caseAccessPolicies( accessPolicies );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ACCESS_POLICY: {
            AccessPolicy accessPolicy = (AccessPolicy)theEObject;
            Object result = caseAccessPolicy( accessPolicy );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX: {
            AttributeDefinitionComplex attributeDefinitionComplex = (AttributeDefinitionComplex)theEObject;
            Object result = caseAttributeDefinitionComplex( attributeDefinitionComplex );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION: {
            AttributeDefinitionEnumeration attributeDefinitionEnumeration = (AttributeDefinitionEnumeration)theEObject;
            Object result = caseAttributeDefinitionEnumeration( attributeDefinitionEnumeration );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE: {
            AttributeDefinitionSimple attributeDefinitionSimple = (AttributeDefinitionSimple)theEObject;
            Object result = caseAttributeDefinitionSimple( attributeDefinitionSimple );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_DEFINITIONS: {
            AttributeDefinitions attributeDefinitions = (AttributeDefinitions)theEObject;
            Object result = caseAttributeDefinitions( attributeDefinitions );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT: {
            AttributeValueEmbeddedDocument attributeValueEmbeddedDocument = (AttributeValueEmbeddedDocument)theEObject;
            Object result = caseAttributeValueEmbeddedDocument( attributeValueEmbeddedDocument );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE: {
            AttributeValueEmbeddedFile attributeValueEmbeddedFile = (AttributeValueEmbeddedFile)theEObject;
            Object result = caseAttributeValueEmbeddedFile( attributeValueEmbeddedFile );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION: {
            AttributeValueEnumeration attributeValueEnumeration = (AttributeValueEnumeration)theEObject;
            Object result = caseAttributeValueEnumeration( attributeValueEnumeration );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_VALUE_FILE_REFERENCE: {
            AttributeValueFileReference attributeValueFileReference = (AttributeValueFileReference)theEObject;
            Object result = caseAttributeValueFileReference( attributeValueFileReference );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_VALUE_SIMPLE: {
            AttributeValueSimple attributeValueSimple = (AttributeValueSimple)theEObject;
            Object result = caseAttributeValueSimple( attributeValueSimple );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_VALUES: {
            AttributeValues attributeValues = (AttributeValues)theEObject;
            Object result = caseAttributeValues( attributeValues );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_VALUE_XML_DATA: {
            AttributeValueXmlData attributeValueXmlData = (AttributeValueXmlData)theEObject;
            Object result = caseAttributeValueXmlData( attributeValueXmlData );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.BINARY_CONTENT: {
            BinaryContent binaryContent = (BinaryContent)theEObject;
            Object result = caseBinaryContent( binaryContent );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE_BINARY_CONTENT: {
            AttributeValueEmbeddedFileBinaryContent attributeValueEmbeddedFileBinaryContent = (AttributeValueEmbeddedFileBinaryContent)theEObject;
            Object result = caseAttributeValueEmbeddedFileBinaryContent( attributeValueEmbeddedFileBinaryContent );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.SPEC_HIERARCHY_CHILDREN: {
            SpecHierarchyChildren specHierarchyChildren = (SpecHierarchyChildren)theEObject;
            Object result = caseSpecHierarchyChildren( specHierarchyChildren );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.SPEC_HIERARCHY_ROOT_CHILDREN: {
            SpecHierarchyRootChildren specHierarchyRootChildren = (SpecHierarchyRootChildren)theEObject;
            Object result = caseSpecHierarchyRootChildren( specHierarchyRootChildren );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.DATATYPE_DEFINITION_BINARY_FILE: {
            DatatypeDefinitionBinaryFile datatypeDefinitionBinaryFile = (DatatypeDefinitionBinaryFile)theEObject;
            Object result = caseDatatypeDefinitionBinaryFile( datatypeDefinitionBinaryFile );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.DATATYPE_DEFINITION_BOOLEAN: {
            DatatypeDefinitionBoolean datatypeDefinitionBoolean = (DatatypeDefinitionBoolean)theEObject;
            Object result = caseDatatypeDefinitionBoolean( datatypeDefinitionBoolean );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.DATATYPE_DEFINITION_DOCUMENT: {
            DatatypeDefinitionDocument datatypeDefinitionDocument = (DatatypeDefinitionDocument)theEObject;
            Object result = caseDatatypeDefinitionDocument( datatypeDefinitionDocument );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.DATATYPE_DEFINITION_ENUMERATION: {
            DatatypeDefinitionEnumeration datatypeDefinitionEnumeration = (DatatypeDefinitionEnumeration)theEObject;
            Object result = caseDatatypeDefinitionEnumeration( datatypeDefinitionEnumeration );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.DATATYPE_DEFINITION_INTEGER: {
            DatatypeDefinitionInteger datatypeDefinitionInteger = (DatatypeDefinitionInteger)theEObject;
            Object result = caseDatatypeDefinitionInteger( datatypeDefinitionInteger );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.DATATYPE_DEFINITION_REAL: {
            DatatypeDefinitionReal datatypeDefinitionReal = (DatatypeDefinitionReal)theEObject;
            Object result = caseDatatypeDefinitionReal( datatypeDefinitionReal );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.DATATYPE_DEFINITION_STRING: {
            DatatypeDefinitionString datatypeDefinitionString = (DatatypeDefinitionString)theEObject;
            Object result = caseDatatypeDefinitionString( datatypeDefinitionString );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.DATATYPE_DEFINITIONS: {
            DatatypeDefinitions datatypeDefinitions = (DatatypeDefinitions)theEObject;
            Object result = caseDatatypeDefinitions( datatypeDefinitions );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.DATATYPE_DEFINITION_XML_DATA: {
            DatatypeDefinitionXmlData datatypeDefinitionXmlData = (DatatypeDefinitionXmlData)theEObject;
            Object result = caseDatatypeDefinitionXmlData( datatypeDefinitionXmlData );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.DATATYPES: {
            Datatypes datatypes = (Datatypes)theEObject;
            Object result = caseDatatypes( datatypes );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.DEFAULT_VALUE2: {
            DefaultValue2 defaultValue2 = (DefaultValue2)theEObject;
            Object result = caseDefaultValue2( defaultValue2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.DEFAULT_VALUE3: {
            DefaultValue3 defaultValue3 = (DefaultValue3)theEObject;
            Object result = caseDefaultValue3( defaultValue3 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.DEFAULT_VALUE4: {
            DefaultValue4 defaultValue4 = (DefaultValue4)theEObject;
            Object result = caseDefaultValue4( defaultValue4 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_DEFAULT_VALUE: {
            AttributeDefinitionSimpleDefaultValue attributeDefinitionSimpleDefaultValue = (AttributeDefinitionSimpleDefaultValue)theEObject;
            Object result = caseAttributeDefinitionSimpleDefaultValue( attributeDefinitionSimpleDefaultValue );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION_DEFAULT_VALUE: {
            AttributeDefinitionEnumerationDefaultValue attributeDefinitionEnumerationDefaultValue = (AttributeDefinitionEnumerationDefaultValue)theEObject;
            Object result = caseAttributeDefinitionEnumerationDefaultValue( attributeDefinitionEnumerationDefaultValue );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_DEFAULT_VALUE: {
            AttributeDefinitionComplexDefaultValue attributeDefinitionComplexDefaultValue = (AttributeDefinitionComplexDefaultValue)theEObject;
            Object result = caseAttributeDefinitionComplexDefaultValue( attributeDefinitionComplexDefaultValue );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT_DEFINITION: {
            AttributeValueEmbeddedDocumentDefinition attributeValueEmbeddedDocumentDefinition = (AttributeValueEmbeddedDocumentDefinition)theEObject;
            Object result = caseAttributeValueEmbeddedDocumentDefinition( attributeValueEmbeddedDocumentDefinition );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_VALUE_FILE_REFERENCE_DEFINITION: {
            AttributeValueFileReferenceDefinition attributeValueFileReferenceDefinition = (AttributeValueFileReferenceDefinition)theEObject;
            Object result = caseAttributeValueFileReferenceDefinition( attributeValueFileReferenceDefinition );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE_DEFINITION: {
            AttributeValueEmbeddedFileDefinition attributeValueEmbeddedFileDefinition = (AttributeValueEmbeddedFileDefinition)theEObject;
            Object result = caseAttributeValueEmbeddedFileDefinition( attributeValueEmbeddedFileDefinition );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_VALUE_SIMPLE_DEFINITION: {
            AttributeValueSimpleDefinition attributeValueSimpleDefinition = (AttributeValueSimpleDefinition)theEObject;
            Object result = caseAttributeValueSimpleDefinition( attributeValueSimpleDefinition );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION_DEFINITION: {
            AttributeValueEnumerationDefinition attributeValueEnumerationDefinition = (AttributeValueEnumerationDefinition)theEObject;
            Object result = caseAttributeValueEnumerationDefinition( attributeValueEnumerationDefinition );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_VALUE_XML_DATA_DEFINITION: {
            AttributeValueXmlDataDefinition attributeValueXmlDataDefinition = (AttributeValueXmlDataDefinition)theEObject;
            Object result = caseAttributeValueXmlDataDefinition( attributeValueXmlDataDefinition );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.DOCUMENT_ROOT: {
            DocumentRoot documentRoot = (DocumentRoot)theEObject;
            Object result = caseDocumentRoot( documentRoot );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.EMBEDDED_VALUE: {
            EmbeddedValue embeddedValue = (EmbeddedValue)theEObject;
            Object result = caseEmbeddedValue( embeddedValue );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ENUM_VALUE: {
            EnumValue enumValue = (EnumValue)theEObject;
            Object result = caseEnumValue( enumValue );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.OBJECT: {
            era.foss.model.core.rif.Object object = (era.foss.model.core.rif.Object)theEObject;
            Object result = caseObject( object );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.PROPERTIES: {
            Properties properties = (Properties)theEObject;
            Object result = caseProperties( properties );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.SPEC_GROUP_RELATION_GROUPS: {
            SpecGroupRelationGroups specGroupRelationGroups = (SpecGroupRelationGroups)theEObject;
            Object result = caseSpecGroupRelationGroups( specGroupRelationGroups );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ACCESS_POLICY_RELATION_GROUPS: {
            AccessPolicyRelationGroups accessPolicyRelationGroups = (AccessPolicyRelationGroups)theEObject;
            Object result = caseAccessPolicyRelationGroups( accessPolicyRelationGroups );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.RELATION_GROUP: {
            RelationGroup relationGroup = (RelationGroup)theEObject;
            Object result = caseRelationGroup( relationGroup );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.RELATION_TYPE: {
            RelationType relationType = (RelationType)theEObject;
            Object result = caseRelationType( relationType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.RIF: {
            Rif rif = (Rif)theEObject;
            Object result = caseRif( rif );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.SOURCE: {
            Source source = (Source)theEObject;
            Object result = caseSource( source );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.SPEC_ATTRIBUTES: {
            SpecAttributes specAttributes = (SpecAttributes)theEObject;
            Object result = caseSpecAttributes( specAttributes );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.RIF_SPEC_GROUPS: {
            RifSpecGroups rifSpecGroups = (RifSpecGroups)theEObject;
            Object result = caseRifSpecGroups( rifSpecGroups );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ACCESS_POLICY_SPEC_GROUPS: {
            AccessPolicySpecGroups accessPolicySpecGroups = (AccessPolicySpecGroups)theEObject;
            Object result = caseAccessPolicySpecGroups( accessPolicySpecGroups );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.SPEC_GROUP: {
            SpecGroup specGroup = (SpecGroup)theEObject;
            Object result = caseSpecGroup( specGroup );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.SPEC_HIERARCHIES: {
            SpecHierarchies specHierarchies = (SpecHierarchies)theEObject;
            Object result = caseSpecHierarchies( specHierarchies );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.RIF_SPEC_HIERARCHY_ROOTS: {
            RifSpecHierarchyRoots rifSpecHierarchyRoots = (RifSpecHierarchyRoots)theEObject;
            Object result = caseRifSpecHierarchyRoots( rifSpecHierarchyRoots );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ACCESS_POLICY_SPEC_HIERARCHY_ROOTS: {
            AccessPolicySpecHierarchyRoots accessPolicySpecHierarchyRoots = (AccessPolicySpecHierarchyRoots)theEObject;
            Object result = caseAccessPolicySpecHierarchyRoots( accessPolicySpecHierarchyRoots );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.SPEC_HIERARCHY_ROOT: {
            SpecHierarchyRoot specHierarchyRoot = (SpecHierarchyRoot)theEObject;
            Object result = caseSpecHierarchyRoot( specHierarchyRoot );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.SPEC_HIERARCHY: {
            SpecHierarchy specHierarchy = (SpecHierarchy)theEObject;
            Object result = caseSpecHierarchy( specHierarchy );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.SPECIFIED_VALUES: {
            SpecifiedValues specifiedValues = (SpecifiedValues)theEObject;
            Object result = caseSpecifiedValues( specifiedValues );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.SPEC_GROUP_SPEC_OBJECTS: {
            SpecGroupSpecObjects specGroupSpecObjects = (SpecGroupSpecObjects)theEObject;
            Object result = caseSpecGroupSpecObjects( specGroupSpecObjects );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.RIF_SPEC_OBJECTS: {
            RifSpecObjects rifSpecObjects = (RifSpecObjects)theEObject;
            Object result = caseRifSpecObjects( rifSpecObjects );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ACCESS_POLICY_SPEC_OBJECTS: {
            AccessPolicySpecObjects accessPolicySpecObjects = (AccessPolicySpecObjects)theEObject;
            Object result = caseAccessPolicySpecObjects( accessPolicySpecObjects );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.SPEC_OBJECT: {
            SpecObject specObject = (SpecObject)theEObject;
            Object result = caseSpecObject( specObject );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.RIF_SPEC_RELATIONS: {
            RifSpecRelations rifSpecRelations = (RifSpecRelations)theEObject;
            Object result = caseRifSpecRelations( rifSpecRelations );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.RELATION_GROUP_SPEC_RELATIONS: {
            RelationGroupSpecRelations relationGroupSpecRelations = (RelationGroupSpecRelations)theEObject;
            Object result = caseRelationGroupSpecRelations( relationGroupSpecRelations );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ACCESS_POLICY_SPEC_RELATIONS: {
            AccessPolicySpecRelations accessPolicySpecRelations = (AccessPolicySpecRelations)theEObject;
            Object result = caseAccessPolicySpecRelations( accessPolicySpecRelations );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.SPEC_RELATION: {
            SpecRelation specRelation = (SpecRelation)theEObject;
            Object result = caseSpecRelation( specRelation );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.RIF_SPEC_TYPES: {
            RifSpecTypes rifSpecTypes = (RifSpecTypes)theEObject;
            Object result = caseRifSpecTypes( rifSpecTypes );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ACCESS_POLICY_SPEC_TYPES: {
            AccessPolicySpecTypes accessPolicySpecTypes = (AccessPolicySpecTypes)theEObject;
            Object result = caseAccessPolicySpecTypes( accessPolicySpecTypes );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.SPEC_TYPE: {
            SpecType specType = (SpecType)theEObject;
            Object result = caseSpecType( specType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.TARGET_GROUP: {
            TargetGroup targetGroup = (TargetGroup)theEObject;
            Object result = caseTargetGroup( targetGroup );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.TARGET: {
            Target target = (Target)theEObject;
            Object result = caseTarget( target );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_TYPE: {
            AttributeDefinitionSimpleType attributeDefinitionSimpleType = (AttributeDefinitionSimpleType)theEObject;
            Object result = caseAttributeDefinitionSimpleType( attributeDefinitionSimpleType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.SPEC_RELATION_TYPE: {
            SpecRelationType specRelationType = (SpecRelationType)theEObject;
            Object result = caseSpecRelationType( specRelationType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION_TYPE: {
            AttributeDefinitionEnumerationType attributeDefinitionEnumerationType = (AttributeDefinitionEnumerationType)theEObject;
            Object result = caseAttributeDefinitionEnumerationType( attributeDefinitionEnumerationType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.SPEC_OBJECT_TYPE: {
            SpecObjectType specObjectType = (SpecObjectType)theEObject;
            Object result = caseSpecObjectType( specObjectType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.SPEC_HIERARCHY_ROOT_TYPE: {
            SpecHierarchyRootType specHierarchyRootType = (SpecHierarchyRootType)theEObject;
            Object result = caseSpecHierarchyRootType( specHierarchyRootType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.SPEC_GROUP_TYPE: {
            SpecGroupType specGroupType = (SpecGroupType)theEObject;
            Object result = caseSpecGroupType( specGroupType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_TYPE: {
            AttributeDefinitionComplexType attributeDefinitionComplexType = (AttributeDefinitionComplexType)theEObject;
            Object result = caseAttributeDefinitionComplexType( attributeDefinitionComplexType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.SPEC_OBJECT_VALUES: {
            SpecObjectValues specObjectValues = (SpecObjectValues)theEObject;
            Object result = caseSpecObjectValues( specObjectValues );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.SPEC_RELATION_VALUES: {
            SpecRelationValues specRelationValues = (SpecRelationValues)theEObject;
            Object result = caseSpecRelationValues( specRelationValues );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.SPEC_GROUP_VALUES: {
            SpecGroupValues specGroupValues = (SpecGroupValues)theEObject;
            Object result = caseSpecGroupValues( specGroupValues );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.SPEC_HIERARCHY_ROOT_VALUES: {
            SpecHierarchyRootValues specHierarchyRootValues = (SpecHierarchyRootValues)theEObject;
            Object result = caseSpecHierarchyRootValues( specHierarchyRootValues );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_VALUE_ENUMERATION_VALUES: {
            AttributeValueEnumerationValues attributeValueEnumerationValues = (AttributeValueEnumerationValues)theEObject;
            Object result = caseAttributeValueEnumerationValues( attributeValueEnumerationValues );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.XHTML_CONTENT: {
            XhtmlContent xhtmlContent = (XhtmlContent)theEObject;
            Object result = caseXhtmlContent( xhtmlContent );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT_XHTML_CONTENT: {
            AttributeValueEmbeddedDocumentXhtmlContent attributeValueEmbeddedDocumentXhtmlContent = (AttributeValueEmbeddedDocumentXhtmlContent)theEObject;
            Object result = caseAttributeValueEmbeddedDocumentXhtmlContent( attributeValueEmbeddedDocumentXhtmlContent );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.XML_CONTENT_XML_CONTENT: {
            XmlContentXmlContent xmlContentXmlContent = (XmlContentXmlContent)theEObject;
            Object result = caseXmlContentXmlContent( xmlContentXmlContent );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case RifPackage.ATTRIBUTE_VALUE_XML_DATA_XML_CONTENT: {
            AttributeValueXmlDataXmlContent attributeValueXmlDataXmlContent = (AttributeValueXmlDataXmlContent)theEObject;
            Object result = caseAttributeValueXmlDataXmlContent( attributeValueXmlDataXmlContent );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        default:
            return defaultCase( theEObject );
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Access Policies</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Access Policies</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAccessPolicies( AccessPolicies object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Access Policy</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Access Policy</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAccessPolicy( AccessPolicy object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Definition Complex</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Definition Complex</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeDefinitionComplex( AttributeDefinitionComplex object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Definition Enumeration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Definition Enumeration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeDefinitionEnumeration( AttributeDefinitionEnumeration object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Definition Simple</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Definition Simple</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeDefinitionSimple( AttributeDefinitionSimple object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Definitions</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Definitions</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeDefinitions( AttributeDefinitions object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Value Embedded Document</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Value Embedded Document</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeValueEmbeddedDocument( AttributeValueEmbeddedDocument object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Value Embedded File</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Value Embedded File</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeValueEmbeddedFile( AttributeValueEmbeddedFile object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Value Enumeration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Value Enumeration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeValueEnumeration( AttributeValueEnumeration object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Value File Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Value File Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeValueFileReference( AttributeValueFileReference object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Value Simple</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Value Simple</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeValueSimple( AttributeValueSimple object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Values</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Values</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeValues( AttributeValues object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Value Xml Data</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Value Xml Data</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeValueXmlData( AttributeValueXmlData object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Binary Content</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Binary Content</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseBinaryContent( BinaryContent object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Value Embedded File Binary Content</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Value Embedded File Binary Content</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeValueEmbeddedFileBinaryContent( AttributeValueEmbeddedFileBinaryContent object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Hierarchy Children</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Hierarchy Children</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSpecHierarchyChildren( SpecHierarchyChildren object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Hierarchy Root Children</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Hierarchy Root Children</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSpecHierarchyRootChildren( SpecHierarchyRootChildren object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Datatype Definition Binary File</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Datatype Definition Binary File</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDatatypeDefinitionBinaryFile( DatatypeDefinitionBinaryFile object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Datatype Definition Boolean</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Datatype Definition Boolean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDatatypeDefinitionBoolean( DatatypeDefinitionBoolean object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Datatype Definition Document</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Datatype Definition Document</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDatatypeDefinitionDocument( DatatypeDefinitionDocument object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Datatype Definition Enumeration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Datatype Definition Enumeration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDatatypeDefinitionEnumeration( DatatypeDefinitionEnumeration object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Datatype Definition Integer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Datatype Definition Integer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDatatypeDefinitionInteger( DatatypeDefinitionInteger object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Datatype Definition Real</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Datatype Definition Real</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDatatypeDefinitionReal( DatatypeDefinitionReal object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Datatype Definition String</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Datatype Definition String</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDatatypeDefinitionString( DatatypeDefinitionString object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Datatype Definitions</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Datatype Definitions</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDatatypeDefinitions( DatatypeDefinitions object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Datatype Definition Xml Data</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Datatype Definition Xml Data</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDatatypeDefinitionXmlData( DatatypeDefinitionXmlData object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Datatypes</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Datatypes</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDatatypes( Datatypes object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Default Value2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Default Value2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDefaultValue2( DefaultValue2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Default Value3</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Default Value3</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDefaultValue3( DefaultValue3 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Default Value4</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Default Value4</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDefaultValue4( DefaultValue4 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Definition Simple Default Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Definition Simple Default Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeDefinitionSimpleDefaultValue( AttributeDefinitionSimpleDefaultValue object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Definition Enumeration Default Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Definition Enumeration Default Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeDefinitionEnumerationDefaultValue( AttributeDefinitionEnumerationDefaultValue object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Definition Complex Default Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Definition Complex Default Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeDefinitionComplexDefaultValue( AttributeDefinitionComplexDefaultValue object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Value Embedded Document Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Value Embedded Document Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeValueEmbeddedDocumentDefinition( AttributeValueEmbeddedDocumentDefinition object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Value File Reference Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Value File Reference Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeValueFileReferenceDefinition( AttributeValueFileReferenceDefinition object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Value Embedded File Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Value Embedded File Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeValueEmbeddedFileDefinition( AttributeValueEmbeddedFileDefinition object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Value Simple Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Value Simple Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeValueSimpleDefinition( AttributeValueSimpleDefinition object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Value Enumeration Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Value Enumeration Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeValueEnumerationDefinition( AttributeValueEnumerationDefinition object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Value Xml Data Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Value Xml Data Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeValueXmlDataDefinition( AttributeValueXmlDataDefinition object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDocumentRoot( DocumentRoot object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Embedded Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Embedded Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseEmbeddedValue( EmbeddedValue object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Enum Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enum Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseEnumValue( EnumValue object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseObject( era.foss.model.core.rif.Object object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Properties</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Properties</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseProperties( Properties object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Group Relation Groups</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Group Relation Groups</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSpecGroupRelationGroups( SpecGroupRelationGroups object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Access Policy Relation Groups</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Access Policy Relation Groups</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAccessPolicyRelationGroups( AccessPolicyRelationGroups object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relation Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relation Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseRelationGroup( RelationGroup object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relation Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relation Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseRelationType( RelationType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rif</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rif</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseRif( Rif object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Source</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSource( Source object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Attributes</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Attributes</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSpecAttributes( SpecAttributes object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Groups</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Groups</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseRifSpecGroups( RifSpecGroups object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Access Policy Spec Groups</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Access Policy Spec Groups</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAccessPolicySpecGroups( AccessPolicySpecGroups object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSpecGroup( SpecGroup object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Hierarchies</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Hierarchies</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSpecHierarchies( SpecHierarchies object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Hierarchy Roots</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Hierarchy Roots</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseRifSpecHierarchyRoots( RifSpecHierarchyRoots object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Access Policy Spec Hierarchy Roots</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Access Policy Spec Hierarchy Roots</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAccessPolicySpecHierarchyRoots( AccessPolicySpecHierarchyRoots object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Hierarchy Root</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Hierarchy Root</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSpecHierarchyRoot( SpecHierarchyRoot object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Hierarchy</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Hierarchy</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSpecHierarchy( SpecHierarchy object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Specified Values</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Specified Values</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSpecifiedValues( SpecifiedValues object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Group Spec Objects</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Group Spec Objects</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSpecGroupSpecObjects( SpecGroupSpecObjects object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Objects</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Objects</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseRifSpecObjects( RifSpecObjects object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Access Policy Spec Objects</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Access Policy Spec Objects</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAccessPolicySpecObjects( AccessPolicySpecObjects object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSpecObject( SpecObject object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Relations</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Relations</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseRifSpecRelations( RifSpecRelations object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relation Group Spec Relations</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relation Group Spec Relations</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseRelationGroupSpecRelations( RelationGroupSpecRelations object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Access Policy Spec Relations</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Access Policy Spec Relations</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAccessPolicySpecRelations( AccessPolicySpecRelations object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Relation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Relation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSpecRelation( SpecRelation object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Types</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Types</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseRifSpecTypes( RifSpecTypes object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Access Policy Spec Types</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Access Policy Spec Types</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAccessPolicySpecTypes( AccessPolicySpecTypes object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSpecType( SpecType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Target Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Target Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseTargetGroup( TargetGroup object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Target</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Target</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseTarget( Target object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Definition Simple Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Definition Simple Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeDefinitionSimpleType( AttributeDefinitionSimpleType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Relation Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Relation Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSpecRelationType( SpecRelationType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Definition Enumeration Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Definition Enumeration Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeDefinitionEnumerationType( AttributeDefinitionEnumerationType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Object Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Object Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSpecObjectType( SpecObjectType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Hierarchy Root Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Hierarchy Root Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSpecHierarchyRootType( SpecHierarchyRootType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Group Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Group Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSpecGroupType( SpecGroupType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Definition Complex Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Definition Complex Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeDefinitionComplexType( AttributeDefinitionComplexType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Object Values</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Object Values</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSpecObjectValues( SpecObjectValues object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Relation Values</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Relation Values</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSpecRelationValues( SpecRelationValues object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Group Values</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Group Values</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSpecGroupValues( SpecGroupValues object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec Hierarchy Root Values</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec Hierarchy Root Values</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSpecHierarchyRootValues( SpecHierarchyRootValues object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Value Enumeration Values</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Value Enumeration Values</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeValueEnumerationValues( AttributeValueEnumerationValues object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Xhtml Content</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Xhtml Content</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseXhtmlContent( XhtmlContent object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Value Embedded Document Xhtml Content</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Value Embedded Document Xhtml Content</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeValueEmbeddedDocumentXhtmlContent( AttributeValueEmbeddedDocumentXhtmlContent object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Xml Content Xml Content</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Xml Content Xml Content</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseXmlContentXmlContent( XmlContentXmlContent object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Value Xml Data Xml Content</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Value Xml Data Xml Content</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAttributeValueXmlDataXmlContent( AttributeValueXmlDataXmlContent object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public Object defaultCase( EObject object ) {
        return null;
    }

} //RifSwitch
