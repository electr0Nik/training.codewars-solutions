package com.codewars.kata.fundamentals.kyu.eight.functprog;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;

/**
 * Created by Nick on 08.06.2015.
 */
public class FunctionalProgramming {
    public static Function<Student, Boolean> f1 =
            p -> (p.getFullName().equals("John Smith") && p.studentNumber.equals("js123"));

    public static ToDoubleFunction<Triangle> f2 = p -> {
        p.setArea((0.5) * p.base * p.height);
        return p.getArea();
    };
}