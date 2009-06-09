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
package org.eclipse.net4j.util.transaction;

/**
 * @author Eike Stepper
 */
public class TransactionException extends RuntimeException
{
  private static final long serialVersionUID = 1L;

  public TransactionException()
  {
  }

  public TransactionException(String message)
  {
    super(message);
  }

  public TransactionException(Throwable cause)
  {
    super(cause);
  }

  public TransactionException(String message, Throwable cause)
  {
    super(message, cause);
  }
}
