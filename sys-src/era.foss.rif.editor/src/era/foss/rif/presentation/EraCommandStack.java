/*
 * NAME: era.foss.rif.presentation.RifCommandStack
 */

package era.foss.rif.presentation;

import org.eclipse.emf.common.command.BasicCommandStack;

/**
 * A specialized CommandStack that allows to set a checkpoint and to rollback.
 * 
 * @author cpn
 */
public class EraCommandStack extends BasicCommandStack {

    protected int checkpoint;

    /**
     * 
     * @since 10.03.2010
     */
    public EraCommandStack() {
        super();
        checkpoint = top;
    }

    /**
     * Planting a checkpoint for rollback simply remembers the current position of the CommandStack
     * 
     * @since 10.03.2010
     */
    public void plantCheckpoint() {
        checkpoint = top;
    }

    /**
     * Perform undo operations until the planted position is reached.
     * 
     * @since 10.03.2010
     */
    public void rollback() {
        while (checkpoint < top) {
            assert (canUndo());
            undo();
        }
    }

    /**
     * Perform redo operations until the planted position is reached.
     * 
     * @category just4completeness
     * @since 10.03.2010
     */
    public void forwardreeling() {
        while ((top < checkpoint) && (checkpoint < (commandList.size() - 1))) {
            redo();
        }
    }

    /**
     * Inhibiting undos is like flushing. Additionally the need to save is enforced.
     * 
     * @since 10.03.2010
     */
    public void inhibitUndos() {
        super.flush();
        plantCheckpoint();
        // force the need to save
        super.saveIndex = -2;
    }

    /**
     * A specialized flush operation: flushing implicitly sets a checkpoint for rollback.
     * 
     * @see org.eclipse.emf.common.command.BasicCommandStack#flush()
     * @since 10.03.2010
     */
    public void flush() {
        super.flush();
        plantCheckpoint();
    }

    /**
     * A specialized saveIsDone: saving implicitly sets a checkpoint for rollback.
     * 
     * @see org.eclipse.emf.common.command.BasicCommandStack#saveIsDone()
     * @since 10.03.2010
     */
    public void saveIsDone() {
        super.saveIsDone();
        plantCheckpoint();
    }
}
