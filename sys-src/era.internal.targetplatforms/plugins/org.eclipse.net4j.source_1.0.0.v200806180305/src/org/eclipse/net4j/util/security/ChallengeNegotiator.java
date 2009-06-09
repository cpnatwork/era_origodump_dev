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
package org.eclipse.net4j.util.security;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * @author Eike Stepper
 */
public class ChallengeNegotiator extends ChallengeResponseNegotiator
{
  public static final int DEFAULT_TOKEN_LENGTH = 1024;

  private int tokenLength = DEFAULT_TOKEN_LENGTH;

  private IRandomizer randomizer;

  private IUserManager userManager;

  public ChallengeNegotiator()
  {
    super(true);
  }

  public int getTokenLength()
  {
    return tokenLength;
  }

  public void setTokenLength(int tokenLength)
  {
    this.tokenLength = tokenLength;
  }

  public IRandomizer getRandomizer()
  {
    return randomizer;
  }

  public void setRandomizer(IRandomizer randomizer)
  {
    this.randomizer = randomizer;
  }

  public IUserManager getUserManager()
  {
    return userManager;
  }

  public void setUserManager(IUserManager userManager)
  {
    this.userManager = userManager;
  }

  @Override
  protected void doBeforeActivate() throws Exception
  {
    super.doBeforeActivate();
    if (tokenLength <= 0)
    {
      throw new IllegalStateException("tokenLength must be positive");
    }

    if (randomizer == null)
    {
      throw new IllegalStateException("randomizer == null");
    }

    if (userManager == null)
    {
      throw new IllegalStateException("userManager == null");
    }
  }

  protected byte[] createRandomToken()
  {
    byte[] token = new byte[tokenLength];
    randomizer.nextBytes(token);
    return token;
  }

  protected byte[] encryptToken(String userID, byte[] token) throws SecurityException
  {
    return userManager.encrypt(userID, token, getAlgorithmName());
  }

  @Override
  protected void createChallenge(INegotiationContext context, ByteBuffer challenge)
  {
    // Create and remember a random token
    byte[] randomToken = createRandomToken();
    context.setInfo(randomToken);

    // Set the token into challenge
    challenge.putInt(randomToken.length);
    challenge.put(randomToken);
  }

  @Override
  protected void handleChallenge(INegotiationContext context, ByteBuffer challenge, ByteBuffer response)
  {
    throw new UnsupportedOperationException();
  }

  @Override
  protected boolean handleResponse(INegotiationContext context, ByteBuffer response)
  {
    // Get remembered random token
    byte[] randomToken = (byte[])context.getInfo();

    // Get userID from response
    int size = response.getInt();
    byte[] userIDBytes = new byte[size];
    response.get(userIDBytes);
    String userID = new String(userIDBytes);

    // Get crypted token from response
    size = response.getInt();
    byte[] responseToken = new byte[size];
    response.get(responseToken);

    // Encrypt the remembered token and compare to crypted token from response
    byte[] cryptedToken = encryptToken(userID, randomToken);
    boolean success = Arrays.equals(responseToken, cryptedToken);
    if (success)
    {
      context.setUserID(userID);
    }

    return success;
  }
}
