package com.leetcode.algorithms

/**
  * 9. Palindrome Number
  *
  * https://leetcode.com/problems/palindrome-number
  */
object PalindromeNumber {
  def isPalindrome(x: Int): Boolean = {
    x.toString == x.toString.reverse
  }
}
