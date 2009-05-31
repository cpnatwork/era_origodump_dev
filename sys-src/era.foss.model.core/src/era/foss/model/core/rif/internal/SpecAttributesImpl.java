/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AttributeDefinitionComplex;
import era.foss.model.core.rif.AttributeDefinitionEnumeration;
import era.foss.model.core.rif.AttributeDefinitionSimple;
import era.foss.model.core.rif.RifPackage;
import era.foss.model.core.rif.SpecAttributes;

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
 * An implementation of the model object '<em><b>Spec Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.SpecAttributesImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecAttributesImpl#getATTRIBUTEDEFINITIONCOMPLEX <em>ATTRIBUTEDEFINITIONCOMPLEX</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecAttributesImpl#getATTRIBUTEDEFINITIONENUMERATION <em>ATTRIBUTEDEFINITIONENUMERATION</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecAttributesImpl#getATTRIBUTEDEFINITIONSIMPLE <em>ATTRIBUTEDEFINITIONSIMPLE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecAttributesImpl extends EObjectImpl implements SpecAttributes {
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
	protected SpecAttributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.SPEC_ATTRIBUTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, RifPackage.SPEC_ATTRIBUTES__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeDefinitionComplex> getATTRIBUTEDEFINITIONCOMPLEX() {
		return getGroup()
				.list(
						RifPackage.Literals.SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONCOMPLEX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeDefinitionEnumeration> getATTRIBUTEDEFINITIONENUMERATION() {
		return getGroup()
				.list(
						RifPackage.Literals.SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONENUMERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeDefinitionSimple> getATTRIBUTEDEFINITIONSIMPLE() {
		return getGroup().list(
				RifPackage.Literals.SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONSIMPLE);
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
		case RifPackage.SPEC_ATTRIBUTES__GROUP:
			return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
		case RifPackage.SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONCOMPLEX:
			return ((InternalEList<?>) getATTRIBUTEDEFINITIONCOMPLEX())
					.basicRemove(otherEnd, msgs);
		case RifPackage.SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONENUMERATION:
			return ((InternalEList<?>) getATTRIBUTEDEFINITIONENUMERATION())
					.basicRemove(otherEnd, msgs);
		case RifPackage.SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONSIMPLE:
			return ((InternalEList<?>) getATTRIBUTEDEFINITIONSIMPLE())
					.basicRemove(otherEnd, msgs);
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
		case RifPackage.SPEC_ATTRIBUTES__GROUP:
			if (coreType)
				return getGroup();
			return ((FeatureMap.Internal) getGroup()).getWrapper();
		case RifPackage.SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONCOMPLEX:
			return getATTRIBUTEDEFINITIONCOMPLEX();
		case RifPackage.SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONENUMERATION:
			return getATTRIBUTEDEFINITIONENUMERATION();
		case RifPackage.SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONSIMPLE:
			return getATTRIBUTEDEFINITIONSIMPLE();
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
		case RifPackage.SPEC_ATTRIBUTES__GROUP:
			((FeatureMap.Internal) getGroup()).set(newValue);
			return;
		case RifPackage.SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONCOMPLEX:
			getATTRIBUTEDEFINITIONCOMPLEX().clear();
			getATTRIBUTEDEFINITIONCOMPLEX()
					.addAll(
							(Collection<? extends AttributeDefinitionComplex>) newValue);
			return;
		case RifPackage.SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONENUMERATION:
			getATTRIBUTEDEFINITIONENUMERATION().clear();
			getATTRIBUTEDEFINITIONENUMERATION()
					.addAll(
							(Collection<? extends AttributeDefinitionEnumeration>) newValue);
			return;
		case RifPackage.SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONSIMPLE:
			getATTRIBUTEDEFINITIONSIMPLE().clear();
			getATTRIBUTEDEFINITIONSIMPLE().addAll(
					(Collection<? extends AttributeDefinitionSimple>) newValue);
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
		case RifPackage.SPEC_ATTRIBUTES__GROUP:
			getGroup().clear();
			return;
		case RifPackage.SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONCOMPLEX:
			getATTRIBUTEDEFINITIONCOMPLEX().clear();
			return;
		case RifPackage.SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONENUMERATION:
			getATTRIBUTEDEFINITIONENUMERATION().clear();
			return;
		case RifPackage.SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONSIMPLE:
			getATTRIBUTEDEFINITIONSIMPLE().clear();
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
		case RifPackage.SPEC_ATTRIBUTES__GROUP:
			return group != null && !group.isEmpty();
		case RifPackage.SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONCOMPLEX:
			return !getATTRIBUTEDEFINITIONCOMPLEX().isEmpty();
		case RifPackage.SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONENUMERATION:
			return !getATTRIBUTEDEFINITIONENUMERATION().isEmpty();
		case RifPackage.SPEC_ATTRIBUTES__ATTRIBUTEDEFINITIONSIMPLE:
			return !getATTRIBUTEDEFINITIONSIMPLE().isEmpty();
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

} //SpecAttributesImpl
