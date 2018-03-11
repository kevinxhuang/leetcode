package com.leetcode.algorithms

/**
  * 598. Range Addition II
  *
  */
object RangeAdditionII {
  def maxCount(m: Int, n: Int, ops: Array[Array[Int]]): Int = {
    var maxMatrix = (m, n)
    for(op <- ops) {
      maxMatrix =  (maxMatrix._1.min(op(0)), maxMatrix._2.min(op(1)))
    }

    maxMatrix._1 * maxMatrix._2
  }
}
