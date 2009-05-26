/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.DatatypeDefinitions;
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
 * An implementation of the model object '<em><b>Datatype Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionsImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionsImpl#getDATATYPEDEFINITIONBINARYFILEREF <em>DATATYPEDEFINITIONBINARYFILEREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionsImpl#getDATATYPEDEFINITIONBOOLEANREF <em>DATATYPEDEFINITIONBOOLEANREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionsImpl#getDATATYPEDEFINITIONDOCUMENTREF <em>DATATYPEDEFINITIONDOCUMENTREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionsImpl#getDATATYPEDEFINITIONENUMERATIONREF <em>DATATYPEDEFINITIONENUMERATIONREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionsImpl#getDATATYPEDEFINITIONINTEGERREF <em>DATATYPEDEFINITIONINTEGERREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionsImpl#getDATATYPEDEFINITIONREALREF <em>DATATYPEDEFINITIONREALREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionsImpl#getDATATYPEDEFINITIONSTRINGREF <em>DATATYPEDEFINITIONSTRINGREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionsImpl#getDATATYPEDEFINITIONXMLDATAREF <em>DATATYPEDEFINITIONXMLDATAREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatatypeDefinitionsImpl extends EObjectImpl implements DatatypeDefinitions {
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
    protected DatatypeDefinitionsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return RifPackage.Literals.DATATYPE_DEFINITIONS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getGroup() {
        if( group == null ) {
            group = new BasicFeatureMap( this, RifPackage.DATATYPE_DEFINITIONS__GROUP );
        }
        return group;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getDATATYPEDEFINITIONBINARYFILEREF() {
        return getGroup().list( RifPackage.Literals.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONBINARYFILEREF );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getDATATYPEDEFINITIONBOOLEANREF() {
        return getGroup().list( RifPackage.Literals.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONBOOLEANREF );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getDATATYPEDEFINITIONDOCUMENTREF() {
        return getGroup().list( RifPackage.Literals.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONDOCUMENTREF );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getDATATYPEDEFINITIONENUMERATIONREF() {
        return getGroup().list( RifPackage.Literals.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONENUMERATIONREF );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getDATATYPEDEFINITIONINTEGERREF() {
        return getGroup().list( RifPackage.Literals.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONINTEGERREF );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getDATATYPEDEFINITIONREALREF() {
        return getGroup().list( RifPackage.Literals.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONREALREF );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getDATATYPEDEFINITIONSTRINGREF() {
        return getGroup().list( RifPackage.Literals.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONSTRINGREF );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getDATATYPEDEFINITIONXMLDATAREF() {
        return getGroup().list( RifPackage.Literals.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONXMLDATAREF );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
        case RifPackage.DATATYPE_DEFINITIONS__GROUP:
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
        case RifPackage.DATATYPE_DEFINITIONS__GROUP:
            if( coreType ) return getGroup();
            return ((FeatureMap.Internal)getGroup()).getWrapper();
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONBINARYFILEREF:
            return getDATATYPEDEFINITIONBINARYFILEREF();
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONBOOLEANREF:
            return getDATATYPEDEFINITIONBOOLEANREF();
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONDOCUMENTREF:
            return getDATATYPEDEFINITIONDOCUMENTREF();
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONENUMERATIONREF:
            return getDATATYPEDEFINITIONENUMERATIONREF();
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONINTEGERREF:
            return getDATATYPEDEFINITIONINTEGERREF();
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONREALREF:
            return getDATATYPEDEFINITIONREALREF();
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONSTRINGREF:
            return getDATATYPEDEFINITIONSTRINGREF();
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONXMLDATAREF:
            return getDATATYPEDEFINITIONXMLDATAREF();
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
        case RifPackage.DATATYPE_DEFINITIONS__GROUP:
            ((FeatureMap.Internal)getGroup()).set( newValue );
            return;
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONBINARYFILEREF:
            getDATATYPEDEFINITIONBINARYFILEREF().clear();
            getDATATYPEDEFINITIONBINARYFILEREF().addAll( (Collection)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONBOOLEANREF:
            getDATATYPEDEFINITIONBOOLEANREF().clear();
            getDATATYPEDEFINITIONBOOLEANREF().addAll( (Collection)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONDOCUMENTREF:
            getDATATYPEDEFINITIONDOCUMENTREF().clear();
            getDATATYPEDEFINITIONDOCUMENTREF().addAll( (Collection)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONENUMERATIONREF:
            getDATATYPEDEFINITIONENUMERATIONREF().clear();
            getDATATYPEDEFINITIONENUMERATIONREF().addAll( (Collection)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONINTEGERREF:
            getDATATYPEDEFINITIONINTEGERREF().clear();
            getDATATYPEDEFINITIONINTEGERREF().addAll( (Collection)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONREALREF:
            getDATATYPEDEFINITIONREALREF().clear();
            getDATATYPEDEFINITIONREALREF().addAll( (Collection)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONSTRINGREF:
            getDATATYPEDEFINITIONSTRINGREF().clear();
            getDATATYPEDEFINITIONSTRINGREF().addAll( (Collection)newValue );
            return;
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONXMLDATAREF:
            getDATATYPEDEFINITIONXMLDATAREF().clear();
            getDATATYPEDEFINITIONXMLDATAREF().addAll( (Collection)newValue );
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
        case RifPackage.DATATYPE_DEFINITIONS__GROUP:
            getGroup().clear();
            return;
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONBINARYFILEREF:
            getDATATYPEDEFINITIONBINARYFILEREF().clear();
            return;
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONBOOLEANREF:
            getDATATYPEDEFINITIONBOOLEANREF().clear();
            return;
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONDOCUMENTREF:
            getDATATYPEDEFINITIONDOCUMENTREF().clear();
            return;
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONENUMERATIONREF:
            getDATATYPEDEFINITIONENUMERATIONREF().clear();
            return;
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONINTEGERREF:
            getDATATYPEDEFINITIONINTEGERREF().clear();
            return;
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONREALREF:
            getDATATYPEDEFINITIONREALREF().clear();
            return;
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONSTRINGREF:
            getDATATYPEDEFINITIONSTRINGREF().clear();
            return;
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONXMLDATAREF:
            getDATATYPEDEFINITIONXMLDATAREF().clear();
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
        case RifPackage.DATATYPE_DEFINITIONS__GROUP:
            return group != null && !group.isEmpty();
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONBINARYFILEREF:
            return !getDATATYPEDEFINITIONBINARYFILEREF().isEmpty();
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONBOOLEANREF:
            return !getDATATYPEDEFINITIONBOOLEANREF().isEmpty();
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONDOCUMENTREF:
            return !getDATATYPEDEFINITIONDOCUMENTREF().isEmpty();
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONENUMERATIONREF:
            return !getDATATYPEDEFINITIONENUMERATIONREF().isEmpty();
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONINTEGERREF:
            return !getDATATYPEDEFINITIONINTEGERREF().isEmpty();
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONREALREF:
            return !getDATATYPEDEFINITIONREALREF().isEmpty();
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONSTRINGREF:
            return !getDATATYPEDEFINITIONSTRINGREF().isEmpty();
        case RifPackage.DATATYPE_DEFINITIONS__DATATYPEDEFINITIONXMLDATAREF:
            return !getDATATYPEDEFINITIONXMLDATAREF().isEmpty();
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

} //DatatypeDefinitionsImpl
