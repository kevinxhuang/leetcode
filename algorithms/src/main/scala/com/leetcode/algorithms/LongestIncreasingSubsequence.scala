package com.leetcode.algorithms

object LongestIncreasingSubsequence {
  def lengthOfLIS(nums: Array[Int]): Int = {
    if(nums.isEmpty) {
      0
    } else {
      val dp = Array.fill(nums.length)(1)
      for {
        i <- 1 until nums.length
        j <- 0 to i
      } {
        if (nums(j) < nums(i)) {
          dp(i) = dp(i).max(dp(j) + 1)
        }
      }

      dp.max
    }
  }
}
