package com.leetcode.algorithms;

import java.util.*;

/**
 * https://leetcode.com/problems/integer-to-english-words/
 */
public class IntegerToEnglishWords {

    private static String[] SCALES = new String[] {"", "Thousand", "Million", "Billion", "Quadrillion", "Quintillion", "Sextillion"};
    private static Map<Integer, String> NUMBERALS;
    static {
        NUMBERALS = new HashMap<>();
        NUMBERALS.put(1, "One");
        NUMBERALS.put(2, "Two");
        NUMBERALS.put(3, "Three");
        NUMBERALS.put(4, "Four");
        NUMBERALS.put(5, "Five");
        NUMBERALS.put(6, "Six");
        NUMBERALS.put(7, "Seven");
        NUMBERALS.put(8, "Eight");
        NUMBERALS.put(9, "Nine");
        NUMBERALS.put(10, "Ten");
        NUMBERALS.put(11, "Eleven");
        NUMBERALS.put(12, "Twelve");
        NUMBERALS.put(13, "Thirteen");
        NUMBERALS.put(14, "Fourteen");
        NUMBERALS.put(15, "Fifteen");
        NUMBERALS.put(16, "Sixteen");
        NUMBERALS.put(17, "Seventeen");
        NUMBERALS.put(18, "Eighteen");
        NUMBERALS.put(19, "Nineteen");
        NUMBERALS.put(20, "Twenty");
        NUMBERALS.put(30, "Thirty");
        NUMBERALS.put(40, "Forty");
        NUMBERALS.put(50, "Fifty");
        NUMBERALS.put(60, "Sixty");
        NUMBERALS.put(70, "Seventy");
        NUMBERALS.put(80, "Eighty");
        NUMBERALS.put(90, "Ninety");
    }
    public String numberToWords(int num) {

        if (num == 0) { // Special case
            return "Zero";
        }

        Stack<Integer> numStack = new Stack<>();
        while(num != 0) {
            numStack.push(num % 1000);
            num /= 1000;
        }

        List<String> words = new ArrayList<>();
        while(!numStack.empty()) {
            StringBuilder sb = new StringBuilder();
            int n = numStack.pop();
            if (n == 0) {
                continue;
            }
            int unit = n % 10;
            int tens = (n / 10) % 10;
            int hundreds = (n / 100);

            if(hundreds != 0) {
                sb.append(NUMBERALS.get(hundreds));
                sb.append(" " + "Hundred");
            }

            if (NUMBERALS.containsKey(tens * 10 + unit)) {
                sb.append(" " + NUMBERALS.get(tens * 10 + unit));
            } else {
                if (tens != 0) {
                    sb.append(" " + NUMBERALS.get(tens * 10));
                }
                if (unit != 0) {
                    sb.append(" " + NUMBERALS.get(unit));
                }
            }

            sb.append(" " + SCALES[numStack.size()]);
            words.add(sb.toString().trim());
        }
        StringBuilder resultBuilder = new StringBuilder();
        for(String word : words) {
            resultBuilder.append(" " + word);
        }

        return resultBuilder.toString().trim();
    }
}
