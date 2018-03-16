package com.leetcode.algorithms

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
  * 698. Partition to K Equal Sum Subsets
  */
object PartitionToKEqualSumSubsets {
  def canPartitionKSubsets(nums: Array[Int], k: Int): Boolean = {
    val target = nums.sum / k
    if (!target.isValidInt) {
      false
    } else {
      val sortedNums = ArrayBuffer(nums.sorted.reverse:_*)
      if (sortedNums.head > target) {
        return false
      }

      val subset = mutable.ArrayBuffer[Int]()
      Range(0, k).foreach(_ => {
        subset.clear()
        if (isSubsetSum(sortedNums.toArray, target, subset)) {
          subset.foreach(n => sortedNums -= n)
        } else {
          return false
        }
      })
      sortedNums.isEmpty
    }
  }

  def isSubsetSum(nums: Array[Int], target: Int, subset: mutable.ArrayBuffer[Int]): Boolean = {
    if (target == 0) {
      return true
    }

    if (nums.isEmpty && target != 0) {
      return false
    }

    if (nums.head > target) {
      return isSubsetSum(nums.tail, target, subset)
    }

    {subset += nums.head; isSubsetSum(nums.tail, target - nums.head, subset)} ||
      {subset -= subset.last; isSubsetSum(nums.tail, target, subset)}
  }
}
