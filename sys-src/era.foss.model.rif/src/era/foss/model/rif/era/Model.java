package era.foss.model.rif.era;

import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class Model {

    //
    // private members

    private static Model instance = null;

    public static Model getInstance() {
        return instance != null ? instance : (instance = new Model());
    }

    private Model() {
        // Create ResourceSet
        // Load internal types via type registry extension-point
    }

    public ResourceSet getResourceSet() {
        // TODO: Implement
        return null;
    }

    public Set<Document> getDocuments() {
        // TODO: Implement
        return null;
    }

    public Document createDocument( URI uri ) {
        // TODO: Implement
        return null;
    }

    public Document addDocument( URI uri ) {
        // TODO: Implement
        return null;
    }

    public void removeDocument( Document document ) {
        // TODO: Implement
    }

} // Model
