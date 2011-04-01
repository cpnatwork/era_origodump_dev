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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import era.foss.erf.AttributeDefinition;
import era.foss.erf.AttributeDefinitionUiProperties;
import era.foss.erf.DatatypeDefinition;
import era.foss.erf.ErfPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Attribute Definition</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.erf.impl.AttributeDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link era.foss.erf.impl.AttributeDefinitionImpl#isIdent <em>Ident</em>}</li>
 *   <li>{@link era.foss.erf.impl.AttributeDefinitionImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link era.foss.erf.impl.AttributeDefinitionImpl#getUiProperties <em>Ui Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AttributeDefinitionImpl extends IdentifiableImpl implements AttributeDefinition {

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getType()
     * @generated
     * @ordered
     */
    protected DatatypeDefinition type;

    /**
     * The default value of the '{@link #isIdent() <em>Ident</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #isIdent()
     * @generated
     * @ordered
     */
    protected static final boolean IDENT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIdent() <em>Ident</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #isIdent()
     * @generated
     * @ordered
     */
    protected boolean ident = IDENT_EDEFAULT;

    /**
     * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isUnique()
     * @generated
     * @ordered
     */
    protected static final boolean UNIQUE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isUnique()
     * @generated
     * @ordered
     */
    protected boolean unique = UNIQUE_EDEFAULT;

    /**
     * The cached value of the '{@link #getUiProperties() <em>Ui Properties</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getUiProperties()
     * @generated
     * @ordered
     */
    protected AttributeDefinitionUiProperties uiProperties;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @not generated
     */
    protected AttributeDefinitionImpl() {
        super();
        this.uiProperties = new AttributeDefinitionUiPropertiesImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ErfPackage.Literals.ATTRIBUTE_DEFINITION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DatatypeDefinition getType() {
        if( type != null && type.eIsProxy() ) {
            InternalEObject oldType = (InternalEObject)type;
            type = (DatatypeDefinition)eResolveProxy( oldType );
            if( type != oldType ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl(
                    this,
                    Notification.RESOLVE,
                    ErfPackage.ATTRIBUTE_DEFINITION__TYPE,
                    oldType,
                    type ) );
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DatatypeDefinition basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setType( DatatypeDefinition newType ) {
        DatatypeDefinition oldType = type;
        type = newType;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            ErfPackage.ATTRIBUTE_DEFINITION__TYPE,
            oldType,
            type ) );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIdent() {
        return ident;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIdent( boolean newIdent ) {
        boolean oldIdent = ident;
        ident = newIdent;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            ErfPackage.ATTRIBUTE_DEFINITION__IDENT,
            oldIdent,
            ident ) );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isUnique() {
        return unique;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setUnique( boolean newUnique ) {
        boolean oldUnique = unique;
        unique = newUnique;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            ErfPackage.ATTRIBUTE_DEFINITION__UNIQUE,
            oldUnique,
            unique ) );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AttributeDefinitionUiProperties getUiProperties() {
        return uiProperties;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUiProperties( AttributeDefinitionUiProperties newUiProperties,
                                                   NotificationChain msgs ) {
        AttributeDefinitionUiProperties oldUiProperties = uiProperties;
        uiProperties = newUiProperties;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl(
                this,
                Notification.SET,
                ErfPackage.ATTRIBUTE_DEFINITION__UI_PROPERTIES,
                oldUiProperties,
                newUiProperties );
            if( msgs == null ) msgs = notification;
            else msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
        case ErfPackage.ATTRIBUTE_DEFINITION__UI_PROPERTIES:
            return basicSetUiProperties( null, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch (featureID) {
        case ErfPackage.ATTRIBUTE_DEFINITION__TYPE:
            if( resolve ) return getType();
            return basicGetType();
        case ErfPackage.ATTRIBUTE_DEFINITION__IDENT:
            return isIdent();
        case ErfPackage.ATTRIBUTE_DEFINITION__UNIQUE:
            return isUnique();
        case ErfPackage.ATTRIBUTE_DEFINITION__UI_PROPERTIES:
            return getUiProperties();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch (featureID) {
        case ErfPackage.ATTRIBUTE_DEFINITION__TYPE:
            setType( (DatatypeDefinition)newValue );
            return;
        case ErfPackage.ATTRIBUTE_DEFINITION__IDENT:
            setIdent( (Boolean)newValue );
            return;
        case ErfPackage.ATTRIBUTE_DEFINITION__UNIQUE:
            setUnique( (Boolean)newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch (featureID) {
        case ErfPackage.ATTRIBUTE_DEFINITION__TYPE:
            setType( (DatatypeDefinition)null );
            return;
        case ErfPackage.ATTRIBUTE_DEFINITION__IDENT:
            setIdent( IDENT_EDEFAULT );
            return;
        case ErfPackage.ATTRIBUTE_DEFINITION__UNIQUE:
            setUnique( UNIQUE_EDEFAULT );
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch (featureID) {
        case ErfPackage.ATTRIBUTE_DEFINITION__TYPE:
            return type != null;
        case ErfPackage.ATTRIBUTE_DEFINITION__IDENT:
            return ident != IDENT_EDEFAULT;
        case ErfPackage.ATTRIBUTE_DEFINITION__UNIQUE:
            return unique != UNIQUE_EDEFAULT;
        case ErfPackage.ATTRIBUTE_DEFINITION__UI_PROPERTIES:
            return uiProperties != null;
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (ident: " );
        result.append( ident );
        result.append( ", unique: " );
        result.append( unique );
        result.append( ')' );
        return result.toString();
    }

} // AttributeDefinitionImpl
