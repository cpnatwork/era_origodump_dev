package era.foss.typeeditor;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.ui.IEditorPart;

import era.foss.rif.AttributeDefinition;
import era.foss.rif.AttributeValue;
import era.foss.rif.AttributeValueSimple;
import era.foss.rif.DatatypeDefinition;
import era.foss.rif.RIF;
import era.foss.rif.RIFContent;
import era.foss.rif.RifPackage;
import era.foss.rif.SpecObject;
import era.foss.rif.SpecType;

public class SpectypeChangeWorker {

    private AdapterFactoryEditingDomain editingDomain = null;
    private RIFContent rifCoreContent = null;
    private SpecType theOneAndOnlySpecType;

    public SpectypeChangeWorker( IEditorPart editor ) {

        // 1) extract the EditingDomain
        this.editingDomain = (AdapterFactoryEditingDomain)((IEditingDomainProvider)editor).getEditingDomain();

        // 2) extract the RIF CoreContent element
        Resource rifResource = (XMIResource)editingDomain.getResourceSet()
                                                         .getResource( EditUIUtil.getURI( editor.getEditorInput() ),
                                                                       true );
        this.rifCoreContent = ((RIF)(rifResource).getContents().get( 0 )).getCoreContent();

        // 3) extract the one and only SpecType
        this.theOneAndOnlySpecType = rifCoreContent.getSpecTypes().get( 0 );

    }

    public void selfreplaceDatatypedefinition( DatatypeDefinition oldself, DatatypeDefinition newself ) {

        selfreplaceDatatypedefinition_basicAct( oldself, newself );
        selfreplaceDatatypedefinition_adjustDependentAttributedefinitions( oldself, newself );
        
        // TODO : cleanup need as recently as changing simple<->complex 
        // selfreplaceDatatypedefinition_cleanupAffectedAttributevalues( oldself );
    }

    private void selfreplaceDatatypedefinition_basicAct( DatatypeDefinition oldself, DatatypeDefinition newself ) {
        Command replaceCommand = ReplaceCommand.create( editingDomain,
                                                        rifCoreContent,
                                                        rifCoreContent.eClass()
                                                                      .getEStructuralFeature( RifPackage.RIF_CONTENT__DATA_TYPES ),
                                                        oldself,
                                                        Collections.singleton( newself ) );
        // the ReplaceCommand will result in an REMOVE and ADD notification
        editingDomain.getCommandStack().execute( replaceCommand );
    }

    private void selfreplaceDatatypedefinition_adjustDependentAttributedefinitions( DatatypeDefinition oldself,
                                                                                    DatatypeDefinition newself ) {

        Collection<AttributeDefinition> affectedAttributeDefinitions = helper_findAttributedefinitionsInSpectypeBasedonDatatypedefinition( oldself );
        // replace the old TYPE (=DataDefinition) with the new one, in each affected AttributeDefinition
        for( AttributeDefinition attributeDefinition : affectedAttributeDefinitions ) {
            Command cmd = new SetCommand(
                editingDomain,
                attributeDefinition,
                attributeDefinition.eClass().getEStructuralFeature( RifPackage.ATTRIBUTE_DEFINITION__TYPE ),
                newself );
            editingDomain.getCommandStack().execute( cmd );
        }
    }

    private void selfreplaceDatatypedefinition_cleanupAffectedAttributevalues( DatatypeDefinition oldself ) {
        Collection<AttributeDefinition> affectedAttributeDefinitions = helper_findAttributedefinitionsInSpectypeBasedonDatatypedefinition( oldself );
        removeDatatypedefinition_cleanupAffectedAttributevalues( affectedAttributeDefinitions );
    }

    public void removeDatatypedefinition( DatatypeDefinition self ) {

        removeDatatypedefinition_basicAct( self );
        //Collection<AttributeDefinition> affectedAttributeDefinitions = helper_findAttributedefinitionsInSpectypeBasedonDatatypedefinition( self );
        
        // TODO : SCHORCH says: do not enforce implications from 
        //removeDatatypedefinition_removeDependentAttributedefinitions( affectedAttributeDefinitions );
        // TODO : cleanup need as recently as changing simple<->complex 
        //removeDatatypedefinition_cleanupAffectedAttributevalues( affectedAttributeDefinitions );
        // TODO : changing complex<->simple: a removal of the DependentAttributedefinitions' default value is necessary
    }

    private void removeDatatypedefinition_basicAct( DatatypeDefinition self ) {
        // TODO : at the moment the remove of DatatypeDefinitions is performed in the AddDeleteTableViewer generically
    }

    private void removeDatatypedefinition_removeDependentAttributedefinitions( Collection<AttributeDefinition> affectedAttributeDefinitions ) {
        if( !affectedAttributeDefinitions.isEmpty() ) {
            Command removeCommand = RemoveCommand.create( editingDomain, affectedAttributeDefinitions );
            editingDomain.getCommandStack().execute( removeCommand );
        }
    }

