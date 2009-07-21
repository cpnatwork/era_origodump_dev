package era.foss.model.rif.util;

import org.eclipse.emf.ecore.resource.ResourceSet;

public class RifXMLProcessorSut extends RifXMLProcessor {
	
	public RifXMLProcessorSut() {
		super();
	}

	public ResourceSet publicizeCreateResourceSet(){
		return super.createResourceSet();
	}
}
