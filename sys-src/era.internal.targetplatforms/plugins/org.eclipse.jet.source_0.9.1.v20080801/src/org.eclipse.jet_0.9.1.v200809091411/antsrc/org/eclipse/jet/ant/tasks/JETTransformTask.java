/**
 * <copyright>
 *
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
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
 */

package org.eclipse.jet.ant.tasks;

import java.text.MessageFormat;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.eclipse.ant.core.AntCorePlugin;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jet.JET2Platform;
import org.eclipse.jet.internal.l10n.JET2Messages;

/**
 * Implement an ANT Task to run a JET transform.
 *
 */
public class JETTransformTask extends Task {

	private String transformId = null;
	
	private String source = null;
	/**
	 * 
	 */
	public JETTransformTask() {
		super();
		// TODO Auto-generated constructor stub
	}

	public final String getTransformId() {
		return transformId;
	}

	public final void setTransformId(String transformId) {
		this.transformId = transformId;
	}

	public final String getSource() {
		return source;
	}

	public final void setSource(String source) {
		this.source = source;
	}
	
	public void execute() throws BuildException {
		final String missingAttrMsg = "Missing required attribute ''{0}''";
		if(transformId == null) {
			throw new BuildException(MessageFormat.format(missingAttrMsg, new Object[] {"transformId"})); //$NON-NLS-1$
		}
        if(JET2Platform.getJETBundleManager().getDescriptor(transformId) == null) {
          throw new BuildException(MessageFormat.format(JET2Messages.JET2Platform_TransformNotFound, new Object[] {transformId}));
        }
		if(source == null) {
			throw new BuildException(MessageFormat.format(missingAttrMsg, new Object[] {"source"})); //$NON-NLS-1$
		}
		
		final IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(source);
		
		if(resource == null) {
			throw new BuildException("Could not find resource \"" + source + "\".");
		}
		
		IProgressMonitor monitor = 
			(IProgressMonitor) getProject().getReferences().get(AntCorePlugin.ECLIPSE_PROGRESS_MONITOR);
		if(monitor == null) {
			monitor = new NullProgressMonitor();
		}

		log("Running \"" + transformId + "\" on resource \"" + resource.getFullPath().toString() + "\".");
		
		final IStatus result = JET2Platform.runTransformOnResource(transformId, resource, monitor);
		if(!result.isOK()) {
			throw new BuildException(result.getMessage());
		}
	}

}
