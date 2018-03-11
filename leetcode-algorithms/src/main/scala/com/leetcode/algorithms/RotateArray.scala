package com.leetcode.algorithms

/**
  * 189. Rotate Array
  *
  */
object RotateArray {
  def rotate(nums: Array[Int], k: Int): Unit = {
    if(nums.isEmpty || k == 0) {
      return
    }

    val newArray = nums.splitAt(nums.length - k % nums.length)._2 ++ nums.splitAt(nums.length - k % nums.length)._1
    newArray.copyToArray(nums)
  }
}
