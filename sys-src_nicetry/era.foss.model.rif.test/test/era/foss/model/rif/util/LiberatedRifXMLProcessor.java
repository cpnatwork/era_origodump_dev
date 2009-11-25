package era.foss.model.rif.util;

import org.eclipse.emf.ecore.resource.ResourceSet;

public class LiberatedRifXMLProcessor extends RifXMLProcessor {
	
	public LiberatedRifXMLProcessor() {
		super();
	}

	public ResourceSet publicizeCreateResourceSet(){
		return super.createResourceSet();
	}
}
