package com.leetcode.algorithms

/**
  * https://leetcode.com/problems/add-binary
  */
object AddBinary {
  def addBinary(a: String, b: String): String = {
    var i = a.length - 1
    var j = b.length - 1
    val result = new StringBuilder()
    var carry = 0
    while(i >= 0 || j >= 0) {
      val value = (if (i >= 0) a(i) - '0' else 0) + (if (j >= 0) b(j) - '0' else 0) + carry
      result.append(value % 2)
      carry = value / 2
      if (i >= 0) {
        i = i - 1
      }
      if (j >= 0) {
        j = j - 1
      }
    }
    if (carry != 0) {
      result.append(carry)
    }

    result.reverse.toString()
  }
}
