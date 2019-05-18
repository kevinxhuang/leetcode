package com.leetcode.algorithms

import com.leetcode.algorithms.scalamodel.ListNode

/**
  * 206. Reverse Linked List
  */
object ReverseLinkedList {
  def reverseList(head: ListNode): ListNode = {
    recursivelyReverseList(head)
  }

  def recursivelyReverseList(head: ListNode): ListNode = {
    if(head == null || head.next == null) {
      head
    } else {
      val nextNode = head.next
      val newHead = recursivelyReverseList(nextNode)
      nextNode.next = head
      head.next = null
      newHead
    }
  }

  def iterativelyReverseList(head: ListNode): ListNode = {
    var newHead: ListNode = null
    var current = head
    while(current != null) {
      val next = current.next
      current.next = newHead
      newHead = current
      current = next
    }

    newHead
  }
}
