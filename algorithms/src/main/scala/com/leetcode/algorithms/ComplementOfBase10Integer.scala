package com.leetcode.algorithms

/**
  * 1012. Complement of Base 10 Integer
  */
object ComplementOfBase10Integer {
  def bitwiseComplement(N: Int): Int = {
    Integer.parseInt(N.toBinaryString.map({
      case '0' => '1'
      case '1' => '0'
    }), 2)
  }
}
