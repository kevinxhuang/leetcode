package com.leetcode.algorithms

/**
  * 7. Reverse Integer
  *
  * https://leetcode.com/problems/reverse-integer
  */
object ReverseInteger {
  def reverse(x: Int): Int = {
    try {
      if (x >= 0) {
        x.toString.reverse.toInt
      } else {
        ("-" + x.toString.tail.reverse).toInt
      }
    } catch {
      case _: NumberFormatException => 0
    }
  }
}
