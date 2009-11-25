/*
 * %%FILE_HEADER%%
 *
 * NAME: era.internal.tools.ecore.ExtendGenModelTask
 * CREATED: May 21, 2009
 */

package era.internal.tools.ecore.ant;

import java.io.File;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

import era.internal.tools.ecore.ExtendEcore;
import era.internal.tools.ecore.ExtendGenModel;

/**
 * ant task for {@link ExtendGenModel}.
 * 
 * @author poldi
 */
public class ExtendGenModelTask extends Task {

    //
    // private members

    /**
     * The properties file from which to read the configuration
     */
    private String config = null;

    /**
     * The input ecore file
     */
    private String ecoreSource = null;

    /**
     * true to print info messages
     */
    private boolean verbose = false;

    /**
     * @param verbose true to print info messages
     */
    public void setVerbose( boolean verbose ) {
        this.verbose = verbose;
    }

    /**
     * attribute config.
     * 
     * @param config The config properties file
     */
    public void setConfig( String config ) {
        this.config = config;
    }

    /**
     * attribute source.
     * 
     * @param ecoreSource The input ecore file
     */
    public void setSource( String ecoreSource ) {
        this.ecoreSource = ecoreSource;
    }

    /**
     * Called by ant to run the task.
     * 
     * <p>
     * Calls {@link ExtendEcore}
     * </p>
     * 
     * @see org.apache.tools.ant.Task#execute()
     */
    @Override
    public void execute() throws BuildException {
        File configFile = new File( config );
        File ecoreSourceFile = new File( ecoreSource );

        if( !configFile.canRead() ) {
            throw new BuildException( "Cannot read config properties " + configFile.getAbsolutePath() );
        }
        if( !ecoreSourceFile.canRead() ) {
            throw new BuildException( "Cannot read ecore source file " + ecoreSourceFile.getAbsolutePath() );
        }

        ExtendGenModel generator = new ExtendGenModel();
        generator.setVerbose( verbose );
        generator.generate( configFile.getAbsolutePath(), ecoreSourceFile.getAbsolutePath() );
    }

}
