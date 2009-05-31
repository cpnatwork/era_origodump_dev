/*******************************************************************************
 * Copyright (c) 2006, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id$
 * /
 *******************************************************************************/

package org.eclipse.jet.ant.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.DirectoryScanner;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.types.FileSet;
import org.eclipse.ant.core.AntCorePlugin;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jet.core.compiler.JETCompilerOptions;
import org.eclipse.jet.internal.builder.WorkspaceCompiler;
import org.eclipse.jet.internal.core.compiler.IJETCompiler;

/**
 * Implement the jet.compile tag.
 *
 */
public class JETCompileTask extends Task {

	private List srcFilesets = new ArrayList();
	private String destdir;
	private IProject eclipseProject;
	private Map jetBuildProperties = new HashMap();

	/**
	 * 
	 */
	public JETCompileTask() {
		super();
	}

	public void addSrcdir(FileSet srcdir) {
		srcFilesets.add(srcdir);
		
	}
	
	public void setDestdir(String destdir) {
		this.destdir = destdir;
		
	}
	
	public void setProject(String eclipseProject) {
		this.eclipseProject = ResourcesPlugin.getWorkspace().getRoot().getProject(eclipseProject);
	}
	
	private void validate() {
		if(destdir == null) throw new BuildException("destdir not set");
		if(srcFilesets.size() == 0) throw new BuildException("srcdir not set");
        if(eclipseProject == null) throw new BuildException("project not set");
		if(!eclipseProject.exists()) throw new BuildException("project does not exist");
		if(!eclipseProject.isOpen()) throw new BuildException("project is not open");
	}
	
	public void execute() throws BuildException {
		validate();
		IProgressMonitor monitor = 
			(IProgressMonitor) getProject().getReferences().get(AntCorePlugin.ECLIPSE_PROGRESS_MONITOR);
		jetBuildProperties.put(JETCompilerOptions.OPTION_COMPILED_TEMPLATE_SRC_DIR, destdir);
		log("destdir: " + destdir);
		IJETCompiler compiler = new WorkspaceCompiler(eclipseProject, null, jetBuildProperties, monitor);
		for (Iterator i = srcFilesets.iterator(); i.hasNext();) {
			FileSet fileset = (FileSet) i.next();
			final DirectoryScanner ds = fileset.getDirectoryScanner(getProject());
			final String[] includedFiles = ds.getIncludedFiles();
			for (int j = 0; j < includedFiles.length; j++) {
			    String templatePath = new Path(includedFiles[j]).toString();
				log("Compiling: " + templatePath, Project.MSG_INFO);
				compiler.compile(templatePath);
			}
		}
		compiler.finish();
	}
}

