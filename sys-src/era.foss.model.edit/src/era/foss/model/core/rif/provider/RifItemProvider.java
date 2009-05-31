/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.provider;

import era.foss.model.core.rif.Rif;
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
 * This is the item provider adapter for a {@link era.foss.model.core.rif.Rif} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RifItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RifItemProvider(AdapterFactory adapterFactory) {
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

			addAUTHORPropertyDescriptor(object);
			addCOMMENTPropertyDescriptor(object);
			addCOUNTRYCODEPropertyDescriptor(object);
			addCREATIONTIMEPropertyDescriptor(object);
			addIDENTIFIERPropertyDescriptor(object);
			addSOURCETOOLIDPropertyDescriptor(object);
			addTITLEPropertyDescriptor(object);
			addVERSIONPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the AUTHOR feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAUTHORPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Rif_aUTHOR_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Rif_aUTHOR_feature", "_UI_Rif_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.RIF__AUTHOR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the COMMENT feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCOMMENTPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Rif_cOMMENT_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Rif_cOMMENT_feature", "_UI_Rif_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.RIF__COMMENT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the COUNTRYCODE feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCOUNTRYCODEPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Rif_cOUNTRYCODE_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Rif_cOUNTRYCODE_feature", "_UI_Rif_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.RIF__COUNTRYCODE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the CREATIONTIME feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATIONTIMEPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Rif_cREATIONTIME_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Rif_cREATIONTIME_feature", "_UI_Rif_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.RIF__CREATIONTIME, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the IDENTIFIER feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDENTIFIERPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Rif_iDENTIFIER_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Rif_iDENTIFIER_feature", "_UI_Rif_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.RIF__IDENTIFIER, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the SOURCETOOLID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSOURCETOOLIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Rif_sOURCETOOLID_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Rif_sOURCETOOLID_feature", "_UI_Rif_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.RIF__SOURCETOOLID, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the TITLE feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTITLEPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Rif_tITLE_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Rif_tITLE_feature", "_UI_Rif_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.RIF__TITLE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the VERSION feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVERSIONPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Rif_vERSION_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Rif_vERSION_feature", "_UI_Rif_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.RIF__VERSION, true, false, false,
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
			childrenFeatures.add(RifPackage.Literals.RIF__SPECHIERARCHYROOTS);
			childrenFeatures.add(RifPackage.Literals.RIF__ACCESSPOLICIES);
			childrenFeatures.add(RifPackage.Literals.RIF__DATATYPES);
			childrenFeatures.add(RifPackage.Literals.RIF__SPECGROUPS);
			childrenFeatures.add(RifPackage.Literals.RIF__SPECOBJECTS);
			childrenFeatures.add(RifPackage.Literals.RIF__SPECRELATIONS);
			childrenFeatures.add(RifPackage.Literals.RIF__SPECTYPES);
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
	 * This returns Rif.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/Rif")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Rif) object).getAUTHOR();
		return label == null || label.length() == 0 ? getString("_UI_Rif_type") : //$NON-NLS-1$
				getString("_UI_Rif_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(Rif.class)) {
		case RifPackage.RIF__AUTHOR:
		case RifPackage.RIF__COMMENT:
		case RifPackage.RIF__COUNTRYCODE:
		case RifPackage.RIF__CREATIONTIME:
		case RifPackage.RIF__IDENTIFIER:
		case RifPackage.RIF__SOURCETOOLID:
		case RifPackage.RIF__TITLE:
		case RifPackage.RIF__VERSION:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), false, true));
			return;
		case RifPackage.RIF__SPECHIERARCHYROOTS:
		case RifPackage.RIF__ACCESSPOLICIES:
		case RifPackage.RIF__DATATYPES:
		case RifPackage.RIF__SPECGROUPS:
		case RifPackage.RIF__SPECOBJECTS:
		case RifPackage.RIF__SPECRELATIONS:
		case RifPackage.RIF__SPECTYPES:
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
				RifPackage.Literals.RIF__SPECHIERARCHYROOTS,
				RifFactory.eINSTANCE.createRifSpecHierarchyRoots()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.RIF__ACCESSPOLICIES, RifFactory.eINSTANCE
						.createAccessPolicies()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.RIF__DATATYPES, RifFactory.eINSTANCE
						.createDatatypes()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.RIF__SPECGROUPS, RifFactory.eINSTANCE
						.createRifSpecGroups()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.RIF__SPECOBJECTS, RifFactory.eINSTANCE
						.createRifSpecObjects()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.RIF__SPECRELATIONS, RifFactory.eINSTANCE
						.createRifSpecRelations()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.RIF__SPECTYPES, RifFactory.eINSTANCE
						.createRifSpecTypes()));
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
