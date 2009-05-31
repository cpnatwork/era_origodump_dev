/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.provider;

import era.foss.model.core.rif.DocumentRoot;
import era.foss.model.core.rif.RifFactory;
import era.foss.model.core.rif.RifPackage;

import era.foss.model.geneditor.plugin.Activator;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link era.foss.model.core.rif.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIDPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_DocumentRoot_iD_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_DocumentRoot_iD_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.DOCUMENT_ROOT__ID, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(RifPackage.Literals.DOCUMENT_ROOT__ACCESSPOLICY);
			childrenFeatures
					.add(RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONCOMPLEX);
			childrenFeatures
					.add(RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONENUMERATION);
			childrenFeatures
					.add(RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONSIMPLE);
			childrenFeatures
					.add(RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDDOCUMENT);
			childrenFeatures
					.add(RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDFILE);
			childrenFeatures
					.add(RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUEENUMERATION);
			childrenFeatures
					.add(RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUEFILEREFERENCE);
			childrenFeatures
					.add(RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUESIMPLE);
			childrenFeatures
					.add(RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUEXMLDATA);
			childrenFeatures
					.add(RifPackage.Literals.DOCUMENT_ROOT__BINARYCONTENT);
			childrenFeatures
					.add(RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONBINARYFILE);
			childrenFeatures
					.add(RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONBOOLEAN);
			childrenFeatures
					.add(RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONDOCUMENT);
			childrenFeatures
					.add(RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONENUMERATION);
			childrenFeatures
					.add(RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONINTEGER);
			childrenFeatures
					.add(RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONREAL);
			childrenFeatures
					.add(RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONSTRING);
			childrenFeatures
					.add(RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONXMLDATA);
			childrenFeatures
					.add(RifPackage.Literals.DOCUMENT_ROOT__EMBEDDEDVALUE);
			childrenFeatures.add(RifPackage.Literals.DOCUMENT_ROOT__ENUMVALUE);
			childrenFeatures
					.add(RifPackage.Literals.DOCUMENT_ROOT__RELATIONGROUP);
			childrenFeatures.add(RifPackage.Literals.DOCUMENT_ROOT__RIF);
			childrenFeatures.add(RifPackage.Literals.DOCUMENT_ROOT__SPECGROUP);
			childrenFeatures
					.add(RifPackage.Literals.DOCUMENT_ROOT__SPECHIERARCHY);
			childrenFeatures
					.add(RifPackage.Literals.DOCUMENT_ROOT__SPECHIERARCHYROOT);
			childrenFeatures.add(RifPackage.Literals.DOCUMENT_ROOT__SPECOBJECT);
			childrenFeatures
					.add(RifPackage.Literals.DOCUMENT_ROOT__SPECRELATION);
			childrenFeatures.add(RifPackage.Literals.DOCUMENT_ROOT__SPECTYPE);
			childrenFeatures
					.add(RifPackage.Literals.DOCUMENT_ROOT__XHTMLCONTENT);
			childrenFeatures.add(RifPackage.Literals.DOCUMENT_ROOT__XMLCONTENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/DocumentRoot")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DocumentRoot) object).getID();
		return label == null || label.length() == 0 ? getString("_UI_DocumentRoot_type") : //$NON-NLS-1$
				getString("_UI_DocumentRoot_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DocumentRoot.class)) {
		case RifPackage.DOCUMENT_ROOT__ID:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), false, true));
			return;
		case RifPackage.DOCUMENT_ROOT__ACCESSPOLICY:
		case RifPackage.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONCOMPLEX:
		case RifPackage.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONENUMERATION:
		case RifPackage.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONSIMPLE:
		case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
		case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDFILE:
		case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEENUMERATION:
		case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEFILEREFERENCE:
		case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUESIMPLE:
		case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEXMLDATA:
		case RifPackage.DOCUMENT_ROOT__BINARYCONTENT:
		case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONBINARYFILE:
		case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONBOOLEAN:
		case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONDOCUMENT:
		case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONENUMERATION:
		case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONINTEGER:
		case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONREAL:
		case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONSTRING:
		case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONXMLDATA:
		case RifPackage.DOCUMENT_ROOT__EMBEDDEDVALUE:
		case RifPackage.DOCUMENT_ROOT__ENUMVALUE:
		case RifPackage.DOCUMENT_ROOT__RELATIONGROUP:
		case RifPackage.DOCUMENT_ROOT__RIF:
		case RifPackage.DOCUMENT_ROOT__SPECGROUP:
		case RifPackage.DOCUMENT_ROOT__SPECHIERARCHY:
		case RifPackage.DOCUMENT_ROOT__SPECHIERARCHYROOT:
		case RifPackage.DOCUMENT_ROOT__SPECOBJECT:
		case RifPackage.DOCUMENT_ROOT__SPECRELATION:
		case RifPackage.DOCUMENT_ROOT__SPECTYPE:
		case RifPackage.DOCUMENT_ROOT__XHTMLCONTENT:
		case RifPackage.DOCUMENT_ROOT__XMLCONTENT:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__ACCESSPOLICY,
				RifFactory.eINSTANCE.createAccessPolicy()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONCOMPLEX,
				RifFactory.eINSTANCE.createAttributeDefinitionComplex()));

		newChildDescriptors
				.add(createChildParameter(
						RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONENUMERATION,
						RifFactory.eINSTANCE
								.createAttributeDefinitionEnumeration()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONSIMPLE,
				RifFactory.eINSTANCE.createAttributeDefinitionSimple()));

		newChildDescriptors
				.add(createChildParameter(
						RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDDOCUMENT,
						RifFactory.eINSTANCE
								.createAttributeValueEmbeddedDocument()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDFILE,
				RifFactory.eINSTANCE.createAttributeValueEmbeddedFile()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUEENUMERATION,
				RifFactory.eINSTANCE.createAttributeValueEnumeration()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUEFILEREFERENCE,
				RifFactory.eINSTANCE.createAttributeValueFileReference()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUESIMPLE,
				RifFactory.eINSTANCE.createAttributeValueSimple()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUEXMLDATA,
				RifFactory.eINSTANCE.createAttributeValueXmlData()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__BINARYCONTENT,
				RifFactory.eINSTANCE.createBinaryContent()));

		newChildDescriptors
				.add(createChildParameter(
						RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONBINARYFILE,
						RifFactory.eINSTANCE
								.createDatatypeDefinitionBinaryFile()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONBOOLEAN,
				RifFactory.eINSTANCE.createDatatypeDefinitionBoolean()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONDOCUMENT,
				RifFactory.eINSTANCE.createDatatypeDefinitionDocument()));

		newChildDescriptors
				.add(createChildParameter(
						RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONENUMERATION,
						RifFactory.eINSTANCE
								.createDatatypeDefinitionEnumeration()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONINTEGER,
				RifFactory.eINSTANCE.createDatatypeDefinitionInteger()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONREAL,
				RifFactory.eINSTANCE.createDatatypeDefinitionReal()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONSTRING,
				RifFactory.eINSTANCE.createDatatypeDefinitionString()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONXMLDATA,
				RifFactory.eINSTANCE.createDatatypeDefinitionXmlData()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__EMBEDDEDVALUE,
				RifFactory.eINSTANCE.createEmbeddedValue()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__ENUMVALUE,
				RifFactory.eINSTANCE.createEnumValue()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__RELATIONGROUP,
				RifFactory.eINSTANCE.createRelationGroup()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__RIF, RifFactory.eINSTANCE
						.createRif()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__SPECGROUP,
				RifFactory.eINSTANCE.createSpecGroup()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__SPECHIERARCHY,
				RifFactory.eINSTANCE.createSpecHierarchy()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__SPECHIERARCHYROOT,
				RifFactory.eINSTANCE.createSpecHierarchyRoot()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__SPECOBJECT,
				RifFactory.eINSTANCE.createSpecObject()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__SPECRELATION,
				RifFactory.eINSTANCE.createSpecRelation()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__SPECTYPE,
				RifFactory.eINSTANCE.createSpecType()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__XHTMLCONTENT,
				RifFactory.eINSTANCE.createXhtmlContent()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.DOCUMENT_ROOT__XMLCONTENT,
				RifFactory.eINSTANCE.createXmlContentXmlContent()));
	}

	/**
	 * This returns the icon image for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getCreateChildImage(Object owner, Object feature,
			Object child, Collection<?> selection) {
		if (feature instanceof EStructuralFeature
				&& FeatureMapUtil.isFeatureMap((EStructuralFeature) feature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry) child;
			feature = entry.getEStructuralFeature();
			child = entry.getValue();
		}

		if (feature instanceof EReference && child instanceof EObject) {
			String name = "full/obj16/" + ((EObject) child).eClass().getName(); //$NON-NLS-1$

			try {
				return getResourceLocator().getImage(name);
			} catch (Exception e) {
				Activator.INSTANCE.log(e);
			}
		}

		return super.getCreateChildImage(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Activator.INSTANCE;
	}

}
