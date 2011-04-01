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
package era.foss.erf;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model
 * @author schorsch
 *
 */
public interface Content extends EObject {

    /**
     * @model containment="true"
     */
    public EList<SpecObject> getSpecObjects();

    /**
     * @model containment="true"
     */
    public EList<SpecType> getSpecTypes();

    /**
     * @model containment="true"
     */
    public EList<DatatypeDefinition> getDataTypes();

    /**
     * @model containment="true"
     */
    public EList<SpecRelation> getSpecRelations();

}
