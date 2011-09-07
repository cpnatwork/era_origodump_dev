package era.foss.tracer;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;

/**
 * @see http 
 *      ://source.jboss.org/browse/JBossTools/trunk/jsf/plugins/org.jboss.tools.jsf.ui/src/org/jboss/tools/jsf/ui/action
 *      /AddJSFNatureActionDelegate.java
 * @see http 
 *      ://source.jboss.org/browse/JBossTools/trunk/common/plugins/org.jboss.tools.common.model.ui/src/org/jboss/tools
 *      /common/model/ui/action/AddNatureActionDelegate.java
 */
public class RemoveEraTracerNatureActionDelegate extends AbstractEraTracerNatureActionDelegate {

    protected void doRun() {
        if( project == null ) return;

        try {
            IProjectDescription desc = project.getDescription();
            ICommand[] commands = desc.getBuildSpec();
            boolean found = false;

            for (int i = 0; i < commands.length; ++i) {
               if (commands[i].getBuilderName().equals(BUILDER_ID)) {
                  found = true;
                  break;
               }
            }
            if (found) { 
               //add builder to project
               ICommand command = desc.newCommand();
               command.setBuilderName(BUILDER_ID);
               ICommand[] newCommands = new ICommand[commands.length - 1];

               // Remove it before other builders.
               // FIXME implement removal
               
               desc.setBuildSpec(newCommands);
               project.setDescription(desc, null);
            }
        } catch( CoreException e ) {
            e.printStackTrace();
        }
    }
}
