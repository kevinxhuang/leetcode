package com.leetcode.algorithms

/**
  * 283. Move Zeroes
  */
object MoveZeroes {
  def moveZeroes(nums: Array[Int]): Unit = {
    for(i <- nums.indices.init) {
      if(nums(i) == 0) {
        var j = i + 1
        while(nums(j) == 0 && j + 1 < nums.length) {
          j = j + 1
        }
        val temp = nums(i)
        nums(i) = nums(j)
        nums(j) = temp
      }
    }
  }
}
