package com.leetcode.algorithms;

import com.leetcode.algorithms.model.ListNode;

/**
  */
public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode previous = head;
        ListNode current = head;
        if (current != null) {
            current = current.next;
        }

        while(current != null) {
            if (previous.val == current.val) {
                previous.next = current.next;
                current = null;
            } else {
                previous = previous.next;
            }
            current = previous.next;
        }

        return head;
    }
}
