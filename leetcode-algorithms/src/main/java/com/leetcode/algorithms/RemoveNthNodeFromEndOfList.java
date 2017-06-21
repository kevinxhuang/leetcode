package com.leetcode.algorithms;

import com.leetcode.algorithms.model.ListNode;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = new ListNode(0);
        slow.next = head;
        ListNode fast = head;
        for(int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        if (slow.next == head) {
            head = head.next;
        }
        slow.next = slow.next.next;

        return head;
    }
}
