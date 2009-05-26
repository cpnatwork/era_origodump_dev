/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RifPackageImpl extends EPackageImpl implements RifPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass accessPoliciesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass accessPolicyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeDefinitionComplexEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeDefinitionEnumerationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeDefinitionSimpleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeDefinitionsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeValueEmbeddedDocumentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeValueEmbeddedFileEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeValueEnumerationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeValueFileReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeValueSimpleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeValuesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeValueXmlDataEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass binaryContentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeValueEmbeddedFileBinaryContentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass specHierarchyChildrenEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass specHierarchyRootChildrenEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass datatypeDefinitionBinaryFileEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass datatypeDefinitionBooleanEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass datatypeDefinitionDocumentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass datatypeDefinitionEnumerationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass datatypeDefinitionIntegerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass datatypeDefinitionRealEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass datatypeDefinitionStringEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass datatypeDefinitionsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass datatypeDefinitionXmlDataEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass datatypesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass defaultValue2EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass defaultValue3EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass defaultValue4EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeDefinitionSimpleDefaultValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeDefinitionEnumerationDefaultValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeDefinitionComplexDefaultValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeValueEmbeddedDocumentDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeValueFileReferenceDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeValueEmbeddedFileDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeValueSimpleDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeValueEnumerationDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeValueXmlDataDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass documentRootEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass embeddedValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass enumValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass objectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertiesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass specGroupRelationGroupsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass accessPolicyRelationGroupsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass relationGroupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass relationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rifEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sourceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass specAttributesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rifSpecGroupsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass accessPolicySpecGroupsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass specGroupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass specHierarchiesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rifSpecHierarchyRootsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass accessPolicySpecHierarchyRootsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass specHierarchyRootEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass specHierarchyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass specifiedValuesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass specGroupSpecObjectsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rifSpecObjectsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass accessPolicySpecObjectsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass specObjectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rifSpecRelationsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass relationGroupSpecRelationsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass accessPolicySpecRelationsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass specRelationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rifSpecTypesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass accessPolicySpecTypesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass specTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass targetGroupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass targetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeDefinitionSimpleTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass specRelationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeDefinitionEnumerationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass specObjectTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass specHierarchyRootTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass specGroupTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeDefinitionComplexTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass specObjectValuesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass specRelationValuesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass specGroupValuesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass specHierarchyRootValuesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeValueEnumerationValuesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass xhtmlContentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeValueEmbeddedDocumentXhtmlContentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass xmlContentXmlContentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeValueXmlDataXmlContentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum accesspolicyaccessmodeenumEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum booleanEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum datatypedefinitiondocumentformatenumEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType accesspolicyaccessmodeenumObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType booleanObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType datatypedefinitiondocumentformatenumObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType floatEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType floatObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType integerEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType refEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType stringEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see era.foss.model.core.rif.RifPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private RifPackageImpl() {
        super( eNS_URI, RifFactory.eINSTANCE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this
     * model, and for any others upon which it depends.  Simple
     * dependencies are satisfied by calling this method on all
     * dependent packages before doing anything else.  This method drives
     * initialization for interdependent packages directly, in parallel
     * with this package, itself.
     * <p>Of this package and its interdependencies, all packages which
     * have not yet been registered by their URI values are first created
     * and registered.  The packages are then initialized in two steps:
     * meta-model objects for all of the packages are created before any
     * are initialized, since one package's meta-model objects may refer to
     * those of another.
     * <p>Invocation of this method will not affect any packages that have
     * already been initialized.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static RifPackage init() {
        if( isInited ) return (RifPackage)EPackage.Registry.INSTANCE.getEPackage( RifPackage.eNS_URI );

        // Obtain or create and register package
        RifPackageImpl theRifPackage = (RifPackageImpl)(EPackage.Registry.INSTANCE.getEPackage( eNS_URI ) instanceof RifPackageImpl
            ? EPackage.Registry.INSTANCE.getEPackage( eNS_URI )
            : new RifPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        XMLTypePackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theRifPackage.createPackageContents();

        // Initialize created meta-data
        theRifPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theRifPackage.freeze();

        return theRifPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAccessPolicies() {
        return accessPoliciesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessPolicies_Group() {
        return (EAttribute)accessPoliciesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAccessPolicies_ACCESSPOLICY() {
        return (EReference)accessPoliciesEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAccessPolicy() {
        return accessPolicyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessPolicy_LONGNAME() {
        return (EAttribute)accessPolicyEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessPolicy_DESC() {
        return (EAttribute)accessPolicyEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessPolicy_ACCESSMODE() {
        return (EAttribute)accessPolicyEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAccessPolicy_ATTRIBUTEDEFINITIONS() {
        return (EReference)accessPolicyEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAccessPolicy_ATTRIBUTEVALUES() {
        return (EReference)accessPolicyEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAccessPolicy_DATATYPEDEFINITIONS() {
        return (EReference)accessPolicyEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessPolicy_IDENTIFIER() {
        return (EAttribute)accessPolicyEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessPolicy_LASTCHANGE() {
        return (EAttribute)accessPolicyEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAccessPolicy_RELATIONGROUPS() {
        return (EReference)accessPolicyEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAccessPolicy_SPECGROUPS() {
        return (EReference)accessPolicyEClass.getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAccessPolicy_SPECHIERARCHIES() {
        return (EReference)accessPolicyEClass.getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAccessPolicy_SPECHIERARCHYROOTS() {
        return (EReference)accessPolicyEClass.getEStructuralFeatures().get( 11 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAccessPolicy_SPECOBJECTS() {
        return (EReference)accessPolicyEClass.getEStructuralFeatures().get( 12 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAccessPolicy_SPECRELATIONS() {
        return (EReference)accessPolicyEClass.getEStructuralFeatures().get( 13 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAccessPolicy_SPECTYPES() {
        return (EReference)accessPolicyEClass.getEStructuralFeatures().get( 14 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeDefinitionComplex() {
        return attributeDefinitionComplexEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitionComplex_LONGNAME() {
        return (EAttribute)attributeDefinitionComplexEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitionComplex_DESC() {
        return (EAttribute)attributeDefinitionComplexEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeDefinitionComplex_DEFAULTVALUE() {
        return (EReference)attributeDefinitionComplexEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeDefinitionComplex_DEFAULTVALUE2() {
        return (EReference)attributeDefinitionComplexEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeDefinitionComplex_DEFAULTVALUE3() {
        return (EReference)attributeDefinitionComplexEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeDefinitionComplex_DEFAULTVALUE4() {
        return (EReference)attributeDefinitionComplexEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitionComplex_IDENTIFIER() {
        return (EAttribute)attributeDefinitionComplexEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitionComplex_LASTCHANGE() {
        return (EAttribute)attributeDefinitionComplexEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeDefinitionComplex_TYPE() {
        return (EReference)attributeDefinitionComplexEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeDefinitionEnumeration() {
        return attributeDefinitionEnumerationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitionEnumeration_LONGNAME() {
        return (EAttribute)attributeDefinitionEnumerationEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitionEnumeration_DESC() {
        return (EAttribute)attributeDefinitionEnumerationEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeDefinitionEnumeration_DEFAULTVALUE() {
        return (EReference)attributeDefinitionEnumerationEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitionEnumeration_IDENTIFIER() {
        return (EAttribute)attributeDefinitionEnumerationEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitionEnumeration_LASTCHANGE() {
        return (EAttribute)attributeDefinitionEnumerationEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitionEnumeration_MULTIVALUED() {
        return (EAttribute)attributeDefinitionEnumerationEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeDefinitionEnumeration_TYPE() {
        return (EReference)attributeDefinitionEnumerationEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeDefinitionSimple() {
        return attributeDefinitionSimpleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitionSimple_LONGNAME() {
        return (EAttribute)attributeDefinitionSimpleEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitionSimple_DESC() {
        return (EAttribute)attributeDefinitionSimpleEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeDefinitionSimple_DEFAULTVALUE() {
        return (EReference)attributeDefinitionSimpleEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitionSimple_IDENTIFIER() {
        return (EAttribute)attributeDefinitionSimpleEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitionSimple_LASTCHANGE() {
        return (EAttribute)attributeDefinitionSimpleEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeDefinitionSimple_TYPE() {
        return (EReference)attributeDefinitionSimpleEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeDefinitions() {
        return attributeDefinitionsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitions_Group() {
        return (EAttribute)attributeDefinitionsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitions_ATTRIBUTEDEFINITIONCOMPLEXREF() {
        return (EAttribute)attributeDefinitionsEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitions_ATTRIBUTEDEFINITIONENUMERATIONREF() {
        return (EAttribute)attributeDefinitionsEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitions_ATTRIBUTEDEFINITIONSIMPLEREF() {
        return (EAttribute)attributeDefinitionsEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeValueEmbeddedDocument() {
        return attributeValueEmbeddedDocumentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueEmbeddedDocument_LONGNAME() {
        return (EAttribute)attributeValueEmbeddedDocumentEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueEmbeddedDocument_DESC() {
        return (EAttribute)attributeValueEmbeddedDocumentEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeValueEmbeddedDocument_DEFINITION() {
        return (EReference)attributeValueEmbeddedDocumentEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueEmbeddedDocument_IDENTIFIER() {
        return (EAttribute)attributeValueEmbeddedDocumentEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueEmbeddedDocument_LASTCHANGE() {
        return (EAttribute)attributeValueEmbeddedDocumentEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeValueEmbeddedDocument_XHTMLCONTENT() {
        return (EReference)attributeValueEmbeddedDocumentEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeValueEmbeddedFile() {
        return attributeValueEmbeddedFileEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueEmbeddedFile_LONGNAME() {
        return (EAttribute)attributeValueEmbeddedFileEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueEmbeddedFile_DESC() {
        return (EAttribute)attributeValueEmbeddedFileEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeValueEmbeddedFile_BINARYCONTENT() {
        return (EReference)attributeValueEmbeddedFileEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeValueEmbeddedFile_DEFINITION() {
        return (EReference)attributeValueEmbeddedFileEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueEmbeddedFile_IDENTIFIER() {
        return (EAttribute)attributeValueEmbeddedFileEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueEmbeddedFile_LASTCHANGE() {
        return (EAttribute)attributeValueEmbeddedFileEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeValueEnumeration() {
        return attributeValueEnumerationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueEnumeration_LONGNAME() {
        return (EAttribute)attributeValueEnumerationEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueEnumeration_DESC() {
        return (EAttribute)attributeValueEnumerationEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeValueEnumeration_DEFINITION() {
        return (EReference)attributeValueEnumerationEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueEnumeration_IDENTIFIER() {
        return (EAttribute)attributeValueEnumerationEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueEnumeration_LASTCHANGE() {
        return (EAttribute)attributeValueEnumerationEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeValueEnumeration_VALUES() {
        return (EReference)attributeValueEnumerationEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeValueFileReference() {
        return attributeValueFileReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueFileReference_LONGNAME() {
        return (EAttribute)attributeValueFileReferenceEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueFileReference_DESC() {
        return (EAttribute)attributeValueFileReferenceEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeValueFileReference_DEFINITION() {
        return (EReference)attributeValueFileReferenceEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueFileReference_IDENTIFIER() {
        return (EAttribute)attributeValueFileReferenceEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueFileReference_LASTCHANGE() {
        return (EAttribute)attributeValueFileReferenceEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueFileReference_PATHTOFILE() {
        return (EAttribute)attributeValueFileReferenceEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeValueSimple() {
        return attributeValueSimpleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueSimple_LONGNAME() {
        return (EAttribute)attributeValueSimpleEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueSimple_DESC() {
        return (EAttribute)attributeValueSimpleEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeValueSimple_DEFINITION() {
        return (EReference)attributeValueSimpleEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueSimple_IDENTIFIER() {
        return (EAttribute)attributeValueSimpleEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueSimple_LASTCHANGE() {
        return (EAttribute)attributeValueSimpleEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueSimple_THEVALUE() {
        return (EAttribute)attributeValueSimpleEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeValues() {
        return attributeValuesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValues_Group() {
        return (EAttribute)attributeValuesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF() {
        return (EAttribute)attributeValuesEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValues_ATTRIBUTEVALUEEMBEDDEDFILEREF() {
        return (EAttribute)attributeValuesEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValues_ATTRIBUTEVALUEENUMERATIONREF() {
        return (EAttribute)attributeValuesEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValues_ATTRIBUTEVALUEFILEREFERENCEREF() {
        return (EAttribute)attributeValuesEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValues_ATTRIBUTEVALUESIMPLEREF() {
        return (EAttribute)attributeValuesEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValues_ATTRIBUTEVALUEXMLDATAREF() {
        return (EAttribute)attributeValuesEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeValueXmlData() {
        return attributeValueXmlDataEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueXmlData_LONGNAME() {
        return (EAttribute)attributeValueXmlDataEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueXmlData_DESC() {
        return (EAttribute)attributeValueXmlDataEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeValueXmlData_DEFINITION() {
        return (EReference)attributeValueXmlDataEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueXmlData_IDENTIFIER() {
        return (EAttribute)attributeValueXmlDataEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueXmlData_LASTCHANGE() {
        return (EAttribute)attributeValueXmlDataEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeValueXmlData_XMLCONTENT() {
        return (EReference)attributeValueXmlDataEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBinaryContent() {
        return binaryContentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeValueEmbeddedFileBinaryContent() {
        return attributeValueEmbeddedFileBinaryContentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeValueEmbeddedFileBinaryContent_BINARYCONTENT() {
        return (EReference)attributeValueEmbeddedFileBinaryContentEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpecHierarchyChildren() {
        return specHierarchyChildrenEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecHierarchyChildren_Group() {
        return (EAttribute)specHierarchyChildrenEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecHierarchyChildren_SPECHIERARCHY() {
        return (EReference)specHierarchyChildrenEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpecHierarchyRootChildren() {
        return specHierarchyRootChildrenEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecHierarchyRootChildren_Group() {
        return (EAttribute)specHierarchyRootChildrenEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecHierarchyRootChildren_SPECHIERARCHY() {
        return (EReference)specHierarchyRootChildrenEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDatatypeDefinitionBinaryFile() {
        return datatypeDefinitionBinaryFileEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionBinaryFile_LONGNAME() {
        return (EAttribute)datatypeDefinitionBinaryFileEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionBinaryFile_DESC() {
        return (EAttribute)datatypeDefinitionBinaryFileEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionBinaryFile_APPLICATION() {
        return (EAttribute)datatypeDefinitionBinaryFileEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionBinaryFile_EMBEDDED() {
        return (EAttribute)datatypeDefinitionBinaryFileEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionBinaryFile_FILENAMESUFFIX() {
        return (EAttribute)datatypeDefinitionBinaryFileEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionBinaryFile_FORMATNAME() {
        return (EAttribute)datatypeDefinitionBinaryFileEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionBinaryFile_IDENTIFIER() {
        return (EAttribute)datatypeDefinitionBinaryFileEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionBinaryFile_LASTCHANGE() {
        return (EAttribute)datatypeDefinitionBinaryFileEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionBinaryFile_MIMETYPE() {
        return (EAttribute)datatypeDefinitionBinaryFileEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDatatypeDefinitionBoolean() {
        return datatypeDefinitionBooleanEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionBoolean_LONGNAME() {
        return (EAttribute)datatypeDefinitionBooleanEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionBoolean_DESC() {
        return (EAttribute)datatypeDefinitionBooleanEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionBoolean_IDENTIFIER() {
        return (EAttribute)datatypeDefinitionBooleanEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionBoolean_LASTCHANGE() {
        return (EAttribute)datatypeDefinitionBooleanEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDatatypeDefinitionDocument() {
        return datatypeDefinitionDocumentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionDocument_LONGNAME() {
        return (EAttribute)datatypeDefinitionDocumentEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionDocument_DESC() {
        return (EAttribute)datatypeDefinitionDocumentEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionDocument_EMBEDDED() {
        return (EAttribute)datatypeDefinitionDocumentEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionDocument_FORMAT() {
        return (EAttribute)datatypeDefinitionDocumentEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionDocument_IDENTIFIER() {
        return (EAttribute)datatypeDefinitionDocumentEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionDocument_LASTCHANGE() {
        return (EAttribute)datatypeDefinitionDocumentEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDatatypeDefinitionEnumeration() {
        return datatypeDefinitionEnumerationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionEnumeration_LONGNAME() {
        return (EAttribute)datatypeDefinitionEnumerationEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionEnumeration_DESC() {
        return (EAttribute)datatypeDefinitionEnumerationEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionEnumeration_IDENTIFIER() {
        return (EAttribute)datatypeDefinitionEnumerationEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionEnumeration_LASTCHANGE() {
        return (EAttribute)datatypeDefinitionEnumerationEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDatatypeDefinitionEnumeration_SPECIFIEDVALUES() {
        return (EReference)datatypeDefinitionEnumerationEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDatatypeDefinitionInteger() {
        return datatypeDefinitionIntegerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionInteger_LONGNAME() {
        return (EAttribute)datatypeDefinitionIntegerEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionInteger_DESC() {
        return (EAttribute)datatypeDefinitionIntegerEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionInteger_IDENTIFIER() {
        return (EAttribute)datatypeDefinitionIntegerEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionInteger_LASTCHANGE() {
        return (EAttribute)datatypeDefinitionIntegerEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionInteger_MAX() {
        return (EAttribute)datatypeDefinitionIntegerEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionInteger_MIN() {
        return (EAttribute)datatypeDefinitionIntegerEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDatatypeDefinitionReal() {
        return datatypeDefinitionRealEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionReal_LONGNAME() {
        return (EAttribute)datatypeDefinitionRealEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionReal_DESC() {
        return (EAttribute)datatypeDefinitionRealEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionReal_ACCURACY() {
        return (EAttribute)datatypeDefinitionRealEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionReal_IDENTIFIER() {
        return (EAttribute)datatypeDefinitionRealEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionReal_LASTCHANGE() {
        return (EAttribute)datatypeDefinitionRealEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionReal_MAX() {
        return (EAttribute)datatypeDefinitionRealEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionReal_MIN() {
        return (EAttribute)datatypeDefinitionRealEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDatatypeDefinitionString() {
        return datatypeDefinitionStringEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionString_LONGNAME() {
        return (EAttribute)datatypeDefinitionStringEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionString_DESC() {
        return (EAttribute)datatypeDefinitionStringEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionString_IDENTIFIER() {
        return (EAttribute)datatypeDefinitionStringEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionString_LASTCHANGE() {
        return (EAttribute)datatypeDefinitionStringEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionString_MAXLENGTH() {
        return (EAttribute)datatypeDefinitionStringEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDatatypeDefinitions() {
        return datatypeDefinitionsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitions_Group() {
        return (EAttribute)datatypeDefinitionsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitions_DATATYPEDEFINITIONBINARYFILEREF() {
        return (EAttribute)datatypeDefinitionsEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitions_DATATYPEDEFINITIONBOOLEANREF() {
        return (EAttribute)datatypeDefinitionsEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitions_DATATYPEDEFINITIONDOCUMENTREF() {
        return (EAttribute)datatypeDefinitionsEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitions_DATATYPEDEFINITIONENUMERATIONREF() {
        return (EAttribute)datatypeDefinitionsEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitions_DATATYPEDEFINITIONINTEGERREF() {
        return (EAttribute)datatypeDefinitionsEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitions_DATATYPEDEFINITIONREALREF() {
        return (EAttribute)datatypeDefinitionsEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitions_DATATYPEDEFINITIONSTRINGREF() {
        return (EAttribute)datatypeDefinitionsEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitions_DATATYPEDEFINITIONXMLDATAREF() {
        return (EAttribute)datatypeDefinitionsEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDatatypeDefinitionXmlData() {
        return datatypeDefinitionXmlDataEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionXmlData_LONGNAME() {
        return (EAttribute)datatypeDefinitionXmlDataEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionXmlData_DESC() {
        return (EAttribute)datatypeDefinitionXmlDataEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionXmlData_EMBEDDED() {
        return (EAttribute)datatypeDefinitionXmlDataEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionXmlData_IDENTIFIER() {
        return (EAttribute)datatypeDefinitionXmlDataEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionXmlData_LASTCHANGE() {
        return (EAttribute)datatypeDefinitionXmlDataEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionXmlData_NAMESPACEURI() {
        return (EAttribute)datatypeDefinitionXmlDataEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypeDefinitionXmlData_SCHEMALOCATION() {
        return (EAttribute)datatypeDefinitionXmlDataEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDatatypes() {
        return datatypesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatatypes_Group() {
        return (EAttribute)datatypesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDatatypes_DATATYPEDEFINITIONBINARYFILE() {
        return (EReference)datatypesEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDatatypes_DATATYPEDEFINITIONBOOLEAN() {
        return (EReference)datatypesEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDatatypes_DATATYPEDEFINITIONDOCUMENT() {
        return (EReference)datatypesEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDatatypes_DATATYPEDEFINITIONENUMERATION() {
        return (EReference)datatypesEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDatatypes_DATATYPEDEFINITIONINTEGER() {
        return (EReference)datatypesEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDatatypes_DATATYPEDEFINITIONREAL() {
        return (EReference)datatypesEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDatatypes_DATATYPEDEFINITIONSTRING() {
        return (EReference)datatypesEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDatatypes_DATATYPEDEFINITIONXMLDATA() {
        return (EReference)datatypesEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDefaultValue2() {
        return defaultValue2EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDefaultValue2_ATTRIBUTEVALUEEMBEDDEDFILE() {
        return (EReference)defaultValue2EClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDefaultValue3() {
        return defaultValue3EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDefaultValue3_ATTRIBUTEVALUEEMBEDDEDDOCUMENT() {
        return (EReference)defaultValue3EClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDefaultValue4() {
        return defaultValue4EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDefaultValue4_ATTRIBUTEVALUEFILEREFERENCE() {
        return (EReference)defaultValue4EClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeDefinitionSimpleDefaultValue() {
        return attributeDefinitionSimpleDefaultValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeDefinitionSimpleDefaultValue_ATTRIBUTEVALUESIMPLE() {
        return (EReference)attributeDefinitionSimpleDefaultValueEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeDefinitionEnumerationDefaultValue() {
        return attributeDefinitionEnumerationDefaultValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitionEnumerationDefaultValue_Group() {
        return (EAttribute)attributeDefinitionEnumerationDefaultValueEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeDefinitionEnumerationDefaultValue_ATTRIBUTEVALUEENUMERATION() {
        return (EReference)attributeDefinitionEnumerationDefaultValueEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeDefinitionComplexDefaultValue() {
        return attributeDefinitionComplexDefaultValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeDefinitionComplexDefaultValue_ATTRIBUTEVALUEXMLDATA() {
        return (EReference)attributeDefinitionComplexDefaultValueEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeValueEmbeddedDocumentDefinition() {
        return attributeValueEmbeddedDocumentDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueEmbeddedDocumentDefinition_ATTRIBUTEDEFINITIONCOMPLEXREF() {
        return (EAttribute)attributeValueEmbeddedDocumentDefinitionEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeValueFileReferenceDefinition() {
        return attributeValueFileReferenceDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueFileReferenceDefinition_ATTRIBUTEDEFINITIONCOMPLEXREF() {
        return (EAttribute)attributeValueFileReferenceDefinitionEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeValueEmbeddedFileDefinition() {
        return attributeValueEmbeddedFileDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueEmbeddedFileDefinition_ATTRIBUTEDEFINITIONCOMPLEXREF() {
        return (EAttribute)attributeValueEmbeddedFileDefinitionEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeValueSimpleDefinition() {
        return attributeValueSimpleDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueSimpleDefinition_ATTRIBUTEDEFINITIONSIMPLEREF() {
        return (EAttribute)attributeValueSimpleDefinitionEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeValueEnumerationDefinition() {
        return attributeValueEnumerationDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueEnumerationDefinition_ATTRIBUTEDEFINITIONENUMERATIONREF() {
        return (EAttribute)attributeValueEnumerationDefinitionEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeValueXmlDataDefinition() {
        return attributeValueXmlDataDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueXmlDataDefinition_ATTRIBUTEDEFINITIONCOMPLEXREF() {
        return (EAttribute)attributeValueXmlDataDefinitionEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDocumentRoot() {
        return documentRootEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ACCESSPOLICY() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ATTRIBUTEDEFINITIONCOMPLEX() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ATTRIBUTEDEFINITIONENUMERATION() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ATTRIBUTEDEFINITIONSIMPLE() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ATTRIBUTEVALUEEMBEDDEDDOCUMENT() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ATTRIBUTEVALUEEMBEDDEDFILE() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ATTRIBUTEVALUEENUMERATION() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ATTRIBUTEVALUEFILEREFERENCE() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ATTRIBUTEVALUESIMPLE() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 11 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ATTRIBUTEVALUEXMLDATA() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 12 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_BINARYCONTENT() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 13 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DATATYPEDEFINITIONBINARYFILE() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 14 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DATATYPEDEFINITIONBOOLEAN() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 15 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DATATYPEDEFINITIONDOCUMENT() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 16 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DATATYPEDEFINITIONENUMERATION() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 17 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DATATYPEDEFINITIONINTEGER() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 18 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DATATYPEDEFINITIONREAL() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 19 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DATATYPEDEFINITIONSTRING() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 20 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DATATYPEDEFINITIONXMLDATA() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 21 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_EMBEDDEDVALUE() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 22 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ENUMVALUE() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 23 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_RELATIONGROUP() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 24 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_RIF() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 25 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SPECGROUP() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 26 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SPECHIERARCHY() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 27 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SPECHIERARCHYROOT() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 28 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SPECOBJECT() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 29 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SPECRELATION() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 30 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SPECTYPE() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 31 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XHTMLCONTENT() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 32 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XMLCONTENT() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get( 33 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_ID() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get( 34 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEmbeddedValue() {
        return embeddedValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEmbeddedValue_KEY() {
        return (EAttribute)embeddedValueEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEmbeddedValue_OTHERCONTENT() {
        return (EAttribute)embeddedValueEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEnumValue() {
        return enumValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEnumValue_LONGNAME() {
        return (EAttribute)enumValueEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEnumValue_DESC() {
        return (EAttribute)enumValueEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEnumValue_IDENTIFIER() {
        return (EAttribute)enumValueEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEnumValue_LASTCHANGE() {
        return (EAttribute)enumValueEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumValue_PROPERTIES() {
        return (EReference)enumValueEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getObject() {
        return objectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getObject_SPECOBJECTREF() {
        return (EAttribute)objectEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProperties() {
        return propertiesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProperties_EMBEDDEDVALUE() {
        return (EReference)propertiesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpecGroupRelationGroups() {
        return specGroupRelationGroupsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecGroupRelationGroups_Group() {
        return (EAttribute)specGroupRelationGroupsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecGroupRelationGroups_RELATIONGROUP() {
        return (EReference)specGroupRelationGroupsEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAccessPolicyRelationGroups() {
        return accessPolicyRelationGroupsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessPolicyRelationGroups_Group() {
        return (EAttribute)accessPolicyRelationGroupsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessPolicyRelationGroups_RELATIONGROUPREF() {
        return (EAttribute)accessPolicyRelationGroupsEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRelationGroup() {
        return relationGroupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelationGroup_LONGNAME() {
        return (EAttribute)relationGroupEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelationGroup_DESC() {
        return (EAttribute)relationGroupEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelationGroup_IDENTIFIER() {
        return (EAttribute)relationGroupEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelationGroup_LASTCHANGE() {
        return (EAttribute)relationGroupEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelationGroup_RELATIONTYPE() {
        return (EReference)relationGroupEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelationGroup_SPECRELATIONS() {
        return (EReference)relationGroupEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelationGroup_TARGETGROUP() {
        return (EReference)relationGroupEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRelationType() {
        return relationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelationType_SPECTYPEREF() {
        return (EAttribute)relationTypeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRif() {
        return rifEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRif_SPECHIERARCHYROOTS() {
        return (EReference)rifEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRif_ACCESSPOLICIES() {
        return (EReference)rifEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRif_AUTHOR() {
        return (EAttribute)rifEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRif_COMMENT() {
        return (EAttribute)rifEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRif_COUNTRYCODE() {
        return (EAttribute)rifEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRif_CREATIONTIME() {
        return (EAttribute)rifEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRif_DATATYPES() {
        return (EReference)rifEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRif_IDENTIFIER() {
        return (EAttribute)rifEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRif_SOURCETOOLID() {
        return (EAttribute)rifEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRif_SPECGROUPS() {
        return (EReference)rifEClass.getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRif_SPECOBJECTS() {
        return (EReference)rifEClass.getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRif_SPECRELATIONS() {
        return (EReference)rifEClass.getEStructuralFeatures().get( 11 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRif_SPECTYPES() {
        return (EReference)rifEClass.getEStructuralFeatures().get( 12 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRif_TITLE() {
        return (EAttribute)rifEClass.getEStructuralFeatures().get( 13 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRif_VERSION() {
        return (EAttribute)rifEClass.getEStructuralFeatures().get( 14 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSource() {
        return sourceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSource_SPECOBJECTREF() {
        return (EAttribute)sourceEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpecAttributes() {
        return specAttributesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecAttributes_Group() {
        return (EAttribute)specAttributesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecAttributes_ATTRIBUTEDEFINITIONCOMPLEX() {
        return (EReference)specAttributesEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecAttributes_ATTRIBUTEDEFINITIONENUMERATION() {
        return (EReference)specAttributesEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecAttributes_ATTRIBUTEDEFINITIONSIMPLE() {
        return (EReference)specAttributesEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRifSpecGroups() {
        return rifSpecGroupsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRifSpecGroups_Group() {
        return (EAttribute)rifSpecGroupsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRifSpecGroups_SPECGROUP() {
        return (EReference)rifSpecGroupsEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAccessPolicySpecGroups() {
        return accessPolicySpecGroupsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessPolicySpecGroups_Group() {
        return (EAttribute)accessPolicySpecGroupsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessPolicySpecGroups_SPECGROUPREF() {
        return (EAttribute)accessPolicySpecGroupsEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpecGroup() {
        return specGroupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecGroup_LONGNAME() {
        return (EAttribute)specGroupEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecGroup_DESC() {
        return (EAttribute)specGroupEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecGroup_IDENTIFIER() {
        return (EAttribute)specGroupEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecGroup_LASTCHANGE() {
        return (EAttribute)specGroupEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecGroup_RELATIONGROUPS() {
        return (EReference)specGroupEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecGroup_SPECOBJECTS() {
        return (EReference)specGroupEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecGroup_TYPE() {
        return (EReference)specGroupEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecGroup_VALUES() {
        return (EReference)specGroupEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpecHierarchies() {
        return specHierarchiesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecHierarchies_Group() {
        return (EAttribute)specHierarchiesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecHierarchies_SPECHIERARCHYREF() {
        return (EAttribute)specHierarchiesEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRifSpecHierarchyRoots() {
        return rifSpecHierarchyRootsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRifSpecHierarchyRoots_Group() {
        return (EAttribute)rifSpecHierarchyRootsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRifSpecHierarchyRoots_SPECHIERARCHYROOT() {
        return (EReference)rifSpecHierarchyRootsEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAccessPolicySpecHierarchyRoots() {
        return accessPolicySpecHierarchyRootsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessPolicySpecHierarchyRoots_Group() {
        return (EAttribute)accessPolicySpecHierarchyRootsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessPolicySpecHierarchyRoots_SPECHIERARCHYROOTREF() {
        return (EAttribute)accessPolicySpecHierarchyRootsEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpecHierarchyRoot() {
        return specHierarchyRootEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecHierarchyRoot_LONGNAME() {
        return (EAttribute)specHierarchyRootEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecHierarchyRoot_DESC() {
        return (EAttribute)specHierarchyRootEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecHierarchyRoot_CHILDREN() {
        return (EReference)specHierarchyRootEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecHierarchyRoot_IDENTIFIER() {
        return (EAttribute)specHierarchyRootEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecHierarchyRoot_LASTCHANGE() {
        return (EAttribute)specHierarchyRootEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecHierarchyRoot_TYPE() {
        return (EReference)specHierarchyRootEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecHierarchyRoot_VALUES() {
        return (EReference)specHierarchyRootEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpecHierarchy() {
        return specHierarchyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecHierarchy_LONGNAME() {
        return (EAttribute)specHierarchyEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecHierarchy_DESC() {
        return (EAttribute)specHierarchyEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecHierarchy_CHILDREN() {
        return (EReference)specHierarchyEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecHierarchy_IDENTIFIER() {
        return (EAttribute)specHierarchyEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecHierarchy_LASTCHANGE() {
        return (EAttribute)specHierarchyEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecHierarchy_OBJECT() {
        return (EReference)specHierarchyEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpecifiedValues() {
        return specifiedValuesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecifiedValues_Group() {
        return (EAttribute)specifiedValuesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecifiedValues_ENUMVALUE() {
        return (EReference)specifiedValuesEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpecGroupSpecObjects() {
        return specGroupSpecObjectsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecGroupSpecObjects_Group() {
        return (EAttribute)specGroupSpecObjectsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecGroupSpecObjects_SPECOBJECTREF() {
        return (EAttribute)specGroupSpecObjectsEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRifSpecObjects() {
        return rifSpecObjectsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRifSpecObjects_Group() {
        return (EAttribute)rifSpecObjectsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRifSpecObjects_SPECOBJECT() {
        return (EReference)rifSpecObjectsEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAccessPolicySpecObjects() {
        return accessPolicySpecObjectsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessPolicySpecObjects_Group() {
        return (EAttribute)accessPolicySpecObjectsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessPolicySpecObjects_SPECOBJECTREF() {
        return (EAttribute)accessPolicySpecObjectsEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpecObject() {
        return specObjectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecObject_LONGNAME() {
        return (EAttribute)specObjectEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecObject_DESC() {
        return (EAttribute)specObjectEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecObject_IDENTIFIER() {
        return (EAttribute)specObjectEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecObject_LASTCHANGE() {
        return (EAttribute)specObjectEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecObject_TYPE() {
        return (EReference)specObjectEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecObject_VALUES() {
        return (EReference)specObjectEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRifSpecRelations() {
        return rifSpecRelationsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRifSpecRelations_Group() {
        return (EAttribute)rifSpecRelationsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRifSpecRelations_SPECRELATION() {
        return (EReference)rifSpecRelationsEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRelationGroupSpecRelations() {
        return relationGroupSpecRelationsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelationGroupSpecRelations_Group() {
        return (EAttribute)relationGroupSpecRelationsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelationGroupSpecRelations_SPECRELATIONREF() {
        return (EAttribute)relationGroupSpecRelationsEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAccessPolicySpecRelations() {
        return accessPolicySpecRelationsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessPolicySpecRelations_Group() {
        return (EAttribute)accessPolicySpecRelationsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessPolicySpecRelations_SPECRELATIONREF() {
        return (EAttribute)accessPolicySpecRelationsEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpecRelation() {
        return specRelationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecRelation_LONGNAME() {
        return (EAttribute)specRelationEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecRelation_DESC() {
        return (EAttribute)specRelationEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecRelation_SOURCE() {
        return (EReference)specRelationEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecRelation_TARGET() {
        return (EReference)specRelationEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecRelation_IDENTIFIER() {
        return (EAttribute)specRelationEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecRelation_LASTCHANGE() {
        return (EAttribute)specRelationEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecRelation_TYPE() {
        return (EReference)specRelationEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecRelation_VALUES() {
        return (EReference)specRelationEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRifSpecTypes() {
        return rifSpecTypesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRifSpecTypes_Group() {
        return (EAttribute)rifSpecTypesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRifSpecTypes_SPECTYPE() {
        return (EReference)rifSpecTypesEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAccessPolicySpecTypes() {
        return accessPolicySpecTypesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessPolicySpecTypes_Group() {
        return (EAttribute)accessPolicySpecTypesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccessPolicySpecTypes_SPECTYPEREF() {
        return (EAttribute)accessPolicySpecTypesEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpecType() {
        return specTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecType_LONGNAME() {
        return (EAttribute)specTypeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecType_DESC() {
        return (EAttribute)specTypeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecType_IDENTIFIER() {
        return (EAttribute)specTypeEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecType_LASTCHANGE() {
        return (EAttribute)specTypeEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecType_SPECATTRIBUTES() {
        return (EReference)specTypeEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecType_ID() {
        return (EAttribute)specTypeEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTargetGroup() {
        return targetGroupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTargetGroup_SPECGROUPREF() {
        return (EAttribute)targetGroupEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTarget() {
        return targetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTarget_SPECOBJECTREF() {
        return (EAttribute)targetEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeDefinitionSimpleType() {
        return attributeDefinitionSimpleTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitionSimpleType_DATATYPEDEFINITIONBOOLEANREF() {
        return (EAttribute)attributeDefinitionSimpleTypeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitionSimpleType_DATATYPEDEFINITIONINTEGERREF() {
        return (EAttribute)attributeDefinitionSimpleTypeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitionSimpleType_DATATYPEDEFINITIONREALREF() {
        return (EAttribute)attributeDefinitionSimpleTypeEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitionSimpleType_DATATYPEDEFINITIONSTRINGREF() {
        return (EAttribute)attributeDefinitionSimpleTypeEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpecRelationType() {
        return specRelationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecRelationType_SPECTYPEREF() {
        return (EAttribute)specRelationTypeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeDefinitionEnumerationType() {
        return attributeDefinitionEnumerationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitionEnumerationType_DATATYPEDEFINITIONENUMERATIONREF() {
        return (EAttribute)attributeDefinitionEnumerationTypeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpecObjectType() {
        return specObjectTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecObjectType_SPECTYPEREF() {
        return (EAttribute)specObjectTypeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpecHierarchyRootType() {
        return specHierarchyRootTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecHierarchyRootType_SPECTYPEREF() {
        return (EAttribute)specHierarchyRootTypeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpecGroupType() {
        return specGroupTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecGroupType_SPECTYPEREF() {
        return (EAttribute)specGroupTypeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeDefinitionComplexType() {
        return attributeDefinitionComplexTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitionComplexType_DATATYPEDEFINITIONBINARYFILEREF() {
        return (EAttribute)attributeDefinitionComplexTypeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitionComplexType_DATATYPEDEFINITIONDOCUMENTREF() {
        return (EAttribute)attributeDefinitionComplexTypeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeDefinitionComplexType_DATATYPEDEFINITIONXMLDATAREF() {
        return (EAttribute)attributeDefinitionComplexTypeEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpecObjectValues() {
        return specObjectValuesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecObjectValues_Group() {
        return (EAttribute)specObjectValuesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecObjectValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENT() {
        return (EReference)specObjectValuesEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecObjectValues_ATTRIBUTEVALUEEMBEDDEDFILE() {
        return (EReference)specObjectValuesEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecObjectValues_ATTRIBUTEVALUEENUMERATION() {
        return (EReference)specObjectValuesEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecObjectValues_ATTRIBUTEVALUEFILEREFERENCE() {
        return (EReference)specObjectValuesEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecObjectValues_ATTRIBUTEVALUESIMPLE() {
        return (EReference)specObjectValuesEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecObjectValues_ATTRIBUTEVALUEXMLDATA() {
        return (EReference)specObjectValuesEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpecRelationValues() {
        return specRelationValuesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecRelationValues_Group() {
        return (EAttribute)specRelationValuesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecRelationValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENT() {
        return (EReference)specRelationValuesEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecRelationValues_ATTRIBUTEVALUEEMBEDDEDFILE() {
        return (EReference)specRelationValuesEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecRelationValues_ATTRIBUTEVALUEENUMERATION() {
        return (EReference)specRelationValuesEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecRelationValues_ATTRIBUTEVALUEFILEREFERENCE() {
        return (EReference)specRelationValuesEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecRelationValues_ATTRIBUTEVALUESIMPLE() {
        return (EReference)specRelationValuesEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecRelationValues_ATTRIBUTEVALUEXMLDATA() {
        return (EReference)specRelationValuesEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpecGroupValues() {
        return specGroupValuesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecGroupValues_Group() {
        return (EAttribute)specGroupValuesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecGroupValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENT() {
        return (EReference)specGroupValuesEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecGroupValues_ATTRIBUTEVALUEEMBEDDEDFILE() {
        return (EReference)specGroupValuesEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecGroupValues_ATTRIBUTEVALUEENUMERATION() {
        return (EReference)specGroupValuesEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecGroupValues_ATTRIBUTEVALUEFILEREFERENCE() {
        return (EReference)specGroupValuesEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecGroupValues_ATTRIBUTEVALUESIMPLE() {
        return (EReference)specGroupValuesEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecGroupValues_ATTRIBUTEVALUEXMLDATA() {
        return (EReference)specGroupValuesEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpecHierarchyRootValues() {
        return specHierarchyRootValuesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecHierarchyRootValues_Group() {
        return (EAttribute)specHierarchyRootValuesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecHierarchyRootValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENT() {
        return (EReference)specHierarchyRootValuesEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecHierarchyRootValues_ATTRIBUTEVALUEEMBEDDEDFILE() {
        return (EReference)specHierarchyRootValuesEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecHierarchyRootValues_ATTRIBUTEVALUEENUMERATION() {
        return (EReference)specHierarchyRootValuesEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecHierarchyRootValues_ATTRIBUTEVALUEFILEREFERENCE() {
        return (EReference)specHierarchyRootValuesEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecHierarchyRootValues_ATTRIBUTEVALUESIMPLE() {
        return (EReference)specHierarchyRootValuesEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecHierarchyRootValues_ATTRIBUTEVALUEXMLDATA() {
        return (EReference)specHierarchyRootValuesEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeValueEnumerationValues() {
        return attributeValueEnumerationValuesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueEnumerationValues_Group() {
        return (EAttribute)attributeValueEnumerationValuesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueEnumerationValues_ENUMVALUEREF() {
        return (EAttribute)attributeValueEnumerationValuesEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getXhtmlContent() {
        return xhtmlContentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeValueEmbeddedDocumentXhtmlContent() {
        return attributeValueEmbeddedDocumentXhtmlContentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeValueEmbeddedDocumentXhtmlContent_Any() {
        return (EAttribute)attributeValueEmbeddedDocumentXhtmlContentEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getXmlContentXmlContent() {
        return xmlContentXmlContentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeValueXmlDataXmlContent() {
        return attributeValueXmlDataXmlContentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeValueXmlDataXmlContent_XMLCONTENT() {
        return (EReference)attributeValueXmlDataXmlContentEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getACCESSPOLICYACCESSMODEENUM() {
        return accesspolicyaccessmodeenumEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getBOOLEAN() {
        return booleanEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDATATYPEDEFINITIONDOCUMENTFORMATENUM() {
        return datatypedefinitiondocumentformatenumEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getACCESSPOLICYACCESSMODEENUMObject() {
        return accesspolicyaccessmodeenumObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getBOOLEANObject() {
        return booleanObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getDATATYPEDEFINITIONDOCUMENTFORMATENUMObject() {
        return datatypedefinitiondocumentformatenumObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getFLOAT() {
        return floatEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getFLOATObject() {
        return floatObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getINTEGER() {
        return integerEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getREF() {
        return refEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSTRING() {
        return stringEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RifFactory getRifFactory() {
        return (RifFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if( isCreated ) return;
        isCreated = true;

        // Create classes and their features
        accessPoliciesEClass = createEClass( ACCESS_POLICIES );
        createEAttribute( accessPoliciesEClass, ACCESS_POLICIES__GROUP );
        createEReference( accessPoliciesEClass, ACCESS_POLICIES__ACCESSPOLICY );

        accessPolicyEClass = createEClass( ACCESS_POLICY );
        createEAttribute( accessPolicyEClass, ACCESS_POLICY__LONGNAME );
        createEAttribute( accessPolicyEClass, ACCESS_POLICY__DESC );
        createEAttribute( accessPolicyEClass, ACCESS_POLICY__ACCESSMODE );
        createEReference( accessPolicyEClass, ACCESS_POLICY__ATTRIBUTEDEFINITIONS );
        createEReference( accessPolicyEClass, ACCESS_POLICY__ATTRIBUTEVALUES );
        createEReference( accessPolicyEClass, ACCESS_POLICY__DATATYPEDEFINITIONS );
        createEAttribute( accessPolicyEClass, ACCESS_POLICY__IDENTIFIER );
        createEAttribute( accessPolicyEClass, ACCESS_POLICY__LASTCHANGE );
        createEReference( accessPolicyEClass, ACCESS_POLICY__RELATIONGROUPS );
        createEReference( accessPolicyEClass, ACCESS_POLICY__SPECGROUPS );
        createEReference( accessPolicyEClass, ACCESS_POLICY__SPECHIERARCHIES );
        createEReference( accessPolicyEClass, ACCESS_POLICY__SPECHIERARCHYROOTS );
        createEReference( accessPolicyEClass, ACCESS_POLICY__SPECOBJECTS );
        createEReference( accessPolicyEClass, ACCESS_POLICY__SPECRELATIONS );
        createEReference( accessPolicyEClass, ACCESS_POLICY__SPECTYPES );

        attributeDefinitionComplexEClass = createEClass( ATTRIBUTE_DEFINITION_COMPLEX );
        createEAttribute( attributeDefinitionComplexEClass, ATTRIBUTE_DEFINITION_COMPLEX__LONGNAME );
        createEAttribute( attributeDefinitionComplexEClass, ATTRIBUTE_DEFINITION_COMPLEX__DESC );
        createEReference( attributeDefinitionComplexEClass, ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE );
        createEReference( attributeDefinitionComplexEClass, ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE2 );
        createEReference( attributeDefinitionComplexEClass, ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE3 );
        createEReference( attributeDefinitionComplexEClass, ATTRIBUTE_DEFINITION_COMPLEX__DEFAULTVALUE4 );
        createEAttribute( attributeDefinitionComplexEClass, ATTRIBUTE_DEFINITION_COMPLEX__IDENTIFIER );
        createEAttribute( attributeDefinitionComplexEClass, ATTRIBUTE_DEFINITION_COMPLEX__LASTCHANGE );
        createEReference( attributeDefinitionComplexEClass, ATTRIBUTE_DEFINITION_COMPLEX__TYPE );

        attributeDefinitionEnumerationEClass = createEClass( ATTRIBUTE_DEFINITION_ENUMERATION );
        createEAttribute( attributeDefinitionEnumerationEClass, ATTRIBUTE_DEFINITION_ENUMERATION__LONGNAME );
        createEAttribute( attributeDefinitionEnumerationEClass, ATTRIBUTE_DEFINITION_ENUMERATION__DESC );
        createEReference( attributeDefinitionEnumerationEClass, ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULTVALUE );
        createEAttribute( attributeDefinitionEnumerationEClass, ATTRIBUTE_DEFINITION_ENUMERATION__IDENTIFIER );
        createEAttribute( attributeDefinitionEnumerationEClass, ATTRIBUTE_DEFINITION_ENUMERATION__LASTCHANGE );
        createEAttribute( attributeDefinitionEnumerationEClass, ATTRIBUTE_DEFINITION_ENUMERATION__MULTIVALUED );
        createEReference( attributeDefinitionEnumerationEClass, ATTRIBUTE_DEFINITION_ENUMERATION__TYPE );

        attributeDefinitionSimpleEClass = createEClass( ATTRIBUTE_DEFINITION_SIMPLE );
        createEAttribute( attributeDefinitionSimpleEClass, ATTRIBUTE_DEFINITION_SIMPLE__LONGNAME );
        createEAttribute( attributeDefinitionSimpleEClass, ATTRIBUTE_DEFINITION_SIMPLE__DESC );
        createEReference( attributeDefinitionSimpleEClass, ATTRIBUTE_DEFINITION_SIMPLE__DEFAULTVALUE );
        createEAttribute( attributeDefinitionSimpleEClass, ATTRIBUTE_DEFINITION_SIMPLE__IDENTIFIER );
        createEAttribute( attributeDefinitionSimpleEClass, ATTRIBUTE_DEFINITION_SIMPLE__LASTCHANGE );
        createEReference( attributeDefinitionSimpleEClass, ATTRIBUTE_DEFINITION_SIMPLE__TYPE );

        attributeDefinitionsEClass = createEClass( ATTRIBUTE_DEFINITIONS );
        createEAttribute( attributeDefinitionsEClass, ATTRIBUTE_DEFINITIONS__GROUP );
        createEAttribute( attributeDefinitionsEClass, ATTRIBUTE_DEFINITIONS__ATTRIBUTEDEFINITIONCOMPLEXREF );
        createEAttribute( attributeDefinitionsEClass, ATTRIBUTE_DEFINITIONS__ATTRIBUTEDEFINITIONENUMERATIONREF );
        createEAttribute( attributeDefinitionsEClass, ATTRIBUTE_DEFINITIONS__ATTRIBUTEDEFINITIONSIMPLEREF );

        attributeValueEmbeddedDocumentEClass = createEClass( ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT );
        createEAttribute( attributeValueEmbeddedDocumentEClass, ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__LONGNAME );
        createEAttribute( attributeValueEmbeddedDocumentEClass, ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DESC );
        createEReference( attributeValueEmbeddedDocumentEClass, ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DEFINITION );
        createEAttribute( attributeValueEmbeddedDocumentEClass, ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__IDENTIFIER );
        createEAttribute( attributeValueEmbeddedDocumentEClass, ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__LASTCHANGE );
        createEReference( attributeValueEmbeddedDocumentEClass, ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__XHTMLCONTENT );

        attributeValueEmbeddedFileEClass = createEClass( ATTRIBUTE_VALUE_EMBEDDED_FILE );
        createEAttribute( attributeValueEmbeddedFileEClass, ATTRIBUTE_VALUE_EMBEDDED_FILE__LONGNAME );
        createEAttribute( attributeValueEmbeddedFileEClass, ATTRIBUTE_VALUE_EMBEDDED_FILE__DESC );
        createEReference( attributeValueEmbeddedFileEClass, ATTRIBUTE_VALUE_EMBEDDED_FILE__BINARYCONTENT );
        createEReference( attributeValueEmbeddedFileEClass, ATTRIBUTE_VALUE_EMBEDDED_FILE__DEFINITION );
        createEAttribute( attributeValueEmbeddedFileEClass, ATTRIBUTE_VALUE_EMBEDDED_FILE__IDENTIFIER );
        createEAttribute( attributeValueEmbeddedFileEClass, ATTRIBUTE_VALUE_EMBEDDED_FILE__LASTCHANGE );

        attributeValueEnumerationEClass = createEClass( ATTRIBUTE_VALUE_ENUMERATION );
        createEAttribute( attributeValueEnumerationEClass, ATTRIBUTE_VALUE_ENUMERATION__LONGNAME );
        createEAttribute( attributeValueEnumerationEClass, ATTRIBUTE_VALUE_ENUMERATION__DESC );
        createEReference( attributeValueEnumerationEClass, ATTRIBUTE_VALUE_ENUMERATION__DEFINITION );
        createEAttribute( attributeValueEnumerationEClass, ATTRIBUTE_VALUE_ENUMERATION__IDENTIFIER );
        createEAttribute( attributeValueEnumerationEClass, ATTRIBUTE_VALUE_ENUMERATION__LASTCHANGE );
        createEReference( attributeValueEnumerationEClass, ATTRIBUTE_VALUE_ENUMERATION__VALUES );

        attributeValueFileReferenceEClass = createEClass( ATTRIBUTE_VALUE_FILE_REFERENCE );
        createEAttribute( attributeValueFileReferenceEClass, ATTRIBUTE_VALUE_FILE_REFERENCE__LONGNAME );
        createEAttribute( attributeValueFileReferenceEClass, ATTRIBUTE_VALUE_FILE_REFERENCE__DESC );
        createEReference( attributeValueFileReferenceEClass, ATTRIBUTE_VALUE_FILE_REFERENCE__DEFINITION );
        createEAttribute( attributeValueFileReferenceEClass, ATTRIBUTE_VALUE_FILE_REFERENCE__IDENTIFIER );
        createEAttribute( attributeValueFileReferenceEClass, ATTRIBUTE_VALUE_FILE_REFERENCE__LASTCHANGE );
        createEAttribute( attributeValueFileReferenceEClass, ATTRIBUTE_VALUE_FILE_REFERENCE__PATHTOFILE );

        attributeValueSimpleEClass = createEClass( ATTRIBUTE_VALUE_SIMPLE );
        createEAttribute( attributeValueSimpleEClass, ATTRIBUTE_VALUE_SIMPLE__LONGNAME );
        createEAttribute( attributeValueSimpleEClass, ATTRIBUTE_VALUE_SIMPLE__DESC );
        createEReference( attributeValueSimpleEClass, ATTRIBUTE_VALUE_SIMPLE__DEFINITION );
        createEAttribute( attributeValueSimpleEClass, ATTRIBUTE_VALUE_SIMPLE__IDENTIFIER );
        createEAttribute( attributeValueSimpleEClass, ATTRIBUTE_VALUE_SIMPLE__LASTCHANGE );
        createEAttribute( attributeValueSimpleEClass, ATTRIBUTE_VALUE_SIMPLE__THEVALUE );

        attributeValuesEClass = createEClass( ATTRIBUTE_VALUES );
        createEAttribute( attributeValuesEClass, ATTRIBUTE_VALUES__GROUP );
        createEAttribute( attributeValuesEClass, ATTRIBUTE_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF );
        createEAttribute( attributeValuesEClass, ATTRIBUTE_VALUES__ATTRIBUTEVALUEEMBEDDEDFILEREF );
        createEAttribute( attributeValuesEClass, ATTRIBUTE_VALUES__ATTRIBUTEVALUEENUMERATIONREF );
        createEAttribute( attributeValuesEClass, ATTRIBUTE_VALUES__ATTRIBUTEVALUEFILEREFERENCEREF );
        createEAttribute( attributeValuesEClass, ATTRIBUTE_VALUES__ATTRIBUTEVALUESIMPLEREF );
        createEAttribute( attributeValuesEClass, ATTRIBUTE_VALUES__ATTRIBUTEVALUEXMLDATAREF );

        attributeValueXmlDataEClass = createEClass( ATTRIBUTE_VALUE_XML_DATA );
        createEAttribute( attributeValueXmlDataEClass, ATTRIBUTE_VALUE_XML_DATA__LONGNAME );
        createEAttribute( attributeValueXmlDataEClass, ATTRIBUTE_VALUE_XML_DATA__DESC );
        createEReference( attributeValueXmlDataEClass, ATTRIBUTE_VALUE_XML_DATA__DEFINITION );
        createEAttribute( attributeValueXmlDataEClass, ATTRIBUTE_VALUE_XML_DATA__IDENTIFIER );
        createEAttribute( attributeValueXmlDataEClass, ATTRIBUTE_VALUE_XML_DATA__LASTCHANGE );
        createEReference( attributeValueXmlDataEClass, ATTRIBUTE_VALUE_XML_DATA__XMLCONTENT );

        binaryContentEClass = createEClass( BINARY_CONTENT );

        attributeValueEmbeddedFileBinaryContentEClass = createEClass( ATTRIBUTE_VALUE_EMBEDDED_FILE_BINARY_CONTENT );
        createEReference( attributeValueEmbeddedFileBinaryContentEClass,
                          ATTRIBUTE_VALUE_EMBEDDED_FILE_BINARY_CONTENT__BINARYCONTENT );

        specHierarchyChildrenEClass = createEClass( SPEC_HIERARCHY_CHILDREN );
        createEAttribute( specHierarchyChildrenEClass, SPEC_HIERARCHY_CHILDREN__GROUP );
        createEReference( specHierarchyChildrenEClass, SPEC_HIERARCHY_CHILDREN__SPECHIERARCHY );

        specHierarchyRootChildrenEClass = createEClass( SPEC_HIERARCHY_ROOT_CHILDREN );
        createEAttribute( specHierarchyRootChildrenEClass, SPEC_HIERARCHY_ROOT_CHILDREN__GROUP );
        createEReference( specHierarchyRootChildrenEClass, SPEC_HIERARCHY_ROOT_CHILDREN__SPECHIERARCHY );

        datatypeDefinitionBinaryFileEClass = createEClass( DATATYPE_DEFINITION_BINARY_FILE );
        createEAttribute( datatypeDefinitionBinaryFileEClass, DATATYPE_DEFINITION_BINARY_FILE__LONGNAME );
        createEAttribute( datatypeDefinitionBinaryFileEClass, DATATYPE_DEFINITION_BINARY_FILE__DESC );
        createEAttribute( datatypeDefinitionBinaryFileEClass, DATATYPE_DEFINITION_BINARY_FILE__APPLICATION );
        createEAttribute( datatypeDefinitionBinaryFileEClass, DATATYPE_DEFINITION_BINARY_FILE__EMBEDDED );
        createEAttribute( datatypeDefinitionBinaryFileEClass, DATATYPE_DEFINITION_BINARY_FILE__FILENAMESUFFIX );
        createEAttribute( datatypeDefinitionBinaryFileEClass, DATATYPE_DEFINITION_BINARY_FILE__FORMATNAME );
        createEAttribute( datatypeDefinitionBinaryFileEClass, DATATYPE_DEFINITION_BINARY_FILE__IDENTIFIER );
        createEAttribute( datatypeDefinitionBinaryFileEClass, DATATYPE_DEFINITION_BINARY_FILE__LASTCHANGE );
        createEAttribute( datatypeDefinitionBinaryFileEClass, DATATYPE_DEFINITION_BINARY_FILE__MIMETYPE );

        datatypeDefinitionBooleanEClass = createEClass( DATATYPE_DEFINITION_BOOLEAN );
        createEAttribute( datatypeDefinitionBooleanEClass, DATATYPE_DEFINITION_BOOLEAN__LONGNAME );
        createEAttribute( datatypeDefinitionBooleanEClass, DATATYPE_DEFINITION_BOOLEAN__DESC );
        createEAttribute( datatypeDefinitionBooleanEClass, DATATYPE_DEFINITION_BOOLEAN__IDENTIFIER );
        createEAttribute( datatypeDefinitionBooleanEClass, DATATYPE_DEFINITION_BOOLEAN__LASTCHANGE );

        datatypeDefinitionDocumentEClass = createEClass( DATATYPE_DEFINITION_DOCUMENT );
        createEAttribute( datatypeDefinitionDocumentEClass, DATATYPE_DEFINITION_DOCUMENT__LONGNAME );
        createEAttribute( datatypeDefinitionDocumentEClass, DATATYPE_DEFINITION_DOCUMENT__DESC );
        createEAttribute( datatypeDefinitionDocumentEClass, DATATYPE_DEFINITION_DOCUMENT__EMBEDDED );
        createEAttribute( datatypeDefinitionDocumentEClass, DATATYPE_DEFINITION_DOCUMENT__FORMAT );
        createEAttribute( datatypeDefinitionDocumentEClass, DATATYPE_DEFINITION_DOCUMENT__IDENTIFIER );
        createEAttribute( datatypeDefinitionDocumentEClass, DATATYPE_DEFINITION_DOCUMENT__LASTCHANGE );

        datatypeDefinitionEnumerationEClass = createEClass( DATATYPE_DEFINITION_ENUMERATION );
        createEAttribute( datatypeDefinitionEnumerationEClass, DATATYPE_DEFINITION_ENUMERATION__LONGNAME );
        createEAttribute( datatypeDefinitionEnumerationEClass, DATATYPE_DEFINITION_ENUMERATION__DESC );
        createEAttribute( datatypeDefinitionEnumerationEClass, DATATYPE_DEFINITION_ENUMERATION__IDENTIFIER );
        createEAttribute( datatypeDefinitionEnumerationEClass, DATATYPE_DEFINITION_ENUMERATION__LASTCHANGE );
        createEReference( datatypeDefinitionEnumerationEClass, DATATYPE_DEFINITION_ENUMERATION__SPECIFIEDVALUES );

        datatypeDefinitionIntegerEClass = createEClass( DATATYPE_DEFINITION_INTEGER );
        createEAttribute( datatypeDefinitionIntegerEClass, DATATYPE_DEFINITION_INTEGER__LONGNAME );
        createEAttribute( datatypeDefinitionIntegerEClass, DATATYPE_DEFINITION_INTEGER__DESC );
        createEAttribute( datatypeDefinitionIntegerEClass, DATATYPE_DEFINITION_INTEGER__IDENTIFIER );
        createEAttribute( datatypeDefinitionIntegerEClass, DATATYPE_DEFINITION_INTEGER__LASTCHANGE );
        createEAttribute( datatypeDefinitionIntegerEClass, DATATYPE_DEFINITION_INTEGER__MAX );
        createEAttribute( datatypeDefinitionIntegerEClass, DATATYPE_DEFINITION_INTEGER__MIN );

        datatypeDefinitionRealEClass = createEClass( DATATYPE_DEFINITION_REAL );
        createEAttribute( datatypeDefinitionRealEClass, DATATYPE_DEFINITION_REAL__LONGNAME );
        createEAttribute( datatypeDefinitionRealEClass, DATATYPE_DEFINITION_REAL__DESC );
        createEAttribute( datatypeDefinitionRealEClass, DATATYPE_DEFINITION_REAL__ACCURACY );
        createEAttribute( datatypeDefinitionRealEClass, DATATYPE_DEFINITION_REAL__IDENTIFIER );
        createEAttribute( datatypeDefinitionRealEClass, DATATYPE_DEFINITION_REAL__LASTCHANGE );
        createEAttribute( datatypeDefinitionRealEClass, DATATYPE_DEFINITION_REAL__MAX );
        createEAttribute( datatypeDefinitionRealEClass, DATATYPE_DEFINITION_REAL__MIN );

        datatypeDefinitionStringEClass = createEClass( DATATYPE_DEFINITION_STRING );
        createEAttribute( datatypeDefinitionStringEClass, DATATYPE_DEFINITION_STRING__LONGNAME );
        createEAttribute( datatypeDefinitionStringEClass, DATATYPE_DEFINITION_STRING__DESC );
        createEAttribute( datatypeDefinitionStringEClass, DATATYPE_DEFINITION_STRING__IDENTIFIER );
        createEAttribute( datatypeDefinitionStringEClass, DATATYPE_DEFINITION_STRING__LASTCHANGE );
        createEAttribute( datatypeDefinitionStringEClass, DATATYPE_DEFINITION_STRING__MAXLENGTH );

        datatypeDefinitionsEClass = createEClass( DATATYPE_DEFINITIONS );
        createEAttribute( datatypeDefinitionsEClass, DATATYPE_DEFINITIONS__GROUP );
        createEAttribute( datatypeDefinitionsEClass, DATATYPE_DEFINITIONS__DATATYPEDEFINITIONBINARYFILEREF );
        createEAttribute( datatypeDefinitionsEClass, DATATYPE_DEFINITIONS__DATATYPEDEFINITIONBOOLEANREF );
        createEAttribute( datatypeDefinitionsEClass, DATATYPE_DEFINITIONS__DATATYPEDEFINITIONDOCUMENTREF );
        createEAttribute( datatypeDefinitionsEClass, DATATYPE_DEFINITIONS__DATATYPEDEFINITIONENUMERATIONREF );
        createEAttribute( datatypeDefinitionsEClass, DATATYPE_DEFINITIONS__DATATYPEDEFINITIONINTEGERREF );
        createEAttribute( datatypeDefinitionsEClass, DATATYPE_DEFINITIONS__DATATYPEDEFINITIONREALREF );
        createEAttribute( datatypeDefinitionsEClass, DATATYPE_DEFINITIONS__DATATYPEDEFINITIONSTRINGREF );
        createEAttribute( datatypeDefinitionsEClass, DATATYPE_DEFINITIONS__DATATYPEDEFINITIONXMLDATAREF );

        datatypeDefinitionXmlDataEClass = createEClass( DATATYPE_DEFINITION_XML_DATA );
        createEAttribute( datatypeDefinitionXmlDataEClass, DATATYPE_DEFINITION_XML_DATA__LONGNAME );
        createEAttribute( datatypeDefinitionXmlDataEClass, DATATYPE_DEFINITION_XML_DATA__DESC );
        createEAttribute( datatypeDefinitionXmlDataEClass, DATATYPE_DEFINITION_XML_DATA__EMBEDDED );
        createEAttribute( datatypeDefinitionXmlDataEClass, DATATYPE_DEFINITION_XML_DATA__IDENTIFIER );
        createEAttribute( datatypeDefinitionXmlDataEClass, DATATYPE_DEFINITION_XML_DATA__LASTCHANGE );
        createEAttribute( datatypeDefinitionXmlDataEClass, DATATYPE_DEFINITION_XML_DATA__NAMESPACEURI );
        createEAttribute( datatypeDefinitionXmlDataEClass, DATATYPE_DEFINITION_XML_DATA__SCHEMALOCATION );

        datatypesEClass = createEClass( DATATYPES );
        createEAttribute( datatypesEClass, DATATYPES__GROUP );
        createEReference( datatypesEClass, DATATYPES__DATATYPEDEFINITIONBINARYFILE );
        createEReference( datatypesEClass, DATATYPES__DATATYPEDEFINITIONBOOLEAN );
        createEReference( datatypesEClass, DATATYPES__DATATYPEDEFINITIONDOCUMENT );
        createEReference( datatypesEClass, DATATYPES__DATATYPEDEFINITIONENUMERATION );
        createEReference( datatypesEClass, DATATYPES__DATATYPEDEFINITIONINTEGER );
        createEReference( datatypesEClass, DATATYPES__DATATYPEDEFINITIONREAL );
        createEReference( datatypesEClass, DATATYPES__DATATYPEDEFINITIONSTRING );
        createEReference( datatypesEClass, DATATYPES__DATATYPEDEFINITIONXMLDATA );

        defaultValue2EClass = createEClass( DEFAULT_VALUE2 );
        createEReference( defaultValue2EClass, DEFAULT_VALUE2__ATTRIBUTEVALUEEMBEDDEDFILE );

        defaultValue3EClass = createEClass( DEFAULT_VALUE3 );
        createEReference( defaultValue3EClass, DEFAULT_VALUE3__ATTRIBUTEVALUEEMBEDDEDDOCUMENT );

        defaultValue4EClass = createEClass( DEFAULT_VALUE4 );
        createEReference( defaultValue4EClass, DEFAULT_VALUE4__ATTRIBUTEVALUEFILEREFERENCE );

        attributeDefinitionSimpleDefaultValueEClass = createEClass( ATTRIBUTE_DEFINITION_SIMPLE_DEFAULT_VALUE );
        createEReference( attributeDefinitionSimpleDefaultValueEClass,
                          ATTRIBUTE_DEFINITION_SIMPLE_DEFAULT_VALUE__ATTRIBUTEVALUESIMPLE );

        attributeDefinitionEnumerationDefaultValueEClass = createEClass( ATTRIBUTE_DEFINITION_ENUMERATION_DEFAULT_VALUE );
        createEAttribute( attributeDefinitionEnumerationDefaultValueEClass,
                          ATTRIBUTE_DEFINITION_ENUMERATION_DEFAULT_VALUE__GROUP );
        createEReference( attributeDefinitionEnumerationDefaultValueEClass,
                          ATTRIBUTE_DEFINITION_ENUMERATION_DEFAULT_VALUE__ATTRIBUTEVALUEENUMERATION );

        attributeDefinitionComplexDefaultValueEClass = createEClass( ATTRIBUTE_DEFINITION_COMPLEX_DEFAULT_VALUE );
        createEReference( attributeDefinitionComplexDefaultValueEClass,
                          ATTRIBUTE_DEFINITION_COMPLEX_DEFAULT_VALUE__ATTRIBUTEVALUEXMLDATA );

        attributeValueEmbeddedDocumentDefinitionEClass = createEClass( ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT_DEFINITION );
        createEAttribute( attributeValueEmbeddedDocumentDefinitionEClass,
                          ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT_DEFINITION__ATTRIBUTEDEFINITIONCOMPLEXREF );

        attributeValueFileReferenceDefinitionEClass = createEClass( ATTRIBUTE_VALUE_FILE_REFERENCE_DEFINITION );
        createEAttribute( attributeValueFileReferenceDefinitionEClass,
                          ATTRIBUTE_VALUE_FILE_REFERENCE_DEFINITION__ATTRIBUTEDEFINITIONCOMPLEXREF );

        attributeValueEmbeddedFileDefinitionEClass = createEClass( ATTRIBUTE_VALUE_EMBEDDED_FILE_DEFINITION );
        createEAttribute( attributeValueEmbeddedFileDefinitionEClass,
                          ATTRIBUTE_VALUE_EMBEDDED_FILE_DEFINITION__ATTRIBUTEDEFINITIONCOMPLEXREF );

        attributeValueSimpleDefinitionEClass = createEClass( ATTRIBUTE_VALUE_SIMPLE_DEFINITION );
        createEAttribute( attributeValueSimpleDefinitionEClass,
                          ATTRIBUTE_VALUE_SIMPLE_DEFINITION__ATTRIBUTEDEFINITIONSIMPLEREF );

        attributeValueEnumerationDefinitionEClass = createEClass( ATTRIBUTE_VALUE_ENUMERATION_DEFINITION );
        createEAttribute( attributeValueEnumerationDefinitionEClass,
                          ATTRIBUTE_VALUE_ENUMERATION_DEFINITION__ATTRIBUTEDEFINITIONENUMERATIONREF );

        attributeValueXmlDataDefinitionEClass = createEClass( ATTRIBUTE_VALUE_XML_DATA_DEFINITION );
        createEAttribute( attributeValueXmlDataDefinitionEClass,
                          ATTRIBUTE_VALUE_XML_DATA_DEFINITION__ATTRIBUTEDEFINITIONCOMPLEXREF );

        documentRootEClass = createEClass( DOCUMENT_ROOT );
        createEAttribute( documentRootEClass, DOCUMENT_ROOT__MIXED );
        createEReference( documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP );
        createEReference( documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION );
        createEReference( documentRootEClass, DOCUMENT_ROOT__ACCESSPOLICY );
        createEReference( documentRootEClass, DOCUMENT_ROOT__ATTRIBUTEDEFINITIONCOMPLEX );
        createEReference( documentRootEClass, DOCUMENT_ROOT__ATTRIBUTEDEFINITIONENUMERATION );
        createEReference( documentRootEClass, DOCUMENT_ROOT__ATTRIBUTEDEFINITIONSIMPLE );
        createEReference( documentRootEClass, DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDDOCUMENT );
        createEReference( documentRootEClass, DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDFILE );
        createEReference( documentRootEClass, DOCUMENT_ROOT__ATTRIBUTEVALUEENUMERATION );
        createEReference( documentRootEClass, DOCUMENT_ROOT__ATTRIBUTEVALUEFILEREFERENCE );
        createEReference( documentRootEClass, DOCUMENT_ROOT__ATTRIBUTEVALUESIMPLE );
        createEReference( documentRootEClass, DOCUMENT_ROOT__ATTRIBUTEVALUEXMLDATA );
        createEReference( documentRootEClass, DOCUMENT_ROOT__BINARYCONTENT );
        createEReference( documentRootEClass, DOCUMENT_ROOT__DATATYPEDEFINITIONBINARYFILE );
        createEReference( documentRootEClass, DOCUMENT_ROOT__DATATYPEDEFINITIONBOOLEAN );
        createEReference( documentRootEClass, DOCUMENT_ROOT__DATATYPEDEFINITIONDOCUMENT );
        createEReference( documentRootEClass, DOCUMENT_ROOT__DATATYPEDEFINITIONENUMERATION );
        createEReference( documentRootEClass, DOCUMENT_ROOT__DATATYPEDEFINITIONINTEGER );
        createEReference( documentRootEClass, DOCUMENT_ROOT__DATATYPEDEFINITIONREAL );
        createEReference( documentRootEClass, DOCUMENT_ROOT__DATATYPEDEFINITIONSTRING );
        createEReference( documentRootEClass, DOCUMENT_ROOT__DATATYPEDEFINITIONXMLDATA );
        createEReference( documentRootEClass, DOCUMENT_ROOT__EMBEDDEDVALUE );
        createEReference( documentRootEClass, DOCUMENT_ROOT__ENUMVALUE );
        createEReference( documentRootEClass, DOCUMENT_ROOT__RELATIONGROUP );
        createEReference( documentRootEClass, DOCUMENT_ROOT__RIF );
        createEReference( documentRootEClass, DOCUMENT_ROOT__SPECGROUP );
        createEReference( documentRootEClass, DOCUMENT_ROOT__SPECHIERARCHY );
        createEReference( documentRootEClass, DOCUMENT_ROOT__SPECHIERARCHYROOT );
        createEReference( documentRootEClass, DOCUMENT_ROOT__SPECOBJECT );
        createEReference( documentRootEClass, DOCUMENT_ROOT__SPECRELATION );
        createEReference( documentRootEClass, DOCUMENT_ROOT__SPECTYPE );
        createEReference( documentRootEClass, DOCUMENT_ROOT__XHTMLCONTENT );
        createEReference( documentRootEClass, DOCUMENT_ROOT__XMLCONTENT );
        createEAttribute( documentRootEClass, DOCUMENT_ROOT__ID );

        embeddedValueEClass = createEClass( EMBEDDED_VALUE );
        createEAttribute( embeddedValueEClass, EMBEDDED_VALUE__KEY );
        createEAttribute( embeddedValueEClass, EMBEDDED_VALUE__OTHERCONTENT );

        enumValueEClass = createEClass( ENUM_VALUE );
        createEAttribute( enumValueEClass, ENUM_VALUE__LONGNAME );
        createEAttribute( enumValueEClass, ENUM_VALUE__DESC );
        createEAttribute( enumValueEClass, ENUM_VALUE__IDENTIFIER );
        createEAttribute( enumValueEClass, ENUM_VALUE__LASTCHANGE );
        createEReference( enumValueEClass, ENUM_VALUE__PROPERTIES );

        objectEClass = createEClass( OBJECT );
        createEAttribute( objectEClass, OBJECT__SPECOBJECTREF );

        propertiesEClass = createEClass( PROPERTIES );
        createEReference( propertiesEClass, PROPERTIES__EMBEDDEDVALUE );

        specGroupRelationGroupsEClass = createEClass( SPEC_GROUP_RELATION_GROUPS );
        createEAttribute( specGroupRelationGroupsEClass, SPEC_GROUP_RELATION_GROUPS__GROUP );
        createEReference( specGroupRelationGroupsEClass, SPEC_GROUP_RELATION_GROUPS__RELATIONGROUP );

        accessPolicyRelationGroupsEClass = createEClass( ACCESS_POLICY_RELATION_GROUPS );
        createEAttribute( accessPolicyRelationGroupsEClass, ACCESS_POLICY_RELATION_GROUPS__GROUP );
        createEAttribute( accessPolicyRelationGroupsEClass, ACCESS_POLICY_RELATION_GROUPS__RELATIONGROUPREF );

        relationGroupEClass = createEClass( RELATION_GROUP );
        createEAttribute( relationGroupEClass, RELATION_GROUP__LONGNAME );
        createEAttribute( relationGroupEClass, RELATION_GROUP__DESC );
        createEAttribute( relationGroupEClass, RELATION_GROUP__IDENTIFIER );
        createEAttribute( relationGroupEClass, RELATION_GROUP__LASTCHANGE );
        createEReference( relationGroupEClass, RELATION_GROUP__RELATIONTYPE );
        createEReference( relationGroupEClass, RELATION_GROUP__SPECRELATIONS );
        createEReference( relationGroupEClass, RELATION_GROUP__TARGETGROUP );

        relationTypeEClass = createEClass( RELATION_TYPE );
        createEAttribute( relationTypeEClass, RELATION_TYPE__SPECTYPEREF );

        rifEClass = createEClass( RIF );
        createEReference( rifEClass, RIF__SPECHIERARCHYROOTS );
        createEReference( rifEClass, RIF__ACCESSPOLICIES );
        createEAttribute( rifEClass, RIF__AUTHOR );
        createEAttribute( rifEClass, RIF__COMMENT );
        createEAttribute( rifEClass, RIF__COUNTRYCODE );
        createEAttribute( rifEClass, RIF__CREATIONTIME );
        createEReference( rifEClass, RIF__DATATYPES );
        createEAttribute( rifEClass, RIF__IDENTIFIER );
        createEAttribute( rifEClass, RIF__SOURCETOOLID );
        createEReference( rifEClass, RIF__SPECGROUPS );
        createEReference( rifEClass, RIF__SPECOBJECTS );
        createEReference( rifEClass, RIF__SPECRELATIONS );
        createEReference( rifEClass, RIF__SPECTYPES );
        createEAttribute( rifEClass, RIF__TITLE );
        createEAttribute( rifEClass, RIF__VERSION );

        sourceEClass = createEClass( SOURCE );
        createEAttribute( sourceEClass, SOURCE__SPECOBJECTREF );

        specAttributesEClass = createEClass( SPEC_ATTRIBUTES );
        createEAttribute( specAttributesEClass, SPEC_ATTRIBUTES__GROUP );
        createEReference( specAttributesEClass, SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONCOMPLEX );
        createEReference( specAttributesEClass, SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONENUMERATION );
        createEReference( specAttributesEClass, SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONSIMPLE );

        rifSpecGroupsEClass = createEClass( RIF_SPEC_GROUPS );
        createEAttribute( rifSpecGroupsEClass, RIF_SPEC_GROUPS__GROUP );
        createEReference( rifSpecGroupsEClass, RIF_SPEC_GROUPS__SPECGROUP );

        accessPolicySpecGroupsEClass = createEClass( ACCESS_POLICY_SPEC_GROUPS );
        createEAttribute( accessPolicySpecGroupsEClass, ACCESS_POLICY_SPEC_GROUPS__GROUP );
        createEAttribute( accessPolicySpecGroupsEClass, ACCESS_POLICY_SPEC_GROUPS__SPECGROUPREF );

        specGroupEClass = createEClass( SPEC_GROUP );
        createEAttribute( specGroupEClass, SPEC_GROUP__LONGNAME );
        createEAttribute( specGroupEClass, SPEC_GROUP__DESC );
        createEAttribute( specGroupEClass, SPEC_GROUP__IDENTIFIER );
        createEAttribute( specGroupEClass, SPEC_GROUP__LASTCHANGE );
        createEReference( specGroupEClass, SPEC_GROUP__RELATIONGROUPS );
        createEReference( specGroupEClass, SPEC_GROUP__SPECOBJECTS );
        createEReference( specGroupEClass, SPEC_GROUP__TYPE );
        createEReference( specGroupEClass, SPEC_GROUP__VALUES );

        specHierarchiesEClass = createEClass( SPEC_HIERARCHIES );
        createEAttribute( specHierarchiesEClass, SPEC_HIERARCHIES__GROUP );
        createEAttribute( specHierarchiesEClass, SPEC_HIERARCHIES__SPECHIERARCHYREF );

        rifSpecHierarchyRootsEClass = createEClass( RIF_SPEC_HIERARCHY_ROOTS );
        createEAttribute( rifSpecHierarchyRootsEClass, RIF_SPEC_HIERARCHY_ROOTS__GROUP );
        createEReference( rifSpecHierarchyRootsEClass, RIF_SPEC_HIERARCHY_ROOTS__SPECHIERARCHYROOT );

        accessPolicySpecHierarchyRootsEClass = createEClass( ACCESS_POLICY_SPEC_HIERARCHY_ROOTS );
        createEAttribute( accessPolicySpecHierarchyRootsEClass, ACCESS_POLICY_SPEC_HIERARCHY_ROOTS__GROUP );
        createEAttribute( accessPolicySpecHierarchyRootsEClass,
                          ACCESS_POLICY_SPEC_HIERARCHY_ROOTS__SPECHIERARCHYROOTREF );

        specHierarchyRootEClass = createEClass( SPEC_HIERARCHY_ROOT );
        createEAttribute( specHierarchyRootEClass, SPEC_HIERARCHY_ROOT__LONGNAME );
        createEAttribute( specHierarchyRootEClass, SPEC_HIERARCHY_ROOT__DESC );
        createEReference( specHierarchyRootEClass, SPEC_HIERARCHY_ROOT__CHILDREN );
        createEAttribute( specHierarchyRootEClass, SPEC_HIERARCHY_ROOT__IDENTIFIER );
        createEAttribute( specHierarchyRootEClass, SPEC_HIERARCHY_ROOT__LASTCHANGE );
        createEReference( specHierarchyRootEClass, SPEC_HIERARCHY_ROOT__TYPE );
        createEReference( specHierarchyRootEClass, SPEC_HIERARCHY_ROOT__VALUES );

        specHierarchyEClass = createEClass( SPEC_HIERARCHY );
        createEAttribute( specHierarchyEClass, SPEC_HIERARCHY__LONGNAME );
        createEAttribute( specHierarchyEClass, SPEC_HIERARCHY__DESC );
        createEReference( specHierarchyEClass, SPEC_HIERARCHY__CHILDREN );
        createEAttribute( specHierarchyEClass, SPEC_HIERARCHY__IDENTIFIER );
        createEAttribute( specHierarchyEClass, SPEC_HIERARCHY__LASTCHANGE );
        createEReference( specHierarchyEClass, SPEC_HIERARCHY__OBJECT );

        specifiedValuesEClass = createEClass( SPECIFIED_VALUES );
        createEAttribute( specifiedValuesEClass, SPECIFIED_VALUES__GROUP );
        createEReference( specifiedValuesEClass, SPECIFIED_VALUES__ENUMVALUE );

        specGroupSpecObjectsEClass = createEClass( SPEC_GROUP_SPEC_OBJECTS );
        createEAttribute( specGroupSpecObjectsEClass, SPEC_GROUP_SPEC_OBJECTS__GROUP );
        createEAttribute( specGroupSpecObjectsEClass, SPEC_GROUP_SPEC_OBJECTS__SPECOBJECTREF );

        rifSpecObjectsEClass = createEClass( RIF_SPEC_OBJECTS );
        createEAttribute( rifSpecObjectsEClass, RIF_SPEC_OBJECTS__GROUP );
        createEReference( rifSpecObjectsEClass, RIF_SPEC_OBJECTS__SPECOBJECT );

        accessPolicySpecObjectsEClass = createEClass( ACCESS_POLICY_SPEC_OBJECTS );
        createEAttribute( accessPolicySpecObjectsEClass, ACCESS_POLICY_SPEC_OBJECTS__GROUP );
        createEAttribute( accessPolicySpecObjectsEClass, ACCESS_POLICY_SPEC_OBJECTS__SPECOBJECTREF );

        specObjectEClass = createEClass( SPEC_OBJECT );
        createEAttribute( specObjectEClass, SPEC_OBJECT__LONGNAME );
        createEAttribute( specObjectEClass, SPEC_OBJECT__DESC );
        createEAttribute( specObjectEClass, SPEC_OBJECT__IDENTIFIER );
        createEAttribute( specObjectEClass, SPEC_OBJECT__LASTCHANGE );
        createEReference( specObjectEClass, SPEC_OBJECT__TYPE );
        createEReference( specObjectEClass, SPEC_OBJECT__VALUES );

        rifSpecRelationsEClass = createEClass( RIF_SPEC_RELATIONS );
        createEAttribute( rifSpecRelationsEClass, RIF_SPEC_RELATIONS__GROUP );
        createEReference( rifSpecRelationsEClass, RIF_SPEC_RELATIONS__SPECRELATION );

        relationGroupSpecRelationsEClass = createEClass( RELATION_GROUP_SPEC_RELATIONS );
        createEAttribute( relationGroupSpecRelationsEClass, RELATION_GROUP_SPEC_RELATIONS__GROUP );
        createEAttribute( relationGroupSpecRelationsEClass, RELATION_GROUP_SPEC_RELATIONS__SPECRELATIONREF );

        accessPolicySpecRelationsEClass = createEClass( ACCESS_POLICY_SPEC_RELATIONS );
        createEAttribute( accessPolicySpecRelationsEClass, ACCESS_POLICY_SPEC_RELATIONS__GROUP );
        createEAttribute( accessPolicySpecRelationsEClass, ACCESS_POLICY_SPEC_RELATIONS__SPECRELATIONREF );

        specRelationEClass = createEClass( SPEC_RELATION );
        createEAttribute( specRelationEClass, SPEC_RELATION__LONGNAME );
        createEAttribute( specRelationEClass, SPEC_RELATION__DESC );
        createEReference( specRelationEClass, SPEC_RELATION__SOURCE );
        createEReference( specRelationEClass, SPEC_RELATION__TARGET );
        createEAttribute( specRelationEClass, SPEC_RELATION__IDENTIFIER );
        createEAttribute( specRelationEClass, SPEC_RELATION__LASTCHANGE );
        createEReference( specRelationEClass, SPEC_RELATION__TYPE );
        createEReference( specRelationEClass, SPEC_RELATION__VALUES );

        rifSpecTypesEClass = createEClass( RIF_SPEC_TYPES );
        createEAttribute( rifSpecTypesEClass, RIF_SPEC_TYPES__GROUP );
        createEReference( rifSpecTypesEClass, RIF_SPEC_TYPES__SPECTYPE );

        accessPolicySpecTypesEClass = createEClass( ACCESS_POLICY_SPEC_TYPES );
        createEAttribute( accessPolicySpecTypesEClass, ACCESS_POLICY_SPEC_TYPES__GROUP );
        createEAttribute( accessPolicySpecTypesEClass, ACCESS_POLICY_SPEC_TYPES__SPECTYPEREF );

        specTypeEClass = createEClass( SPEC_TYPE );
        createEAttribute( specTypeEClass, SPEC_TYPE__LONGNAME );
        createEAttribute( specTypeEClass, SPEC_TYPE__DESC );
        createEAttribute( specTypeEClass, SPEC_TYPE__IDENTIFIER );
        createEAttribute( specTypeEClass, SPEC_TYPE__LASTCHANGE );
        createEReference( specTypeEClass, SPEC_TYPE__SPECATTRIBUTES );
        createEAttribute( specTypeEClass, SPEC_TYPE__ID );

        targetGroupEClass = createEClass( TARGET_GROUP );
        createEAttribute( targetGroupEClass, TARGET_GROUP__SPECGROUPREF );

        targetEClass = createEClass( TARGET );
        createEAttribute( targetEClass, TARGET__SPECOBJECTREF );

        attributeDefinitionSimpleTypeEClass = createEClass( ATTRIBUTE_DEFINITION_SIMPLE_TYPE );
        createEAttribute( attributeDefinitionSimpleTypeEClass,
                          ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONBOOLEANREF );
        createEAttribute( attributeDefinitionSimpleTypeEClass,
                          ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONINTEGERREF );
        createEAttribute( attributeDefinitionSimpleTypeEClass,
                          ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONREALREF );
        createEAttribute( attributeDefinitionSimpleTypeEClass,
                          ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONSTRINGREF );

        specRelationTypeEClass = createEClass( SPEC_RELATION_TYPE );
        createEAttribute( specRelationTypeEClass, SPEC_RELATION_TYPE__SPECTYPEREF );

        attributeDefinitionEnumerationTypeEClass = createEClass( ATTRIBUTE_DEFINITION_ENUMERATION_TYPE );
        createEAttribute( attributeDefinitionEnumerationTypeEClass,
                          ATTRIBUTE_DEFINITION_ENUMERATION_TYPE__DATATYPEDEFINITIONENUMERATIONREF );

        specObjectTypeEClass = createEClass( SPEC_OBJECT_TYPE );
        createEAttribute( specObjectTypeEClass, SPEC_OBJECT_TYPE__SPECTYPEREF );

        specHierarchyRootTypeEClass = createEClass( SPEC_HIERARCHY_ROOT_TYPE );
        createEAttribute( specHierarchyRootTypeEClass, SPEC_HIERARCHY_ROOT_TYPE__SPECTYPEREF );

        specGroupTypeEClass = createEClass( SPEC_GROUP_TYPE );
        createEAttribute( specGroupTypeEClass, SPEC_GROUP_TYPE__SPECTYPEREF );

        attributeDefinitionComplexTypeEClass = createEClass( ATTRIBUTE_DEFINITION_COMPLEX_TYPE );
        createEAttribute( attributeDefinitionComplexTypeEClass,
                          ATTRIBUTE_DEFINITION_COMPLEX_TYPE__DATATYPEDEFINITIONBINARYFILEREF );
        createEAttribute( attributeDefinitionComplexTypeEClass,
                          ATTRIBUTE_DEFINITION_COMPLEX_TYPE__DATATYPEDEFINITIONDOCUMENTREF );
        createEAttribute( attributeDefinitionComplexTypeEClass,
                          ATTRIBUTE_DEFINITION_COMPLEX_TYPE__DATATYPEDEFINITIONXMLDATAREF );

        specObjectValuesEClass = createEClass( SPEC_OBJECT_VALUES );
        createEAttribute( specObjectValuesEClass, SPEC_OBJECT_VALUES__GROUP );
        createEReference( specObjectValuesEClass, SPEC_OBJECT_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENT );
        createEReference( specObjectValuesEClass, SPEC_OBJECT_VALUES__ATTRIBUTEVALUEEMBEDDEDFILE );
        createEReference( specObjectValuesEClass, SPEC_OBJECT_VALUES__ATTRIBUTEVALUEENUMERATION );
        createEReference( specObjectValuesEClass, SPEC_OBJECT_VALUES__ATTRIBUTEVALUEFILEREFERENCE );
        createEReference( specObjectValuesEClass, SPEC_OBJECT_VALUES__ATTRIBUTEVALUESIMPLE );
        createEReference( specObjectValuesEClass, SPEC_OBJECT_VALUES__ATTRIBUTEVALUEXMLDATA );

        specRelationValuesEClass = createEClass( SPEC_RELATION_VALUES );
        createEAttribute( specRelationValuesEClass, SPEC_RELATION_VALUES__GROUP );
        createEReference( specRelationValuesEClass, SPEC_RELATION_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENT );
        createEReference( specRelationValuesEClass, SPEC_RELATION_VALUES__ATTRIBUTEVALUEEMBEDDEDFILE );
        createEReference( specRelationValuesEClass, SPEC_RELATION_VALUES__ATTRIBUTEVALUEENUMERATION );
        createEReference( specRelationValuesEClass, SPEC_RELATION_VALUES__ATTRIBUTEVALUEFILEREFERENCE );
        createEReference( specRelationValuesEClass, SPEC_RELATION_VALUES__ATTRIBUTEVALUESIMPLE );
        createEReference( specRelationValuesEClass, SPEC_RELATION_VALUES__ATTRIBUTEVALUEXMLDATA );

        specGroupValuesEClass = createEClass( SPEC_GROUP_VALUES );
        createEAttribute( specGroupValuesEClass, SPEC_GROUP_VALUES__GROUP );
        createEReference( specGroupValuesEClass, SPEC_GROUP_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENT );
        createEReference( specGroupValuesEClass, SPEC_GROUP_VALUES__ATTRIBUTEVALUEEMBEDDEDFILE );
        createEReference( specGroupValuesEClass, SPEC_GROUP_VALUES__ATTRIBUTEVALUEENUMERATION );
        createEReference( specGroupValuesEClass, SPEC_GROUP_VALUES__ATTRIBUTEVALUEFILEREFERENCE );
        createEReference( specGroupValuesEClass, SPEC_GROUP_VALUES__ATTRIBUTEVALUESIMPLE );
        createEReference( specGroupValuesEClass, SPEC_GROUP_VALUES__ATTRIBUTEVALUEXMLDATA );

        specHierarchyRootValuesEClass = createEClass( SPEC_HIERARCHY_ROOT_VALUES );
        createEAttribute( specHierarchyRootValuesEClass, SPEC_HIERARCHY_ROOT_VALUES__GROUP );
        createEReference( specHierarchyRootValuesEClass, SPEC_HIERARCHY_ROOT_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENT );
        createEReference( specHierarchyRootValuesEClass, SPEC_HIERARCHY_ROOT_VALUES__ATTRIBUTEVALUEEMBEDDEDFILE );
        createEReference( specHierarchyRootValuesEClass, SPEC_HIERARCHY_ROOT_VALUES__ATTRIBUTEVALUEENUMERATION );
        createEReference( specHierarchyRootValuesEClass, SPEC_HIERARCHY_ROOT_VALUES__ATTRIBUTEVALUEFILEREFERENCE );
        createEReference( specHierarchyRootValuesEClass, SPEC_HIERARCHY_ROOT_VALUES__ATTRIBUTEVALUESIMPLE );
        createEReference( specHierarchyRootValuesEClass, SPEC_HIERARCHY_ROOT_VALUES__ATTRIBUTEVALUEXMLDATA );

        attributeValueEnumerationValuesEClass = createEClass( ATTRIBUTE_VALUE_ENUMERATION_VALUES );
        createEAttribute( attributeValueEnumerationValuesEClass, ATTRIBUTE_VALUE_ENUMERATION_VALUES__GROUP );
        createEAttribute( attributeValueEnumerationValuesEClass, ATTRIBUTE_VALUE_ENUMERATION_VALUES__ENUMVALUEREF );

        xhtmlContentEClass = createEClass( XHTML_CONTENT );

        attributeValueEmbeddedDocumentXhtmlContentEClass = createEClass( ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT_XHTML_CONTENT );
        createEAttribute( attributeValueEmbeddedDocumentXhtmlContentEClass,
                          ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT_XHTML_CONTENT__ANY );

        xmlContentXmlContentEClass = createEClass( XML_CONTENT_XML_CONTENT );

        attributeValueXmlDataXmlContentEClass = createEClass( ATTRIBUTE_VALUE_XML_DATA_XML_CONTENT );
        createEReference( attributeValueXmlDataXmlContentEClass, ATTRIBUTE_VALUE_XML_DATA_XML_CONTENT__XMLCONTENT );

        // Create enums
        accesspolicyaccessmodeenumEEnum = createEEnum( ACCESSPOLICYACCESSMODEENUM );
        booleanEEnum = createEEnum( BOOLEAN );
        datatypedefinitiondocumentformatenumEEnum = createEEnum( DATATYPEDEFINITIONDOCUMENTFORMATENUM );

        // Create data types
        accesspolicyaccessmodeenumObjectEDataType = createEDataType( ACCESSPOLICYACCESSMODEENUM_OBJECT );
        booleanObjectEDataType = createEDataType( BOOLEAN_OBJECT );
        datatypedefinitiondocumentformatenumObjectEDataType = createEDataType( DATATYPEDEFINITIONDOCUMENTFORMATENUM_OBJECT );
        floatEDataType = createEDataType( FLOAT );
        floatObjectEDataType = createEDataType( FLOAT_OBJECT );
        integerEDataType = createEDataType( INTEGER );
        refEDataType = createEDataType( REF );
        stringEDataType = createEDataType( STRING );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if( isInitialized ) return;
        isInitialized = true;

        // Initialize package
        setName( eNAME );
        setNsPrefix( eNS_PREFIX );
        setNsURI( eNS_URI );

        // Obtain other dependent packages
        XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage( XMLTypePackage.eNS_URI );

        // Add supertypes to classes

        // Initialize classes and features; add operations and parameters
        initEClass( accessPoliciesEClass,
                    AccessPolicies.class,
                    "AccessPolicies",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAccessPolicies_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        AccessPolicies.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAccessPolicies_ACCESSPOLICY(),
                        this.getAccessPolicy(),
                        null,
                        "aCCESSPOLICY",
                        null,
                        0,
                        -1,
                        AccessPolicies.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( accessPolicyEClass,
                    AccessPolicy.class,
                    "AccessPolicy",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAccessPolicy_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        AccessPolicy.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAccessPolicy_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        AccessPolicy.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAccessPolicy_ACCESSMODE(),
                        this.getACCESSPOLICYACCESSMODEENUM(),
                        "aCCESSMODE",
                        null,
                        0,
                        1,
                        AccessPolicy.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAccessPolicy_ATTRIBUTEDEFINITIONS(),
                        this.getAttributeDefinitions(),
                        null,
                        "aTTRIBUTEDEFINITIONS",
                        null,
                        0,
                        1,
                        AccessPolicy.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAccessPolicy_ATTRIBUTEVALUES(),
                        this.getAttributeValues(),
                        null,
                        "aTTRIBUTEVALUES",
                        null,
                        0,
                        1,
                        AccessPolicy.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAccessPolicy_DATATYPEDEFINITIONS(),
                        this.getDatatypeDefinitions(),
                        null,
                        "dATATYPEDEFINITIONS",
                        null,
                        0,
                        1,
                        AccessPolicy.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAccessPolicy_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        AccessPolicy.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAccessPolicy_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        AccessPolicy.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAccessPolicy_RELATIONGROUPS(),
                        this.getAccessPolicyRelationGroups(),
                        null,
                        "rELATIONGROUPS",
                        null,
                        0,
                        1,
                        AccessPolicy.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAccessPolicy_SPECGROUPS(),
                        this.getAccessPolicySpecGroups(),
                        null,
                        "sPECGROUPS",
                        null,
                        0,
                        1,
                        AccessPolicy.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAccessPolicy_SPECHIERARCHIES(),
                        this.getSpecHierarchies(),
                        null,
                        "sPECHIERARCHIES",
                        null,
                        0,
                        1,
                        AccessPolicy.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAccessPolicy_SPECHIERARCHYROOTS(),
                        this.getAccessPolicySpecHierarchyRoots(),
                        null,
                        "sPECHIERARCHYROOTS",
                        null,
                        0,
                        1,
                        AccessPolicy.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAccessPolicy_SPECOBJECTS(),
                        this.getAccessPolicySpecObjects(),
                        null,
                        "sPECOBJECTS",
                        null,
                        0,
                        1,
                        AccessPolicy.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAccessPolicy_SPECRELATIONS(),
                        this.getAccessPolicySpecRelations(),
                        null,
                        "sPECRELATIONS",
                        null,
                        0,
                        1,
                        AccessPolicy.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAccessPolicy_SPECTYPES(),
                        this.getAccessPolicySpecTypes(),
                        null,
                        "sPECTYPES",
                        null,
                        0,
                        1,
                        AccessPolicy.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( attributeDefinitionComplexEClass,
                    AttributeDefinitionComplex.class,
                    "AttributeDefinitionComplex",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAttributeDefinitionComplex_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        AttributeDefinitionComplex.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeDefinitionComplex_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        AttributeDefinitionComplex.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAttributeDefinitionComplex_DEFAULTVALUE(),
                        this.getAttributeDefinitionComplexDefaultValue(),
                        null,
                        "dEFAULTVALUE",
                        null,
                        0,
                        1,
                        AttributeDefinitionComplex.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAttributeDefinitionComplex_DEFAULTVALUE2(),
                        this.getDefaultValue2(),
                        null,
                        "dEFAULTVALUE2",
                        null,
                        0,
                        1,
                        AttributeDefinitionComplex.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAttributeDefinitionComplex_DEFAULTVALUE3(),
                        this.getDefaultValue3(),
                        null,
                        "dEFAULTVALUE3",
                        null,
                        0,
                        1,
                        AttributeDefinitionComplex.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAttributeDefinitionComplex_DEFAULTVALUE4(),
                        this.getDefaultValue4(),
                        null,
                        "dEFAULTVALUE4",
                        null,
                        0,
                        1,
                        AttributeDefinitionComplex.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeDefinitionComplex_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        AttributeDefinitionComplex.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeDefinitionComplex_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        AttributeDefinitionComplex.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAttributeDefinitionComplex_TYPE(),
                        this.getAttributeDefinitionComplexType(),
                        null,
                        "tYPE",
                        null,
                        0,
                        1,
                        AttributeDefinitionComplex.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( attributeDefinitionEnumerationEClass,
                    AttributeDefinitionEnumeration.class,
                    "AttributeDefinitionEnumeration",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAttributeDefinitionEnumeration_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        AttributeDefinitionEnumeration.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeDefinitionEnumeration_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        AttributeDefinitionEnumeration.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAttributeDefinitionEnumeration_DEFAULTVALUE(),
                        this.getAttributeDefinitionEnumerationDefaultValue(),
                        null,
                        "dEFAULTVALUE",
                        null,
                        0,
                        1,
                        AttributeDefinitionEnumeration.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeDefinitionEnumeration_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        AttributeDefinitionEnumeration.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeDefinitionEnumeration_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        AttributeDefinitionEnumeration.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeDefinitionEnumeration_MULTIVALUED(),
                        this.getBOOLEAN(),
                        "mULTIVALUED",
                        null,
                        0,
                        1,
                        AttributeDefinitionEnumeration.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAttributeDefinitionEnumeration_TYPE(),
                        this.getAttributeDefinitionEnumerationType(),
                        null,
                        "tYPE",
                        null,
                        0,
                        1,
                        AttributeDefinitionEnumeration.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( attributeDefinitionSimpleEClass,
                    AttributeDefinitionSimple.class,
                    "AttributeDefinitionSimple",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAttributeDefinitionSimple_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        AttributeDefinitionSimple.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeDefinitionSimple_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        AttributeDefinitionSimple.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAttributeDefinitionSimple_DEFAULTVALUE(),
                        this.getAttributeDefinitionSimpleDefaultValue(),
                        null,
                        "dEFAULTVALUE",
                        null,
                        0,
                        1,
                        AttributeDefinitionSimple.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeDefinitionSimple_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        AttributeDefinitionSimple.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeDefinitionSimple_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        AttributeDefinitionSimple.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAttributeDefinitionSimple_TYPE(),
                        this.getAttributeDefinitionSimpleType(),
                        null,
                        "tYPE",
                        null,
                        0,
                        1,
                        AttributeDefinitionSimple.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( attributeDefinitionsEClass,
                    AttributeDefinitions.class,
                    "AttributeDefinitions",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAttributeDefinitions_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        AttributeDefinitions.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeDefinitions_ATTRIBUTEDEFINITIONCOMPLEXREF(),
                        this.getREF(),
                        "aTTRIBUTEDEFINITIONCOMPLEXREF",
                        null,
                        0,
                        -1,
                        AttributeDefinitions.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeDefinitions_ATTRIBUTEDEFINITIONENUMERATIONREF(),
                        this.getREF(),
                        "aTTRIBUTEDEFINITIONENUMERATIONREF",
                        null,
                        0,
                        -1,
                        AttributeDefinitions.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeDefinitions_ATTRIBUTEDEFINITIONSIMPLEREF(),
                        this.getREF(),
                        "aTTRIBUTEDEFINITIONSIMPLEREF",
                        null,
                        0,
                        -1,
                        AttributeDefinitions.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( attributeValueEmbeddedDocumentEClass,
                    AttributeValueEmbeddedDocument.class,
                    "AttributeValueEmbeddedDocument",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAttributeValueEmbeddedDocument_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        AttributeValueEmbeddedDocument.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValueEmbeddedDocument_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        AttributeValueEmbeddedDocument.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAttributeValueEmbeddedDocument_DEFINITION(),
                        this.getAttributeValueEmbeddedDocumentDefinition(),
                        null,
                        "dEFINITION",
                        null,
                        0,
                        1,
                        AttributeValueEmbeddedDocument.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValueEmbeddedDocument_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        AttributeValueEmbeddedDocument.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValueEmbeddedDocument_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        AttributeValueEmbeddedDocument.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAttributeValueEmbeddedDocument_XHTMLCONTENT(),
                        this.getAttributeValueEmbeddedDocumentXhtmlContent(),
                        null,
                        "xHTMLCONTENT",
                        null,
                        0,
                        1,
                        AttributeValueEmbeddedDocument.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( attributeValueEmbeddedFileEClass,
                    AttributeValueEmbeddedFile.class,
                    "AttributeValueEmbeddedFile",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAttributeValueEmbeddedFile_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        AttributeValueEmbeddedFile.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValueEmbeddedFile_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        AttributeValueEmbeddedFile.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAttributeValueEmbeddedFile_BINARYCONTENT(),
                        this.getAttributeValueEmbeddedFileBinaryContent(),
                        null,
                        "bINARYCONTENT",
                        null,
                        0,
                        1,
                        AttributeValueEmbeddedFile.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAttributeValueEmbeddedFile_DEFINITION(),
                        this.getAttributeValueEmbeddedFileDefinition(),
                        null,
                        "dEFINITION",
                        null,
                        0,
                        1,
                        AttributeValueEmbeddedFile.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValueEmbeddedFile_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        AttributeValueEmbeddedFile.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValueEmbeddedFile_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        AttributeValueEmbeddedFile.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( attributeValueEnumerationEClass,
                    AttributeValueEnumeration.class,
                    "AttributeValueEnumeration",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAttributeValueEnumeration_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        AttributeValueEnumeration.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValueEnumeration_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        AttributeValueEnumeration.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAttributeValueEnumeration_DEFINITION(),
                        this.getAttributeValueEnumerationDefinition(),
                        null,
                        "dEFINITION",
                        null,
                        0,
                        1,
                        AttributeValueEnumeration.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValueEnumeration_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        AttributeValueEnumeration.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValueEnumeration_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        AttributeValueEnumeration.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAttributeValueEnumeration_VALUES(),
                        this.getAttributeValueEnumerationValues(),
                        null,
                        "vALUES",
                        null,
                        0,
                        1,
                        AttributeValueEnumeration.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( attributeValueFileReferenceEClass,
                    AttributeValueFileReference.class,
                    "AttributeValueFileReference",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAttributeValueFileReference_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        AttributeValueFileReference.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValueFileReference_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        AttributeValueFileReference.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAttributeValueFileReference_DEFINITION(),
                        this.getAttributeValueFileReferenceDefinition(),
                        null,
                        "dEFINITION",
                        null,
                        0,
                        1,
                        AttributeValueFileReference.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValueFileReference_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        AttributeValueFileReference.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValueFileReference_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        AttributeValueFileReference.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValueFileReference_PATHTOFILE(),
                        this.getSTRING(),
                        "pATHTOFILE",
                        null,
                        0,
                        1,
                        AttributeValueFileReference.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( attributeValueSimpleEClass,
                    AttributeValueSimple.class,
                    "AttributeValueSimple",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAttributeValueSimple_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        AttributeValueSimple.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValueSimple_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        AttributeValueSimple.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAttributeValueSimple_DEFINITION(),
                        this.getAttributeValueSimpleDefinition(),
                        null,
                        "dEFINITION",
                        null,
                        0,
                        1,
                        AttributeValueSimple.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValueSimple_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        AttributeValueSimple.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValueSimple_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        AttributeValueSimple.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValueSimple_THEVALUE(),
                        this.getSTRING(),
                        "tHEVALUE",
                        null,
                        0,
                        1,
                        AttributeValueSimple.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( attributeValuesEClass,
                    AttributeValues.class,
                    "AttributeValues",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAttributeValues_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        AttributeValues.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF(),
                        this.getREF(),
                        "aTTRIBUTEVALUEEMBEDDEDDOCUMENTREF",
                        null,
                        0,
                        -1,
                        AttributeValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValues_ATTRIBUTEVALUEEMBEDDEDFILEREF(),
                        this.getREF(),
                        "aTTRIBUTEVALUEEMBEDDEDFILEREF",
                        null,
                        0,
                        -1,
                        AttributeValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValues_ATTRIBUTEVALUEENUMERATIONREF(),
                        this.getREF(),
                        "aTTRIBUTEVALUEENUMERATIONREF",
                        null,
                        0,
                        -1,
                        AttributeValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValues_ATTRIBUTEVALUEFILEREFERENCEREF(),
                        this.getREF(),
                        "aTTRIBUTEVALUEFILEREFERENCEREF",
                        null,
                        0,
                        -1,
                        AttributeValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValues_ATTRIBUTEVALUESIMPLEREF(),
                        this.getREF(),
                        "aTTRIBUTEVALUESIMPLEREF",
                        null,
                        0,
                        -1,
                        AttributeValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValues_ATTRIBUTEVALUEXMLDATAREF(),
                        this.getREF(),
                        "aTTRIBUTEVALUEXMLDATAREF",
                        null,
                        0,
                        -1,
                        AttributeValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( attributeValueXmlDataEClass,
                    AttributeValueXmlData.class,
                    "AttributeValueXmlData",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAttributeValueXmlData_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        AttributeValueXmlData.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValueXmlData_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        AttributeValueXmlData.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAttributeValueXmlData_DEFINITION(),
                        this.getAttributeValueXmlDataDefinition(),
                        null,
                        "dEFINITION",
                        null,
                        0,
                        1,
                        AttributeValueXmlData.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValueXmlData_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        AttributeValueXmlData.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValueXmlData_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        AttributeValueXmlData.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAttributeValueXmlData_XMLCONTENT(),
                        this.getAttributeValueXmlDataXmlContent(),
                        null,
                        "xMLCONTENT",
                        null,
                        0,
                        1,
                        AttributeValueXmlData.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( binaryContentEClass,
                    BinaryContent.class,
                    "BinaryContent",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );

        initEClass( attributeValueEmbeddedFileBinaryContentEClass,
                    AttributeValueEmbeddedFileBinaryContent.class,
                    "AttributeValueEmbeddedFileBinaryContent",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEReference( getAttributeValueEmbeddedFileBinaryContent_BINARYCONTENT(),
                        this.getBinaryContent(),
                        null,
                        "bINARYCONTENT",
                        null,
                        0,
                        1,
                        AttributeValueEmbeddedFileBinaryContent.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( specHierarchyChildrenEClass,
                    SpecHierarchyChildren.class,
                    "SpecHierarchyChildren",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSpecHierarchyChildren_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        SpecHierarchyChildren.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecHierarchyChildren_SPECHIERARCHY(),
                        this.getSpecHierarchy(),
                        null,
                        "sPECHIERARCHY",
                        null,
                        0,
                        -1,
                        SpecHierarchyChildren.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( specHierarchyRootChildrenEClass,
                    SpecHierarchyRootChildren.class,
                    "SpecHierarchyRootChildren",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSpecHierarchyRootChildren_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        SpecHierarchyRootChildren.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecHierarchyRootChildren_SPECHIERARCHY(),
                        this.getSpecHierarchy(),
                        null,
                        "sPECHIERARCHY",
                        null,
                        0,
                        -1,
                        SpecHierarchyRootChildren.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( datatypeDefinitionBinaryFileEClass,
                    DatatypeDefinitionBinaryFile.class,
                    "DatatypeDefinitionBinaryFile",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getDatatypeDefinitionBinaryFile_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        DatatypeDefinitionBinaryFile.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionBinaryFile_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        DatatypeDefinitionBinaryFile.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionBinaryFile_APPLICATION(),
                        this.getSTRING(),
                        "aPPLICATION",
                        null,
                        0,
                        1,
                        DatatypeDefinitionBinaryFile.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionBinaryFile_EMBEDDED(),
                        this.getBOOLEAN(),
                        "eMBEDDED",
                        null,
                        0,
                        1,
                        DatatypeDefinitionBinaryFile.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionBinaryFile_FILENAMESUFFIX(),
                        this.getSTRING(),
                        "fILENAMESUFFIX",
                        null,
                        0,
                        1,
                        DatatypeDefinitionBinaryFile.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionBinaryFile_FORMATNAME(),
                        this.getSTRING(),
                        "fORMATNAME",
                        null,
                        0,
                        1,
                        DatatypeDefinitionBinaryFile.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionBinaryFile_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        DatatypeDefinitionBinaryFile.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionBinaryFile_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        DatatypeDefinitionBinaryFile.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionBinaryFile_MIMETYPE(),
                        this.getSTRING(),
                        "mIMETYPE",
                        null,
                        0,
                        1,
                        DatatypeDefinitionBinaryFile.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( datatypeDefinitionBooleanEClass,
                    DatatypeDefinitionBoolean.class,
                    "DatatypeDefinitionBoolean",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getDatatypeDefinitionBoolean_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        DatatypeDefinitionBoolean.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionBoolean_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        DatatypeDefinitionBoolean.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionBoolean_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        DatatypeDefinitionBoolean.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionBoolean_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        DatatypeDefinitionBoolean.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( datatypeDefinitionDocumentEClass,
                    DatatypeDefinitionDocument.class,
                    "DatatypeDefinitionDocument",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getDatatypeDefinitionDocument_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        DatatypeDefinitionDocument.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionDocument_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        DatatypeDefinitionDocument.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionDocument_EMBEDDED(),
                        this.getBOOLEAN(),
                        "eMBEDDED",
                        null,
                        0,
                        1,
                        DatatypeDefinitionDocument.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionDocument_FORMAT(),
                        this.getDATATYPEDEFINITIONDOCUMENTFORMATENUM(),
                        "fORMAT",
                        null,
                        0,
                        1,
                        DatatypeDefinitionDocument.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionDocument_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        DatatypeDefinitionDocument.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionDocument_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        DatatypeDefinitionDocument.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( datatypeDefinitionEnumerationEClass,
                    DatatypeDefinitionEnumeration.class,
                    "DatatypeDefinitionEnumeration",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getDatatypeDefinitionEnumeration_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        DatatypeDefinitionEnumeration.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionEnumeration_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        DatatypeDefinitionEnumeration.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionEnumeration_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        DatatypeDefinitionEnumeration.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionEnumeration_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        DatatypeDefinitionEnumeration.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDatatypeDefinitionEnumeration_SPECIFIEDVALUES(),
                        this.getSpecifiedValues(),
                        null,
                        "sPECIFIEDVALUES",
                        null,
                        0,
                        1,
                        DatatypeDefinitionEnumeration.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( datatypeDefinitionIntegerEClass,
                    DatatypeDefinitionInteger.class,
                    "DatatypeDefinitionInteger",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getDatatypeDefinitionInteger_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        DatatypeDefinitionInteger.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionInteger_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        DatatypeDefinitionInteger.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionInteger_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        DatatypeDefinitionInteger.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionInteger_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        DatatypeDefinitionInteger.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionInteger_MAX(),
                        this.getINTEGER(),
                        "mAX",
                        null,
                        0,
                        1,
                        DatatypeDefinitionInteger.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionInteger_MIN(),
                        this.getINTEGER(),
                        "mIN",
                        null,
                        0,
                        1,
                        DatatypeDefinitionInteger.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( datatypeDefinitionRealEClass,
                    DatatypeDefinitionReal.class,
                    "DatatypeDefinitionReal",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getDatatypeDefinitionReal_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        DatatypeDefinitionReal.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionReal_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        DatatypeDefinitionReal.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionReal_ACCURACY(),
                        this.getINTEGER(),
                        "aCCURACY",
                        null,
                        0,
                        1,
                        DatatypeDefinitionReal.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionReal_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        DatatypeDefinitionReal.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionReal_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        DatatypeDefinitionReal.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionReal_MAX(),
                        this.getFLOAT(),
                        "mAX",
                        null,
                        0,
                        1,
                        DatatypeDefinitionReal.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionReal_MIN(),
                        this.getFLOAT(),
                        "mIN",
                        null,
                        0,
                        1,
                        DatatypeDefinitionReal.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( datatypeDefinitionStringEClass,
                    DatatypeDefinitionString.class,
                    "DatatypeDefinitionString",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getDatatypeDefinitionString_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        DatatypeDefinitionString.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionString_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        DatatypeDefinitionString.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionString_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        DatatypeDefinitionString.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionString_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        DatatypeDefinitionString.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionString_MAXLENGTH(),
                        this.getINTEGER(),
                        "mAXLENGTH",
                        null,
                        0,
                        1,
                        DatatypeDefinitionString.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( datatypeDefinitionsEClass,
                    DatatypeDefinitions.class,
                    "DatatypeDefinitions",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getDatatypeDefinitions_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        DatatypeDefinitions.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitions_DATATYPEDEFINITIONBINARYFILEREF(),
                        this.getREF(),
                        "dATATYPEDEFINITIONBINARYFILEREF",
                        null,
                        0,
                        -1,
                        DatatypeDefinitions.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitions_DATATYPEDEFINITIONBOOLEANREF(),
                        this.getREF(),
                        "dATATYPEDEFINITIONBOOLEANREF",
                        null,
                        0,
                        -1,
                        DatatypeDefinitions.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitions_DATATYPEDEFINITIONDOCUMENTREF(),
                        this.getREF(),
                        "dATATYPEDEFINITIONDOCUMENTREF",
                        null,
                        0,
                        -1,
                        DatatypeDefinitions.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitions_DATATYPEDEFINITIONENUMERATIONREF(),
                        this.getREF(),
                        "dATATYPEDEFINITIONENUMERATIONREF",
                        null,
                        0,
                        -1,
                        DatatypeDefinitions.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitions_DATATYPEDEFINITIONINTEGERREF(),
                        this.getREF(),
                        "dATATYPEDEFINITIONINTEGERREF",
                        null,
                        0,
                        -1,
                        DatatypeDefinitions.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitions_DATATYPEDEFINITIONREALREF(),
                        this.getREF(),
                        "dATATYPEDEFINITIONREALREF",
                        null,
                        0,
                        -1,
                        DatatypeDefinitions.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitions_DATATYPEDEFINITIONSTRINGREF(),
                        this.getREF(),
                        "dATATYPEDEFINITIONSTRINGREF",
                        null,
                        0,
                        -1,
                        DatatypeDefinitions.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitions_DATATYPEDEFINITIONXMLDATAREF(),
                        this.getREF(),
                        "dATATYPEDEFINITIONXMLDATAREF",
                        null,
                        0,
                        -1,
                        DatatypeDefinitions.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( datatypeDefinitionXmlDataEClass,
                    DatatypeDefinitionXmlData.class,
                    "DatatypeDefinitionXmlData",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getDatatypeDefinitionXmlData_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        DatatypeDefinitionXmlData.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionXmlData_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        DatatypeDefinitionXmlData.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionXmlData_EMBEDDED(),
                        this.getBOOLEAN(),
                        "eMBEDDED",
                        null,
                        0,
                        1,
                        DatatypeDefinitionXmlData.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionXmlData_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        DatatypeDefinitionXmlData.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionXmlData_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        DatatypeDefinitionXmlData.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionXmlData_NAMESPACEURI(),
                        this.getSTRING(),
                        "nAMESPACEURI",
                        null,
                        0,
                        1,
                        DatatypeDefinitionXmlData.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDatatypeDefinitionXmlData_SCHEMALOCATION(),
                        this.getSTRING(),
                        "sCHEMALOCATION",
                        null,
                        0,
                        1,
                        DatatypeDefinitionXmlData.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( datatypesEClass,
                    Datatypes.class,
                    "Datatypes",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getDatatypes_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        Datatypes.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDatatypes_DATATYPEDEFINITIONBINARYFILE(),
                        this.getDatatypeDefinitionBinaryFile(),
                        null,
                        "dATATYPEDEFINITIONBINARYFILE",
                        null,
                        0,
                        -1,
                        Datatypes.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDatatypes_DATATYPEDEFINITIONBOOLEAN(),
                        this.getDatatypeDefinitionBoolean(),
                        null,
                        "dATATYPEDEFINITIONBOOLEAN",
                        null,
                        0,
                        -1,
                        Datatypes.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDatatypes_DATATYPEDEFINITIONDOCUMENT(),
                        this.getDatatypeDefinitionDocument(),
                        null,
                        "dATATYPEDEFINITIONDOCUMENT",
                        null,
                        0,
                        -1,
                        Datatypes.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDatatypes_DATATYPEDEFINITIONENUMERATION(),
                        this.getDatatypeDefinitionEnumeration(),
                        null,
                        "dATATYPEDEFINITIONENUMERATION",
                        null,
                        0,
                        -1,
                        Datatypes.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDatatypes_DATATYPEDEFINITIONINTEGER(),
                        this.getDatatypeDefinitionInteger(),
                        null,
                        "dATATYPEDEFINITIONINTEGER",
                        null,
                        0,
                        -1,
                        Datatypes.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDatatypes_DATATYPEDEFINITIONREAL(),
                        this.getDatatypeDefinitionReal(),
                        null,
                        "dATATYPEDEFINITIONREAL",
                        null,
                        0,
                        -1,
                        Datatypes.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDatatypes_DATATYPEDEFINITIONSTRING(),
                        this.getDatatypeDefinitionString(),
                        null,
                        "dATATYPEDEFINITIONSTRING",
                        null,
                        0,
                        -1,
                        Datatypes.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDatatypes_DATATYPEDEFINITIONXMLDATA(),
                        this.getDatatypeDefinitionXmlData(),
                        null,
                        "dATATYPEDEFINITIONXMLDATA",
                        null,
                        0,
                        -1,
                        Datatypes.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( defaultValue2EClass,
                    DefaultValue2.class,
                    "DefaultValue2",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEReference( getDefaultValue2_ATTRIBUTEVALUEEMBEDDEDFILE(),
                        this.getAttributeValueEmbeddedFile(),
                        null,
                        "aTTRIBUTEVALUEEMBEDDEDFILE",
                        null,
                        0,
                        1,
                        DefaultValue2.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( defaultValue3EClass,
                    DefaultValue3.class,
                    "DefaultValue3",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEReference( getDefaultValue3_ATTRIBUTEVALUEEMBEDDEDDOCUMENT(),
                        this.getAttributeValueEmbeddedDocument(),
                        null,
                        "aTTRIBUTEVALUEEMBEDDEDDOCUMENT",
                        null,
                        0,
                        1,
                        DefaultValue3.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( defaultValue4EClass,
                    DefaultValue4.class,
                    "DefaultValue4",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEReference( getDefaultValue4_ATTRIBUTEVALUEFILEREFERENCE(),
                        this.getAttributeValueFileReference(),
                        null,
                        "aTTRIBUTEVALUEFILEREFERENCE",
                        null,
                        0,
                        1,
                        DefaultValue4.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( attributeDefinitionSimpleDefaultValueEClass,
                    AttributeDefinitionSimpleDefaultValue.class,
                    "AttributeDefinitionSimpleDefaultValue",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEReference( getAttributeDefinitionSimpleDefaultValue_ATTRIBUTEVALUESIMPLE(),
                        this.getAttributeValueSimple(),
                        null,
                        "aTTRIBUTEVALUESIMPLE",
                        null,
                        0,
                        1,
                        AttributeDefinitionSimpleDefaultValue.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( attributeDefinitionEnumerationDefaultValueEClass,
                    AttributeDefinitionEnumerationDefaultValue.class,
                    "AttributeDefinitionEnumerationDefaultValue",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAttributeDefinitionEnumerationDefaultValue_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        AttributeDefinitionEnumerationDefaultValue.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getAttributeDefinitionEnumerationDefaultValue_ATTRIBUTEVALUEENUMERATION(),
                        this.getAttributeValueEnumeration(),
                        null,
                        "aTTRIBUTEVALUEENUMERATION",
                        null,
                        0,
                        -1,
                        AttributeDefinitionEnumerationDefaultValue.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( attributeDefinitionComplexDefaultValueEClass,
                    AttributeDefinitionComplexDefaultValue.class,
                    "AttributeDefinitionComplexDefaultValue",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEReference( getAttributeDefinitionComplexDefaultValue_ATTRIBUTEVALUEXMLDATA(),
                        this.getAttributeValueXmlData(),
                        null,
                        "aTTRIBUTEVALUEXMLDATA",
                        null,
                        0,
                        1,
                        AttributeDefinitionComplexDefaultValue.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( attributeValueEmbeddedDocumentDefinitionEClass,
                    AttributeValueEmbeddedDocumentDefinition.class,
                    "AttributeValueEmbeddedDocumentDefinition",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAttributeValueEmbeddedDocumentDefinition_ATTRIBUTEDEFINITIONCOMPLEXREF(),
                        this.getREF(),
                        "aTTRIBUTEDEFINITIONCOMPLEXREF",
                        null,
                        0,
                        1,
                        AttributeValueEmbeddedDocumentDefinition.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( attributeValueFileReferenceDefinitionEClass,
                    AttributeValueFileReferenceDefinition.class,
                    "AttributeValueFileReferenceDefinition",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAttributeValueFileReferenceDefinition_ATTRIBUTEDEFINITIONCOMPLEXREF(),
                        this.getREF(),
                        "aTTRIBUTEDEFINITIONCOMPLEXREF",
                        null,
                        0,
                        1,
                        AttributeValueFileReferenceDefinition.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( attributeValueEmbeddedFileDefinitionEClass,
                    AttributeValueEmbeddedFileDefinition.class,
                    "AttributeValueEmbeddedFileDefinition",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAttributeValueEmbeddedFileDefinition_ATTRIBUTEDEFINITIONCOMPLEXREF(),
                        this.getREF(),
                        "aTTRIBUTEDEFINITIONCOMPLEXREF",
                        null,
                        0,
                        1,
                        AttributeValueEmbeddedFileDefinition.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( attributeValueSimpleDefinitionEClass,
                    AttributeValueSimpleDefinition.class,
                    "AttributeValueSimpleDefinition",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAttributeValueSimpleDefinition_ATTRIBUTEDEFINITIONSIMPLEREF(),
                        this.getREF(),
                        "aTTRIBUTEDEFINITIONSIMPLEREF",
                        null,
                        0,
                        1,
                        AttributeValueSimpleDefinition.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( attributeValueEnumerationDefinitionEClass,
                    AttributeValueEnumerationDefinition.class,
                    "AttributeValueEnumerationDefinition",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAttributeValueEnumerationDefinition_ATTRIBUTEDEFINITIONENUMERATIONREF(),
                        this.getREF(),
                        "aTTRIBUTEDEFINITIONENUMERATIONREF",
                        null,
                        0,
                        1,
                        AttributeValueEnumerationDefinition.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( attributeValueXmlDataDefinitionEClass,
                    AttributeValueXmlDataDefinition.class,
                    "AttributeValueXmlDataDefinition",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAttributeValueXmlDataDefinition_ATTRIBUTEDEFINITIONCOMPLEXREF(),
                        this.getREF(),
                        "aTTRIBUTEDEFINITIONCOMPLEXREF",
                        null,
                        0,
                        1,
                        AttributeValueXmlDataDefinition.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( documentRootEClass,
                    DocumentRoot.class,
                    "DocumentRoot",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getDocumentRoot_Mixed(),
                        ecorePackage.getEFeatureMapEntry(),
                        "mixed",
                        null,
                        0,
                        -1,
                        null,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_XMLNSPrefixMap(),
                        ecorePackage.getEStringToStringMapEntry(),
                        null,
                        "xMLNSPrefixMap",
                        null,
                        0,
                        -1,
                        null,
                        IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_XSISchemaLocation(),
                        ecorePackage.getEStringToStringMapEntry(),
                        null,
                        "xSISchemaLocation",
                        null,
                        0,
                        -1,
                        null,
                        IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_ACCESSPOLICY(),
                        this.getAccessPolicy(),
                        null,
                        "aCCESSPOLICY",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_ATTRIBUTEDEFINITIONCOMPLEX(),
                        this.getAttributeDefinitionComplex(),
                        null,
                        "aTTRIBUTEDEFINITIONCOMPLEX",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_ATTRIBUTEDEFINITIONENUMERATION(),
                        this.getAttributeDefinitionEnumeration(),
                        null,
                        "aTTRIBUTEDEFINITIONENUMERATION",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_ATTRIBUTEDEFINITIONSIMPLE(),
                        this.getAttributeDefinitionSimple(),
                        null,
                        "aTTRIBUTEDEFINITIONSIMPLE",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_ATTRIBUTEVALUEEMBEDDEDDOCUMENT(),
                        this.getAttributeValueEmbeddedDocument(),
                        null,
                        "aTTRIBUTEVALUEEMBEDDEDDOCUMENT",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_ATTRIBUTEVALUEEMBEDDEDFILE(),
                        this.getAttributeValueEmbeddedFile(),
                        null,
                        "aTTRIBUTEVALUEEMBEDDEDFILE",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_ATTRIBUTEVALUEENUMERATION(),
                        this.getAttributeValueEnumeration(),
                        null,
                        "aTTRIBUTEVALUEENUMERATION",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_ATTRIBUTEVALUEFILEREFERENCE(),
                        this.getAttributeValueFileReference(),
                        null,
                        "aTTRIBUTEVALUEFILEREFERENCE",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_ATTRIBUTEVALUESIMPLE(),
                        this.getAttributeValueSimple(),
                        null,
                        "aTTRIBUTEVALUESIMPLE",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_ATTRIBUTEVALUEXMLDATA(),
                        this.getAttributeValueXmlData(),
                        null,
                        "aTTRIBUTEVALUEXMLDATA",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_BINARYCONTENT(),
                        this.getBinaryContent(),
                        null,
                        "bINARYCONTENT",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_DATATYPEDEFINITIONBINARYFILE(),
                        this.getDatatypeDefinitionBinaryFile(),
                        null,
                        "dATATYPEDEFINITIONBINARYFILE",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_DATATYPEDEFINITIONBOOLEAN(),
                        this.getDatatypeDefinitionBoolean(),
                        null,
                        "dATATYPEDEFINITIONBOOLEAN",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_DATATYPEDEFINITIONDOCUMENT(),
                        this.getDatatypeDefinitionDocument(),
                        null,
                        "dATATYPEDEFINITIONDOCUMENT",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_DATATYPEDEFINITIONENUMERATION(),
                        this.getDatatypeDefinitionEnumeration(),
                        null,
                        "dATATYPEDEFINITIONENUMERATION",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_DATATYPEDEFINITIONINTEGER(),
                        this.getDatatypeDefinitionInteger(),
                        null,
                        "dATATYPEDEFINITIONINTEGER",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_DATATYPEDEFINITIONREAL(),
                        this.getDatatypeDefinitionReal(),
                        null,
                        "dATATYPEDEFINITIONREAL",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_DATATYPEDEFINITIONSTRING(),
                        this.getDatatypeDefinitionString(),
                        null,
                        "dATATYPEDEFINITIONSTRING",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_DATATYPEDEFINITIONXMLDATA(),
                        this.getDatatypeDefinitionXmlData(),
                        null,
                        "dATATYPEDEFINITIONXMLDATA",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_EMBEDDEDVALUE(),
                        this.getEmbeddedValue(),
                        null,
                        "eMBEDDEDVALUE",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_ENUMVALUE(),
                        this.getEnumValue(),
                        null,
                        "eNUMVALUE",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_RELATIONGROUP(),
                        this.getRelationGroup(),
                        null,
                        "rELATIONGROUP",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_RIF(),
                        this.getRif(),
                        null,
                        "rIF",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_SPECGROUP(),
                        this.getSpecGroup(),
                        null,
                        "sPECGROUP",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_SPECHIERARCHY(),
                        this.getSpecHierarchy(),
                        null,
                        "sPECHIERARCHY",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_SPECHIERARCHYROOT(),
                        this.getSpecHierarchyRoot(),
                        null,
                        "sPECHIERARCHYROOT",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_SPECOBJECT(),
                        this.getSpecObject(),
                        null,
                        "sPECOBJECT",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_SPECRELATION(),
                        this.getSpecRelation(),
                        null,
                        "sPECRELATION",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_SPECTYPE(),
                        this.getSpecType(),
                        null,
                        "sPECTYPE",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_XHTMLCONTENT(),
                        this.getXhtmlContent(),
                        null,
                        "xHTMLCONTENT",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getDocumentRoot_XMLCONTENT(),
                        this.getXmlContentXmlContent(),
                        null,
                        "xMLCONTENT",
                        null,
                        0,
                        -2,
                        null,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getDocumentRoot_ID(),
                        theXMLTypePackage.getString(),
                        "iD",
                        null,
                        0,
                        1,
                        null,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( embeddedValueEClass,
                    EmbeddedValue.class,
                    "EmbeddedValue",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getEmbeddedValue_KEY(),
                        this.getINTEGER(),
                        "kEY",
                        null,
                        0,
                        1,
                        EmbeddedValue.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getEmbeddedValue_OTHERCONTENT(),
                        this.getSTRING(),
                        "oTHERCONTENT",
                        null,
                        0,
                        1,
                        EmbeddedValue.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( enumValueEClass,
                    EnumValue.class,
                    "EnumValue",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getEnumValue_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        EnumValue.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getEnumValue_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        EnumValue.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getEnumValue_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        EnumValue.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getEnumValue_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        EnumValue.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getEnumValue_PROPERTIES(),
                        this.getProperties(),
                        null,
                        "pROPERTIES",
                        null,
                        0,
                        1,
                        EnumValue.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( objectEClass,
                    era.foss.model.core.rif.Object.class,
                    "Object",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getObject_SPECOBJECTREF(),
                        this.getREF(),
                        "sPECOBJECTREF",
                        null,
                        0,
                        1,
                        era.foss.model.core.rif.Object.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( propertiesEClass,
                    Properties.class,
                    "Properties",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEReference( getProperties_EMBEDDEDVALUE(),
                        this.getEmbeddedValue(),
                        null,
                        "eMBEDDEDVALUE",
                        null,
                        0,
                        1,
                        Properties.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( specGroupRelationGroupsEClass,
                    SpecGroupRelationGroups.class,
                    "SpecGroupRelationGroups",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSpecGroupRelationGroups_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        SpecGroupRelationGroups.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecGroupRelationGroups_RELATIONGROUP(),
                        this.getRelationGroup(),
                        null,
                        "rELATIONGROUP",
                        null,
                        0,
                        -1,
                        SpecGroupRelationGroups.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( accessPolicyRelationGroupsEClass,
                    AccessPolicyRelationGroups.class,
                    "AccessPolicyRelationGroups",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAccessPolicyRelationGroups_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        AccessPolicyRelationGroups.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAccessPolicyRelationGroups_RELATIONGROUPREF(),
                        this.getREF(),
                        "rELATIONGROUPREF",
                        null,
                        0,
                        -1,
                        AccessPolicyRelationGroups.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( relationGroupEClass,
                    RelationGroup.class,
                    "RelationGroup",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getRelationGroup_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        RelationGroup.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getRelationGroup_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        RelationGroup.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getRelationGroup_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        RelationGroup.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getRelationGroup_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        RelationGroup.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getRelationGroup_RELATIONTYPE(),
                        this.getRelationType(),
                        null,
                        "rELATIONTYPE",
                        null,
                        0,
                        1,
                        RelationGroup.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getRelationGroup_SPECRELATIONS(),
                        this.getRelationGroupSpecRelations(),
                        null,
                        "sPECRELATIONS",
                        null,
                        0,
                        1,
                        RelationGroup.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getRelationGroup_TARGETGROUP(),
                        this.getTargetGroup(),
                        null,
                        "tARGETGROUP",
                        null,
                        0,
                        1,
                        RelationGroup.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( relationTypeEClass,
                    RelationType.class,
                    "RelationType",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getRelationType_SPECTYPEREF(),
                        this.getREF(),
                        "sPECTYPEREF",
                        null,
                        0,
                        1,
                        RelationType.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( rifEClass, Rif.class, "Rif", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getRif_SPECHIERARCHYROOTS(),
                        this.getRifSpecHierarchyRoots(),
                        null,
                        "sPECHIERARCHYROOTS",
                        null,
                        0,
                        1,
                        Rif.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getRif_ACCESSPOLICIES(),
                        this.getAccessPolicies(),
                        null,
                        "aCCESSPOLICIES",
                        null,
                        0,
                        1,
                        Rif.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getRif_AUTHOR(),
                        this.getSTRING(),
                        "aUTHOR",
                        null,
                        0,
                        1,
                        Rif.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getRif_COMMENT(),
                        this.getSTRING(),
                        "cOMMENT",
                        null,
                        0,
                        1,
                        Rif.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getRif_COUNTRYCODE(),
                        this.getSTRING(),
                        "cOUNTRYCODE",
                        null,
                        0,
                        1,
                        Rif.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getRif_CREATIONTIME(),
                        this.getSTRING(),
                        "cREATIONTIME",
                        null,
                        0,
                        1,
                        Rif.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getRif_DATATYPES(),
                        this.getDatatypes(),
                        null,
                        "dATATYPES",
                        null,
                        0,
                        1,
                        Rif.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getRif_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        Rif.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getRif_SOURCETOOLID(),
                        this.getSTRING(),
                        "sOURCETOOLID",
                        null,
                        0,
                        1,
                        Rif.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getRif_SPECGROUPS(),
                        this.getRifSpecGroups(),
                        null,
                        "sPECGROUPS",
                        null,
                        0,
                        1,
                        Rif.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getRif_SPECOBJECTS(),
                        this.getRifSpecObjects(),
                        null,
                        "sPECOBJECTS",
                        null,
                        0,
                        1,
                        Rif.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getRif_SPECRELATIONS(),
                        this.getRifSpecRelations(),
                        null,
                        "sPECRELATIONS",
                        null,
                        0,
                        1,
                        Rif.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getRif_SPECTYPES(),
                        this.getRifSpecTypes(),
                        null,
                        "sPECTYPES",
                        null,
                        0,
                        1,
                        Rif.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getRif_TITLE(),
                        this.getSTRING(),
                        "tITLE",
                        null,
                        0,
                        1,
                        Rif.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getRif_VERSION(),
                        this.getSTRING(),
                        "vERSION",
                        null,
                        0,
                        1,
                        Rif.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSource_SPECOBJECTREF(),
                        this.getREF(),
                        "sPECOBJECTREF",
                        null,
                        0,
                        1,
                        Source.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( specAttributesEClass,
                    SpecAttributes.class,
                    "SpecAttributes",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSpecAttributes_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        SpecAttributes.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecAttributes_ATTRIBUTEDEFINITIONCOMPLEX(),
                        this.getAttributeDefinitionComplex(),
                        null,
                        "aTTRIBUTEDEFINITIONCOMPLEX",
                        null,
                        0,
                        -1,
                        SpecAttributes.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecAttributes_ATTRIBUTEDEFINITIONENUMERATION(),
                        this.getAttributeDefinitionEnumeration(),
                        null,
                        "aTTRIBUTEDEFINITIONENUMERATION",
                        null,
                        0,
                        -1,
                        SpecAttributes.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecAttributes_ATTRIBUTEDEFINITIONSIMPLE(),
                        this.getAttributeDefinitionSimple(),
                        null,
                        "aTTRIBUTEDEFINITIONSIMPLE",
                        null,
                        0,
                        -1,
                        SpecAttributes.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( rifSpecGroupsEClass,
                    RifSpecGroups.class,
                    "RifSpecGroups",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getRifSpecGroups_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        RifSpecGroups.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getRifSpecGroups_SPECGROUP(),
                        this.getSpecGroup(),
                        null,
                        "sPECGROUP",
                        null,
                        0,
                        -1,
                        RifSpecGroups.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( accessPolicySpecGroupsEClass,
                    AccessPolicySpecGroups.class,
                    "AccessPolicySpecGroups",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAccessPolicySpecGroups_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        AccessPolicySpecGroups.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAccessPolicySpecGroups_SPECGROUPREF(),
                        this.getREF(),
                        "sPECGROUPREF",
                        null,
                        0,
                        -1,
                        AccessPolicySpecGroups.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( specGroupEClass,
                    SpecGroup.class,
                    "SpecGroup",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSpecGroup_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        SpecGroup.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getSpecGroup_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        SpecGroup.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getSpecGroup_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        SpecGroup.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getSpecGroup_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        SpecGroup.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecGroup_RELATIONGROUPS(),
                        this.getSpecGroupRelationGroups(),
                        null,
                        "rELATIONGROUPS",
                        null,
                        0,
                        1,
                        SpecGroup.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecGroup_SPECOBJECTS(),
                        this.getSpecGroupSpecObjects(),
                        null,
                        "sPECOBJECTS",
                        null,
                        0,
                        1,
                        SpecGroup.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecGroup_TYPE(),
                        this.getSpecGroupType(),
                        null,
                        "tYPE",
                        null,
                        0,
                        1,
                        SpecGroup.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecGroup_VALUES(),
                        this.getSpecGroupValues(),
                        null,
                        "vALUES",
                        null,
                        0,
                        1,
                        SpecGroup.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( specHierarchiesEClass,
                    SpecHierarchies.class,
                    "SpecHierarchies",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSpecHierarchies_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        SpecHierarchies.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getSpecHierarchies_SPECHIERARCHYREF(),
                        this.getREF(),
                        "sPECHIERARCHYREF",
                        null,
                        0,
                        -1,
                        SpecHierarchies.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( rifSpecHierarchyRootsEClass,
                    RifSpecHierarchyRoots.class,
                    "RifSpecHierarchyRoots",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getRifSpecHierarchyRoots_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        RifSpecHierarchyRoots.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getRifSpecHierarchyRoots_SPECHIERARCHYROOT(),
                        this.getSpecHierarchyRoot(),
                        null,
                        "sPECHIERARCHYROOT",
                        null,
                        0,
                        -1,
                        RifSpecHierarchyRoots.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( accessPolicySpecHierarchyRootsEClass,
                    AccessPolicySpecHierarchyRoots.class,
                    "AccessPolicySpecHierarchyRoots",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAccessPolicySpecHierarchyRoots_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        AccessPolicySpecHierarchyRoots.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAccessPolicySpecHierarchyRoots_SPECHIERARCHYROOTREF(),
                        this.getREF(),
                        "sPECHIERARCHYROOTREF",
                        null,
                        0,
                        -1,
                        AccessPolicySpecHierarchyRoots.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( specHierarchyRootEClass,
                    SpecHierarchyRoot.class,
                    "SpecHierarchyRoot",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSpecHierarchyRoot_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        SpecHierarchyRoot.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getSpecHierarchyRoot_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        SpecHierarchyRoot.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecHierarchyRoot_CHILDREN(),
                        this.getSpecHierarchyRootChildren(),
                        null,
                        "cHILDREN",
                        null,
                        0,
                        1,
                        SpecHierarchyRoot.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getSpecHierarchyRoot_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        SpecHierarchyRoot.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getSpecHierarchyRoot_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        SpecHierarchyRoot.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecHierarchyRoot_TYPE(),
                        this.getSpecHierarchyRootType(),
                        null,
                        "tYPE",
                        null,
                        0,
                        1,
                        SpecHierarchyRoot.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecHierarchyRoot_VALUES(),
                        this.getSpecHierarchyRootValues(),
                        null,
                        "vALUES",
                        null,
                        0,
                        1,
                        SpecHierarchyRoot.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( specHierarchyEClass,
                    SpecHierarchy.class,
                    "SpecHierarchy",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSpecHierarchy_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        SpecHierarchy.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getSpecHierarchy_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        SpecHierarchy.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecHierarchy_CHILDREN(),
                        this.getSpecHierarchyChildren(),
                        null,
                        "cHILDREN",
                        null,
                        0,
                        1,
                        SpecHierarchy.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getSpecHierarchy_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        SpecHierarchy.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getSpecHierarchy_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        SpecHierarchy.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecHierarchy_OBJECT(),
                        this.getObject(),
                        null,
                        "oBJECT",
                        null,
                        0,
                        1,
                        SpecHierarchy.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( specifiedValuesEClass,
                    SpecifiedValues.class,
                    "SpecifiedValues",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSpecifiedValues_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        SpecifiedValues.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecifiedValues_ENUMVALUE(),
                        this.getEnumValue(),
                        null,
                        "eNUMVALUE",
                        null,
                        0,
                        -1,
                        SpecifiedValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( specGroupSpecObjectsEClass,
                    SpecGroupSpecObjects.class,
                    "SpecGroupSpecObjects",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSpecGroupSpecObjects_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        SpecGroupSpecObjects.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getSpecGroupSpecObjects_SPECOBJECTREF(),
                        this.getREF(),
                        "sPECOBJECTREF",
                        null,
                        0,
                        -1,
                        SpecGroupSpecObjects.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( rifSpecObjectsEClass,
                    RifSpecObjects.class,
                    "RifSpecObjects",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getRifSpecObjects_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        RifSpecObjects.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getRifSpecObjects_SPECOBJECT(),
                        this.getSpecObject(),
                        null,
                        "sPECOBJECT",
                        null,
                        0,
                        -1,
                        RifSpecObjects.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( accessPolicySpecObjectsEClass,
                    AccessPolicySpecObjects.class,
                    "AccessPolicySpecObjects",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAccessPolicySpecObjects_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        AccessPolicySpecObjects.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAccessPolicySpecObjects_SPECOBJECTREF(),
                        this.getREF(),
                        "sPECOBJECTREF",
                        null,
                        0,
                        -1,
                        AccessPolicySpecObjects.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( specObjectEClass,
                    SpecObject.class,
                    "SpecObject",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSpecObject_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        SpecObject.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getSpecObject_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        SpecObject.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getSpecObject_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        SpecObject.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getSpecObject_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        SpecObject.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecObject_TYPE(),
                        this.getSpecObjectType(),
                        null,
                        "tYPE",
                        null,
                        0,
                        1,
                        SpecObject.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecObject_VALUES(),
                        this.getSpecObjectValues(),
                        null,
                        "vALUES",
                        null,
                        0,
                        1,
                        SpecObject.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( rifSpecRelationsEClass,
                    RifSpecRelations.class,
                    "RifSpecRelations",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getRifSpecRelations_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        RifSpecRelations.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getRifSpecRelations_SPECRELATION(),
                        this.getSpecRelation(),
                        null,
                        "sPECRELATION",
                        null,
                        0,
                        -1,
                        RifSpecRelations.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( relationGroupSpecRelationsEClass,
                    RelationGroupSpecRelations.class,
                    "RelationGroupSpecRelations",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getRelationGroupSpecRelations_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        RelationGroupSpecRelations.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getRelationGroupSpecRelations_SPECRELATIONREF(),
                        this.getREF(),
                        "sPECRELATIONREF",
                        null,
                        0,
                        -1,
                        RelationGroupSpecRelations.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( accessPolicySpecRelationsEClass,
                    AccessPolicySpecRelations.class,
                    "AccessPolicySpecRelations",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAccessPolicySpecRelations_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        AccessPolicySpecRelations.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAccessPolicySpecRelations_SPECRELATIONREF(),
                        this.getREF(),
                        "sPECRELATIONREF",
                        null,
                        0,
                        -1,
                        AccessPolicySpecRelations.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( specRelationEClass,
                    SpecRelation.class,
                    "SpecRelation",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSpecRelation_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        SpecRelation.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getSpecRelation_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        SpecRelation.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecRelation_SOURCE(),
                        this.getSource(),
                        null,
                        "sOURCE",
                        null,
                        0,
                        1,
                        SpecRelation.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecRelation_TARGET(),
                        this.getTarget(),
                        null,
                        "tARGET",
                        null,
                        0,
                        1,
                        SpecRelation.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getSpecRelation_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        SpecRelation.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getSpecRelation_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        SpecRelation.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecRelation_TYPE(),
                        this.getSpecRelationType(),
                        null,
                        "tYPE",
                        null,
                        0,
                        1,
                        SpecRelation.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecRelation_VALUES(),
                        this.getSpecRelationValues(),
                        null,
                        "vALUES",
                        null,
                        0,
                        1,
                        SpecRelation.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( rifSpecTypesEClass,
                    RifSpecTypes.class,
                    "RifSpecTypes",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getRifSpecTypes_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        RifSpecTypes.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getRifSpecTypes_SPECTYPE(),
                        this.getSpecType(),
                        null,
                        "sPECTYPE",
                        null,
                        0,
                        -1,
                        RifSpecTypes.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( accessPolicySpecTypesEClass,
                    AccessPolicySpecTypes.class,
                    "AccessPolicySpecTypes",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAccessPolicySpecTypes_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        AccessPolicySpecTypes.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAccessPolicySpecTypes_SPECTYPEREF(),
                        this.getREF(),
                        "sPECTYPEREF",
                        null,
                        0,
                        -1,
                        AccessPolicySpecTypes.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( specTypeEClass,
                    SpecType.class,
                    "SpecType",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSpecType_LONGNAME(),
                        this.getSTRING(),
                        "lONGNAME",
                        null,
                        0,
                        1,
                        SpecType.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getSpecType_DESC(),
                        this.getSTRING(),
                        "dESC",
                        null,
                        0,
                        1,
                        SpecType.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getSpecType_IDENTIFIER(),
                        this.getSTRING(),
                        "iDENTIFIER",
                        null,
                        0,
                        1,
                        SpecType.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getSpecType_LASTCHANGE(),
                        this.getSTRING(),
                        "lASTCHANGE",
                        null,
                        0,
                        1,
                        SpecType.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecType_SPECATTRIBUTES(),
                        this.getSpecAttributes(),
                        null,
                        "sPECATTRIBUTES",
                        null,
                        0,
                        1,
                        SpecType.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getSpecType_ID(),
                        theXMLTypePackage.getString(),
                        "iD",
                        null,
                        0,
                        1,
                        SpecType.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( targetGroupEClass,
                    TargetGroup.class,
                    "TargetGroup",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getTargetGroup_SPECGROUPREF(),
                        this.getREF(),
                        "sPECGROUPREF",
                        null,
                        0,
                        1,
                        TargetGroup.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( targetEClass, Target.class, "Target", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getTarget_SPECOBJECTREF(),
                        this.getREF(),
                        "sPECOBJECTREF",
                        null,
                        0,
                        1,
                        Target.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( attributeDefinitionSimpleTypeEClass,
                    AttributeDefinitionSimpleType.class,
                    "AttributeDefinitionSimpleType",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAttributeDefinitionSimpleType_DATATYPEDEFINITIONBOOLEANREF(),
                        this.getREF(),
                        "dATATYPEDEFINITIONBOOLEANREF",
                        null,
                        0,
                        1,
                        AttributeDefinitionSimpleType.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeDefinitionSimpleType_DATATYPEDEFINITIONINTEGERREF(),
                        this.getREF(),
                        "dATATYPEDEFINITIONINTEGERREF",
                        null,
                        0,
                        1,
                        AttributeDefinitionSimpleType.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeDefinitionSimpleType_DATATYPEDEFINITIONREALREF(),
                        this.getREF(),
                        "dATATYPEDEFINITIONREALREF",
                        null,
                        0,
                        1,
                        AttributeDefinitionSimpleType.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeDefinitionSimpleType_DATATYPEDEFINITIONSTRINGREF(),
                        this.getREF(),
                        "dATATYPEDEFINITIONSTRINGREF",
                        null,
                        0,
                        1,
                        AttributeDefinitionSimpleType.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( specRelationTypeEClass,
                    SpecRelationType.class,
                    "SpecRelationType",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSpecRelationType_SPECTYPEREF(),
                        this.getREF(),
                        "sPECTYPEREF",
                        null,
                        0,
                        1,
                        SpecRelationType.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( attributeDefinitionEnumerationTypeEClass,
                    AttributeDefinitionEnumerationType.class,
                    "AttributeDefinitionEnumerationType",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAttributeDefinitionEnumerationType_DATATYPEDEFINITIONENUMERATIONREF(),
                        this.getREF(),
                        "dATATYPEDEFINITIONENUMERATIONREF",
                        null,
                        0,
                        1,
                        AttributeDefinitionEnumerationType.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( specObjectTypeEClass,
                    SpecObjectType.class,
                    "SpecObjectType",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSpecObjectType_SPECTYPEREF(),
                        this.getREF(),
                        "sPECTYPEREF",
                        null,
                        0,
                        1,
                        SpecObjectType.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( specHierarchyRootTypeEClass,
                    SpecHierarchyRootType.class,
                    "SpecHierarchyRootType",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSpecHierarchyRootType_SPECTYPEREF(),
                        this.getREF(),
                        "sPECTYPEREF",
                        null,
                        0,
                        1,
                        SpecHierarchyRootType.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( specGroupTypeEClass,
                    SpecGroupType.class,
                    "SpecGroupType",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSpecGroupType_SPECTYPEREF(),
                        this.getREF(),
                        "sPECTYPEREF",
                        null,
                        0,
                        1,
                        SpecGroupType.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( attributeDefinitionComplexTypeEClass,
                    AttributeDefinitionComplexType.class,
                    "AttributeDefinitionComplexType",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAttributeDefinitionComplexType_DATATYPEDEFINITIONBINARYFILEREF(),
                        this.getREF(),
                        "dATATYPEDEFINITIONBINARYFILEREF",
                        null,
                        0,
                        1,
                        AttributeDefinitionComplexType.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeDefinitionComplexType_DATATYPEDEFINITIONDOCUMENTREF(),
                        this.getREF(),
                        "dATATYPEDEFINITIONDOCUMENTREF",
                        null,
                        0,
                        1,
                        AttributeDefinitionComplexType.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeDefinitionComplexType_DATATYPEDEFINITIONXMLDATAREF(),
                        this.getREF(),
                        "dATATYPEDEFINITIONXMLDATAREF",
                        null,
                        0,
                        1,
                        AttributeDefinitionComplexType.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( specObjectValuesEClass,
                    SpecObjectValues.class,
                    "SpecObjectValues",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSpecObjectValues_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        SpecObjectValues.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecObjectValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENT(),
                        this.getAttributeValueEmbeddedDocument(),
                        null,
                        "aTTRIBUTEVALUEEMBEDDEDDOCUMENT",
                        null,
                        0,
                        -1,
                        SpecObjectValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecObjectValues_ATTRIBUTEVALUEEMBEDDEDFILE(),
                        this.getAttributeValueEmbeddedFile(),
                        null,
                        "aTTRIBUTEVALUEEMBEDDEDFILE",
                        null,
                        0,
                        -1,
                        SpecObjectValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecObjectValues_ATTRIBUTEVALUEENUMERATION(),
                        this.getAttributeValueEnumeration(),
                        null,
                        "aTTRIBUTEVALUEENUMERATION",
                        null,
                        0,
                        -1,
                        SpecObjectValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecObjectValues_ATTRIBUTEVALUEFILEREFERENCE(),
                        this.getAttributeValueFileReference(),
                        null,
                        "aTTRIBUTEVALUEFILEREFERENCE",
                        null,
                        0,
                        -1,
                        SpecObjectValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecObjectValues_ATTRIBUTEVALUESIMPLE(),
                        this.getAttributeValueSimple(),
                        null,
                        "aTTRIBUTEVALUESIMPLE",
                        null,
                        0,
                        -1,
                        SpecObjectValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecObjectValues_ATTRIBUTEVALUEXMLDATA(),
                        this.getAttributeValueXmlData(),
                        null,
                        "aTTRIBUTEVALUEXMLDATA",
                        null,
                        0,
                        -1,
                        SpecObjectValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( specRelationValuesEClass,
                    SpecRelationValues.class,
                    "SpecRelationValues",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSpecRelationValues_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        SpecRelationValues.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecRelationValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENT(),
                        this.getAttributeValueEmbeddedDocument(),
                        null,
                        "aTTRIBUTEVALUEEMBEDDEDDOCUMENT",
                        null,
                        0,
                        -1,
                        SpecRelationValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecRelationValues_ATTRIBUTEVALUEEMBEDDEDFILE(),
                        this.getAttributeValueEmbeddedFile(),
                        null,
                        "aTTRIBUTEVALUEEMBEDDEDFILE",
                        null,
                        0,
                        -1,
                        SpecRelationValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecRelationValues_ATTRIBUTEVALUEENUMERATION(),
                        this.getAttributeValueEnumeration(),
                        null,
                        "aTTRIBUTEVALUEENUMERATION",
                        null,
                        0,
                        -1,
                        SpecRelationValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecRelationValues_ATTRIBUTEVALUEFILEREFERENCE(),
                        this.getAttributeValueFileReference(),
                        null,
                        "aTTRIBUTEVALUEFILEREFERENCE",
                        null,
                        0,
                        -1,
                        SpecRelationValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecRelationValues_ATTRIBUTEVALUESIMPLE(),
                        this.getAttributeValueSimple(),
                        null,
                        "aTTRIBUTEVALUESIMPLE",
                        null,
                        0,
                        -1,
                        SpecRelationValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecRelationValues_ATTRIBUTEVALUEXMLDATA(),
                        this.getAttributeValueXmlData(),
                        null,
                        "aTTRIBUTEVALUEXMLDATA",
                        null,
                        0,
                        -1,
                        SpecRelationValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( specGroupValuesEClass,
                    SpecGroupValues.class,
                    "SpecGroupValues",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSpecGroupValues_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        SpecGroupValues.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecGroupValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENT(),
                        this.getAttributeValueEmbeddedDocument(),
                        null,
                        "aTTRIBUTEVALUEEMBEDDEDDOCUMENT",
                        null,
                        0,
                        -1,
                        SpecGroupValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecGroupValues_ATTRIBUTEVALUEEMBEDDEDFILE(),
                        this.getAttributeValueEmbeddedFile(),
                        null,
                        "aTTRIBUTEVALUEEMBEDDEDFILE",
                        null,
                        0,
                        -1,
                        SpecGroupValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecGroupValues_ATTRIBUTEVALUEENUMERATION(),
                        this.getAttributeValueEnumeration(),
                        null,
                        "aTTRIBUTEVALUEENUMERATION",
                        null,
                        0,
                        -1,
                        SpecGroupValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecGroupValues_ATTRIBUTEVALUEFILEREFERENCE(),
                        this.getAttributeValueFileReference(),
                        null,
                        "aTTRIBUTEVALUEFILEREFERENCE",
                        null,
                        0,
                        -1,
                        SpecGroupValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecGroupValues_ATTRIBUTEVALUESIMPLE(),
                        this.getAttributeValueSimple(),
                        null,
                        "aTTRIBUTEVALUESIMPLE",
                        null,
                        0,
                        -1,
                        SpecGroupValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecGroupValues_ATTRIBUTEVALUEXMLDATA(),
                        this.getAttributeValueXmlData(),
                        null,
                        "aTTRIBUTEVALUEXMLDATA",
                        null,
                        0,
                        -1,
                        SpecGroupValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( specHierarchyRootValuesEClass,
                    SpecHierarchyRootValues.class,
                    "SpecHierarchyRootValues",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSpecHierarchyRootValues_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        SpecHierarchyRootValues.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecHierarchyRootValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENT(),
                        this.getAttributeValueEmbeddedDocument(),
                        null,
                        "aTTRIBUTEVALUEEMBEDDEDDOCUMENT",
                        null,
                        0,
                        -1,
                        SpecHierarchyRootValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecHierarchyRootValues_ATTRIBUTEVALUEEMBEDDEDFILE(),
                        this.getAttributeValueEmbeddedFile(),
                        null,
                        "aTTRIBUTEVALUEEMBEDDEDFILE",
                        null,
                        0,
                        -1,
                        SpecHierarchyRootValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecHierarchyRootValues_ATTRIBUTEVALUEENUMERATION(),
                        this.getAttributeValueEnumeration(),
                        null,
                        "aTTRIBUTEVALUEENUMERATION",
                        null,
                        0,
                        -1,
                        SpecHierarchyRootValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecHierarchyRootValues_ATTRIBUTEVALUEFILEREFERENCE(),
                        this.getAttributeValueFileReference(),
                        null,
                        "aTTRIBUTEVALUEFILEREFERENCE",
                        null,
                        0,
                        -1,
                        SpecHierarchyRootValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecHierarchyRootValues_ATTRIBUTEVALUESIMPLE(),
                        this.getAttributeValueSimple(),
                        null,
                        "aTTRIBUTEVALUESIMPLE",
                        null,
                        0,
                        -1,
                        SpecHierarchyRootValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );
        initEReference( getSpecHierarchyRootValues_ATTRIBUTEVALUEXMLDATA(),
                        this.getAttributeValueXmlData(),
                        null,
                        "aTTRIBUTEVALUEXMLDATA",
                        null,
                        0,
                        -1,
                        SpecHierarchyRootValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( attributeValueEnumerationValuesEClass,
                    AttributeValueEnumerationValues.class,
                    "AttributeValueEnumerationValues",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAttributeValueEnumerationValues_Group(),
                        ecorePackage.getEFeatureMapEntry(),
                        "group",
                        null,
                        0,
                        -1,
                        AttributeValueEnumerationValues.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );
        initEAttribute( getAttributeValueEnumerationValues_ENUMVALUEREF(),
                        this.getREF(),
                        "eNUMVALUEREF",
                        null,
                        0,
                        -1,
                        AttributeValueEnumerationValues.class,
                        IS_TRANSIENT,
                        IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        !IS_UNIQUE,
                        IS_DERIVED,
                        IS_ORDERED );

        initEClass( xhtmlContentEClass,
                    XhtmlContent.class,
                    "XhtmlContent",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );

        initEClass( attributeValueEmbeddedDocumentXhtmlContentEClass,
                    AttributeValueEmbeddedDocumentXhtmlContent.class,
                    "AttributeValueEmbeddedDocumentXhtmlContent",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAttributeValueEmbeddedDocumentXhtmlContent_Any(),
                        ecorePackage.getEFeatureMapEntry(),
                        "any",
                        null,
                        0,
                        1,
                        AttributeValueEmbeddedDocumentXhtmlContent.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        !IS_UNSETTABLE,
                        !IS_ID,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        initEClass( xmlContentXmlContentEClass,
                    XmlContentXmlContent.class,
                    "XmlContentXmlContent",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );

        initEClass( attributeValueXmlDataXmlContentEClass,
                    AttributeValueXmlDataXmlContent.class,
                    "AttributeValueXmlDataXmlContent",
                    !IS_ABSTRACT,
                    !IS_INTERFACE,
                    IS_GENERATED_INSTANCE_CLASS );
        initEReference( getAttributeValueXmlDataXmlContent_XMLCONTENT(),
                        this.getXmlContentXmlContent(),
                        null,
                        "xMLCONTENT",
                        null,
                        0,
                        1,
                        AttributeValueXmlDataXmlContent.class,
                        !IS_TRANSIENT,
                        !IS_VOLATILE,
                        IS_CHANGEABLE,
                        IS_COMPOSITE,
                        !IS_RESOLVE_PROXIES,
                        !IS_UNSETTABLE,
                        IS_UNIQUE,
                        !IS_DERIVED,
                        IS_ORDERED );

        // Initialize enums and add enum literals
        initEEnum( accesspolicyaccessmodeenumEEnum,
                   era.foss.model.core.rif.ACCESSPOLICYACCESSMODEENUM.class,
                   "ACCESSPOLICYACCESSMODEENUM" );
        addEEnumLiteral( accesspolicyaccessmodeenumEEnum,
                         era.foss.model.core.rif.ACCESSPOLICYACCESSMODEENUM.EDIT_LITERAL );
        addEEnumLiteral( accesspolicyaccessmodeenumEEnum,
                         era.foss.model.core.rif.ACCESSPOLICYACCESSMODEENUM.DELETE_LITERAL );
        addEEnumLiteral( accesspolicyaccessmodeenumEEnum,
                         era.foss.model.core.rif.ACCESSPOLICYACCESSMODEENUM.CREATE_LITERAL );

        initEEnum( booleanEEnum, era.foss.model.core.rif.BOOLEAN.class, "BOOLEAN" );
        addEEnumLiteral( booleanEEnum, era.foss.model.core.rif.BOOLEAN.TRUE_LITERAL );
        addEEnumLiteral( booleanEEnum, era.foss.model.core.rif.BOOLEAN.FALSE_LITERAL );

        initEEnum( datatypedefinitiondocumentformatenumEEnum,
                   era.foss.model.core.rif.DATATYPEDEFINITIONDOCUMENTFORMATENUM.class,
                   "DATATYPEDEFINITIONDOCUMENTFORMATENUM" );
        addEEnumLiteral( datatypedefinitiondocumentformatenumEEnum,
                         era.foss.model.core.rif.DATATYPEDEFINITIONDOCUMENTFORMATENUM.XHTML_LITERAL );
        addEEnumLiteral( datatypedefinitiondocumentformatenumEEnum,
                         era.foss.model.core.rif.DATATYPEDEFINITIONDOCUMENTFORMATENUM.RTF_LITERAL );

        // Initialize data types
        initEDataType( accesspolicyaccessmodeenumObjectEDataType,
                       era.foss.model.core.rif.ACCESSPOLICYACCESSMODEENUM.class,
                       "ACCESSPOLICYACCESSMODEENUMObject",
                       IS_SERIALIZABLE,
                       IS_GENERATED_INSTANCE_CLASS );
        initEDataType( booleanObjectEDataType,
                       era.foss.model.core.rif.BOOLEAN.class,
                       "BOOLEANObject",
                       IS_SERIALIZABLE,
                       IS_GENERATED_INSTANCE_CLASS );
        initEDataType( datatypedefinitiondocumentformatenumObjectEDataType,
                       era.foss.model.core.rif.DATATYPEDEFINITIONDOCUMENTFORMATENUM.class,
                       "DATATYPEDEFINITIONDOCUMENTFORMATENUMObject",
                       IS_SERIALIZABLE,
                       IS_GENERATED_INSTANCE_CLASS );
        initEDataType( floatEDataType, float.class, "FLOAT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( floatObjectEDataType,
                       Float.class,
                       "FLOATObject",
                       IS_SERIALIZABLE,
                       !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( integerEDataType, BigInteger.class, "INTEGER", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( refEDataType, String.class, "REF", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( stringEDataType, String.class, "STRING", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS );

        // Create resource
        createResource( eNS_URI );

        // Create annotations
        // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
        createExtendedMetaDataAnnotations();
    }

    /**
     * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createExtendedMetaDataAnnotations() {
        String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
        addAnnotation( accessPoliciesEClass, source, new String[]{
            "name",
            "ACCESS-POLICIES_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAccessPolicies_Group(), source, new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getAccessPolicies_ACCESSPOLICY(), source, new String[]{
            "kind",
            "element",
            "name",
            "ACCESS-POLICY",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( accesspolicyaccessmodeenumEEnum,
                       source,
                       new String[]{"name", "ACCESS-POLICY-ACCESS-MODE-ENUM"} );
        addAnnotation( accesspolicyaccessmodeenumObjectEDataType, source, new String[]{
            "name",
            "ACCESS-POLICY-ACCESS-MODE-ENUM:Object",
            "baseType",
            "ACCESS-POLICY-ACCESS-MODE-ENUM"} );
        addAnnotation( accessPolicyEClass,
                       source,
                       new String[]{"name", "ACCESS-POLICY_._type", "kind", "elementOnly"} );
        addAnnotation( getAccessPolicy_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAccessPolicy_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAccessPolicy_ACCESSMODE(), source, new String[]{
            "kind",
            "element",
            "name",
            "ACCESS-MODE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAccessPolicy_ATTRIBUTEDEFINITIONS(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-DEFINITIONS",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAccessPolicy_ATTRIBUTEVALUES(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUES",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAccessPolicy_DATATYPEDEFINITIONS(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITIONS",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAccessPolicy_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAccessPolicy_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAccessPolicy_RELATIONGROUPS(), source, new String[]{
            "kind",
            "element",
            "name",
            "RELATION-GROUPS",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAccessPolicy_SPECGROUPS(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-GROUPS",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAccessPolicy_SPECHIERARCHIES(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-HIERARCHIES",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAccessPolicy_SPECHIERARCHYROOTS(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-HIERARCHY-ROOTS",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAccessPolicy_SPECOBJECTS(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-OBJECTS",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAccessPolicy_SPECRELATIONS(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-RELATIONS",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAccessPolicy_SPECTYPES(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-TYPES",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( attributeDefinitionComplexEClass, source, new String[]{
            "name",
            "ATTRIBUTE-DEFINITION-COMPLEX_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeDefinitionComplex_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeDefinitionComplex_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeDefinitionComplex_DEFAULTVALUE(), source, new String[]{
            "kind",
            "element",
            "name",
            "DEFAULT-VALUE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeDefinitionComplex_DEFAULTVALUE2(), source, new String[]{
            "kind",
            "element",
            "name",
            "DEFAULT-VALUE2",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeDefinitionComplex_DEFAULTVALUE3(), source, new String[]{
            "kind",
            "element",
            "name",
            "DEFAULT-VALUE3",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeDefinitionComplex_DEFAULTVALUE4(), source, new String[]{
            "kind",
            "element",
            "name",
            "DEFAULT-VALUE4",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeDefinitionComplex_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeDefinitionComplex_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeDefinitionComplex_TYPE(), source, new String[]{
            "kind",
            "element",
            "name",
            "TYPE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( attributeDefinitionEnumerationEClass, source, new String[]{
            "name",
            "ATTRIBUTE-DEFINITION-ENUMERATION_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeDefinitionEnumeration_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeDefinitionEnumeration_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeDefinitionEnumeration_DEFAULTVALUE(), source, new String[]{
            "kind",
            "element",
            "name",
            "DEFAULT-VALUE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeDefinitionEnumeration_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeDefinitionEnumeration_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeDefinitionEnumeration_MULTIVALUED(), source, new String[]{
            "kind",
            "element",
            "name",
            "MULTI-VALUED",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeDefinitionEnumeration_TYPE(), source, new String[]{
            "kind",
            "element",
            "name",
            "TYPE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( attributeDefinitionSimpleEClass, source, new String[]{
            "name",
            "ATTRIBUTE-DEFINITION-SIMPLE_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeDefinitionSimple_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeDefinitionSimple_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeDefinitionSimple_DEFAULTVALUE(), source, new String[]{
            "kind",
            "element",
            "name",
            "DEFAULT-VALUE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeDefinitionSimple_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeDefinitionSimple_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeDefinitionSimple_TYPE(), source, new String[]{
            "kind",
            "element",
            "name",
            "TYPE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( attributeDefinitionsEClass, source, new String[]{
            "name",
            "ATTRIBUTE-DEFINITIONS_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeDefinitions_Group(), source, new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getAttributeDefinitions_ATTRIBUTEDEFINITIONCOMPLEXREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-DEFINITION-COMPLEX-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getAttributeDefinitions_ATTRIBUTEDEFINITIONENUMERATIONREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-DEFINITION-ENUMERATION-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getAttributeDefinitions_ATTRIBUTEDEFINITIONSIMPLEREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-DEFINITION-SIMPLE-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( attributeValueEmbeddedDocumentEClass, source, new String[]{
            "name",
            "ATTRIBUTE-VALUE-EMBEDDED-DOCUMENT_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeValueEmbeddedDocument_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueEmbeddedDocument_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueEmbeddedDocument_DEFINITION(), source, new String[]{
            "kind",
            "element",
            "name",
            "DEFINITION",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueEmbeddedDocument_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueEmbeddedDocument_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueEmbeddedDocument_XHTMLCONTENT(), source, new String[]{
            "kind",
            "element",
            "name",
            "XHTML-CONTENT",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( attributeValueEmbeddedFileEClass, source, new String[]{
            "name",
            "ATTRIBUTE-VALUE-EMBEDDED-FILE_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeValueEmbeddedFile_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueEmbeddedFile_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueEmbeddedFile_BINARYCONTENT(), source, new String[]{
            "kind",
            "element",
            "name",
            "BINARY-CONTENT",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueEmbeddedFile_DEFINITION(), source, new String[]{
            "kind",
            "element",
            "name",
            "DEFINITION",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueEmbeddedFile_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueEmbeddedFile_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( attributeValueEnumerationEClass, source, new String[]{
            "name",
            "ATTRIBUTE-VALUE-ENUMERATION_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeValueEnumeration_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueEnumeration_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueEnumeration_DEFINITION(), source, new String[]{
            "kind",
            "element",
            "name",
            "DEFINITION",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueEnumeration_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueEnumeration_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueEnumeration_VALUES(), source, new String[]{
            "kind",
            "element",
            "name",
            "VALUES",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( attributeValueFileReferenceEClass, source, new String[]{
            "name",
            "ATTRIBUTE-VALUE-FILE-REFERENCE_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeValueFileReference_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueFileReference_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueFileReference_DEFINITION(), source, new String[]{
            "kind",
            "element",
            "name",
            "DEFINITION",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueFileReference_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueFileReference_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueFileReference_PATHTOFILE(), source, new String[]{
            "kind",
            "element",
            "name",
            "PATH-TO-FILE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( attributeValueSimpleEClass, source, new String[]{
            "name",
            "ATTRIBUTE-VALUE-SIMPLE_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeValueSimple_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueSimple_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueSimple_DEFINITION(), source, new String[]{
            "kind",
            "element",
            "name",
            "DEFINITION",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueSimple_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueSimple_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueSimple_THEVALUE(), source, new String[]{
            "kind",
            "element",
            "name",
            "THE-VALUE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( attributeValuesEClass, source, new String[]{
            "name",
            "ATTRIBUTE-VALUES_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeValues_Group(), source, new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getAttributeValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-EMBEDDED-DOCUMENT-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getAttributeValues_ATTRIBUTEVALUEEMBEDDEDFILEREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-EMBEDDED-FILE-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getAttributeValues_ATTRIBUTEVALUEENUMERATIONREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-ENUMERATION-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getAttributeValues_ATTRIBUTEVALUEFILEREFERENCEREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-FILE-REFERENCE-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getAttributeValues_ATTRIBUTEVALUESIMPLEREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-SIMPLE-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getAttributeValues_ATTRIBUTEVALUEXMLDATAREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-XML-DATA-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( attributeValueXmlDataEClass, source, new String[]{
            "name",
            "ATTRIBUTE-VALUE-XML-DATA_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeValueXmlData_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueXmlData_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueXmlData_DEFINITION(), source, new String[]{
            "kind",
            "element",
            "name",
            "DEFINITION",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueXmlData_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueXmlData_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeValueXmlData_XMLCONTENT(), source, new String[]{
            "kind",
            "element",
            "name",
            "XML-CONTENT",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( binaryContentEClass,
                       source,
                       new String[]{"name", "BINARY-CONTENT_._1_._type", "kind", "empty"} );
        addAnnotation( attributeValueEmbeddedFileBinaryContentEClass, source, new String[]{
            "name",
            "BINARY-CONTENT_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeValueEmbeddedFileBinaryContent_BINARYCONTENT(), source, new String[]{
            "kind",
            "element",
            "name",
            "BINARY-CONTENT",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( booleanEEnum, source, new String[]{"name", "BOOLEAN"} );
        addAnnotation( booleanObjectEDataType, source, new String[]{"name", "BOOLEAN:Object", "baseType", "BOOLEAN"} );
        addAnnotation( specHierarchyChildrenEClass, source, new String[]{
            "name",
            "CHILDREN_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getSpecHierarchyChildren_Group(), source, new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getSpecHierarchyChildren_SPECHIERARCHY(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-HIERARCHY",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( specHierarchyRootChildrenEClass, source, new String[]{
            "name",
            "CHILDREN_._1_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getSpecHierarchyRootChildren_Group(), source, new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getSpecHierarchyRootChildren_SPECHIERARCHY(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-HIERARCHY",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( datatypeDefinitionBinaryFileEClass, source, new String[]{
            "name",
            "DATATYPE-DEFINITION-BINARY-FILE_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getDatatypeDefinitionBinaryFile_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionBinaryFile_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionBinaryFile_APPLICATION(), source, new String[]{
            "kind",
            "element",
            "name",
            "APPLICATION",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionBinaryFile_EMBEDDED(), source, new String[]{
            "kind",
            "element",
            "name",
            "EMBEDDED",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionBinaryFile_FILENAMESUFFIX(), source, new String[]{
            "kind",
            "element",
            "name",
            "FILENAME-SUFFIX",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionBinaryFile_FORMATNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "FORMAT-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionBinaryFile_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionBinaryFile_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionBinaryFile_MIMETYPE(), source, new String[]{
            "kind",
            "element",
            "name",
            "MIME-TYPE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( datatypeDefinitionBooleanEClass, source, new String[]{
            "name",
            "DATATYPE-DEFINITION-BOOLEAN_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getDatatypeDefinitionBoolean_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionBoolean_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionBoolean_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionBoolean_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( datatypedefinitiondocumentformatenumEEnum, source, new String[]{
            "name",
            "DATATYPE-DEFINITION-DOCUMENT-FORMAT-ENUM"} );
        addAnnotation( datatypedefinitiondocumentformatenumObjectEDataType, source, new String[]{
            "name",
            "DATATYPE-DEFINITION-DOCUMENT-FORMAT-ENUM:Object",
            "baseType",
            "DATATYPE-DEFINITION-DOCUMENT-FORMAT-ENUM"} );
        addAnnotation( datatypeDefinitionDocumentEClass, source, new String[]{
            "name",
            "DATATYPE-DEFINITION-DOCUMENT_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getDatatypeDefinitionDocument_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionDocument_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionDocument_EMBEDDED(), source, new String[]{
            "kind",
            "element",
            "name",
            "EMBEDDED",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionDocument_FORMAT(), source, new String[]{
            "kind",
            "element",
            "name",
            "FORMAT",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionDocument_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionDocument_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( datatypeDefinitionEnumerationEClass, source, new String[]{
            "name",
            "DATATYPE-DEFINITION-ENUMERATION_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getDatatypeDefinitionEnumeration_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionEnumeration_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionEnumeration_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionEnumeration_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionEnumeration_SPECIFIEDVALUES(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPECIFIED-VALUES",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( datatypeDefinitionIntegerEClass, source, new String[]{
            "name",
            "DATATYPE-DEFINITION-INTEGER_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getDatatypeDefinitionInteger_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionInteger_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionInteger_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionInteger_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionInteger_MAX(), source, new String[]{
            "kind",
            "element",
            "name",
            "MAX",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionInteger_MIN(), source, new String[]{
            "kind",
            "element",
            "name",
            "MIN",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( datatypeDefinitionRealEClass, source, new String[]{
            "name",
            "DATATYPE-DEFINITION-REAL_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getDatatypeDefinitionReal_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionReal_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionReal_ACCURACY(), source, new String[]{
            "kind",
            "element",
            "name",
            "ACCURACY",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionReal_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionReal_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionReal_MAX(), source, new String[]{
            "kind",
            "element",
            "name",
            "MAX",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionReal_MIN(), source, new String[]{
            "kind",
            "element",
            "name",
            "MIN",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( datatypeDefinitionStringEClass, source, new String[]{
            "name",
            "DATATYPE-DEFINITION-STRING_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getDatatypeDefinitionString_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionString_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionString_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionString_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionString_MAXLENGTH(), source, new String[]{
            "kind",
            "element",
            "name",
            "MAX-LENGTH",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( datatypeDefinitionsEClass, source, new String[]{
            "name",
            "DATATYPE-DEFINITIONS_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getDatatypeDefinitions_Group(), source, new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getDatatypeDefinitions_DATATYPEDEFINITIONBINARYFILEREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-BINARY-FILE-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getDatatypeDefinitions_DATATYPEDEFINITIONBOOLEANREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-BOOLEAN-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getDatatypeDefinitions_DATATYPEDEFINITIONDOCUMENTREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-DOCUMENT-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getDatatypeDefinitions_DATATYPEDEFINITIONENUMERATIONREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-ENUMERATION-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getDatatypeDefinitions_DATATYPEDEFINITIONINTEGERREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-INTEGER-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getDatatypeDefinitions_DATATYPEDEFINITIONREALREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-REAL-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getDatatypeDefinitions_DATATYPEDEFINITIONSTRINGREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-STRING-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getDatatypeDefinitions_DATATYPEDEFINITIONXMLDATAREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-XML-DATA-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( datatypeDefinitionXmlDataEClass, source, new String[]{
            "name",
            "DATATYPE-DEFINITION-XML-DATA_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getDatatypeDefinitionXmlData_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionXmlData_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionXmlData_EMBEDDED(), source, new String[]{
            "kind",
            "element",
            "name",
            "EMBEDDED",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionXmlData_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionXmlData_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionXmlData_NAMESPACEURI(), source, new String[]{
            "kind",
            "element",
            "name",
            "NAME-SPACE-URI",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDatatypeDefinitionXmlData_SCHEMALOCATION(), source, new String[]{
            "kind",
            "element",
            "name",
            "SCHEMA-LOCATION",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( datatypesEClass, source, new String[]{"name", "DATATYPES_._type", "kind", "elementOnly"} );
        addAnnotation( getDatatypes_Group(), source, new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getDatatypes_DATATYPEDEFINITIONBINARYFILE(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-BINARY-FILE",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getDatatypes_DATATYPEDEFINITIONBOOLEAN(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-BOOLEAN",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getDatatypes_DATATYPEDEFINITIONDOCUMENT(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-DOCUMENT",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getDatatypes_DATATYPEDEFINITIONENUMERATION(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-ENUMERATION",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getDatatypes_DATATYPEDEFINITIONINTEGER(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-INTEGER",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getDatatypes_DATATYPEDEFINITIONREAL(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-REAL",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getDatatypes_DATATYPEDEFINITIONSTRING(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-STRING",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getDatatypes_DATATYPEDEFINITIONXMLDATA(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-XML-DATA",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( defaultValue2EClass, source, new String[]{
            "name",
            "DEFAULT-VALUE2_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getDefaultValue2_ATTRIBUTEVALUEEMBEDDEDFILE(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-EMBEDDED-FILE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( defaultValue3EClass, source, new String[]{
            "name",
            "DEFAULT-VALUE3_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getDefaultValue3_ATTRIBUTEVALUEEMBEDDEDDOCUMENT(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-EMBEDDED-DOCUMENT",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( defaultValue4EClass, source, new String[]{
            "name",
            "DEFAULT-VALUE4_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getDefaultValue4_ATTRIBUTEVALUEFILEREFERENCE(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-FILE-REFERENCE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( attributeDefinitionSimpleDefaultValueEClass, source, new String[]{
            "name",
            "DEFAULT-VALUE_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeDefinitionSimpleDefaultValue_ATTRIBUTEVALUESIMPLE(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-SIMPLE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( attributeDefinitionEnumerationDefaultValueEClass, source, new String[]{
            "name",
            "DEFAULT-VALUE_._1_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeDefinitionEnumerationDefaultValue_Group(), source, new String[]{
            "kind",
            "group",
            "name",
            "group:0"} );
        addAnnotation( getAttributeDefinitionEnumerationDefaultValue_ATTRIBUTEVALUEENUMERATION(),
                       source,
                       new String[]{
                           "kind",
                           "element",
                           "name",
                           "ATTRIBUTE-VALUE-ENUMERATION",
                           "namespace",
                           "##targetNamespace",
                           "group",
                           "#group:0"} );
        addAnnotation( attributeDefinitionComplexDefaultValueEClass, source, new String[]{
            "name",
            "DEFAULT-VALUE_._2_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeDefinitionComplexDefaultValue_ATTRIBUTEVALUEXMLDATA(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-XML-DATA",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( attributeValueEmbeddedDocumentDefinitionEClass, source, new String[]{
            "name",
            "DEFINITION_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeValueEmbeddedDocumentDefinition_ATTRIBUTEDEFINITIONCOMPLEXREF(),
                       source,
                       new String[]{
                           "kind",
                           "element",
                           "name",
                           "ATTRIBUTE-DEFINITION-COMPLEX-REF",
                           "namespace",
                           "##targetNamespace"} );
        addAnnotation( attributeValueFileReferenceDefinitionEClass, source, new String[]{
            "name",
            "DEFINITION_._1_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeValueFileReferenceDefinition_ATTRIBUTEDEFINITIONCOMPLEXREF(),
                       source,
                       new String[]{
                           "kind",
                           "element",
                           "name",
                           "ATTRIBUTE-DEFINITION-COMPLEX-REF",
                           "namespace",
                           "##targetNamespace"} );
        addAnnotation( attributeValueEmbeddedFileDefinitionEClass, source, new String[]{
            "name",
            "DEFINITION_._2_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeValueEmbeddedFileDefinition_ATTRIBUTEDEFINITIONCOMPLEXREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-DEFINITION-COMPLEX-REF",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( attributeValueSimpleDefinitionEClass, source, new String[]{
            "name",
            "DEFINITION_._3_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeValueSimpleDefinition_ATTRIBUTEDEFINITIONSIMPLEREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-DEFINITION-SIMPLE-REF",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( attributeValueEnumerationDefinitionEClass, source, new String[]{
            "name",
            "DEFINITION_._4_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeValueEnumerationDefinition_ATTRIBUTEDEFINITIONENUMERATIONREF(),
                       source,
                       new String[]{
                           "kind",
                           "element",
                           "name",
                           "ATTRIBUTE-DEFINITION-ENUMERATION-REF",
                           "namespace",
                           "##targetNamespace"} );
        addAnnotation( attributeValueXmlDataDefinitionEClass, source, new String[]{
            "name",
            "DEFINITION_._5_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeValueXmlDataDefinition_ATTRIBUTEDEFINITIONCOMPLEXREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-DEFINITION-COMPLEX-REF",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( documentRootEClass, source, new String[]{"name", "", "kind", "mixed"} );
        addAnnotation( getDocumentRoot_Mixed(), source, new String[]{"kind", "elementWildcard", "name", ":mixed"} );
        addAnnotation( getDocumentRoot_XMLNSPrefixMap(), source, new String[]{
            "kind",
            "attribute",
            "name",
            "xmlns:prefix"} );
        addAnnotation( getDocumentRoot_XSISchemaLocation(), source, new String[]{
            "kind",
            "attribute",
            "name",
            "xsi:schemaLocation"} );
        addAnnotation( getDocumentRoot_ACCESSPOLICY(), source, new String[]{
            "kind",
            "element",
            "name",
            "ACCESS-POLICY",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_ATTRIBUTEDEFINITIONCOMPLEX(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-DEFINITION-COMPLEX",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_ATTRIBUTEDEFINITIONENUMERATION(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-DEFINITION-ENUMERATION",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_ATTRIBUTEDEFINITIONSIMPLE(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-DEFINITION-SIMPLE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_ATTRIBUTEVALUEEMBEDDEDDOCUMENT(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-EMBEDDED-DOCUMENT",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_ATTRIBUTEVALUEEMBEDDEDFILE(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-EMBEDDED-FILE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_ATTRIBUTEVALUEENUMERATION(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-ENUMERATION",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_ATTRIBUTEVALUEFILEREFERENCE(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-FILE-REFERENCE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_ATTRIBUTEVALUESIMPLE(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-SIMPLE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_ATTRIBUTEVALUEXMLDATA(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-XML-DATA",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_BINARYCONTENT(), source, new String[]{
            "kind",
            "element",
            "name",
            "BINARY-CONTENT",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_DATATYPEDEFINITIONBINARYFILE(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-BINARY-FILE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_DATATYPEDEFINITIONBOOLEAN(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-BOOLEAN",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_DATATYPEDEFINITIONDOCUMENT(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-DOCUMENT",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_DATATYPEDEFINITIONENUMERATION(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-ENUMERATION",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_DATATYPEDEFINITIONINTEGER(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-INTEGER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_DATATYPEDEFINITIONREAL(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-REAL",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_DATATYPEDEFINITIONSTRING(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-STRING",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_DATATYPEDEFINITIONXMLDATA(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-XML-DATA",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_EMBEDDEDVALUE(), source, new String[]{
            "kind",
            "element",
            "name",
            "EMBEDDED-VALUE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_ENUMVALUE(), source, new String[]{
            "kind",
            "element",
            "name",
            "ENUM-VALUE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_RELATIONGROUP(), source, new String[]{
            "kind",
            "element",
            "name",
            "RELATION-GROUP",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_RIF(), source, new String[]{
            "kind",
            "element",
            "name",
            "RIF",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_SPECGROUP(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-GROUP",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_SPECHIERARCHY(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-HIERARCHY",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_SPECHIERARCHYROOT(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-HIERARCHY-ROOT",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_SPECOBJECT(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-OBJECT",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_SPECRELATION(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-RELATION",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_SPECTYPE(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-TYPE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_XHTMLCONTENT(), source, new String[]{
            "kind",
            "element",
            "name",
            "XHTML-CONTENT",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_XMLCONTENT(), source, new String[]{
            "kind",
            "element",
            "name",
            "XML-CONTENT",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getDocumentRoot_ID(), source, new String[]{
            "kind",
            "attribute",
            "name",
            "ID",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( embeddedValueEClass, source, new String[]{
            "name",
            "EMBEDDED-VALUE_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getEmbeddedValue_KEY(), source, new String[]{
            "kind",
            "element",
            "name",
            "KEY",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getEmbeddedValue_OTHERCONTENT(), source, new String[]{
            "kind",
            "element",
            "name",
            "OTHER-CONTENT",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( enumValueEClass, source, new String[]{"name", "ENUM-VALUE_._type", "kind", "elementOnly"} );
        addAnnotation( getEnumValue_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getEnumValue_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getEnumValue_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getEnumValue_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getEnumValue_PROPERTIES(), source, new String[]{
            "kind",
            "element",
            "name",
            "PROPERTIES",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( floatEDataType, source, new String[]{
            "name",
            "FLOAT",
            "baseType",
            "http://www.eclipse.org/emf/2003/XMLType#float"} );
        addAnnotation( floatObjectEDataType, source, new String[]{"name", "FLOAT:Object", "baseType", "FLOAT"} );
        addAnnotation( integerEDataType, source, new String[]{
            "name",
            "INTEGER",
            "baseType",
            "http://www.eclipse.org/emf/2003/XMLType#integer"} );
        addAnnotation( objectEClass, source, new String[]{"name", "OBJECT_._type", "kind", "elementOnly"} );
        addAnnotation( getObject_SPECOBJECTREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-OBJECT-REF",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( propertiesEClass, source, new String[]{"name", "PROPERTIES_._type", "kind", "elementOnly"} );
        addAnnotation( getProperties_EMBEDDEDVALUE(), source, new String[]{
            "kind",
            "element",
            "name",
            "EMBEDDED-VALUE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( refEDataType, source, new String[]{
            "name",
            "REF",
            "baseType",
            "http://www.eclipse.org/emf/2003/XMLType#string"} );
        addAnnotation( specGroupRelationGroupsEClass, source, new String[]{
            "name",
            "RELATION-GROUPS_._1_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getSpecGroupRelationGroups_Group(), source, new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getSpecGroupRelationGroups_RELATIONGROUP(), source, new String[]{
            "kind",
            "element",
            "name",
            "RELATION-GROUP",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( accessPolicyRelationGroupsEClass, source, new String[]{
            "name",
            "RELATION-GROUPS_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAccessPolicyRelationGroups_Group(),
                       source,
                       new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getAccessPolicyRelationGroups_RELATIONGROUPREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "RELATION-GROUP-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( relationGroupEClass, source, new String[]{
            "name",
            "RELATION-GROUP_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getRelationGroup_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getRelationGroup_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getRelationGroup_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getRelationGroup_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getRelationGroup_RELATIONTYPE(), source, new String[]{
            "kind",
            "element",
            "name",
            "RELATION-TYPE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getRelationGroup_SPECRELATIONS(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-RELATIONS",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getRelationGroup_TARGETGROUP(), source, new String[]{
            "kind",
            "element",
            "name",
            "TARGET-GROUP",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( relationTypeEClass,
                       source,
                       new String[]{"name", "RELATION-TYPE_._type", "kind", "elementOnly"} );
        addAnnotation( getRelationType_SPECTYPEREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-TYPE-REF",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( rifEClass, source, new String[]{"name", "RIF_._type", "kind", "elementOnly"} );
        addAnnotation( getRif_SPECHIERARCHYROOTS(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-HIERARCHY-ROOTS",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getRif_ACCESSPOLICIES(), source, new String[]{
            "kind",
            "element",
            "name",
            "ACCESS-POLICIES",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getRif_AUTHOR(), source, new String[]{
            "kind",
            "element",
            "name",
            "AUTHOR",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getRif_COMMENT(), source, new String[]{
            "kind",
            "element",
            "name",
            "COMMENT",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getRif_COUNTRYCODE(), source, new String[]{
            "kind",
            "element",
            "name",
            "COUNTRY-CODE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getRif_CREATIONTIME(), source, new String[]{
            "kind",
            "element",
            "name",
            "CREATION-TIME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getRif_DATATYPES(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPES",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getRif_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getRif_SOURCETOOLID(), source, new String[]{
            "kind",
            "element",
            "name",
            "SOURCE-TOOL-ID",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getRif_SPECGROUPS(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-GROUPS",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getRif_SPECOBJECTS(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-OBJECTS",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getRif_SPECRELATIONS(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-RELATIONS",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getRif_SPECTYPES(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-TYPES",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getRif_TITLE(), source, new String[]{
            "kind",
            "element",
            "name",
            "TITLE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getRif_VERSION(), source, new String[]{
            "kind",
            "element",
            "name",
            "VERSION",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( sourceEClass, source, new String[]{"name", "SOURCE_._type", "kind", "elementOnly"} );
        addAnnotation( getSource_SPECOBJECTREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-OBJECT-REF",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( specAttributesEClass, source, new String[]{
            "name",
            "SPEC-ATTRIBUTES_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getSpecAttributes_Group(), source, new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getSpecAttributes_ATTRIBUTEDEFINITIONCOMPLEX(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-DEFINITION-COMPLEX",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getSpecAttributes_ATTRIBUTEDEFINITIONENUMERATION(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-DEFINITION-ENUMERATION",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getSpecAttributes_ATTRIBUTEDEFINITIONSIMPLE(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-DEFINITION-SIMPLE",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( rifSpecGroupsEClass, source, new String[]{
            "name",
            "SPEC-GROUPS_._1_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getRifSpecGroups_Group(), source, new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getRifSpecGroups_SPECGROUP(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-GROUP",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( accessPolicySpecGroupsEClass, source, new String[]{
            "name",
            "SPEC-GROUPS_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAccessPolicySpecGroups_Group(), source, new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getAccessPolicySpecGroups_SPECGROUPREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-GROUP-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( specGroupEClass, source, new String[]{"name", "SPEC-GROUP_._type", "kind", "elementOnly"} );
        addAnnotation( getSpecGroup_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecGroup_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecGroup_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecGroup_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecGroup_RELATIONGROUPS(), source, new String[]{
            "kind",
            "element",
            "name",
            "RELATION-GROUPS",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecGroup_SPECOBJECTS(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-OBJECTS",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecGroup_TYPE(), source, new String[]{
            "kind",
            "element",
            "name",
            "TYPE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecGroup_VALUES(), source, new String[]{
            "kind",
            "element",
            "name",
            "VALUES",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( specHierarchiesEClass, source, new String[]{
            "name",
            "SPEC-HIERARCHIES_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getSpecHierarchies_Group(), source, new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getSpecHierarchies_SPECHIERARCHYREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-HIERARCHY-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( rifSpecHierarchyRootsEClass, source, new String[]{
            "name",
            "SPEC-HIERARCHY-ROOTS_._1_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getRifSpecHierarchyRoots_Group(), source, new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getRifSpecHierarchyRoots_SPECHIERARCHYROOT(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-HIERARCHY-ROOT",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( accessPolicySpecHierarchyRootsEClass, source, new String[]{
            "name",
            "SPEC-HIERARCHY-ROOTS_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAccessPolicySpecHierarchyRoots_Group(), source, new String[]{
            "kind",
            "group",
            "name",
            "group:0"} );
        addAnnotation( getAccessPolicySpecHierarchyRoots_SPECHIERARCHYROOTREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-HIERARCHY-ROOT-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( specHierarchyRootEClass, source, new String[]{
            "name",
            "SPEC-HIERARCHY-ROOT_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getSpecHierarchyRoot_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecHierarchyRoot_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecHierarchyRoot_CHILDREN(), source, new String[]{
            "kind",
            "element",
            "name",
            "CHILDREN",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecHierarchyRoot_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecHierarchyRoot_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecHierarchyRoot_TYPE(), source, new String[]{
            "kind",
            "element",
            "name",
            "TYPE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecHierarchyRoot_VALUES(), source, new String[]{
            "kind",
            "element",
            "name",
            "VALUES",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( specHierarchyEClass, source, new String[]{
            "name",
            "SPEC-HIERARCHY_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getSpecHierarchy_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecHierarchy_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecHierarchy_CHILDREN(), source, new String[]{
            "kind",
            "element",
            "name",
            "CHILDREN",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecHierarchy_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecHierarchy_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecHierarchy_OBJECT(), source, new String[]{
            "kind",
            "element",
            "name",
            "OBJECT",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( specifiedValuesEClass, source, new String[]{
            "name",
            "SPECIFIED-VALUES_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getSpecifiedValues_Group(), source, new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getSpecifiedValues_ENUMVALUE(), source, new String[]{
            "kind",
            "element",
            "name",
            "ENUM-VALUE",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( specGroupSpecObjectsEClass, source, new String[]{
            "name",
            "SPEC-OBJECTS_._1_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getSpecGroupSpecObjects_Group(), source, new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getSpecGroupSpecObjects_SPECOBJECTREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-OBJECT-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( rifSpecObjectsEClass, source, new String[]{
            "name",
            "SPEC-OBJECTS_._2_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getRifSpecObjects_Group(), source, new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getRifSpecObjects_SPECOBJECT(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-OBJECT",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( accessPolicySpecObjectsEClass, source, new String[]{
            "name",
            "SPEC-OBJECTS_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAccessPolicySpecObjects_Group(), source, new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getAccessPolicySpecObjects_SPECOBJECTREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-OBJECT-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( specObjectEClass, source, new String[]{"name", "SPEC-OBJECT_._type", "kind", "elementOnly"} );
        addAnnotation( getSpecObject_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecObject_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecObject_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecObject_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecObject_TYPE(), source, new String[]{
            "kind",
            "element",
            "name",
            "TYPE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecObject_VALUES(), source, new String[]{
            "kind",
            "element",
            "name",
            "VALUES",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( rifSpecRelationsEClass, source, new String[]{
            "name",
            "SPEC-RELATIONS_._1_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getRifSpecRelations_Group(), source, new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getRifSpecRelations_SPECRELATION(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-RELATION",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( relationGroupSpecRelationsEClass, source, new String[]{
            "name",
            "SPEC-RELATIONS_._2_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getRelationGroupSpecRelations_Group(),
                       source,
                       new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getRelationGroupSpecRelations_SPECRELATIONREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-RELATION-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( accessPolicySpecRelationsEClass, source, new String[]{
            "name",
            "SPEC-RELATIONS_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAccessPolicySpecRelations_Group(), source, new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getAccessPolicySpecRelations_SPECRELATIONREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-RELATION-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( specRelationEClass,
                       source,
                       new String[]{"name", "SPEC-RELATION_._type", "kind", "elementOnly"} );
        addAnnotation( getSpecRelation_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecRelation_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecRelation_SOURCE(), source, new String[]{
            "kind",
            "element",
            "name",
            "SOURCE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecRelation_TARGET(), source, new String[]{
            "kind",
            "element",
            "name",
            "TARGET",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecRelation_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecRelation_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecRelation_TYPE(), source, new String[]{
            "kind",
            "element",
            "name",
            "TYPE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecRelation_VALUES(), source, new String[]{
            "kind",
            "element",
            "name",
            "VALUES",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( rifSpecTypesEClass, source, new String[]{
            "name",
            "SPEC-TYPES_._1_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getRifSpecTypes_Group(), source, new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getRifSpecTypes_SPECTYPE(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-TYPE",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( accessPolicySpecTypesEClass, source, new String[]{
            "name",
            "SPEC-TYPES_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAccessPolicySpecTypes_Group(), source, new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getAccessPolicySpecTypes_SPECTYPEREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-TYPE-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( specTypeEClass, source, new String[]{"name", "SPEC-TYPE_._type", "kind", "elementOnly"} );
        addAnnotation( getSpecType_LONGNAME(), source, new String[]{
            "kind",
            "element",
            "name",
            "LONG-NAME",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecType_DESC(), source, new String[]{
            "kind",
            "element",
            "name",
            "DESC",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecType_IDENTIFIER(), source, new String[]{
            "kind",
            "element",
            "name",
            "IDENTIFIER",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecType_LASTCHANGE(), source, new String[]{
            "kind",
            "element",
            "name",
            "LAST-CHANGE",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecType_SPECATTRIBUTES(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-ATTRIBUTES",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getSpecType_ID(), source, new String[]{
            "kind",
            "attribute",
            "name",
            "ID",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( stringEDataType, source, new String[]{
            "name",
            "STRING",
            "baseType",
            "http://www.eclipse.org/emf/2003/XMLType#string"} );
        addAnnotation( targetGroupEClass, source, new String[]{"name", "TARGET-GROUP_._type", "kind", "elementOnly"} );
        addAnnotation( getTargetGroup_SPECGROUPREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-GROUP-REF",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( targetEClass, source, new String[]{"name", "TARGET_._type", "kind", "elementOnly"} );
        addAnnotation( getTarget_SPECOBJECTREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-OBJECT-REF",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( attributeDefinitionSimpleTypeEClass, source, new String[]{
            "name",
            "TYPE_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeDefinitionSimpleType_DATATYPEDEFINITIONBOOLEANREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-BOOLEAN-REF",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeDefinitionSimpleType_DATATYPEDEFINITIONINTEGERREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-INTEGER-REF",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeDefinitionSimpleType_DATATYPEDEFINITIONREALREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-REAL-REF",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeDefinitionSimpleType_DATATYPEDEFINITIONSTRINGREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-STRING-REF",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( specRelationTypeEClass, source, new String[]{"name", "TYPE_._1_._type", "kind", "elementOnly"} );
        addAnnotation( getSpecRelationType_SPECTYPEREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-TYPE-REF",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( attributeDefinitionEnumerationTypeEClass, source, new String[]{
            "name",
            "TYPE_._2_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeDefinitionEnumerationType_DATATYPEDEFINITIONENUMERATIONREF(),
                       source,
                       new String[]{
                           "kind",
                           "element",
                           "name",
                           "DATATYPE-DEFINITION-ENUMERATION-REF",
                           "namespace",
                           "##targetNamespace"} );
        addAnnotation( specObjectTypeEClass, source, new String[]{"name", "TYPE_._3_._type", "kind", "elementOnly"} );
        addAnnotation( getSpecObjectType_SPECTYPEREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-TYPE-REF",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( specHierarchyRootTypeEClass, source, new String[]{
            "name",
            "TYPE_._4_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getSpecHierarchyRootType_SPECTYPEREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-TYPE-REF",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( specGroupTypeEClass, source, new String[]{"name", "TYPE_._5_._type", "kind", "elementOnly"} );
        addAnnotation( getSpecGroupType_SPECTYPEREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "SPEC-TYPE-REF",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( attributeDefinitionComplexTypeEClass, source, new String[]{
            "name",
            "TYPE_._6_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeDefinitionComplexType_DATATYPEDEFINITIONBINARYFILEREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-BINARY-FILE-REF",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeDefinitionComplexType_DATATYPEDEFINITIONDOCUMENTREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-DOCUMENT-REF",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( getAttributeDefinitionComplexType_DATATYPEDEFINITIONXMLDATAREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "DATATYPE-DEFINITION-XML-DATA-REF",
            "namespace",
            "##targetNamespace"} );
        addAnnotation( specObjectValuesEClass, source, new String[]{"name", "VALUES_._type", "kind", "elementOnly"} );
        addAnnotation( getSpecObjectValues_Group(), source, new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getSpecObjectValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENT(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-EMBEDDED-DOCUMENT",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getSpecObjectValues_ATTRIBUTEVALUEEMBEDDEDFILE(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-EMBEDDED-FILE",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getSpecObjectValues_ATTRIBUTEVALUEENUMERATION(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-ENUMERATION",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getSpecObjectValues_ATTRIBUTEVALUEFILEREFERENCE(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-FILE-REFERENCE",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getSpecObjectValues_ATTRIBUTEVALUESIMPLE(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-SIMPLE",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getSpecObjectValues_ATTRIBUTEVALUEXMLDATA(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-XML-DATA",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( specRelationValuesEClass, source, new String[]{
            "name",
            "VALUES_._1_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getSpecRelationValues_Group(), source, new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getSpecRelationValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENT(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-EMBEDDED-DOCUMENT",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getSpecRelationValues_ATTRIBUTEVALUEEMBEDDEDFILE(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-EMBEDDED-FILE",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getSpecRelationValues_ATTRIBUTEVALUEENUMERATION(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-ENUMERATION",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getSpecRelationValues_ATTRIBUTEVALUEFILEREFERENCE(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-FILE-REFERENCE",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getSpecRelationValues_ATTRIBUTEVALUESIMPLE(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-SIMPLE",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getSpecRelationValues_ATTRIBUTEVALUEXMLDATA(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-XML-DATA",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( specGroupValuesEClass,
                       source,
                       new String[]{"name", "VALUES_._2_._type", "kind", "elementOnly"} );
        addAnnotation( getSpecGroupValues_Group(), source, new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getSpecGroupValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENT(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-EMBEDDED-DOCUMENT",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getSpecGroupValues_ATTRIBUTEVALUEEMBEDDEDFILE(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-EMBEDDED-FILE",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getSpecGroupValues_ATTRIBUTEVALUEENUMERATION(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-ENUMERATION",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getSpecGroupValues_ATTRIBUTEVALUEFILEREFERENCE(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-FILE-REFERENCE",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getSpecGroupValues_ATTRIBUTEVALUESIMPLE(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-SIMPLE",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getSpecGroupValues_ATTRIBUTEVALUEXMLDATA(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-XML-DATA",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( specHierarchyRootValuesEClass, source, new String[]{
            "name",
            "VALUES_._3_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getSpecHierarchyRootValues_Group(), source, new String[]{"kind", "group", "name", "group:0"} );
        addAnnotation( getSpecHierarchyRootValues_ATTRIBUTEVALUEEMBEDDEDDOCUMENT(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-EMBEDDED-DOCUMENT",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getSpecHierarchyRootValues_ATTRIBUTEVALUEEMBEDDEDFILE(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-EMBEDDED-FILE",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getSpecHierarchyRootValues_ATTRIBUTEVALUEENUMERATION(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-ENUMERATION",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getSpecHierarchyRootValues_ATTRIBUTEVALUEFILEREFERENCE(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-FILE-REFERENCE",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getSpecHierarchyRootValues_ATTRIBUTEVALUESIMPLE(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-SIMPLE",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( getSpecHierarchyRootValues_ATTRIBUTEVALUEXMLDATA(), source, new String[]{
            "kind",
            "element",
            "name",
            "ATTRIBUTE-VALUE-XML-DATA",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( attributeValueEnumerationValuesEClass, source, new String[]{
            "name",
            "VALUES_._4_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeValueEnumerationValues_Group(), source, new String[]{
            "kind",
            "group",
            "name",
            "group:0"} );
        addAnnotation( getAttributeValueEnumerationValues_ENUMVALUEREF(), source, new String[]{
            "kind",
            "element",
            "name",
            "ENUM-VALUE-REF",
            "namespace",
            "##targetNamespace",
            "group",
            "#group:0"} );
        addAnnotation( xhtmlContentEClass, source, new String[]{"name", "XHTML-CONTENT_._type", "kind", "empty"} );
        addAnnotation( attributeValueEmbeddedDocumentXhtmlContentEClass, source, new String[]{
            "name",
            "XHTML-CONTENT_._1_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeValueEmbeddedDocumentXhtmlContent_Any(), source, new String[]{
            "kind",
            "elementWildcard",
            "wildcards",
            "http://automotive-his.de/schema/rif-xhtml",
            "name",
            ":0",
            "processing",
            "strict"} );
        addAnnotation( xmlContentXmlContentEClass,
                       source,
                       new String[]{"name", "XML-CONTENT_._type", "kind", "empty"} );
        addAnnotation( attributeValueXmlDataXmlContentEClass, source, new String[]{
            "name",
            "XML-CONTENT_._1_._type",
            "kind",
            "elementOnly"} );
        addAnnotation( getAttributeValueXmlDataXmlContent_XMLCONTENT(), source, new String[]{
            "kind",
            "element",
            "name",
            "XML-CONTENT",
            "namespace",
            "##targetNamespace"} );
    }

} //RifPackageImpl
