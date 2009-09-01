/*
 * NAME: era.foss.model.core.model.SystemDocument
 */

package era.foss.model.core.model;

import java.util.Map;

import org.eclipse.emf.common.util.URI;

/**
 * Represents documents that are used internally.
 *  
 * @author poldi
 */
public class SystemDocument extends AbstractDocument {
    
    //
    // defines
    
    /**
     * The document schema is used in ids
     */
    public static final String DOCUMENT_SCHEMA = "system";

    /**
     * @param uri the URI from which the document is loaded
     * @param options document options
     * @since Jul 31, 2009
     */
    public SystemDocument( URI uri, Map<String, String> options ) {
        super( uri, options );
    }

    /**
     * @see era.foss.model.core.model.AbstractDocument#getDocumentSchema()
     * @since Aug 1, 2009
     */
    @Override
    protected String getDefaultDocumentSchema() {
        return DOCUMENT_SCHEMA;
    }       

} // SystemDocument
