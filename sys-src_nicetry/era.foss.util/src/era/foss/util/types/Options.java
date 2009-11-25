package era.foss.util.types;

import java.util.Map;

/**
 * Provides a convenient class to manage tag-value options.
 * 
 */
public class Options<X, Y> {

    //
    // private members

    private Map<X, Y> m_options = null;

    public Options( Map<X, Y> options ) {
        m_options = options;
    }

    /**
     * @return The options map
     */
    public Map<X, Y> getOptions() {
        return m_options;
    }

    /**
     * @return true if the named option exists
     */
    public boolean isOption( String name ) {
        return m_options != null && m_options.containsKey( name );
    }

    /**
     * Returns the value of a boolean option.
     * 
     * @param name The name of the option
     * @param defaultValue The default value
     * @return The value of the option or defaultValue if option is unknown or contains no boolean value
     */
    public boolean getBooleanOption( String name, boolean defaultValue ) {
        if( m_options == null ) return defaultValue;
        Object o = m_options.get( name );
        if( o == null ) return defaultValue;
        return Boolean.parseBoolean( o.toString() );
    }

    /**
     * Returns the value of a String option.
     * 
     * @param name The name of the option
     * @param defaultValue The default value
     * @return The value of the option or defaultValue if option is unknown or contains no String value
     */
    public String getStringOption( String name, String defaultValue ) {
        if( m_options == null ) return defaultValue;
        Object o = m_options.get( name );
        if( o == null ) return defaultValue;
        return o.toString();
    }

    /**
     * Returns the value of an integer option.
     * 
     * @param name The name of the option
     * @param defaultValue The default value
     * @return The value of the option or defaultValue if option is unknown or contains no integer value
     */
    public long getIntegerOption( String name, long defaultValue ) {
        if( m_options == null ) return defaultValue;
        Object o = m_options.get( name );
        if( o == null ) return defaultValue;
        try {
            return Integer.parseInt( o.toString() );
        } catch( NumberFormatException e ) {
            return defaultValue;
        }

    }

    /**
     * Returns the value of an integer option.
     * 
     * @param name The name of the option
     * @param defaultValue The default value
     * @return The value of the option or defaultValue if option is unknown or contains no integer value
     */
    public double getDoubleOption( String name, double defaultValue ) {
        if( m_options == null ) return defaultValue;
        Object o = m_options.get( name );
        if( o == null ) return defaultValue;
        try {
            // throws NullpointerException, if value is null
            return Double.parseDouble( o.toString() );
        } catch( Exception e ) {
            return defaultValue;
        }
    }

} // Options
