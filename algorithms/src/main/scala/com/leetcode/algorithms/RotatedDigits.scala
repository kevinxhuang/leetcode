package com.leetcode.algorithms

/**
  * 788. Rotated Digits
  */
object RotatedDigits {
  private val ROATED_DIGITS = Map(
    '0' -> '0',
    '1' -> '1',
    '2' -> '5',
    '5' -> '2',
    '6' -> '9',
    '8' -> '8',
    '9' -> '6')

  def rotatedDigits(N: Int): Int = {
    (1 to N).count(isValid)
  }

  private def isValid(n: Int): Boolean = {
    val chars = n.toString.toCharArray
    chars.forall(ROATED_DIGITS.keySet.contains(_)) &&
      chars.map(ROATED_DIGITS(_)).mkString("").toInt != n
  }
}
