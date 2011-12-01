package era.foss.objecteditor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.IViewerObservableValue;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseTrackAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import era.foss.erf.AttributeDefinition;
import era.foss.erf.AttributeDefinitionSimple;
import era.foss.erf.AttributeValue;
import era.foss.erf.AttributeValueSimple;
import era.foss.erf.DatatypeDefinition;
import era.foss.erf.ErfPackage;
import era.foss.erf.SpecObject;
import era.foss.erf.View;
import era.foss.erf.ViewElement;
import era.foss.erf.impl.ErfFactoryImpl;

class SpecObjectViewerRow extends Composite {

    /** Context for databinding */
    private DataBindingContext dbc;

    /** Delete button */
    private Label deleteButton;

    /** Master observable for the chosen view */
    static private IViewerObservableValue viewMaster;

    /** The editing domain used for modifications on the model */
    static private EditingDomain editingDomain;

    /**
     * Map holding the element of the chose
     */
    private final List<ViewElement> viewElementList = new ArrayList<ViewElement>();

    /**
     * Map holding the element of the chosen view together with the control showing the attribute value
     */
    LinkedHashMap<ViewElement, Control> viewElementControlMap = new LinkedHashMap<ViewElement, Control>();

    /**
     * The composite holding the widgets for the AttributeValues displayed according to the chosen view
     */
    Composite attributeValueComposite;

    /**
     * offset of the SpecObject associated with this row
     */
    private int specObjectOffset;

    /** List of selection listeners of this row */
    private List<SelectionListener> selectionListenerList = new LinkedList<SelectionListener>();

    private SpecObject specObject;

    /**
     * Constructor of the Row Composite
     * 
     * @param parent
     * @param style
     */
    public SpecObjectViewerRow( Composite parent, int style ) {
        super( parent, style );
        sortViewElements();
        doLayout();
        createSelectionListener();
    }

    /**
     * Set the master of the view to observe
     * 
     * @param viewMaster master observable
     */
    public static void setViewMaster( IViewerObservableValue viewMaster ) {
        SpecObjectViewerRow.viewMaster = viewMaster;
    }

    /**
     * Set the editing domain used for operations on an AttributeValue of the associated SpecObject
     * 
     * @param editingDomain
     */
    public static void setEditingDomain( EditingDomain editingDomain ) {
        SpecObjectViewerRow.editingDomain = editingDomain;
    }

    /**
     * Sort the elements in the view according to row number and position in row
     */
    private void sortViewElements() {

        // get view
        View selectedView = (View)SpecObjectViewerRow.viewMaster.getValue();
        if( selectedView == null ) {
            return;
        }

        // check if there are elements to be shown in the selected view
        if( selectedView.getViewElements().size() == 0 ) {
            return;
        }

        // Sort view elements in visual order (row first, index in list second)
        viewElementList.addAll( selectedView.getViewElements() );
        Collections.sort( viewElementList, new Comparator<ViewElement>() {
            @Override
            public int compare( ViewElement elem1, ViewElement elem2 ) {
                int elemRow1 = elem1.getEditorRowNumber();
                int elemRow2 = elem2.getEditorRowNumber();
                return elemRow1 != elemRow2 ? elemRow1 - elemRow2 : viewElementList.indexOf( elem1 )
                    - viewElementList.indexOf( elem2 );
            }
        } );

    }

    /**
     * Layout the row:
     * <ul>
     * <li>Delete button</li>
     * <li>Controls for the editing the SpecObject</li>
     * </ul>
     * 
     */
    private void doLayout() {
        this.setLayout( new GridLayout( 2, false ) );

        createDeleteButton();

        createSpecObjectControls();
    }

    /**
     * create the delete button for the row
     */
    private void createDeleteButton() {
        // create delete button
        Composite buttonComposite = new Composite( this, SWT.BORDER );
        buttonComposite.setLayoutData( new GridData( SWT.LEFT, SWT.CENTER, false, false, 0, 0 ) );
        buttonComposite.setLayout( new FillLayout() );

        deleteButton = new Label( buttonComposite, SWT.NONE );
        deleteButton.addMouseTrackListener( new MouseTrackAdapter() {

            @Override
            public void mouseEnter( MouseEvent e ) {
                ((Label)(e.widget)).setImage( PlatformUI.getWorkbench()
                                                        .getSharedImages()
                                                        .getImage( ISharedImages.IMG_TOOL_DELETE ) );
            }

            @Override
            public void mouseExit( MouseEvent e ) {
                ((Label)(e.widget)).setImage( PlatformUI.getWorkbench()
                                                        .getSharedImages()
                                                        .getImage( ISharedImages.IMG_TOOL_DELETE_DISABLED ) );
            }

        } );

        deleteButton.setImage( PlatformUI.getWorkbench()
                                         .getSharedImages()
                                         .getImage( ISharedImages.IMG_TOOL_DELETE_DISABLED ) );

    }

    /**
     * create controls for elements in the chosen view
     */
    private void createSpecObjectControls() {

        // Only create controls in case there are elements to show
        if( viewElementList.size() == 0 ) {
            return;
        }

        // calculate maxColumnSpan
        int maxColumnSpan = calculateMaxColumnSpan();

        attributeValueComposite = new Composite( this, SWT.NONE );
        attributeValueComposite.setLayout( new GridLayout( maxColumnSpan, true ) );
        attributeValueComposite.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );

        // get row number of first view element
        int curRow = viewElementList.get( 0 ).getEditorRowNumber();

