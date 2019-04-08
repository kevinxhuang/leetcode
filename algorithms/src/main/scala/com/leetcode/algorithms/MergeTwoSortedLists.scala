package com.leetcode.algorithms

import com.leetcode.algorithms.scalamodel.ListNode


/**
  * 21. Merge Two Sorted Lists
  */
object MergeTwoSortedLists {
  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    (l1, l2) match {
      case (null, null) => null
      case (head1: ListNode, null) => head1
      case (null, head2: ListNode) => head2
      case (head1: ListNode, head2: ListNode) if head1.x >= head2.x =>
        head2.next = mergeTwoLists(head1, head2.next)
        head2
      case (head1: ListNode, head2: ListNode) if head1.x < head2.x =>
        head1.next = mergeTwoLists(head1.next, head2)
        head1
    }
  }
}
