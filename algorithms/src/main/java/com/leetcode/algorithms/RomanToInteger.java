package com.leetcode.algorithms;


import java.util.HashMap;
import java.util.Map;

/**
  */
public class RomanToInteger {
    private static final Map<Character, Integer> ROMAN_NUMERALS = new HashMap<>();

    static {
        ROMAN_NUMERALS.put('I', 1);
        ROMAN_NUMERALS.put('V', 5);
        ROMAN_NUMERALS.put('X', 10);
        ROMAN_NUMERALS.put('L', 50);
        ROMAN_NUMERALS.put('C', 100);
        ROMAN_NUMERALS.put('D', 500);
        ROMAN_NUMERALS.put('M', 1000);
    }

    public int romanToInt(String s) {
        int num = ROMAN_NUMERALS.get(s.charAt(s.length() - 1));
        for(int i = s.length() - 2; i >= 0; i--) {
            if (ROMAN_NUMERALS.get(s.charAt(i)) <  ROMAN_NUMERALS.get(s.charAt(i+1))) {
                num -=  ROMAN_NUMERALS.get(s.charAt(i));
            } else {
                num +=  ROMAN_NUMERALS.get(s.charAt(i));
           }
        }

        return num;
    }
}
