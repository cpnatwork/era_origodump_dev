/**
 * 
 */
package era.foss.model.rif.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import era.foss.model.rif.RifFactory;
import era.foss.model.rif.model.Rif;
import era.foss.model.rif.model.RifSpecObjects;
import era.foss.model.rif.model.SpecObject;
import era.foss.model.rif.model.SpecObjectType;

import junit.framework.TestCase;

/**
 * @author cpn
 * 
 */
public class RifXMLProcessorSutTest extends TestCase {

	private RifXMLProcessorSut sut = null;

	/**
	 * @param name
	 */
	public RifXMLProcessorSutTest(String name) {
		super(name);
		sut = new RifXMLProcessorSut();
	}

	/**
	 * Test method for
	 * {@link org.eclipse.emf.ecore.xmi.util.XMLProcessor#load(java.io.InputStream, java.util.Map)}
	 * .
	 */
	public void testLoadInputStreamMapOfQQ() {
		System.out.println("///// Test: testLoadInputStreamMapOfQQ /////");

		// IN
		InputStream is = null;
		Map<?, ?> options = null;

		// OUT
		Resource resource = null;

		System.out.println("///// preparation phase /////");
		try {
			// URL url = ClassLoader.getSystemResource("rif11.xml");
			// File inFile = new File(url.getFile());
			// is = new FileInputStream(inFile);
			is = getClass().getResourceAsStream("/rif11.xml");
		} catch (Exception e) {
			e.printStackTrace();
			fail("preparation phase raised an exception");
		}

		System.out.println("///// execution phase /////");
		try {
			resource = sut.load(is, options);
		} catch (Exception e) {
			e.printStackTrace();
			fail("execution phase raised an exception");
		}

		System.out.println("///// assertion phase /////");
		try {
			// print the loaded content to System.out:
			resource.save(System.out, Collections.EMPTY_MAP);

			String expectedAuthor = "Stefan Hendrata";
			// FIXME: how to access the RIF root element?
			System.err.println(resource.getContents());
			Rif rif = (Rif) resource.getContents().get(1);
			String actualAuthor = rif.getAuthor();
			assertEquals(expectedAuthor, actualAuthor);

		} catch (Exception e) {
			fail("assertion phase raised an exception");
		}
	}

	/**
	 * Test method for
	 * {@link org.eclipse.emf.ecore.xmi.util.XMLProcessor#save(java.io.OutputStream, org.eclipse.emf.ecore.resource.Resource, java.util.Map)}
	 * .
	 */
	public void testSaveOutputStreamResourceMapOfQQ() {
		System.out
				.println("///// Test: testSaveOutputStreamResourceMapOfQQ /////");

		// IN
		OutputStream outputStream = null;
		Resource resource = null;
		Map<?, ?> options = null;

		// OUT
		File outFile = null;

		System.out.println("///// preparation phase /////");
		try {
			// The actual file:
			outFile = File.createTempFile("testRifXMLProcessor_", ".rif");
			System.err.println("Temporary file used: "
					+ outFile.getAbsolutePath());
			outputStream = new FileOutputStream(outFile);

			// Construct some model:
			RifFactory factory = RifFactory.eINSTANCE;
			Rif rif = factory.createRif();
			RifSpecObjects rifSpecObjects = factory.createRifSpecObjects();
			SpecObject specObj = factory.createSpecObject();
			SpecObjectType specObjType = factory.createSpecObjectType();

			rif.setSpecObjects(rifSpecObjects);
			rifSpecObjects.getSpecObject().add(specObj);
			specObj.setType(specObjType);

			// Get the URI of the model file, such that
			// the Resource creation can apply its extension specific
			// factory dispatching...
			URI fileURI = URI.createFileURI(outFile.getAbsolutePath());
			// Create a resource for this file.
			resource = sut.publicizeCreateResourceSet().createResource(fileURI);

			// Add the model to the resource
			resource.getContents().add(rif);

		} catch (Exception e) {
			e.printStackTrace();
			fail("preparation phase raised an exception");
		}

		System.out.println("///// execution phase /////");
		try {
			sut.save(outputStream, resource, options);
		} catch (Exception e) {
			e.printStackTrace();
			fail("execution phase raised an exception");
		}

		System.out.println("///// assertion phase /////");
		try {
			// re-read the stored content and print to System.out:
			FileInputStream assertionPhaseInputStream = new FileInputStream(
					outFile);
			Resource assertionPhaseResource = sut.load(
					assertionPhaseInputStream, options);
			assertionPhaseResource.save(System.out, Collections.EMPTY_MAP);
		} catch (Exception e) {
			fail("assertion phase raised an exception");
		}
		outFile.delete();

	}

}
