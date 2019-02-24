package com.leetcode.algorithms

/**
  * 342. Power of Four
  * https://leetcode.com/problems/power-of-four/
  */
object PowerOfFour {
  def isPowerOfFour(num: Int): Boolean = {
    num match {
      case 0 => false
      case 1 => true
      case _ if num % 4 == 0 => isPowerOfFour(num / 4)
      case _ => false
    }
  }
}
