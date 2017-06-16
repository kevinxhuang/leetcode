package com.leetcode.algorithms;

import com.leetcode.algorithms.model.RandomListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/copy-list-with-random-pointer/?tab=Description
 */
public class CopyListWithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {

        if (head == null) {
            return null;
        }

        Map<RandomListNode, RandomListNode> nodeMap = new HashMap<>();

        // Copy all nodes
        RandomListNode node = head;
        while (node != null) {
            nodeMap.put(node, new RandomListNode(node.label));
            node = node.next;
        }

        // Copy next and random pointers
        node = head;
        while (node != null) {
            nodeMap.get(node).next = nodeMap.get(node.next);
            nodeMap.get(node).random = nodeMap.get(node.random);
            node = node.next;
        }

        return nodeMap.get(head);
    }
}
