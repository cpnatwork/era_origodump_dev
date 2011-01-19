
package era.foss.erf.exporter;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;

public class RifExportWizard extends Wizard implements IExportWizard {
 
    @Override
    public void init( IWorkbench workbench, IStructuredSelection selection )
    {
       this.addPage( new RifExportWizardMainPage("Rif") );
       this.getWindowTitle();
    }

    @Override
    public boolean performFinish() {
        System.out.println("Do Export");
        return true;
    }

}
