/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AttributeDefinitionComplexDefaultValue;
import era.foss.model.core.rif.AttributeValueXmlData;
import era.foss.model.core.rif.RifPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Definition Complex Default Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionComplexDefaultValueImpl#getATTRIBUTEVALUEXMLDATA <em>ATTRIBUTEVALUEXMLDATA</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeDefinitionComplexDefaultValueImpl extends EObjectImpl
		implements AttributeDefinitionComplexDefaultValue {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int booleans = 0;

	/**
	 * The cached value of the '{@link #getATTRIBUTEVALUEXMLDATA() <em>ATTRIBUTEVALUEXMLDATA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEVALUEXMLDATA()
	 * @generated
	 * @ordered
	 */
	protected AttributeValueXmlData aTTRIBUTEVALUEXMLDATA;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDefinitionComplexDefaultValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.ATTRIBUTE_DEFINITION_COMPLEX_DEFAULT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueXmlData getATTRIBUTEVALUEXMLDATA() {
		return aTTRIBUTEVALUEXMLDATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetATTRIBUTEVALUEXMLDATA(
			AttributeValueXmlData newATTRIBUTEVALUEXMLDATA,
			NotificationChain msgs) {
		AttributeValueXmlData oldATTRIBUTEVALUEXMLDATA = aTTRIBUTEVALUEXMLDATA;
		aTTRIBUTEVALUEXMLDATA = newATTRIBUTEVALUEXMLDATA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_DEFAULT_VALUE__ATTRIBUTEVALUEXMLDATA,
					oldATTRIBUTEVALUEXMLDATA, newATTRIBUTEVALUEXMLDATA);
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
	public void setATTRIBUTEVALUEXMLDATA(
			AttributeValueXmlData newATTRIBUTEVALUEXMLDATA) {
		if (newATTRIBUTEVALUEXMLDATA != aTTRIBUTEVALUEXMLDATA) {
			NotificationChain msgs = null;
			if (aTTRIBUTEVALUEXMLDATA != null)
				msgs = ((InternalEObject) aTTRIBUTEVALUEXMLDATA)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_DEFAULT_VALUE__ATTRIBUTEVALUEXMLDATA,
								null, msgs);
			if (newATTRIBUTEVALUEXMLDATA != null)
				msgs = ((InternalEObject) newATTRIBUTEVALUEXMLDATA)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_DEFAULT_VALUE__ATTRIBUTEVALUEXMLDATA,
								null, msgs);
			msgs = basicSetATTRIBUTEVALUEXMLDATA(newATTRIBUTEVALUEXMLDATA, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_DEFAULT_VALUE__ATTRIBUTEVALUEXMLDATA,
					newATTRIBUTEVALUEXMLDATA, newATTRIBUTEVALUEXMLDATA));
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
		case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_DEFAULT_VALUE__ATTRIBUTEVALUEXMLDATA:
			return basicSetATTRIBUTEVALUEXMLDATA(null, msgs);
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
		case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_DEFAULT_VALUE__ATTRIBUTEVALUEXMLDATA:
			return getATTRIBUTEVALUEXMLDATA();
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
		case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_DEFAULT_VALUE__ATTRIBUTEVALUEXMLDATA:
			setATTRIBUTEVALUEXMLDATA((AttributeValueXmlData) newValue);
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
		case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_DEFAULT_VALUE__ATTRIBUTEVALUEXMLDATA:
			setATTRIBUTEVALUEXMLDATA((AttributeValueXmlData) null);
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
		case RifPackage.ATTRIBUTE_DEFINITION_COMPLEX_DEFAULT_VALUE__ATTRIBUTEVALUEXMLDATA:
			return aTTRIBUTEVALUEXMLDATA != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeDefinitionComplexDefaultValueImpl
