/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.DatatypeDefinitionBinaryFile;
import era.foss.model.core.rif.DatatypeDefinitionBoolean;
import era.foss.model.core.rif.DatatypeDefinitionDocument;
import era.foss.model.core.rif.DatatypeDefinitionEnumeration;
import era.foss.model.core.rif.DatatypeDefinitionInteger;
import era.foss.model.core.rif.DatatypeDefinitionReal;
import era.foss.model.core.rif.DatatypeDefinitionString;
import era.foss.model.core.rif.DatatypeDefinitionXmlData;
import era.foss.model.core.rif.Datatypes;
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
 * An implementation of the model object '<em><b>Datatypes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypesImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypesImpl#getDATATYPEDEFINITIONBINARYFILE <em>DATATYPEDEFINITIONBINARYFILE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypesImpl#getDATATYPEDEFINITIONBOOLEAN <em>DATATYPEDEFINITIONBOOLEAN</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypesImpl#getDATATYPEDEFINITIONDOCUMENT <em>DATATYPEDEFINITIONDOCUMENT</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypesImpl#getDATATYPEDEFINITIONENUMERATION <em>DATATYPEDEFINITIONENUMERATION</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypesImpl#getDATATYPEDEFINITIONINTEGER <em>DATATYPEDEFINITIONINTEGER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypesImpl#getDATATYPEDEFINITIONREAL <em>DATATYPEDEFINITIONREAL</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypesImpl#getDATATYPEDEFINITIONSTRING <em>DATATYPEDEFINITIONSTRING</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DatatypesImpl#getDATATYPEDEFINITIONXMLDATA <em>DATATYPEDEFINITIONXMLDATA</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatatypesImpl extends EObjectImpl implements Datatypes {
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
	protected DatatypesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.DATATYPES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, RifPackage.DATATYPES__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeDefinitionBinaryFile> getDATATYPEDEFINITIONBINARYFILE() {
		return getGroup().list(
				RifPackage.Literals.DATATYPES__DATATYPEDEFINITIONBINARYFILE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeDefinitionBoolean> getDATATYPEDEFINITIONBOOLEAN() {
		return getGroup().list(
				RifPackage.Literals.DATATYPES__DATATYPEDEFINITIONBOOLEAN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeDefinitionDocument> getDATATYPEDEFINITIONDOCUMENT() {
		return getGroup().list(
				RifPackage.Literals.DATATYPES__DATATYPEDEFINITIONDOCUMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeDefinitionEnumeration> getDATATYPEDEFINITIONENUMERATION() {
		return getGroup().list(
				RifPackage.Literals.DATATYPES__DATATYPEDEFINITIONENUMERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeDefinitionInteger> getDATATYPEDEFINITIONINTEGER() {
		return getGroup().list(
				RifPackage.Literals.DATATYPES__DATATYPEDEFINITIONINTEGER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeDefinitionReal> getDATATYPEDEFINITIONREAL() {
		return getGroup().list(
				RifPackage.Literals.DATATYPES__DATATYPEDEFINITIONREAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeDefinitionString> getDATATYPEDEFINITIONSTRING() {
		return getGroup().list(
				RifPackage.Literals.DATATYPES__DATATYPEDEFINITIONSTRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeDefinitionXmlData> getDATATYPEDEFINITIONXMLDATA() {
		return getGroup().list(
				RifPackage.Literals.DATATYPES__DATATYPEDEFINITIONXMLDATA);
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
		case RifPackage.DATATYPES__GROUP:
			return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
		case RifPackage.DATATYPES__DATATYPEDEFINITIONBINARYFILE:
			return ((InternalEList<?>) getDATATYPEDEFINITIONBINARYFILE())
					.basicRemove(otherEnd, msgs);
		case RifPackage.DATATYPES__DATATYPEDEFINITIONBOOLEAN:
			return ((InternalEList<?>) getDATATYPEDEFINITIONBOOLEAN())
					.basicRemove(otherEnd, msgs);
		case RifPackage.DATATYPES__DATATYPEDEFINITIONDOCUMENT:
			return ((InternalEList<?>) getDATATYPEDEFINITIONDOCUMENT())
					.basicRemove(otherEnd, msgs);
		case RifPackage.DATATYPES__DATATYPEDEFINITIONENUMERATION:
			return ((InternalEList<?>) getDATATYPEDEFINITIONENUMERATION())
					.basicRemove(otherEnd, msgs);
		case RifPackage.DATATYPES__DATATYPEDEFINITIONINTEGER:
			return ((InternalEList<?>) getDATATYPEDEFINITIONINTEGER())
					.basicRemove(otherEnd, msgs);
		case RifPackage.DATATYPES__DATATYPEDEFINITIONREAL:
			return ((InternalEList<?>) getDATATYPEDEFINITIONREAL())
					.basicRemove(otherEnd, msgs);
		case RifPackage.DATATYPES__DATATYPEDEFINITIONSTRING:
			return ((InternalEList<?>) getDATATYPEDEFINITIONSTRING())
					.basicRemove(otherEnd, msgs);
		case RifPackage.DATATYPES__DATATYPEDEFINITIONXMLDATA:
			return ((InternalEList<?>) getDATATYPEDEFINITIONXMLDATA())
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
		case RifPackage.DATATYPES__GROUP:
			if (coreType)
				return getGroup();
			return ((FeatureMap.Internal) getGroup()).getWrapper();
		case RifPackage.DATATYPES__DATATYPEDEFINITIONBINARYFILE:
			return getDATATYPEDEFINITIONBINARYFILE();
		case RifPackage.DATATYPES__DATATYPEDEFINITIONBOOLEAN:
			return getDATATYPEDEFINITIONBOOLEAN();
		case RifPackage.DATATYPES__DATATYPEDEFINITIONDOCUMENT:
			return getDATATYPEDEFINITIONDOCUMENT();
		case RifPackage.DATATYPES__DATATYPEDEFINITIONENUMERATION:
			return getDATATYPEDEFINITIONENUMERATION();
		case RifPackage.DATATYPES__DATATYPEDEFINITIONINTEGER:
			return getDATATYPEDEFINITIONINTEGER();
		case RifPackage.DATATYPES__DATATYPEDEFINITIONREAL:
			return getDATATYPEDEFINITIONREAL();
		case RifPackage.DATATYPES__DATATYPEDEFINITIONSTRING:
			return getDATATYPEDEFINITIONSTRING();
		case RifPackage.DATATYPES__DATATYPEDEFINITIONXMLDATA:
			return getDATATYPEDEFINITIONXMLDATA();
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
		case RifPackage.DATATYPES__GROUP:
			((FeatureMap.Internal) getGroup()).set(newValue);
			return;
		case RifPackage.DATATYPES__DATATYPEDEFINITIONBINARYFILE:
			getDATATYPEDEFINITIONBINARYFILE().clear();
			getDATATYPEDEFINITIONBINARYFILE()
					.addAll(
							(Collection<? extends DatatypeDefinitionBinaryFile>) newValue);
			return;
		case RifPackage.DATATYPES__DATATYPEDEFINITIONBOOLEAN:
			getDATATYPEDEFINITIONBOOLEAN().clear();
			getDATATYPEDEFINITIONBOOLEAN().addAll(
					(Collection<? extends DatatypeDefinitionBoolean>) newValue);
			return;
		case RifPackage.DATATYPES__DATATYPEDEFINITIONDOCUMENT:
			getDATATYPEDEFINITIONDOCUMENT().clear();
			getDATATYPEDEFINITIONDOCUMENT()
					.addAll(
							(Collection<? extends DatatypeDefinitionDocument>) newValue);
			return;
		case RifPackage.DATATYPES__DATATYPEDEFINITIONENUMERATION:
			getDATATYPEDEFINITIONENUMERATION().clear();
			getDATATYPEDEFINITIONENUMERATION()
					.addAll(
							(Collection<? extends DatatypeDefinitionEnumeration>) newValue);
			return;
		case RifPackage.DATATYPES__DATATYPEDEFINITIONINTEGER:
			getDATATYPEDEFINITIONINTEGER().clear();
			getDATATYPEDEFINITIONINTEGER().addAll(
					(Collection<? extends DatatypeDefinitionInteger>) newValue);
			return;
		case RifPackage.DATATYPES__DATATYPEDEFINITIONREAL:
			getDATATYPEDEFINITIONREAL().clear();
			getDATATYPEDEFINITIONREAL().addAll(
					(Collection<? extends DatatypeDefinitionReal>) newValue);
			return;
		case RifPackage.DATATYPES__DATATYPEDEFINITIONSTRING:
			getDATATYPEDEFINITIONSTRING().clear();
			getDATATYPEDEFINITIONSTRING().addAll(
					(Collection<? extends DatatypeDefinitionString>) newValue);
			return;
		case RifPackage.DATATYPES__DATATYPEDEFINITIONXMLDATA:
			getDATATYPEDEFINITIONXMLDATA().clear();
			getDATATYPEDEFINITIONXMLDATA().addAll(
					(Collection<? extends DatatypeDefinitionXmlData>) newValue);
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
		case RifPackage.DATATYPES__GROUP:
			getGroup().clear();
			return;
		case RifPackage.DATATYPES__DATATYPEDEFINITIONBINARYFILE:
			getDATATYPEDEFINITIONBINARYFILE().clear();
			return;
		case RifPackage.DATATYPES__DATATYPEDEFINITIONBOOLEAN:
			getDATATYPEDEFINITIONBOOLEAN().clear();
			return;
		case RifPackage.DATATYPES__DATATYPEDEFINITIONDOCUMENT:
			getDATATYPEDEFINITIONDOCUMENT().clear();
			return;
		case RifPackage.DATATYPES__DATATYPEDEFINITIONENUMERATION:
			getDATATYPEDEFINITIONENUMERATION().clear();
			return;
		case RifPackage.DATATYPES__DATATYPEDEFINITIONINTEGER:
			getDATATYPEDEFINITIONINTEGER().clear();
			return;
		case RifPackage.DATATYPES__DATATYPEDEFINITIONREAL:
			getDATATYPEDEFINITIONREAL().clear();
			return;
		case RifPackage.DATATYPES__DATATYPEDEFINITIONSTRING:
			getDATATYPEDEFINITIONSTRING().clear();
			return;
		case RifPackage.DATATYPES__DATATYPEDEFINITIONXMLDATA:
			getDATATYPEDEFINITIONXMLDATA().clear();
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
		case RifPackage.DATATYPES__GROUP:
			return group != null && !group.isEmpty();
		case RifPackage.DATATYPES__DATATYPEDEFINITIONBINARYFILE:
			return !getDATATYPEDEFINITIONBINARYFILE().isEmpty();
		case RifPackage.DATATYPES__DATATYPEDEFINITIONBOOLEAN:
			return !getDATATYPEDEFINITIONBOOLEAN().isEmpty();
		case RifPackage.DATATYPES__DATATYPEDEFINITIONDOCUMENT:
			return !getDATATYPEDEFINITIONDOCUMENT().isEmpty();
		case RifPackage.DATATYPES__DATATYPEDEFINITIONENUMERATION:
			return !getDATATYPEDEFINITIONENUMERATION().isEmpty();
		case RifPackage.DATATYPES__DATATYPEDEFINITIONINTEGER:
			return !getDATATYPEDEFINITIONINTEGER().isEmpty();
		case RifPackage.DATATYPES__DATATYPEDEFINITIONREAL:
			return !getDATATYPEDEFINITIONREAL().isEmpty();
		case RifPackage.DATATYPES__DATATYPEDEFINITIONSTRING:
			return !getDATATYPEDEFINITIONSTRING().isEmpty();
		case RifPackage.DATATYPES__DATATYPEDEFINITIONXMLDATA:
			return !getDATATYPEDEFINITIONXMLDATA().isEmpty();
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

} //DatatypesImpl
