package com.leetcode.algorithms

import com.leetcode.algorithms.scalamodel._
import org.testng.Assert.assertEquals
import org.testng.annotations.Test


class AlgorithmsTest {
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

  @Test
  def testAddBinary(): Unit = {
    assertEquals(AddBinary.addBinary("11", "1"), "100")
    assertEquals(AddBinary.addBinary("1000000000000000000000000000000", "1"), "1000000000000000000000000000001")
  }

//  @Test
//  def testTwoSum(): Unit = {
//    assertEquals(TwoSum.twoSum(Array(2, 7, 11, 15), 9), Array(0, 1))
//    assertEquals(TwoSum.twoSum(Array(3,2,4), 6), Array(1, 2))
//  }
}
