/*
 * NAME: era.foss.model.core.model.internal.SystemDocumentRegistry
 */

package era.foss.model.core.model.internal;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Set;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import era.foss.util.extensionpoint.Registry;

/**
 * Via this extension-point system document ar registered.
 * 
 *  System documents are loaded when the {@link Model} singleton is instantiated.
 *  
 * @author poldi
 */
public class SystemDocumentRegistry {
    
    //
    // defines

    /**
     * Id of the extension-point.
     */
    public static final String EXTENSION_POINT = "era.foss.model.core.systemDocument";

    /**
     * The attribute with the path to the document
     */
    public static final String ATTR_DOCUMENT = "document";

    //
    // private members

    private static final Registry<SystemDocumentRegistry> registry = new Registry<SystemDocumentRegistry>();

    /**
     * Path to the document
     */
    private String document = null;

    /**
     * The element from which to query the plug-in
     */
    private IConfigurationElement element = null;

    /**
     * Query all extension for the systenDocument extension-point.
     * 
     * @return List of registration
     * @since Aug 2, 2009
     */
    public static Set<SystemDocumentRegistry> getRegistrations() {
        return registry.getRegistrations( SystemDocumentRegistry.class, EXTENSION_POINT );
    }

    /**
     * Called by the registry for each extension.
     * 
     * @param element The toplevel element
     * @since Aug 2, 2009
     */
    public SystemDocumentRegistry( IConfigurationElement element ) {
        this.element = element;
    }

    /**
     * Get the URI to the document.
     * 
     * @return the document
     * @since Aug 1, 2009
     */
    public URI getDocument() {
        try {
            if( document == null ) return null;
            return getPlugin().getResource( document ).toURI();
        } catch( URISyntaxException e ) {
            return null;
        }        
    }
    
    /**
     * Get the path to the document within the plug-in.
     * 
     * @return The path
     * @since Aug 2, 2009
     */
    public String getPath() {
        return document;
    }
    
    /**
     * Query the plug-in from wich to load the document.
     * 
     * @return The plug-in
     * @since Aug 1, 2009
     */
    public Bundle getPlugin() {  
        return Platform.getBundle( element.getContributor().getName() );
    }

    /**
     * Called by the registry to set the path to the document
     * 
     * @param document the document to set
     * @since Aug 1, 2009
     */
    public void setDocument( String document ) {
        this.document = document;
    }
    
} // SystemDocumentRegistry
