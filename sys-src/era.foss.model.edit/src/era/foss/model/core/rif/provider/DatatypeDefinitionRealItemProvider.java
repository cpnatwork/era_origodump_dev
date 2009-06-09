/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.provider;

import era.foss.model.core.rif.DatatypeDefinitionReal;
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
 * This is the item provider adapter for a {@link era.foss.model.core.rif.DatatypeDefinitionReal} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypeDefinitionRealItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeDefinitionRealItemProvider(AdapterFactory adapterFactory) {
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
			addACCURACYPropertyDescriptor(object);
			addIDENTIFIERPropertyDescriptor(object);
			addLASTCHANGEPropertyDescriptor(object);
			addMAXPropertyDescriptor(object);
			addMINPropertyDescriptor(object);
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
						getString("_UI_DatatypeDefinitionReal_lONGNAME_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_DatatypeDefinitionReal_lONGNAME_feature", "_UI_DatatypeDefinitionReal_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.DATATYPE_DEFINITION_REAL__LONGNAME,
						true, false, false,
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
						getString("_UI_DatatypeDefinitionReal_dESC_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_DatatypeDefinitionReal_dESC_feature", "_UI_DatatypeDefinitionReal_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.DATATYPE_DEFINITION_REAL__DESC,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the ACCURACY feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addACCURACYPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_DatatypeDefinitionReal_aCCURACY_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_DatatypeDefinitionReal_aCCURACY_feature", "_UI_DatatypeDefinitionReal_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.DATATYPE_DEFINITION_REAL__ACCURACY,
						true, false, false,
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
						getString("_UI_DatatypeDefinitionReal_iDENTIFIER_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_DatatypeDefinitionReal_iDENTIFIER_feature", "_UI_DatatypeDefinitionReal_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.DATATYPE_DEFINITION_REAL__IDENTIFIER,
						true, false, false,
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
						getString("_UI_DatatypeDefinitionReal_lASTCHANGE_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_DatatypeDefinitionReal_lASTCHANGE_feature", "_UI_DatatypeDefinitionReal_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.DATATYPE_DEFINITION_REAL__LASTCHANGE,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the MAX feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMAXPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_DatatypeDefinitionReal_mAX_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_DatatypeDefinitionReal_mAX_feature", "_UI_DatatypeDefinitionReal_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.DATATYPE_DEFINITION_REAL__MAX,
						true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the MIN feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMINPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_DatatypeDefinitionReal_mIN_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_DatatypeDefinitionReal_mIN_feature", "_UI_DatatypeDefinitionReal_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						RifPackage.Literals.DATATYPE_DEFINITION_REAL__MIN,
						true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns DatatypeDefinitionReal.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/DatatypeDefinitionReal")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DatatypeDefinitionReal) object).getLONGNAME();
		return label == null || label.length() == 0 ? getString("_UI_DatatypeDefinitionReal_type") : //$NON-NLS-1$
				getString("_UI_DatatypeDefinitionReal_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(DatatypeDefinitionReal.class)) {
		case RifPackage.DATATYPE_DEFINITION_REAL__LONGNAME:
		case RifPackage.DATATYPE_DEFINITION_REAL__DESC:
		case RifPackage.DATATYPE_DEFINITION_REAL__ACCURACY:
		case RifPackage.DATATYPE_DEFINITION_REAL__IDENTIFIER:
		case RifPackage.DATATYPE_DEFINITION_REAL__LASTCHANGE:
		case RifPackage.DATATYPE_DEFINITION_REAL__MAX:
		case RifPackage.DATATYPE_DEFINITION_REAL__MIN:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), false, true));
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