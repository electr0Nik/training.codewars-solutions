package com.codewars.kata.beta;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nik on 20.06.15.
 */
public class GreetingsMyFriendsTest {
  GreetingsMyFriends greetings = new GreetingsMyFriends();

  @Test
  public void nullArgument() {
    assertNull("Must return null for null args", greetings.greetingForAllFriends((String[]) null));
  }

  @Test
  public void emptyArgument() {
    assertNull("Must return null for empty args", greetings.greetingForAllFriends(new String[]{}));
  }

  @Test
  public void notNullArgs() {
    assertNotNull("Must return something else then null for none empty nor null args", greetings.greetingForAllFriends("Bilal"));
  }

  @Test
  public void singleArg() {
    assertEquals(greetings.greetingForAllFriends("Bilal"), new String[]{"Hello, Bilal!"});
  }

}