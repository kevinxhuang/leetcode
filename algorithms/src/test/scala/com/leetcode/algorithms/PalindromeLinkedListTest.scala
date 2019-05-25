package com.leetcode.algorithms

import com.leetcode.algorithms.util.AlgorithmsUtil

class PalindromeLinkedListTest extends AlgorithmsTest {
  "PalindromeLinkedList" should "pass basic test 1" in {
    val head = AlgorithmsUtil.createList(Array(1, 2))
    PalindromeLinkedList.isPalindrome(head) shouldBe false
  }

  "PalindromeLinkedList" should "pass basic test 2" in {
    val head = AlgorithmsUtil.createList(Array(1, 2, 2, 1))
    PalindromeLinkedList.isPalindrome(head) shouldBe true
  }
}
