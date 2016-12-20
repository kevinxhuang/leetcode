package com.leetcode;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
public class RemoveDuplicatesFromSortedList {

	public ListNode deleteDuplicates(ListNode head) {

		ListNode previous = head;
		ListNode current = head;
		if (current != null) {
			current = current.next;
		}

		while(current != null) {
			if (previous.val == current.val) {
				previous.next = current.next;
				current = null;
			} else {
				previous = previous.next;
			}
			current = previous.next;
		}

		return head;
	}

	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(3);
		head.next.next.next.next.next = new ListNode(3);
		new RemoveDuplicatesFromSortedList().deleteDuplicates(head);

		ListNode p = head;
		while(p != null) {
			System.out.println(p.val);
			p = p.next;
		}

		new RemoveDuplicatesFromSortedList().deleteDuplicates(null);
	}
}
