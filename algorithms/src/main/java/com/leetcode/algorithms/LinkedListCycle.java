package com.leetcode.algorithms;

import com.leetcode.algorithms.model.ListNode;

/**
  */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode point1 = head;
        ListNode point2 = head.next;

        while(point1 != null && point2 != null && point2.next != null) {
            if (point1 == point2) {
                return true;
            } else {
                point1 = point1.next;
                point2 = point2.next.next;
            }
        }
        return false;
    }
}
