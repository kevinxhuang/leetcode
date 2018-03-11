package com.leetcode.algorithms;

/**
  */
public class HouseRobber {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        // robbed[i][0] means the robber doesn't rob house i.
        // robbed[i][1] means the robber robbed house i.
        int[][] robbed = new int[nums.length][2];
        robbed[0][0] = 0;
        robbed[0][1] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            robbed[i][0] = Math.max(robbed[i-1][0], robbed[i-1][1]);
            robbed[i][1] = robbed[i-1][0] + nums[i];
        }

        return Math.max(robbed[nums.length-1][0], robbed[nums.length-1][1]);
    }
}
