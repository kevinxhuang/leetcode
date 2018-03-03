package com.leetcode.algorithms

/**
  * 231. Power of Two
  *
  * https://leetcode.com/problems/power-of-two
  */
object PowerOfTwo {
  def isPowerOfTwo(n: Int): Boolean = {
    n match {
      case 0 => false
      case 1 | 2 => true
      case x =>
        if(x % 2 == 1) {
          false
        } else {
          if(math.sqrt(x).isValidInt) {
            isPowerOfTwo(math.sqrt(x).toInt)
          } else {
            isPowerOfTwo(x / 2)
          }
        }
    }
  }
}
