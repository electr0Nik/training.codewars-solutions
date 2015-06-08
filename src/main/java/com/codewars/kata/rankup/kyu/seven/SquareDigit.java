package com.codewars.kata.rankup.kyu.seven;

/**
 * Created by Nick on 30.05.2015.
 */
public class SquareDigit {
    public int squareDigits(int n) {
        String returnValueAsString = "";
        String digitAsString = Integer.toString(n);
        for (int i = 1, k = 0; i <= digitAsString.length(); i++, k++) {
            int squareDigit = Integer.parseInt(digitAsString.substring(k, i));
            returnValueAsString += (squareDigit * squareDigit);
        }
        return Integer.parseInt(returnValueAsString);
    }
}
