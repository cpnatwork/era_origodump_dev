/*
 * NAME: era.foss.util.extensionpoint.ExtensionUtils
 */

package era.foss.util.extensionpoint;

import java.util.LinkedList;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

import era.foss.util.types.BooleanUtils;

/**
 * String helper functions.
 *  
 * @author poldi
 */
public class ExtensionUtils {

    //
    // defines

    /**
     * @return The IConfigurationElements for the given extension-point or null
     */
    public static IConfigurationElement[] getConfigurationElementsForPoint( String point ) {
        IExtensionRegistry registry = Platform.getExtensionRegistry();
        return registry.getConfigurationElementsFor( point );
    }

    /**
     * @return The simple-identifier of the extension containing this elt
     */
    public static String getExtensionId( IConfigurationElement elt ) {
        return elt.getDeclaringExtension().getSimpleIdentifier();
    }

    /**
     * @return The PlugIn id of the PlugIn of which the plugin.xml contains this element
     */
    public static String getPlugInId( IConfigurationElement elt ) {
        return elt.getDeclaringExtension().getContributor().getName();
    }

    /**
     * @return Handles to extensions for the point specified by the given parameter string if the ex and null otherwise.
     *         The elements of the list are IExtensions.
     */
    public static LinkedList<IExtension> getExtensionsForPoint( String point ) {
        IExtensionRegistry registry = Platform.getExtensionRegistry();
        LinkedList<IExtension> l = new LinkedList<IExtension>();
        IConfigurationElement[] elems = registry.getConfigurationElementsFor( point );
        for( int i = 0; i < elems.length; i++ ) {
            IExtension parent = (IExtension)elems[i].getParent();
            if( !l.contains( parent ) ) l.add( parent );
        }
        return l;
    }

    /**
     * Get the value of an attribute.
     * 
     * @param elem The element to query
     * @param attribName The name of the attribute
     * @param defaultValue The defaultValue
     */
    public static String getAttribute( IConfigurationElement element, String name, String defaultValue ) {
        String value = element.getAttribute( name );
        return value != null ? value : defaultValue;
    }

    /**
     * Get the value of an attribute.
     * 
     * @param elem The element to query
     * @param attribName The name of the attribute
     * @param defaultValue The defaultValue
     */
    public static boolean getAttribute( IConfigurationElement element, String name, boolean defaultValue ) {
        String value = element.getAttribute( name );
        if( BooleanUtils.TRUE.equalsIgnoreCase( value ) ) return true;
        if( BooleanUtils.FALSE.equalsIgnoreCase( value ) ) return false;
        return defaultValue;
    }

    /**
     * Get the value of an attribute.
     * 
     * @param elem The element to query
     * @param attribName The name of the attribute
     * @param defaultValue The defaultValue
     */
    public static int getAttribute( IConfigurationElement element, String name, int defaultValue ) {
        String value = element.getAttribute( name );
        if( value == null ) return defaultValue;
        try {
            return Integer.parseInt( value );
        } catch( NumberFormatException e ) {
            return defaultValue;
        }
    }

    /**
     * Get the value of an attribute.
     * 
     * @param elem The element to query
     * @param attribName The name of the attribute
     * @param defaultValue The defaultValue
     */
    public static long getAttribute( IConfigurationElement element, String name, long defaultValue ) {
        String value = element.getAttribute( name );
        if( value == null ) return defaultValue;
        try {
            return Long.parseLong( value );
        } catch( NumberFormatException e ) {
            return defaultValue;
        }
    }

    /**
     * Get the value of an attribute.
     * 
     * @param elem The element to query
     * @param attribName The name of the attribute
     * @param defaultValue The defaultValue
     */
    public static float getAttribute( IConfigurationElement element, String name, float defaultValue ) {
        String value = element.getAttribute( name );
        if( value == null ) return defaultValue;
        try {
            return Float.parseFloat( value );
        } catch( NumberFormatException e ) {
            return defaultValue;
        }
    }

    /**
     * Get the value of an attribute.
     * 
     * @param elem The element to query
     * @param attribName The name of the attribute
     * @param defaultValue The defaultValue
     */
    public static double getAttribute( IConfigurationElement element, String name, double defaultValue ) {
        String value = element.getAttribute( name );
        if( value == null ) return defaultValue;
        try {
            return Double.parseDouble( value );
        } catch( NumberFormatException e ) {
            return defaultValue;
        }
    }

}
