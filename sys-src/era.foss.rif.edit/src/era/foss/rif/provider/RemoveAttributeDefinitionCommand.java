package era.foss.rif.provider;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import era.foss.rif.AttributeDefinition;
import era.foss.rif.AttributeValue;
import era.foss.rif.RIFContent;
import era.foss.rif.SpecType;

public class RemoveAttributeDefinitionCommand extends RemoveCommand {

    public RemoveAttributeDefinitionCommand( EditingDomain domain,
                                             EObject owner,
                                             EStructuralFeature feature,
                                             Collection<?> collection ) {
        super( domain, owner, feature, collection );
    }

    @Override
    public void doExecute() {
        super.doExecute();

        RIFContent rifContentCore = (RIFContent)((SpecType)this.owner).eContainer();

        for( Object obj : this.collection ) {
            AttributeDefinition ego = (AttributeDefinition)obj;
            removeAttributedefinition_checkAndHandleLastAttributedefinitionRemoval( ego, rifContentCore );
            removeAttributedefinition_cleanupAffectedAttributevalues( ego, rifContentCore );
        }
    }

    private void removeAttributedefinition_checkAndHandleLastAttributedefinitionRemoval( AttributeDefinition ego,
                                                                                         RIFContent rifContentCore ) {
        /*
         * purge all SpecObjects, because if then again new AttributeDefinitions are created, there still exists the
         * pointless old list of empty SpecObjects with generated internal IDs
         */
        if( ((SpecType)this.owner).getSpecAttributes().isEmpty() ) {
            // remove all SpecObjects
            Command removeCommand = RemoveCommand.create( this.domain, rifContentCore.getSpecObjects() );
            this.domain.getCommandStack().execute( removeCommand );
        }
    }

    private void removeAttributedefinition_cleanupAffectedAttributevalues( AttributeDefinition ego,
                                                                           RIFContent rifContentCore ) {
        LinkedList<AttributeValue> attributeValuesToRemove = FinderUtil.helper_findAttributevaluesInAllSpecobjectsBasedonAttributedefinition( ego,
                                                                                                                                              rifContentCore );
        if( !attributeValuesToRemove.isEmpty() ) {
            Command removeCommand = RemoveCommand.create( this.domain, attributeValuesToRemove );
            this.domain.getCommandStack().execute( removeCommand );
        }
    }
}
