package com.leetcode.algorithms;

import org.testng.annotations.Test;

public class CopyListWithRandomPointerTest {
    @Test
    public void testCopyRandomList() {
        CopyListWithRandomPointer.RandomListNode head = new CopyListWithRandomPointer.RandomListNode(1);
        head.next = new CopyListWithRandomPointer.RandomListNode(2);
        head.next.next = new CopyListWithRandomPointer.RandomListNode(3);
        head.random = head.next;
        head.next.random = null;
        head.next.next.random = head;

        CopyListWithRandomPointer.RandomListNode copyListHead = new CopyListWithRandomPointer().copyRandomList(head);
    }
}
