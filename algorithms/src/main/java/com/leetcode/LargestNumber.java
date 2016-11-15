package com.leetcode;

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

    public static void main(String[] args) {
        System.out.println(new LargestNumber().largestNumber(new int[]{3, 30, 34, 5, 9})); //9534330
        System.out.println(new LargestNumber().largestNumber(new int[]{1})); //1
        System.out.println(new LargestNumber().largestNumber(new int[]{1, 2, 3, 4})); //4321
        System.out.println(new LargestNumber().largestNumber(new int[]{121,12})); //12121
        System.out.println(new LargestNumber().largestNumber(new int[]{12,121})); //12121
        System.out.println(new LargestNumber().largestNumber(new int[]{0,0})); //12121
        System.out.println(new LargestNumber().largestNumber(new int[]{999999998,999999997,999999999})); //999999999999999998999999997
    }
}
