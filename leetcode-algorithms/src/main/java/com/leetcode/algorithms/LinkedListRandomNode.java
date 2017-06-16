package com.leetcode.algorithms;

import com.leetcode.algorithms.model.ListNode;

import java.util.Random;

/**
 * https://leetcode.com/problems/linked-list-random-node/
 */
public class LinkedListRandomNode {
    private int length = 0;
    private ListNode head;

    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    public LinkedListRandomNode(ListNode head) {
        this.head = head;
        ListNode current = head;
        while(current != null) {
            length++;
            current = current.next;
        }
    }

    /** Returns a random node's value. */
    public int getRandom() {
        int random = new Random().nextInt(length);

        ListNode current = this.head;
        while(random != 0) {
            current = current.next;
            random--;
        }

        return current.val;
    }
}
