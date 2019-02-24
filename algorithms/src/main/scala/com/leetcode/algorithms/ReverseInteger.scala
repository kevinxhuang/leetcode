package com.leetcode.algorithms

/**
  * 7. Reverse Integer
  *
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
