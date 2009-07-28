/*
 * NAME: era.foss.model.rif.util.CpnTumble
 */

package era.foss.model.rif.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import era.foss.model.rif.RifFactory;
import era.foss.model.rif.model.DocumentRoot;
import era.foss.model.rif.model.RIF;

/**
 * 
 * @author cpn
 */
public class CpnTumble {

    private static final Logger logger = Logger.getLogger( CpnTumble.class.getName() );

    /**
     * @param args
     * @since 28.07.2009
     */
    public static void main( String[] args ) {
        try {
            xhtmlAsString();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }

    public static void xhtmlAsString() throws Exception {
        File outFile = File.createTempFile( "testRifXMLProcessor_", ".rif" );
        logger.info( "Temporary file used: " + outFile.getAbsolutePath() );
        OutputStream outputStream = new FileOutputStream( outFile );
        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put( "rif", new RifResourceFactoryImpl() );
        URI fileURI = URI.createFileURI( outFile.getAbsolutePath() );
        Resource resource = resourceSet.createResource( fileURI );
        DocumentRoot documentRoot = RifFactory.eINSTANCE.createDocumentRoot();
        RIF rif = RifFactory.eINSTANCE.createRIF();
        // SEE: http://dev.eclipse.org/newslists/news.eclipse.tools.emf/msg37779.html
        // Book book = null; //LibraryFactory.eINSTANCE.createBook();
        // rif.getBooks().add( book );
        documentRoot.setRif( rif );
        resource.getContents().add( documentRoot );
        resource.save( System.out, null );
        Map<Object, Object> options = new HashMap<Object, Object>();
        // options.put( XMLResource.OPTION_ROOT_OBJECTS, Collections.singletonList( book ) );
        resource.save( System.out, options );
    }
}
