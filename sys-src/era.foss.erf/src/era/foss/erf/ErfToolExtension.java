package era.foss.erf;

import org.eclipse.emf.common.util.EList;

/**
 * @model
 */
public interface ErfToolExtension extends ToolExtension {

    /**
     * @model containment="true"
     */
    public EList<View> getViews();
}
