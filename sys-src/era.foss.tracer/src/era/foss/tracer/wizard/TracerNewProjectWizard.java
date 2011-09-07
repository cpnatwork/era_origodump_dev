/**
 * 
 */
package era.foss.tracer.wizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

/**
 * @author haberstu
 * 
 */
public class TracerNewProjectWizard extends Wizard implements INewWizard {

	@SuppressWarnings("unused")
    private IProject mProject;

	/**
	 * 
	 */
	public TracerNewProjectWizard() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 * org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		Object o = selection.getFirstElement();
		assert o instanceof IProject;
		mProject = (IProject) o;
	}

	@Override
	public void addPages() {
		addPage(new TracerConfigurationPage());
		super.addPages();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		// TODO: Add nature to mProject
		return true;
	}

	public static class TracerConfigurationPage extends WizardPage {

		public TracerConfigurationPage() {
			super("Tracer", "Tracer", null );
			// TODO Auto-generated constructor stub
		}

		@Override
		public void createControl(Composite parent) {
			setControl(new Label(parent, SWT.NONE) );

		}
	}

}
