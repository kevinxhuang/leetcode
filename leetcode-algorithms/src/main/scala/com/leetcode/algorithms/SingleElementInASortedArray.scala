package com.leetcode.algorithms

/**
  */
object SingleElementInASortedArray {
  def singleNonDuplicate(nums: Array[Int]): Int = {
    nums.map(n => (n, 1)).groupBy(_._1).mapValues(_.length).find(_._2 == 1).get._1
  }
}
