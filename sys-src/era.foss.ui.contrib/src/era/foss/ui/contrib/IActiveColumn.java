package era.foss.ui.contrib;


/**
 * This interface provides methods for getting
 * and setting the active column of a table
 * @author schorsch
 */
public interface IActiveColumn {
    
    /** get the id of the active table column */
    public int getActiveColumn();
    
    /** set the active column of a table */
    public void setActiveColumn(int activeColumn);
}
