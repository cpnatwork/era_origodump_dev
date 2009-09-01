/*
 * NAME: era.foss.model.rif.era.AbstractAdapter
 */

package era.foss.model.rif.era;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

/**
 * An abstract implementation of an {@link Adapter} that handles that target.
 * 
 * @author poldi
 */
public abstract class AbstractAdapter implements Adapter {
    
    //
    // private members
    
    private Notifier target  = null; 

    /**
     * 
     * @since Jun 20, 2009
     */
    public AbstractAdapter() {
    }

    /**
     * @see org.eclipse.emf.common.notify.Adapter#getTarget()
     * @since Jun 20, 2009
     */
    @Override
    public Notifier getTarget() {
        return target;
    }

    /**
     * @see org.eclipse.emf.common.notify.Adapter#isAdapterForType(java.lang.Object)
     * @since Jun 20, 2009
     */
    @Override
    public boolean isAdapterForType( Object type ) {
        return true;
    }

    /**
     * @see org.eclipse.emf.common.notify.Adapter#setTarget(org.eclipse.emf.common.notify.Notifier)
     * @since Jun 20, 2009
     */
    @Override
    public void setTarget( Notifier newTarget ) {
        target = newTarget;
    }

} // AbstractAdapter