    private void removeDatatypedefinition_cleanupAffectedAttributevalues( Collection<AttributeDefinition> affectedAttributeDefinitions ) {

        LinkedList<AttributeValue> attributeValuesToRemove = new LinkedList<AttributeValue>();
        // merge the AttributeValue results from each (affected) AttributeDefinition into one combinde list
        for( AttributeDefinition attributeDefinition : affectedAttributeDefinitions ) {
            attributeValuesToRemove.addAll( helper_findAttributevaluesInAllSpecobjectsBasedonAttributedefinition( attributeDefinition ) );
        }

        if( !attributeValuesToRemove.isEmpty() ) {
            Command removeCommand = RemoveCommand.create( editingDomain, attributeValuesToRemove );
            editingDomain.getCommandStack().execute( removeCommand );
        }
    }

    public void selfretypeAttributedefinition( AttributeDefinition self, DatatypeDefinition newtype ) {
        selfretypeAttributedefinition_basicAct( self, newtype );
        // TODO : cleanup need as recently as changing simple<->complex 
        // selfretypeAttributedefinition_cleanupAffectedAttributevalues( self );
        // TODO : changing complex<->simple: a removal of the Attributedefinition's default value is necessary
    }

    private void selfretypeAttributedefinition_basicAct( AttributeDefinition self, DatatypeDefinition newtype ) {
        SetCommand cmd = new SetCommand(
            editingDomain,
            self,
            self.eClass().getEStructuralFeature( RifPackage.ATTRIBUTE_DEFINITION__TYPE ),
            newtype );
        editingDomain.getCommandStack().execute( cmd );
    }

    private void selfretypeAttributedefinition_cleanupAffectedAttributevalues( AttributeDefinition self ) {
        LinkedList<AttributeValue> attributeValuesToRemove = helper_findAttributevaluesInAllSpecobjectsBasedonAttributedefinition( self );
        if( !attributeValuesToRemove.isEmpty() ) {
            Command removeCommand = RemoveCommand.create( editingDomain, attributeValuesToRemove );
            editingDomain.getCommandStack().execute( removeCommand );
        }
    }

    public void removeAttributedefinition( AttributeDefinition self ) {
        removeAttributedefinition_basicAct( self );
        removeAttributedefinition_checkAndHandleLastAttributedefinitionRemoval( self );
        removeAttributedefinition_cleanupAffectedAttributevalues( self );
    }

    private void removeAttributedefinition_basicAct( AttributeDefinition self ) {
        // TODO : at the moment the remove of AttributeDefinitions is performed in the AddDeleteTableViewer generically
    }

    private void removeAttributedefinition_checkAndHandleLastAttributedefinitionRemoval( AttributeDefinition self ) {
        /*
         * purge all SpecObjects, because if then again new AttributeDefinitions are created, there still exists the
         * pointless old list of empty SpecObjects with generated internal IDs
         */
        if( rifCoreContent.getSpecTypes().get( 0 ).getSpecAttributes().isEmpty() ) {
            // remove all SpecObjects
            Command removeCommand = RemoveCommand.create( editingDomain, rifCoreContent.getSpecObjects() );
            editingDomain.getCommandStack().execute( removeCommand );
        }
    }

    private void removeAttributedefinition_cleanupAffectedAttributevalues( AttributeDefinition self ) {
        LinkedList<AttributeValue> attributeValuesToRemove = helper_findAttributevaluesInAllSpecobjectsBasedonAttributedefinition( self );
        if( !attributeValuesToRemove.isEmpty() ) {
            Command removeCommand = RemoveCommand.create( editingDomain, attributeValuesToRemove );
            editingDomain.getCommandStack().execute( removeCommand );
        }
    }

    private LinkedList<AttributeValue> helper_findAttributevaluesInAllSpecobjectsBasedonAttributedefinition( AttributeDefinition attributeDefinition ) {
        LinkedList<AttributeValue> retList = new LinkedList<AttributeValue>();
        // look at every SpecObject
        for( SpecObject specObject : rifCoreContent.getSpecObjects() ) {
            // look at every AttributeValue
            for( AttributeValue attributeValue : specObject.getValues() ) {
                assert (attributeValue instanceof AttributeValueSimple);
                // search for an affected AttributeValue
                if( ((AttributeValueSimple)attributeValue).getDefinition().getID() != attributeDefinition.getID() ) continue;
                // this AttributeValue is of the type of the affected AttributeDefinition
                retList.add( attributeValue );
            }
        }
        return retList;
    }

    private Collection<AttributeDefinition> helper_findAttributedefinitionsInSpectypeBasedonDatatypedefinition( DatatypeDefinition self ) {
        LinkedList<AttributeDefinition> retList = new LinkedList<AttributeDefinition>();
        for( AttributeDefinition attributeDefinition : this.theOneAndOnlySpecType.getSpecAttributes() ) {
            if( (attributeDefinition.getType() != self) ) continue;
            retList.add( attributeDefinition );
        }
        return retList;
    }

}
