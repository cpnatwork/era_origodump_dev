/*
 * %%FILE_HEADER%%
 *
 * NAME: era.internal.tools.ecore.ExtendEcore
 * CREATED: May 19, 2009
 */

package era.internal.tools.ecore;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * This class takes the ecore model imported from rif.xsd and patches it to our needs.
 * 
 * <ul>
 * <li>Create CamelCased class names</li>
 * <li>Making class names unique in a meaningful way</li>
 * </ul>
 * 
 * The tool is tailored by a properties file that defines the following configuration parameters:
 * 
 * @author poldi
 */
public class ExtendEcore extends AbstractTools {

    //
    // defines

    /**
     * File extension for ecore file
     */
    public static final String FILEEXT_ECORE = "ecore";

    /**
     * config properties: custom classname
     */
    public static final String CONFIG_CLASSNAME = "classname";

    //
    // private members

    private ConfigurationProperties configuration;

    public ExtendEcore() {
    }

    /**
     * run the generation.
     * 
     * @param configFile The configFile with the configuration properties
     * @param inputEcore the file to take as input
     * @param outputEcore the generated model file
     */
    public void generate( String configFile, String inputEcore, String outputEcore ) {
        println( "ExtendEcore " + abrev( configFile ) + " \\" );
        println( "            " + abrev( inputEcore ) + " \\" );
        println( "            " + abrev( outputEcore ) );

        // Load configuration
        try {
            configuration = new ConfigurationProperties( configFile );
        } catch( IOException e ) {
            fail( e );
        }

        // Load resource
        EPackage pkg = loadResource( inputEcore );

        // Get containment structure
        Map<EClass, EClass> containments = getContainments( pkg );

        // Fix class names
        extendClassifierNames( pkg, containments );

        // Save resource
        saveResource( outputEcore, pkg );
    }

    /**
     * @see era.internal.tools.ecore.AbstractTools#getResourceFileExtensions()
     */
    @Override
    protected String[] getResourceFileExtensions() {
        return new String[]{FILEEXT_ECORE};
    }

    /**
     * Figure out the containment structure of the classes.
     * 
     * As the model is extracted from a schema each type has exactly one parent.
     * 
     * @param pkg The package to search
     * @return SubType->SuperType
     */
    private Map<EClass, EClass> getContainments( EPackage pkg ) {
        info( "Find containment structure..." );
        Map<EClass, EClass> containments = new HashMap<EClass, EClass>();
        for( EClassifier classifier : pkg.getEClassifiers() ) {
            if( !(classifier instanceof EClass) ) continue;
            EClass eClass = (EClass)classifier;
            for( EReference reference : eClass.getEAllReferences() ) {
                if( reference.isContainment() ) {
                    containments.put( reference.getEReferenceType(), eClass );
                    info( "  " + reference.getEReferenceType().getName() + " :: " + eClass.getName() );
                }
            }
        }

        return containments;
    }

    /**
     * CamelCases the names of the classes.
     * 
     * @param pkg The package to search classes in
     * @param containments SubType->SuperType containments structure
     */
    private void extendClassifierNames( EPackage pkg, Map<EClass, EClass> containments ) {
        info( "Rework Classnames..." );

        // Find duplicate names
        Set<String> allNames = new HashSet<String>();
        Set<String> duplicateNames = new HashSet<String>();
        for( EClassifier classifier : pkg.getEClassifiers() ) {
            String name = extractClassNameFromAnnotation( classifier );
            if( name == null ) continue;
            if( allNames.contains( name ) ) duplicateNames.add( name );
            allNames.add( name );
        }
        allNames = null;

        // rename stuff
        Map<String, String> mappedClassName = configuration.getMap( CONFIG_CLASSNAME );
        Set<String> seenNames = new HashSet<String>();
        for( EClassifier classifier : pkg.getEClassifiers() ) {
            String name;

            // Hand mapped
            String classifierName = classifier.getName();
            if( mappedClassName.containsKey( classifierName ) ) {
                name = mappedClassName.get( classifierName );
                if( seenNames.contains( name ) ) fail( "Duplicate manual classname " + name );
                classifier.setName( name );
                classifier.setName( name );
                info( "  manual: " + classifierName + " -> " + name );
                continue;
            }

            // Mapped via annotation
            name = extractClassNameFromAnnotation( classifier );
            if( name == null ) continue;
            if( duplicateNames.contains( name ) ) {
                // Try to add super type prefix

                EClass superType = containments.get( (EClass)classifier );
                if( superType != null ) {
                    String superName = extractClassNameFromAnnotation( superType );
                    name = superName != null ? superName + name : name;
                }
            }
            if( seenNames.contains( name ) ) fail( "Duplicate automatic classname " + name );
            classifier.setName( name );
            seenNames.add( name );
            info( "  automatic: " + classifierName + " -> " + name );
        }
    }

    /*
     * private void extendAttributesAndReferences( EClass classifier ) { for( EAttributes attributes :
     * classifier.getEAllAttributes() ) { } }
     */
    /**
     * Get the expected class name as CamelCase via the ExtendedMetaData annotation.
     * 
     * @param classifier The class
     * @return the name
     */
    private String extractClassNameFromAnnotation( EClassifier classifier ) {
        EAnnotation annotation = classifier.getEAnnotation( "http:///org/eclipse/emf/ecore/util/ExtendedMetaData" );
        String name = annotation.getDetails().get( "name" );
        if( name == null || !name.endsWith( "_type" ) ) return null;
        name = name.substring( 0, name.indexOf( '_' ) );
        return camelCase( name, false );
    }

    /**
     * Prints the command line usage and exists with code 1.
     */
    public static void usage() {
        System.out.println( "ExtendEcore <config>.properties <input>.ecore <output>.ecore" );
        System.exit( 1 );
    }

    /**
     * ExtendEcore <config>.properties <input>.ecore <output>.ecore
     * 
     * @param args command line
     */
    public static void main( String[] args ) {
        if( args.length != 3 ) usage();

        ExtendEcore generator = new ExtendEcore();
        if( System.getProperty( "verbose" ) != null ) generator.setVerbose( true );
        generator.generate( args[0], args[1], args[2] );
    }

}
