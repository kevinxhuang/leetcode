package com.leetcode.algorithms

/**
  * 53. Maximum Subarray
  *
  * https://leetcode.com/problems/maximum-subarray
  */
object MaximumSubarray {
  def maxSubArray(nums: Array[Int]): Int = {
    if (nums.length == 0) {
      0
    }

    val dp = Array.fill[Int](nums.length)(0)
    dp(0) = nums(0)

    nums.indices.tail.foreach(i =>
      dp(i) = nums(i) + (if (dp(i-1) > 0) dp(i-1) else 0)
    )
    dp.max
  }
}
