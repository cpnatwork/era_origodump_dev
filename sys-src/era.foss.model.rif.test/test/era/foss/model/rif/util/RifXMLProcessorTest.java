/**
 * 
 */
package era.foss.model.rif.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMLResource;

import era.foss.model.rif.RifFactory;
import era.foss.model.rif.model.AttributeValueEmbeddedDocument;
import era.foss.model.rif.model.DocumentRoot;
import era.foss.model.rif.model.RIF;
import era.foss.model.rif.model.RifSpecObjects;
import era.foss.model.rif.model.SpecObject;
import era.foss.model.rif.model.SpecObjectType;
import era.foss.model.rif.model.SpecObjectValues;
import era.foss.model.rif.model.XhtmlContent;

/**
 * @author cpn
 * 
 */
public class RifXMLProcessorTest extends TestCase {

    private static final Logger logger = Logger.getLogger( RifXMLProcessorTest.class.getName() );

    private LiberatedRifXMLProcessor sut = null;

    /**
     * @param name
     */
    public RifXMLProcessorTest( String name ) {
        super( name );
        sut = new LiberatedRifXMLProcessor();
    }

    /**
     * Test method for {@link org.eclipse.emf.ecore.xmi.util.XMLProcessor#load(java.io.InputStream, java.util.Map)} .
     */
    public void testLoad_testfile_rif11() {

        // IN
        InputStream is = null;
        Map<?, ?> options = null;

        // OUT
        Resource resource = null;

        logger.info( "///// preparation phase /////" );
        try {
            // URL url = ClassLoader.getSystemResource("rif11.xml");
            // File inFile = new File(url.getFile());
            // is = new FileInputStream(inFile);
            is = getClass().getResourceAsStream( "/rif11.xml" );
        } catch( Exception e ) {
            e.printStackTrace();
            fail( "preparation phase raised an exception" );
        }

        logger.info( "///// execution phase /////" );
        try {
            resource = sut.load( is, options );
        } catch( Exception e ) {
            e.printStackTrace();
            fail( "execution phase raised an exception" );
        }

        logger.info( "///// assertion phase /////" );
        try {
            // print the loaded content to System.out and extract RIF model
            resource.save( System.out, Collections.EMPTY_MAP );
            RIF rif = ((DocumentRoot)resource.getContents().get( 0 )).getRif();

            String actualAuthor = rif.getAuthor();
            String expectedAuthor = "Stefan Hendrata";
            assertEquals( expectedAuthor, actualAuthor );
        } catch( Exception e ) {
            e.printStackTrace();
            fail( "assertion phase raised an exception" );
        }
    }

    /**
     * Test method for
     * {@link org.eclipse.emf.ecore.xmi.util.XMLProcessor#save(java.io.OutputStream, org.eclipse.emf.ecore.resource.Resource, java.util.Map)}
     * .
     */
    public void testSave_minimalmodel() {

        // IN
        OutputStream outputStream = null;
        Resource resource = null;
        Map<?, ?> options = null;

        // OUT
        File outFile = null;

        logger.info(  "///// preparation phase /////" );
        try {
            // The actual file:
            outFile = File.createTempFile( "testRifXMLProcessor_", ".rif" );
            logger.info( "Temporary file used: " + outFile.getAbsolutePath() );
            outputStream = new FileOutputStream( outFile );

            // Construct some model:
            RIF rif = RifFactory.eINSTANCE.createRIF();
            RifSpecObjects rifSpecObjects = RifFactory.eINSTANCE.createRifSpecObjects();
            SpecObject specObj = RifFactory.eINSTANCE.createSpecObject();
            SpecObjectType specObjType = RifFactory.eINSTANCE.createSpecObjectType();

            rif.setSpecObjects( rifSpecObjects );
            rifSpecObjects.getSpecObject().add( specObj );
            specObj.setType( specObjType );

            // Get the  of the model file, such that
            // the Resource creation can apply its extension specific
            // RifFactory.eINSTANCE dispatching...
            URI fileURI = URI.createFileURI( outFile.getAbsolutePath() );
            ResourceSet resourceSet = new ResourceSetImpl();
            // HowTo-Template: resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());
            resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("rif", new RifResourceFactoryImpl());
            resource = resourceSet.createResource( fileURI );
            
            // Add the model to the resource
            resource.getContents().add( rif );

        } catch( Exception e ) {
            e.printStackTrace();
            fail( "preparation phase raised an exception" );
        }

        logger.info( "///// execution phase /////" );
        try {
            sut.save( outputStream, resource, options );
        } catch( Exception e ) {
            e.printStackTrace();
            fail( "execution phase raised an exception" );
        }

        logger.info( "///// assertion phase /////" );
        try {
            // re-read the stored content and print to System.out:
            FileInputStream assertionPhaseInputStream = new FileInputStream( outFile );
            Resource assertionPhaseResource = sut.load( assertionPhaseInputStream, options );
            assertionPhaseResource.save( System.out, Collections.EMPTY_MAP );
        } catch( Exception e ) {
            e.printStackTrace();
            fail( "assertion phase raised an exception" );
        }
        outFile.delete();

    }

