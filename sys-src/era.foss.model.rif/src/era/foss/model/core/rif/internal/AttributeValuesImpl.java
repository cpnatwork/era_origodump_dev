/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AttributeValues;
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
 * An implementation of the model object '<em><b>Attribute Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValuesImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValuesImpl#getATTRIBUTEVALUEEMBEDDEDDOCUMENTREF <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValuesImpl#getATTRIBUTEVALUEEMBEDDEDFILEREF <em>ATTRIBUTEVALUEEMBEDDEDFILEREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValuesImpl#getATTRIBUTEVALUEENUMERATIONREF <em>ATTRIBUTEVALUEENUMERATIONREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValuesImpl#getATTRIBUTEVALUEFILEREFERENCEREF <em>ATTRIBUTEVALUEFILEREFERENCEREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValuesImpl#getATTRIBUTEVALUESIMPLEREF <em>ATTRIBUTEVALUESIMPLEREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValuesImpl#getATTRIBUTEVALUEXMLDATAREF <em>ATTRIBUTEVALUEXMLDATAREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeValuesImpl extends EObjectImpl implements AttributeValues {
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
	protected AttributeValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.ATTRIBUTE_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this,
					RifPackage.ATTRIBUTE_VALUES__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getATTRIBUTEVALUEEMBEDDEDDOCUMENTREF() {
		return getGroup()
				.list(
						RifPackage.Literals.ATTRIBUTE_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getATTRIBUTEVALUEEMBEDDEDFILEREF() {
		return getGroup()
				.list(
						RifPackage.Literals.ATTRIBUTE_VALUES__ATTRIBUTEVALUEEMBEDDEDFILEREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getATTRIBUTEVALUEENUMERATIONREF() {
		return getGroup()
				.list(
						RifPackage.Literals.ATTRIBUTE_VALUES__ATTRIBUTEVALUEENUMERATIONREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getATTRIBUTEVALUEFILEREFERENCEREF() {
		return getGroup()
				.list(
						RifPackage.Literals.ATTRIBUTE_VALUES__ATTRIBUTEVALUEFILEREFERENCEREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getATTRIBUTEVALUESIMPLEREF() {
		return getGroup().list(
				RifPackage.Literals.ATTRIBUTE_VALUES__ATTRIBUTEVALUESIMPLEREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getATTRIBUTEVALUEXMLDATAREF() {
		return getGroup().list(
				RifPackage.Literals.ATTRIBUTE_VALUES__ATTRIBUTEVALUEXMLDATAREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RifPackage.ATTRIBUTE_VALUES__GROUP:
			return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RifPackage.ATTRIBUTE_VALUES__GROUP:
			if (coreType)
				return getGroup();
			return ((FeatureMap.Internal) getGroup()).getWrapper();
		case RifPackage.ATTRIBUTE_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF:
			return getATTRIBUTEVALUEEMBEDDEDDOCUMENTREF();
		case RifPackage.ATTRIBUTE_VALUES__ATTRIBUTEVALUEEMBEDDEDFILEREF:
			return getATTRIBUTEVALUEEMBEDDEDFILEREF();
		case RifPackage.ATTRIBUTE_VALUES__ATTRIBUTEVALUEENUMERATIONREF:
			return getATTRIBUTEVALUEENUMERATIONREF();
		case RifPackage.ATTRIBUTE_VALUES__ATTRIBUTEVALUEFILEREFERENCEREF:
			return getATTRIBUTEVALUEFILEREFERENCEREF();
		case RifPackage.ATTRIBUTE_VALUES__ATTRIBUTEVALUESIMPLEREF:
			return getATTRIBUTEVALUESIMPLEREF();
		case RifPackage.ATTRIBUTE_VALUES__ATTRIBUTEVALUEXMLDATAREF:
			return getATTRIBUTEVALUEXMLDATAREF();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RifPackage.ATTRIBUTE_VALUES__GROUP:
			((FeatureMap.Internal) getGroup()).set(newValue);
			return;
		case RifPackage.ATTRIBUTE_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF:
			getATTRIBUTEVALUEEMBEDDEDDOCUMENTREF().clear();
			getATTRIBUTEVALUEEMBEDDEDDOCUMENTREF().addAll(
					(Collection<? extends String>) newValue);
			return;
		case RifPackage.ATTRIBUTE_VALUES__ATTRIBUTEVALUEEMBEDDEDFILEREF:
			getATTRIBUTEVALUEEMBEDDEDFILEREF().clear();
			getATTRIBUTEVALUEEMBEDDEDFILEREF().addAll(
					(Collection<? extends String>) newValue);
			return;
		case RifPackage.ATTRIBUTE_VALUES__ATTRIBUTEVALUEENUMERATIONREF:
			getATTRIBUTEVALUEENUMERATIONREF().clear();
			getATTRIBUTEVALUEENUMERATIONREF().addAll(
					(Collection<? extends String>) newValue);
			return;
		case RifPackage.ATTRIBUTE_VALUES__ATTRIBUTEVALUEFILEREFERENCEREF:
			getATTRIBUTEVALUEFILEREFERENCEREF().clear();
			getATTRIBUTEVALUEFILEREFERENCEREF().addAll(
					(Collection<? extends String>) newValue);
			return;
		case RifPackage.ATTRIBUTE_VALUES__ATTRIBUTEVALUESIMPLEREF:
			getATTRIBUTEVALUESIMPLEREF().clear();
			getATTRIBUTEVALUESIMPLEREF().addAll(
					(Collection<? extends String>) newValue);
			return;
		case RifPackage.ATTRIBUTE_VALUES__ATTRIBUTEVALUEXMLDATAREF:
			getATTRIBUTEVALUEXMLDATAREF().clear();
			getATTRIBUTEVALUEXMLDATAREF().addAll(
					(Collection<? extends String>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RifPackage.ATTRIBUTE_VALUES__GROUP:
			getGroup().clear();
			return;
		case RifPackage.ATTRIBUTE_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF:
			getATTRIBUTEVALUEEMBEDDEDDOCUMENTREF().clear();
			return;
		case RifPackage.ATTRIBUTE_VALUES__ATTRIBUTEVALUEEMBEDDEDFILEREF:
			getATTRIBUTEVALUEEMBEDDEDFILEREF().clear();
			return;
		case RifPackage.ATTRIBUTE_VALUES__ATTRIBUTEVALUEENUMERATIONREF:
			getATTRIBUTEVALUEENUMERATIONREF().clear();
			return;
		case RifPackage.ATTRIBUTE_VALUES__ATTRIBUTEVALUEFILEREFERENCEREF:
			getATTRIBUTEVALUEFILEREFERENCEREF().clear();
			return;
		case RifPackage.ATTRIBUTE_VALUES__ATTRIBUTEVALUESIMPLEREF:
			getATTRIBUTEVALUESIMPLEREF().clear();
			return;
		case RifPackage.ATTRIBUTE_VALUES__ATTRIBUTEVALUEXMLDATAREF:
			getATTRIBUTEVALUEXMLDATAREF().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RifPackage.ATTRIBUTE_VALUES__GROUP:
			return group != null && !group.isEmpty();
		case RifPackage.ATTRIBUTE_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF:
			return !getATTRIBUTEVALUEEMBEDDEDDOCUMENTREF().isEmpty();
		case RifPackage.ATTRIBUTE_VALUES__ATTRIBUTEVALUEEMBEDDEDFILEREF:
			return !getATTRIBUTEVALUEEMBEDDEDFILEREF().isEmpty();
		case RifPackage.ATTRIBUTE_VALUES__ATTRIBUTEVALUEENUMERATIONREF:
			return !getATTRIBUTEVALUEENUMERATIONREF().isEmpty();
		case RifPackage.ATTRIBUTE_VALUES__ATTRIBUTEVALUEFILEREFERENCEREF:
			return !getATTRIBUTEVALUEFILEREFERENCEREF().isEmpty();
		case RifPackage.ATTRIBUTE_VALUES__ATTRIBUTEVALUESIMPLEREF:
			return !getATTRIBUTEVALUESIMPLEREF().isEmpty();
		case RifPackage.ATTRIBUTE_VALUES__ATTRIBUTEVALUEXMLDATAREF:
			return !getATTRIBUTEVALUEXMLDATAREF().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: "); //$NON-NLS-1$
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //AttributeValuesImpl
