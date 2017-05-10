package com.leetcode.algorithms;


import org.testng.annotations.Test;

public class MergekSortedListsTest {
    @Test
    public void testMergeKLists() {
        new MergekSortedLists().mergeKLists(new MergekSortedLists.ListNode[]{});

        MergekSortedLists.ListNode node1 = new MergekSortedLists.ListNode(1);
        MergekSortedLists.ListNode node2 = new MergekSortedLists.ListNode(3);
        node1.next = node2;
        MergekSortedLists.ListNode node3 = new MergekSortedLists.ListNode(2);
        MergekSortedLists.ListNode node4 = new MergekSortedLists.ListNode(4);
        node3.next = node4;

        new MergekSortedLists().mergeKLists(new MergekSortedLists.ListNode[]{node1, node3});
    }
}
