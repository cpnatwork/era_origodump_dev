/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.rif.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import era.foss.rif.RIFContent;
import era.foss.rif.RifFactory;
import era.foss.rif.RifPackage;

/**
 * This is the item provider adapter for a {@link era.foss.rif.RIFContent} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class RIFContentItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public RIFContentItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

        }
        return itemPropertyDescriptors;
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures( Object object ) {
        if( childrenFeatures == null ) {
            super.getChildrenFeatures( object );
            childrenFeatures.add( RifPackage.Literals.RIF_CONTENT__SPEC_OBJECTS );
            childrenFeatures.add( RifPackage.Literals.RIF_CONTENT__SPEC_TYPES );
            childrenFeatures.add( RifPackage.Literals.RIF_CONTENT__DATA_TYPES );
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature( Object object, Object child ) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature( object, child );
    }

    /**
     * This returns RIFContent.gif.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/RIFContent" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        return getString( "_UI_RIFContent_type" );
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating
     * a viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch (notification.getFeatureID( RIFContent.class )) {
        case RifPackage.RIF_CONTENT__SPEC_OBJECTS:
        case RifPackage.RIF_CONTENT__SPEC_TYPES:
        case RifPackage.RIF_CONTENT__DATA_TYPES:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), true, false ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection<Object> newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );

        newChildDescriptors.add( createChildParameter( RifPackage.Literals.RIF_CONTENT__SPEC_OBJECTS,
                                                       RifFactory.eINSTANCE.createSpecObject() ) );

        newChildDescriptors.add( createChildParameter( RifPackage.Literals.RIF_CONTENT__SPEC_TYPES,
                                                       RifFactory.eINSTANCE.createSpecType() ) );

        newChildDescriptors.add( createChildParameter( RifPackage.Literals.RIF_CONTENT__DATA_TYPES,
                                                       RifFactory.eINSTANCE.createDatatypeDefinitionInteger() ) );

        newChildDescriptors.add( createChildParameter( RifPackage.Literals.RIF_CONTENT__DATA_TYPES,
                                                       RifFactory.eINSTANCE.createDatatypeDefinitionString() ) );
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return RifEditPlugin.INSTANCE;
    }

    protected Command createReplaceCommand( EditingDomain domain,
                                            EObject owner,
                                            EStructuralFeature feature,
                                            EObject value,
                                            Collection<?> collection ) {
        if( feature.getFeatureID() == RifPackage.RIF_CONTENT__DATA_TYPES ) {
            return new ReplaceDatatypeDefinitionCommand( domain, owner, feature, value, collection );
        }
        return new ReplaceCommand( domain, owner, feature, value, collection );
    }

}
