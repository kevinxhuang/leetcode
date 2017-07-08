package com.leetcode.algorithms

import com.leetcode.algorithms.scalamodel.ListNode
import org.testng.annotations.Test


class AddTwoNumbersTest {
  @Test
  def testAddTwoNumbers(): Unit = {
    val l1 = new ListNode(2)
    l1.next = new ListNode(4)
    l1.next.next = new ListNode(3)
    val l2 = new ListNode(5)
    l2.next = new ListNode(6)
    l2.next.next = new ListNode(4)
    AddTwoNumbers.addTwoNumbers(l1, l2)

    val l3 = new ListNode(9)
    l3.next = new ListNode(9)
    l3.next.next = new ListNode(9)
    val l4 = new ListNode(1)
    AddTwoNumbers.addTwoNumbers(l3, l4)
  }
}
