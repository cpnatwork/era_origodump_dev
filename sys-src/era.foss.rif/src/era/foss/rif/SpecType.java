package era.foss.rif;

import org.eclipse.emf.common.util.EList;

/**
 * @model
 * @author poldi
 *
 */
public interface SpecType extends Identifiable {

    /**
     * @model containment="true"
     */
    public EList<AttributeDefinition> getSpecAttributes();

}
