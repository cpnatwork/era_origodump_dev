/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AttributeValueEmbeddedFile;
import era.foss.model.core.rif.AttributeValueEmbeddedFileBinaryContent;
import era.foss.model.core.rif.AttributeValueEmbeddedFileDefinition;
import era.foss.model.core.rif.RifPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value Embedded File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValueEmbeddedFileImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValueEmbeddedFileImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValueEmbeddedFileImpl#getBINARYCONTENT <em>BINARYCONTENT</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValueEmbeddedFileImpl#getDEFINITION <em>DEFINITION</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValueEmbeddedFileImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValueEmbeddedFileImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeValueEmbeddedFileImpl extends EObjectImpl implements
		AttributeValueEmbeddedFile {
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
	 * The cached value of the '{@link #getBINARYCONTENT() <em>BINARYCONTENT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBINARYCONTENT()
	 * @generated
	 * @ordered
	 */
	protected AttributeValueEmbeddedFileBinaryContent bINARYCONTENT;

	/**
	 * The cached value of the '{@link #getDEFINITION() <em>DEFINITION</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDEFINITION()
	 * @generated
	 * @ordered
	 */
	protected AttributeValueEmbeddedFileDefinition dEFINITION;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueEmbeddedFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.ATTRIBUTE_VALUE_EMBEDDED_FILE;
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
					RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__LONGNAME,
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
					RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__DESC, oldDESC,
					dESC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueEmbeddedFileBinaryContent getBINARYCONTENT() {
		return bINARYCONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBINARYCONTENT(
			AttributeValueEmbeddedFileBinaryContent newBINARYCONTENT,
			NotificationChain msgs) {
		AttributeValueEmbeddedFileBinaryContent oldBINARYCONTENT = bINARYCONTENT;
		bINARYCONTENT = newBINARYCONTENT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__BINARYCONTENT,
					oldBINARYCONTENT, newBINARYCONTENT);
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
	public void setBINARYCONTENT(
			AttributeValueEmbeddedFileBinaryContent newBINARYCONTENT) {
		if (newBINARYCONTENT != bINARYCONTENT) {
			NotificationChain msgs = null;
			if (bINARYCONTENT != null)
				msgs = ((InternalEObject) bINARYCONTENT)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__BINARYCONTENT,
								null, msgs);
			if (newBINARYCONTENT != null)
				msgs = ((InternalEObject) newBINARYCONTENT)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__BINARYCONTENT,
								null, msgs);
			msgs = basicSetBINARYCONTENT(newBINARYCONTENT, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__BINARYCONTENT,
					newBINARYCONTENT, newBINARYCONTENT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueEmbeddedFileDefinition getDEFINITION() {
		return dEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDEFINITION(
			AttributeValueEmbeddedFileDefinition newDEFINITION,
			NotificationChain msgs) {
		AttributeValueEmbeddedFileDefinition oldDEFINITION = dEFINITION;
		dEFINITION = newDEFINITION;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__DEFINITION,
					oldDEFINITION, newDEFINITION);
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
	public void setDEFINITION(AttributeValueEmbeddedFileDefinition newDEFINITION) {
		if (newDEFINITION != dEFINITION) {
			NotificationChain msgs = null;
			if (dEFINITION != null)
				msgs = ((InternalEObject) dEFINITION)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__DEFINITION,
								null, msgs);
			if (newDEFINITION != null)
				msgs = ((InternalEObject) newDEFINITION)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__DEFINITION,
								null, msgs);
			msgs = basicSetDEFINITION(newDEFINITION, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__DEFINITION,
					newDEFINITION, newDEFINITION));
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
					RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__IDENTIFIER,
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
					RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__LASTCHANGE,
					oldLASTCHANGE, lASTCHANGE));
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
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__BINARYCONTENT:
			return basicSetBINARYCONTENT(null, msgs);
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__DEFINITION:
			return basicSetDEFINITION(null, msgs);
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
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__LONGNAME:
			return getLONGNAME();
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__DESC:
			return getDESC();
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__BINARYCONTENT:
			return getBINARYCONTENT();
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__DEFINITION:
			return getDEFINITION();
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__IDENTIFIER:
			return getIDENTIFIER();
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__LASTCHANGE:
			return getLASTCHANGE();
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
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__LONGNAME:
			setLONGNAME((String) newValue);
			return;
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__DESC:
			setDESC((String) newValue);
			return;
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__BINARYCONTENT:
			setBINARYCONTENT((AttributeValueEmbeddedFileBinaryContent) newValue);
			return;
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__DEFINITION:
			setDEFINITION((AttributeValueEmbeddedFileDefinition) newValue);
			return;
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__IDENTIFIER:
			setIDENTIFIER((String) newValue);
			return;
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__LASTCHANGE:
			setLASTCHANGE((String) newValue);
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
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__LONGNAME:
			setLONGNAME(LONGNAME_EDEFAULT);
			return;
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__DESC:
			setDESC(DESC_EDEFAULT);
			return;
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__BINARYCONTENT:
			setBINARYCONTENT((AttributeValueEmbeddedFileBinaryContent) null);
			return;
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__DEFINITION:
			setDEFINITION((AttributeValueEmbeddedFileDefinition) null);
			return;
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__IDENTIFIER:
			setIDENTIFIER(IDENTIFIER_EDEFAULT);
			return;
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__LASTCHANGE:
			setLASTCHANGE(LASTCHANGE_EDEFAULT);
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
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__LONGNAME:
			return LONGNAME_EDEFAULT == null ? lONGNAME != null
					: !LONGNAME_EDEFAULT.equals(lONGNAME);
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__DESC:
			return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT
					.equals(dESC);
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__BINARYCONTENT:
			return bINARYCONTENT != null;
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__DEFINITION:
			return dEFINITION != null;
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null
					: !IDENTIFIER_EDEFAULT.equals(iDENTIFIER);
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__LASTCHANGE:
			return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null
					: !LASTCHANGE_EDEFAULT.equals(lASTCHANGE);
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
		result.append(')');
		return result.toString();
	}

} //AttributeValueEmbeddedFileImpl
