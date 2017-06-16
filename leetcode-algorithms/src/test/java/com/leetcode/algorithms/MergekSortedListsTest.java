package com.leetcode.algorithms;


import com.leetcode.algorithms.model.ListNode;
import org.testng.annotations.Test;

public class MergekSortedListsTest {
    @Test
    public void testMergeKLists() {
        new MergekSortedLists().mergeKLists(new ListNode[]{});

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        node1.next = node2;
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        node3.next = node4;

        new MergekSortedLists().mergeKLists(new ListNode[]{node1, node3});
    }
}
