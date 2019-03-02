package com.leetcode.algorithms

/**
  * 171. Excel Sheet Column Number
  */
object ExcelSheetColumnNumber {
  def titleToNumber(s: String): Int = {
    s.map(c => c.toInt - 'A'.toInt + 1).reduce(_ * 26 + _)
  }
}
