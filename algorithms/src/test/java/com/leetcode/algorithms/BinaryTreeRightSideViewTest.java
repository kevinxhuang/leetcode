package com.leetcode.algorithms;

import com.leetcode.algorithms.model.TreeNode;
import com.leetcode.algorithms.util.AssertUtil;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;

public class BinaryTreeRightSideViewTest {
    @Test
    public void testRightSideView() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        AssertUtil.compareElements(new BinaryTreeRightSideView().rightSideView(root), Arrays.asList(1, 3, 4));

        AssertUtil.compareElements(new BinaryTreeRightSideView().rightSideView(new TreeNode(1)), Arrays.asList(1));
        AssertUtil.compareElements(new BinaryTreeRightSideView().rightSideView(null), Collections.emptyList());
    }
}
