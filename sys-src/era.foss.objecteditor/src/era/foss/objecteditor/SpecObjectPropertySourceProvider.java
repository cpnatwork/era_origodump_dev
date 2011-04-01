/**************************************************************************
* ERA - Eclipse Requirements Analysis
* ==============================================
* Copyright (C) 2009-2011 by Georg Blaschke, Christoph P. Neumann
* and Bernd Haberstumpf (http://era.origo.ethz.ch)
**************************************************************************
* Licensed under the Eclipse Public License - v 1.0 (the "License");
* you may not use this file except in compliance with
* the License. You may obtain a copy of the License at
* http://www.eclipse.org/org/documents/epl-v10.html
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
**************************************************************************
* $Id$
*************************************************************************/
package era.foss.objecteditor;

import java.util.ArrayList;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import era.foss.erf.AttributeDefinition;
import era.foss.erf.AttributeDefinitionSimple;
import era.foss.erf.AttributeValue;
import era.foss.erf.AttributeValueSimple;
import era.foss.erf.SpecObject;

public class SpecObjectPropertySourceProvider implements IPropertySourceProvider {

    class SpecObjectPropertySource implements IPropertySource {
        
        class SpecObjectPropertyId{
            private SpecObject specObject;
            private AttributeDefinition attributeDefinition;
            
            public SpecObjectPropertyId(SpecObject specObject, AttributeDefinition attributeDefinition) {
                SpecObjectPropertyId.this.specObject = specObject;
                SpecObjectPropertyId.this.attributeDefinition = attributeDefinition;
            }

            public SpecObject getSpecObject() {
                return specObject;
            }
            public AttributeDefinition getAttributeDefinition() {
                return attributeDefinition;
            }
        }
        
        private SpecObject specObject;

        public SpecObjectPropertySource( SpecObject specObject ) {
            this.specObject = specObject;
        }

        @Override
        public Object getEditableValue() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public IPropertyDescriptor[] getPropertyDescriptors() {
            ArrayList<IPropertyDescriptor> propertyDescriptors = new ArrayList<IPropertyDescriptor>();

            for( AttributeDefinition attributeDefinition : specObject.getType().getSpecAttributes() ) {
                PropertyDescriptor newPropertyDescriptor = new PropertyDescriptor( new SpecObjectPropertyId( specObject, attributeDefinition ), attributeDefinition.getLongName() );
                newPropertyDescriptor.setDescription( attributeDefinition.getDesc() );
                propertyDescriptors.add( newPropertyDescriptor );
            }

            return propertyDescriptors.toArray( new PropertyDescriptor[propertyDescriptors.size()] );
        }

        @Override
        public Object getPropertyValue( Object object ) {
            SpecObject specObject = ((SpecObjectPropertyId)object).getSpecObject();
            AttributeDefinition attributeDefinition = ((SpecObjectPropertyId)object).getAttributeDefinition();

            // find value according to attribute definition
            for( AttributeValue specObjectValue : specObject.getValues() ) {
                if( specObjectValue instanceof AttributeValueSimple &&
                 ((AttributeValueSimple)specObjectValue).getDefinition().equals( attributeDefinition ) ) {
                        return ((AttributeValueSimple)specObjectValue).getTheValue();
                }
            }
            
            // in case we did not find a value try to use the default value
            if( (attributeDefinition instanceof AttributeDefinitionSimple)
                && (((AttributeDefinitionSimple)attributeDefinition).getDefaultValue() != null) ) {
                return ((AttributeDefinitionSimple)attributeDefinition).getDefaultValue().getTheValue();
            }

            return null;
        }

        @Override
        public boolean isPropertySet( Object id ) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public void resetPropertyValue( Object id ) {
            // TODO Auto-generated method stub
        }

        @Override
        public void setPropertyValue( Object id, Object value ) {
            // TODO Auto-generated method stub
        }

    }

    @Override
    public IPropertySource getPropertySource( Object object ) {
        // stop processing if we don't have a spec object
        if( !(object instanceof SpecObject) ) {
            return null;
        }
        return new SpecObjectPropertySource( (SpecObject)object );
    }

}
