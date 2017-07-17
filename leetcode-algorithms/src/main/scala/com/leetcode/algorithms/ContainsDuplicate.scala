package com.leetcode.algorithms

/**
  * 217. Contains Duplicate
  *
  * https://leetcode.com/problems/contains-duplicate
  */
object ContainsDuplicate {
  def containsDuplicate(nums: Array[Int]): Boolean = {
    nums.zipWithIndex.groupBy(_._1).values.find(_.length > 1).isDefined
  }
}
