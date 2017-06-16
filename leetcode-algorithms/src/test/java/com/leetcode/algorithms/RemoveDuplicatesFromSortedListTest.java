package com.leetcode.algorithms;


import com.leetcode.algorithms.model.ListNode;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RemoveDuplicatesFromSortedListTest {
    @Test
    public void deleteDuplicates() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(3);
        new RemoveDuplicatesFromSortedList().deleteDuplicates(head);

        ListNode p = head;
        int val = 1;
        while(p != null) {
            assertEquals(p.val, val++);
            p = p.next;
        }

        new RemoveDuplicatesFromSortedList().deleteDuplicates(null);
    }
}
