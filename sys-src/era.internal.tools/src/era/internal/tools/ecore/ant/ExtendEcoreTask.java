/*
 * %%FILE_HEADER%%
 *
 * NAME: era.internal.tools.ecore.ExtendEcoreTask
 * CREATED: May 21, 2009
 */

package era.internal.tools.ecore.ant;

import java.io.File;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

import era.internal.tools.ecore.ExtendEcore;

/**
 * ant task fore {@link ExtendEcore}.
 * 
 * @author poldi
 */
public class ExtendEcoreTask extends Task {

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
     * The generated ecore file
     */
    private String ecoreTarget = null;

    /**
     * true to print info messages
     */
    private boolean verbose = false;

    /**
     * @param verbose true to print info messages
     */
    public void setVerbose( String verbose ) {
        verbose = verbose != null ? verbose.trim() : null;
        this.verbose = "true".equalsIgnoreCase( verbose ) || "yes".equalsIgnoreCase( verbose );
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
     * attribute target.
     * 
     * @param ecoreTarget The generated ecore file
     */
    public void setTarget( String ecoreTarget ) {
        this.ecoreTarget = ecoreTarget;
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
        File ecoreTargetFile = new File( ecoreTarget );

        if( !configFile.canRead() ) {
            throw new BuildException( "Cannot read config properties " + configFile.getAbsolutePath() );
        }
        if( !ecoreSourceFile.canRead() ) {
            throw new BuildException( "Cannot read ecore source file " + ecoreSourceFile.getAbsolutePath() );
        }
        if( !ecoreTargetFile.getParentFile().isDirectory() ) {
            throw new BuildException( "Cannot access target directory "
                + ecoreTargetFile.getParentFile().getAbsolutePath() );
        }

        ExtendEcore generator = new ExtendEcore();
        generator.setVerbose( verbose );
        generator.generate( configFile.getAbsolutePath(),
                            ecoreSourceFile.getAbsolutePath(),
                            ecoreTargetFile.getAbsolutePath() );
    }

}
