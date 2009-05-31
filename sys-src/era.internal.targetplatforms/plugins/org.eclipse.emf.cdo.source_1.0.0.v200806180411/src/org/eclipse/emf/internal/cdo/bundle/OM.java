/***************************************************************************
 * Copyright (c) 2004 - 2008 Eike Stepper, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 **************************************************************************/
package org.eclipse.emf.internal.cdo.bundle;

import org.eclipse.emf.cdo.CDOTransaction;
import org.eclipse.emf.cdo.CDOView;
import org.eclipse.emf.cdo.common.revision.CDORevision;

import org.eclipse.net4j.util.om.OMBundle;
import org.eclipse.net4j.util.om.OMPlatform;
import org.eclipse.net4j.util.om.log.OMLogger;
import org.eclipse.net4j.util.om.pref.OMPreference;
import org.eclipse.net4j.util.om.pref.OMPreferences;
import org.eclipse.net4j.util.om.trace.OMTracer;

/**
 * The <em>Operations & Maintenance</em> class of this bundle.
 * 
 * @author Eike Stepper
 */
public abstract class OM
{
  public static final String BUNDLE_ID = "org.eclipse.emf.cdo"; //$NON-NLS-1$

  public static final OMBundle BUNDLE = OMPlatform.INSTANCE.bundle(BUNDLE_ID, OM.class);

  public static final OMTracer DEBUG = BUNDLE.tracer("debug"); //$NON-NLS-1$

  public static final OMTracer DEBUG_UTIL = DEBUG.tracer("util"); //$NON-NLS-1$

  public static final OMTracer DEBUG_MODEL = DEBUG.tracer("model"); //$NON-NLS-1$

  public static final OMTracer DEBUG_PROTOCOL = DEBUG.tracer("protocol"); //$NON-NLS-1$

  public static final OMTracer DEBUG_REPOSITORY = DEBUG.tracer("repository"); //$NON-NLS-1$

  public static final OMTracer DEBUG_SESSION = DEBUG.tracer("session"); //$NON-NLS-1$

  public static final OMTracer DEBUG_VIEW = DEBUG.tracer("view"); //$NON-NLS-1$

  public static final OMTracer DEBUG_TRANSCTION = DEBUG.tracer("transaction"); //$NON-NLS-1$

  public static final OMTracer DEBUG_OBJECT = DEBUG.tracer("object"); //$NON-NLS-1$

  public static final OMTracer DEBUG_RESOURCE = DEBUG.tracer("resource"); //$NON-NLS-1$

  public static final OMTracer DEBUG_REVISION = DEBUG.tracer("revision"); //$NON-NLS-1$

  public static final OMTracer PERF = BUNDLE.tracer("perf"); //$NON-NLS-1$

  public static final OMTracer PERF_REVISION = PERF.tracer("revision"); //$NON-NLS-1$

  public static final OMTracer PERF_REVISION_LOADING = PERF_REVISION.tracer("loading"); //$NON-NLS-1$

  public static final OMLogger LOG = BUNDLE.logger();

  public static final OMPreferences PREFS = BUNDLE.preferences();

  public static final OMPreference<String> PREF_REPOSITORY_NAME = //
  PREFS.initString("PREF_REPOSITORY_NAME"); //$NON-NLS-1$

  public static final OMPreference<String> PREF_USER_NAME = //
  PREFS.initString("PREF_USER_NAME"); //$NON-NLS-1$

  public static final OMPreference<String> PREF_CONNECTOR_DESCRIPTION = //
  PREFS.initString("PREF_CONNECTOR_DESCRIPTION"); //$NON-NLS-1$

  public static final OMPreference<Integer> PREF_REFERENCE_CHUNK_SIZE = //
  PREFS.init("PREF_REFERENCE_CHUNK_SIZE", CDORevision.UNCHUNKED); //$NON-NLS-1$

  public static final OMPreference<Boolean> PREF_ENABLE_INVALIDATION_NOTIFICATIONS = //
  PREFS.init("PREF_ENABLE_INVALIDATION_NOTIFICATIONS", false); //$NON-NLS-1$

  public static final OMPreference<Integer> PREF_LOAD_REVISION_COLLECTION_CHUNK_SIZE = //
  PREFS.init("PREF_LOAD_REVISION_COLLECTION_CHUNK_SIZE", CDOView.NO_PRELOAD); //$NON-NLS-1$

  public static final OMPreference<Long> PREF_DEFAULT_COMMIT_TIMEOUT = //
  PREFS.init("PREF_DEFAULT_COMMIT_TIMEOUT", CDOTransaction.DEFAULT_COMMIT_TIMEOUT); //$NON-NLS-1$
}
