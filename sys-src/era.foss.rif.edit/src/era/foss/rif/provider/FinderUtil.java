package era.foss.rif.provider;

import java.util.Collection;
import java.util.LinkedList;

import era.foss.rif.AttributeDefinition;
import era.foss.rif.AttributeValue;
import era.foss.rif.AttributeValueSimple;
import era.foss.rif.DatatypeDefinition;
import era.foss.rif.RIFContent;
import era.foss.rif.SpecObject;
import era.foss.rif.SpecType;

public class FinderUtil {

    public static LinkedList<AttributeValue> helper_findAttributevaluesInAllSpecobjectsBasedonAttributedefinition( AttributeDefinition attributeDefinition, RIFContent rifCoreContent ) {
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

    public static Collection<AttributeDefinition> helper_findAttributedefinitionsInSpectypeBasedonDatatypedefinition( DatatypeDefinition self, SpecType theOneAndOnlySpecType) {
        LinkedList<AttributeDefinition> retList = new LinkedList<AttributeDefinition>();
        for( AttributeDefinition attributeDefinition : theOneAndOnlySpecType.getSpecAttributes() ) {
            if( (attributeDefinition.getType() != self) ) continue;
            retList.add( attributeDefinition );
        }
        return retList;
    }

}
