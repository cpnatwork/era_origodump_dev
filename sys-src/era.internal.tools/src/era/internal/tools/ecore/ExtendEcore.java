/*
 * %%FILE_HEADER%%
 *
 * NAME: era.internal.tools.ecore.ExtendEcore
 * CREATED: May 19, 2009
 */

package era.internal.tools.ecore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

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

    /**
     * config properties: custom featurename
     */
    public static final String CONFIG_FEATURENAME = "featurename";

    /**
     * config properties: substitute.&lt;fromClass&gt; : &lt;toClass&gt;
     */
    public static final String CONFIG_SUBSTITUTE = "substitute";

    /**
     * config properties: extractSuperClass.&lt;fromClass&gt; : &lt;toClass&gt; &lt;Feature&gt;,...
     */
    public static final String CONFIG_EXTRACT_SUPER_CLASS = "extractSuperClass";

    /**
     * config properties: superClass.&lt;derivedClass&gt; : &lt;superClass&gt;
     */
    public static final String CONFIG_SUPER_CLASS = "superClass";

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

        // Substitute Classes
        extendSubstitute( pkg );

        // Extract a super class from an existing type
        extendExtractSuperClass( pkg );

        // Add super classes
        extendAddSuperClass( pkg );

        // Make feature unique
        extendRemoveInheritedFeatures( pkg );

        // Save resource
        saveResource( outputEcore, pkg );
    }

    /**
     * @see era.internal.tools.ecore.AbstractTools#getResourceFileExtensions()
     */
    @Override
    protected String[] getResourceFileExtensions() {
        return new String[]{ FILEEXT_ECORE };
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
            if( !( classifier instanceof EClass ) ) continue;
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
        info( "Rework Class and feature names..." );

        // Find duplicate names
        Set<String> allNames = new HashSet<String>();
        Set<String> duplicateNames = new HashSet<String>();
        for( EClassifier classifier : pkg.getEClassifiers() ) {
            String name = extractNameFromAnnotation( classifier, false );
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

            String classifierName = classifier.getName();
            if( mappedClassName.containsKey( classifierName ) ) {
                // Hand mapped

                name = mappedClassName.get( classifierName );
                if( seenNames.contains( name ) ) fail( "Duplicate manual classname " + name );
                classifier.setName( name );
                seenNames.add( name );
                info( "  manual: " + classifierName + " -> " + name );
            } else {
                // Mapped via annotation

                name = extractNameFromAnnotation( classifier, false );
                if( name == null ) name = classifier.getName();
                if( duplicateNames.contains( name ) ) {
                    // Try to add super type prefix

                    EClass superType = containments.get( (EClass)classifier );
                    if( superType != null ) {
                        String superName = extractNameFromAnnotation( superType, false );
                        name = superName != null ? superName + name : name;
                    }
                }
                if( seenNames.contains( name ) ) fail( "Duplicate automatic classname " + name );
                classifier.setName( name );
                seenNames.add( name );
                info( "  automatic: " + classifierName + " -> " + name );
            }

            // Map attributes+references
            if( classifier instanceof EClass ) {
                Set<String> seenFeatureNames = new HashSet<String>();
                Map<String, String> mappedFeatureNames = configuration.getMap( CONFIG_FEATURENAME );
                for( EStructuralFeature feature : ( (EClass)classifier ).getEAllStructuralFeatures() ) {
                    extendStructuralFeatureName( classifier, feature, mappedFeatureNames, seenFeatureNames );
                }
            }
        }
    }

    /**
     * Converts attribute and reference names to camel case.
     * 
     * @param classifier the class containing the feature
     * @param feature the feature
     * @param mappedFeatureNames the manual configured feature names
     * @param seenNames the names already seen for this class
     * @since Jun 16, 2009
     */
    private void extendStructuralFeatureName( EClassifier classifier,
                                              EStructuralFeature feature,
                                              Map<String, String> mappedFeatureNames,
                                              Set<String> seenNames ) {
        String name;
        String classifierName = classifier.getName();
        String featureName = classifierName + "." + feature.getName();

        if( mappedFeatureNames.containsKey( featureName ) ) {
            // manual mapping

            name = mappedFeatureNames.get( featureName );
            if( seenNames.contains( name ) ) fail( "Duplicate manual featurename "
                + name
                + " for class "
                + classifierName );
            feature.setName( name );
            seenNames.add( name );
            info( "  manual: " + featureName + " -> " + name );
        } else {
            // Mapped via annotation
            name = extractNameFromAnnotation( feature, true );
            if( name == null || "".equals( name ) ) name = feature.getName();
            if( seenNames.contains( name ) ) fail( "Duplicate automatic featurename " + name );
            feature.setName( name );
            seenNames.add( name );
            info( "  automatic: " + featureName + " -> " + name );
        }
    }

    /*
     * private void extendAttributesAndReferences( EClass classifier ) { for( EAttributes attributes :
     * classifier.getEAllAttributes() ) { } }
     */
    /**
     * Get the expected name as CamelCase via the ExtendedMetaData annotation.
     * 
     * @param element The element to rename
     * @param feature create a name for a feature
     * @return the name
     */
    private String extractNameFromAnnotation( ENamedElement element, boolean feature ) {
        EAnnotation annotation = element.getEAnnotation( "http:///org/eclipse/emf/ecore/util/ExtendedMetaData" );
        String name = annotation.getDetails().get( "name" );
        if( name == null || "".equals( name ) ) return null;
        if( name.endsWith( "_type" ) ) {
            name = name.substring( 0, name.indexOf( '_' ) );
        }
        if( name.indexOf( ':' ) != -1 ) {
            name = !feature ? name.replace( ':', '-' ) : name.substring( 0, name.indexOf( ':' ) );
        }
        return camelCase( name, feature );
    }

    /**
     * Substitutes one class by another (effectively removing the subsituted class) and fixes all references.
     * 
     * <p>
     * Handles the configuration map {@link #CONFIG_SUBSTITUTE}.
     * </p>
     * 
     * @param pkg The package
     * @since Aug 4, 2009
     */
    private void extendSubstitute( EPackage pkg ) {
        info( "Subsitute Classes..." );
        Map<String, String> mergeMap = configuration.getMap( CONFIG_SUBSTITUTE );
        for( Map.Entry<String, String> mergeEntry : mergeMap.entrySet() ) {
            info( "  " + mergeEntry.getKey() + " -> " + mergeEntry.getValue() );
            EClassifier substituteFrom = pkg.getEClassifier( mergeEntry.getKey() );
            if( !( substituteFrom instanceof EClass ) ) {
                fail( "Unknown class " + mergeEntry.getKey() );
            }
            EClassifier substituteTo = pkg.getEClassifier( mergeEntry.getValue() );
            if( !( substituteTo instanceof EClass ) ) {
                fail( "Unknown class " + mergeEntry.getValue() );
            }

            // Change all references to point to substituteTo instead of substituteFrom
            for( EClassifier classifier : pkg.getEClassifiers() ) {
                if( !( classifier instanceof EClass ) ) continue;
                for( EReference reference : ( (EClass)classifier ).getEReferences() ) {
                    if( reference.getEType().equals( substituteFrom ) ) {
                        reference.setEType( substituteTo );
                    }
                }
            }

            // Remove mergeFrom
            pkg.getEClassifiers().remove( substituteFrom );
        }
    }

    /**
     * Extracts super classes from a given classes setting the newly created class as superType of the given class and
     * removing all but selected structural features.
     * 
     * <p>
     * This method processes the config option map {@link ExtendEcore#CONFIG_EXTRACT_SUPER_CLASS}.
     * </p>
     * 
     * @param pkg the package form the file
     * @since Aug 5, 2009
     */
    private void extendExtractSuperClass( EPackage pkg ) {
        info( "Extract SuperClasses..." );
        Map<String, String> superClassMap = configuration.getMap( CONFIG_EXTRACT_SUPER_CLASS );
        List<String> sortedSuperClassMapKeys = sortSuperClassMapKeys( superClassMap );
        for( String key : sortedSuperClassMapKeys ) {
            String value = superClassMap.get( key );
            info( "  " + key + " :: " + value );

            // Get the class for which to create s super-type
            EClassifier derivedClass = pkg.getEClassifier( key );
            if( !( derivedClass instanceof EClass ) ) {
                fail( "Unknown class " + key );
            }
            // Split between super type name and optional list of feautres to preserve
            String[] s = value.split( "\\s+", 2 );
            if( s == null || s.length < 1 ) {
                fail( "Missing superType for derived class " + key );
            }

            // extract super type name and list of features to preserve. If no feature are given preserve all
            String superTypeName = s[0];
            if( pkg.getEClassifier( superTypeName ) != null ) {
                fail( "Type " + superTypeName + " already exists" );
            }
            List<String> features = null;
            if( s.length > 1 ) {
                features = Arrays.asList( s[1].split( "\\s*,\\s*" ) );
            }

            // Create the super type EClass and change its name to the requested one
            EClass superClass = (EClass)EcoreUtil.copy( derivedClass );
            superClass.setName( superTypeName );
            EAnnotation annotation = superClass.getEAnnotation( "http:///org/eclipse/emf/ecore/util/ExtendedMetaData" );
            if( annotation != null ) annotation.getDetails().remove( "name" );

            // If a list of features is given eliminate all others
            if( features != null ) {
                EList<EStructuralFeature> structuralFeatures = superClass.getEStructuralFeatures();
                for( EStructuralFeature feature : new ArrayList<EStructuralFeature>( structuralFeatures ) ) {
                    if( !features.contains( feature.getName() ) ) structuralFeatures.remove( feature );
                }
            }

            // Add super type to package
            pkg.getEClassifiers().add( superClass );

            // add as super type to derived class
            ( (EClass)derivedClass ).getESuperTypes().add( superClass );
        }
    }

    /**
     * Called {@link #extendExtractSuperClass(EPackage)} to sort the keys of the classmap so that next to be created
     * superclass does not doend on a notyet created superclass.
     * 
     * @param superClassMap the map with classes to derie
     * @return the sorted keySet
     * @since Aug 5, 2009
     */
    private List<String> sortSuperClassMapKeys( Map<String, String> superClassMap ) {
        List<String> sortedSuperClassMapKeys = new ArrayList<String>();
        superClassMap = new HashMap<String, String>( superClassMap );
        while( !superClassMap.isEmpty() ) {
            String nextEntryKey = null;
            for( Map.Entry<String, String> entry : superClassMap.entrySet() ) {
                if( !superClassMap.containsValue( entry.getKey() ) ) {
                    nextEntryKey = entry.getKey();
                    break;
                }
            }
            if( nextEntryKey == null ) {
                fail( "Circular class hierarchy" );
            }
            superClassMap.remove( nextEntryKey );
            sortedSuperClassMapKeys.add( nextEntryKey );
        }

        return sortedSuperClassMapKeys;
    }

    /**
     * Adds a super class to a selected object.
     * 
     * <p>
     * This method handles the superClass configuration map.
     * </p>
     * 
     * @param pkg the package of the model
     * @since Aug 5, 2009
     */
    private void extendAddSuperClass( EPackage pkg ) {
        info( "Adding SuperClasses..." );
        Map<String, String> superClassMap = configuration.getMap( CONFIG_SUPER_CLASS );
        for( Map.Entry<String, String> entry : superClassMap.entrySet() ) {
            info( "  " + entry.getKey() + " :: " + entry.getValue() );

            // Get the class for which to to set the super-type
            EClassifier derivedClass = pkg.getEClassifier( entry.getKey() );
            if( !( derivedClass instanceof EClass ) ) {
                fail( "Unknown class " + entry.getKey() );
            }

            // Get the super type
            EClassifier superClass = pkg.getEClassifier( entry.getValue() );
            if( !( derivedClass instanceof EClass ) ) {
                fail( "Unknown class " + entry.getValue() );
            }

            // add as super type to derived class
            ( (EClass)derivedClass ).getESuperTypes().add( (EClass)superClass );

        }
    }

    /**
     * Removes features from each class in the model that one of it super classes already has.
     * 
     * <p>
     * As super classes are in fact synthetic classes the inheriting class actually duplicates the features what seems a
     * problem for EMF when generating the genmodel.
     * </p>
     * 
     * @param pkg the package of the model
     * @since Aug 5, 2009
     */
    private void extendRemoveInheritedFeatures( EPackage pkg ) {
        info( "Removing inherited Features..." );
        for( EClassifier classifier : pkg.getEClassifiers() ) {
            if( !( classifier instanceof EClass ) ) continue;
            EList<EClass> superTypes = ( (EClass)classifier ).getESuperTypes();
            if( superTypes == null || superTypes.size() < 1 ) continue;

            // Get feature names from superTypes
            Set<String> inheritedFeatureNames = new HashSet<String>();
            for( EClass superType : superTypes ) {
                for( EStructuralFeature feature : superType.getEAllStructuralFeatures() ) {
                    inheritedFeatureNames.add( feature.getName() );
                }
            }

            // Remove feature from this type
            List<EStructuralFeature> features = new ArrayList<EStructuralFeature>(
                ( (EClass)classifier ).getEStructuralFeatures() );
            for( EStructuralFeature feature : features ) {
                if( inheritedFeatureNames.contains( feature.getName() ) ) {
                    ( (EClass)classifier ).getEStructuralFeatures().remove( feature );
                }
            }
        }
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
