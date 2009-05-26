/*
 * %%FILE_HEADER%%
 *
 * NAME: era.internal.tools.ecore.ExtendGenModel
 * CREATED: May 19, 2009
 */

package era.internal.tools.ecore;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenResourceKind;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenModelImpl;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenPackageImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * 
 * @author poldi
 */
public class ExtendGenModel extends AbstractTools {

    //
    // defines

    /**
     * File extension for the ecore file
     */
    public static final String FILEEXT_ECORE = "ecore";

    /**
     * File extension for genmodel file
     */
    public static final String FILEEXT_GENMODEL = "genmodel";

    /**
     * config properties: custom model directory attribute
     */
    public static final String CONFIG_MODEL_DIRECTORY = "modelDirectory";

    /**
     * config properties default: custom model directory attribute
     */
    public static final String CONFIG_DEFAULT_MODEL_DIRECTORY = "/TargetProject/src";

    /**
     * config properties: edit source directory attribute
     */
    public static final String CONFIG_EDIT_DIRECTORY = "editDirectory";

    /**
     * config properties: editor source directory attribute
     */
    public static final String CONFIG_EDITOR_DIRECTORY = "editorDirectory";

    /**
     * config properties: plugin id of the model
     */
    public static final String CONFIG_MODEL_PLUGIN_ID = "modelPluginId";

    /**
     * config properties: plugin id of the edit plugin
     */
    public static final String CONFIG_EDIT_PLUGIN_ID = "editPluginId";

    /**
     * config properties: plugin id of the edit plugin
     */
    public static final String CONFIG_EDITOR_PLUGIN_ID = "editorPluginId";

    /**
     * config properties: Bundle Activator class for the model plug-in
     */
    public static final String CONFIG_MODEL_PLUGIN_CLASS = "modelPluginClass";

    /**
     * config properties: Bundle Activator class for the edit plug-in
     */
    public static final String CONFIG_EDIT_PLUGIN_CLASS = "editPluginClass";

    /**
     * config properties: Bundle Activator class for the editor plug-in
     */
    public static final String CONFIG_EDITOR_PLUGIN_CLASS = "editorPluginClass";

    /**
     * config properties: custom source filename of the model
     */
    public static final String CONFIG_FOREIGN_MODEL = "foreignModel";

    /**
     * config properties: custom model name attribute
     */
    public static final String CONFIG_MODEL_NAME = "modelName";

    /**
     * config properties default: custom model name attribute
     */
    public static final String CONFIG_DEFAULT_MODEL_NAME = "default";

    /**
     * config properties: custom prefix attribute
     */
    public static final String CONFIG_PREFIX = "prefix";

    /**
     * config properties: custom modelPackage attribute that names the Java package to place the model to
     */
    public static final String CONFIG_MODEL_PACKAGE = "modelPackage";

    /**
     * config properties: Copyright for the manifest
     */
    public static final String CONFIG_COPYRIGHT = "copyright";

    /**
     * config properties: class from which model elements are derived, defaults EObjectImpl
     */
    public static final String CONFIG_EXTENDS_CLASS = "extendsClass";

    /**
     * config properties: interface from which model elements are derived, defaults EObject
     */
    public static final String CONFIG_EXTENDS_INTERFACE = "extendsInterface";

    /**
     * config properties: interface from which model elements are derived
     */
    public static final String CONFIG_IMPLEMENTS_INTERFACE = "implementsInterface";

    /**
     * config properties: true to use bitfields for booleans
     */
    public static final String CONFIG_BOOLEAN_FLAGS_FIELD = "booleanFlagsField";

    /**
     * config properties: Additional classpath for the model plug-in
     */
    public static final String CONFIG_CLASSPATH = "classpath";

    /**
     * config properties: Generate icons
     */
    public static final String CONFIG_EDIT_ICONS = "icons";

    /**
     * config properties: generate a new model wizard
     */
    public static final String CONFIG_MODEL_WIZARD = "modelWizard";

    /**
     * config properties: file content type
     */
    public static final String CONFIG_CONTENT_TYPE = "contentType";

    /**
     * config properties: file extension for model files
     */
    public static final String CONFIG_FILE_EXTENSION = "fileExtension";

    /**
     * config properties: sub package where to place the model API
     */
    public static final String CONFIG_INTERFACE_PACKAGE = "interfacePackage";

    /**
     * config properties: sub package where to place the model implementation
     */
    public static final String CONFIG_IMPLEMENTATION_PACKAGE = "implementationPackage";

    /**
     * config properties: sub package where to place the edit provider
     */
    public static final String CONFIG_PROVIDER_PACKAGE = "providerPackage";

    /**
     * config properties: sub package where to place the editor
     */
    public static final String CONFIG_PRESENTATION_PACKAGE = "editorPackage";

    //
    // private members

    private ConfigurationProperties configuration;

    public ExtendGenModel() {
    }

