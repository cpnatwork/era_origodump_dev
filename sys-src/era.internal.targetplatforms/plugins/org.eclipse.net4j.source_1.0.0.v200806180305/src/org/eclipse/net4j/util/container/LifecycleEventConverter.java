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
package org.eclipse.net4j.util.container;

import org.eclipse.net4j.util.event.IEvent;
import org.eclipse.net4j.util.event.IListener;
import org.eclipse.net4j.util.event.INotifier;
import org.eclipse.net4j.util.event.Notifier;
import org.eclipse.net4j.util.lifecycle.ILifecycleEvent;

/**
 * Is registered with each {@link IChannel} of this {@link IConnector}.
 * <p>
 * 
 * @author Eike Stepper
 */
public class LifecycleEventConverter<E> implements IListener
{
  private Notifier owner;

  public LifecycleEventConverter(Notifier owner)
  {
    this.owner = owner;
  }

  public INotifier getOwner()
  {
    return owner;
  }

  public void notifyEvent(IEvent event)
  {
    if (event instanceof ILifecycleEvent)
    {
      ILifecycleEvent e = (ILifecycleEvent)event;
      switch (e.getKind())
      {
      case ACTIVATED:
        added(e);
        break;

      case DEACTIVATED:
        removed(e);
        break;
      }
    }
  }

  protected void added(ILifecycleEvent e)
  {
    fireContainerEvent(e, IContainerDelta.Kind.ADDED);
  }

  protected void removed(ILifecycleEvent e)
  {
    fireContainerEvent(e, IContainerDelta.Kind.REMOVED);
  }

  @SuppressWarnings("unchecked")
  protected void fireContainerEvent(ILifecycleEvent e, IContainerDelta.Kind kind)
  {
    E element = (E)e.getLifecycle();
    if (element != null)
    {
      IContainerEvent<E> event = createContainerEvent((IContainer<E>)owner, element, kind);
      owner.fireEvent(event);
    }
  }

  protected IContainerEvent<E> createContainerEvent(IContainer<E> container, E element, IContainerDelta.Kind kind)
  {
    ContainerEvent<E> event = new ContainerEvent<E>(container);
    event.addDelta(new ContainerDelta<E>(element, kind));
    return event;
  }
}
