/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AttributeDefinitionEnumeration;
import era.foss.model.core.rif.AttributeDefinitionEnumerationDefaultValue;
import era.foss.model.core.rif.AttributeDefinitionEnumerationType;
import era.foss.model.core.rif.BOOLEAN;
import era.foss.model.core.rif.RifPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Definition Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionEnumerationImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionEnumerationImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionEnumerationImpl#getDEFAULTVALUE <em>DEFAULTVALUE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionEnumerationImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionEnumerationImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionEnumerationImpl#getMULTIVALUED <em>MULTIVALUED</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionEnumerationImpl#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeDefinitionEnumerationImpl extends EObjectImpl implements
		AttributeDefinitionEnumeration {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int booleans = 0;

	/**
	 * The default value of the '{@link #getLONGNAME() <em>LONGNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLONGNAME()
	 * @generated
	 * @ordered
	 */
	protected static final String LONGNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLONGNAME() <em>LONGNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLONGNAME()
	 * @generated
	 * @ordered
	 */
	protected String lONGNAME = LONGNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDESC() <em>DESC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDESC()
	 * @generated
	 * @ordered
	 */
	protected static final String DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDESC() <em>DESC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDESC()
	 * @generated
	 * @ordered
	 */
	protected String dESC = DESC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDEFAULTVALUE() <em>DEFAULTVALUE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDEFAULTVALUE()
	 * @generated
	 * @ordered
	 */
	protected AttributeDefinitionEnumerationDefaultValue dEFAULTVALUE;

	/**
	 * The default value of the '{@link #getIDENTIFIER() <em>IDENTIFIER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDENTIFIER()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIDENTIFIER() <em>IDENTIFIER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDENTIFIER()
	 * @generated
	 * @ordered
	 */
	protected String iDENTIFIER = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLASTCHANGE() <em>LASTCHANGE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLASTCHANGE()
	 * @generated
	 * @ordered
	 */
	protected static final String LASTCHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLASTCHANGE() <em>LASTCHANGE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLASTCHANGE()
	 * @generated
	 * @ordered
	 */
	protected String lASTCHANGE = LASTCHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMULTIVALUED() <em>MULTIVALUED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMULTIVALUED()
	 * @generated
	 * @ordered
	 */
	protected static final BOOLEAN MULTIVALUED_EDEFAULT = BOOLEAN.TRUE;

	/**
	 * The cached value of the '{@link #getMULTIVALUED() <em>MULTIVALUED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMULTIVALUED()
	 * @generated
	 * @ordered
	 */
	protected BOOLEAN mULTIVALUED = MULTIVALUED_EDEFAULT;

	/**
	 * The flag representing whether the MULTIVALUED attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int MULTIVALUED_ESETFLAG = 1 << 0;

	/**
	 * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTYPE()
	 * @generated
	 * @ordered
	 */
	protected AttributeDefinitionEnumerationType tYPE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDefinitionEnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.ATTRIBUTE_DEFINITION_ENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLONGNAME() {
		return lONGNAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLONGNAME(String newLONGNAME) {
		String oldLONGNAME = lONGNAME;
		lONGNAME = newLONGNAME;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__LONGNAME,
					oldLONGNAME, lONGNAME));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDESC() {
		return dESC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDESC(String newDESC) {
		String oldDESC = dESC;
		dESC = newDESC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__DESC, oldDESC,
					dESC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionEnumerationDefaultValue getDEFAULTVALUE() {
		return dEFAULTVALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDEFAULTVALUE(
			AttributeDefinitionEnumerationDefaultValue newDEFAULTVALUE,
			NotificationChain msgs) {
		AttributeDefinitionEnumerationDefaultValue oldDEFAULTVALUE = dEFAULTVALUE;
		dEFAULTVALUE = newDEFAULTVALUE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULTVALUE,
					oldDEFAULTVALUE, newDEFAULTVALUE);
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
	public void setDEFAULTVALUE(
			AttributeDefinitionEnumerationDefaultValue newDEFAULTVALUE) {
		if (newDEFAULTVALUE != dEFAULTVALUE) {
			NotificationChain msgs = null;
			if (dEFAULTVALUE != null)
				msgs = ((InternalEObject) dEFAULTVALUE)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULTVALUE,
								null, msgs);
			if (newDEFAULTVALUE != null)
				msgs = ((InternalEObject) newDEFAULTVALUE)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULTVALUE,
								null, msgs);
			msgs = basicSetDEFAULTVALUE(newDEFAULTVALUE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULTVALUE,
					newDEFAULTVALUE, newDEFAULTVALUE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIDENTIFIER() {
		return iDENTIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIDENTIFIER(String newIDENTIFIER) {
		String oldIDENTIFIER = iDENTIFIER;
		iDENTIFIER = newIDENTIFIER;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__IDENTIFIER,
					oldIDENTIFIER, iDENTIFIER));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLASTCHANGE() {
		return lASTCHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLASTCHANGE(String newLASTCHANGE) {
		String oldLASTCHANGE = lASTCHANGE;
		lASTCHANGE = newLASTCHANGE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__LASTCHANGE,
					oldLASTCHANGE, lASTCHANGE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOOLEAN getMULTIVALUED() {
		return mULTIVALUED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMULTIVALUED(BOOLEAN newMULTIVALUED) {
		BOOLEAN oldMULTIVALUED = mULTIVALUED;
		mULTIVALUED = newMULTIVALUED == null ? MULTIVALUED_EDEFAULT
				: newMULTIVALUED;
		boolean oldMULTIVALUEDESet = (booleans & MULTIVALUED_ESETFLAG) != 0;
		booleans |= MULTIVALUED_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__MULTIVALUED,
					oldMULTIVALUED, mULTIVALUED, !oldMULTIVALUEDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMULTIVALUED() {
		BOOLEAN oldMULTIVALUED = mULTIVALUED;
		boolean oldMULTIVALUEDESet = (booleans & MULTIVALUED_ESETFLAG) != 0;
		mULTIVALUED = MULTIVALUED_EDEFAULT;
		booleans &= ~MULTIVALUED_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__MULTIVALUED,
					oldMULTIVALUED, MULTIVALUED_EDEFAULT, oldMULTIVALUEDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMULTIVALUED() {
		return (booleans & MULTIVALUED_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionEnumerationType getTYPE() {
		return tYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTYPE(
			AttributeDefinitionEnumerationType newTYPE, NotificationChain msgs) {
		AttributeDefinitionEnumerationType oldTYPE = tYPE;
		tYPE = newTYPE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__TYPE, oldTYPE,
					newTYPE);
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
	public void setTYPE(AttributeDefinitionEnumerationType newTYPE) {
		if (newTYPE != tYPE) {
			NotificationChain msgs = null;
			if (tYPE != null)
				msgs = ((InternalEObject) tYPE)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__TYPE,
								null, msgs);
			if (newTYPE != null)
				msgs = ((InternalEObject) newTYPE)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__TYPE,
								null, msgs);
			msgs = basicSetTYPE(newTYPE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__TYPE, newTYPE,
					newTYPE));
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
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULTVALUE:
			return basicSetDEFAULTVALUE(null, msgs);
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__TYPE:
			return basicSetTYPE(null, msgs);
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
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__LONGNAME:
			return getLONGNAME();
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__DESC:
			return getDESC();
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULTVALUE:
			return getDEFAULTVALUE();
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__IDENTIFIER:
			return getIDENTIFIER();
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__LASTCHANGE:
			return getLASTCHANGE();
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__MULTIVALUED:
			return getMULTIVALUED();
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__TYPE:
			return getTYPE();
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
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__LONGNAME:
			setLONGNAME((String) newValue);
			return;
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__DESC:
			setDESC((String) newValue);
			return;
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULTVALUE:
			setDEFAULTVALUE((AttributeDefinitionEnumerationDefaultValue) newValue);
			return;
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__IDENTIFIER:
			setIDENTIFIER((String) newValue);
			return;
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__LASTCHANGE:
			setLASTCHANGE((String) newValue);
			return;
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__MULTIVALUED:
			setMULTIVALUED((BOOLEAN) newValue);
			return;
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__TYPE:
			setTYPE((AttributeDefinitionEnumerationType) newValue);
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
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__LONGNAME:
			setLONGNAME(LONGNAME_EDEFAULT);
			return;
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__DESC:
			setDESC(DESC_EDEFAULT);
			return;
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULTVALUE:
			setDEFAULTVALUE((AttributeDefinitionEnumerationDefaultValue) null);
			return;
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__IDENTIFIER:
			setIDENTIFIER(IDENTIFIER_EDEFAULT);
			return;
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__LASTCHANGE:
			setLASTCHANGE(LASTCHANGE_EDEFAULT);
			return;
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__MULTIVALUED:
			unsetMULTIVALUED();
			return;
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__TYPE:
			setTYPE((AttributeDefinitionEnumerationType) null);
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
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__LONGNAME:
			return LONGNAME_EDEFAULT == null ? lONGNAME != null
					: !LONGNAME_EDEFAULT.equals(lONGNAME);
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__DESC:
			return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT
					.equals(dESC);
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULTVALUE:
			return dEFAULTVALUE != null;
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null
					: !IDENTIFIER_EDEFAULT.equals(iDENTIFIER);
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__LASTCHANGE:
			return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null
					: !LASTCHANGE_EDEFAULT.equals(lASTCHANGE);
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__MULTIVALUED:
			return isSetMULTIVALUED();
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION__TYPE:
			return tYPE != null;
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
		result.append(" (lONGNAME: "); //$NON-NLS-1$
		result.append(lONGNAME);
		result.append(", dESC: "); //$NON-NLS-1$
		result.append(dESC);
		result.append(", iDENTIFIER: "); //$NON-NLS-1$
		result.append(iDENTIFIER);
		result.append(", lASTCHANGE: "); //$NON-NLS-1$
		result.append(lASTCHANGE);
		result.append(", mULTIVALUED: "); //$NON-NLS-1$
		if ((booleans & MULTIVALUED_ESETFLAG) != 0)
			result.append(mULTIVALUED);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //AttributeDefinitionEnumerationImpl
