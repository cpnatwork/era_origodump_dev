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
package era.foss.erf.impl;

import era.foss.erf.AttributeDefinitionSimple;
import era.foss.erf.AttributeValueSimple;
import era.foss.erf.ErfPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Definition Simple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.erf.impl.AttributeDefinitionSimpleImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeDefinitionSimpleImpl extends AttributeDefinitionImpl implements AttributeDefinitionSimple {

    /**
     * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected AttributeValueSimple defaultValue;

    /**
     * This is true if the Default Value containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean defaultValueESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeDefinitionSimpleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ErfPackage.Literals.ATTRIBUTE_DEFINITION_SIMPLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueSimple getDefaultValue() {
        return defaultValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDefaultValue( AttributeValueSimple newDefaultValue, NotificationChain msgs ) {
        AttributeValueSimple oldDefaultValue = defaultValue;
        defaultValue = newDefaultValue;
        boolean oldDefaultValueESet = defaultValueESet;
        defaultValueESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                ErfPackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE,
                oldDefaultValue,
                newDefaultValue,
                !oldDefaultValueESet );
            if( msgs == null ) msgs = notification;
            else msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultValue( AttributeValueSimple newDefaultValue ) {
        if( newDefaultValue != defaultValue ) {
            NotificationChain msgs = null;
            if( defaultValue != null ) msgs = ((InternalEObject)defaultValue).eInverseRemove( this,
                                                                                              EOPPOSITE_FEATURE_BASE
                                                                                                  - ErfPackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE,
                                                                                              null,
                                                                                              msgs );
            if( newDefaultValue != null ) msgs = ((InternalEObject)newDefaultValue).eInverseAdd( this,
                                                                                                 EOPPOSITE_FEATURE_BASE
                                                                                                     - ErfPackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE,
                                                                                                 null,
                                                                                                 msgs );
            msgs = basicSetDefaultValue( newDefaultValue, msgs );
            if( msgs != null ) msgs.dispatch();
        } else {
            boolean oldDefaultValueESet = defaultValueESet;
            defaultValueESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl(
                this,
                Notification.SET,
                ErfPackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE,
                newDefaultValue,
                newDefaultValue,
                !oldDefaultValueESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDefaultValue( NotificationChain msgs ) {
        AttributeValueSimple oldDefaultValue = defaultValue;
        defaultValue = null;
        boolean oldDefaultValueESet = defaultValueESet;
        defaultValueESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.UNSET,
                ErfPackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE,
                oldDefaultValue,
                null,
                oldDefaultValueESet );
            if( msgs == null ) msgs = notification;
            else msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDefaultValue() {
        if( defaultValue != null ) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)defaultValue).eInverseRemove( this, EOPPOSITE_FEATURE_BASE
                - ErfPackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE, null, msgs );
            msgs = basicUnsetDefaultValue( msgs );
            if( msgs != null ) msgs.dispatch();
        } else {
            boolean oldDefaultValueESet = defaultValueESet;
            defaultValueESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl(
                this,
                Notification.UNSET,
                ErfPackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE,
                null,
                null,
                oldDefaultValueESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDefaultValue() {
        return defaultValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
        case ErfPackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE:
            return basicUnsetDefaultValue( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch (featureID) {
        case ErfPackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE:
            return getDefaultValue();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch (featureID) {
        case ErfPackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE:
            setDefaultValue( (AttributeValueSimple)newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch (featureID) {
        case ErfPackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE:
            unsetDefaultValue();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch (featureID) {
        case ErfPackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE:
            return isSetDefaultValue();
        }
        return super.eIsSet( featureID );
    }

} //AttributeDefinitionSimpleImpl
