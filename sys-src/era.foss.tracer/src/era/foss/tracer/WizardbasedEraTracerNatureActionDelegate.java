package era.foss.tracer;

import org.eclipse.jface.wizard.IWizard;

import era.foss.tracer.wizard.TracerNewProjectWizard;

/**
 * @see http 
 *      ://source.jboss.org/browse/JBossTools/trunk/jsf/plugins/org.jboss.tools.jsf.ui/src/org/jboss/tools/jsf/ui/action
 *      /AddJSFNatureActionDelegate.java
 * @see http 
 *      ://source.jboss.org/browse/JBossTools/trunk/common/plugins/org.jboss.tools.common.model.ui/src/org/jboss/tools
 *      /common/model/ui/action/AddNatureActionDelegate.java
 */
public class WizardbasedEraTracerNatureActionDelegate extends AbstractEraTracerNatureActionDelegate {

    protected void doRun() {
        if( project == null ) return;

        @SuppressWarnings("unused")
        IWizard wizard = new TracerNewProjectWizard();
        // FIXME initialize the Wizard and construct the WizardDialog
//        WizardDialog dialog = new WizardDialog( getWorkbench().getActiveWorkbenchWindow().getShell(), wizard );
//        dialog.open();
    }
}
