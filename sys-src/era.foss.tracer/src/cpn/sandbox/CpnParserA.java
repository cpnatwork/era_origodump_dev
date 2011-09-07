package cpn.sandbox;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.IMemberValuePair;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;


public class CpnParserA extends AbstractHandler {

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
     */
    public Object execute( ExecutionEvent event ) throws ExecutionException {
        try {
            foo();
        } catch( JavaModelException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public void foo() throws JavaModelException {
        IProject iproj = ResourcesPlugin.getWorkspace().getRoot().getProject( "era.foss.tracer.test" );
        IType itype = JavaCore.create( iproj ).findType( "era.foss.tracer.test.CpnAnnotatedForTracing" );
        IMethod imeth = itype.getMethod( "toString", new String[]{} );
        IAnnotation ianno = imeth.getAnnotation( "Requirement" );
        IMemberValuePair[] imvp = ianno.getMemberValuePairs();
        for( int i = 0; i < imvp.length; i++ ) {
            if( imvp[i].getMemberName().equals( "reqid" ) ) {
                System.out.println( imvp[i].getValue() );
            }
        }
    }

}
