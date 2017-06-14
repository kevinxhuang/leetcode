package com.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/largest-divisible-subset
 */
public class LargestDivisibleSubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result = new ArrayList<>();

        if (nums.length == 0) {
            return result;
        } else if (nums.length == 1) {
            result.add(nums[0]);
        } else {
            Arrays.sort(nums);
            int[] dp = new int[nums.length];
            dp[0] = 1;

            for (int i = 1; i < nums.length; i++) {
                for(int j = i - 1; j >= 0; j--) {
                    if (nums[i] % nums[j] == 0) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
            }

            int maxIndex = findMaxIndex(dp);
            int count = dp[maxIndex];
            int cursor = maxIndex;
            result.add(nums[maxIndex]);
            for(int i = maxIndex - 1; i >= 0; i--) {
                if (nums[cursor] % nums[i] == 0 && dp[i] == count - 1) {
                    result.add(nums[i]);
                    cursor = i;
                    count--;
                }
            }

        }

        return result;
    }

    private int findMaxIndex(int[] dp) {
        int maxIndex = 0;
        for(int i = 1; i < dp.length; i++) {
            if (dp[i] >= dp[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
