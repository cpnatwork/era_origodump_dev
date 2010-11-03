package era.foss.ui.contrib;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;


public class TableViewerExtensions 
{
    public static void addActiveColumnDetection( final TableViewer tableViewer ) {
        tableViewer.getTable().addMouseListener( new MouseAdapter() {

            public void mouseDown( MouseEvent e ) {
                int x = 0;
                for( int i = 0; i < tableViewer.getTable().getColumnCount(); i++ ) {
                    x += tableViewer.getTable().getColumn( i ).getWidth();
                    if( e.x <= x ) {
                        ((IActiveColumn) tableViewer).setActiveColumn(i);
                        break;
                    }
                }
            }

        } );
    }
}
