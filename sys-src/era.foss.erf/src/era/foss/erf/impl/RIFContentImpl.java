/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.erf.impl;

import era.foss.erf.DatatypeDefinition;
import era.foss.erf.RIFContent;
import era.foss.erf.ErfPackage;
import era.foss.erf.SpecObject;
import era.foss.erf.SpecType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERF Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.erf.impl.RIFContentImpl#getSpecObjects <em>Spec Objects</em>}</li>
 *   <li>{@link era.foss.erf.impl.RIFContentImpl#getSpecTypes <em>Spec Types</em>}</li>
 *   <li>{@link era.foss.erf.impl.RIFContentImpl#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RIFContentImpl extends EObjectImpl implements RIFContent {
	/**
	 * The cached value of the '{@link #getSpecObjects() <em>Spec Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecObject> specObjects;

	/**
	 * The cached value of the '{@link #getSpecTypes() <em>Spec Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecType> specTypes;

	/**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DatatypeDefinition> dataTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RIFContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErfPackage.Literals.RIF_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecObject> getSpecObjects() {
		if (specObjects == null) {
			specObjects = new EObjectContainmentEList<SpecObject>(
					SpecObject.class, this,
					ErfPackage.RIF_CONTENT__SPEC_OBJECTS);
		}
		return specObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecType> getSpecTypes() {
		if (specTypes == null) {
			specTypes = new EObjectContainmentEList<SpecType>(SpecType.class,
					this, ErfPackage.RIF_CONTENT__SPEC_TYPES);
		}
		return specTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeDefinition> getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectContainmentEList<DatatypeDefinition>(
					DatatypeDefinition.class, this,
					ErfPackage.RIF_CONTENT__DATA_TYPES);
		}
		return dataTypes;
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
		case ErfPackage.RIF_CONTENT__SPEC_OBJECTS:
			return ((InternalEList<?>) getSpecObjects()).basicRemove(otherEnd,
					msgs);
		case ErfPackage.RIF_CONTENT__SPEC_TYPES:
			return ((InternalEList<?>) getSpecTypes()).basicRemove(otherEnd,
					msgs);
		case ErfPackage.RIF_CONTENT__DATA_TYPES:
			return ((InternalEList<?>) getDataTypes()).basicRemove(otherEnd,
					msgs);
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
		case ErfPackage.RIF_CONTENT__SPEC_OBJECTS:
			return getSpecObjects();
		case ErfPackage.RIF_CONTENT__SPEC_TYPES:
			return getSpecTypes();
		case ErfPackage.RIF_CONTENT__DATA_TYPES:
			return getDataTypes();
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
		case ErfPackage.RIF_CONTENT__SPEC_OBJECTS:
			getSpecObjects().clear();
			getSpecObjects()
					.addAll((Collection<? extends SpecObject>) newValue);
			return;
		case ErfPackage.RIF_CONTENT__SPEC_TYPES:
			getSpecTypes().clear();
			getSpecTypes().addAll((Collection<? extends SpecType>) newValue);
			return;
		case ErfPackage.RIF_CONTENT__DATA_TYPES:
			getDataTypes().clear();
			getDataTypes().addAll(
					(Collection<? extends DatatypeDefinition>) newValue);
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
		case ErfPackage.RIF_CONTENT__SPEC_OBJECTS:
			getSpecObjects().clear();
			return;
		case ErfPackage.RIF_CONTENT__SPEC_TYPES:
			getSpecTypes().clear();
			return;
		case ErfPackage.RIF_CONTENT__DATA_TYPES:
			getDataTypes().clear();
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
		case ErfPackage.RIF_CONTENT__SPEC_OBJECTS:
			return specObjects != null && !specObjects.isEmpty();
		case ErfPackage.RIF_CONTENT__SPEC_TYPES:
			return specTypes != null && !specTypes.isEmpty();
		case ErfPackage.RIF_CONTENT__DATA_TYPES:
			return dataTypes != null && !dataTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RIFContentImpl
