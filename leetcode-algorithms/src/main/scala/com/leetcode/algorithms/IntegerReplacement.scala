package com.leetcode.algorithms

/**
  * https://leetcode.com/problems/integer-replacement
  */
object IntegerReplacement {
  def integerReplacement(n: Int): Int = {
    if (n == Integer.MAX_VALUE) {
      return 32
    }

    var count = 0
    var num = n
    while (num > 1) {
      if (num % 2 == 0) {
        num = num / 2
      } else if (((num + 1) % 4 == 0) && (num - 1 != 2)) {
        num += 1
      } else {
        num -= 1
      }
      count += 1
    }

    count
  }
}
