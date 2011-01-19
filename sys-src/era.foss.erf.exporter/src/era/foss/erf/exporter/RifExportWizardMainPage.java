
package era.foss.erf.exporter;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class RifExportWizardMainPage extends WizardPage {
    
    protected RifExportWizardMainPage( String pageName ) {
        super( pageName );
        this.setTitle( Activator.getPlugin().getString( "export.wizard.rif.description" ) );
        this.setErrorMessage( Activator.getPlugin().getString( "export.wizard.rif.error.selectDir") );
    }

    // Text field holding the directory name where the output is written to 
    private Text DirName;
    private boolean isComplete;
    
    
    @Override
    public void createControl( Composite parent ) {
                
        // create the composite to hold the widgets
        Composite composite =  new Composite(parent, SWT.NULL);

        // create the desired layout for this wizard page
        GridLayout gl = new GridLayout();
        gl.numColumns = 3;
        composite.setLayout(gl);
        
        /* Create Label, text field and button for selecting the output 
           directory */
        new Label (composite, SWT.NONE).setText("Directory");             
        
        DirName = new Text(composite, SWT.BORDER);
        DirName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        
        Button buttonSelectFile = new Button(composite, SWT.PUSH);
        buttonSelectFile.setText("Browse...");
        buttonSelectFile.addListener(SWT.Selection, new Listener() {
          public void handleEvent(Event event) {
            DirectoryDialog dirDialog = new DirectoryDialog(Display.getCurrent().getActiveShell(), SWT.MULTI);
            String dirName = dirDialog.open();
            if (dirName != null )
            {
             DirName.setText( dirName );
             RifExportWizardMainPage.this.setErrorMessage( null );
             RifExportWizardMainPage.this.setComplete(true);
             RifExportWizardMainPage.this.getWizard().canFinish();
            }
            else
            {
             DirName.setText( "" );
             RifExportWizardMainPage.this.setErrorMessage( Activator.getPlugin().getString( "export.wizard.rif.error.selectDir") );
             RifExportWizardMainPage.this.setComplete(false);
            }
            RifExportWizardMainPage.this.getWizard().getContainer().updateButtons();

          }
        });
        
        // use composite as main widget for this page
        setControl(composite);
    }


    protected void setComplete( boolean complete) {
        this.isComplete = complete;
    }

    public boolean isPageComplete()
    {
        return this.isComplete;
    }

}
