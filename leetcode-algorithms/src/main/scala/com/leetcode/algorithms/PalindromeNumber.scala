package com.leetcode.algorithms

/**
  * 9. Palindrome Number
  *
  */
object PalindromeNumber {
  def isPalindrome(x: Int): Boolean = {
    x.toString == x.toString.reverse
  }
}
