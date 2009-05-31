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
package org.eclipse.emf.cdo.util;

/**
 * @author Eike Stepper
 */
public class ServerException extends RuntimeException
{
  private static final long serialVersionUID = 1L;

  public ServerException()
  {
  }

  public ServerException(String message)
  {
    super(message);
  }

  public ServerException(String message, Throwable cause)
  {
    super(message, cause);
  }

  public ServerException(Throwable cause)
  {
    super(cause);
  }
}
