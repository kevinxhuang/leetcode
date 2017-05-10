package com.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/largest-number/
 */
public class LargestNumber {
    public String largestNumber(int[] nums) {
        List<Number> numbers = new ArrayList<>();
        boolean allZero = true;
        for(int num : nums) {
            if(num != 0) {
                allZero = false;
            }
            numbers.add(new Number(num));
        }

        if (allZero) {
            return "0";
        }

        Collections.sort(numbers);

        return concatNumbers(numbers);
    }

    class Number implements Comparable<Number> {
        private final String num;

        public Number(int num) {
            this.num = String.valueOf(num);
        }

        public String getNum() {
            return num;
        }

        @Override
        public int compareTo(Number number) {
            if ((num.startsWith(number.getNum()) || number.getNum().startsWith(num)) && num.length() != number.getNum().length()) {
                return (number.getNum() + num).compareTo(num + number.getNum());
            } else {
                return number.getNum().compareTo(num);
            }
        }
    }

    private String concatNumbers(List<Number> numbers) {
        StringBuilder sb = new StringBuilder();
        for(Number number : numbers) {
            sb.append(number.getNum());
        }

        return sb.toString();
    }
}
