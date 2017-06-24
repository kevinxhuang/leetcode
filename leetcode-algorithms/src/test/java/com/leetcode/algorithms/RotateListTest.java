package com.leetcode.algorithms;


import com.leetcode.algorithms.model.ListNode;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class RotateListTest {
    @Test
    public void testRotateRight() {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        list1.next.next.next.next = new ListNode(5);
        assertEquals(1, new RotateList().rotateRight(list1, 10).val);


        ListNode list2 = new ListNode(1);
        assertEquals(1, new RotateList().rotateRight(list2, 2).val);

        assertEquals(null, new RotateList().rotateRight(null, 2));

        ListNode list3 = new ListNode(1);
        list3.next = new ListNode(2);
        assertEquals(1, new RotateList().rotateRight(list3, 0).val);

        ListNode list4 = new ListNode(1);
        list4.next = new ListNode(2);
        assertEquals(2, new RotateList().rotateRight(list4, 1).val);

        ListNode list5 = new ListNode(1);
        list5.next = new ListNode(2);
        assertEquals(1, new RotateList().rotateRight(list5, 2).val);
    }
}
