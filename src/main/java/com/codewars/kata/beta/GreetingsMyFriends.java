package com.codewars.kata.beta;

/**
 * Created by nik on 20.06.15.
 */
public class GreetingsMyFriends {
  public String[] greetingForAllFriends(String... friends) {
    // TODO Write your code below this comment
    if (friends == null || friends.length == 0) {
      return null;
    }
    String[] returnValue = new String[friends.length];
    for (int i = 0; i < friends.length; i++) {
      returnValue[i] = String.format("Hello, %s!", friends[i]);
    }

    return returnValue;
  }
}
