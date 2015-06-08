package com.codewars.kata.rankup.kyu.seven;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nick on 30.05.2015.
 */
public class SquareDigitTest {

    @Test
    public void test() {
        assertEquals(811181, new SquareDigit().squareDigits(9119));
    }
}