/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.RifPackage;
import era.foss.model.core.rif.RifSpecHierarchyRoots;
import era.foss.model.core.rif.SpecHierarchyRoot;

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
 * An implementation of the model object '<em><b>Spec Hierarchy Roots</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.RifSpecHierarchyRootsImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.RifSpecHierarchyRootsImpl#getSPECHIERARCHYROOT <em>SPECHIERARCHYROOT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RifSpecHierarchyRootsImpl extends EObjectImpl implements
		RifSpecHierarchyRoots {
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
	protected RifSpecHierarchyRootsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.RIF_SPEC_HIERARCHY_ROOTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this,
					RifPackage.RIF_SPEC_HIERARCHY_ROOTS__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecHierarchyRoot> getSPECHIERARCHYROOT() {
		return getGroup()
				.list(
						RifPackage.Literals.RIF_SPEC_HIERARCHY_ROOTS__SPECHIERARCHYROOT);
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
		case RifPackage.RIF_SPEC_HIERARCHY_ROOTS__GROUP:
			return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
		case RifPackage.RIF_SPEC_HIERARCHY_ROOTS__SPECHIERARCHYROOT:
			return ((InternalEList<?>) getSPECHIERARCHYROOT()).basicRemove(
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
		case RifPackage.RIF_SPEC_HIERARCHY_ROOTS__GROUP:
			if (coreType)
				return getGroup();
			return ((FeatureMap.Internal) getGroup()).getWrapper();
		case RifPackage.RIF_SPEC_HIERARCHY_ROOTS__SPECHIERARCHYROOT:
			return getSPECHIERARCHYROOT();
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
		case RifPackage.RIF_SPEC_HIERARCHY_ROOTS__GROUP:
			((FeatureMap.Internal) getGroup()).set(newValue);
			return;
		case RifPackage.RIF_SPEC_HIERARCHY_ROOTS__SPECHIERARCHYROOT:
			getSPECHIERARCHYROOT().clear();
			getSPECHIERARCHYROOT().addAll(
					(Collection<? extends SpecHierarchyRoot>) newValue);
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
		case RifPackage.RIF_SPEC_HIERARCHY_ROOTS__GROUP:
			getGroup().clear();
			return;
		case RifPackage.RIF_SPEC_HIERARCHY_ROOTS__SPECHIERARCHYROOT:
			getSPECHIERARCHYROOT().clear();
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
		case RifPackage.RIF_SPEC_HIERARCHY_ROOTS__GROUP:
			return group != null && !group.isEmpty();
		case RifPackage.RIF_SPEC_HIERARCHY_ROOTS__SPECHIERARCHYROOT:
			return !getSPECHIERARCHYROOT().isEmpty();
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

} //RifSpecHierarchyRootsImpl
