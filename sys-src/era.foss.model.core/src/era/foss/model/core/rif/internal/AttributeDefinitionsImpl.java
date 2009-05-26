/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AttributeDefinitions;
import era.foss.model.core.rif.RifPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionsImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionsImpl#getATTRIBUTEDEFINITIONCOMPLEXREF <em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionsImpl#getATTRIBUTEDEFINITIONENUMERATIONREF <em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionsImpl#getATTRIBUTEDEFINITIONSIMPLEREF <em>ATTRIBUTEDEFINITIONSIMPLEREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeDefinitionsImpl extends EObjectImpl implements AttributeDefinitions {
    /**
     * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected int booleans = 0;

    /**
     * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap group;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeDefinitionsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return RifPackage.Literals.ATTRIBUTE_DEFINITIONS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getGroup() {
        if( group == null ) {
            group = new BasicFeatureMap( this, RifPackage.ATTRIBUTE_DEFINITIONS__GROUP );
        }
        return group;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getATTRIBUTEDEFINITIONCOMPLEXREF() {
        return getGroup().list( RifPackage.Literals.ATTRIBUTE_DEFINITIONS__ATTRIBUTEDEFINITIONCOMPLEXREF );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getATTRIBUTEDEFINITIONENUMERATIONREF() {
        return getGroup().list( RifPackage.Literals.ATTRIBUTE_DEFINITIONS__ATTRIBUTEDEFINITIONENUMERATIONREF );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getATTRIBUTEDEFINITIONSIMPLEREF() {
        return getGroup().list( RifPackage.Literals.ATTRIBUTE_DEFINITIONS__ATTRIBUTEDEFINITIONSIMPLEREF );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
        case RifPackage.ATTRIBUTE_DEFINITIONS__GROUP:
            return ((InternalEList)getGroup()).basicRemove( otherEnd, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch (featureID) {
        case RifPackage.ATTRIBUTE_DEFINITIONS__GROUP:
            if( coreType ) return getGroup();
            return ((FeatureMap.Internal)getGroup()).getWrapper();
        case RifPackage.ATTRIBUTE_DEFINITIONS__ATTRIBUTEDEFINITIONCOMPLEXREF:
            return getATTRIBUTEDEFINITIONCOMPLEXREF();
        case RifPackage.ATTRIBUTE_DEFINITIONS__ATTRIBUTEDEFINITIONENUMERATIONREF:
            return getATTRIBUTEDEFINITIONENUMERATIONREF();
        case RifPackage.ATTRIBUTE_DEFINITIONS__ATTRIBUTEDEFINITIONSIMPLEREF:
            return getATTRIBUTEDEFINITIONSIMPLEREF();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eSet( int featureID, Object newValue ) {
        switch (featureID) {
        case RifPackage.ATTRIBUTE_DEFINITIONS__GROUP:
            ((FeatureMap.Internal)getGroup()).set( newValue );
            return;
        case RifPackage.ATTRIBUTE_DEFINITIONS__ATTRIBUTEDEFINITIONCOMPLEXREF:
            getATTRIBUTEDEFINITIONCOMPLEXREF().clear();
            getATTRIBUTEDEFINITIONCOMPLEXREF().addAll( (Collection)newValue );
            return;
        case RifPackage.ATTRIBUTE_DEFINITIONS__ATTRIBUTEDEFINITIONENUMERATIONREF:
            getATTRIBUTEDEFINITIONENUMERATIONREF().clear();
            getATTRIBUTEDEFINITIONENUMERATIONREF().addAll( (Collection)newValue );
            return;
        case RifPackage.ATTRIBUTE_DEFINITIONS__ATTRIBUTEDEFINITIONSIMPLEREF:
            getATTRIBUTEDEFINITIONSIMPLEREF().clear();
            getATTRIBUTEDEFINITIONSIMPLEREF().addAll( (Collection)newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eUnset( int featureID ) {
        switch (featureID) {
        case RifPackage.ATTRIBUTE_DEFINITIONS__GROUP:
            getGroup().clear();
            return;
        case RifPackage.ATTRIBUTE_DEFINITIONS__ATTRIBUTEDEFINITIONCOMPLEXREF:
            getATTRIBUTEDEFINITIONCOMPLEXREF().clear();
            return;
        case RifPackage.ATTRIBUTE_DEFINITIONS__ATTRIBUTEDEFINITIONENUMERATIONREF:
            getATTRIBUTEDEFINITIONENUMERATIONREF().clear();
            return;
        case RifPackage.ATTRIBUTE_DEFINITIONS__ATTRIBUTEDEFINITIONSIMPLEREF:
            getATTRIBUTEDEFINITIONSIMPLEREF().clear();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean eIsSet( int featureID ) {
        switch (featureID) {
        case RifPackage.ATTRIBUTE_DEFINITIONS__GROUP:
            return group != null && !group.isEmpty();
        case RifPackage.ATTRIBUTE_DEFINITIONS__ATTRIBUTEDEFINITIONCOMPLEXREF:
            return !getATTRIBUTEDEFINITIONCOMPLEXREF().isEmpty();
        case RifPackage.ATTRIBUTE_DEFINITIONS__ATTRIBUTEDEFINITIONENUMERATIONREF:
            return !getATTRIBUTEDEFINITIONENUMERATIONREF().isEmpty();
        case RifPackage.ATTRIBUTE_DEFINITIONS__ATTRIBUTEDEFINITIONSIMPLEREF:
            return !getATTRIBUTEDEFINITIONSIMPLEREF().isEmpty();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (group: " );
        result.append( group );
        result.append( ')' );
        return result.toString();
    }

} //AttributeDefinitionsImpl
