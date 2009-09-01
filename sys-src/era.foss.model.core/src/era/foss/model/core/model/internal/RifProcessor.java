/*
 * NAME: era.foss.model.core.model.internal.RifLoader
 */

package era.foss.model.core.model.internal;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

import era.foss.model.rif.model.DocumentRoot;
import era.foss.model.rif.model.Rif;
import era.foss.model.rif.util.RifXMLProcessor;

/**
 * Handles load and save of Rif files to URIs.
 * 
 * @author poldi
 */
public class RifProcessor extends RifXMLProcessor {

    /**
     * 
     * @since Jul 30, 2009
     */
    public RifProcessor() {
        super();
    }

    /**
     * Load a Rif model from a given URI.
     * 
     * @param uri the URI to parse
     * @param errors if not set to null parser errors are reported
     * @param warnings if not set to null parser warnings are reported
     * @return the Rif root object or null if no rif model was found
     * @since Jul 30, 2009
     */
    public Rif load( URI uri, List<Diagnostic> errors, List<Diagnostic> warnings ) throws IOException {
        Resource resource = createResource( uri );
        resource.load( loadOptions );
        if( errors != null ) errors.addAll( resource.getErrors() );
        if( warnings != null ) errors.addAll( resource.getWarnings() );
        for( EObject o : resource.getContents() ) {
            if( o instanceof DocumentRoot ) return ((DocumentRoot)o).getRif();
            if( o instanceof Rif ) return (Rif)o;
        }
        
        return null;
    }

    /**
     * Saves a given Rif tree to a given URI.
     * 
     * @param uri the URI to save to
     * @param rif the rif to load
     * @since Jul 30, 2009
     */
    public void save( URI uri, Rif rif ) throws IOException {
        Resource resource = createResource( uri );
        resource.save( saveOptions );
    }

    /**
     * Creates a resource to load or save an URI.
     * 
     * @param uri the URI to load or save
     * @return the resource
     * @since Jul 30, 2009
     */
    private Resource createResource( URI uri ) {
        ResourceSet resourceSet = createResourceSet();
        Resource resource = resourceSet.createResource( uri );
        resourceSet.getPackageRegistry().putAll( registry );
        return resource;

    }

} // RifProcessor
