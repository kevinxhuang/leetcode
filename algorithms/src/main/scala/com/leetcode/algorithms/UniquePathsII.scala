package com.leetcode.algorithms

/**
  * 63. Unique Paths II
  */
object UniquePathsII {
  def uniquePathsWithObstacles(obstacleGrid: Array[Array[Int]]): Int = {
    val m = obstacleGrid.length
    val n = obstacleGrid.head.length
    val dp = Array.ofDim[Int](m, n)

    (0 until m).find(obstacleGrid(_)(0) == 1) match {
      case Some(pos) => (0 until m).filter(_ < pos).foreach(dp(_)(0) = 1)
      case None => (0 until m).foreach(dp(_)(0) = 1)
    }

    (0 until n).find(obstacleGrid(0)(_) == 1) match {
      case Some(pos) => (0 until n).filter(_ < pos).foreach(dp(0)(_) = 1)
      case None => (0 until n).foreach(dp(0)(_) = 1)
    }

    for {
      i <- 1 until m
      j <- 1 until n if obstacleGrid(i)(j) == 0
    } {
      dp(i)(j) = dp(i - 1)(j) + dp(i)(j - 1)
    }

    dp(m - 1)(n - 1)
  }
}
