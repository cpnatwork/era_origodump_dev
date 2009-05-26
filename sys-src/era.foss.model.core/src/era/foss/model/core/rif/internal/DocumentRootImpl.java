/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AccessPolicy;
import era.foss.model.core.rif.AttributeDefinitionComplex;
import era.foss.model.core.rif.AttributeDefinitionEnumeration;
import era.foss.model.core.rif.AttributeDefinitionSimple;
import era.foss.model.core.rif.AttributeValueEmbeddedDocument;
import era.foss.model.core.rif.AttributeValueEmbeddedFile;
import era.foss.model.core.rif.AttributeValueEnumeration;
import era.foss.model.core.rif.AttributeValueFileReference;
import era.foss.model.core.rif.AttributeValueSimple;
import era.foss.model.core.rif.AttributeValueXmlData;
import era.foss.model.core.rif.BinaryContent;
import era.foss.model.core.rif.DatatypeDefinitionBinaryFile;
import era.foss.model.core.rif.DatatypeDefinitionBoolean;
import era.foss.model.core.rif.DatatypeDefinitionDocument;
import era.foss.model.core.rif.DatatypeDefinitionEnumeration;
import era.foss.model.core.rif.DatatypeDefinitionInteger;
import era.foss.model.core.rif.DatatypeDefinitionReal;
import era.foss.model.core.rif.DatatypeDefinitionString;
import era.foss.model.core.rif.DatatypeDefinitionXmlData;
import era.foss.model.core.rif.DocumentRoot;
import era.foss.model.core.rif.EmbeddedValue;
import era.foss.model.core.rif.EnumValue;
import era.foss.model.core.rif.RelationGroup;
import era.foss.model.core.rif.Rif;
import era.foss.model.core.rif.RifPackage;
import era.foss.model.core.rif.SpecGroup;
import era.foss.model.core.rif.SpecHierarchy;
import era.foss.model.core.rif.SpecHierarchyRoot;
import era.foss.model.core.rif.SpecObject;
import era.foss.model.core.rif.SpecRelation;
import era.foss.model.core.rif.SpecType;
import era.foss.model.core.rif.XhtmlContent;
import era.foss.model.core.rif.XmlContentXmlContent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getACCESSPOLICY <em>ACCESSPOLICY</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getATTRIBUTEDEFINITIONCOMPLEX <em>ATTRIBUTEDEFINITIONCOMPLEX</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getATTRIBUTEDEFINITIONENUMERATION <em>ATTRIBUTEDEFINITIONENUMERATION</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getATTRIBUTEDEFINITIONSIMPLE <em>ATTRIBUTEDEFINITIONSIMPLE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getATTRIBUTEVALUEEMBEDDEDDOCUMENT <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getATTRIBUTEVALUEEMBEDDEDFILE <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getATTRIBUTEVALUEFILEREFERENCE <em>ATTRIBUTEVALUEFILEREFERENCE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getATTRIBUTEVALUESIMPLE <em>ATTRIBUTEVALUESIMPLE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getATTRIBUTEVALUEXMLDATA <em>ATTRIBUTEVALUEXMLDATA</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getBINARYCONTENT <em>BINARYCONTENT</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getDATATYPEDEFINITIONBINARYFILE <em>DATATYPEDEFINITIONBINARYFILE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getDATATYPEDEFINITIONBOOLEAN <em>DATATYPEDEFINITIONBOOLEAN</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getDATATYPEDEFINITIONDOCUMENT <em>DATATYPEDEFINITIONDOCUMENT</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getDATATYPEDEFINITIONENUMERATION <em>DATATYPEDEFINITIONENUMERATION</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getDATATYPEDEFINITIONINTEGER <em>DATATYPEDEFINITIONINTEGER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getDATATYPEDEFINITIONREAL <em>DATATYPEDEFINITIONREAL</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getDATATYPEDEFINITIONSTRING <em>DATATYPEDEFINITIONSTRING</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getDATATYPEDEFINITIONXMLDATA <em>DATATYPEDEFINITIONXMLDATA</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getEMBEDDEDVALUE <em>EMBEDDEDVALUE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getENUMVALUE <em>ENUMVALUE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getRELATIONGROUP <em>RELATIONGROUP</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getRIF <em>RIF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getSPECGROUP <em>SPECGROUP</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getSPECHIERARCHY <em>SPECHIERARCHY</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getSPECHIERARCHYROOT <em>SPECHIERARCHYROOT</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getSPECOBJECT <em>SPECOBJECT</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getSPECRELATION <em>SPECRELATION</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getSPECTYPE <em>SPECTYPE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getXHTMLCONTENT <em>XHTMLCONTENT</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getXMLCONTENT <em>XMLCONTENT</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.DocumentRootImpl#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
    /**
     * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected int booleans = 0;

    /**
     * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMixed()
     * @generated
     * @ordered
     */
    protected FeatureMap mixed;

    /**
     * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXMLNSPrefixMap()
     * @generated
     * @ordered
     */
    protected EMap xMLNSPrefixMap;

    /**
     * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXSISchemaLocation()
     * @generated
     * @ordered
     */
    protected EMap xSISchemaLocation;

    /**
     * The default value of the '{@link #getID() <em>ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getID()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getID()
     * @generated
     * @ordered
     */
    protected String iD = ID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentRootImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return RifPackage.Literals.DOCUMENT_ROOT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getMixed() {
        if( mixed == null ) {
            mixed = new BasicFeatureMap( this, RifPackage.DOCUMENT_ROOT__MIXED );
        }
        return mixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap getXMLNSPrefixMap() {
        if( xMLNSPrefixMap == null ) {
            xMLNSPrefixMap = new EcoreEMap(
                EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
                EStringToStringMapEntryImpl.class,
                this,
                RifPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP );
        }
        return xMLNSPrefixMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap getXSISchemaLocation() {
        if( xSISchemaLocation == null ) {
            xSISchemaLocation = new EcoreEMap(
                EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
                EStringToStringMapEntryImpl.class,
                this,
                RifPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION );
        }
        return xSISchemaLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AccessPolicy getACCESSPOLICY() {
        return (AccessPolicy)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__ACCESSPOLICY, true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetACCESSPOLICY( AccessPolicy newACCESSPOLICY, NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__ACCESSPOLICY,
                                                           newACCESSPOLICY,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setACCESSPOLICY( AccessPolicy newACCESSPOLICY ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__ACCESSPOLICY, newACCESSPOLICY );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeDefinitionComplex getATTRIBUTEDEFINITIONCOMPLEX() {
        return (AttributeDefinitionComplex)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONCOMPLEX,
                                                           true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetATTRIBUTEDEFINITIONCOMPLEX( AttributeDefinitionComplex newATTRIBUTEDEFINITIONCOMPLEX,
                                                                 NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONCOMPLEX,
                                                           newATTRIBUTEDEFINITIONCOMPLEX,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setATTRIBUTEDEFINITIONCOMPLEX( AttributeDefinitionComplex newATTRIBUTEDEFINITIONCOMPLEX ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONCOMPLEX,
                                               newATTRIBUTEDEFINITIONCOMPLEX );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeDefinitionEnumeration getATTRIBUTEDEFINITIONENUMERATION() {
        return (AttributeDefinitionEnumeration)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONENUMERATION,
                                                               true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetATTRIBUTEDEFINITIONENUMERATION( AttributeDefinitionEnumeration newATTRIBUTEDEFINITIONENUMERATION,
                                                                     NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONENUMERATION,
                                                           newATTRIBUTEDEFINITIONENUMERATION,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setATTRIBUTEDEFINITIONENUMERATION( AttributeDefinitionEnumeration newATTRIBUTEDEFINITIONENUMERATION ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONENUMERATION,
                                               newATTRIBUTEDEFINITIONENUMERATION );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeDefinitionSimple getATTRIBUTEDEFINITIONSIMPLE() {
        return (AttributeDefinitionSimple)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONSIMPLE,
                                                          true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetATTRIBUTEDEFINITIONSIMPLE( AttributeDefinitionSimple newATTRIBUTEDEFINITIONSIMPLE,
                                                                NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONSIMPLE,
                                                           newATTRIBUTEDEFINITIONSIMPLE,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setATTRIBUTEDEFINITIONSIMPLE( AttributeDefinitionSimple newATTRIBUTEDEFINITIONSIMPLE ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONSIMPLE,
                                               newATTRIBUTEDEFINITIONSIMPLE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueEmbeddedDocument getATTRIBUTEVALUEEMBEDDEDDOCUMENT() {
        return (AttributeValueEmbeddedDocument)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDDOCUMENT,
                                                               true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetATTRIBUTEVALUEEMBEDDEDDOCUMENT( AttributeValueEmbeddedDocument newATTRIBUTEVALUEEMBEDDEDDOCUMENT,
                                                                     NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDDOCUMENT,
                                                           newATTRIBUTEVALUEEMBEDDEDDOCUMENT,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setATTRIBUTEVALUEEMBEDDEDDOCUMENT( AttributeValueEmbeddedDocument newATTRIBUTEVALUEEMBEDDEDDOCUMENT ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDDOCUMENT,
                                               newATTRIBUTEVALUEEMBEDDEDDOCUMENT );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueEmbeddedFile getATTRIBUTEVALUEEMBEDDEDFILE() {
        return (AttributeValueEmbeddedFile)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDFILE,
                                                           true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetATTRIBUTEVALUEEMBEDDEDFILE( AttributeValueEmbeddedFile newATTRIBUTEVALUEEMBEDDEDFILE,
                                                                 NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDFILE,
                                                           newATTRIBUTEVALUEEMBEDDEDFILE,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setATTRIBUTEVALUEEMBEDDEDFILE( AttributeValueEmbeddedFile newATTRIBUTEVALUEEMBEDDEDFILE ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDFILE,
                                               newATTRIBUTEVALUEEMBEDDEDFILE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueEnumeration getATTRIBUTEVALUEENUMERATION() {
        return (AttributeValueEnumeration)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUEENUMERATION,
                                                          true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetATTRIBUTEVALUEENUMERATION( AttributeValueEnumeration newATTRIBUTEVALUEENUMERATION,
                                                                NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUEENUMERATION,
                                                           newATTRIBUTEVALUEENUMERATION,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setATTRIBUTEVALUEENUMERATION( AttributeValueEnumeration newATTRIBUTEVALUEENUMERATION ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUEENUMERATION,
                                               newATTRIBUTEVALUEENUMERATION );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueFileReference getATTRIBUTEVALUEFILEREFERENCE() {
        return (AttributeValueFileReference)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUEFILEREFERENCE,
                                                            true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetATTRIBUTEVALUEFILEREFERENCE( AttributeValueFileReference newATTRIBUTEVALUEFILEREFERENCE,
                                                                  NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUEFILEREFERENCE,
                                                           newATTRIBUTEVALUEFILEREFERENCE,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setATTRIBUTEVALUEFILEREFERENCE( AttributeValueFileReference newATTRIBUTEVALUEFILEREFERENCE ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUEFILEREFERENCE,
                                               newATTRIBUTEVALUEFILEREFERENCE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueSimple getATTRIBUTEVALUESIMPLE() {
        return (AttributeValueSimple)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUESIMPLE, true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetATTRIBUTEVALUESIMPLE( AttributeValueSimple newATTRIBUTEVALUESIMPLE,
                                                           NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUESIMPLE,
                                                           newATTRIBUTEVALUESIMPLE,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setATTRIBUTEVALUESIMPLE( AttributeValueSimple newATTRIBUTEVALUESIMPLE ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUESIMPLE,
                                               newATTRIBUTEVALUESIMPLE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueXmlData getATTRIBUTEVALUEXMLDATA() {
        return (AttributeValueXmlData)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUEXMLDATA, true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetATTRIBUTEVALUEXMLDATA( AttributeValueXmlData newATTRIBUTEVALUEXMLDATA,
                                                            NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUEXMLDATA,
                                                           newATTRIBUTEVALUEXMLDATA,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setATTRIBUTEVALUEXMLDATA( AttributeValueXmlData newATTRIBUTEVALUEXMLDATA ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__ATTRIBUTEVALUEXMLDATA,
                                               newATTRIBUTEVALUEXMLDATA );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BinaryContent getBINARYCONTENT() {
        return (BinaryContent)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__BINARYCONTENT, true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBINARYCONTENT( BinaryContent newBINARYCONTENT, NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__BINARYCONTENT,
                                                           newBINARYCONTENT,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBINARYCONTENT( BinaryContent newBINARYCONTENT ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__BINARYCONTENT, newBINARYCONTENT );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeDefinitionBinaryFile getDATATYPEDEFINITIONBINARYFILE() {
        return (DatatypeDefinitionBinaryFile)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONBINARYFILE,
                                                             true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDATATYPEDEFINITIONBINARYFILE( DatatypeDefinitionBinaryFile newDATATYPEDEFINITIONBINARYFILE,
                                                                   NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONBINARYFILE,
                                                           newDATATYPEDEFINITIONBINARYFILE,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDATATYPEDEFINITIONBINARYFILE( DatatypeDefinitionBinaryFile newDATATYPEDEFINITIONBINARYFILE ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONBINARYFILE,
                                               newDATATYPEDEFINITIONBINARYFILE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeDefinitionBoolean getDATATYPEDEFINITIONBOOLEAN() {
        return (DatatypeDefinitionBoolean)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONBOOLEAN,
                                                          true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDATATYPEDEFINITIONBOOLEAN( DatatypeDefinitionBoolean newDATATYPEDEFINITIONBOOLEAN,
                                                                NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONBOOLEAN,
                                                           newDATATYPEDEFINITIONBOOLEAN,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDATATYPEDEFINITIONBOOLEAN( DatatypeDefinitionBoolean newDATATYPEDEFINITIONBOOLEAN ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONBOOLEAN,
                                               newDATATYPEDEFINITIONBOOLEAN );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeDefinitionDocument getDATATYPEDEFINITIONDOCUMENT() {
        return (DatatypeDefinitionDocument)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONDOCUMENT,
                                                           true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDATATYPEDEFINITIONDOCUMENT( DatatypeDefinitionDocument newDATATYPEDEFINITIONDOCUMENT,
                                                                 NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONDOCUMENT,
                                                           newDATATYPEDEFINITIONDOCUMENT,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDATATYPEDEFINITIONDOCUMENT( DatatypeDefinitionDocument newDATATYPEDEFINITIONDOCUMENT ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONDOCUMENT,
                                               newDATATYPEDEFINITIONDOCUMENT );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeDefinitionEnumeration getDATATYPEDEFINITIONENUMERATION() {
        return (DatatypeDefinitionEnumeration)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONENUMERATION,
                                                              true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDATATYPEDEFINITIONENUMERATION( DatatypeDefinitionEnumeration newDATATYPEDEFINITIONENUMERATION,
                                                                    NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONENUMERATION,
                                                           newDATATYPEDEFINITIONENUMERATION,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDATATYPEDEFINITIONENUMERATION( DatatypeDefinitionEnumeration newDATATYPEDEFINITIONENUMERATION ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONENUMERATION,
                                               newDATATYPEDEFINITIONENUMERATION );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeDefinitionInteger getDATATYPEDEFINITIONINTEGER() {
        return (DatatypeDefinitionInteger)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONINTEGER,
                                                          true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDATATYPEDEFINITIONINTEGER( DatatypeDefinitionInteger newDATATYPEDEFINITIONINTEGER,
                                                                NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONINTEGER,
                                                           newDATATYPEDEFINITIONINTEGER,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDATATYPEDEFINITIONINTEGER( DatatypeDefinitionInteger newDATATYPEDEFINITIONINTEGER ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONINTEGER,
                                               newDATATYPEDEFINITIONINTEGER );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeDefinitionReal getDATATYPEDEFINITIONREAL() {
        return (DatatypeDefinitionReal)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONREAL,
                                                       true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDATATYPEDEFINITIONREAL( DatatypeDefinitionReal newDATATYPEDEFINITIONREAL,
                                                             NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONREAL,
                                                           newDATATYPEDEFINITIONREAL,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDATATYPEDEFINITIONREAL( DatatypeDefinitionReal newDATATYPEDEFINITIONREAL ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONREAL,
                                               newDATATYPEDEFINITIONREAL );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeDefinitionString getDATATYPEDEFINITIONSTRING() {
        return (DatatypeDefinitionString)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONSTRING,
                                                         true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDATATYPEDEFINITIONSTRING( DatatypeDefinitionString newDATATYPEDEFINITIONSTRING,
                                                               NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONSTRING,
                                                           newDATATYPEDEFINITIONSTRING,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDATATYPEDEFINITIONSTRING( DatatypeDefinitionString newDATATYPEDEFINITIONSTRING ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONSTRING,
                                               newDATATYPEDEFINITIONSTRING );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeDefinitionXmlData getDATATYPEDEFINITIONXMLDATA() {
        return (DatatypeDefinitionXmlData)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONXMLDATA,
                                                          true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDATATYPEDEFINITIONXMLDATA( DatatypeDefinitionXmlData newDATATYPEDEFINITIONXMLDATA,
                                                                NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONXMLDATA,
                                                           newDATATYPEDEFINITIONXMLDATA,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDATATYPEDEFINITIONXMLDATA( DatatypeDefinitionXmlData newDATATYPEDEFINITIONXMLDATA ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__DATATYPEDEFINITIONXMLDATA,
                                               newDATATYPEDEFINITIONXMLDATA );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EmbeddedValue getEMBEDDEDVALUE() {
        return (EmbeddedValue)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__EMBEDDEDVALUE, true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEMBEDDEDVALUE( EmbeddedValue newEMBEDDEDVALUE, NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__EMBEDDEDVALUE,
                                                           newEMBEDDEDVALUE,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEMBEDDEDVALUE( EmbeddedValue newEMBEDDEDVALUE ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__EMBEDDEDVALUE, newEMBEDDEDVALUE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EnumValue getENUMVALUE() {
        return (EnumValue)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__ENUMVALUE, true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetENUMVALUE( EnumValue newENUMVALUE, NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__ENUMVALUE,
                                                           newENUMVALUE,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setENUMVALUE( EnumValue newENUMVALUE ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__ENUMVALUE, newENUMVALUE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelationGroup getRELATIONGROUP() {
        return (RelationGroup)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__RELATIONGROUP, true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRELATIONGROUP( RelationGroup newRELATIONGROUP, NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__RELATIONGROUP,
                                                           newRELATIONGROUP,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRELATIONGROUP( RelationGroup newRELATIONGROUP ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__RELATIONGROUP, newRELATIONGROUP );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Rif getRIF() {
        return (Rif)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__RIF, true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRIF( Rif newRIF, NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__RIF, newRIF, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRIF( Rif newRIF ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__RIF, newRIF );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecGroup getSPECGROUP() {
        return (SpecGroup)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__SPECGROUP, true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSPECGROUP( SpecGroup newSPECGROUP, NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__SPECGROUP,
                                                           newSPECGROUP,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSPECGROUP( SpecGroup newSPECGROUP ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__SPECGROUP, newSPECGROUP );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecHierarchy getSPECHIERARCHY() {
        return (SpecHierarchy)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__SPECHIERARCHY, true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSPECHIERARCHY( SpecHierarchy newSPECHIERARCHY, NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__SPECHIERARCHY,
                                                           newSPECHIERARCHY,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSPECHIERARCHY( SpecHierarchy newSPECHIERARCHY ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__SPECHIERARCHY, newSPECHIERARCHY );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecHierarchyRoot getSPECHIERARCHYROOT() {
        return (SpecHierarchyRoot)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__SPECHIERARCHYROOT, true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSPECHIERARCHYROOT( SpecHierarchyRoot newSPECHIERARCHYROOT, NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__SPECHIERARCHYROOT,
                                                           newSPECHIERARCHYROOT,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSPECHIERARCHYROOT( SpecHierarchyRoot newSPECHIERARCHYROOT ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__SPECHIERARCHYROOT,
                                               newSPECHIERARCHYROOT );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecObject getSPECOBJECT() {
        return (SpecObject)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__SPECOBJECT, true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSPECOBJECT( SpecObject newSPECOBJECT, NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__SPECOBJECT,
                                                           newSPECOBJECT,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSPECOBJECT( SpecObject newSPECOBJECT ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__SPECOBJECT, newSPECOBJECT );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecRelation getSPECRELATION() {
        return (SpecRelation)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__SPECRELATION, true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSPECRELATION( SpecRelation newSPECRELATION, NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__SPECRELATION,
                                                           newSPECRELATION,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSPECRELATION( SpecRelation newSPECRELATION ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__SPECRELATION, newSPECRELATION );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecType getSPECTYPE() {
        return (SpecType)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__SPECTYPE, true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSPECTYPE( SpecType newSPECTYPE, NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__SPECTYPE,
                                                           newSPECTYPE,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSPECTYPE( SpecType newSPECTYPE ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__SPECTYPE, newSPECTYPE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XhtmlContent getXHTMLCONTENT() {
        return (XhtmlContent)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__XHTMLCONTENT, true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetXHTMLCONTENT( XhtmlContent newXHTMLCONTENT, NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__XHTMLCONTENT,
                                                           newXHTMLCONTENT,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setXHTMLCONTENT( XhtmlContent newXHTMLCONTENT ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__XHTMLCONTENT, newXHTMLCONTENT );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XmlContentXmlContent getXMLCONTENT() {
        return (XmlContentXmlContent)getMixed().get( RifPackage.Literals.DOCUMENT_ROOT__XMLCONTENT, true );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetXMLCONTENT( XmlContentXmlContent newXMLCONTENT, NotificationChain msgs ) {
        return ((FeatureMap.Internal)getMixed()).basicAdd( RifPackage.Literals.DOCUMENT_ROOT__XMLCONTENT,
                                                           newXMLCONTENT,
                                                           msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setXMLCONTENT( XmlContentXmlContent newXMLCONTENT ) {
        ((FeatureMap.Internal)getMixed()).set( RifPackage.Literals.DOCUMENT_ROOT__XMLCONTENT, newXMLCONTENT );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getID() {
        return iD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setID( String newID ) {
        String oldID = iD;
        iD = newID;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.DOCUMENT_ROOT__ID,
            oldID,
            iD ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
        case RifPackage.DOCUMENT_ROOT__MIXED:
            return ((InternalEList)getMixed()).basicRemove( otherEnd, msgs );
        case RifPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            return ((InternalEList)getXMLNSPrefixMap()).basicRemove( otherEnd, msgs );
        case RifPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            return ((InternalEList)getXSISchemaLocation()).basicRemove( otherEnd, msgs );
        case RifPackage.DOCUMENT_ROOT__ACCESSPOLICY:
            return basicSetACCESSPOLICY( null, msgs );
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONCOMPLEX:
            return basicSetATTRIBUTEDEFINITIONCOMPLEX( null, msgs );
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONENUMERATION:
            return basicSetATTRIBUTEDEFINITIONENUMERATION( null, msgs );
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONSIMPLE:
            return basicSetATTRIBUTEDEFINITIONSIMPLE( null, msgs );
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
            return basicSetATTRIBUTEVALUEEMBEDDEDDOCUMENT( null, msgs );
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDFILE:
            return basicSetATTRIBUTEVALUEEMBEDDEDFILE( null, msgs );
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEENUMERATION:
            return basicSetATTRIBUTEVALUEENUMERATION( null, msgs );
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEFILEREFERENCE:
            return basicSetATTRIBUTEVALUEFILEREFERENCE( null, msgs );
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUESIMPLE:
            return basicSetATTRIBUTEVALUESIMPLE( null, msgs );
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEXMLDATA:
            return basicSetATTRIBUTEVALUEXMLDATA( null, msgs );
        case RifPackage.DOCUMENT_ROOT__BINARYCONTENT:
            return basicSetBINARYCONTENT( null, msgs );
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONBINARYFILE:
            return basicSetDATATYPEDEFINITIONBINARYFILE( null, msgs );
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONBOOLEAN:
            return basicSetDATATYPEDEFINITIONBOOLEAN( null, msgs );
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONDOCUMENT:
            return basicSetDATATYPEDEFINITIONDOCUMENT( null, msgs );
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONENUMERATION:
            return basicSetDATATYPEDEFINITIONENUMERATION( null, msgs );
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONINTEGER:
            return basicSetDATATYPEDEFINITIONINTEGER( null, msgs );
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONREAL:
            return basicSetDATATYPEDEFINITIONREAL( null, msgs );
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONSTRING:
            return basicSetDATATYPEDEFINITIONSTRING( null, msgs );
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONXMLDATA:
            return basicSetDATATYPEDEFINITIONXMLDATA( null, msgs );
        case RifPackage.DOCUMENT_ROOT__EMBEDDEDVALUE:
            return basicSetEMBEDDEDVALUE( null, msgs );
        case RifPackage.DOCUMENT_ROOT__ENUMVALUE:
            return basicSetENUMVALUE( null, msgs );
        case RifPackage.DOCUMENT_ROOT__RELATIONGROUP:
            return basicSetRELATIONGROUP( null, msgs );
        case RifPackage.DOCUMENT_ROOT__RIF:
            return basicSetRIF( null, msgs );
        case RifPackage.DOCUMENT_ROOT__SPECGROUP:
            return basicSetSPECGROUP( null, msgs );
        case RifPackage.DOCUMENT_ROOT__SPECHIERARCHY:
            return basicSetSPECHIERARCHY( null, msgs );
        case RifPackage.DOCUMENT_ROOT__SPECHIERARCHYROOT:
            return basicSetSPECHIERARCHYROOT( null, msgs );
        case RifPackage.DOCUMENT_ROOT__SPECOBJECT:
            return basicSetSPECOBJECT( null, msgs );
        case RifPackage.DOCUMENT_ROOT__SPECRELATION:
            return basicSetSPECRELATION( null, msgs );
        case RifPackage.DOCUMENT_ROOT__SPECTYPE:
            return basicSetSPECTYPE( null, msgs );
        case RifPackage.DOCUMENT_ROOT__XHTMLCONTENT:
            return basicSetXHTMLCONTENT( null, msgs );
        case RifPackage.DOCUMENT_ROOT__XMLCONTENT:
            return basicSetXMLCONTENT( null, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch (featureID) {
        case RifPackage.DOCUMENT_ROOT__MIXED:
            if( coreType ) return getMixed();
            return ((FeatureMap.Internal)getMixed()).getWrapper();
        case RifPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            if( coreType ) return getXMLNSPrefixMap();
            else return getXMLNSPrefixMap().map();
        case RifPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            if( coreType ) return getXSISchemaLocation();
            else return getXSISchemaLocation().map();
        case RifPackage.DOCUMENT_ROOT__ACCESSPOLICY:
            return getACCESSPOLICY();
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONCOMPLEX:
            return getATTRIBUTEDEFINITIONCOMPLEX();
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONENUMERATION:
            return getATTRIBUTEDEFINITIONENUMERATION();
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONSIMPLE:
            return getATTRIBUTEDEFINITIONSIMPLE();
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
            return getATTRIBUTEVALUEEMBEDDEDDOCUMENT();
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDFILE:
            return getATTRIBUTEVALUEEMBEDDEDFILE();
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEENUMERATION:
            return getATTRIBUTEVALUEENUMERATION();
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEFILEREFERENCE:
            return getATTRIBUTEVALUEFILEREFERENCE();
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUESIMPLE:
            return getATTRIBUTEVALUESIMPLE();
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEXMLDATA:
            return getATTRIBUTEVALUEXMLDATA();
        case RifPackage.DOCUMENT_ROOT__BINARYCONTENT:
            return getBINARYCONTENT();
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONBINARYFILE:
            return getDATATYPEDEFINITIONBINARYFILE();
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONBOOLEAN:
            return getDATATYPEDEFINITIONBOOLEAN();
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONDOCUMENT:
            return getDATATYPEDEFINITIONDOCUMENT();
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONENUMERATION:
            return getDATATYPEDEFINITIONENUMERATION();
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONINTEGER:
            return getDATATYPEDEFINITIONINTEGER();
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONREAL:
            return getDATATYPEDEFINITIONREAL();
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONSTRING:
            return getDATATYPEDEFINITIONSTRING();
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONXMLDATA:
            return getDATATYPEDEFINITIONXMLDATA();
        case RifPackage.DOCUMENT_ROOT__EMBEDDEDVALUE:
            return getEMBEDDEDVALUE();
        case RifPackage.DOCUMENT_ROOT__ENUMVALUE:
            return getENUMVALUE();
        case RifPackage.DOCUMENT_ROOT__RELATIONGROUP:
            return getRELATIONGROUP();
        case RifPackage.DOCUMENT_ROOT__RIF:
            return getRIF();
        case RifPackage.DOCUMENT_ROOT__SPECGROUP:
            return getSPECGROUP();
        case RifPackage.DOCUMENT_ROOT__SPECHIERARCHY:
            return getSPECHIERARCHY();
        case RifPackage.DOCUMENT_ROOT__SPECHIERARCHYROOT:
            return getSPECHIERARCHYROOT();
        case RifPackage.DOCUMENT_ROOT__SPECOBJECT:
            return getSPECOBJECT();
        case RifPackage.DOCUMENT_ROOT__SPECRELATION:
            return getSPECRELATION();
        case RifPackage.DOCUMENT_ROOT__SPECTYPE:
            return getSPECTYPE();
        case RifPackage.DOCUMENT_ROOT__XHTMLCONTENT:
            return getXHTMLCONTENT();
        case RifPackage.DOCUMENT_ROOT__XMLCONTENT:
            return getXMLCONTENT();
        case RifPackage.DOCUMENT_ROOT__ID:
            return getID();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eSet( int featureID, Object newValue ) {
        switch (featureID) {
        case RifPackage.DOCUMENT_ROOT__MIXED:
            ((FeatureMap.Internal)getMixed()).set( newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set( newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            ((EStructuralFeature.Setting)getXSISchemaLocation()).set( newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__ACCESSPOLICY:
            setACCESSPOLICY( (AccessPolicy)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONCOMPLEX:
            setATTRIBUTEDEFINITIONCOMPLEX( (AttributeDefinitionComplex)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONENUMERATION:
            setATTRIBUTEDEFINITIONENUMERATION( (AttributeDefinitionEnumeration)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONSIMPLE:
            setATTRIBUTEDEFINITIONSIMPLE( (AttributeDefinitionSimple)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
            setATTRIBUTEVALUEEMBEDDEDDOCUMENT( (AttributeValueEmbeddedDocument)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDFILE:
            setATTRIBUTEVALUEEMBEDDEDFILE( (AttributeValueEmbeddedFile)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEENUMERATION:
            setATTRIBUTEVALUEENUMERATION( (AttributeValueEnumeration)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEFILEREFERENCE:
            setATTRIBUTEVALUEFILEREFERENCE( (AttributeValueFileReference)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUESIMPLE:
            setATTRIBUTEVALUESIMPLE( (AttributeValueSimple)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEXMLDATA:
            setATTRIBUTEVALUEXMLDATA( (AttributeValueXmlData)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__BINARYCONTENT:
            setBINARYCONTENT( (BinaryContent)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONBINARYFILE:
            setDATATYPEDEFINITIONBINARYFILE( (DatatypeDefinitionBinaryFile)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONBOOLEAN:
            setDATATYPEDEFINITIONBOOLEAN( (DatatypeDefinitionBoolean)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONDOCUMENT:
            setDATATYPEDEFINITIONDOCUMENT( (DatatypeDefinitionDocument)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONENUMERATION:
            setDATATYPEDEFINITIONENUMERATION( (DatatypeDefinitionEnumeration)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONINTEGER:
            setDATATYPEDEFINITIONINTEGER( (DatatypeDefinitionInteger)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONREAL:
            setDATATYPEDEFINITIONREAL( (DatatypeDefinitionReal)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONSTRING:
            setDATATYPEDEFINITIONSTRING( (DatatypeDefinitionString)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONXMLDATA:
            setDATATYPEDEFINITIONXMLDATA( (DatatypeDefinitionXmlData)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__EMBEDDEDVALUE:
            setEMBEDDEDVALUE( (EmbeddedValue)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__ENUMVALUE:
            setENUMVALUE( (EnumValue)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__RELATIONGROUP:
            setRELATIONGROUP( (RelationGroup)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__RIF:
            setRIF( (Rif)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__SPECGROUP:
            setSPECGROUP( (SpecGroup)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__SPECHIERARCHY:
            setSPECHIERARCHY( (SpecHierarchy)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__SPECHIERARCHYROOT:
            setSPECHIERARCHYROOT( (SpecHierarchyRoot)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__SPECOBJECT:
            setSPECOBJECT( (SpecObject)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__SPECRELATION:
            setSPECRELATION( (SpecRelation)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__SPECTYPE:
            setSPECTYPE( (SpecType)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__XHTMLCONTENT:
            setXHTMLCONTENT( (XhtmlContent)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__XMLCONTENT:
            setXMLCONTENT( (XmlContentXmlContent)newValue );
            return;
        case RifPackage.DOCUMENT_ROOT__ID:
            setID( (String)newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eUnset( int featureID ) {
        switch (featureID) {
        case RifPackage.DOCUMENT_ROOT__MIXED:
            getMixed().clear();
            return;
        case RifPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            getXMLNSPrefixMap().clear();
            return;
        case RifPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            getXSISchemaLocation().clear();
            return;
        case RifPackage.DOCUMENT_ROOT__ACCESSPOLICY:
            setACCESSPOLICY( (AccessPolicy)null );
            return;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONCOMPLEX:
            setATTRIBUTEDEFINITIONCOMPLEX( (AttributeDefinitionComplex)null );
            return;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONENUMERATION:
            setATTRIBUTEDEFINITIONENUMERATION( (AttributeDefinitionEnumeration)null );
            return;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONSIMPLE:
            setATTRIBUTEDEFINITIONSIMPLE( (AttributeDefinitionSimple)null );
            return;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
            setATTRIBUTEVALUEEMBEDDEDDOCUMENT( (AttributeValueEmbeddedDocument)null );
            return;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDFILE:
            setATTRIBUTEVALUEEMBEDDEDFILE( (AttributeValueEmbeddedFile)null );
            return;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEENUMERATION:
            setATTRIBUTEVALUEENUMERATION( (AttributeValueEnumeration)null );
            return;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEFILEREFERENCE:
            setATTRIBUTEVALUEFILEREFERENCE( (AttributeValueFileReference)null );
            return;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUESIMPLE:
            setATTRIBUTEVALUESIMPLE( (AttributeValueSimple)null );
            return;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEXMLDATA:
            setATTRIBUTEVALUEXMLDATA( (AttributeValueXmlData)null );
            return;
        case RifPackage.DOCUMENT_ROOT__BINARYCONTENT:
            setBINARYCONTENT( (BinaryContent)null );
            return;
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONBINARYFILE:
            setDATATYPEDEFINITIONBINARYFILE( (DatatypeDefinitionBinaryFile)null );
            return;
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONBOOLEAN:
            setDATATYPEDEFINITIONBOOLEAN( (DatatypeDefinitionBoolean)null );
            return;
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONDOCUMENT:
            setDATATYPEDEFINITIONDOCUMENT( (DatatypeDefinitionDocument)null );
            return;
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONENUMERATION:
            setDATATYPEDEFINITIONENUMERATION( (DatatypeDefinitionEnumeration)null );
            return;
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONINTEGER:
            setDATATYPEDEFINITIONINTEGER( (DatatypeDefinitionInteger)null );
            return;
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONREAL:
            setDATATYPEDEFINITIONREAL( (DatatypeDefinitionReal)null );
            return;
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONSTRING:
            setDATATYPEDEFINITIONSTRING( (DatatypeDefinitionString)null );
            return;
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONXMLDATA:
            setDATATYPEDEFINITIONXMLDATA( (DatatypeDefinitionXmlData)null );
            return;
        case RifPackage.DOCUMENT_ROOT__EMBEDDEDVALUE:
            setEMBEDDEDVALUE( (EmbeddedValue)null );
            return;
        case RifPackage.DOCUMENT_ROOT__ENUMVALUE:
            setENUMVALUE( (EnumValue)null );
            return;
        case RifPackage.DOCUMENT_ROOT__RELATIONGROUP:
            setRELATIONGROUP( (RelationGroup)null );
            return;
        case RifPackage.DOCUMENT_ROOT__RIF:
            setRIF( (Rif)null );
            return;
        case RifPackage.DOCUMENT_ROOT__SPECGROUP:
            setSPECGROUP( (SpecGroup)null );
            return;
        case RifPackage.DOCUMENT_ROOT__SPECHIERARCHY:
            setSPECHIERARCHY( (SpecHierarchy)null );
            return;
        case RifPackage.DOCUMENT_ROOT__SPECHIERARCHYROOT:
            setSPECHIERARCHYROOT( (SpecHierarchyRoot)null );
            return;
        case RifPackage.DOCUMENT_ROOT__SPECOBJECT:
            setSPECOBJECT( (SpecObject)null );
            return;
        case RifPackage.DOCUMENT_ROOT__SPECRELATION:
            setSPECRELATION( (SpecRelation)null );
            return;
        case RifPackage.DOCUMENT_ROOT__SPECTYPE:
            setSPECTYPE( (SpecType)null );
            return;
        case RifPackage.DOCUMENT_ROOT__XHTMLCONTENT:
            setXHTMLCONTENT( (XhtmlContent)null );
            return;
        case RifPackage.DOCUMENT_ROOT__XMLCONTENT:
            setXMLCONTENT( (XmlContentXmlContent)null );
            return;
        case RifPackage.DOCUMENT_ROOT__ID:
            setID( ID_EDEFAULT );
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean eIsSet( int featureID ) {
        switch (featureID) {
        case RifPackage.DOCUMENT_ROOT__MIXED:
            return mixed != null && !mixed.isEmpty();
        case RifPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
        case RifPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
        case RifPackage.DOCUMENT_ROOT__ACCESSPOLICY:
            return getACCESSPOLICY() != null;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONCOMPLEX:
            return getATTRIBUTEDEFINITIONCOMPLEX() != null;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONENUMERATION:
            return getATTRIBUTEDEFINITIONENUMERATION() != null;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEDEFINITIONSIMPLE:
            return getATTRIBUTEDEFINITIONSIMPLE() != null;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
            return getATTRIBUTEVALUEEMBEDDEDDOCUMENT() != null;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEEMBEDDEDFILE:
            return getATTRIBUTEVALUEEMBEDDEDFILE() != null;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEENUMERATION:
            return getATTRIBUTEVALUEENUMERATION() != null;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEFILEREFERENCE:
            return getATTRIBUTEVALUEFILEREFERENCE() != null;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUESIMPLE:
            return getATTRIBUTEVALUESIMPLE() != null;
        case RifPackage.DOCUMENT_ROOT__ATTRIBUTEVALUEXMLDATA:
            return getATTRIBUTEVALUEXMLDATA() != null;
        case RifPackage.DOCUMENT_ROOT__BINARYCONTENT:
            return getBINARYCONTENT() != null;
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONBINARYFILE:
            return getDATATYPEDEFINITIONBINARYFILE() != null;
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONBOOLEAN:
            return getDATATYPEDEFINITIONBOOLEAN() != null;
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONDOCUMENT:
            return getDATATYPEDEFINITIONDOCUMENT() != null;
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONENUMERATION:
            return getDATATYPEDEFINITIONENUMERATION() != null;
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONINTEGER:
            return getDATATYPEDEFINITIONINTEGER() != null;
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONREAL:
            return getDATATYPEDEFINITIONREAL() != null;
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONSTRING:
            return getDATATYPEDEFINITIONSTRING() != null;
        case RifPackage.DOCUMENT_ROOT__DATATYPEDEFINITIONXMLDATA:
            return getDATATYPEDEFINITIONXMLDATA() != null;
        case RifPackage.DOCUMENT_ROOT__EMBEDDEDVALUE:
            return getEMBEDDEDVALUE() != null;
        case RifPackage.DOCUMENT_ROOT__ENUMVALUE:
            return getENUMVALUE() != null;
        case RifPackage.DOCUMENT_ROOT__RELATIONGROUP:
            return getRELATIONGROUP() != null;
        case RifPackage.DOCUMENT_ROOT__RIF:
            return getRIF() != null;
        case RifPackage.DOCUMENT_ROOT__SPECGROUP:
            return getSPECGROUP() != null;
        case RifPackage.DOCUMENT_ROOT__SPECHIERARCHY:
            return getSPECHIERARCHY() != null;
        case RifPackage.DOCUMENT_ROOT__SPECHIERARCHYROOT:
            return getSPECHIERARCHYROOT() != null;
        case RifPackage.DOCUMENT_ROOT__SPECOBJECT:
            return getSPECOBJECT() != null;
        case RifPackage.DOCUMENT_ROOT__SPECRELATION:
            return getSPECRELATION() != null;
        case RifPackage.DOCUMENT_ROOT__SPECTYPE:
            return getSPECTYPE() != null;
        case RifPackage.DOCUMENT_ROOT__XHTMLCONTENT:
            return getXHTMLCONTENT() != null;
        case RifPackage.DOCUMENT_ROOT__XMLCONTENT:
            return getXMLCONTENT() != null;
        case RifPackage.DOCUMENT_ROOT__ID:
            return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals( iD );
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (mixed: " );
        result.append( mixed );
        result.append( ", iD: " );
        result.append( iD );
        result.append( ')' );
        return result.toString();
    }

} //DocumentRootImpl
