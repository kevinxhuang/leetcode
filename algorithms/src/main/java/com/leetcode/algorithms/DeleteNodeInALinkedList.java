package com.leetcode.algorithms;

import com.leetcode.algorithms.model.ListNode;

/**
 * 237. Delete Node in a Linked List
 */
public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
