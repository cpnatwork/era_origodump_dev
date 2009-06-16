/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.BOOLEAN;
import era.foss.model.core.rif.DatatypeDefinitionBinaryFile;
import era.foss.model.core.rif.RifPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype Definition Binary File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionBinaryFileImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionBinaryFileImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionBinaryFileImpl#getAPPLICATION <em>APPLICATION</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionBinaryFileImpl#getEMBEDDED <em>EMBEDDED</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionBinaryFileImpl#getFILENAMESUFFIX <em>FILENAMESUFFIX</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionBinaryFileImpl#getFORMATNAME <em>FORMATNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionBinaryFileImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionBinaryFileImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypeDefinitionBinaryFileImpl#getMIMETYPE <em>MIMETYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatatypeDefinitionBinaryFileImpl extends EObjectImpl implements
		DatatypeDefinitionBinaryFile {
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
	 * The default value of the '{@link #getAPPLICATION() <em>APPLICATION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPPLICATION()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAPPLICATION() <em>APPLICATION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPPLICATION()
	 * @generated
	 * @ordered
	 */
	protected String aPPLICATION = APPLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEMBEDDED() <em>EMBEDDED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMBEDDED()
	 * @generated
	 * @ordered
	 */
	protected static final BOOLEAN EMBEDDED_EDEFAULT = BOOLEAN.TRUE;

	/**
	 * The cached value of the '{@link #getEMBEDDED() <em>EMBEDDED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMBEDDED()
	 * @generated
	 * @ordered
	 */
	protected BOOLEAN eMBEDDED = EMBEDDED_EDEFAULT;

	/**
	 * The flag representing whether the EMBEDDED attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int EMBEDDED_ESETFLAG = 1 << 0;

	/**
	 * The default value of the '{@link #getFILENAMESUFFIX() <em>FILENAMESUFFIX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFILENAMESUFFIX()
	 * @generated
	 * @ordered
	 */
	protected static final String FILENAMESUFFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFILENAMESUFFIX() <em>FILENAMESUFFIX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFILENAMESUFFIX()
	 * @generated
	 * @ordered
	 */
	protected String fILENAMESUFFIX = FILENAMESUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getFORMATNAME() <em>FORMATNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFORMATNAME()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMATNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFORMATNAME() <em>FORMATNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFORMATNAME()
	 * @generated
	 * @ordered
	 */
	protected String fORMATNAME = FORMATNAME_EDEFAULT;

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
	 * The default value of the '{@link #getMIMETYPE() <em>MIMETYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMIMETYPE()
	 * @generated
	 * @ordered
	 */
	protected static final String MIMETYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMIMETYPE() <em>MIMETYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMIMETYPE()
	 * @generated
	 * @ordered
	 */
	protected String mIMETYPE = MIMETYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatypeDefinitionBinaryFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.DATATYPE_DEFINITION_BINARY_FILE;
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
					RifPackage.DATATYPE_DEFINITION_BINARY_FILE__LONGNAME,
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
					RifPackage.DATATYPE_DEFINITION_BINARY_FILE__DESC, oldDESC,
					dESC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAPPLICATION() {
		return aPPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPPLICATION(String newAPPLICATION) {
		String oldAPPLICATION = aPPLICATION;
		aPPLICATION = newAPPLICATION;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.DATATYPE_DEFINITION_BINARY_FILE__APPLICATION,
					oldAPPLICATION, aPPLICATION));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOOLEAN getEMBEDDED() {
		return eMBEDDED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEMBEDDED(BOOLEAN newEMBEDDED) {
		BOOLEAN oldEMBEDDED = eMBEDDED;
		eMBEDDED = newEMBEDDED == null ? EMBEDDED_EDEFAULT : newEMBEDDED;
		boolean oldEMBEDDEDESet = (booleans & EMBEDDED_ESETFLAG) != 0;
		booleans |= EMBEDDED_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.DATATYPE_DEFINITION_BINARY_FILE__EMBEDDED,
					oldEMBEDDED, eMBEDDED, !oldEMBEDDEDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEMBEDDED() {
		BOOLEAN oldEMBEDDED = eMBEDDED;
		boolean oldEMBEDDEDESet = (booleans & EMBEDDED_ESETFLAG) != 0;
		eMBEDDED = EMBEDDED_EDEFAULT;
		booleans &= ~EMBEDDED_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					RifPackage.DATATYPE_DEFINITION_BINARY_FILE__EMBEDDED,
					oldEMBEDDED, EMBEDDED_EDEFAULT, oldEMBEDDEDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEMBEDDED() {
		return (booleans & EMBEDDED_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFILENAMESUFFIX() {
		return fILENAMESUFFIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFILENAMESUFFIX(String newFILENAMESUFFIX) {
		String oldFILENAMESUFFIX = fILENAMESUFFIX;
		fILENAMESUFFIX = newFILENAMESUFFIX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.DATATYPE_DEFINITION_BINARY_FILE__FILENAMESUFFIX,
					oldFILENAMESUFFIX, fILENAMESUFFIX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFORMATNAME() {
		return fORMATNAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFORMATNAME(String newFORMATNAME) {
		String oldFORMATNAME = fORMATNAME;
		fORMATNAME = newFORMATNAME;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.DATATYPE_DEFINITION_BINARY_FILE__FORMATNAME,
					oldFORMATNAME, fORMATNAME));
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
					RifPackage.DATATYPE_DEFINITION_BINARY_FILE__IDENTIFIER,
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
					RifPackage.DATATYPE_DEFINITION_BINARY_FILE__LASTCHANGE,
					oldLASTCHANGE, lASTCHANGE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMIMETYPE() {
		return mIMETYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMIMETYPE(String newMIMETYPE) {
		String oldMIMETYPE = mIMETYPE;
		mIMETYPE = newMIMETYPE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.DATATYPE_DEFINITION_BINARY_FILE__MIMETYPE,
					oldMIMETYPE, mIMETYPE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__LONGNAME:
			return getLONGNAME();
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__DESC:
			return getDESC();
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__APPLICATION:
			return getAPPLICATION();
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__EMBEDDED:
			return getEMBEDDED();
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__FILENAMESUFFIX:
			return getFILENAMESUFFIX();
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__FORMATNAME:
			return getFORMATNAME();
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__IDENTIFIER:
			return getIDENTIFIER();
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__LASTCHANGE:
			return getLASTCHANGE();
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__MIMETYPE:
			return getMIMETYPE();
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
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__LONGNAME:
			setLONGNAME((String) newValue);
			return;
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__DESC:
			setDESC((String) newValue);
			return;
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__APPLICATION:
			setAPPLICATION((String) newValue);
			return;
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__EMBEDDED:
			setEMBEDDED((BOOLEAN) newValue);
			return;
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__FILENAMESUFFIX:
			setFILENAMESUFFIX((String) newValue);
			return;
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__FORMATNAME:
			setFORMATNAME((String) newValue);
			return;
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__IDENTIFIER:
			setIDENTIFIER((String) newValue);
			return;
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__LASTCHANGE:
			setLASTCHANGE((String) newValue);
			return;
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__MIMETYPE:
			setMIMETYPE((String) newValue);
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
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__LONGNAME:
			setLONGNAME(LONGNAME_EDEFAULT);
			return;
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__DESC:
			setDESC(DESC_EDEFAULT);
			return;
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__APPLICATION:
			setAPPLICATION(APPLICATION_EDEFAULT);
			return;
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__EMBEDDED:
			unsetEMBEDDED();
			return;
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__FILENAMESUFFIX:
			setFILENAMESUFFIX(FILENAMESUFFIX_EDEFAULT);
			return;
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__FORMATNAME:
			setFORMATNAME(FORMATNAME_EDEFAULT);
			return;
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__IDENTIFIER:
			setIDENTIFIER(IDENTIFIER_EDEFAULT);
			return;
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__LASTCHANGE:
			setLASTCHANGE(LASTCHANGE_EDEFAULT);
			return;
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__MIMETYPE:
			setMIMETYPE(MIMETYPE_EDEFAULT);
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
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__LONGNAME:
			return LONGNAME_EDEFAULT == null ? lONGNAME != null
					: !LONGNAME_EDEFAULT.equals(lONGNAME);
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__DESC:
			return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT
					.equals(dESC);
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__APPLICATION:
			return APPLICATION_EDEFAULT == null ? aPPLICATION != null
					: !APPLICATION_EDEFAULT.equals(aPPLICATION);
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__EMBEDDED:
			return isSetEMBEDDED();
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__FILENAMESUFFIX:
			return FILENAMESUFFIX_EDEFAULT == null ? fILENAMESUFFIX != null
					: !FILENAMESUFFIX_EDEFAULT.equals(fILENAMESUFFIX);
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__FORMATNAME:
			return FORMATNAME_EDEFAULT == null ? fORMATNAME != null
					: !FORMATNAME_EDEFAULT.equals(fORMATNAME);
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null
					: !IDENTIFIER_EDEFAULT.equals(iDENTIFIER);
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__LASTCHANGE:
			return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null
					: !LASTCHANGE_EDEFAULT.equals(lASTCHANGE);
		case RifPackage.DATATYPE_DEFINITION_BINARY_FILE__MIMETYPE:
			return MIMETYPE_EDEFAULT == null ? mIMETYPE != null
					: !MIMETYPE_EDEFAULT.equals(mIMETYPE);
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
		result.append(", aPPLICATION: "); //$NON-NLS-1$
		result.append(aPPLICATION);
		result.append(", eMBEDDED: "); //$NON-NLS-1$
		if ((booleans & EMBEDDED_ESETFLAG) != 0)
			result.append(eMBEDDED);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(", fILENAMESUFFIX: "); //$NON-NLS-1$
		result.append(fILENAMESUFFIX);
		result.append(", fORMATNAME: "); //$NON-NLS-1$
		result.append(fORMATNAME);
		result.append(", iDENTIFIER: "); //$NON-NLS-1$
		result.append(iDENTIFIER);
		result.append(", lASTCHANGE: "); //$NON-NLS-1$
		result.append(lASTCHANGE);
		result.append(", mIMETYPE: "); //$NON-NLS-1$
		result.append(mIMETYPE);
		result.append(')');
		return result.toString();
	}

} //DatatypeDefinitionBinaryFileImpl
