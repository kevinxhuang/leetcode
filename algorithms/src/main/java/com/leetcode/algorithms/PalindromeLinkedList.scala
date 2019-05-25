package com.leetcode.algorithms

import com.leetcode.algorithms.scalamodel.ListNode

object PalindromeLinkedList {
  def isPalindrome(head: ListNode): Boolean = {
    var slow = head
    var fast = head
    while(fast != null && fast.next != null) {
      slow = slow.next
      fast = fast.next.next
    }

    if(fast != null) { //odd nodes
      slow = slow.next
    }

    var low = head
    var high = reverseLinkedList(slow)
    while(high != null) {
      if(low.x != high.x) {
        return false
      }
      low = low.next
      high = high.next
    }

    true
  }

  private def reverseLinkedList(head: ListNode): ListNode = {
    var newHead: ListNode = null
    var current = head
    while(current != null) {
      val nextNode = current.next
      current.next = newHead
      newHead = current
      current = nextNode
    }
    newHead
  }
}
