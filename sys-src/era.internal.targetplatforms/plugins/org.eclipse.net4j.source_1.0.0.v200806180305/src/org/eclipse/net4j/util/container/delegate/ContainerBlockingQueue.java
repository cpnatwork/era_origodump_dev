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
package org.eclipse.net4j.util.container.delegate;

import org.eclipse.net4j.util.container.ContainerEvent;
import org.eclipse.net4j.util.container.IContainerDelta;

import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author Eike Stepper
 */
public class ContainerBlockingQueue<E> extends ContainerQueue<E> implements IContainerBlockingQueue<E>
{
  public ContainerBlockingQueue(BlockingQueue<E> delegate)
  {
    super(delegate);
  }

  @Override
  public BlockingQueue<E> getDelegate()
  {
    return (BlockingQueue<E>)super.getDelegate();
  }

  /**
   * @category WRITE
   */
  public int drainTo(Collection<? super E> c)
  {
    int drainTo = getDelegate().drainTo(c);
    ContainerEvent<E> event = createEvent(c, IContainerDelta.Kind.REMOVED);
    fireEvent(event);
    return drainTo;
  }

  /**
   * @category WRITE
   */
  public int drainTo(Collection<? super E> c, int maxElements)
  {
    int drainTo = getDelegate().drainTo(c, maxElements);
    ContainerEvent<E> event = createEvent(c, IContainerDelta.Kind.REMOVED);
    fireEvent(event);
    return drainTo;
  }

  /**
   * @category WRITE
   */
  public boolean offer(E o, long timeout, TimeUnit unit) throws InterruptedException
  {
    boolean modified = getDelegate().offer(o, timeout, unit);
    if (modified)
    {
      fireAddedEvent(o);
    }

    return modified;
  }

  /**
   * @category WRITE
   */
  public E poll(long timeout, TimeUnit unit) throws InterruptedException
  {
    E removed = getDelegate().poll(timeout, unit);
    if (removed != null)
    {
      fireRemovedEvent(removed);
    }

    return removed;
  }

  /**
   * @category WRITE
   */
  public void put(E o) throws InterruptedException
  {
    getDelegate().put(o);
    fireAddedEvent(o);
  }

  /**
   * @category READ
   */
  public int remainingCapacity()
  {
    return getDelegate().remainingCapacity();
  }

  /**
   * @category WRITE
   */
  public E take() throws InterruptedException
  {
    E element = getDelegate().take();
    fireRemovedEvent(element);
    return element;
  }
}
