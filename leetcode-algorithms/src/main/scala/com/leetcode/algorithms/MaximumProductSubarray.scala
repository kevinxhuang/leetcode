package com.leetcode.algorithms

/**
  * 152. Maximum Product Subarray
  */
object MaximumProductSubarray {
  def maxProduct(nums: Array[Int]): Int = {
    val maxProduct = new Array[Int](nums.length)
    val minProduct = new Array[Int](nums.length)

    maxProduct(0) = nums(0)
    minProduct(0) = nums(0)

    Range(1, nums.length).foreach(i => {
      maxProduct(i) = (maxProduct(i-1) * nums(i)).max(minProduct(i-1) * nums(i)).max(nums(i))
      minProduct(i) = (maxProduct(i-1) * nums(i)).min(minProduct(i-1) * nums(i)).min(nums(i))
    })

    maxProduct.max
  }
}
