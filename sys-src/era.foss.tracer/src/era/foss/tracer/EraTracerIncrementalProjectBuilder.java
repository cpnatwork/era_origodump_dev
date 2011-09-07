package era.foss.tracer;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

public class EraTracerIncrementalProjectBuilder extends IncrementalProjectBuilder {

    @SuppressWarnings("unchecked")
    protected IProject[] build( int kind, Map args, IProgressMonitor monitor ) throws CoreException {
        if( kind == IncrementalProjectBuilder.FULL_BUILD ) {
            fullBuild( monitor );
        } else {
            IResourceDelta delta = getDelta( getProject() );
            if( delta == null ) {
                fullBuild( monitor );
            } else {
                incrementalBuild( delta, monitor );
            }
        }
        return null;
    }

    protected void startupOnInitialize() {
        // add builder init logic here
    }

    protected void clean( IProgressMonitor monitor ) {
        // add builder clean logic here
    }

    private void fullBuild( final IProgressMonitor monitor ) throws CoreException {
        try {
            getProject().accept( new EraTracerBuildVisitor() );
        } catch( CoreException e ) {
        }
    }

    private static class EraTracerBuildVisitor implements IResourceVisitor {
        public boolean visit( IResource res ) {
            // build the specified resource.
            // return true to continue visiting children.
            return true;
        }
    }

    private void incrementalBuild( IResourceDelta delta, IProgressMonitor monitor ) throws CoreException {
        // the visitor does the work.
        delta.accept( new EraTracerBuildDeltaVisitor() );
    }

    private static class EraTracerBuildDeltaVisitor implements IResourceDeltaVisitor {
        public boolean visit( IResourceDelta delta ) {
            IResource res = delta.getResource();
            switch (delta.getKind()) {
            case IResourceDelta.ADDED:
                System.out.print( "Resource " );
                System.out.print( res.getFullPath() );
                System.out.println( " was added." );
                break;
            case IResourceDelta.REMOVED:
                System.out.print( "Resource " );
                System.out.print( res.getFullPath() );
                System.out.println( " was removed." );
                break;
            case IResourceDelta.CHANGED:
                System.out.print( "Resource " );
                System.out.print( res.getFullPath() );
                System.out.println( " has changed." );
                break;
            }
            return true; // visit the children
        }
    }
}