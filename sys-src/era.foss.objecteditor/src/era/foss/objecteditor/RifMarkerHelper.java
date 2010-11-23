package era.foss.objecteditor;

import java.util.List;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.ui.EMFEditUIPlugin;
import org.eclipse.emf.edit.ui.util.EditUIMarkerHelper;


public class RifMarkerHelper extends EditUIMarkerHelper
{

  /**
   * get the ID of the marker.
   * In our case this is the ID used for Eclipse markers 
   * which are based on diagnostics of EMF objects.
   */
  @Override
  protected String getMarkerID()
  {
    return EValidator.MARKER;
  }

  /**
   * Create markers for the issues in the diagnostic object 
   * and report errors to the Logging facility of the Edit plugin
   * 
   * 
   * @param diagnostic holding all issues showed up during validation
   */
  public void createMarkers(Diagnostic diagnostic)
  {
    try
    {
      super.createMarkers(diagnostic);
    }
    catch (CoreException e)
    {
      EMFEditUIPlugin.INSTANCE.log(e);
    }
  }

  /**
   * extract the data of validation issues from the diagnostic object 
   */
  @Override
  protected void adjustMarker(IMarker marker, Diagnostic diagnostic, Diagnostic parentDiagnostic) throws CoreException
  {
    List<?> data = diagnostic.getData();
    StringBuilder relatedURIs = new StringBuilder();
    boolean first = true;
    for (Object object : data)
    {
      if (object instanceof EObject)
      {
        EObject eObject = (EObject)object;
        if (first)
        {
          first = false;
          marker.setAttribute(EValidator.URI_ATTRIBUTE, EcoreUtil.getURI(eObject).toString());
        }
        else
        {
          if (relatedURIs.length() != 0)
          {
            relatedURIs.append(' ');
          }
          relatedURIs.append(URI.encodeFragment(EcoreUtil.getURI(eObject).toString(), false));
        }
      }
    }

    if (relatedURIs.length() > 0)
    {
      marker.setAttribute(EValidator.RELATED_URIS_ATTRIBUTE, relatedURIs.toString());
    }

    super.adjustMarker(marker, diagnostic, parentDiagnostic);      
  }
}
