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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see era.foss.model.core.rif.RifPackage
 * @generated
 */
public class RifAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static RifPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RifAdapterFactory() {
        if( modelPackage == null ) {
            modelPackage = RifPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    public boolean isFactoryForType( Object object ) {
        if( object == modelPackage ) {
            return true;
        }
        if( object instanceof EObject ) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RifSwitch modelSwitch = new RifSwitch() {
        public Object caseAccessPolicies( AccessPolicies object ) {
            return createAccessPoliciesAdapter();
        }

        public Object caseAccessPolicy( AccessPolicy object ) {
            return createAccessPolicyAdapter();
        }

        public Object caseAttributeDefinitionComplex( AttributeDefinitionComplex object ) {
            return createAttributeDefinitionComplexAdapter();
        }

        public Object caseAttributeDefinitionEnumeration( AttributeDefinitionEnumeration object ) {
            return createAttributeDefinitionEnumerationAdapter();
        }

        public Object caseAttributeDefinitionSimple( AttributeDefinitionSimple object ) {
            return createAttributeDefinitionSimpleAdapter();
        }

        public Object caseAttributeDefinitions( AttributeDefinitions object ) {
            return createAttributeDefinitionsAdapter();
        }

        public Object caseAttributeValueEmbeddedDocument( AttributeValueEmbeddedDocument object ) {
            return createAttributeValueEmbeddedDocumentAdapter();
        }

        public Object caseAttributeValueEmbeddedFile( AttributeValueEmbeddedFile object ) {
            return createAttributeValueEmbeddedFileAdapter();
        }

        public Object caseAttributeValueEnumeration( AttributeValueEnumeration object ) {
            return createAttributeValueEnumerationAdapter();
        }

        public Object caseAttributeValueFileReference( AttributeValueFileReference object ) {
            return createAttributeValueFileReferenceAdapter();
        }

        public Object caseAttributeValueSimple( AttributeValueSimple object ) {
            return createAttributeValueSimpleAdapter();
        }

        public Object caseAttributeValues( AttributeValues object ) {
            return createAttributeValuesAdapter();
        }

        public Object caseAttributeValueXmlData( AttributeValueXmlData object ) {
            return createAttributeValueXmlDataAdapter();
        }

        public Object caseBinaryContent( BinaryContent object ) {
            return createBinaryContentAdapter();
        }

        public Object caseAttributeValueEmbeddedFileBinaryContent( AttributeValueEmbeddedFileBinaryContent object ) {
            return createAttributeValueEmbeddedFileBinaryContentAdapter();
        }

        public Object caseSpecHierarchyChildren( SpecHierarchyChildren object ) {
            return createSpecHierarchyChildrenAdapter();
        }

        public Object caseSpecHierarchyRootChildren( SpecHierarchyRootChildren object ) {
            return createSpecHierarchyRootChildrenAdapter();
        }

        public Object caseDatatypeDefinitionBinaryFile( DatatypeDefinitionBinaryFile object ) {
            return createDatatypeDefinitionBinaryFileAdapter();
        }

        public Object caseDatatypeDefinitionBoolean( DatatypeDefinitionBoolean object ) {
            return createDatatypeDefinitionBooleanAdapter();
        }

        public Object caseDatatypeDefinitionDocument( DatatypeDefinitionDocument object ) {
            return createDatatypeDefinitionDocumentAdapter();
        }

        public Object caseDatatypeDefinitionEnumeration( DatatypeDefinitionEnumeration object ) {
            return createDatatypeDefinitionEnumerationAdapter();
        }

        public Object caseDatatypeDefinitionInteger( DatatypeDefinitionInteger object ) {
            return createDatatypeDefinitionIntegerAdapter();
        }

        public Object caseDatatypeDefinitionReal( DatatypeDefinitionReal object ) {
            return createDatatypeDefinitionRealAdapter();
        }

        public Object caseDatatypeDefinitionString( DatatypeDefinitionString object ) {
            return createDatatypeDefinitionStringAdapter();
        }

        public Object caseDatatypeDefinitions( DatatypeDefinitions object ) {
            return createDatatypeDefinitionsAdapter();
        }

        public Object caseDatatypeDefinitionXmlData( DatatypeDefinitionXmlData object ) {
            return createDatatypeDefinitionXmlDataAdapter();
        }

        public Object caseDatatypes( Datatypes object ) {
            return createDatatypesAdapter();
        }

        public Object caseDefaultValue2( DefaultValue2 object ) {
            return createDefaultValue2Adapter();
        }

        public Object caseDefaultValue3( DefaultValue3 object ) {
            return createDefaultValue3Adapter();
        }

        public Object caseDefaultValue4( DefaultValue4 object ) {
            return createDefaultValue4Adapter();
        }

        public Object caseAttributeDefinitionSimpleDefaultValue( AttributeDefinitionSimpleDefaultValue object ) {
            return createAttributeDefinitionSimpleDefaultValueAdapter();
        }

        public Object caseAttributeDefinitionEnumerationDefaultValue( AttributeDefinitionEnumerationDefaultValue object ) {
            return createAttributeDefinitionEnumerationDefaultValueAdapter();
        }

        public Object caseAttributeDefinitionComplexDefaultValue( AttributeDefinitionComplexDefaultValue object ) {
            return createAttributeDefinitionComplexDefaultValueAdapter();
        }

        public Object caseAttributeValueEmbeddedDocumentDefinition( AttributeValueEmbeddedDocumentDefinition object ) {
            return createAttributeValueEmbeddedDocumentDefinitionAdapter();
        }

        public Object caseAttributeValueFileReferenceDefinition( AttributeValueFileReferenceDefinition object ) {
            return createAttributeValueFileReferenceDefinitionAdapter();
        }

        public Object caseAttributeValueEmbeddedFileDefinition( AttributeValueEmbeddedFileDefinition object ) {
            return createAttributeValueEmbeddedFileDefinitionAdapter();
        }

        public Object caseAttributeValueSimpleDefinition( AttributeValueSimpleDefinition object ) {
            return createAttributeValueSimpleDefinitionAdapter();
        }

        public Object caseAttributeValueEnumerationDefinition( AttributeValueEnumerationDefinition object ) {
            return createAttributeValueEnumerationDefinitionAdapter();
        }

        public Object caseAttributeValueXmlDataDefinition( AttributeValueXmlDataDefinition object ) {
            return createAttributeValueXmlDataDefinitionAdapter();
        }

        public Object caseDocumentRoot( DocumentRoot object ) {
            return createDocumentRootAdapter();
        }

        public Object caseEmbeddedValue( EmbeddedValue object ) {
            return createEmbeddedValueAdapter();
        }

        public Object caseEnumValue( EnumValue object ) {
            return createEnumValueAdapter();
        }

        public Object caseObject( era.foss.model.core.rif.Object object ) {
            return createObjectAdapter();
        }

        public Object caseProperties( Properties object ) {
            return createPropertiesAdapter();
        }

        public Object caseSpecGroupRelationGroups( SpecGroupRelationGroups object ) {
            return createSpecGroupRelationGroupsAdapter();
        }

        public Object caseAccessPolicyRelationGroups( AccessPolicyRelationGroups object ) {
            return createAccessPolicyRelationGroupsAdapter();
        }

        public Object caseRelationGroup( RelationGroup object ) {
            return createRelationGroupAdapter();
        }

        public Object caseRelationType( RelationType object ) {
            return createRelationTypeAdapter();
        }

        public Object caseRif( Rif object ) {
            return createRifAdapter();
        }

        public Object caseSource( Source object ) {
            return createSourceAdapter();
        }

        public Object caseSpecAttributes( SpecAttributes object ) {
            return createSpecAttributesAdapter();
        }

        public Object caseRifSpecGroups( RifSpecGroups object ) {
            return createRifSpecGroupsAdapter();
        }

        public Object caseAccessPolicySpecGroups( AccessPolicySpecGroups object ) {
            return createAccessPolicySpecGroupsAdapter();
        }

        public Object caseSpecGroup( SpecGroup object ) {
            return createSpecGroupAdapter();
        }

        public Object caseSpecHierarchies( SpecHierarchies object ) {
            return createSpecHierarchiesAdapter();
        }

        public Object caseRifSpecHierarchyRoots( RifSpecHierarchyRoots object ) {
            return createRifSpecHierarchyRootsAdapter();
        }

        public Object caseAccessPolicySpecHierarchyRoots( AccessPolicySpecHierarchyRoots object ) {
            return createAccessPolicySpecHierarchyRootsAdapter();
        }

        public Object caseSpecHierarchyRoot( SpecHierarchyRoot object ) {
            return createSpecHierarchyRootAdapter();
        }

        public Object caseSpecHierarchy( SpecHierarchy object ) {
            return createSpecHierarchyAdapter();
        }

        public Object caseSpecifiedValues( SpecifiedValues object ) {
            return createSpecifiedValuesAdapter();
        }

        public Object caseSpecGroupSpecObjects( SpecGroupSpecObjects object ) {
            return createSpecGroupSpecObjectsAdapter();
        }

        public Object caseRifSpecObjects( RifSpecObjects object ) {
            return createRifSpecObjectsAdapter();
        }

        public Object caseAccessPolicySpecObjects( AccessPolicySpecObjects object ) {
            return createAccessPolicySpecObjectsAdapter();
        }

        public Object caseSpecObject( SpecObject object ) {
            return createSpecObjectAdapter();
        }

        public Object caseRifSpecRelations( RifSpecRelations object ) {
            return createRifSpecRelationsAdapter();
        }

        public Object caseRelationGroupSpecRelations( RelationGroupSpecRelations object ) {
            return createRelationGroupSpecRelationsAdapter();
        }

        public Object caseAccessPolicySpecRelations( AccessPolicySpecRelations object ) {
            return createAccessPolicySpecRelationsAdapter();
        }

        public Object caseSpecRelation( SpecRelation object ) {
            return createSpecRelationAdapter();
        }

        public Object caseRifSpecTypes( RifSpecTypes object ) {
            return createRifSpecTypesAdapter();
        }

        public Object caseAccessPolicySpecTypes( AccessPolicySpecTypes object ) {
            return createAccessPolicySpecTypesAdapter();
        }

        public Object caseSpecType( SpecType object ) {
            return createSpecTypeAdapter();
        }

        public Object caseTargetGroup( TargetGroup object ) {
            return createTargetGroupAdapter();
        }

        public Object caseTarget( Target object ) {
            return createTargetAdapter();
        }

        public Object caseAttributeDefinitionSimpleType( AttributeDefinitionSimpleType object ) {
            return createAttributeDefinitionSimpleTypeAdapter();
        }

        public Object caseSpecRelationType( SpecRelationType object ) {
            return createSpecRelationTypeAdapter();
        }

        public Object caseAttributeDefinitionEnumerationType( AttributeDefinitionEnumerationType object ) {
            return createAttributeDefinitionEnumerationTypeAdapter();
        }

        public Object caseSpecObjectType( SpecObjectType object ) {
            return createSpecObjectTypeAdapter();
        }

        public Object caseSpecHierarchyRootType( SpecHierarchyRootType object ) {
            return createSpecHierarchyRootTypeAdapter();
        }

        public Object caseSpecGroupType( SpecGroupType object ) {
            return createSpecGroupTypeAdapter();
        }

        public Object caseAttributeDefinitionComplexType( AttributeDefinitionComplexType object ) {
            return createAttributeDefinitionComplexTypeAdapter();
        }

        public Object caseSpecObjectValues( SpecObjectValues object ) {
            return createSpecObjectValuesAdapter();
        }

        public Object caseSpecRelationValues( SpecRelationValues object ) {
            return createSpecRelationValuesAdapter();
        }

        public Object caseSpecGroupValues( SpecGroupValues object ) {
            return createSpecGroupValuesAdapter();
        }

        public Object caseSpecHierarchyRootValues( SpecHierarchyRootValues object ) {
            return createSpecHierarchyRootValuesAdapter();
        }

        public Object caseAttributeValueEnumerationValues( AttributeValueEnumerationValues object ) {
            return createAttributeValueEnumerationValuesAdapter();
        }

        public Object caseXhtmlContent( XhtmlContent object ) {
            return createXhtmlContentAdapter();
        }

        public Object caseAttributeValueEmbeddedDocumentXhtmlContent( AttributeValueEmbeddedDocumentXhtmlContent object ) {
            return createAttributeValueEmbeddedDocumentXhtmlContentAdapter();
        }

        public Object caseXmlContentXmlContent( XmlContentXmlContent object ) {
            return createXmlContentXmlContentAdapter();
        }

        public Object caseAttributeValueXmlDataXmlContent( AttributeValueXmlDataXmlContent object ) {
            return createAttributeValueXmlDataXmlContentAdapter();
        }

        public Object defaultCase( EObject object ) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    public Adapter createAdapter( Notifier target ) {
        return (Adapter)modelSwitch.doSwitch( (EObject)target );
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AccessPolicies <em>Access Policies</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AccessPolicies
     * @generated
     */
    public Adapter createAccessPoliciesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AccessPolicy <em>Access Policy</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AccessPolicy
     * @generated
     */
    public Adapter createAccessPolicyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeDefinitionComplex <em>Attribute Definition Complex</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeDefinitionComplex
     * @generated
     */
    public Adapter createAttributeDefinitionComplexAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeDefinitionEnumeration <em>Attribute Definition Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeDefinitionEnumeration
     * @generated
     */
    public Adapter createAttributeDefinitionEnumerationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeDefinitionSimple <em>Attribute Definition Simple</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeDefinitionSimple
     * @generated
     */
    public Adapter createAttributeDefinitionSimpleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeDefinitions <em>Attribute Definitions</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeDefinitions
     * @generated
     */
    public Adapter createAttributeDefinitionsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeValueEmbeddedDocument <em>Attribute Value Embedded Document</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeValueEmbeddedDocument
     * @generated
     */
    public Adapter createAttributeValueEmbeddedDocumentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeValueEmbeddedFile <em>Attribute Value Embedded File</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeValueEmbeddedFile
     * @generated
     */
    public Adapter createAttributeValueEmbeddedFileAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeValueEnumeration <em>Attribute Value Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeValueEnumeration
     * @generated
     */
    public Adapter createAttributeValueEnumerationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeValueFileReference <em>Attribute Value File Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeValueFileReference
     * @generated
     */
    public Adapter createAttributeValueFileReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeValueSimple <em>Attribute Value Simple</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeValueSimple
     * @generated
     */
    public Adapter createAttributeValueSimpleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeValues <em>Attribute Values</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeValues
     * @generated
     */
    public Adapter createAttributeValuesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeValueXmlData <em>Attribute Value Xml Data</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeValueXmlData
     * @generated
     */
    public Adapter createAttributeValueXmlDataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.BinaryContent <em>Binary Content</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.BinaryContent
     * @generated
     */
    public Adapter createBinaryContentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeValueEmbeddedFileBinaryContent <em>Attribute Value Embedded File Binary Content</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeValueEmbeddedFileBinaryContent
     * @generated
     */
    public Adapter createAttributeValueEmbeddedFileBinaryContentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.SpecHierarchyChildren <em>Spec Hierarchy Children</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.SpecHierarchyChildren
     * @generated
     */
    public Adapter createSpecHierarchyChildrenAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.SpecHierarchyRootChildren <em>Spec Hierarchy Root Children</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.SpecHierarchyRootChildren
     * @generated
     */
    public Adapter createSpecHierarchyRootChildrenAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.DatatypeDefinitionBinaryFile <em>Datatype Definition Binary File</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.DatatypeDefinitionBinaryFile
     * @generated
     */
    public Adapter createDatatypeDefinitionBinaryFileAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.DatatypeDefinitionBoolean <em>Datatype Definition Boolean</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.DatatypeDefinitionBoolean
     * @generated
     */
    public Adapter createDatatypeDefinitionBooleanAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.DatatypeDefinitionDocument <em>Datatype Definition Document</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.DatatypeDefinitionDocument
     * @generated
     */
    public Adapter createDatatypeDefinitionDocumentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.DatatypeDefinitionEnumeration <em>Datatype Definition Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.DatatypeDefinitionEnumeration
     * @generated
     */
    public Adapter createDatatypeDefinitionEnumerationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.DatatypeDefinitionInteger <em>Datatype Definition Integer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.DatatypeDefinitionInteger
     * @generated
     */
    public Adapter createDatatypeDefinitionIntegerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.DatatypeDefinitionReal <em>Datatype Definition Real</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.DatatypeDefinitionReal
     * @generated
     */
    public Adapter createDatatypeDefinitionRealAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.DatatypeDefinitionString <em>Datatype Definition String</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.DatatypeDefinitionString
     * @generated
     */
    public Adapter createDatatypeDefinitionStringAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.DatatypeDefinitions <em>Datatype Definitions</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.DatatypeDefinitions
     * @generated
     */
    public Adapter createDatatypeDefinitionsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.DatatypeDefinitionXmlData <em>Datatype Definition Xml Data</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.DatatypeDefinitionXmlData
     * @generated
     */
    public Adapter createDatatypeDefinitionXmlDataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.Datatypes <em>Datatypes</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.Datatypes
     * @generated
     */
    public Adapter createDatatypesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.DefaultValue2 <em>Default Value2</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.DefaultValue2
     * @generated
     */
    public Adapter createDefaultValue2Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.DefaultValue3 <em>Default Value3</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.DefaultValue3
     * @generated
     */
    public Adapter createDefaultValue3Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.DefaultValue4 <em>Default Value4</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.DefaultValue4
     * @generated
     */
    public Adapter createDefaultValue4Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeDefinitionSimpleDefaultValue <em>Attribute Definition Simple Default Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeDefinitionSimpleDefaultValue
     * @generated
     */
    public Adapter createAttributeDefinitionSimpleDefaultValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeDefinitionEnumerationDefaultValue <em>Attribute Definition Enumeration Default Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeDefinitionEnumerationDefaultValue
     * @generated
     */
    public Adapter createAttributeDefinitionEnumerationDefaultValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeDefinitionComplexDefaultValue <em>Attribute Definition Complex Default Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeDefinitionComplexDefaultValue
     * @generated
     */
    public Adapter createAttributeDefinitionComplexDefaultValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeValueEmbeddedDocumentDefinition <em>Attribute Value Embedded Document Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeValueEmbeddedDocumentDefinition
     * @generated
     */
    public Adapter createAttributeValueEmbeddedDocumentDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeValueFileReferenceDefinition <em>Attribute Value File Reference Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeValueFileReferenceDefinition
     * @generated
     */
    public Adapter createAttributeValueFileReferenceDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeValueEmbeddedFileDefinition <em>Attribute Value Embedded File Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeValueEmbeddedFileDefinition
     * @generated
     */
    public Adapter createAttributeValueEmbeddedFileDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeValueSimpleDefinition <em>Attribute Value Simple Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeValueSimpleDefinition
     * @generated
     */
    public Adapter createAttributeValueSimpleDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeValueEnumerationDefinition <em>Attribute Value Enumeration Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeValueEnumerationDefinition
     * @generated
     */
    public Adapter createAttributeValueEnumerationDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeValueXmlDataDefinition <em>Attribute Value Xml Data Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeValueXmlDataDefinition
     * @generated
     */
    public Adapter createAttributeValueXmlDataDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.DocumentRoot
     * @generated
     */
    public Adapter createDocumentRootAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.EmbeddedValue <em>Embedded Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.EmbeddedValue
     * @generated
     */
    public Adapter createEmbeddedValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.EnumValue <em>Enum Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.EnumValue
     * @generated
     */
    public Adapter createEnumValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.Object <em>Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.Object
     * @generated
     */
    public Adapter createObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.Properties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.Properties
     * @generated
     */
    public Adapter createPropertiesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.SpecGroupRelationGroups <em>Spec Group Relation Groups</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.SpecGroupRelationGroups
     * @generated
     */
    public Adapter createSpecGroupRelationGroupsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AccessPolicyRelationGroups <em>Access Policy Relation Groups</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AccessPolicyRelationGroups
     * @generated
     */
    public Adapter createAccessPolicyRelationGroupsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.RelationGroup <em>Relation Group</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.RelationGroup
     * @generated
     */
    public Adapter createRelationGroupAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.RelationType <em>Relation Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.RelationType
     * @generated
     */
    public Adapter createRelationTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.Rif <em>Rif</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.Rif
     * @generated
     */
    public Adapter createRifAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.Source <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.Source
     * @generated
     */
    public Adapter createSourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.SpecAttributes <em>Spec Attributes</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.SpecAttributes
     * @generated
     */
    public Adapter createSpecAttributesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.RifSpecGroups <em>Spec Groups</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.RifSpecGroups
     * @generated
     */
    public Adapter createRifSpecGroupsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AccessPolicySpecGroups <em>Access Policy Spec Groups</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AccessPolicySpecGroups
     * @generated
     */
    public Adapter createAccessPolicySpecGroupsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.SpecGroup <em>Spec Group</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.SpecGroup
     * @generated
     */
    public Adapter createSpecGroupAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.SpecHierarchies <em>Spec Hierarchies</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.SpecHierarchies
     * @generated
     */
    public Adapter createSpecHierarchiesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.RifSpecHierarchyRoots <em>Spec Hierarchy Roots</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.RifSpecHierarchyRoots
     * @generated
     */
    public Adapter createRifSpecHierarchyRootsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AccessPolicySpecHierarchyRoots <em>Access Policy Spec Hierarchy Roots</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AccessPolicySpecHierarchyRoots
     * @generated
     */
    public Adapter createAccessPolicySpecHierarchyRootsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.SpecHierarchyRoot <em>Spec Hierarchy Root</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.SpecHierarchyRoot
     * @generated
     */
    public Adapter createSpecHierarchyRootAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.SpecHierarchy <em>Spec Hierarchy</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.SpecHierarchy
     * @generated
     */
    public Adapter createSpecHierarchyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.SpecifiedValues <em>Specified Values</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.SpecifiedValues
     * @generated
     */
    public Adapter createSpecifiedValuesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.SpecGroupSpecObjects <em>Spec Group Spec Objects</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.SpecGroupSpecObjects
     * @generated
     */
    public Adapter createSpecGroupSpecObjectsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.RifSpecObjects <em>Spec Objects</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.RifSpecObjects
     * @generated
     */
    public Adapter createRifSpecObjectsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AccessPolicySpecObjects <em>Access Policy Spec Objects</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AccessPolicySpecObjects
     * @generated
     */
    public Adapter createAccessPolicySpecObjectsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.SpecObject <em>Spec Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.SpecObject
     * @generated
     */
    public Adapter createSpecObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.RifSpecRelations <em>Spec Relations</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.RifSpecRelations
     * @generated
     */
    public Adapter createRifSpecRelationsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.RelationGroupSpecRelations <em>Relation Group Spec Relations</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.RelationGroupSpecRelations
     * @generated
     */
    public Adapter createRelationGroupSpecRelationsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AccessPolicySpecRelations <em>Access Policy Spec Relations</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AccessPolicySpecRelations
     * @generated
     */
    public Adapter createAccessPolicySpecRelationsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.SpecRelation <em>Spec Relation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.SpecRelation
     * @generated
     */
    public Adapter createSpecRelationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.RifSpecTypes <em>Spec Types</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.RifSpecTypes
     * @generated
     */
    public Adapter createRifSpecTypesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AccessPolicySpecTypes <em>Access Policy Spec Types</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AccessPolicySpecTypes
     * @generated
     */
    public Adapter createAccessPolicySpecTypesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.SpecType <em>Spec Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.SpecType
     * @generated
     */
    public Adapter createSpecTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.TargetGroup <em>Target Group</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.TargetGroup
     * @generated
     */
    public Adapter createTargetGroupAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.Target <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.Target
     * @generated
     */
    public Adapter createTargetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeDefinitionSimpleType <em>Attribute Definition Simple Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeDefinitionSimpleType
     * @generated
     */
    public Adapter createAttributeDefinitionSimpleTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.SpecRelationType <em>Spec Relation Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.SpecRelationType
     * @generated
     */
    public Adapter createSpecRelationTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeDefinitionEnumerationType <em>Attribute Definition Enumeration Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeDefinitionEnumerationType
     * @generated
     */
    public Adapter createAttributeDefinitionEnumerationTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.SpecObjectType <em>Spec Object Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.SpecObjectType
     * @generated
     */
    public Adapter createSpecObjectTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.SpecHierarchyRootType <em>Spec Hierarchy Root Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.SpecHierarchyRootType
     * @generated
     */
    public Adapter createSpecHierarchyRootTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.SpecGroupType <em>Spec Group Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.SpecGroupType
     * @generated
     */
    public Adapter createSpecGroupTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeDefinitionComplexType <em>Attribute Definition Complex Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeDefinitionComplexType
     * @generated
     */
    public Adapter createAttributeDefinitionComplexTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.SpecObjectValues <em>Spec Object Values</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.SpecObjectValues
     * @generated
     */
    public Adapter createSpecObjectValuesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.SpecRelationValues <em>Spec Relation Values</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.SpecRelationValues
     * @generated
     */
    public Adapter createSpecRelationValuesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.SpecGroupValues <em>Spec Group Values</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.SpecGroupValues
     * @generated
     */
    public Adapter createSpecGroupValuesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.SpecHierarchyRootValues <em>Spec Hierarchy Root Values</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.SpecHierarchyRootValues
     * @generated
     */
    public Adapter createSpecHierarchyRootValuesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeValueEnumerationValues <em>Attribute Value Enumeration Values</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeValueEnumerationValues
     * @generated
     */
    public Adapter createAttributeValueEnumerationValuesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.XhtmlContent <em>Xhtml Content</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.XhtmlContent
     * @generated
     */
    public Adapter createXhtmlContentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeValueEmbeddedDocumentXhtmlContent <em>Attribute Value Embedded Document Xhtml Content</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeValueEmbeddedDocumentXhtmlContent
     * @generated
     */
    public Adapter createAttributeValueEmbeddedDocumentXhtmlContentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.XmlContentXmlContent <em>Xml Content Xml Content</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.XmlContentXmlContent
     * @generated
     */
    public Adapter createXmlContentXmlContentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link era.foss.model.core.rif.AttributeValueXmlDataXmlContent <em>Attribute Value Xml Data Xml Content</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see era.foss.model.core.rif.AttributeValueXmlDataXmlContent
     * @generated
     */
    public Adapter createAttributeValueXmlDataXmlContentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //RifAdapterFactory
