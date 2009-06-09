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
package org.eclipse.net4j.util.concurrent;

/**
 * @author Eike Stepper
 */
public interface ICorrelator<CORRELATION, VALUE>
{
  public boolean isCorrelated(CORRELATION correlation);

  public VALUE correlate(CORRELATION correlation);

  public VALUE correlateUnique(CORRELATION correlation);

  public VALUE uncorrelate(CORRELATION correlation);
}
