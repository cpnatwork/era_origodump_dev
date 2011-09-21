package era.foss.tracer;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMemberValuePair;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

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

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.core.resources.IncrementalProjectBuilder#startupOnInitialize()
     */
    protected void startupOnInitialize() {
        // TODO add builder init logic here
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.core.resources.IncrementalProjectBuilder#clean(org.eclipse.core.runtime.IProgressMonitor)
     */
    protected void clean( IProgressMonitor monitor ) {
        // TODO add builder clean logic here
    }

    private void fullBuild( final IProgressMonitor monitor ) throws CoreException {
        try {
            getProject().accept( new EraTracerBuildVisitor() );
        } catch( CoreException e ) {
        }
    }

    private static class EraTracerBuildVisitor implements IResourceVisitor {
        public boolean visit( IResource res ) {
            // ignore anything but files
            if( res.getType() != IResource.FILE ) return true;
            // ignore anything but Java file
            String ext = res.getFileExtension();
            ext = (ext == null) ? "" : ext;
            if( !ext.equalsIgnoreCase( "java" ) ) return true;
            // handle it
            IFile file = (IFile)res;
            handleJavaFile( file );
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
            // ignore anything but files
            if( res.getType() != IResource.FILE ) return true;
            // ignore anything but Java file
            String ext = res.getFileExtension();
            ext = (ext == null) ? "" : ext;
            if( !ext.equalsIgnoreCase( "java" ) ) return true;
            // handle it
            IFile file = (IFile)res;

            switch (delta.getKind()) {
            case IResourceDelta.ADDED:
                handleJavaFile( file );
                break;
            case IResourceDelta.REMOVED:
                System.out.print( "Resource " );
                System.out.print( res.getFullPath() );
                System.out.println( " was removed." );
                break;
            case IResourceDelta.CHANGED:
                handleJavaFile( file );
                break;
            }
            return true; // visit the children
        }
    }

    private static void handleJavaFile( IFile file ) {
        // .java file are the same as ICompilationUnit
        // (@see http://help.eclipse.org/indigo/index.jsp?topic=%2Forg.eclipse.jdt.doc.isv%2Fguide%2Fjdt_int_model.htm)
        IJavaElement javaelem = JavaCore.create( file );
        assert (javaelem instanceof ICompilationUnit);
        ICompilationUnit compilunit = (ICompilationUnit)javaelem;

        // FIXME (cpn) generalize the parsing
        IType itype = compilunit.findPrimaryType();

        try {
            for( IMethod imeth : itype.getMethods() ) {
                for( IAnnotation ianno : imeth.getAnnotations() ) {

                    if( !ianno.getElementName().endsWith( "Requirement" ) ) continue;

                    IMemberValuePair[] imvp = null;
                    try {
                        imvp = ianno.getMemberValuePairs();
                    } catch( JavaModelException e ) {
                        System.out.println( "No annotation attributes in '@Requirement' method"
                            + imeth.getElementName() );
                        continue;
                    }
                    for( int i = 0; i < imvp.length; i++ ) {
                        if( imvp[i].getMemberName().equals( "reqid" ) ) {
                            // FIXME (cpn) do something useful with the reqid
                            System.out.println( imvp[i].getValue() );
                        }
                    }
                }
            }
        } catch( JavaModelException e ) {
            e.printStackTrace();
        }

        // dummy
        System.out.print( "Resource " );
        System.out.print( file.getFullPath() );
        System.out.println( " has been built." );
    }
}