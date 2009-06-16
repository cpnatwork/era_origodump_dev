/*
 * NAME: era.foss.util.types.StringUtils
 */

package era.foss.util.types;

/**
 * Helper functions for string manipulation.
 * 
 * @author poldi
 */
public class StringUtils {

    /**
     * Converts first letter of a string to upper case.
     * 
     * @param value the string
     * @return the converted string
     * @since Jun 14, 2009
     */
    public static String fcUpper( String value ) {
        return fcConvert( value, true );
    }

    /**
     * Converts first letter of a string to lower case.
     * 
     * @param value the string
     * @return the converted string
     * @since Jun 14, 2009
     */
    public static String fcLower( String value ) {
        return fcConvert( value, false );
    }

    /**
     * Converts first letter of a string to upper or lower case.
     * 
     * @param value the string
     * @param upper true for upper case
     * @return the converted string
     * @since Jun 14, 2009
     */
    private static String fcConvert( String value, boolean upper ) {
        if( value == null || "".equals( value ) ) return value;
        StringBuilder b = new StringBuilder( upper
            ? Character.toUpperCase( value.charAt( 0 ) )
            : Character.toLowerCase( value.charAt( 0 ) ) );
        if( value.length() > 1 ) b.append( value.substring( 1 ) );
        return b.toString();
    }

} // StringUtils
