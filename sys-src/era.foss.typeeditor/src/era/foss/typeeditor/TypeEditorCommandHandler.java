package era.foss.typeeditor;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;



public class TypeEditorCommandHandler extends AbstractHandler {

    public Object execute(ExecutionEvent event) throws ExecutionException {
        IEditorPart editor =  HandlerUtil.getActiveEditor(event);
       
        TypeEditor typeEditor = new TypeEditor(Display.getCurrent().getActiveShell(),editor);
        typeEditor.open();
        return null;
    }

}
