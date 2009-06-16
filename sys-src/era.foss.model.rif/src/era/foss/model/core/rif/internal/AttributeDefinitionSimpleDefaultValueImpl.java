/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AttributeDefinitionSimpleDefaultValue;
import era.foss.model.core.rif.AttributeValueSimple;
import era.foss.model.core.rif.RifPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Definition Simple Default Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionSimpleDefaultValueImpl#getATTRIBUTEVALUESIMPLE <em>ATTRIBUTEVALUESIMPLE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeDefinitionSimpleDefaultValueImpl extends EObjectImpl
		implements AttributeDefinitionSimpleDefaultValue {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int booleans = 0;

	/**
	 * The cached value of the '{@link #getATTRIBUTEVALUESIMPLE() <em>ATTRIBUTEVALUESIMPLE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEVALUESIMPLE()
	 * @generated
	 * @ordered
	 */
	protected AttributeValueSimple aTTRIBUTEVALUESIMPLE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDefinitionSimpleDefaultValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.ATTRIBUTE_DEFINITION_SIMPLE_DEFAULT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueSimple getATTRIBUTEVALUESIMPLE() {
		return aTTRIBUTEVALUESIMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetATTRIBUTEVALUESIMPLE(
			AttributeValueSimple newATTRIBUTEVALUESIMPLE, NotificationChain msgs) {
		AttributeValueSimple oldATTRIBUTEVALUESIMPLE = aTTRIBUTEVALUESIMPLE;
		aTTRIBUTEVALUESIMPLE = newATTRIBUTEVALUESIMPLE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_DEFAULT_VALUE__ATTRIBUTEVALUESIMPLE,
					oldATTRIBUTEVALUESIMPLE, newATTRIBUTEVALUESIMPLE);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEVALUESIMPLE(
			AttributeValueSimple newATTRIBUTEVALUESIMPLE) {
		if (newATTRIBUTEVALUESIMPLE != aTTRIBUTEVALUESIMPLE) {
			NotificationChain msgs = null;
			if (aTTRIBUTEVALUESIMPLE != null)
				msgs = ((InternalEObject) aTTRIBUTEVALUESIMPLE)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_DEFAULT_VALUE__ATTRIBUTEVALUESIMPLE,
								null, msgs);
			if (newATTRIBUTEVALUESIMPLE != null)
				msgs = ((InternalEObject) newATTRIBUTEVALUESIMPLE)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_DEFAULT_VALUE__ATTRIBUTEVALUESIMPLE,
								null, msgs);
			msgs = basicSetATTRIBUTEVALUESIMPLE(newATTRIBUTEVALUESIMPLE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_DEFAULT_VALUE__ATTRIBUTEVALUESIMPLE,
					newATTRIBUTEVALUESIMPLE, newATTRIBUTEVALUESIMPLE));
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
		case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_DEFAULT_VALUE__ATTRIBUTEVALUESIMPLE:
			return basicSetATTRIBUTEVALUESIMPLE(null, msgs);
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
		case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_DEFAULT_VALUE__ATTRIBUTEVALUESIMPLE:
			return getATTRIBUTEVALUESIMPLE();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_DEFAULT_VALUE__ATTRIBUTEVALUESIMPLE:
			setATTRIBUTEVALUESIMPLE((AttributeValueSimple) newValue);
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
		case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_DEFAULT_VALUE__ATTRIBUTEVALUESIMPLE:
			setATTRIBUTEVALUESIMPLE((AttributeValueSimple) null);
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
		case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_DEFAULT_VALUE__ATTRIBUTEVALUESIMPLE:
			return aTTRIBUTEVALUESIMPLE != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeDefinitionSimpleDefaultValueImpl
