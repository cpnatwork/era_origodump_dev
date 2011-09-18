package era.foss.objecteditor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.IViewerObservableValue;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import era.foss.erf.AttributeDefinition;
import era.foss.erf.AttributeDefinitionSimple;
import era.foss.erf.AttributeValue;
import era.foss.erf.AttributeValueSimple;
import era.foss.erf.DatatypeDefinition;
import era.foss.erf.ErfPackage;
import era.foss.erf.SpecObject;
import era.foss.erf.View;
import era.foss.erf.ViewElement;

class SpecObjectViewerRow extends Composite {

    private DataBindingContext dbc;

    private Button deleteButton;

    static private IViewerObservableValue viewMaster;
    static private EditingDomain editingDomain;

    public static void setEditingDomain( EditingDomain editingDomain ) {
        SpecObjectViewerRow.editingDomain = editingDomain;
    }

    private final List<ViewElement> viewElementList = new ArrayList<ViewElement>();

    LinkedHashMap<ViewElement, Control> dataFields = new LinkedHashMap<ViewElement, Control>();

    Composite controlComposite;

    public SpecObjectViewerRow( Composite parent, int style ) {
        super( parent, style );
        sortViewElements();
        doLayout();
    }

    public static void setViewMaster( IViewerObservableValue viewMaster ) {
        SpecObjectViewerRow.viewMaster = viewMaster;
    }

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

        // create delete button
        Composite buttonComposite = new Composite( this, SWT.NONE );
        buttonComposite.setLayoutData( new GridData( SWT.LEFT, SWT.CENTER, false, true, 0, 0 ) );
        buttonComposite.setLayout( new FillLayout() );
        deleteButton = new Button( buttonComposite, SWT.NONE );
        deleteButton.setText( "Delete" );

        createSpecObjectControls();
    }

    private void createSpecObjectControls() {

        // Only create controls in case there are elements to show
        if( viewElementList.size() == 0 ) {
            return;
        }

        // calculate maxColumnSpan
        int maxColumnSpan = calculateMaxColumnSpan();

        controlComposite = new Composite( this, SWT.NONE | SWT.BORDER );
        controlComposite.setLayout( new GridLayout( maxColumnSpan, true ) );
        controlComposite.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );

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
                    Label labelLongName = new Label( controlComposite, SWT.NULL );
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
                Label labelLongName = new Label( controlComposite, SWT.NULL );
                labelLongName.setText( viewElement.getAttributeDefinition().getLongName() + ":" );
                labelLongName.setLayoutData( new GridData( SWT.RIGHT, SWT.CENTER, false, false ) );
            }

            Control currentControl = null;
            DatatypeDefinition dataTypeDefinition = viewElement.getAttributeDefinition().getType();
            if( dataTypeDefinition != null ) {
                switch (dataTypeDefinition.eClass().getClassifierID()) {
                case ErfPackage.DATATYPE_DEFINITION_INTEGER:
                case ErfPackage.DATATYPE_DEFINITION_STRING:
                    currentControl = new Text( controlComposite, SWT.BORDER );
                    break;
                }
            }

            if( currentControl != null ) {
                currentControl.setLayoutData( new GridData( SWT.FILL, SWT.CENTER, true, false, controlSpan, 1 ) );
                dataFields.put( viewElement, currentControl );
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
        for( Map.Entry<ViewElement, Control> entry : dataFields.entrySet() ) {
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
    private void bindControlText( Text textControl,
                                  AttributeDefinitionSimple attributeDefinition,
                                  AttributeValueSimple attributeValue ) {

        // bind to default value in case no attribute value is available
        if( attributeValue == null ) {

            // only bind to default value in case a default value exists
            if( attributeDefinition.getDefaultValue() != null ) {
                dbc.bindValue( WidgetProperties.text( SWT.Modify ).observeDelayed( 400, textControl ),
                               EMFEditProperties.value( editingDomain,
                                                        FeaturePath.fromList( ErfPackage.Literals.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE,
                                                                              ErfPackage.Literals.ATTRIBUTE_VALUE_SIMPLE__THE_VALUE ) )
                                                .observe( attributeDefinition ) );
                textControl.setBackground( Display.getDefault().getSystemColor( SWT.COLOR_INFO_BACKGROUND ) );

            } else {
                ((Text)textControl).setText( "" );
                dbc.bindValue( WidgetProperties.text( SWT.Modify ).observeDelayed( 400, textControl ),
                               EMFEditProperties.value( editingDomain,
                                                        FeaturePath.fromList( ErfPackage.Literals.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE,
                                                                              ErfPackage.Literals.ATTRIBUTE_VALUE_SIMPLE__THE_VALUE ) )
                                                .observe( attributeDefinition ) );
                textControl.setBackground( Display.getDefault().getSystemColor( SWT.COLOR_WHITE ) );
            }
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
    public Button getDeleteButton() {
        return deleteButton;
    }

}