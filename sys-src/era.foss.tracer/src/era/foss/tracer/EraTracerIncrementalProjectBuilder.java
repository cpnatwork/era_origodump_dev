package era.foss.tracer;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
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
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

public class EraTracerIncrementalProjectBuilder extends IncrementalProjectBuilder {

    private static final String MARKER_ID = Activator.PLUGIN_ID + ".reqmarker";

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

                    // FIXME (cpn): no foolproof match on Req-Annotation
                    if( !ianno.getElementName().endsWith( "Requirement" ) ) continue;

                    // MATCHED a Requirement Annotation
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
                            String reqid = (String)imvp[i].getValue();

                            int position = ianno.getSourceRange().getOffset();
                            // transform ICompUnit into CompUnit for offset-transformation (calculation)
                            CompilationUnit cu = parse( compilunit );
                            int lineNumber = cu.getLineNumber( position );
                            int char_start = cu.getColumnNumber( position );
                            int char_end = char_start + ianno.getElementName().length() + 1;
                            System.out.println( "found reqid: "
                                + reqid
                                + " at line: "
                                + lineNumber
                                + " at column: "
                                + char_start );
                            addMarker( file, lineNumber, char_start, char_end, reqid );
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

    /**
     * Reads a ICompilationUnit and creates the AST DOM for manipulating the Java source file
     * 
     * @param unit
     * @return
     */

    private static CompilationUnit parse( ICompilationUnit unit ) {
        ASTParser parser = ASTParser.newParser( AST.JLS3 );
        parser.setKind( ASTParser.K_COMPILATION_UNIT );
        parser.setSource( unit );
        parser.setResolveBindings( true );
        return (CompilationUnit)parser.createAST( null ); // parse
    }

    /**
     * Helpful information:
     * http://www.ibm.com/developerworks/opensource/tutorials/os-eclipse-plugin-guide/section2.html
     * http://help.eclipse.org/indigo/index.jsp?topic=%2Forg.eclipse.platform.doc.isv%2Fguide%2FresAdv_markers.htm
     * http://books.gigatux.nl/mirror/eclipseplugins/032142672X/ch14lev1sec2.html
     * http://wiki.eclipse.org/FAQ_Why_don't_my_markers_appear_in_the_editor's_vertical_ruler%3F
     * 
     * @param file
     * @param lineNumber
     * @param charStart
     * @param charEnd
     * @param reqid
     */
    private static void addMarker( IFile file, int lineNumber, int charStart, int charEnd, String reqid ) {
        try {
            IMarker marker = file.createMarker( MARKER_ID );
            // from TEXTMARKER
            marker.setAttribute( IMarker.LINE_NUMBER, lineNumber );
            // WARN: setting the CHAR_START/_END tangles with the LINE_NUMBER !?!
            // http://www.eclipse.org/forums/index.php/m/294625/#msg_294625
//            marker.setAttribute( IMarker.CHAR_START, charStart );
//            marker.setAttribute( IMarker.CHAR_END, charEnd );
            // from special ERF REQMARKER
            marker.setAttribute( "reqid", reqid );
        } catch( CoreException e ) {
        }
    }
}