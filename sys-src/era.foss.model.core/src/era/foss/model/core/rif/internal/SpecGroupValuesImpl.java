/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.RifPackage;
import era.foss.model.core.rif.SpecGroupValues;

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
 * An implementation of the model object '<em><b>Spec Group Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.SpecGroupValuesImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecGroupValuesImpl#getATTRIBUTEVALUEEMBEDDEDDOCUMENT <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecGroupValuesImpl#getATTRIBUTEVALUEEMBEDDEDFILE <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecGroupValuesImpl#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecGroupValuesImpl#getATTRIBUTEVALUEFILEREFERENCE <em>ATTRIBUTEVALUEFILEREFERENCE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecGroupValuesImpl#getATTRIBUTEVALUESIMPLE <em>ATTRIBUTEVALUESIMPLE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecGroupValuesImpl#getATTRIBUTEVALUEXMLDATA <em>ATTRIBUTEVALUEXMLDATA</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecGroupValuesImpl extends EObjectImpl implements SpecGroupValues {
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
    protected SpecGroupValuesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return RifPackage.Literals.SPEC_GROUP_VALUES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getGroup() {
        if( group == null ) {
            group = new BasicFeatureMap( this, RifPackage.SPEC_GROUP_VALUES__GROUP );
        }
        return group;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getATTRIBUTEVALUEEMBEDDEDDOCUMENT() {
        return getGroup().list( RifPackage.Literals.SPEC_GROUP_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENT );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getATTRIBUTEVALUEEMBEDDEDFILE() {
        return getGroup().list( RifPackage.Literals.SPEC_GROUP_VALUES__ATTRIBUTEVALUEEMBEDDEDFILE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getATTRIBUTEVALUEENUMERATION() {
        return getGroup().list( RifPackage.Literals.SPEC_GROUP_VALUES__ATTRIBUTEVALUEENUMERATION );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getATTRIBUTEVALUEFILEREFERENCE() {
        return getGroup().list( RifPackage.Literals.SPEC_GROUP_VALUES__ATTRIBUTEVALUEFILEREFERENCE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getATTRIBUTEVALUESIMPLE() {
        return getGroup().list( RifPackage.Literals.SPEC_GROUP_VALUES__ATTRIBUTEVALUESIMPLE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getATTRIBUTEVALUEXMLDATA() {
        return getGroup().list( RifPackage.Literals.SPEC_GROUP_VALUES__ATTRIBUTEVALUEXMLDATA );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
        case RifPackage.SPEC_GROUP_VALUES__GROUP:
            return ((InternalEList)getGroup()).basicRemove( otherEnd, msgs );
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
            return ((InternalEList)getATTRIBUTEVALUEEMBEDDEDDOCUMENT()).basicRemove( otherEnd, msgs );
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUEEMBEDDEDFILE:
            return ((InternalEList)getATTRIBUTEVALUEEMBEDDEDFILE()).basicRemove( otherEnd, msgs );
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUEENUMERATION:
            return ((InternalEList)getATTRIBUTEVALUEENUMERATION()).basicRemove( otherEnd, msgs );
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUEFILEREFERENCE:
            return ((InternalEList)getATTRIBUTEVALUEFILEREFERENCE()).basicRemove( otherEnd, msgs );
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUESIMPLE:
            return ((InternalEList)getATTRIBUTEVALUESIMPLE()).basicRemove( otherEnd, msgs );
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUEXMLDATA:
            return ((InternalEList)getATTRIBUTEVALUEXMLDATA()).basicRemove( otherEnd, msgs );
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
        case RifPackage.SPEC_GROUP_VALUES__GROUP:
            if( coreType ) return getGroup();
            return ((FeatureMap.Internal)getGroup()).getWrapper();
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
            return getATTRIBUTEVALUEEMBEDDEDDOCUMENT();
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUEEMBEDDEDFILE:
            return getATTRIBUTEVALUEEMBEDDEDFILE();
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUEENUMERATION:
            return getATTRIBUTEVALUEENUMERATION();
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUEFILEREFERENCE:
            return getATTRIBUTEVALUEFILEREFERENCE();
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUESIMPLE:
            return getATTRIBUTEVALUESIMPLE();
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUEXMLDATA:
            return getATTRIBUTEVALUEXMLDATA();
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
        case RifPackage.SPEC_GROUP_VALUES__GROUP:
            ((FeatureMap.Internal)getGroup()).set( newValue );
            return;
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
            getATTRIBUTEVALUEEMBEDDEDDOCUMENT().clear();
            getATTRIBUTEVALUEEMBEDDEDDOCUMENT().addAll( (Collection)newValue );
            return;
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUEEMBEDDEDFILE:
            getATTRIBUTEVALUEEMBEDDEDFILE().clear();
            getATTRIBUTEVALUEEMBEDDEDFILE().addAll( (Collection)newValue );
            return;
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUEENUMERATION:
            getATTRIBUTEVALUEENUMERATION().clear();
            getATTRIBUTEVALUEENUMERATION().addAll( (Collection)newValue );
            return;
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUEFILEREFERENCE:
            getATTRIBUTEVALUEFILEREFERENCE().clear();
            getATTRIBUTEVALUEFILEREFERENCE().addAll( (Collection)newValue );
            return;
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUESIMPLE:
            getATTRIBUTEVALUESIMPLE().clear();
            getATTRIBUTEVALUESIMPLE().addAll( (Collection)newValue );
            return;
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUEXMLDATA:
            getATTRIBUTEVALUEXMLDATA().clear();
            getATTRIBUTEVALUEXMLDATA().addAll( (Collection)newValue );
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
        case RifPackage.SPEC_GROUP_VALUES__GROUP:
            getGroup().clear();
            return;
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
            getATTRIBUTEVALUEEMBEDDEDDOCUMENT().clear();
            return;
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUEEMBEDDEDFILE:
            getATTRIBUTEVALUEEMBEDDEDFILE().clear();
            return;
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUEENUMERATION:
            getATTRIBUTEVALUEENUMERATION().clear();
            return;
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUEFILEREFERENCE:
            getATTRIBUTEVALUEFILEREFERENCE().clear();
            return;
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUESIMPLE:
            getATTRIBUTEVALUESIMPLE().clear();
            return;
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUEXMLDATA:
            getATTRIBUTEVALUEXMLDATA().clear();
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
        case RifPackage.SPEC_GROUP_VALUES__GROUP:
            return group != null && !group.isEmpty();
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
            return !getATTRIBUTEVALUEEMBEDDEDDOCUMENT().isEmpty();
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUEEMBEDDEDFILE:
            return !getATTRIBUTEVALUEEMBEDDEDFILE().isEmpty();
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUEENUMERATION:
            return !getATTRIBUTEVALUEENUMERATION().isEmpty();
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUEFILEREFERENCE:
            return !getATTRIBUTEVALUEFILEREFERENCE().isEmpty();
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUESIMPLE:
            return !getATTRIBUTEVALUESIMPLE().isEmpty();
        case RifPackage.SPEC_GROUP_VALUES__ATTRIBUTEVALUEXMLDATA:
            return !getATTRIBUTEVALUEXMLDATA().isEmpty();
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

} //SpecGroupValuesImpl
