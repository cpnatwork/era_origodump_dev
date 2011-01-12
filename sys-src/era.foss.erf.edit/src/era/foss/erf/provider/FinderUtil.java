package era.foss.erf.provider;

import java.util.Collection;
import java.util.LinkedList;

import era.foss.erf.AttributeDefinition;
import era.foss.erf.AttributeValue;
import era.foss.erf.AttributeValueSimple;
import era.foss.erf.DatatypeDefinition;
import era.foss.erf.Content;
import era.foss.erf.SpecObject;
import era.foss.erf.SpecType;

public class FinderUtil {

    public static LinkedList<AttributeValue> helper_findAttributevaluesInAllSpecobjectsBasedonAttributedefinition( AttributeDefinition attributeDefinition, Content erfCoreContent ) {
        LinkedList<AttributeValue> retList = new LinkedList<AttributeValue>();
        // look at every SpecObject
        for( SpecObject specObject : erfCoreContent.getSpecObjects() ) {
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
