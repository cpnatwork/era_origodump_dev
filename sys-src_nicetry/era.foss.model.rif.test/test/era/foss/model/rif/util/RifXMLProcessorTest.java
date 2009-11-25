/**
 * 
 */
package era.foss.model.rif.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;

import era.foss.model.rif.RifFactory;
import era.foss.model.rif.model.AttributeValueEmbeddedDocument;
import era.foss.model.rif.model.DocumentRoot;
import era.foss.model.rif.model.Rif;
import era.foss.model.rif.model.RifSpecObjects;
import era.foss.model.rif.model.SpecObject;
import era.foss.model.rif.model.Type;
import era.foss.model.rif.model.Values;
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
            Rif rif = ((DocumentRoot)resource.getContents().get( 0 )).getRif();

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
        File tempOutFile = null;

        logger.info(  "///// preparation phase /////" );
        try {
            // The actual file:
            tempOutFile = File.createTempFile( "testRifXMLProcessor_", ".rif" );
            logger.info( "Temporary file used: " + tempOutFile.getAbsolutePath() );
            outputStream = new FileOutputStream( tempOutFile );

            // Construct some model:
            Rif rif = RifFactory.eINSTANCE.createRif();
            RifSpecObjects rifSpecObjects = RifFactory.eINSTANCE.createRifSpecObjects();
            SpecObject specObj = RifFactory.eINSTANCE.createSpecObject();
            Type specObjType = RifFactory.eINSTANCE.createType();

            rif.setSpecObjects( rifSpecObjects );
            rifSpecObjects.getSpecObject().add( specObj );
            specObj.setType( specObjType );

            // Get the  of the model file, such that
            // the Resource creation can apply its extension specific
            // RifFactory.eINSTANCE dispatching...
            URI fileURI = URI.createFileURI( tempOutFile.getAbsolutePath() );
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
            FileInputStream assertionPhaseInputStream = new FileInputStream( tempOutFile );
            Resource assertionPhaseResource = sut.load( assertionPhaseInputStream, options );
            assertionPhaseResource.save( System.out, Collections.EMPTY_MAP );
        } catch( Exception e ) {
            e.printStackTrace();
            fail( "assertion phase raised an exception" );
        }
        tempOutFile.delete();

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
        	// INFO: any unknown features are parsed (generically?)
        	// Basic Infos from: http://www.java-forum.org/xml-und-co/86329-eclipse-modeling-framework-auch-fuer-elektomagnetisches-feld-modell-um-alle-moeglichen-attribute-auszulesen.html
        	options = new HashMap<Object, Object>();
            options.put( XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, true);
            resource = sut.load( is, options );
        } catch( Exception e ) {
            e.printStackTrace();
            fail( "execution phase raised an exception" );
        }

        logger.info( "///// assertion phase /////" );
        try {
            // print the loaded content to System.out and extract RIF model
            resource.save( System.out, Collections.EMPTY_MAP );
            Rif rif = ((DocumentRoot)resource.getContents().get( 0 )).getRif();
            
            // assume an XhtmlContent at a specific position in the document:
            XhtmlContent actualXhtmlContent = rif.getSpecObjects().getSpecObject().get( 0 ).getValues().getAttributeValueEmbeddedDocument().get( 0 ).getXhtmlContent();

            String xhtmlString = xhtmlcontentToString(resource, actualXhtmlContent);
            logger.info( xhtmlString );
            
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
        File tempOutFile = null;

        logger.info(  "///// preparation phase /////" );
        try {
            // The actual file:
            tempOutFile = File.createTempFile( "testRifXMLProcessor_", ".rif" );
            logger.info( "Temporary file used: " + tempOutFile.getAbsolutePath() );
            outputStream = new FileOutputStream( tempOutFile );

            // Construct some model:
            Rif rif = RifFactory.eINSTANCE.createRif();
            RifSpecObjects rifSpecObjects = RifFactory.eINSTANCE.createRifSpecObjects();
            SpecObject specObj = RifFactory.eINSTANCE.createSpecObject();
            Values specObjVals = RifFactory.eINSTANCE.createValues();
            AttributeValueEmbeddedDocument attrValEmbDoc = RifFactory.eINSTANCE.createAttributeValueEmbeddedDocument();
            
            String xhtmlString = "<p>Hello World</p>";
            XhtmlContent xhtmlContent = stringToXhtmlcontent(xhtmlString);
            
            rif.setSpecObjects( rifSpecObjects );
            rifSpecObjects.getSpecObject().add( specObj );
            specObj.setValues( specObjVals );
            specObjVals.getAttributeValueEmbeddedDocument().add( attrValEmbDoc );
            attrValEmbDoc.setXhtmlContent( xhtmlContent );
            
            // Get the URI of the model file, such that
            // the Resource creation can apply its extension specific
            // factory dispatching...
            URI fileURI = URI.createFileURI( tempOutFile.getAbsolutePath() );
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
            FileInputStream assertionPhaseInputStream = new FileInputStream( tempOutFile );
            Resource assertionPhaseResource = sut.load( assertionPhaseInputStream, options );
            assertionPhaseResource.save( System.out, Collections.EMPTY_MAP );
        } catch( Exception e ) {
            e.printStackTrace();
            fail( "assertion phase raised an exception" );
        }
        tempOutFile.delete();
    }

    /**
     * Serializes an XhtmlContent object into a String.
     * A Resource object is instrumented, which must contain the XhtmlContent object.
     * 
     * @param resource The Resource object that contains the actual XhtmlContent object
     * @param actualXhtmlContent The actual XhtmlContent object that is to be serialized into a String
     * @return The String serialization of the XhtmlContent object
     * @throws IOException
     */
    private String xhtmlcontentToString(Resource resource, XhtmlContent actualXhtmlContent) throws IOException {
        
    	HashMap<Object, Object> options = new HashMap<Object, Object>();
        options.put( XMLResource.OPTION_ROOT_OBJECTS, Collections.singletonList( actualXhtmlContent ) );
        OutputStream xhtmlContentOutputStream = new ByteArrayOutputStream( );
        resource.save( xhtmlContentOutputStream, options );
        return xhtmlContentOutputStream.toString();
	}
    
	private XhtmlContent stringToXhtmlcontent(String xhtmlString) {
		// FIXME
		// INFO? http://www.theserverside.com/tt/articles/article.tss?l=BindingXMLJava
		XhtmlContent xhtmlContent = RifFactory.eINSTANCE.createXhtmlContent();
		FeatureMapUtil.addText(xhtmlContent.getAny(), xhtmlString);
		return xhtmlContent;
	}
    
}
