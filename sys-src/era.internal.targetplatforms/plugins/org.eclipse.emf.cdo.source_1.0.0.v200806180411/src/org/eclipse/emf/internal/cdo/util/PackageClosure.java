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
package org.eclipse.emf.internal.cdo.util;

import org.eclipse.emf.internal.cdo.bundle.OM;

import org.eclipse.net4j.util.om.trace.ContextTracer;

import org.eclipse.emf.ecore.EPackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Eike Stepper
 */
public abstract class PackageClosure implements IPackageClosure
{
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG_MODEL, PackageClosure.class);

  protected PackageClosure()
  {
  }

  public Set<EPackage> calculate(Collection<EPackage> ePackages)
  {
    // Optimize no packages
    if (ePackages.isEmpty())
    {
      return EMPTY_CLOSURE;
    }

    // Optimize 1 package
    if (ePackages.size() == 1)
    {
      EPackage ePackage = ePackages.iterator().next();
      return calculate(ePackage);
    }

    // Handle >1 packages
    Set<EPackage> result = new HashSet<EPackage>();
    for (EPackage ePackage : ePackages)
    {
      Set<EPackage> packages = calculate(ePackage);
      result.addAll(packages);
    }

    return result;
  }

  public Set<EPackage> calculate(EPackage ePackage)
  {
    if (TRACER.isEnabled())
    {
      TRACER.trace("Package closure for " + ePackage.getNsURI());
    }

    Set<EPackage> visited = new HashSet<EPackage>();
    collectContents(ePackage, visited);
    return visited;
  }

  protected abstract void collectContents(EPackage ePackage, Set<EPackage> visited);
}
