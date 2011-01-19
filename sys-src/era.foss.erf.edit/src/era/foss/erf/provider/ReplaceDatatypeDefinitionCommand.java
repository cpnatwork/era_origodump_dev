/*
 * NAME: era.foss.erf.provider.ReplaceDatatypeDefinitionCommand
 */

package era.foss.erf.provider;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import era.foss.erf.AttributeDefinition;
import era.foss.erf.DatatypeDefinition;
import era.foss.erf.Content;
import era.foss.erf.ErfPackage;
import era.foss.erf.SpecType;

/**
 * 
 * @author cpn
 */
public class ReplaceDatatypeDefinitionCommand extends ReplaceCommand {

    /**
     * @param domain
     * @param owner
     * @param feature
     * @param value
     * @param collection
     * @since Jul 28, 2010
     */
    public ReplaceDatatypeDefinitionCommand( EditingDomain domain,
                                             EObject owner,
                                             EStructuralFeature feature,
                                             Object value,
                                             Collection<?> collection ) {
        super( domain, owner, feature, value, collection );
        assert(collection.size() == 1);
    }

    @Override
    public void doExecute()
    {
      super.doExecute();
      
      SpecType theOneAndOnlySpecType = ((Content) this.owner).getSpecTypes().get( 0 );
      
      Collection<AttributeDefinition> affectedAttributeDefinitions = FinderUtil.helper_findAttributedefinitionsInSpectypeBasedonDatatypedefinition( (DatatypeDefinition)value, theOneAndOnlySpecType );
      // replace the old TYPE (=DataDefinition) with the new one, in each affected AttributeDefinition
      for( AttributeDefinition attributeDefinition : affectedAttributeDefinitions ) {
          Command cmd = new SetCommand(
              this.domain,
              attributeDefinition,
              attributeDefinition.eClass().getEStructuralFeature( ErfPackage.ATTRIBUTE_DEFINITION__TYPE ),
              this.collection.toArray()[0] );
          this.domain.getCommandStack().execute( cmd );
      }
    }
    
}