package com.leetcode.algorithms

/**
  * 326. Power of Three
  *
  */
object PowerOfThree {
  def isPowerOfThree(n: Int): Boolean = {
    n match {
      case 0 => false
      case 1 | 3 => true
      case x =>
        if(x % 3 != 0) {
          false
        } else {
          if(math.cbrt(x).isValidInt) {
            isPowerOfThree(math.cbrt(x).toInt)
          } else {
            isPowerOfThree(x / 3)
          }
        }
    }
  }
}
