/*
 * NAME: era.foss.model.core.model.internal.DocumentSyncRegistry
 */

package era.foss.model.core.model.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IConfigurationElement;

import era.foss.model.core.model.AbstractDocument;
import era.foss.model.core.model.AbstractDocumentSyncHandler;
import era.foss.model.core.model.UserDocument;
import era.foss.model.rif.era.IERAObject;
import era.foss.util.extensionpoint.Registry;

/**
 * This extension-point allows to register {@link AbstractDocumentSyncHandler}s.
 * 
 * @author poldi
 */
public class DocumentSyncRegistry {

    //
    // defines

    /**
     * Id of the extension-point.
     */
    public static final String EXTENSION_POINT = "era.foss.model.core.documentSync";

    /**
     * The tag of the executable extension
     */
    public static final String TAG_HANDLER = "handler";

    //
    // private members

    private static final Registry<DocumentSyncRegistry> registry = new Registry<DocumentSyncRegistry>();

    private static List<DocumentSyncRegistry> sortedRegistrations = null;

    /**
     * Mapping of id to registration
     */
    private static Map<String, DocumentSyncRegistry> byId = new HashMap<String, DocumentSyncRegistry>();

    /**
     * Id of the handler
     */
    private String id = null;

    /**
     * handler after which to run
     */
    private String after = null;

    /**
     * This is a fixing handler
     */
    private boolean fix = false;

    /**
     * The document schema that can be handled
     */
    private String schema = UserDocument.DOCUMENT_SCHEMA;

    /**
     * List of types that can be processed by the handler
     */
    private Set<Class<? extends IERAObject>> processTypes = new HashSet<Class<? extends IERAObject>>();

    /**
     * Toplevel tag
     */
    private IConfigurationElement element = null;

    /**
     * Get the registrations for a given type in their depedency order defined
     * with the after attribute.
     * 
     * @param document
     *            The document been processed (used to match schema)
     * @param type
     *            The type to process
     * @return the ordered registries
     */
    public static List<DocumentSyncRegistry> getRegistrations( AbstractDocument document,
                                                               Class<? extends IERAObject> type ) {
        if( sortedRegistrations != null ) return getByType( document, type, sortedRegistrations );
        Set<DocumentSyncRegistry> registrations = new HashSet<DocumentSyncRegistry>( registry
                .getRegistrations( DocumentSyncRegistry.class, EXTENSION_POINT ) );

        // Sort registrations according to after
        sortedRegistrations = new ArrayList<DocumentSyncRegistry>();
        Set<DocumentSyncRegistry> blockedRegistrations = new HashSet<DocumentSyncRegistry>();
        while( !registrations.isEmpty() || !blockedRegistrations.isEmpty() ) {
            if( registrations.isEmpty() ) {
                // retry blocked
                registrations = blockedRegistrations;
                blockedRegistrations = new HashSet<DocumentSyncRegistry>();
            }

            // Get next candidate
            DocumentSyncRegistry registry = registrations.iterator().next();

            // No dependency
            if( registry.after == null ) {
                sortedRegistrations.add( registry );
                registrations.remove( registry );
                continue;
            }

            // Get registration on which this one depends
            DocumentSyncRegistry dependentRegistry = getById( registry.after );
            if( dependentRegistry == null ) {
                throw new IllegalStateException( "Unknown documentSync extension " + registry.after );
            }

            // dependent already runs before
            if( sortedRegistrations.contains( dependentRegistry ) ) {
                sortedRegistrations.add( registry );
                registrations.remove( registry );
                continue;
            }

            // registry cannot run at this point
            blockedRegistrations.add( registry );
            registrations.remove( registry );
        }
        blockedRegistrations = null;
        registrations = null;

        return getByType( document, type, sortedRegistrations );
    }

    /**
     * Filter registration by processType.
     * 
     * Used by {@link #getRegistrations(Class)}
     * 
     * @param type
     *            The type to process
     * @param orderedRegistries
     *            the already ordered registries.
     * @return the filtered registries
     */
    private static List<DocumentSyncRegistry> getByType( AbstractDocument document,
                                                         Class<? extends IERAObject> type,
                                                         List<DocumentSyncRegistry> orderedRegistries ) {
        List<DocumentSyncRegistry> filteredRegistries = new ArrayList<DocumentSyncRegistry>();
        for( DocumentSyncRegistry registry : orderedRegistries ) {
            if( !document.getDocumentSchema().equals( registry.getSchema() ) ) continue;
            for( Class<? extends IERAObject> t : registry.getProcessTypes() ) {
                if( t.isAssignableFrom( type ) ) filteredRegistries.add( registry );
            }
        }

        return filteredRegistries;
    }

