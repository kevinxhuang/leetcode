package com.leetcode.algorithms

import scala.collection.mutable.ListBuffer

/**
  * 40. Combination Sum II
  */
object CombinationSumII {
  def combinationSum2(candidates: Array[Int], target: Int): List[List[Int]] = {
    val sortedCandidates = candidates.sorted
    val path = new ListBuffer[Int]()
    val result = new ListBuffer[List[Int]]()
    dfs(sortedCandidates, target, 0, path, result)

    result.toList
  }

  private def dfs(candidates: Array[Int], target: Int, start: Int, buffer: ListBuffer[Int], result: ListBuffer[List[Int]]): Unit = {
    if(target == 0) {
      result += buffer.toList
    } else if(target > 0) {
      for(i <- start until candidates.length) {
        if (!(i > start && candidates(i) == candidates(i-1))) {
          buffer += candidates(i)
          dfs(candidates, target - candidates(i), i + 1, buffer, result)
          buffer.remove(buffer.size - 1)
        }
      }
    }
  }
}
