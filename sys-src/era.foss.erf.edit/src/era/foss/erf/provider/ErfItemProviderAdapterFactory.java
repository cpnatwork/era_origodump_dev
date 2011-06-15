/**************************************************************************
 * ERA - Eclipse Requirements Analysis
 * ==============================================
 * Copyright (C) 2009-2011 by Georg Blaschke, Christoph P. Neumann
 * and Bernd Haberstumpf (http://era.origo.ethz.ch)
 **************************************************************************
 * Licensed under the Eclipse Public License - v 1.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.eclipse.org/org/documents/epl-v10.html
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **************************************************************************
 * $Id$
 *************************************************************************/
package era.foss.erf.provider;

import era.foss.erf.util.ErfAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ErfItemProviderAdapterFactory extends ErfAdapterFactory implements ComposeableAdapterFactory,
        IChangeNotifier, IDisposable {
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ErfItemProviderAdapterFactory() {
        supportedTypes.add( IEditingDomainItemProvider.class );
        supportedTypes.add( IStructuredItemContentProvider.class );
        supportedTypes.add( ITreeItemContentProvider.class );
        supportedTypes.add( IItemLabelProvider.class );
        supportedTypes.add( IItemPropertySource.class );
    }

    /**
     * This keeps track of the one adapter used for all {@link era.foss.erf.SpecObject} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SpecObjectItemProvider specObjectItemProvider;

    /**
     * This creates an adapter for a {@link era.foss.erf.SpecObject}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSpecObjectAdapter() {
        if( specObjectItemProvider == null ) {
            specObjectItemProvider = new SpecObjectItemProvider( this );
        }

        return specObjectItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link era.foss.erf.SpecType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SpecTypeItemProvider specTypeItemProvider;

    /**
     * This creates an adapter for a {@link era.foss.erf.SpecType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSpecTypeAdapter() {
        if( specTypeItemProvider == null ) {
            specTypeItemProvider = new SpecTypeItemProvider( this );
        }

        return specTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link era.foss.erf.AttributeValueSimple} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeValueSimpleItemProvider attributeValueSimpleItemProvider;

    /**
     * This creates an adapter for a {@link era.foss.erf.AttributeValueSimple}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createAttributeValueSimpleAdapter() {
        if( attributeValueSimpleItemProvider == null ) {
            attributeValueSimpleItemProvider = new AttributeValueSimpleItemProvider( this );
        }

        return attributeValueSimpleItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link era.foss.erf.DatatypeDefinitionInteger} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DatatypeDefinitionIntegerItemProvider datatypeDefinitionIntegerItemProvider;

    /**
     * This creates an adapter for a {@link era.foss.erf.DatatypeDefinitionInteger}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDatatypeDefinitionIntegerAdapter() {
        if( datatypeDefinitionIntegerItemProvider == null ) {
            datatypeDefinitionIntegerItemProvider = new DatatypeDefinitionIntegerItemProvider( this );
        }

        return datatypeDefinitionIntegerItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link era.foss.erf.DatatypeDefinitionString} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DatatypeDefinitionStringItemProvider datatypeDefinitionStringItemProvider;

    /**
     * This creates an adapter for a {@link era.foss.erf.DatatypeDefinitionString}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDatatypeDefinitionStringAdapter() {
        if( datatypeDefinitionStringItemProvider == null ) {
            datatypeDefinitionStringItemProvider = new DatatypeDefinitionStringItemProvider( this );
        }

        return datatypeDefinitionStringItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link era.foss.erf.AttributeDefinitionSimple} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeDefinitionSimpleItemProvider attributeDefinitionSimpleItemProvider;

    /**
     * This creates an adapter for a {@link era.foss.erf.AttributeDefinitionSimple}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createAttributeDefinitionSimpleAdapter() {
        if( attributeDefinitionSimpleItemProvider == null ) {
            attributeDefinitionSimpleItemProvider = new AttributeDefinitionSimpleItemProvider( this );
        }

        return attributeDefinitionSimpleItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link era.foss.erf.ERF} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ERFItemProvider erfItemProvider;

    /**
     * This creates an adapter for a {@link era.foss.erf.ERF}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createERFAdapter() {
        if( erfItemProvider == null ) {
            erfItemProvider = new ERFItemProvider( this );
        }

        return erfItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link era.foss.erf.Content} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContentItemProvider contentItemProvider;

    /**
     * This creates an adapter for a {@link era.foss.erf.Content}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createContentAdapter() {
        if( contentItemProvider == null ) {
            contentItemProvider = new ContentItemProvider( this );
        }

        return contentItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link era.foss.erf.SpecRelation} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SpecRelationItemProvider specRelationItemProvider;

    /**
     * This creates an adapter for a {@link era.foss.erf.SpecRelation}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSpecRelationAdapter() {
        if( specRelationItemProvider == null ) {
            specRelationItemProvider = new SpecRelationItemProvider( this );
        }

        return specRelationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link era.foss.erf.AttributeDefinitionUiProperties} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeDefinitionUiPropertiesItemProvider attributeDefinitionUiPropertiesItemProvider;

    /**
     * This creates an adapter for a {@link era.foss.erf.AttributeDefinitionUiProperties}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createAttributeDefinitionUiPropertiesAdapter() {
        if( attributeDefinitionUiPropertiesItemProvider == null ) {
            attributeDefinitionUiPropertiesItemProvider = new AttributeDefinitionUiPropertiesItemProvider( this );
        }

        return attributeDefinitionUiPropertiesItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link era.foss.erf.EmbeddedValue} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EmbeddedValueItemProvider embeddedValueItemProvider;

    /**
     * This creates an adapter for a {@link era.foss.erf.EmbeddedValue}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createEmbeddedValueAdapter() {
        if( embeddedValueItemProvider == null ) {
            embeddedValueItemProvider = new EmbeddedValueItemProvider( this );
        }

        return embeddedValueItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link era.foss.erf.EnumValue} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EnumValueItemProvider enumValueItemProvider;

    /**
     * This creates an adapter for a {@link era.foss.erf.EnumValue}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createEnumValueAdapter() {
        if( enumValueItemProvider == null ) {
            enumValueItemProvider = new EnumValueItemProvider( this );
        }

        return enumValueItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link era.foss.erf.DatatypeDefinitionEnumeration} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DatatypeDefinitionEnumerationItemProvider datatypeDefinitionEnumerationItemProvider;

    /**
     * This creates an adapter for a {@link era.foss.erf.DatatypeDefinitionEnumeration}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDatatypeDefinitionEnumerationAdapter() {
        if( datatypeDefinitionEnumerationItemProvider == null ) {
            datatypeDefinitionEnumerationItemProvider = new DatatypeDefinitionEnumerationItemProvider( this );
        }

        return datatypeDefinitionEnumerationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link era.foss.erf.AttributeDefinitionEnumeration} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeDefinitionEnumerationItemProvider attributeDefinitionEnumerationItemProvider;

    /**
     * This creates an adapter for a {@link era.foss.erf.AttributeDefinitionEnumeration}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createAttributeDefinitionEnumerationAdapter() {
        if( attributeDefinitionEnumerationItemProvider == null ) {
            attributeDefinitionEnumerationItemProvider = new AttributeDefinitionEnumerationItemProvider( this );
        }

        return attributeDefinitionEnumerationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link era.foss.erf.AttributeValueEnumeration} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeValueEnumerationItemProvider attributeValueEnumerationItemProvider;

    /**
     * This creates an adapter for a {@link era.foss.erf.AttributeValueEnumeration}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createAttributeValueEnumerationAdapter() {
        if( attributeValueEnumerationItemProvider == null ) {
            attributeValueEnumerationItemProvider = new AttributeValueEnumerationItemProvider( this );
        }

        return attributeValueEnumerationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link era.foss.erf.DatatypeDefinitionBoolean} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DatatypeDefinitionBooleanItemProvider datatypeDefinitionBooleanItemProvider;

    /**
     * This creates an adapter for a {@link era.foss.erf.DatatypeDefinitionBoolean}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDatatypeDefinitionBooleanAdapter() {
        if( datatypeDefinitionBooleanItemProvider == null ) {
            datatypeDefinitionBooleanItemProvider = new DatatypeDefinitionBooleanItemProvider( this );
        }

        return datatypeDefinitionBooleanItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link era.foss.erf.AttributeDefinitionBoolean} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeDefinitionBooleanItemProvider attributeDefinitionBooleanItemProvider;

    /**
     * This creates an adapter for a {@link era.foss.erf.AttributeDefinitionBoolean}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createAttributeDefinitionBooleanAdapter() {
        if( attributeDefinitionBooleanItemProvider == null ) {
            attributeDefinitionBooleanItemProvider = new AttributeDefinitionBooleanItemProvider( this );
        }

        return attributeDefinitionBooleanItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link era.foss.erf.AttributeValueBoolean} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeValueBooleanItemProvider attributeValueBooleanItemProvider;

    /**
     * This creates an adapter for a {@link era.foss.erf.AttributeValueBoolean}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createAttributeValueBooleanAdapter() {
        if( attributeValueBooleanItemProvider == null ) {
            attributeValueBooleanItemProvider = new AttributeValueBooleanItemProvider( this );
        }

        return attributeValueBooleanItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link era.foss.erf.ErfToolExtension} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ErfToolExtensionItemProvider erfToolExtensionItemProvider;

    /**
     * This creates an adapter for a {@link era.foss.erf.ErfToolExtension}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createErfToolExtensionAdapter() {
        if( erfToolExtensionItemProvider == null ) {
            erfToolExtensionItemProvider = new ErfToolExtensionItemProvider( this );
        }

        return erfToolExtensionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link era.foss.erf.View} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ViewItemProvider viewItemProvider;

    /**
     * This creates an adapter for a {@link era.foss.erf.View}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createViewAdapter() {
        if( viewItemProvider == null ) {
            viewItemProvider = new ViewItemProvider( this );
        }

        return viewItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link era.foss.erf.ViewElement} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ViewElementItemProvider viewElementItemProvider;

    /**
     * This creates an adapter for a {@link era.foss.erf.ViewElement}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createViewElementAdapter() {
        if( viewElementItemProvider == null ) {
            viewElementItemProvider = new ViewElementItemProvider( this );
        }

        return viewElementItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentAdapterFactory( ComposedAdapterFactory parentAdapterFactory ) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isFactoryForType( Object type ) {
        return supportedTypes.contains( type ) || super.isFactoryForType( type );
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter adapt( Notifier notifier, Object type ) {
        return super.adapt( notifier, this );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object adapt( Object object, Object type ) {
        if( isFactoryForType( type ) ) {
            Object adapter = super.adapt( object, type );
            if( !(type instanceof Class<?>) || (((Class<?>)type).isInstance( adapter )) ) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void addListener( INotifyChangedListener notifyChangedListener ) {
        changeNotifier.addListener( notifyChangedListener );
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void removeListener( INotifyChangedListener notifyChangedListener ) {
        changeNotifier.removeListener( notifyChangedListener );
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void fireNotifyChanged( Notification notification ) {
        changeNotifier.fireNotifyChanged( notification );

        if( parentAdapterFactory != null ) {
            parentAdapterFactory.fireNotifyChanged( notification );
        }
    }

    /**
     * This disposes all of the item providers created by this factory. 
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void dispose() {
        if( specObjectItemProvider != null ) specObjectItemProvider.dispose();
        if( specTypeItemProvider != null ) specTypeItemProvider.dispose();
        if( attributeValueSimpleItemProvider != null ) attributeValueSimpleItemProvider.dispose();
        if( datatypeDefinitionIntegerItemProvider != null ) datatypeDefinitionIntegerItemProvider.dispose();
        if( datatypeDefinitionStringItemProvider != null ) datatypeDefinitionStringItemProvider.dispose();
        if( attributeDefinitionSimpleItemProvider != null ) attributeDefinitionSimpleItemProvider.dispose();
        if( erfItemProvider != null ) erfItemProvider.dispose();
        if( contentItemProvider != null ) contentItemProvider.dispose();
        if( specRelationItemProvider != null ) specRelationItemProvider.dispose();
        if( attributeDefinitionUiPropertiesItemProvider != null ) attributeDefinitionUiPropertiesItemProvider.dispose();
        if( embeddedValueItemProvider != null ) embeddedValueItemProvider.dispose();
        if( enumValueItemProvider != null ) enumValueItemProvider.dispose();
        if( datatypeDefinitionEnumerationItemProvider != null ) datatypeDefinitionEnumerationItemProvider.dispose();
        if( attributeDefinitionEnumerationItemProvider != null ) attributeDefinitionEnumerationItemProvider.dispose();
        if( attributeValueEnumerationItemProvider != null ) attributeValueEnumerationItemProvider.dispose();
        if( datatypeDefinitionBooleanItemProvider != null ) datatypeDefinitionBooleanItemProvider.dispose();
        if( attributeDefinitionBooleanItemProvider != null ) attributeDefinitionBooleanItemProvider.dispose();
        if( attributeValueBooleanItemProvider != null ) attributeValueBooleanItemProvider.dispose();
        if( erfToolExtensionItemProvider != null ) erfToolExtensionItemProvider.dispose();
        if( viewItemProvider != null ) viewItemProvider.dispose();
        if( viewElementItemProvider != null ) viewElementItemProvider.dispose();
    }

}
