package com.leetcode.algorithms;

import com.leetcode.algorithms.model.ListNode;
import com.leetcode.algorithms.util.AssertUtil;
import org.testng.annotations.Test;

public class RemoveNthNodeFromEndOfListTest {
    @Test
    public void testRemoveNthFromEnd() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode expected1 = new ListNode(1);
        expected1.next = new ListNode(2);
        expected1.next.next = new ListNode(3);
        expected1.next.next.next = new ListNode(5);
        AssertUtil.compareLinkedList(expected1, new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 2));

        ListNode head2 = new ListNode(1);
        AssertUtil.compareLinkedList(null, new RemoveNthNodeFromEndOfList().removeNthFromEnd(head2, 1));

        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        ListNode expected3 = new ListNode(2);
        AssertUtil.compareLinkedList(expected3, new RemoveNthNodeFromEndOfList().removeNthFromEnd(head3, 2));
    }
}
