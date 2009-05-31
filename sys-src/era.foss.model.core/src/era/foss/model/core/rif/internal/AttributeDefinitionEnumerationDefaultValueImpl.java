/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AttributeDefinitionEnumerationDefaultValue;
import era.foss.model.core.rif.AttributeValueEnumeration;
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
 * An implementation of the model object '<em><b>Attribute Definition Enumeration Default Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionEnumerationDefaultValueImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionEnumerationDefaultValueImpl#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeDefinitionEnumerationDefaultValueImpl extends EObjectImpl
		implements AttributeDefinitionEnumerationDefaultValue {
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
	protected AttributeDefinitionEnumerationDefaultValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.ATTRIBUTE_DEFINITION_ENUMERATION_DEFAULT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(
					this,
					RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION_DEFAULT_VALUE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeValueEnumeration> getATTRIBUTEVALUEENUMERATION() {
		return getGroup()
				.list(
						RifPackage.Literals.ATTRIBUTE_DEFINITION_ENUMERATION_DEFAULT_VALUE__ATTRIBUTEVALUEENUMERATION);
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
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION_DEFAULT_VALUE__GROUP:
			return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION_DEFAULT_VALUE__ATTRIBUTEVALUEENUMERATION:
			return ((InternalEList<?>) getATTRIBUTEVALUEENUMERATION())
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
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION_DEFAULT_VALUE__GROUP:
			if (coreType)
				return getGroup();
			return ((FeatureMap.Internal) getGroup()).getWrapper();
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION_DEFAULT_VALUE__ATTRIBUTEVALUEENUMERATION:
			return getATTRIBUTEVALUEENUMERATION();
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
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION_DEFAULT_VALUE__GROUP:
			((FeatureMap.Internal) getGroup()).set(newValue);
			return;
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION_DEFAULT_VALUE__ATTRIBUTEVALUEENUMERATION:
			getATTRIBUTEVALUEENUMERATION().clear();
			getATTRIBUTEVALUEENUMERATION().addAll(
					(Collection<? extends AttributeValueEnumeration>) newValue);
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
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION_DEFAULT_VALUE__GROUP:
			getGroup().clear();
			return;
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION_DEFAULT_VALUE__ATTRIBUTEVALUEENUMERATION:
			getATTRIBUTEVALUEENUMERATION().clear();
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
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION_DEFAULT_VALUE__GROUP:
			return group != null && !group.isEmpty();
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION_DEFAULT_VALUE__ATTRIBUTEVALUEENUMERATION:
			return !getATTRIBUTEVALUEENUMERATION().isEmpty();
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

} //AttributeDefinitionEnumerationDefaultValueImpl
