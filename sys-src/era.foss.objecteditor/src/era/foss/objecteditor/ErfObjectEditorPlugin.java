/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.objecteditor;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.ui.EclipseUIPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the Erf editor plugin.
 */
public final class ErfObjectEditorPlugin extends EMFPlugin {
    /**
     * Keep track of the singleton.
     */
    public static final ErfObjectEditorPlugin INSTANCE = new ErfObjectEditorPlugin();

    /**
     * Keep track of the singleton.
     */
    private static Implementation plugin;

    /**
     * Create the instance.
     */
    public ErfObjectEditorPlugin() {
        super( new ResourceLocator[]{} );
    }

    /**
     * Returns the singleton instance of the Eclipse plugin.
     * @return the singleton instance.
     */
    @Override
    public ResourceLocator getPluginResourceLocator() {
        return plugin;
    }

    /**
     * Returns the singleton instance of the Eclipse plugin.
     * @return the singleton instance.
     */
    public static Implementation getPlugin() {
        return plugin;
    }

    /**
     * The actual implementation of the Eclipse <b>Plugin</b>.
     * @generated
     */
    public static class Implementation extends EclipseUIPlugin {
        /**
         * Creates an instance.
         */
        public Implementation() {
            super();

            // Remember the static instance.
            //
            plugin = this;
        }
    }

}
