package era.foss.model.core.era.internal;

import java.util.Set;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.common.notify.AdapterFactory;

import era.foss.model.core.era.IAdapterFactory;
import era.foss.util.extensionpoint.Registry;

/**
 * Creates {@link AdapterFactory} instances.
 * 
 * @author poldi
 */
public class AdapterRegistry {
    
    //
    // defines

    /**
     * Id of the extension-point.
     */
    public static final String EXTENSION_PONT = "era.foss.model.core.adapter";

    /**
     * The tag for the executable extension
     */
    public static final String TAG_FACTORY = "factory";

    //
    // private members

    private static final Registry<AdapterRegistry> registry = new Registry<AdapterRegistry>();

    private IConfigurationElement element = null;

    public static Set<AdapterRegistry> getRegistrations() {
        return registry.getRegistrations( AdapterRegistry.class, EXTENSION_PONT );
    }

    public AdapterRegistry( IConfigurationElement element ) {
        this.element = element;
    }

    public IAdapterFactory createFactory() throws IllegalStateException {
        return (IAdapterFactory)registry.instantiate( element, TAG_FACTORY, IAdapterFactory.class, true );
    }

} // AdapterRegistry
