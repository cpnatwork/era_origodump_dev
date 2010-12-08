/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.erf.impl;

import era.foss.erf.AttributeDefinition;
import era.foss.erf.AttributeDefinitionSimple;
import era.foss.erf.AttributeValue;
import era.foss.erf.AttributeValueSimple;
import era.foss.erf.DatatypeDefinition;
import era.foss.erf.DatatypeDefinitionInteger;
import era.foss.erf.DatatypeDefinitionSimple;
import era.foss.erf.DatatypeDefinitionString;
import era.foss.erf.Identifiable;
import era.foss.erf.RIFContent;
import era.foss.erf.ErfFactory;
import era.foss.erf.ErfPackage;
import era.foss.erf.SpecElementWithUserDefinedAttributes;
import era.foss.erf.SpecObject;
import era.foss.erf.SpecType;
import era.foss.erf.util.ErfValidator;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ErfPackageImpl extends EPackageImpl implements ErfPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specElementWithUserDefinedAttributesEClass = null;

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
	private EClass specTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapEClass = null;

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
	private EClass datatypeDefinitionIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeDefinitionSimpleEClass = null;

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
	private EClass rifContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

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
	private EClass erfEClass = null;

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
	 * @see era.foss.erf.ErfPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ErfPackageImpl() {
		super(eNS_URI, ErfFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ErfPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ErfPackage init() {
		if (isInited)
			return (ErfPackage) EPackage.Registry.INSTANCE
					.getEPackage(ErfPackage.eNS_URI);

		// Obtain or create and register package
		ErfPackageImpl theErfPackage = (ErfPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ErfPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI)
				: new ErfPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theErfPackage.createPackageContents();

		// Initialize created meta-data
		theErfPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theErfPackage,
				new EValidator.Descriptor() {
					public EValidator getEValidator() {
						return ErfValidator.INSTANCE;
					}
				});

		// Mark meta-data to indicate it can't be changed
		theErfPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ErfPackage.eNS_URI, theErfPackage);
		return theErfPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDefinition() {
		return attributeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDefinition_Type() {
		return (EReference) attributeDefinitionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValue() {
		return attributeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeDefinition() {
		return datatypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecElementWithUserDefinedAttributes() {
		return specElementWithUserDefinedAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecElementWithUserDefinedAttributes_Values() {
		return (EReference) specElementWithUserDefinedAttributesEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecElementWithUserDefinedAttributes_Type() {
		return (EReference) specElementWithUserDefinedAttributesEClass
				.getEStructuralFeatures().get(1);
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
	public EClass getSpecType() {
		return specTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecType_SpecAttributes() {
		return (EReference) specTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMap() {
		return mapEClass;
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
	public EAttribute getAttributeValueSimple_TheValue() {
		return (EAttribute) attributeValueSimpleEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueSimple_Definition() {
		return (EReference) attributeValueSimpleEClass.getEStructuralFeatures()
				.get(1);
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
	public EAttribute getDatatypeDefinitionInteger_Max() {
		return (EAttribute) datatypeDefinitionIntegerEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeDefinitionInteger_Min() {
		return (EAttribute) datatypeDefinitionIntegerEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeDefinitionSimple() {
		return datatypeDefinitionSimpleEClass;
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
	public EAttribute getDatatypeDefinitionString_MaxLength() {
		return (EAttribute) datatypeDefinitionStringEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRIFContent() {
		return rifContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIFContent_SpecObjects() {
		return (EReference) rifContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIFContent_SpecTypes() {
		return (EReference) rifContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIFContent_DataTypes() {
		return (EReference) rifContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_ID() {
		return (EAttribute) identifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_Desc() {
		return (EAttribute) identifiableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_LongName() {
		return (EAttribute) identifiableEClass.getEStructuralFeatures().get(2);
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
	public EReference getAttributeDefinitionSimple_DefaultValue() {
		return (EReference) attributeDefinitionSimpleEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERF() {
		return erfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERF_CoreContent() {
		return (EReference) erfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErfFactory getErfFactory() {
		return (ErfFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		attributeDefinitionEClass = createEClass(ATTRIBUTE_DEFINITION);
		createEReference(attributeDefinitionEClass, ATTRIBUTE_DEFINITION__TYPE);

		attributeValueEClass = createEClass(ATTRIBUTE_VALUE);

		datatypeDefinitionEClass = createEClass(DATATYPE_DEFINITION);

		specElementWithUserDefinedAttributesEClass = createEClass(SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES);
		createEReference(specElementWithUserDefinedAttributesEClass,
				SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__VALUES);
		createEReference(specElementWithUserDefinedAttributesEClass,
				SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__TYPE);

		specObjectEClass = createEClass(SPEC_OBJECT);

		specTypeEClass = createEClass(SPEC_TYPE);
		createEReference(specTypeEClass, SPEC_TYPE__SPEC_ATTRIBUTES);

		mapEClass = createEClass(MAP);

		attributeValueSimpleEClass = createEClass(ATTRIBUTE_VALUE_SIMPLE);
		createEAttribute(attributeValueSimpleEClass,
				ATTRIBUTE_VALUE_SIMPLE__THE_VALUE);
		createEReference(attributeValueSimpleEClass,
				ATTRIBUTE_VALUE_SIMPLE__DEFINITION);

		datatypeDefinitionIntegerEClass = createEClass(DATATYPE_DEFINITION_INTEGER);
		createEAttribute(datatypeDefinitionIntegerEClass,
				DATATYPE_DEFINITION_INTEGER__MAX);
		createEAttribute(datatypeDefinitionIntegerEClass,
				DATATYPE_DEFINITION_INTEGER__MIN);

		datatypeDefinitionSimpleEClass = createEClass(DATATYPE_DEFINITION_SIMPLE);

		datatypeDefinitionStringEClass = createEClass(DATATYPE_DEFINITION_STRING);
		createEAttribute(datatypeDefinitionStringEClass,
				DATATYPE_DEFINITION_STRING__MAX_LENGTH);

		rifContentEClass = createEClass(RIF_CONTENT);
		createEReference(rifContentEClass, RIF_CONTENT__SPEC_OBJECTS);
		createEReference(rifContentEClass, RIF_CONTENT__SPEC_TYPES);
		createEReference(rifContentEClass, RIF_CONTENT__DATA_TYPES);

		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__ID);
		createEAttribute(identifiableEClass, IDENTIFIABLE__DESC);
		createEAttribute(identifiableEClass, IDENTIFIABLE__LONG_NAME);

		attributeDefinitionSimpleEClass = createEClass(ATTRIBUTE_DEFINITION_SIMPLE);
		createEReference(attributeDefinitionSimpleEClass,
				ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE);

		erfEClass = createEClass(ERF);
		createEReference(erfEClass, ERF__CORE_CONTENT);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		addETypeParameter(mapEClass, "T");
		addETypeParameter(mapEClass, "T1");

		// Set bounds for type parameters

		// Add supertypes to classes
		attributeDefinitionEClass.getESuperTypes().add(this.getIdentifiable());
		attributeValueEClass.getESuperTypes().add(this.getIdentifiable());
		datatypeDefinitionEClass.getESuperTypes().add(this.getIdentifiable());
		specElementWithUserDefinedAttributesEClass.getESuperTypes().add(
				this.getIdentifiable());
		specObjectEClass.getESuperTypes().add(
				this.getSpecElementWithUserDefinedAttributes());
		specTypeEClass.getESuperTypes().add(this.getIdentifiable());
		attributeValueSimpleEClass.getESuperTypes().add(
				this.getAttributeValue());
		datatypeDefinitionIntegerEClass.getESuperTypes().add(
				this.getDatatypeDefinitionSimple());
		datatypeDefinitionSimpleEClass.getESuperTypes().add(
				this.getDatatypeDefinition());
		datatypeDefinitionStringEClass.getESuperTypes().add(
				this.getDatatypeDefinitionSimple());
		attributeDefinitionSimpleEClass.getESuperTypes().add(
				this.getAttributeDefinition());

		// Initialize classes and features; add operations and parameters
		initEClass(attributeDefinitionEClass, AttributeDefinition.class,
				"AttributeDefinition", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeDefinition_Type(), this
				.getDatatypeDefinition(), null, "type", null, 1, 1,
				AttributeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeValueEClass, AttributeValue.class,
				"AttributeValue", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(datatypeDefinitionEClass, DatatypeDefinition.class,
				"DatatypeDefinition", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(specElementWithUserDefinedAttributesEClass,
				SpecElementWithUserDefinedAttributes.class,
				"SpecElementWithUserDefinedAttributes", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecElementWithUserDefinedAttributes_Values(), this
				.getAttributeValue(), null, "values", null, 0, -1,
				SpecElementWithUserDefinedAttributes.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecElementWithUserDefinedAttributes_Type(), this
				.getSpecType(), null, "type", null, 0, 1,
				SpecElementWithUserDefinedAttributes.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specObjectEClass, SpecObject.class, "SpecObject",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specTypeEClass, SpecType.class, "SpecType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecType_SpecAttributes(), this
				.getAttributeDefinition(), null, "specAttributes", null, 0, -1,
				SpecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(mapEClass, Map.class, "Map", IS_ABSTRACT, IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeValueSimpleEClass, AttributeValueSimple.class,
				"AttributeValueSimple", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeValueSimple_TheValue(), ecorePackage
				.getEString(), "theValue", null, 1, 1,
				AttributeValueSimple.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAttributeValueSimple_Definition(), this
				.getAttributeDefinitionSimple(), null, "definition", null, 1,
				1, AttributeValueSimple.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypeDefinitionIntegerEClass,
				DatatypeDefinitionInteger.class, "DatatypeDefinitionInteger",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatatypeDefinitionInteger_Max(), ecorePackage
				.getEInt(), "max", null, 0, 1, DatatypeDefinitionInteger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatatypeDefinitionInteger_Min(), ecorePackage
				.getEInt(), "min", null, 0, 1, DatatypeDefinitionInteger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypeDefinitionSimpleEClass,
				DatatypeDefinitionSimple.class, "DatatypeDefinitionSimple",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(datatypeDefinitionStringEClass,
				DatatypeDefinitionString.class, "DatatypeDefinitionString",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatatypeDefinitionString_MaxLength(), ecorePackage
				.getEInt(), "maxLength", null, 0, 1,
				DatatypeDefinitionString.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(rifContentEClass, RIFContent.class, "RIFContent",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRIFContent_SpecObjects(), this.getSpecObject(), null,
				"specObjects", null, 0, -1, RIFContent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRIFContent_SpecTypes(), this.getSpecType(), null,
				"specTypes", null, 0, -1, RIFContent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRIFContent_DataTypes(), this.getDatatypeDefinition(),
				null, "dataTypes", null, 0, -1, RIFContent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(identifiableEClass, Identifiable.class, "Identifiable",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiable_ID(), ecorePackage.getEString(), "iD",
				null, 1, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getIdentifiable_Desc(), ecorePackage.getEString(),
				"desc", "", 0, 1, Identifiable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiable_LongName(), ecorePackage.getEString(),
				"longName", "", 0, 1, Identifiable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(attributeDefinitionSimpleEClass,
				AttributeDefinitionSimple.class, "AttributeDefinitionSimple",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeDefinitionSimple_DefaultValue(), this
				.getAttributeValueSimple(), null, "defaultValue", null, 0, 1,
				AttributeDefinitionSimple.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(erfEClass, era.foss.erf.ERF.class, "ERF", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getERF_CoreContent(), this.getRIFContent(), null,
				"coreContent", null, 1, 1, era.foss.erf.ERF.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(attributeValueSimpleEClass, source, new String[] {
				"constraints", "DatatypeDefinitionConstraints" });
		addAnnotation(datatypeDefinitionIntegerEClass, source, new String[] {
				"constraints", "NonNegative MaxGreaterThanMin" });
	}

} //ErfPackageImpl