package com.leetcode.algorithms;

import com.leetcode.algorithms.model.RandomListNode;
import org.testng.annotations.Test;

public class CopyListWithRandomPointerTest {
    @Test
    public void testCopyRandomList() {
        RandomListNode head = new RandomListNode(1);
        head.next = new RandomListNode(2);
        head.next.next = new RandomListNode(3);
        head.random = head.next;
        head.next.random = null;
        head.next.next.random = head;

        RandomListNode copyListHead = new CopyListWithRandomPointer().copyRandomList(head);
    }
}
