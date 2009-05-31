/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see era.foss.model.core.rif.RifPackage
 * @generated
 */
public interface RifFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RifFactory eINSTANCE = era.foss.model.core.rif.internal.RifFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Access Policies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Policies</em>'.
	 * @generated
	 */
	AccessPolicies createAccessPolicies();

	/**
	 * Returns a new object of class '<em>Access Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Policy</em>'.
	 * @generated
	 */
	AccessPolicy createAccessPolicy();

	/**
	 * Returns a new object of class '<em>Attribute Definition Complex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Definition Complex</em>'.
	 * @generated
	 */
	AttributeDefinitionComplex createAttributeDefinitionComplex();

	/**
	 * Returns a new object of class '<em>Attribute Definition Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Definition Enumeration</em>'.
	 * @generated
	 */
	AttributeDefinitionEnumeration createAttributeDefinitionEnumeration();

	/**
	 * Returns a new object of class '<em>Attribute Definition Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Definition Simple</em>'.
	 * @generated
	 */
	AttributeDefinitionSimple createAttributeDefinitionSimple();

	/**
	 * Returns a new object of class '<em>Attribute Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Definitions</em>'.
	 * @generated
	 */
	AttributeDefinitions createAttributeDefinitions();

	/**
	 * Returns a new object of class '<em>Attribute Value Embedded Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Embedded Document</em>'.
	 * @generated
	 */
	AttributeValueEmbeddedDocument createAttributeValueEmbeddedDocument();

	/**
	 * Returns a new object of class '<em>Attribute Value Embedded File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Embedded File</em>'.
	 * @generated
	 */
	AttributeValueEmbeddedFile createAttributeValueEmbeddedFile();

	/**
	 * Returns a new object of class '<em>Attribute Value Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Enumeration</em>'.
	 * @generated
	 */
	AttributeValueEnumeration createAttributeValueEnumeration();

	/**
	 * Returns a new object of class '<em>Attribute Value File Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value File Reference</em>'.
	 * @generated
	 */
	AttributeValueFileReference createAttributeValueFileReference();

	/**
	 * Returns a new object of class '<em>Attribute Value Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Simple</em>'.
	 * @generated
	 */
	AttributeValueSimple createAttributeValueSimple();

	/**
	 * Returns a new object of class '<em>Attribute Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Values</em>'.
	 * @generated
	 */
	AttributeValues createAttributeValues();

	/**
	 * Returns a new object of class '<em>Attribute Value Xml Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Xml Data</em>'.
	 * @generated
	 */
	AttributeValueXmlData createAttributeValueXmlData();

	/**
	 * Returns a new object of class '<em>Binary Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Content</em>'.
	 * @generated
	 */
	BinaryContent createBinaryContent();

	/**
	 * Returns a new object of class '<em>Attribute Value Embedded File Binary Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Embedded File Binary Content</em>'.
	 * @generated
	 */
	AttributeValueEmbeddedFileBinaryContent createAttributeValueEmbeddedFileBinaryContent();

	/**
	 * Returns a new object of class '<em>Spec Hierarchy Children</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Hierarchy Children</em>'.
	 * @generated
	 */
	SpecHierarchyChildren createSpecHierarchyChildren();

	/**
	 * Returns a new object of class '<em>Spec Hierarchy Root Children</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Hierarchy Root Children</em>'.
	 * @generated
	 */
	SpecHierarchyRootChildren createSpecHierarchyRootChildren();

	/**
	 * Returns a new object of class '<em>Datatype Definition Binary File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Definition Binary File</em>'.
	 * @generated
	 */
	DatatypeDefinitionBinaryFile createDatatypeDefinitionBinaryFile();

	/**
	 * Returns a new object of class '<em>Datatype Definition Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Definition Boolean</em>'.
	 * @generated
	 */
	DatatypeDefinitionBoolean createDatatypeDefinitionBoolean();

	/**
	 * Returns a new object of class '<em>Datatype Definition Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Definition Document</em>'.
	 * @generated
	 */
	DatatypeDefinitionDocument createDatatypeDefinitionDocument();

	/**
	 * Returns a new object of class '<em>Datatype Definition Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Definition Enumeration</em>'.
	 * @generated
	 */
	DatatypeDefinitionEnumeration createDatatypeDefinitionEnumeration();

	/**
	 * Returns a new object of class '<em>Datatype Definition Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Definition Integer</em>'.
	 * @generated
	 */
	DatatypeDefinitionInteger createDatatypeDefinitionInteger();

	/**
	 * Returns a new object of class '<em>Datatype Definition Real</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Definition Real</em>'.
	 * @generated
	 */
	DatatypeDefinitionReal createDatatypeDefinitionReal();

	/**
	 * Returns a new object of class '<em>Datatype Definition String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Definition String</em>'.
	 * @generated
	 */
	DatatypeDefinitionString createDatatypeDefinitionString();

	/**
	 * Returns a new object of class '<em>Datatype Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Definitions</em>'.
	 * @generated
	 */
	DatatypeDefinitions createDatatypeDefinitions();

	/**
	 * Returns a new object of class '<em>Datatype Definition Xml Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Definition Xml Data</em>'.
	 * @generated
	 */
	DatatypeDefinitionXmlData createDatatypeDefinitionXmlData();

	/**
	 * Returns a new object of class '<em>Datatypes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatypes</em>'.
	 * @generated
	 */
	Datatypes createDatatypes();

	/**
	 * Returns a new object of class '<em>Default Value2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Value2</em>'.
	 * @generated
	 */
	DefaultValue2 createDefaultValue2();

	/**
	 * Returns a new object of class '<em>Default Value3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Value3</em>'.
	 * @generated
	 */
	DefaultValue3 createDefaultValue3();

	/**
	 * Returns a new object of class '<em>Default Value4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Value4</em>'.
	 * @generated
	 */
	DefaultValue4 createDefaultValue4();

	/**
	 * Returns a new object of class '<em>Attribute Definition Simple Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Definition Simple Default Value</em>'.
	 * @generated
	 */
	AttributeDefinitionSimpleDefaultValue createAttributeDefinitionSimpleDefaultValue();

	/**
	 * Returns a new object of class '<em>Attribute Definition Enumeration Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Definition Enumeration Default Value</em>'.
	 * @generated
	 */
	AttributeDefinitionEnumerationDefaultValue createAttributeDefinitionEnumerationDefaultValue();

	/**
	 * Returns a new object of class '<em>Attribute Definition Complex Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Definition Complex Default Value</em>'.
	 * @generated
	 */
	AttributeDefinitionComplexDefaultValue createAttributeDefinitionComplexDefaultValue();

	/**
	 * Returns a new object of class '<em>Attribute Value Embedded Document Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Embedded Document Definition</em>'.
	 * @generated
	 */
	AttributeValueEmbeddedDocumentDefinition createAttributeValueEmbeddedDocumentDefinition();

	/**
	 * Returns a new object of class '<em>Attribute Value File Reference Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value File Reference Definition</em>'.
	 * @generated
	 */
	AttributeValueFileReferenceDefinition createAttributeValueFileReferenceDefinition();

	/**
	 * Returns a new object of class '<em>Attribute Value Embedded File Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Embedded File Definition</em>'.
	 * @generated
	 */
	AttributeValueEmbeddedFileDefinition createAttributeValueEmbeddedFileDefinition();

	/**
	 * Returns a new object of class '<em>Attribute Value Simple Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Simple Definition</em>'.
	 * @generated
	 */
	AttributeValueSimpleDefinition createAttributeValueSimpleDefinition();

	/**
	 * Returns a new object of class '<em>Attribute Value Enumeration Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Enumeration Definition</em>'.
	 * @generated
	 */
	AttributeValueEnumerationDefinition createAttributeValueEnumerationDefinition();

	/**
	 * Returns a new object of class '<em>Attribute Value Xml Data Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Xml Data Definition</em>'.
	 * @generated
	 */
	AttributeValueXmlDataDefinition createAttributeValueXmlDataDefinition();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Embedded Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Embedded Value</em>'.
	 * @generated
	 */
	EmbeddedValue createEmbeddedValue();

	/**
	 * Returns a new object of class '<em>Enum Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Value</em>'.
	 * @generated
	 */
	EnumValue createEnumValue();

	/**
	 * Returns a new object of class '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object</em>'.
	 * @generated
	 */
	era.foss.model.core.rif.Object createObject();

	/**
	 * Returns a new object of class '<em>Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Properties</em>'.
	 * @generated
	 */
	Properties createProperties();

	/**
	 * Returns a new object of class '<em>Spec Group Relation Groups</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Group Relation Groups</em>'.
	 * @generated
	 */
	SpecGroupRelationGroups createSpecGroupRelationGroups();

	/**
	 * Returns a new object of class '<em>Access Policy Relation Groups</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Policy Relation Groups</em>'.
	 * @generated
	 */
	AccessPolicyRelationGroups createAccessPolicyRelationGroups();

	/**
	 * Returns a new object of class '<em>Relation Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Group</em>'.
	 * @generated
	 */
	RelationGroup createRelationGroup();

	/**
	 * Returns a new object of class '<em>Relation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Type</em>'.
	 * @generated
	 */
	RelationType createRelationType();

	/**
	 * Returns a new object of class '<em>Rif</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rif</em>'.
	 * @generated
	 */
	Rif createRif();

	/**
	 * Returns a new object of class '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source</em>'.
	 * @generated
	 */
	Source createSource();

	/**
	 * Returns a new object of class '<em>Spec Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Attributes</em>'.
	 * @generated
	 */
	SpecAttributes createSpecAttributes();

	/**
	 * Returns a new object of class '<em>Spec Groups</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Groups</em>'.
	 * @generated
	 */
	RifSpecGroups createRifSpecGroups();

	/**
	 * Returns a new object of class '<em>Access Policy Spec Groups</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Policy Spec Groups</em>'.
	 * @generated
	 */
	AccessPolicySpecGroups createAccessPolicySpecGroups();

	/**
	 * Returns a new object of class '<em>Spec Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Group</em>'.
	 * @generated
	 */
	SpecGroup createSpecGroup();

	/**
	 * Returns a new object of class '<em>Spec Hierarchies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Hierarchies</em>'.
	 * @generated
	 */
	SpecHierarchies createSpecHierarchies();

	/**
	 * Returns a new object of class '<em>Spec Hierarchy Roots</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Hierarchy Roots</em>'.
	 * @generated
	 */
	RifSpecHierarchyRoots createRifSpecHierarchyRoots();

	/**
	 * Returns a new object of class '<em>Access Policy Spec Hierarchy Roots</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Policy Spec Hierarchy Roots</em>'.
	 * @generated
	 */
	AccessPolicySpecHierarchyRoots createAccessPolicySpecHierarchyRoots();

	/**
	 * Returns a new object of class '<em>Spec Hierarchy Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Hierarchy Root</em>'.
	 * @generated
	 */
	SpecHierarchyRoot createSpecHierarchyRoot();

	/**
	 * Returns a new object of class '<em>Spec Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Hierarchy</em>'.
	 * @generated
	 */
	SpecHierarchy createSpecHierarchy();

	/**
	 * Returns a new object of class '<em>Specified Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specified Values</em>'.
	 * @generated
	 */
	SpecifiedValues createSpecifiedValues();

	/**
	 * Returns a new object of class '<em>Spec Group Spec Objects</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Group Spec Objects</em>'.
	 * @generated
	 */
	SpecGroupSpecObjects createSpecGroupSpecObjects();

	/**
	 * Returns a new object of class '<em>Spec Objects</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Objects</em>'.
	 * @generated
	 */
	RifSpecObjects createRifSpecObjects();

	/**
	 * Returns a new object of class '<em>Access Policy Spec Objects</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Policy Spec Objects</em>'.
	 * @generated
	 */
	AccessPolicySpecObjects createAccessPolicySpecObjects();

	/**
	 * Returns a new object of class '<em>Spec Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Object</em>'.
	 * @generated
	 */
	SpecObject createSpecObject();

	/**
	 * Returns a new object of class '<em>Spec Relations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Relations</em>'.
	 * @generated
	 */
	RifSpecRelations createRifSpecRelations();

	/**
	 * Returns a new object of class '<em>Relation Group Spec Relations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Group Spec Relations</em>'.
	 * @generated
	 */
	RelationGroupSpecRelations createRelationGroupSpecRelations();

	/**
	 * Returns a new object of class '<em>Access Policy Spec Relations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Policy Spec Relations</em>'.
	 * @generated
	 */
	AccessPolicySpecRelations createAccessPolicySpecRelations();

	/**
	 * Returns a new object of class '<em>Spec Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Relation</em>'.
	 * @generated
	 */
	SpecRelation createSpecRelation();

	/**
	 * Returns a new object of class '<em>Spec Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Types</em>'.
	 * @generated
	 */
	RifSpecTypes createRifSpecTypes();

	/**
	 * Returns a new object of class '<em>Access Policy Spec Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Policy Spec Types</em>'.
	 * @generated
	 */
	AccessPolicySpecTypes createAccessPolicySpecTypes();

	/**
	 * Returns a new object of class '<em>Spec Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Type</em>'.
	 * @generated
	 */
	SpecType createSpecType();

	/**
	 * Returns a new object of class '<em>Target Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Group</em>'.
	 * @generated
	 */
	TargetGroup createTargetGroup();

	/**
	 * Returns a new object of class '<em>Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target</em>'.
	 * @generated
	 */
	Target createTarget();

	/**
	 * Returns a new object of class '<em>Attribute Definition Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Definition Simple Type</em>'.
	 * @generated
	 */
	AttributeDefinitionSimpleType createAttributeDefinitionSimpleType();

	/**
	 * Returns a new object of class '<em>Spec Relation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Relation Type</em>'.
	 * @generated
	 */
	SpecRelationType createSpecRelationType();

	/**
	 * Returns a new object of class '<em>Attribute Definition Enumeration Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Definition Enumeration Type</em>'.
	 * @generated
	 */
	AttributeDefinitionEnumerationType createAttributeDefinitionEnumerationType();

	/**
	 * Returns a new object of class '<em>Spec Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Object Type</em>'.
	 * @generated
	 */
	SpecObjectType createSpecObjectType();

	/**
	 * Returns a new object of class '<em>Spec Hierarchy Root Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Hierarchy Root Type</em>'.
	 * @generated
	 */
	SpecHierarchyRootType createSpecHierarchyRootType();

	/**
	 * Returns a new object of class '<em>Spec Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Group Type</em>'.
	 * @generated
	 */
	SpecGroupType createSpecGroupType();

	/**
	 * Returns a new object of class '<em>Attribute Definition Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Definition Complex Type</em>'.
	 * @generated
	 */
	AttributeDefinitionComplexType createAttributeDefinitionComplexType();

	/**
	 * Returns a new object of class '<em>Spec Object Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Object Values</em>'.
	 * @generated
	 */
	SpecObjectValues createSpecObjectValues();

	/**
	 * Returns a new object of class '<em>Spec Relation Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Relation Values</em>'.
	 * @generated
	 */
	SpecRelationValues createSpecRelationValues();

	/**
	 * Returns a new object of class '<em>Spec Group Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Group Values</em>'.
	 * @generated
	 */
	SpecGroupValues createSpecGroupValues();

	/**
	 * Returns a new object of class '<em>Spec Hierarchy Root Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Hierarchy Root Values</em>'.
	 * @generated
	 */
	SpecHierarchyRootValues createSpecHierarchyRootValues();

	/**
	 * Returns a new object of class '<em>Attribute Value Enumeration Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Enumeration Values</em>'.
	 * @generated
	 */
	AttributeValueEnumerationValues createAttributeValueEnumerationValues();

	/**
	 * Returns a new object of class '<em>Xhtml Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xhtml Content</em>'.
	 * @generated
	 */
	XhtmlContent createXhtmlContent();

	/**
	 * Returns a new object of class '<em>Attribute Value Embedded Document Xhtml Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Embedded Document Xhtml Content</em>'.
	 * @generated
	 */
	AttributeValueEmbeddedDocumentXhtmlContent createAttributeValueEmbeddedDocumentXhtmlContent();

	/**
	 * Returns a new object of class '<em>Xml Content Xml Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Content Xml Content</em>'.
	 * @generated
	 */
	XmlContentXmlContent createXmlContentXmlContent();

	/**
	 * Returns a new object of class '<em>Attribute Value Xml Data Xml Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Xml Data Xml Content</em>'.
	 * @generated
	 */
	AttributeValueXmlDataXmlContent createAttributeValueXmlDataXmlContent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RifPackage getRifPackage();

} //RifFactory
