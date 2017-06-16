package com.leetcode.algorithms;

import com.leetcode.algorithms.model.ListNode;

/**
 * https://leetcode.com/problems/rotate-list
 */
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        if (head.next == null || k == 0) {
            return head;
        }

        ListNode cursor = head;
        int length = 1;
        while(cursor.next != null) {
            cursor = cursor.next;
            length++;
        }
        ListNode tail = cursor;

        if (k == length || k % length == 0) {
            return head;
        }

        cursor = head;
        for(int i = 0; i < (length - k % length) - 1; i++) {
            cursor = cursor.next;
        }
        ListNode newHead = cursor.next;
        cursor.next = null;
        tail.next = head;

        return newHead;
    }
}
