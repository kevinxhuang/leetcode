package com.leetcode.algorithms;

import java.util.Arrays;

/**
  */
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = 0;
        for(int i = 0; i < numbers.length && numbers[i] <= target; i++) {
            index1 = i;
            index2 = Arrays.binarySearch(numbers, i + 1, numbers.length, target - numbers[i]);
            if (index2 < 0) {
                continue;
            } else {
                break;
            }
        }

        return new int[]{index1 + 1, index2 + 1};
    }
}