    /**
     * Called by the registry to register an extension under a specific id
     * 
     * @param id
     *            The id to register
     * @param registration
     *            the registration
     * @since Aug 2, 2009
     */
    public static void putId( String id, DocumentSyncRegistry registration ) {
        byId.put( id, registration );
    }

    /**
     * Query an extension by id.
     * 
     * @param id
     *            The id of the extension
     * @return the extension or null if id is unkown
     * @since Aug 2, 2009
     */
    public static DocumentSyncRegistry getById( String id ) {
        registry.getRegistrations( DocumentSyncRegistry.class, EXTENSION_POINT );
        return byId.get( id );
    }

    /**
     * Called by the registry for each extension.
     * 
     * @param element
     *            The toplevel element
     * @since Aug 2, 2009
     */
    public DocumentSyncRegistry( IConfigurationElement element ) {
        this.element = element;
    }

    /**
     * Query the id of the extension.
     * 
     * @return the id of the extension
     * @since Aug 2, 2009
     */
    public String getId() {
        return id;
    }

    /**
     * Called by the registry to set the id of the extension.
     * 
     * @param id
     *            The id
     * @since Aug 2, 2009
     */
    public void setId( String id ) {
        this.id = id;
    }

    /**
     * Get the id if the handler after which to run.
     * 
     * @return the id of the handler on which this one depends or null if there
     *         is no dependency
     * @since Aug 1, 2009
     */
    public String getAfter() {
        return after;
    }

    /**
     * Called by the registry to set the id of the handler after which to run
     * 
     * @param after
     *            the id of the handler on which this one depends or null if
     *            there is no dependency
     * @since Aug 1, 2009
     */
    public void setAfter( String after ) {
        this.after = after;
    }

    /**
     * Called by the registry to set if this is a fixing handler.
     * 
     * @param fix
     *            true if this is a fixing handler
     */
    public void setFix( boolean fix ) {
        this.fix = fix;
    }

    /**
     * Query if this is a fixing handler or a validating handler.
     * 
     * @return true if this is a fixing handler
     */
    public boolean isFixing() {
        return fix;
    }

    /**
     * Called by the registry to set the schema that can be processed.
     * 
     * @param schema
     *            the schema of the document
     */
    public void setSchema( String schema ) {
        this.schema = schema;
    }

    /**
     * Get the schema of the document that can be processed.
     * 
     * @return the schema
     */
    public String getSchema() {
        return schema;
    }

    /**
     * Called by the registry to add a new type that can be handled by the
     * handler.
     * 
     * @param type
     *            The new type
     */
    public void addProcessType( ProcessType type ) {
        processTypes.add( type.getType() );
    }

    /**
     * Get the list of types ({@link IERAObject}s that can be handled by this
     * handler.
     * 
     * @return The class object of the types
     */
    public Set<Class<? extends IERAObject>> getProcessTypes() {
        return Collections.unmodifiableSet( processTypes );
    }

    /**
     * Creates the actual sync handler.
     * 
     * This method does nt create singleton instances
     * 
     * @return the created handler
     * @since Aug 2, 2009
     */
    public AbstractDocumentSyncHandler createHandler() throws IllegalStateException {
        return (AbstractDocumentSyncHandler)registry.instantiate( element,
                                                                  TAG_HANDLER,
                                                                  AbstractDocumentSyncHandler.class,
                                                                  false );
    }

    /**
     * Haldes the sub-tag processType
     * 
     * @author poldi
     * 
     */
    public static class ProcessType {

        //
        // private members

        /**
         * The handled type
         */
        private Class<? extends IERAObject> type = null;

        public ProcessType() {
        }

        /**
         * Called by the registry to add a class name of an {@link IERAObject}
         * that can be processed by the handler.
         * 
         * This method already does the conversion to a class object
         * 
         * @param type
         *            The class name
         */
        @SuppressWarnings( "unchecked" )
        public void setType( String type ) {
            Class<?> c;
            try {
                c = IERAObject.class.getClassLoader().loadClass( type );
            } catch( ClassNotFoundException e ) {
                throw new IllegalStateException( type + " is not a class" );
            }
            if( !IERAObject.class.isAssignableFrom( c ) ) {
                throw new IllegalStateException( c + " is not of type IERAObject" );
            }
            this.type = (Class<? extends IERAObject>)c;
        }

        /**
         * Get the class that can be handled by the handler.
         * 
         * @return the class name
         */
        public Class<? extends IERAObject> getType() {
            return type;
        }

    } // AcceptedType

} // DocumentSyncRegistry
