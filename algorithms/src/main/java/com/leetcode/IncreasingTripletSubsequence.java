package com.leetcode;

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

    public static void main(String[] args) {
        System.out.println(new IncreasingTripletSubsequence().increasingTriplet(new int[]{})); // false
        System.out.println(new IncreasingTripletSubsequence().increasingTriplet(new int[]{1, 2, 3, 4, 5})); // true
        System.out.println(new IncreasingTripletSubsequence().increasingTriplet(new int[]{5, 4, 3, 2, 1})); // false
        System.out.println(new IncreasingTripletSubsequence().increasingTriplet(new int[]{5, 1, 3, 2, 3})); // true
        System.out.println(new IncreasingTripletSubsequence().increasingTriplet(new int[]{2,1,5,0,3})); // false
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
