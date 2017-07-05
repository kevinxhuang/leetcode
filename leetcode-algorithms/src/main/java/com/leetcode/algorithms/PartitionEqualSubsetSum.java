package com.leetcode.algorithms;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/partition-equal-subset-sum
 */
public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }

        int sum = Arrays.stream(nums).reduce(0, (a, b) -> a + b);
        if (sum % 2 == 1) {
            return false;
        }

        for(int num : nums) {
            if (num > sum / 2) {
                return false;
            } else if (num == sum / 2) {
                return true;
            }
        }

        boolean[] dp = new boolean[sum/2+1];
        dp[0] = true;
        for (int i = 1; i <= nums.length; i++) {
            for (int j = sum / 2; j >= nums[i-1]; j--) {
                dp[j] = dp[j] || dp[j - nums[i-1]];
            }
        }
        return dp[sum / 2];
    }
}
