/*
 * %%FILE_HEADER%%
 *
 * NAME: era.internal.tools.ecore.ConfigurationProperties
 * CREATED: May 19, 2009
 */

package era.internal.tools.ecore;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * This class is used to provide configuration properties for tools.
 * 
 * <p>
 * The class wraps a properties file and provides additional methods to query maps and lists in addition to the methods
 * provided by the {@link Properties} interface.
 * </p>
 * 
 * @author poldi
 */
public class ConfigurationProperties extends Properties {

    /**
     * Needed for Serialization
     */
    private static final long serialVersionUID = -4597035906423449291L;

    /**
     * Load the given properties file.
     * 
     * @param configFile The configuration file to load
     */
    public ConfigurationProperties( String configFile ) throws IOException {
        super();
        load( new FileReader( configFile ) );
    }

    /**
     * Query if a specific configuration parameter is set.
     * 
     * @param key The key to query
     * @return true if the parameter is set
     */
    public boolean hasValue( String key ) {
        return getProperty( key ) != null;
    }

    /**
     * The the value of a single value property.
     * 
     * @param key the name of the property
     * @return the value or null
     */
    public String getValue( String key ) {
        return getProperty( key );
    }

    /**
     * The the value of a single value property.
     * 
     * @param key the name of the property
     * @param defaultValue the default value
     * @return the value or the default
     */
    public String getValue( String key, String defaultValue ) {
        return getProperty( key, defaultValue );
    }

    /**
     * Extract the values of a comma separated multi value property.
     * 
     * @param key the property name
     * @return the values
     */
    public String[] getList( String key ) {
        return getList( key, "\\s*,\\s*" );
    }

    /**
     * Extract the values of a multi value property.
     * 
     * @param key the property name
     * @param delim delimiter between the values
     * @return the values
     */
    public String[] getList( String key, String delim ) {
        String value = getProperty( key, "" );
        return value.split( delim );
    }

    /**
     * Get the value of a map style property where the key is the first part of the property name and the map keys
     * follow after that key separated by a dot.
     * 
     * @param key the prefix
     * @return the map values
     */
    public Map<String, String> getMap( String key ) {
        Map<String, String> map = new HashMap<String, String>();
        if( !key.endsWith( "." ) ) key = key + ".";
        for( Map.Entry<Object, Object> entry : entrySet() ) {
            String k = entry.getKey().toString();
            if( k != null && k.startsWith( key ) ) map.put( k.substring( key.length() ), entry.getValue().toString() );
        }

        return map;
    }

}
