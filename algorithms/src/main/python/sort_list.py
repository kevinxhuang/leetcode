'''
https://oj.leetcode.com/problems/sort-list/
'''

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    # @param head, a ListNode
    # @return a ListNode
    def sortList(self, head):
        if head is None or head.next is None:
            return head

        slow = head
        fast = head
        while fast.next and fast.next.next:
            slow = slow.next
            fast = fast.next.next
        head1 = head
        head2 = slow.next
        slow.next = None
        head1 = self.sortList(head1)
        head2 = self.sortList(head2)
        head = self.__merge(head1, head2)
        return head

    def __merge(self, head1, head2):
        if head1 is None:
            return head2
        if head2 is None:
            return head1

        dummy_head = ListNode(0)
        p = dummy_head
        while head1 and head2:
            if head1.val <= head2.val:
                p.next = head1
                head1 = head1.next
                p = p.next
            else:
                p.next = head2
                head2 = head2.next
                p = p.next

        if not head1 is None:
            p.next = head1
        if not head2 is None:
            p.next = head2

        return dummy_head.next