package com.leetcode.algorithms;


import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class PathSumIITest {
    @Test
    public void testPathSum() {
        //[5,4,8,11,null,13,4,7,2,null,null,5,1]
        PathSumII.TreeNode root = new PathSumII.TreeNode(5);
        root.left = new PathSumII.TreeNode(4);
        root.right =  new PathSumII.TreeNode(8);
        root.left.left = new PathSumII.TreeNode(11);
        root.left.left.left = new PathSumII.TreeNode(7);
        root.left.left.right = new PathSumII.TreeNode(2);
        root.right.left = new PathSumII.TreeNode(13);
        root.right.right = new PathSumII.TreeNode(4);
        root.right.right.left = new PathSumII.TreeNode(5);
        root.right.right.right = new PathSumII.TreeNode(1);

        assertEquals(new PathSumII().pathSum(root, 22), Arrays.asList(Arrays.asList(5, 4, 11, 2), Arrays.asList(5, 8, 4, 5)));
    }
}
