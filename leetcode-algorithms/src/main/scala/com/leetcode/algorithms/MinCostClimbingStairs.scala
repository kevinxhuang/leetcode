package com.leetcode.algorithms

/**
  * 746. Min Cost Climbing Stairs
  */
object MinCostClimbingStairs {
  def minCostClimbingStairs(cost: Array[Int]): Int = {
    if (cost.length == 2) {
      cost.min
    } else {
      val minCost = new Array[Int](cost.length)
      minCost(0) = cost(0)
      minCost(1) = cost(1)

      for(i <- 2 until cost.length) {
        minCost(i) = Math.min(minCost(i-1), minCost(i-2)) + cost(i)
      }

      minCost.takeRight(2).min
    }
  }
}