        int curSpan = 0;
        for( final ViewElement viewElement : viewElementList ) {
            final int r = viewElement.getEditorRowNumber();
            // do we have a row switch at this point of iteration?
            if( r > curRow ) {
                // WARNING: this code block is not executed for the end of the last line!
                // 1) finalize intermediate rows:
                int paddingColumnSpan = maxColumnSpan - curSpan;
                if( paddingColumnSpan > 0 ) {
                    // padding: fill up this line with an empty label
                    Label labelLongName = new Label( attributeValueComposite, SWT.NULL );
                    labelLongName.setText( "" );
                    labelLongName.setLayoutData( new GridData(
                        SWT.FILL,
                        SWT.CENTER,
                        false,
                        false,
                        paddingColumnSpan,
                        1 ) );
                }
                // 2) reset for new row
                curRow = r;
                curSpan = 0;
            }

            // track current row span for the "end of row" padding above
            final int controlSpan = viewElement.getEditorColumnSpan();
            curSpan += controlSpan;

            // initialize label
            if( viewElement.isEditorShowLabel() ) {
                curSpan++;
                Label labelLongName = new Label( attributeValueComposite, SWT.NULL );
                labelLongName.setText( viewElement.getAttributeDefinition().getLongName() + ":" );
                labelLongName.setLayoutData( new GridData( SWT.RIGHT, SWT.CENTER, false, false ) );
            }

            Control currentControl = null;
            DatatypeDefinition dataTypeDefinition = viewElement.getAttributeDefinition().getType();
            if( dataTypeDefinition != null ) {
                switch (dataTypeDefinition.eClass().getClassifierID()) {
                case ErfPackage.DATATYPE_DEFINITION_INTEGER:
                case ErfPackage.DATATYPE_DEFINITION_STRING:
                    currentControl = new Text( attributeValueComposite, SWT.BORDER );
                    break;
                }
            }

            if( currentControl != null ) {
                currentControl.setLayoutData( new GridData( SWT.FILL, SWT.CENTER, true, false, controlSpan, 1 ) );
                viewElementControlMap.put( viewElement, currentControl );
            }
        }
    }

    /**
     * calculate the maximum column span required for displaying all the elements configured in the view
     * 
     * @return maximum Column span
     */
    private int calculateMaxColumnSpan() {
        int maxColumnSpan = 0;

        // get row number of first entry
        int curRow = viewElementList.get( 0 ).getEditorRowNumber();

        int curSpan = 0;
        for( ViewElement viewElement : viewElementList ) {
            int r = viewElement.getEditorRowNumber();
            // do we have a row switch at this point of iteration?
            if( r > curRow ) {
                // WARNING: this code block is not executed for the end of the last line!
                // reset
                curRow = r;
                curSpan = 0;
            }
            curSpan += viewElement.getEditorColumnSpan() + (viewElement.isEditorShowLabel() ? 1 : 0);
            // always check the column count: is it a new maximum?
            if( maxColumnSpan < curSpan ) {
                maxColumnSpan = curSpan;
            }
        }
        return maxColumnSpan;
    }

    /**
     * Unbind the current row. Be sure to call this method before any call to bind.
     */
    public void unbind() {
        if( dbc != null ) {
            dbc.dispose();
            dbc = null;
        }
    }

    /**
     * Binds the current SpecObject
     * 
     * @param The SpecObject to bind
     */
    public void bind( SpecObject specObject ) {
        dbc = new DataBindingContext();

        // create Hashmap for look up the attribute values for a certain attribute definition
        HashMap<AttributeDefinition, AttributeValue> attributeDefintionValueMap = new HashMap<AttributeDefinition, AttributeValue>();
        for( AttributeValue attributeValue : specObject.getValues() ) {
            attributeDefintionValueMap.put( attributeValue.getDefinition(), attributeValue );
        }

        // bind the controls
        for( Map.Entry<ViewElement, Control> entry : viewElementControlMap.entrySet() ) {
            AttributeDefinition attributeDefintion = entry.getKey().getAttributeDefinition();
            bindControl( entry.getValue(), attributeDefintion, attributeDefintionValueMap.get( attributeDefintion ) );
        }
    }

    /**
     * Bind control according to attribute definition of the attribute value
     * 
     * @param control control which is bound to the respective value of the SpecObject
     * @param attributeDefinition attribute Definition of the specObject to bind
     * @param attributeValue
     */
    private void bindControl( Control control, AttributeDefinition attributeDefinition, AttributeValue attributeValue ) {
        switch (attributeDefinition.getType().eClass().getClassifierID()) {
        case ErfPackage.DATATYPE_DEFINITION_INTEGER:
        case ErfPackage.DATATYPE_DEFINITION_STRING:
            bindControlText( (Text)control,
                             (AttributeDefinitionSimple)attributeDefinition,
                             (AttributeValueSimple)attributeValue );
            break;
        case ErfPackage.ATTRIBUTE_DEFINITION_BOOLEAN:
            // TODO: Implement binding of boolean datatype
            break;
        case ErfPackage.ATTRIBUTE_DEFINITION_ENUMERATION:
            // TODO: Implement binding of enumeration datatype
            break;
        }
    }

    /**
     * bind the text control to the data model
     * 
     * @param textControl control which is bound to the respective value of the SpecObject
     * @param attributeDefintion attribute Definition of the specObject to bind
     * @param attributeValue
     * 
     * */
    private void bindControlText( final Text textControl,
                                  final AttributeDefinitionSimple attributeDefinition,
                                  final AttributeValueSimple attributeValue ) {

        if( attributeValue == null ) {
            for( Listener listener : textControl.getListeners( SWT.Modify ) ) {
                textControl.removeListener( SWT.Modify, listener );
            }

            if( attributeDefinition.getDefaultValue() != null ) {
                textControl.setText( attributeDefinition.getDefaultValue().getTheValue() );
                textControl.setBackground( Display.getDefault().getSystemColor( SWT.COLOR_INFO_BACKGROUND ) );
            } else {
                textControl.setText( "" );
                textControl.setBackground( Display.getDefault().getSystemColor( SWT.COLOR_WHITE ) );
            }
            textControl.addModifyListener( new ModifyListener() {

                @Override
                public void modifyText( ModifyEvent e ) {
                    Text textControl = ((Text)e.widget);
                    textControl.removeModifyListener( this );
                    // create an Attribute Value
                    AttributeValueSimple attributeValue = ErfFactoryImpl.eINSTANCE.createAttributeValueSimple();

                    // set reference to the respective Attribute Definition
                    attributeValue.setDefinition( attributeDefinition );
                    // set value of attribute definition
                    attributeValue.setTheValue( textControl.getText() );

                    // create new Attribute value in the model
                    Command cmd = AddCommand.create( editingDomain,
                                                     specObject,
                                                     ErfPackage.SPEC_OBJECT__VALUES,
                                                     attributeValue );
                    editingDomain.getCommandStack().execute( cmd );
                    SpecObjectViewerRow.this.bindControlText( textControl, attributeDefinition, attributeValue );
                }
            } );

        } else {
            dbc.bindValue( WidgetProperties.text( SWT.Modify ).observeDelayed( 400, textControl ),
                           EMFEditProperties.value( editingDomain,
                                                    ErfPackage.Literals.ATTRIBUTE_VALUE_SIMPLE__THE_VALUE )
                                            .observe( attributeValue ) );
            textControl.setBackground( Display.getDefault().getSystemColor( SWT.COLOR_WHITE ) );

        }
    }

    /**
     * Get the delete button of this row
     * 
     * @return the delete Button of this row
     */
    public Label getDeleteButton() {
        return deleteButton;
    }

    /**
     * Set the selection status of this row. Alter the background when the row gets selected.
     * 
     * @param isSelected if true the row is displayed as selected
     * @param setFocus
     * 
     * */
    public void setSelected( boolean isSelected, boolean setFocus ) {
        if( isSelected ) {
            this.setBackground( Display.getDefault().getSystemColor( SWT.COLOR_LIST_SELECTION ) );
            // set focus to the first element in the view
            if( setFocus ) {
                viewElementControlMap.values().iterator().next().setFocus();
            }
        } else {
            this.setBackground( Display.getDefault().getSystemColor( SWT.COLOR_WIDGET_BACKGROUND ) );
        }
    }

    /**
     * retrieve all child controls of a given composite
     * 
     * @param composite the composite to get the childs from
     * @param controlList the list where the controls are added to
     */
    private void getAllChildControls( Composite composite, List<Control> controlList ) {
        for( Control control : composite.getChildren() ) {
            controlList.add( control );
            if( control instanceof Composite ) {
                getAllChildControls( (Composite)control, controlList );
            }
        }
    }

    /**
     * Add a selection listener to this row
     * 
     * @param listener
     */
    public void addSelectionListener( SelectionListener listener ) {
        this.selectionListenerList.add( listener );
    }

    /**
     * Remove a selection listener
     * 
     * @param listener
     */
    public void removeSelectionListener( SelectionListener listener ) {
        this.selectionListenerList.remove( listener );
    }

    /**
     * create a warpper for the mouse listener attached to all controls of the row
     */
    private void createSelectionListener() {
        MouseListener mouseListener = new MouseAdapter() {

            @Override
            public void mouseDown( MouseEvent mouseEvent ) {
                super.mouseDown( mouseEvent );

                Event event = new Event();
                event.widget = mouseEvent.widget;
                event.stateMask = mouseEvent.stateMask;
                SelectionEvent selectionEvent = new SelectionEvent( event );

                for( SelectionListener selectionListener : selectionListenerList ) {
                    selectionListener.widgetSelected( selectionEvent );
                }
            }
        };

        this.addMouseListener( mouseListener );
        List<Control> controlList = new ArrayList<Control>();
        getAllChildControls( this, controlList );
        for( Control control : controlList ) {
            control.addMouseListener( mouseListener );
        }
    }

    /**
     * set the offset of the SpecObject associated with this row
     * 
     * @param offset of the SpecObject
     */
    public void setSpecObject( SpecObject specObject, int offset ) {
        this.specObjectOffset = offset;
        this.specObject = specObject;
    }

    /**
     * get the offset of the SpecObject associated with this row
     * 
     * @return the offset of the SpecObject
     */
    public int getSpecObjectOffset() {
        return this.specObjectOffset;
    }

}