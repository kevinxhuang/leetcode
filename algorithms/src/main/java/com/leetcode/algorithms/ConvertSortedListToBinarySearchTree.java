package com.leetcode.algorithms;

import com.leetcode.algorithms.model.ListNode;
import com.leetcode.algorithms.model.TreeNode;

/**
  */
public class ConvertSortedListToBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        return convertToBST(head, null);
    }

    private ListNode getMiddleNode(ListNode head, ListNode tail) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != tail && fast.next != tail) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    private TreeNode convertToBST(ListNode head, ListNode tail) {
        if (head == null || head == tail) {
            return null;
        }

        ListNode mid = getMiddleNode(head, tail);
        TreeNode root = new TreeNode(mid.val);
        root.left = convertToBST(head, mid);
        root.right = convertToBST(mid.next, tail);

        return root;
    }
}
