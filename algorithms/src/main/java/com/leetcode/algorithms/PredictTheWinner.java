package com.leetcode.algorithms;

/**
  */
public class PredictTheWinner {
    /**
     * Inspired by https://leetcode.com/problems/predict-the-winner/#/solutions
   */
    public boolean PredictTheWinner(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];

        for(int i = 0; i < nums.length; i++) {
            dp[i][i] = nums[i];
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j+i < nums.length; j++) {
                dp[j][j+i] = Math.max(nums[j+i]-dp[j][j+i-1], nums[j]-dp[j+1][j+i]);
            }
        }

        return dp[0][nums.length-1] >= 0;
    }
}
