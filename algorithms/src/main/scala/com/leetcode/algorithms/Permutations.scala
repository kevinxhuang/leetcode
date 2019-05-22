package com.leetcode.algorithms

import scala.collection.mutable.ListBuffer

object Permutations {
  def permute(nums: Array[Int]): List[List[Int]] = {
    val result = new ListBuffer[List[Int]]()
    doPermute(nums, 0, result)
    result.toList
  }

  private def doPermute(nums: Array[Int], start: Int, result: ListBuffer[List[Int]]): Unit = {
    if(start == nums.length - 1) {
      result += nums.toList
    } else {
      for(i <- start until nums.length) {
        swap(nums, start, i)
        doPermute(nums, start + 1, result)
        swap(nums, start, i)
      }
    }
  }

  private def swap(nums: Array[Int], i: Int, j: Int): Unit = {
    val tmp = nums(i)
    nums(i) = nums(j)
    nums(j) = tmp
  }
}