    /**
     * run the generation.
     * 
     * @param configFile The configFile with the configuration properties
     * @param ecorePath the file to take as input
     */
    public void generate( String configFile, String ecorePath ) {
        println( "ExtendGenModel " + abrev( configFile ) + " \\" );
        println( "               " + abrev( ecorePath ) );

        // Load configuration
        try {
            configuration = new ConfigurationProperties( configFile );
        } catch( IOException e ) {
            fail( e );
        }

        // Create genModel with default values
        GenModel genModel = createGenModel();

        // customized toplevel GenModel element
        extendGenModel( genModel );

        // Add nodes from ecore to GenModel
        addEcoreModel( genModel, ecorePath );

        // Extend the package element
        extendGenPackage( genModel );

        // Save the Genemodel file to <ecore>.genmodel
        saveGenModel( genModel, getGenModelPath( ecorePath ) );
    }

    /**
     * @see era.internal.tools.ecore.AbstractTools#getResourceFileExtension()
     */
    @Override
    protected String[] getResourceFileExtensions() {
        return new String[]{FILEEXT_ECORE, FILEEXT_GENMODEL};
    }

    /**
     * Get the filename of the genmodel.
     * 
     * @param ecorePath Path to the ecore file
     * @return the file name
     */
    private String getGenModelPath( String ecorePath ) {
        ecorePath = ecorePath.lastIndexOf( '.' ) != -1
            ? ecorePath.substring( 0, ecorePath.lastIndexOf( '.' ) )
            : ecorePath;
        return ecorePath + "." + FILEEXT_GENMODEL;
    }

    /**
     * Creates an empty GenModel.
     */
    private GenModel createGenModel() {
        return GenModelFactory.eINSTANCE.createGenModel();
    }

    /**
     * Makes changes to the genmodel top element (packages does not yet exist).
     * 
     * @param genModel the model
     */
    private void extendGenModel( GenModel genModel ) {
        info( "Extending GenModel element..." );
        genModel.setCodeFormatting( true );

        set( genModel, GenModelPackage.GEN_MODEL__COPYRIGHT_TEXT, CONFIG_COPYRIGHT );

        set( genModel, GenModelPackage.GEN_MODEL__ROOT_EXTENDS_CLASS, CONFIG_EXTENDS_CLASS );
        set( genModel, GenModelPackage.GEN_MODEL__ROOT_EXTENDS_INTERFACE, CONFIG_EXTENDS_INTERFACE );
        set( genModel, GenModelPackage.GEN_MODEL__ROOT_IMPLEMENTS_INTERFACE, CONFIG_IMPLEMENTS_INTERFACE );

        set( genModel, GenModelPackage.GEN_MODEL__BOOLEAN_FLAGS_FIELD, CONFIG_BOOLEAN_FLAGS_FIELD );

        set( genModel, GenModelPackage.GEN_MODEL__MODEL_PLUGIN_VARIABLES, CONFIG_CLASSPATH );
        genModel.setModelDirectory( configuration.getValue( CONFIG_MODEL_DIRECTORY, CONFIG_DEFAULT_MODEL_DIRECTORY ) );
        set( genModel, GenModelPackage.GEN_MODEL__MODEL_PLUGIN_ID, CONFIG_MODEL_PLUGIN_ID );
        set( genModel, GenModelPackage.GEN_MODEL__MODEL_PLUGIN_CLASS, CONFIG_MODEL_PLUGIN_CLASS );

        set( genModel, GenModelPackage.GEN_MODEL__EDIT_DIRECTORY, CONFIG_EDIT_DIRECTORY );
        set( genModel, GenModelPackage.GEN_MODEL__EDIT_PLUGIN_ID, CONFIG_EDIT_PLUGIN_ID );
        set( genModel, GenModelPackage.GEN_MODEL__EDIT_PLUGIN_CLASS, CONFIG_EDIT_PLUGIN_CLASS );
        setBool( genModel, GenModelPackage.GEN_MODEL__CREATION_ICONS, CONFIG_EDIT_ICONS );

        set( genModel, GenModelPackage.GEN_MODEL__EDITOR_DIRECTORY, CONFIG_EDITOR_DIRECTORY );
        set( genModel, GenModelPackage.GEN_MODEL__EDITOR_PLUGIN_ID, CONFIG_EDITOR_PLUGIN_ID );
        set( genModel, GenModelPackage.GEN_MODEL__EDITOR_PLUGIN_CLASS, CONFIG_EDITOR_PLUGIN_CLASS );
    }

    /**
     * Change an attribute of the GenModel element.
     * 
     * <p>
     * The attribute is only set if the configuration file defines it
     * </p>
     * 
     * @param genModel The GenModel
     * @param feature feature naming the attribute
     * @param property configuration property
     */
    private void set( GenModel genModel, int feature, String property ) {
        if( configuration.hasValue( property ) ) {
            ((GenModelImpl)genModel).eSet( feature, configuration.getValue( property ) );
            info( "  manual: " + property + " -> " + configuration.getValue( property ) );
        }
    }

