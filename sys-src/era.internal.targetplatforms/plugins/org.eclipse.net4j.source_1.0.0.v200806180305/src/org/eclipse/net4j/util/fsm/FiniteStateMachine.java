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
package org.eclipse.net4j.util.fsm;

import org.eclipse.net4j.internal.util.bundle.OM;
import org.eclipse.net4j.util.event.IEvent;
import org.eclipse.net4j.util.event.INotifier;
import org.eclipse.net4j.util.lifecycle.Lifecycle;
import org.eclipse.net4j.util.om.trace.ContextTracer;

import java.text.MessageFormat;

/**
 * @author Eike Stepper
 */
public abstract class FiniteStateMachine<STATE extends Enum<?>, EVENT extends Enum<?>, SUBJECT> extends Lifecycle
{
  @SuppressWarnings("unchecked")
  public static final ITransition IGNORE = new IgnoreTransition();

  @SuppressWarnings("unchecked")
  public static final ITransition FAIL = new FailTransition();

  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, FiniteStateMachine.class);

  private static final String MSG_PROCESS = "Processing event {0} in state {1} for {2} (data={3})";

  private static final String MSG_IGNORE = "Ignoring event {0} in state {1} for {2} (data={3})";

  private static final String MSG_FAIL = "Failing event {0} in state {1} for {2} (data={3})";

  private STATE[] states;

  private EVENT[] events;

  private ITransition<STATE, EVENT, SUBJECT, ?>[][] transitions;

  @SuppressWarnings("unchecked")
  public FiniteStateMachine(Class<STATE> stateEnum, Class<EVENT> eventEnum,
      ITransition<STATE, EVENT, SUBJECT, ?> defaultTransition)
  {
    states = stateEnum.getEnumConstants();
    events = eventEnum.getEnumConstants();
    transitions = new ITransition[states.length][events.length];
    initAll(defaultTransition);
  }

  @SuppressWarnings("unchecked")
  public FiniteStateMachine(Class<STATE> stateEnum, Class<EVENT> eventEnum)
  {
    this(stateEnum, eventEnum, FAIL);
  }

  public final STATE[] getStates()
  {
    return states;
  }

  public final EVENT[] getEvents()
  {
    return events;
  }

  public final ITransition<STATE, EVENT, SUBJECT, ?> getTransition(STATE state, EVENT event)
  {
    int s = state.ordinal();
    int e = event.ordinal();
    return transitions[s][e];
  }

  public final void init(STATE state, EVENT event, STATE targetState)
  {
    init(state, event, new ChangeStateTransition(targetState));
  }

  public final void init(STATE state, EVENT event, ITransition<STATE, EVENT, SUBJECT, ?> transition)
  {
    checkTransition(transition);
    int s = state.ordinal();
    int e = event.ordinal();
    transitions[s][e] = transition;
  }

  public final void initEvents(STATE state, STATE targetState)
  {
    initEvents(state, new ChangeStateTransition(targetState));
  }

  public final void initEvents(STATE state, ITransition<STATE, EVENT, SUBJECT, ?> transition)
  {
    checkTransition(transition);
    int s = state.ordinal();
    for (int e = 0; e < events.length; e++)
    {
      transitions[s][e] = transition;
    }
  }

  public final void initStates(EVENT event, STATE targetState)
  {
    initStates(event, new ChangeStateTransition(targetState));
  }

  public final void initStates(EVENT event, ITransition<STATE, EVENT, SUBJECT, ?> transition)
  {
    checkTransition(transition);
    int e = event.ordinal();
    for (int s = 0; s < states.length; s++)
    {
      transitions[s][e] = transition;
    }
  }

  public final void initAll(STATE targetState)
  {
    initAll(new ChangeStateTransition(targetState));
  }

  public final void initAll(ITransition<STATE, EVENT, SUBJECT, ?> transition)
  {
    checkTransition(transition);
    for (int s = 0; s < states.length; s++)
    {
      for (int e = 0; e < events.length; e++)
      {
        transitions[s][e] = transition;
      }
    }
  }

  @SuppressWarnings("unchecked")
  public final <DATA> void process(SUBJECT subject, EVENT event, DATA data)
  {
    STATE state = getState(subject);
    int s = state.ordinal();
    int e = event.ordinal();
    ITransition<STATE, EVENT, SUBJECT, DATA> transition = (ITransition<STATE, EVENT, SUBJECT, DATA>)transitions[s][e];
    if (transition == IGNORE)
    {
      // Do nothing
    }
    else if (transition == FAIL)
    {
      throw new IllegalStateException(formatFailMessage(subject, state, event, data));
    }
    else
    {
      if (TRACER.isEnabled())
      {
        TRACER.trace(formatProcessMessage(subject, state, event, data));
      }

      transition.execute(subject, state, event, data);
    }
  }

  @SuppressWarnings("unchecked")
  protected ITransition<STATE, EVENT, SUBJECT, ?> createIgnoreTransition(STATE state, EVENT event)
  {
    return IGNORE;
  }

  @SuppressWarnings("unchecked")
  protected ITransition<STATE, EVENT, SUBJECT, ?> createFailTransition(STATE state, EVENT event)
  {
    return FAIL;
  }

  protected String formatProcessMessage(SUBJECT subject, STATE state, EVENT event, Object data)
  {
    return MessageFormat.format(MSG_PROCESS, event, state, subject, data);
  }

  protected String formatIgnoreMessage(SUBJECT subject, STATE state, EVENT event, Object data)
  {
    return MessageFormat.format(MSG_IGNORE, event, state, subject, data);
  }

  protected String formatFailMessage(SUBJECT subject, STATE state, EVENT event, Object data)
  {
    return MessageFormat.format(MSG_FAIL, event, state, subject, data);
  }

  protected abstract STATE getState(SUBJECT subject);

  protected abstract void setState(SUBJECT subject, STATE state);

  protected void changeState(SUBJECT subject, STATE state)
  {
    STATE oldState = getState(subject);
    setState(subject, state);
    if (oldState != state)
    {
      fireEvent(new StateChangedEvent(subject, oldState, state));
    }
  }

  private void checkTransition(ITransition<STATE, EVENT, SUBJECT, ?> transition)
  {
    if (transition == null)
    {
      throw new IllegalArgumentException("transition == null");
    }
  }

  /**
   * @author Eike Stepper
   */
  public static class IgnoreTransition implements ITransition<Enum<?>, Enum<?>, Object, Object>
  {
    public void execute(Object subject, Enum<?> state, Enum<?> event, Object data)
    {
      // Do nothing
    }

    @Override
    public String toString()
    {
      return "IGNORE";
    }
  }

  /**
   * @author Eike Stepper
   */
  public static class FailTransition implements ITransition<Enum<?>, Enum<?>, Object, Object>
  {
    public void execute(Object subject, Enum<?> state, Enum<?> event, Object data)
    {
      // Do nothing
    }

    @Override
    public String toString()
    {
      return "FAIL";
    }
  }

  /**
   * @author Eike Stepper
   */
  public class ChangeStateTransition implements ITransition<STATE, EVENT, SUBJECT, Object>
  {
    private STATE targetState;

    public ChangeStateTransition(STATE targetState)
    {
      this.targetState = targetState;
    }

    public STATE getTargetState()
    {
      return targetState;
    }

    public void execute(SUBJECT subject, STATE state, EVENT event, Object data)
    {
      changeState(subject, targetState);
    }

    @Override
    public String toString()
    {
      return MessageFormat.format("CHANGE_STATE[{0}]", targetState);
    }
  }

  /**
   * @author Eike Stepper
   */
  public class StateChangedEvent implements IEvent
  {
    private Object subject;

    private Enum<?> oldState;

    private Enum<?> newState;

    public StateChangedEvent(Object subject, Enum<?> oldState, Enum<?> newState)
    {
      this.subject = subject;
      this.oldState = oldState;
      this.newState = newState;
    }

    public INotifier getSource()
    {
      return FiniteStateMachine.this;
    }

    public Object getSubject()
    {
      return subject;
    }

    public Enum<?> getOldState()
    {
      return oldState;
    }

    public Enum<?> getNewState()
    {
      return newState;
    }
  }
}
