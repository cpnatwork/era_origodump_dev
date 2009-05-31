/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.provider;

import era.foss.model.core.rif.DatatypeDefinitions;
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
 * This is the item provider adapter for a {@link era.foss.model.core.rif.DatatypeDefinitions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypeDefinitionsItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeDefinitionsItemProvider(AdapterFactory adapterFactory) {
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

			addDATATYPEDEFINITIONBINARYFILEREFPropertyDescriptor(object);
			addDATATYPEDEFINITIONBOOLEANREFPropertyDescriptor(object);
			addDATATYPEDEFINITIONDOCUMENTREFPropertyDescriptor(object);
			addDATATYPEDEFINITIONENUMERATIONREFPropertyDescriptor(object);
			addDATATYPEDEFINITIONINTEGERREFPropertyDescriptor(object);
			addDATATYPEDEFINITIONREALREFPropertyDescriptor(object);
			addDATATYPEDEFINITIONSTRINGREFPropertyDescriptor(object);
			addDATATYPEDEFINITIONXMLDATAREFPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the DATATYPEDEFINITIONBINARYFILEREF feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDATATYPEDEFINITIONBINARYFILEREFPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_DatatypeDefinitions_dATATYPEDEFINITIONBINARYFILEREF_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_DatatypeDefinitions_dATATYPEDEFINITIONBINARYFILEREF_feature", "_UI_DatatypeDefinitions_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONBINARYFILEREF,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the DATATYPEDEFINITIONBOOLEANREF feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDATATYPEDEFINITIONBOOLEANREFPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_DatatypeDefinitions_dATATYPEDEFINITIONBOOLEANREF_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_DatatypeDefinitions_dATATYPEDEFINITIONBOOLEANREF_feature", "_UI_DatatypeDefinitions_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONBOOLEANREF,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the DATATYPEDEFINITIONDOCUMENTREF feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDATATYPEDEFINITIONDOCUMENTREFPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_DatatypeDefinitions_dATATYPEDEFINITIONDOCUMENTREF_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_DatatypeDefinitions_dATATYPEDEFINITIONDOCUMENTREF_feature", "_UI_DatatypeDefinitions_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONDOCUMENTREF,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the DATATYPEDEFINITIONENUMERATIONREF feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDATATYPEDEFINITIONENUMERATIONREFPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_DatatypeDefinitions_dATATYPEDEFINITIONENUMERATIONREF_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_DatatypeDefinitions_dATATYPEDEFINITIONENUMERATIONREF_feature", "_UI_DatatypeDefinitions_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONENUMERATIONREF,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the DATATYPEDEFINITIONINTEGERREF feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDATATYPEDEFINITIONINTEGERREFPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_DatatypeDefinitions_dATATYPEDEFINITIONINTEGERREF_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_DatatypeDefinitions_dATATYPEDEFINITIONINTEGERREF_feature", "_UI_DatatypeDefinitions_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONINTEGERREF,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the DATATYPEDEFINITIONREALREF feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDATATYPEDEFINITIONREALREFPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_DatatypeDefinitions_dATATYPEDEFINITIONREALREF_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_DatatypeDefinitions_dATATYPEDEFINITIONREALREF_feature", "_UI_DatatypeDefinitions_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONREALREF,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the DATATYPEDEFINITIONSTRINGREF feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDATATYPEDEFINITIONSTRINGREFPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_DatatypeDefinitions_dATATYPEDEFINITIONSTRINGREF_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_DatatypeDefinitions_dATATYPEDEFINITIONSTRINGREF_feature", "_UI_DatatypeDefinitions_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONSTRINGREF,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the DATATYPEDEFINITIONXMLDATAREF feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDATATYPEDEFINITIONXMLDATAREFPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_DatatypeDefinitions_dATATYPEDEFINITIONXMLDATAREF_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_DatatypeDefinitions_dATATYPEDEFINITIONXMLDATAREF_feature", "_UI_DatatypeDefinitions_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONXMLDATAREF,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
					.add(RifPackage.Literals.DATATYPE_DEFINITIONS__GROUP);
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
	 * This returns DatatypeDefinitions.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/DatatypeDefinitions")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DatatypeDefinitions_type"); //$NON-NLS-1$
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

		switch (notification.getFeatureID(DatatypeDefinitions.class)) {
		case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONBINARYFILEREF:
		case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONBOOLEANREF:
		case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONDOCUMENTREF:
		case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONENUMERATIONREF:
		case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONINTEGERREF:
		case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONREALREF:
		case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONSTRINGREF:
		case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONXMLDATAREF:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), false, true));
			return;
		case RifPackage.DATATYPE_DEFINITIONS__GROUP:
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

		newChildDescriptors
				.add(createChildParameter(
						RifPackage.Literals.DATATYPE_DEFINITIONS__GROUP,
						FeatureMapUtil
								.createEntry(
										RifPackage.Literals.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONBINARYFILEREF,
										""))); //$NON-NLS-1$

		newChildDescriptors
				.add(createChildParameter(
						RifPackage.Literals.DATATYPE_DEFINITIONS__GROUP,
						FeatureMapUtil
								.createEntry(
										RifPackage.Literals.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONBOOLEANREF,
										""))); //$NON-NLS-1$

		newChildDescriptors
				.add(createChildParameter(
						RifPackage.Literals.DATATYPE_DEFINITIONS__GROUP,
						FeatureMapUtil
								.createEntry(
										RifPackage.Literals.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONDOCUMENTREF,
										""))); //$NON-NLS-1$

		newChildDescriptors
				.add(createChildParameter(
						RifPackage.Literals.DATATYPE_DEFINITIONS__GROUP,
						FeatureMapUtil
								.createEntry(
										RifPackage.Literals.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONENUMERATIONREF,
										""))); //$NON-NLS-1$

		newChildDescriptors
				.add(createChildParameter(
						RifPackage.Literals.DATATYPE_DEFINITIONS__GROUP,
						FeatureMapUtil
								.createEntry(
										RifPackage.Literals.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONINTEGERREF,
										""))); //$NON-NLS-1$

		newChildDescriptors
				.add(createChildParameter(
						RifPackage.Literals.DATATYPE_DEFINITIONS__GROUP,
						FeatureMapUtil
								.createEntry(
										RifPackage.Literals.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONREALREF,
										""))); //$NON-NLS-1$

		newChildDescriptors
				.add(createChildParameter(
						RifPackage.Literals.DATATYPE_DEFINITIONS__GROUP,
						FeatureMapUtil
								.createEntry(
										RifPackage.Literals.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONSTRINGREF,
										""))); //$NON-NLS-1$

		newChildDescriptors
				.add(createChildParameter(
						RifPackage.Literals.DATATYPE_DEFINITIONS__GROUP,
						FeatureMapUtil
								.createEntry(
										RifPackage.Literals.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONXMLDATAREF,
										""))); //$NON-NLS-1$
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
