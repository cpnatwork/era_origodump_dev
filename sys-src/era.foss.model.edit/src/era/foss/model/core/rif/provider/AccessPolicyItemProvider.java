/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.provider;

import era.foss.model.core.rif.AccessPolicy;
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
 * This is the item provider adapter for a {@link era.foss.model.core.rif.AccessPolicy} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AccessPolicyItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessPolicyItemProvider(AdapterFactory adapterFactory) {
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

			addLONGNAMEPropertyDescriptor(object);
			addDESCPropertyDescriptor(object);
			addACCESSMODEPropertyDescriptor(object);
			addIDENTIFIERPropertyDescriptor(object);
			addLASTCHANGEPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the LONGNAME feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLONGNAMEPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_AccessPolicy_lONGNAME_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_AccessPolicy_lONGNAME_feature", "_UI_AccessPolicy_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.ACCESS_POLICY__LONGNAME, true,
						false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the DESC feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDESCPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_AccessPolicy_dESC_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_AccessPolicy_dESC_feature", "_UI_AccessPolicy_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.ACCESS_POLICY__DESC, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the ACCESSMODE feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addACCESSMODEPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_AccessPolicy_aCCESSMODE_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_AccessPolicy_aCCESSMODE_feature", "_UI_AccessPolicy_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.ACCESS_POLICY__ACCESSMODE, true,
						false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getString("_UI_AccessPolicy_iDENTIFIER_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_AccessPolicy_iDENTIFIER_feature", "_UI_AccessPolicy_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.ACCESS_POLICY__IDENTIFIER, true,
						false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the LASTCHANGE feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLASTCHANGEPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_AccessPolicy_lASTCHANGE_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_AccessPolicy_lASTCHANGE_feature", "_UI_AccessPolicy_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.ACCESS_POLICY__LASTCHANGE, true,
						false, false,
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
					.add(RifPackage.Literals.ACCESS_POLICY__ATTRIBUTEDEFINITIONS);
			childrenFeatures
					.add(RifPackage.Literals.ACCESS_POLICY__ATTRIBUTEVALUES);
			childrenFeatures
					.add(RifPackage.Literals.ACCESS_POLICY__DATATYPEDEFINITIONS);
			childrenFeatures
					.add(RifPackage.Literals.ACCESS_POLICY__RELATIONGROUPS);
			childrenFeatures.add(RifPackage.Literals.ACCESS_POLICY__SPECGROUPS);
			childrenFeatures
					.add(RifPackage.Literals.ACCESS_POLICY__SPECHIERARCHIES);
			childrenFeatures
					.add(RifPackage.Literals.ACCESS_POLICY__SPECHIERARCHYROOTS);
			childrenFeatures
					.add(RifPackage.Literals.ACCESS_POLICY__SPECOBJECTS);
			childrenFeatures
					.add(RifPackage.Literals.ACCESS_POLICY__SPECRELATIONS);
			childrenFeatures.add(RifPackage.Literals.ACCESS_POLICY__SPECTYPES);
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
	 * This returns AccessPolicy.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/AccessPolicy")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AccessPolicy) object).getLONGNAME();
		return label == null || label.length() == 0 ? getString("_UI_AccessPolicy_type") : //$NON-NLS-1$
				getString("_UI_AccessPolicy_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(AccessPolicy.class)) {
		case RifPackage.ACCESS_POLICY__LONGNAME:
		case RifPackage.ACCESS_POLICY__DESC:
		case RifPackage.ACCESS_POLICY__ACCESSMODE:
		case RifPackage.ACCESS_POLICY__IDENTIFIER:
		case RifPackage.ACCESS_POLICY__LASTCHANGE:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), false, true));
			return;
		case RifPackage.ACCESS_POLICY__ATTRIBUTEDEFINITIONS:
		case RifPackage.ACCESS_POLICY__ATTRIBUTEVALUES:
		case RifPackage.ACCESS_POLICY__DATATYPEDEFINITIONS:
		case RifPackage.ACCESS_POLICY__RELATIONGROUPS:
		case RifPackage.ACCESS_POLICY__SPECGROUPS:
		case RifPackage.ACCESS_POLICY__SPECHIERARCHIES:
		case RifPackage.ACCESS_POLICY__SPECHIERARCHYROOTS:
		case RifPackage.ACCESS_POLICY__SPECOBJECTS:
		case RifPackage.ACCESS_POLICY__SPECRELATIONS:
		case RifPackage.ACCESS_POLICY__SPECTYPES:
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
				RifPackage.Literals.ACCESS_POLICY__ATTRIBUTEDEFINITIONS,
				RifFactory.eINSTANCE.createAttributeDefinitions()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.ACCESS_POLICY__ATTRIBUTEVALUES,
				RifFactory.eINSTANCE.createAttributeValues()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.ACCESS_POLICY__DATATYPEDEFINITIONS,
				RifFactory.eINSTANCE.createDatatypeDefinitions()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.ACCESS_POLICY__RELATIONGROUPS,
				RifFactory.eINSTANCE.createAccessPolicyRelationGroups()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.ACCESS_POLICY__SPECGROUPS,
				RifFactory.eINSTANCE.createAccessPolicySpecGroups()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.ACCESS_POLICY__SPECHIERARCHIES,
				RifFactory.eINSTANCE.createSpecHierarchies()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.ACCESS_POLICY__SPECHIERARCHYROOTS,
				RifFactory.eINSTANCE.createAccessPolicySpecHierarchyRoots()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.ACCESS_POLICY__SPECOBJECTS,
				RifFactory.eINSTANCE.createAccessPolicySpecObjects()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.ACCESS_POLICY__SPECRELATIONS,
				RifFactory.eINSTANCE.createAccessPolicySpecRelations()));

		newChildDescriptors.add(createChildParameter(
				RifPackage.Literals.ACCESS_POLICY__SPECTYPES,
				RifFactory.eINSTANCE.createAccessPolicySpecTypes()));
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
