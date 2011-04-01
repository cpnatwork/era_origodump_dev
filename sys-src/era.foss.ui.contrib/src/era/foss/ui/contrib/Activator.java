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
package era.foss.ui.contrib;

import org.eclipse.jface.resource.ImageDescriptor;

import org.eclipse.ui.plugin.AbstractUIPlugin;

public class Activator extends AbstractUIPlugin {
    
    /**
     * Keep track of the singleton.
     */
    public static final Activator INSTANCE = new Activator();
    
    public static final String PLUGIN_ID = "era.foss.ui.contrib"; //$NON-NLS-1$
    
    private final static String ICONS_PATH = "$nl$/icons/full/";//$NON-NLS-1$
    
    /**
     * Get the workbench image with the given path relative to
     * ICON_PATH.
     * @param relativePath
     * @return ImageDescriptor
     */
    public static ImageDescriptor getViewImageDescriptor(String relativePath){
        return imageDescriptorFromPlugin(PLUGIN_ID, ICONS_PATH + relativePath);
    }
    

}
