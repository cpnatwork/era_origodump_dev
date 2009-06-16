/*
 * NAME: era.foss.model.core.model.IAdapterFactory
 */

package era.foss.model.core.era;

import org.eclipse.emf.common.notify.Adapter;

/**
 * 
 * @author poldi
 */
public interface IAdapterFactory {
    
    public Adapter adapt( IERAObject object );

}