    /**
     * Test method for {@link org.eclipse.emf.ecore.xmi.util.XMLProcessor#load(java.io.InputStream, java.util.Map)} .
     */
    public void testLoad_testfile_xhtml() {

        // IN
        InputStream is = null;
        Map<Object, Object> options = null;

        // OUT
        Resource resource = null;

        logger.info( "///// preparation phase /////" );
        try {
            // URL url = ClassLoader.getSystemResource("rif11.xml");
            // File inFile = new File(url.getFile());
            // is = new FileInputStream(inFile);
            is = getClass().getResourceAsStream( "/xhtmltestfile.xml" );
        } catch( Exception e ) {
            e.printStackTrace();
            fail( "preparation phase raised an exception" );
        }

        logger.info( "///// execution phase /////" );
        try {
            resource = sut.load( is, options );
        } catch( Exception e ) {
            e.printStackTrace();
            fail( "execution phase raised an exception" );
        }

        logger.info( "///// assertion phase /////" );
        try {
            // print the loaded content to System.out and extract RIF model
            resource.save( System.out, Collections.EMPTY_MAP );
            RIF rif = ((DocumentRoot)resource.getContents().get( 0 )).getRif();
            
            // assume an XhtmlContent at a specific position in the document:
            XhtmlContent actualXhtmlContent = rif.getSpecObjects().getSpecObject().get( 0 ).getValues().getAttributeValueEmbeddedDocument().get( 0 ).getXhtmlContent();

            options = new HashMap<Object, Object>();
            options.put( XMLResource.OPTION_ROOT_OBJECTS, Collections.singletonList( actualXhtmlContent ) );
            
            String outstring = new String();
            resource.save( new PrintStream( outstring ), options );
            logger.info( outstring  );
            
        } catch( Exception e ) {
            e.printStackTrace();
            fail( "assertion phase raised an exception" );
        }
    }
    
    /**
     * Test method for
     * {@link org.eclipse.emf.ecore.xmi.util.XMLProcessor#save(java.io.OutputStream, org.eclipse.emf.ecore.resource.Resource, java.util.Map)}
     * .
     */
    public void testSave_xhtmlmodel() {

        // IN
        OutputStream outputStream = null;
        Resource resource = null;
        Map<?, ?> options = null;

        // OUT
        File outFile = null;

        logger.info(  "///// preparation phase /////" );
        try {
            // The actual file:
            outFile = File.createTempFile( "testRifXMLProcessor_", ".rif" );
            logger.info( "Temporary file used: " + outFile.getAbsolutePath() );
            outputStream = new FileOutputStream( outFile );

            // Construct some model:
            RIF rif = RifFactory.eINSTANCE.createRIF();
            RifSpecObjects rifSpecObjects = RifFactory.eINSTANCE.createRifSpecObjects();
            SpecObject specObj = RifFactory.eINSTANCE.createSpecObject();
            SpecObjectValues specObjVals = RifFactory.eINSTANCE.createSpecObjectValues();
            AttributeValueEmbeddedDocument attrValEmbDoc = RifFactory.eINSTANCE.createAttributeValueEmbeddedDocument();
            XhtmlContent xhtmlContent = RifFactory.eINSTANCE.createXhtmlContent();
            FeatureMap featureMap = xhtmlContent.getAny();
            
            // FIXME: how to construct some XHTML any feature shit...?
            EStructuralFeature structFeature = null;
            Object object = null;
            
            rif.setSpecObjects( rifSpecObjects );
            rifSpecObjects.getSpecObject().add( specObj );
            specObj.setValues( specObjVals );
            specObjVals.getAttributeValueEmbeddedDocument().add( attrValEmbDoc );
            attrValEmbDoc.setXhtmlContent( xhtmlContent );
            featureMap.add( structFeature, object );
            
            // Get the URI of the model file, such that
            // the Resource creation can apply its extension specific
            // factory dispatching...
            URI fileURI = URI.createFileURI( outFile.getAbsolutePath() );
            ResourceSet resourceSet = new ResourceSetImpl();
            // HowTo-Template: resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());
            resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("rif", new RifResourceFactoryImpl());
            resource = resourceSet.createResource( fileURI );
            
            // Add the model to the resource
            resource.getContents().add( rif );

        } catch( Exception e ) {
            e.printStackTrace();
            fail( "preparation phase raised an exception" );
        }

        logger.info( "///// execution phase /////" );
        try {
            sut.save( outputStream, resource, options );
        } catch( Exception e ) {
            e.printStackTrace();
            fail( "execution phase raised an exception" );
        }

        logger.info( "///// assertion phase /////" );
        try {
            // re-read the stored content and print to System.out:
            FileInputStream assertionPhaseInputStream = new FileInputStream( outFile );
            Resource assertionPhaseResource = sut.load( assertionPhaseInputStream, options );
            assertionPhaseResource.save( System.out, Collections.EMPTY_MAP );
        } catch( Exception e ) {
            e.printStackTrace();
            fail( "assertion phase raised an exception" );
        }
        outFile.delete();

    }
    
}
