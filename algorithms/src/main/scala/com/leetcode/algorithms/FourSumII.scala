package com.leetcode.algorithms

import scala.collection.mutable


object FourSumII {
  def fourSumCount(A: Array[Int], B: Array[Int], C: Array[Int], D: Array[Int]): Int = {
    val sumMap1 = getSumMap(A, B)
    val sumMap2 = getSumMap(C, D)
    sumMap1.keys.toSeq
      .filter(key => sumMap2.contains(-1 * key))
      .map(key => sumMap1(key) * sumMap2(-1 * key))
      .sum
  }

  private def getSumMap(A: Array[Int], B: Array[Int]): Map[Int, Int] = {
    val sumMap = new mutable.HashMap[Int, Int]()
    for {
      a <- A
      b <- B
    } {
      sumMap.put(a + b, sumMap.getOrElse(a + b, 0) + 1)
    }

    sumMap.toMap
  }
}
