package com.leetcode.algorithms

/**
  * 217. Contains Duplicate
  *
  */
object ContainsDuplicate {
  def containsDuplicate(nums: Array[Int]): Boolean = {
    nums.zipWithIndex.groupBy(_._1).values.find(_.length > 1).isDefined
  }
}
