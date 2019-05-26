package com.leetcode.algorithms

object ClimbingStairs {
  def climbStairs(n: Int): Int = {
    n match {
      case 1 => 1
      case 2 => 2
      case _ =>
        var previous = 1
        var current = 2
        for(_ <- 3 to n) {
          val next = previous + current
          previous = current
          current = next
        }
        current
    }
  }
}
