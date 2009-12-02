/*
 * NAME: era.foss.util.log.ResourceStatus
 */

package era.foss.util.log;

import java.net.URI;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;

/**
 * {@link IStatus} with workbench resource information (URI,line,column) that can be added as a marker.
 * 
 * @author poldi
 */
public class ResourceStatus extends Status {

    //
    // private members

    private URI uri;
    private int line;
    private int column;

    /**
     * @param severity
     * @param pluginId
     * @param code
     * @param message
     * @param exception
     * @since Jul 31, 2009
     */
    public ResourceStatus( int severity,
                           String pluginId,
                           URI uri,
                           int line,
                           int column,
                           String message,
                           Throwable exception ) {
        super( severity, pluginId, message, exception );
        this.uri = uri;
        this.line = line;
        this.column = column;
    }

    /**
     * Get an URI to the file.
     * 
     * @return the uri
     * @since Jul 31, 2009
     */
    public URI getUri() {
        return uri;
    }

    /**
     * Get the line in the file.
     * 
     * @return the line
     * @since Jul 31, 2009
     */
    public int getLine() {
        return line;
    }

    /**
     * Get the column in the file.
     * 
     * @return the column
     * @since Jul 31, 2009
     */
    public int getColumn() {
        return column;
    }
    
    /**
     * Creates a marker object and places it to a workspace resource if the uri points to a resource.
     * 
     * @return the marker or null
     * @since Jul 31, 2009
     */
    public IMarker createResourceMarker() {
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        if( workspace == null ) return null;
        IFile file = workspace.getRoot().getFile( new Path( uri.toASCIIString() ) );
        if( file == null ) return null;
        
        IMarker marker;
        try {
            marker = file.createMarker( IMarker.PROBLEM );
            switch( getSeverity() ) {
                case ERROR:
                    marker.setAttribute( IMarker.SEVERITY, IMarker.SEVERITY_ERROR );
                    break;
                case WARNING:
                    marker.setAttribute( IMarker.SEVERITY, IMarker.SEVERITY_WARNING );
                    break;
                case INFO:
                    marker.setAttribute( IMarker.SEVERITY, IMarker.SEVERITY_INFO );
                    break;
                default:
                    marker.setAttribute( IMarker.SEVERITY, IMarker.SEVERITY_INFO );
                    break;
            }
            marker.setAttribute( IMarker.MESSAGE, getMessage() );
            marker.setAttribute( IMarker.LINE_NUMBER, getLine() );
            marker.setAttribute( IMarker.LOCATION, "Line: " + getLine() + ", Column: " + column );
        } catch( CoreException e ) {
            return null;
        }
        
        return marker;
        
    }

} // ResourceStatus
