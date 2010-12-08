/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.erf.util;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the Rif edit plugin.
 */
public final class Activator extends EMFPlugin {
    /**
     * Keep track of the singleton.
     */
    public static final Activator INSTANCE = new Activator();

    /**
     * Keep track of the singleton.
     */
    private static Implementation plugin;

    /**
     * Create the instance.
     */
    public Activator() {
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
     */
    public static class Implementation extends EclipsePlugin {
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