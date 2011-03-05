package era.foss.ui.contrib;

import org.eclipse.jface.resource.ImageDescriptor;

import org.eclipse.ui.plugin.AbstractUIPlugin;

public class Activator extends AbstractUIPlugin {
    
    /**
     * Keep track of the singleton.
     */
    public static final Activator INSTANCE = new Activator();
    
    public static final String PLUGIN_ID = "era.foss.ui.contrib"; //$NON-NLS-1$
    
    private final static String ICONS_PATH = "$nl$/icons/full/";//$NON-NLS-1$
    
    /**
     * Get the workbench image with the given path relative to
     * ICON_PATH.
     * @param relativePath
     * @return ImageDescriptor
     */
    public static ImageDescriptor getViewImageDescriptor(String relativePath){
        return imageDescriptorFromPlugin(PLUGIN_ID, ICONS_PATH + relativePath);
    }
    

}
