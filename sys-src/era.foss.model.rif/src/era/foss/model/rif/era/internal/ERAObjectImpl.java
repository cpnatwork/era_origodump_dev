/*
 * NAME: era.foss.model.core.internal.ERAObjectImpl
 */

package era.foss.model.rif.era.internal;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import era.foss.model.rif.era.IAdapterFactory;
import era.foss.model.rif.era.IERAObject;

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

    /**
     * @return true if object is an identifiable
     * @since Jun 19, 2009
     */
    @Override
    public boolean isIdentifiable() {
        return this.eClass().getEStructuralFeature( "identifier" ) != null;
    }
    
    

} // ERAObjectImpl
