package era.foss.util.log;


/**
 * Allows to to define a method contract.
 * 
 * @author poldi
 *
 */
public class Assert {
   
    /**
     * Validates that a given object is not null
     * @param message the message to send on error
     * @param o the object to check
     * @throws IllegalStateException if the object is null
     */
    public static void assertNotNull( String message, Object o ) throws IllegalStateException {
        if( o == null ) throw new IllegalStateException( message ); 
    }

} // Assert
