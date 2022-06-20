package com.MEB.LeetCodeSolutions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    Map<String, Integer> romanToIntegerMap = new LinkedHashMap<>();
    int integerFromRoman;

    public RomanToInteger(Scanner userInput) {
        System.out.println("Please enter a valid string of roman numerals >>>:");
        System.out.println(romanToInt(userInput.nextLine()));
    }

    public int romanToInt(String romanString) {

        //Initialize output

        integerFromRoman = 0;

        //Build conversion map

        romanToIntegerMap.put("CM", 900);
        romanToIntegerMap.put("M", 1000);
        romanToIntegerMap.put("CD", 400);
        romanToIntegerMap.put("D", 500);
        romanToIntegerMap.put("XC", 90);
        romanToIntegerMap.put("C", 100);
        romanToIntegerMap.put("XL", 40);
        romanToIntegerMap.put("L", 50);
        romanToIntegerMap.put("IX", 9);
        romanToIntegerMap.put("X", 10);
        romanToIntegerMap.put("IV", 4);
        romanToIntegerMap.put("V", 5);
        romanToIntegerMap.put("I", 1);

        //Conversion Loop

        boolean found = false;
        while (!romanString.equals("")) {
            for (String key : romanToIntegerMap.keySet()) {
                try {
                    if (romanString.substring(0, key.length()).equalsIgnoreCase(key)) {
                        integerFromRoman += romanToIntegerMap.get(key);
                        romanString = romanString.substring(key.length());
                        break;
                    }
                } catch (Exception e) {
                }
            }
        }

        //Return conversion

        return integerFromRoman;
    }

}
