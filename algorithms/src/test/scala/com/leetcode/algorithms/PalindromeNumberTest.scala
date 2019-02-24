package com.leetcode.algorithms

class PalindromeNumberTest extends AlgorithmsTest {
  "PalindromeNumber" should "pass basic test" in {
    PalindromeNumber.isPalindrome(12321) should be (true)
    PalindromeNumber.isPalindrome(-12321) should be (false)
    PalindromeNumber.isPalindrome(1) should be (true)
    PalindromeNumber.isPalindrome(12) should be (false)
  }
}
