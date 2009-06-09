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
package org.eclipse.net4j.util.cache;

import org.eclipse.net4j.util.cache.ICacheMonitor.Condition;

/**
 * @author Eike Stepper
 */
public class HysteresisConditionPolicy extends ThresholdConditionPolicy
{
  private long thresholdYellowRed;

  private long thresholdGreenYellow;

  public HysteresisConditionPolicy(long thresholdYellowRed, long thresholdRedYellow, long thresholdGreenYellow,
      long thresholdYellowGreen)
  {
    super(thresholdRedYellow, thresholdYellowGreen);
    if (thresholdYellowRed > thresholdRedYellow)
    {
      throw new IllegalArgumentException("thresholdYellowRed > thresholdRedYellow");
    }

    if (thresholdRedYellow > thresholdGreenYellow)
    {
      throw new IllegalArgumentException("thresholdRedYellow > thresholdGreenYellow");
    }

    if (thresholdGreenYellow > thresholdYellowGreen)
    {
      throw new IllegalArgumentException("thresholdGreenYellow > thresholdYellowGreen");
    }

    this.thresholdGreenYellow = thresholdGreenYellow;
    this.thresholdYellowRed = thresholdYellowRed;
  }

  public long getThresholdYellowRed()
  {
    return thresholdYellowRed;
  }

  public long getThresholdGreenYellow()
  {
    return thresholdGreenYellow;
  }

  @Override
  protected Condition getNewCondition(Condition oldCondition, long freeMemory)
  {
    switch (oldCondition)
    {
    case GREEN:
      if (freeMemory < thresholdYellowRed)
      {
        return Condition.RED;
      }

      if (freeMemory < thresholdGreenYellow)
      {
        return Condition.YELLOW;
      }

      return Condition.GREEN;

    case YELLOW:
      if (freeMemory < thresholdYellowRed)
      {
        return Condition.RED;
      }

      if (freeMemory > getThresholdYellowGreen())
      {
        return Condition.GREEN;
      }

      return Condition.YELLOW;

    case RED:
      if (freeMemory > getThresholdYellowGreen())
      {
        return Condition.GREEN;
      }

      if (freeMemory > getThresholdRedYellow())
      {
        return Condition.YELLOW;
      }

      return Condition.RED;

    default:
      throw new IllegalArgumentException("oldCondition == " + oldCondition);
    }
  }
}
