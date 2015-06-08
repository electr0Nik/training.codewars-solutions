package com.codewars.kata.fundamentals.kyu.eight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nick on 31.05.2015.
 */
public class FindOdd {
    public static int findIt(int[] A) {
        Map<Integer, Integer> countOdds = new HashMap<Integer, Integer>();
        for (int i : A) {
            if (countOdds.get(i) == null) {
                countOdds.put(i, 1);
            } else {
                countOdds.replace(i, countOdds.get(i) + 1);
            }
        }

        int returnFirstOdd = 0;
        for (Map.Entry<Integer, Integer> entry : countOdds.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                returnFirstOdd = entry.getKey();
                break;
            }
        }

        return returnFirstOdd;
    }
}
