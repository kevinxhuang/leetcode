package com.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/merge-k-sorted-lists/
 */
public class MergekSortedLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(lists.length, new ListNodeComparator());
        for(ListNode headNodeOfList : lists) {
            if (headNodeOfList != null) {
                priorityQueue.add(headNodeOfList);
            }
        }

        ListNode headNode = null;
        ListNode cursor = null;
        while(!priorityQueue.isEmpty()) {
            ListNode node = priorityQueue.poll();

            if (headNode == null) {
                headNode = node;
                cursor = headNode;
            } else {
                cursor.next = node;
                cursor = cursor.next;
            }

            if (node.next != null) {
                priorityQueue.add(node.next);
            }
        }

        return headNode;
    }

    public class ListNodeComparator implements Comparator<ListNode> {

        @Override
        public int compare(ListNode node1, ListNode node2) {
            return Integer.compare(node1.val, node2.val);
        }
    }

    public static void main(String[] args) {
        new MergekSortedLists().mergeKLists(new ListNode[]{});

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        node1.next = node2;
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        node3.next = node4;

        ListNode result = new MergekSortedLists().mergeKLists(new ListNode[]{node1, node3});
    }
}
