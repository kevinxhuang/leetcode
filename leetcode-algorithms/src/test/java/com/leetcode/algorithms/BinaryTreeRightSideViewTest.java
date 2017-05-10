package com.leetcode.algorithms;

import com.leetcode.algorithms.util.AssertUtil;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;

public class BinaryTreeRightSideViewTest {
    @Test
    public void testRightSideView() {
        BinaryTreeRightSideView.TreeNode root = new BinaryTreeRightSideView.TreeNode(1);
        root.left = new BinaryTreeRightSideView.TreeNode(2);
        root.right = new BinaryTreeRightSideView.TreeNode(3);
        root.left.right = new BinaryTreeRightSideView.TreeNode(5);
        root.right.right = new BinaryTreeRightSideView.TreeNode(4);

        AssertUtil.compareList(new BinaryTreeRightSideView().rightSideView(root), Arrays.asList(1, 3, 4));

        AssertUtil.compareList(new BinaryTreeRightSideView().rightSideView(new BinaryTreeRightSideView.TreeNode(1)), Arrays.asList(1));
        AssertUtil.compareList(new BinaryTreeRightSideView().rightSideView(null), Collections.emptyList());
    }
}
