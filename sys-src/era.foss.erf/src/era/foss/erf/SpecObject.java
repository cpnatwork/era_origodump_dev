package era.foss.erf;

import org.eclipse.emf.common.util.EList;
import java.util.List;

/**
 * @model 
 * @author poldi
 *
 */
public interface SpecObject extends SpecElementWithUserDefinedAttributes {

    /**
     * @model kind="reference" opposite="target" required="true"
     */
    public EList<SpecRelation> getSources();

    /**
     * @model kind="reference" opposite="source" required="true"
     */
    public EList<SpecRelation> getTargets();

}
