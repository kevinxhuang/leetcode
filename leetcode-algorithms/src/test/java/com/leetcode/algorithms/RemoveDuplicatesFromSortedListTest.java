package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RemoveDuplicatesFromSortedListTest {
    @Test
    public void deleteDuplicates() {
        RemoveDuplicatesFromSortedList.ListNode head = new RemoveDuplicatesFromSortedList.ListNode(1);
        head.next = new RemoveDuplicatesFromSortedList.ListNode(1);
        head.next.next = new RemoveDuplicatesFromSortedList.ListNode(2);
        head.next.next.next = new RemoveDuplicatesFromSortedList.ListNode(3);
        head.next.next.next.next = new RemoveDuplicatesFromSortedList.ListNode(3);
        head.next.next.next.next.next = new RemoveDuplicatesFromSortedList.ListNode(3);
        new RemoveDuplicatesFromSortedList().deleteDuplicates(head);

        RemoveDuplicatesFromSortedList.ListNode p = head;
        int val = 1;
        while(p != null) {
            assertEquals(p.val, val++);
            p = p.next;
        }

        new RemoveDuplicatesFromSortedList().deleteDuplicates(null);
    }
}
