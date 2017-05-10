package com.leetcode.algorithms;

/**
 * https://leetcode.com/problems/increasing-triplet-subsequence/
 */
public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int[] lengthOfSubSequence = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            lengthOfSubSequence[i] = 1;
            for(int j = i -1; j >= 0; j--) {
                if (nums[i] > nums[j] && lengthOfSubSequence[i] <= lengthOfSubSequence[j]) {
                    lengthOfSubSequence[i] = lengthOfSubSequence[j] + 1;
                    if (lengthOfSubSequence[i] == 3) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}

/*
Solution from sim5: https://discuss.leetcode.com/topic/37426/concise-java-solution-with-comments
public boolean increasingTriplet(int[] nums) {
    // start with two largest values, as soon as we find a number bigger than both, while both have been updated, return true.
    int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;
    for (int n : nums) {
        if (n <= small) { small = n; } // update small if n is smaller than both
        else if (n <= big) { big = n; } // update big only if greater than small but smaller than big
        else return true; // return if you find a number bigger than both
    }
    return false;
}
*/
