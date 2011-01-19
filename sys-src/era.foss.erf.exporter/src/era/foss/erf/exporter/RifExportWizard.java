package era.foss.erf.exporter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;

public class RifExportWizard extends Wizard implements IExportWizard {

    // List of files to process
    private List<IFile> ErfFileList;

    @SuppressWarnings("unchecked")
    @Override
    public void init( IWorkbench workbench, IStructuredSelection selection ) {
        ErfFileList = new ArrayList<IFile>();
        Iterator fileIter = selection.iterator();
        while (fileIter.hasNext()) {
            // check if selected element is a file
            Object file = fileIter.next();
            if( file instanceof IFile ) {
                try {
                    if( ((IFile)file).getContentDescription()
                                     .getContentType()
                                     .getId()
                                     .equals( "era.foss.erf.ErfContentType" ) ) {
                        ErfFileList.add( (IFile)file );
                    }
                } catch( CoreException e ) {
                }
            }
        }

        if( !ErfFileList.isEmpty() ) {
            this.addPage( new RifExportWizardMainPage( "Rif" ) );
        }

    }

    @Override
    public boolean performFinish() {
        for (IFile file : ErfFileList)
        {
            //do export here
        }
        return true;
    }

}
