package com.codewars.kata.fundamentals.kyu.eight.functprog;

import org.junit.Test;

import java.util.function.ToDoubleFunction;

import static org.junit.Assert.*;

/**
 * Created by Nick on 08.06.2015.
 */

public class FunctionalProgrammingTest {
    @Test
    public void testJohnSmith() throws Exception {
        Student jSmith = new Student("John", "Smith", "js123");
        assertTrue("John Smith with student number js123 did not return true", FunctionalProgramming.f1.apply(jSmith));
    }

    @Test
    public void testJohnSmithWrongStudentNumber() throws Exception {
        Student jSmith = new Student("John", "Smith", "js321");
        assertFalse("John Smith with student number js321 did not return false", FunctionalProgramming.f1.apply(jSmith));
    }

    @Test
    public void testNotJohnSmith() throws Exception {
        Student jSmith = new Student("Jack", "Smith", "js123");
        assertFalse("Jack Smith with student number js123 did not return false", FunctionalProgramming.f1.apply(jSmith));
        Student jSmarm = new Student("John", "Smarm", "js123");
        assertFalse("John Smarm with student number js123 did not return false", FunctionalProgramming.f1.apply(jSmarm));
        Student jaSmarm = new Student("Jack", "Smarm", "js123");
        assertFalse("Jack Smarm with student number js123 did not return false", FunctionalProgramming.f1.apply(jaSmarm));
    }


    @Test
    public void testCorrectFunctionType() throws Exception {
        assertTrue("Incorrect function type", FunctionalProgramming.f2 instanceof ToDoubleFunction);
    }

    @Test
    public void testArea() throws Exception {
        Triangle t = new Triangle(5, 10);
        assertEquals("Incorrect area returned", 25D, FunctionalProgramming.f2.applyAsDouble(t), 0.001);
        assertEquals("Incorrect area in Triangle object", 25D, t.getArea(), 0.001);
        t = new Triangle(5, 5);
        assertEquals("Incorrect area returned", 12.5D, FunctionalProgramming.f2.applyAsDouble(t), 0.001);
        assertEquals("Incorrect area in Triangle object", 12.5D, t.getArea(), 0.001);
        t = new Triangle(32, 4);
        assertEquals("Incorrect area returned", 64D, FunctionalProgramming.f2.applyAsDouble(t), 0.001);
        assertEquals("Incorrect area in Triangle object", 64D, t.getArea(), 0.001);
        t = new Triangle(10, 5);
        assertEquals("Incorrect area returned", 25D, FunctionalProgramming.f2.applyAsDouble(t), 0.001);
        assertEquals("Incorrect area in Triangle object", 25D, t.getArea(), 0.001);
        t = new Triangle(201, 1);
        assertEquals("Incorrect area returned", 100.5D, FunctionalProgramming.f2.applyAsDouble(t), 0.001);
        assertEquals("Incorrect area in Triangle object", 100.5D, t.getArea(), 0.001);
        t = new Triangle(1, 303);
        assertEquals("Incorrect area returned", 151.5D, FunctionalProgramming.f2.applyAsDouble(t), 0.001);
        assertEquals("Incorrect area in Triangle object", 151.5D, t.getArea(), 0.001);
    }
}