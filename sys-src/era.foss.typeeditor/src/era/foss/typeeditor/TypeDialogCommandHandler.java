package era.foss.typeeditor;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * The CommandHandler for the ERA type dialog.
 * <p>
 * This class is registered as extension point="org.eclipse.ui.handlers" in plugin.xml.
 * <p>
 * Upon {@link #execute(ExecutionEvent)} it instantiates the ERA type dialog.
 * 
 * @author cpn
 */
public class TypeDialogCommandHandler extends AbstractHandler {

    public Object execute( ExecutionEvent event ) throws ExecutionException {
        IEditorPart editor = HandlerUtil.getActiveEditor( event );

        TypeDialog typeEditor = new TypeDialog( Display.getCurrent().getActiveShell(), editor );
        typeEditor.open();
        return null;
    }

}
