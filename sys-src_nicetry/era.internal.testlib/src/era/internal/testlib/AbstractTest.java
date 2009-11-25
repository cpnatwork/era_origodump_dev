/*
 * NAME: era.internal.testlib.AbstractTest
 */

package era.internal.testlib;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import junit.framework.Assert;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;

/**
 * This is the base class for all tests providing a bunch of helpers.
 *  
 * @author poldi
 */
public abstract class AbstractTest extends Assert {
    
    /**
     * Creates a new test project with the given name in the Eclipse workspace.
     * 
     * @param name the name of the project
     * @since Jul 28, 2009
     */
    protected IProject createProject( String name ) throws Exception {
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IProject project = workspace.getRoot().getProject( name );
        if( project.exists() ) project.delete( true, new NullProgressMonitor() );
        assertNotNull( project );
        assertFalse( project.exists() );
        project.create( new NullProgressMonitor() );
        project.open( new NullProgressMonitor() );
        
        return project;
    }
    
    public InputStream getTestStream( String name ) {        
        return getClass().getClassLoader().getResourceAsStream( "/" + getClass().getPackage().getName().replaceAll( "[.]", "/" ) + "/resources/" + name );        
    }
    
    public URL getTestURL( String name ) {        
        return getClass().getClassLoader().getResource( "/" + getClass().getPackage().getName().replaceAll( "[.]", "/" ) + "/resources/"  + name );
        
    }

    
    /**
     * Copies the InputStream to the OutputStream.
     * 
     * @param is inputStream
     * @param os outputStream
     * @since Jul 29, 2009
     */
    public void copy( InputStream is, OutputStream os ) throws IOException {
        byte[] b = new byte[1024];
        int len;
        while( ( len = is.read( b ) ) >= 0 ) {
            os.write( b, 0, len );
        }
        is.close();
        os.close();
    }
        
} // AbstractTest
