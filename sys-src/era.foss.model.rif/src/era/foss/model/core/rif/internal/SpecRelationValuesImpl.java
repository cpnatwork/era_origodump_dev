/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AttributeValueEmbeddedDocument;
import era.foss.model.core.rif.AttributeValueEmbeddedFile;
import era.foss.model.core.rif.AttributeValueEnumeration;
import era.foss.model.core.rif.AttributeValueFileReference;
import era.foss.model.core.rif.AttributeValueSimple;
import era.foss.model.core.rif.AttributeValueXmlData;
import era.foss.model.core.rif.RifPackage;
import era.foss.model.core.rif.SpecRelationValues;

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
 * An implementation of the model object '<em><b>Spec Relation Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.SpecRelationValuesImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecRelationValuesImpl#getATTRIBUTEVALUEEMBEDDEDDOCUMENT <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecRelationValuesImpl#getATTRIBUTEVALUEEMBEDDEDFILE <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecRelationValuesImpl#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecRelationValuesImpl#getATTRIBUTEVALUEFILEREFERENCE <em>ATTRIBUTEVALUEFILEREFERENCE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecRelationValuesImpl#getATTRIBUTEVALUESIMPLE <em>ATTRIBUTEVALUESIMPLE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecRelationValuesImpl#getATTRIBUTEVALUEXMLDATA <em>ATTRIBUTEVALUEXMLDATA</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecRelationValuesImpl extends EObjectImpl implements
		SpecRelationValues {
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
	protected SpecRelationValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.SPEC_RELATION_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this,
					RifPackage.SPEC_RELATION_VALUES__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeValueEmbeddedDocument> getATTRIBUTEVALUEEMBEDDEDDOCUMENT() {
		return getGroup()
				.list(
						RifPackage.Literals.SPEC_RELATION_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeValueEmbeddedFile> getATTRIBUTEVALUEEMBEDDEDFILE() {
		return getGroup()
				.list(
						RifPackage.Literals.SPEC_RELATION_VALUES__ATTRIBUTEVALUEEMBEDDEDFILE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeValueEnumeration> getATTRIBUTEVALUEENUMERATION() {
		return getGroup()
				.list(
						RifPackage.Literals.SPEC_RELATION_VALUES__ATTRIBUTEVALUEENUMERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeValueFileReference> getATTRIBUTEVALUEFILEREFERENCE() {
		return getGroup()
				.list(
						RifPackage.Literals.SPEC_RELATION_VALUES__ATTRIBUTEVALUEFILEREFERENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeValueSimple> getATTRIBUTEVALUESIMPLE() {
		return getGroup().list(
				RifPackage.Literals.SPEC_RELATION_VALUES__ATTRIBUTEVALUESIMPLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeValueXmlData> getATTRIBUTEVALUEXMLDATA() {
		return getGroup()
				.list(
						RifPackage.Literals.SPEC_RELATION_VALUES__ATTRIBUTEVALUEXMLDATA);
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
		case RifPackage.SPEC_RELATION_VALUES__GROUP:
			return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
			return ((InternalEList<?>) getATTRIBUTEVALUEEMBEDDEDDOCUMENT())
					.basicRemove(otherEnd, msgs);
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUEEMBEDDEDFILE:
			return ((InternalEList<?>) getATTRIBUTEVALUEEMBEDDEDFILE())
					.basicRemove(otherEnd, msgs);
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUEENUMERATION:
			return ((InternalEList<?>) getATTRIBUTEVALUEENUMERATION())
					.basicRemove(otherEnd, msgs);
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUEFILEREFERENCE:
			return ((InternalEList<?>) getATTRIBUTEVALUEFILEREFERENCE())
					.basicRemove(otherEnd, msgs);
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUESIMPLE:
			return ((InternalEList<?>) getATTRIBUTEVALUESIMPLE()).basicRemove(
					otherEnd, msgs);
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUEXMLDATA:
			return ((InternalEList<?>) getATTRIBUTEVALUEXMLDATA()).basicRemove(
					otherEnd, msgs);
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
		case RifPackage.SPEC_RELATION_VALUES__GROUP:
			if (coreType)
				return getGroup();
			return ((FeatureMap.Internal) getGroup()).getWrapper();
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
			return getATTRIBUTEVALUEEMBEDDEDDOCUMENT();
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUEEMBEDDEDFILE:
			return getATTRIBUTEVALUEEMBEDDEDFILE();
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUEENUMERATION:
			return getATTRIBUTEVALUEENUMERATION();
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUEFILEREFERENCE:
			return getATTRIBUTEVALUEFILEREFERENCE();
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUESIMPLE:
			return getATTRIBUTEVALUESIMPLE();
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUEXMLDATA:
			return getATTRIBUTEVALUEXMLDATA();
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
		case RifPackage.SPEC_RELATION_VALUES__GROUP:
			((FeatureMap.Internal) getGroup()).set(newValue);
			return;
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
			getATTRIBUTEVALUEEMBEDDEDDOCUMENT().clear();
			getATTRIBUTEVALUEEMBEDDEDDOCUMENT()
					.addAll(
							(Collection<? extends AttributeValueEmbeddedDocument>) newValue);
			return;
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUEEMBEDDEDFILE:
			getATTRIBUTEVALUEEMBEDDEDFILE().clear();
			getATTRIBUTEVALUEEMBEDDEDFILE()
					.addAll(
							(Collection<? extends AttributeValueEmbeddedFile>) newValue);
			return;
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUEENUMERATION:
			getATTRIBUTEVALUEENUMERATION().clear();
			getATTRIBUTEVALUEENUMERATION().addAll(
					(Collection<? extends AttributeValueEnumeration>) newValue);
			return;
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUEFILEREFERENCE:
			getATTRIBUTEVALUEFILEREFERENCE().clear();
			getATTRIBUTEVALUEFILEREFERENCE()
					.addAll(
							(Collection<? extends AttributeValueFileReference>) newValue);
			return;
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUESIMPLE:
			getATTRIBUTEVALUESIMPLE().clear();
			getATTRIBUTEVALUESIMPLE().addAll(
					(Collection<? extends AttributeValueSimple>) newValue);
			return;
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUEXMLDATA:
			getATTRIBUTEVALUEXMLDATA().clear();
			getATTRIBUTEVALUEXMLDATA().addAll(
					(Collection<? extends AttributeValueXmlData>) newValue);
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
		case RifPackage.SPEC_RELATION_VALUES__GROUP:
			getGroup().clear();
			return;
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
			getATTRIBUTEVALUEEMBEDDEDDOCUMENT().clear();
			return;
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUEEMBEDDEDFILE:
			getATTRIBUTEVALUEEMBEDDEDFILE().clear();
			return;
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUEENUMERATION:
			getATTRIBUTEVALUEENUMERATION().clear();
			return;
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUEFILEREFERENCE:
			getATTRIBUTEVALUEFILEREFERENCE().clear();
			return;
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUESIMPLE:
			getATTRIBUTEVALUESIMPLE().clear();
			return;
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUEXMLDATA:
			getATTRIBUTEVALUEXMLDATA().clear();
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
		case RifPackage.SPEC_RELATION_VALUES__GROUP:
			return group != null && !group.isEmpty();
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
			return !getATTRIBUTEVALUEEMBEDDEDDOCUMENT().isEmpty();
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUEEMBEDDEDFILE:
			return !getATTRIBUTEVALUEEMBEDDEDFILE().isEmpty();
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUEENUMERATION:
			return !getATTRIBUTEVALUEENUMERATION().isEmpty();
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUEFILEREFERENCE:
			return !getATTRIBUTEVALUEFILEREFERENCE().isEmpty();
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUESIMPLE:
			return !getATTRIBUTEVALUESIMPLE().isEmpty();
		case RifPackage.SPEC_RELATION_VALUES__ATTRIBUTEVALUEXMLDATA:
			return !getATTRIBUTEVALUEXMLDATA().isEmpty();
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

} //SpecRelationValuesImpl
