package com.leetcode.algorithms

import com.leetcode.algorithms.scalamodel.TreeNode

/**
  * 623. Add One Row to Tree
  *
  */
object AddOneRowToTree {
  import scala.collection.mutable.Queue

  def addOneRow(root: TreeNode, v: Int, d: Int): TreeNode = {
    if (d == 1) {
      val newNode = new TreeNode(v)
      newNode.left = root
      newNode
    } else {
      var level = 1
      val queue = new Queue[TreeNode]()
      queue.enqueue(root)
      while(level < d - 1) {
        queue.dequeueAll(_ => true).foreach({
          node =>
            if (node.left != null) {
              queue.enqueue(node.left)
            }
            if (node.right != null) {
              queue.enqueue(node.right)
            }
        })
        level += 1
      }
      queue.dequeueAll(_ => true).foreach({
        node =>
          val newLeftNode = new TreeNode(v)
          if (node.left != null) {
            newLeftNode.left = node.left
          }
          node.left = newLeftNode

          val newRightNode = new TreeNode(v)
          if (node.right != null) {
            newRightNode.right = node.right
          }
          node.right = newRightNode
      })
      root
    }
  }
}
