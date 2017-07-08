package com.leetcode.algorithms

import com.leetcode.algorithms.scalamodel.ListNode

/**
  * https://leetcode.com/problems/add-two-numbers
  */
object AddTwoNumbers {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    if (l1 == null) {
      return l2
    }
    if (l2 == null) {
      return l1
    }

    var p1 = l1
    var p2 = l2
    val head = new ListNode((p1._x + p2._x) % 10)
    var tail = head
    var carry = (p1._x + p2._x) / 10
    p1 = p1.next
    p2 = p2.next

    while(p1 != null || p2 != null) {
      val value1 = if (p1 != null) p1._x else 0
      val value2 = if (p2 != null) p2._x else 0
      val node = new ListNode((value1 + value2 + carry) % 10)
      carry = (value1 + value2 + carry) / 10
      tail.next = node
      tail = node
      if (p1 != null) {
        p1 = p1.next
      }

      if (p2 != null) {
        p2 = p2.next
      }
    }

    if (carry != 0) {
      tail.next = new ListNode(carry)
      tail = tail.next
    }

    head
  }
}
