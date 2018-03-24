package com.leetcode.algorithms

object SubarraySumEqualsK {
  def subarraySum(nums: Array[Int], k: Int): Int = {
    if(nums.isEmpty) {
      0
    } else {
      var sum = new Array[Int](nums.length)
      sum(0) = nums.head
      for (i <- nums.indices.tail) {
        sum(i) = sum(i - 1) + nums(i)
      }

      var count = 0
      for (i <- nums.indices; j <- Range(0, i + 1)) {
        if ((sum(i) - sum(j) + nums(j)) == k) {
          count += 1
        }
      }

      count
    }
  }
}
