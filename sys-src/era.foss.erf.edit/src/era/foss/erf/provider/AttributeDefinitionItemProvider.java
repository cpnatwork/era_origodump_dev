/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.erf.provider;

import era.foss.erf.AttributeDefinition;
import era.foss.erf.ErfPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link era.foss.erf.AttributeDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeDefinitionItemProvider extends IdentifiableItemProvider implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeDefinitionItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addTypePropertyDescriptor( object );
            addIdentPropertyDescriptor( object );
            addUniquePropertyDescriptor( object );
            addEditorShowLabelPropertyDescriptor( object );
            addEditorRowNumberPropertyDescriptor( object );
            addEditorColumnSpanPropertyDescriptor( object );
            addUiShowLabelPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor( ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                                                   getResourceLocator(),
                                                                   getString( "_UI_AttributeDefinition_type_feature" ),
                                                                   getString( "_UI_PropertyDescriptor_description",
                                                                              "_UI_AttributeDefinition_type_feature",
                                                                              "_UI_AttributeDefinition_type" ),
                                                                   ErfPackage.Literals.ATTRIBUTE_DEFINITION__TYPE,
                                                                   true,
                                                                   false,
                                                                   true,
                                                                   null,
                                                                   null,
                                                                   null ) );
    }

    /**
     * This adds a property descriptor for the Ident feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor( ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                                                   getResourceLocator(),
                                                                   getString( "_UI_AttributeDefinition_ident_feature" ),
                                                                   getString( "_UI_PropertyDescriptor_description",
                                                                              "_UI_AttributeDefinition_ident_feature",
                                                                              "_UI_AttributeDefinition_type" ),
                                                                   ErfPackage.Literals.ATTRIBUTE_DEFINITION__IDENT,
                                                                   true,
                                                                   false,
                                                                   false,
                                                                   ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                                                                   null,
                                                                   null ) );
    }

    /**
     * This adds a property descriptor for the Unique feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUniquePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor( ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                                                   getResourceLocator(),
                                                                   getString( "_UI_AttributeDefinition_unique_feature" ),
                                                                   getString( "_UI_PropertyDescriptor_description",
                                                                              "_UI_AttributeDefinition_unique_feature",
                                                                              "_UI_AttributeDefinition_type" ),
                                                                   ErfPackage.Literals.ATTRIBUTE_DEFINITION__UNIQUE,
                                                                   true,
                                                                   false,
                                                                   false,
                                                                   ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                                                                   null,
                                                                   null ) );
    }

    /**
     * This adds a property descriptor for the Editor Show Label feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEditorShowLabelPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor( ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                                                   getResourceLocator(),
                                                                   getString( "_UI_AttributeDefinition_editorShowLabel_feature" ),
                                                                   getString( "_UI_PropertyDescriptor_description",
                                                                              "_UI_AttributeDefinition_editorShowLabel_feature",
                                                                              "_UI_AttributeDefinition_type" ),
                                                                   ErfPackage.Literals.ATTRIBUTE_DEFINITION__EDITOR_SHOW_LABEL,
                                                                   true,
                                                                   false,
                                                                   false,
                                                                   ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                                                                   null,
                                                                   null ) );
    }

    /**
     * This adds a property descriptor for the Editor Row Number feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEditorRowNumberPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor( ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                                                   getResourceLocator(),
                                                                   getString( "_UI_AttributeDefinition_editorRowNumber_feature" ),
                                                                   getString( "_UI_PropertyDescriptor_description",
                                                                              "_UI_AttributeDefinition_editorRowNumber_feature",
                                                                              "_UI_AttributeDefinition_type" ),
                                                                   ErfPackage.Literals.ATTRIBUTE_DEFINITION__EDITOR_ROW_NUMBER,
                                                                   true,
                                                                   false,
                                                                   false,
                                                                   ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                                                                   null,
                                                                   null ) );
    }

    /**
     * This adds a property descriptor for the Editor Column Span feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEditorColumnSpanPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor( ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                                                   getResourceLocator(),
                                                                   getString( "_UI_AttributeDefinition_editorColumnSpan_feature" ),
                                                                   getString( "_UI_PropertyDescriptor_description",
                                                                              "_UI_AttributeDefinition_editorColumnSpan_feature",
                                                                              "_UI_AttributeDefinition_type" ),
                                                                   ErfPackage.Literals.ATTRIBUTE_DEFINITION__EDITOR_COLUMN_SPAN,
                                                                   true,
                                                                   false,
                                                                   false,
                                                                   ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                                                                   null,
                                                                   null ) );
    }

    /**
     * This adds a property descriptor for the Ui Show Label feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUiShowLabelPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor( ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                                                   getResourceLocator(),
                                                                   getString( "_UI_AttributeDefinition_uiShowLabel_feature" ),
                                                                   getString( "_UI_PropertyDescriptor_description",
                                                                              "_UI_AttributeDefinition_uiShowLabel_feature",
                                                                              "_UI_AttributeDefinition_type" ),
                                                                   ErfPackage.Literals.ATTRIBUTE_DEFINITION__UI_SHOW_LABEL,
                                                                   true,
                                                                   false,
                                                                   true,
                                                                   null,
                                                                   null,
                                                                   null ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ((AttributeDefinition)object).getID();
        return label == null || label.length() == 0
            ? getString( "_UI_AttributeDefinition_type" )
            : getString( "_UI_AttributeDefinition_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch (notification.getFeatureID( AttributeDefinition.class )) {
        case ErfPackage.ATTRIBUTE_DEFINITION__IDENT:
        case ErfPackage.ATTRIBUTE_DEFINITION__UNIQUE:
        case ErfPackage.ATTRIBUTE_DEFINITION__EDITOR_SHOW_LABEL:
        case ErfPackage.ATTRIBUTE_DEFINITION__EDITOR_ROW_NUMBER:
        case ErfPackage.ATTRIBUTE_DEFINITION__EDITOR_COLUMN_SPAN:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection<Object> newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
