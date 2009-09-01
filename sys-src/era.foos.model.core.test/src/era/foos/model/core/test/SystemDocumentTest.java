/*
 * NAME: era.foss.model.core.test.SystemDocumentTest
 */

package era.foss.model.core.test;

import org.junit.Test;

import era.foss.model.core.model.AbstractDocument;
import era.foss.model.core.model.Model;
import era.foss.model.core.model.SystemDocument;
import era.foss.model.rif.model.RifSpecTypes;
import era.foss.model.rif.model.SpecType;
import era.internal.testlib.AbstractTest;

/**
 * 
 * @author poldi
 */
public class SystemDocumentTest extends AbstractTest {
    
    /**
     * Tests that the documentCore system model exists and is valid.
     * 
     * @since Aug 2, 2009
     */
    @Test
    public void testDocumentCore() {
        AbstractDocument document = Model.getInstance().getDocument( "system:documentCore" );        
        assertNotNull( document );
        assertTrue( document instanceof SystemDocument );
        RifSpecTypes types = document.getRif().getSpecTypes();
        assertNotNull( types );
        assertTrue( types.getSpecType().size() >= 1 );
        SpecType type = types.getSpecType().get( 0 );
        assertEquals( "system:documentCore:hierarchyRoot", type.getIdentifier() );
    }

}