    /**
     * Change an attribute of the GenModel element.
     * 
     * <p>
     * The attribute is only set if the configuration file defines it
     * </p>
     * 
     * @param genModel The GenModel
     * @param feature feature naming the attribute
     * @param property configuration property
     */
    private void setBool( GenModel genModel, int feature, String property ) {
        if( configuration.hasValue( property ) ) {
            try {
                ((GenModelImpl)genModel).eSet( feature, Boolean.valueOf( configuration.getValue( property ) ) );
            } catch( Exception e ) {
                fail( e );
            }
            info( "  manual: " + property + " -> " + configuration.getValue( property ) );
        }
    }

    /**
     * Add the ecore model to the genmodel creating the whole genmodel content.
     * 
     * @param genModel The GenModel to adapt
     * @param ecorePath the path to the ecore file
     */
    private void addEcoreModel( GenModel genModel, String ecorePath ) {
        genModel.getForeignModel().add( configuration.getValue( CONFIG_FOREIGN_MODEL, ecorePath ) );
        EPackage ePackage = loadResource( ecorePath );
        ePackage.eResource().setURI( URI.createFileURI( ecorePath.substring( ecorePath.lastIndexOf( '/' ) + 1 ) ) );
        genModel.initialize( Collections.singleton( ePackage ) );
    }

    /**
     * Changes properties of the genPackage.
     * 
     * @param genModel The model
     */
    private void extendGenPackage( GenModel genModel ) {
        genModel.setModelName( configuration.getValue( CONFIG_MODEL_NAME, CONFIG_DEFAULT_MODEL_NAME ) );

        GenPackage genPackage = genModel.getGenPackages().get( 0 );
        genPackage.setResource( GenResourceKind.XML_LITERAL );

        genPackage.setGenerateExampleClass( false );
        setBool( genPackage, GenModelPackage.GEN_PACKAGE__GENERATE_MODEL_WIZARD, CONFIG_MODEL_WIZARD );

        set( genPackage, GenModelPackage.GEN_PACKAGE__CONTENT_TYPE_IDENTIFIER, CONFIG_CONTENT_TYPE );
        set( genPackage, GenModelPackage.GEN_PACKAGE__FILE_EXTENSIONS, CONFIG_FILE_EXTENSION );

        set( genPackage, GenModelPackage.GEN_PACKAGE__PREFIX, CONFIG_PREFIX );
        set( genPackage, GenModelPackage.GEN_PACKAGE__BASE_PACKAGE, CONFIG_MODEL_PACKAGE );
        set( genPackage, GenModelPackage.GEN_PACKAGE__INTERFACE_PACKAGE_SUFFIX, CONFIG_INTERFACE_PACKAGE );
        set( genPackage, GenModelPackage.GEN_PACKAGE__CLASS_PACKAGE_SUFFIX, CONFIG_IMPLEMENTATION_PACKAGE );
        set( genPackage, GenModelPackage.GEN_PACKAGE__PROVIDER_PACKAGE_SUFFIX, CONFIG_PROVIDER_PACKAGE );
        set( genPackage, GenModelPackage.GEN_PACKAGE__PRESENTATION_PACKAGE_SUFFIX, CONFIG_PRESENTATION_PACKAGE );
    }

    /**
     * Change an attribute of the genPackage element.
     * 
     * <p>
     * The attribute is only set if the configuration file defines it
     * </p>
     * 
     * @param genPackage The genPackage to change
     * @param feature feature naming the attribute
     * @param property configuration property
     */
    private void set( GenPackage genPackage, int feature, String property ) {
        if( configuration.hasValue( property ) ) {
            ((GenPackageImpl)genPackage).eSet( feature, configuration.getValue( property ) );
            info( "  manual: " + property + " -> " + configuration.getValue( property ) );
        }
    }

    /**
     * Change an attribute of the genPackage element.
     * 
     * <p>
     * The attribute is only set if the configuration file defines it
     * </p>
     * 
     * @param genPackage The genPackage to change
     * @param feature feature naming the attribute
     * @param property configuration property
     */
    private void setBool( GenPackage genPackage, int feature, String property ) {
        if( configuration.hasValue( property ) ) {
            try {
                ((GenPackageImpl)genPackage).eSet( feature, Boolean.valueOf( configuration.getValue( property ) ) );
            } catch( Exception e ) {
                fail( e );
            }
            info( "  manual: " + property + " -> " + configuration.getValue( property ) );
        }
    }

    /**
     * Saves the given GenModel to disk.
     * 
     * @param genModel The model to save
     * @param genModelPath path to the genmodel file
     */
    private void saveGenModel( GenModel genModel, String genModelPath ) {
        Resource outputResource = getResource( genModelPath );
        outputResource.getContents().add( genModel );
        try {
            outputResource.save( null );
        } catch( IOException e ) {
            fail( e );
        }
    }

    /**
     * Prints the command line usage and exists with code 1.
     */
    public static void usage() {
        System.out.println( "ExtendGenModel <config>.properties <input>.ecore" );
        System.exit( 1 );
    }

    /**
     * ExtendEcore <config>.properties <input>.ecore
     * 
     * @param args command line
     */
    public static void main( String[] args ) {
        if( args.length != 2 ) usage();
        new ExtendGenModel().generate( args[0], args[1] );
    }

}
