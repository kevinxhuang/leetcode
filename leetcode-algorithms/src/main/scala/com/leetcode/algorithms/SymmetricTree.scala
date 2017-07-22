package com.leetcode.algorithms

import com.leetcode.algorithms.scalamodel.TreeNode


/**
  * 101. Symmetric Tree
  *
  * https://leetcode.com/problems/symmetric-tree
  */
object SymmetricTree {
  def isSymmetric(root: TreeNode): Boolean = {
    import scala.collection.mutable.{ListBuffer, Queue}

    val queue = new Queue[TreeNode]
    queue.enqueue(root)

    while(!queue.isEmpty) {
      val nodesOfLevel = new ListBuffer[TreeNode]
      while(!queue.isEmpty) {
        nodesOfLevel += queue.dequeue()
      }

      if (nodesOfLevel.length > 1) {
        for (i <- 0 to nodesOfLevel.length / 2) {
          if (nodesOfLevel(i) != null && nodesOfLevel(nodesOfLevel.length - i - 1) == null
            || nodesOfLevel(i) == null && nodesOfLevel(nodesOfLevel.length - i - 1) != null
            || (nodesOfLevel(i) != null && nodesOfLevel(nodesOfLevel.length - i - 1) != null && nodesOfLevel(i)._value != nodesOfLevel(nodesOfLevel.length - i - 1)._value)) {
            return false
          }
        }
      }

      for(node <- nodesOfLevel if node != null) {
        queue.enqueue(node.left)
        queue.enqueue(node.right)
      }
    }

    true
  }
}
