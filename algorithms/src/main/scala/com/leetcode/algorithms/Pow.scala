package com.leetcode.algorithms

/**
  */
object Pow {
  def myPow(x: Double, n: Int): Double = {
    if (n == 0) {
      return 1
    }
    var temp = myPow(x, n / 2)
    if (n % 2 == 0) {
      return temp * temp
    }
    else if (n > 0) {
      return x * temp * temp
    }
    else {
      return (temp * temp) / x
    }
  }
}
