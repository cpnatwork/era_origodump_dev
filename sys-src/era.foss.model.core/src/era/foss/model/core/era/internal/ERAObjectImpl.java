/*
 * NAME: era.foss.model.core.model.ERAObjectImpl
 */

package era.foss.model.core.era.internal;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import era.foss.model.core.era.IAdapterFactory;
import era.foss.model.core.era.IERAObject;

/**
 * Base class for all ERA objects.
 * @author poldi
 */
public class ERAObjectImpl extends EObjectImpl implements IERAObject {
    
    /**
     * Adds registered adapters.
     * 
     * @since Jun 14, 2009
     */
    public ERAObjectImpl() {
        for( AdapterRegistry registration : AdapterRegistry.getRegistrations() ) {
            IAdapterFactory factory = registration.createFactory();
            if( factory == null ) continue;
            Adapter adapter = factory.adapt( this );
            if( adapter == null ) continue;
            eAdapters().add( adapter );
        }
    }

} // ERAObjectImpl
