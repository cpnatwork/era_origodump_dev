/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.util;

import era.foss.model.core.rif.RifPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RifXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RifXMLProcessor() {
        super( (EPackage.Registry.INSTANCE) );
        RifPackage.eINSTANCE.eClass();
    }

    /**
     * Register for "*" and "xml" file extensions the RifResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Map getRegistrations() {
        if( registrations == null ) {
            super.getRegistrations();
            registrations.put( XML_EXTENSION, new RifResourceFactoryImpl() );
            registrations.put( STAR_EXTENSION, new RifResourceFactoryImpl() );
        }
        return registrations;
    }

} //RifXMLProcessor
