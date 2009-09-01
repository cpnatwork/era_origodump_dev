package era.foss.model.rif.era.internal;

import java.util.Set;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;

import era.foss.model.rif.era.IAdapterFactory;
import era.foss.model.rif.era.IERAObject;
import era.foss.util.extensionpoint.Registry;

/**
 * Creates {@link AdapterFactory} instances.
 * 
 * <p>
 * An AdapterFactory creates {@link Adapter}s for {@link IERAObject} elements.
 * </p>
 * 
 * @author poldi
 */
public class AdapterRegistry {
    
    //
    // defines

    /**
     * Id of the extension-point.
     */
    public static final String EXTENSION_POINT = "era.foss.model.rif.adapter";

    /**
     * The tag for the executable extension
     */
    public static final String TAG_FACTORY = "factory";

    //
    // private members

    private static final Registry<AdapterRegistry> registry = new Registry<AdapterRegistry>();

    /**
     * The toplevel element used to instantiate the factory
     */
    private IConfigurationElement element = null;

    /**
     * Get all extensions.
     * 
     * @return The registered extensions
     * @since Aug 2, 2009
     */
    public static Set<AdapterRegistry> getRegistrations() {
        return registry.getRegistrations( AdapterRegistry.class, EXTENSION_POINT );
    }

    /**
     * Called by the registry for each extension.
     * 
     * @param element The toplevel element
     * @since Aug 2, 2009
     */
    public AdapterRegistry( IConfigurationElement element ) {
        this.element = element;
    }

    /**
     * Creates or returns (factory is a singleton) the registered factory.
     * 
     * @return the factory
     * @since Aug 2, 2009
     */
    public IAdapterFactory createFactory() throws IllegalStateException {
        return (IAdapterFactory)registry.instantiate( element, TAG_FACTORY, IAdapterFactory.class, true );
    }

} // AdapterRegistry
