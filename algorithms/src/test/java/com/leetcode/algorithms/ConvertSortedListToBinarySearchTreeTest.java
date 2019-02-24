package com.leetcode.algorithms;


import com.leetcode.algorithms.model.ListNode;
import org.testng.annotations.Test;

public class ConvertSortedListToBinarySearchTreeTest {

    @Test
    public void testSortedListToBST() {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        list1.next.next.next.next = new ListNode(5);
        new ConvertSortedListToBinarySearchTree().sortedListToBST(list1);

        ListNode list2 = new ListNode(1);
        list1.next = new ListNode(1);
        list1.next.next = new ListNode(1);
        list1.next.next.next = new ListNode(2);
        list1.next.next.next.next = new ListNode(2);
        new ConvertSortedListToBinarySearchTree().sortedListToBST(list2);

        new ConvertSortedListToBinarySearchTree().sortedListToBST(null);

        new ConvertSortedListToBinarySearchTree().sortedListToBST(new ListNode(1));
    }
}
