/*
 * %%FILE_HEADER%%
 *
 * NAME: era.internal.tools.ecore.AbstractTools
 * CREATED: May 19, 2009
 */

package era.internal.tools.ecore;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * Base class defining common methods for tools.
 * 
 * @author poldi
 */
public abstract class AbstractTools {

    //
    // defines

    /**
     * Maximum characters returned by {@link #abrev(String)}
     */
    public static int ABREV_LENGTH = 50;

    //
    // private members

    /**
     * true to print info message
     */
    private boolean verbose = false;

    /**
     * Query if info messages are written.
     * 
     * @return true if info messages are written
     */
    public boolean isVerbose() {
        return verbose;
    }

    /**
     * Changing printing of info messages.
     * 
     * @param verbose true to be verbose
     */
    public void setVerbose( boolean verbose ) {
        this.verbose = verbose;
    }

    /**
     * File extension for resource files
     */
    protected abstract String[] getResourceFileExtensions();

    /**
     * Creates a new resource for the given XMI file and wraps a ResourceSet around.
     * 
     * <p>
     * This method uses {@link AbstractTools#getResourceFileExtensions()} to get file extension.
     * </p>
     * 
     * @param xmi The file to load or save
     * @return the resource
     */
    protected Resource getResource( String xmi ) {
        ResourceSet resourceSet = new ResourceSetImpl();
        for( String extension : getResourceFileExtensions() ) {
            resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put( extension,
                                                                                     new XMIResourceFactoryImpl() );
        }
        return resourceSet.createResource( URI.createFileURI( xmi ) );
    }

    /**
     * Loads an EMF resource from a XMI file and returns the package in it.
     * 
     * @param inputXMI The input ecore XMI
     * @return the first package in the resource
     */
    protected EPackage loadResource( String inputXMI ) {
        Resource inputResource = getResource( inputXMI );
        try {
            inputResource.load( null );
        } catch( IOException e ) {
            fail( e );
        }

        return (EPackage)inputResource.getContents().get( 0 );
    }

    /**
     * Saves the given package into the given ecore file.
     * 
     * @param outputXMI The XML to write
     * @param pkg the package to save
     */
    protected void saveResource( String outputXMI, EPackage pkg ) {
        Resource outputResource = getResource( outputXMI );
        outputResource.getContents().add( pkg );
        try {
            outputResource.save( null );
        } catch( IOException e ) {
            fail( e );
        }
    }

    /**
     * CamelCases a ShortName of the form [A-Z](-[A-Z]+)*
     * 
     * @param name The shortName
     * @param firstLower true if the first char should be lower case
     * @return the CamelCased name
     */
    protected String camelCase( String name, boolean firstLower ) {
        String[] chunks = name.split( "-" );
        StringBuilder b = new StringBuilder();
        boolean first = true;
        for( String chunk : chunks ) {
            chunk = chunk.toLowerCase();
            if( !first || !firstLower ) {
                b.append( Character.toUpperCase( chunk.charAt( 0 ) ) );
                b.append( chunk.substring( 1 ) );
            } else {
                b.append( chunk );
            }
        }
        return b.toString();
    }

    /**
     * Shortens a string for printing to max {@link #ABREV_LENGTH} characters.
     * 
     * @param message The message to shorten
     * @return the result message
     */
    protected String abrev( String message ) {
        return message.length() < ABREV_LENGTH ? message : "..."
            + message.substring( message.length() - ABREV_LENGTH );
    }

    /**
     * Print an info message.
     * 
     * @param message The message to print
     */
    protected void println( String message ) {
        System.out.println( message );
    }

    /**
     * Print an info message if running verbose.
     * 
     * @param message The message to print
     */
    protected void info( String message ) {
        if( !verbose ) return;
        System.out.println( message );
    }

    /**
     * Prints an error message and exists with code 1.
     * 
     * @param e The exception
     */
    protected void fail( String message ) {
        System.err.println( "** ERROR: " + message );
        System.exit( 1 );
    }

    /**
     * Prints an error message and exists with code 1.
     * 
     * @param e The exception
     */
    protected void fail( Exception e ) {
        fail( e.getCause().getMessage() );
    }

}
