package com.codewars.kata.fundamentals.kyu.eight;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nick on 30.05.2015.
 */
public class LeetspeakTest {
    Leetspeak myEncoder = new Leetspeak();

    @Test
    public void simpleTest() {
        assertTrue("empty string", myEncoder.encode("").equals(""));
        assertTrue("abcdef string", myEncoder.encode("abcdef").equals("4bcd3f"));

        Encoder encoder = new Leetspeak();

        assertTrue("abcdefg string", encoder.encode("abcdefg").equals("4bcd3fg"));
        assertTrue("abcdefg string", encoder.encode("ABcDeFG").equals("4BcD3FG"));
        assertTrue("null string", encoder.encode(null).equals(""));
    }

}