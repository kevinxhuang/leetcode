package com.leetcode.algorithms

import com.leetcode.algorithms.scalamodel.TreeNode

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
  * 513. Find Bottom Left Tree Value
  */
object FindBottomLeftTreeValue {
  def findBottomLeftValue(root: TreeNode): Int = {
    val queue = new mutable.Queue[TreeNode]()
    val buffer = new ArrayBuffer[TreeNode]()

    queue.enqueue(root)
    while(queue.nonEmpty) {
      buffer.clear()
      while(queue.nonEmpty) {
        buffer += queue.dequeue()
      }

      buffer.foreach(node => {
        if(node.left != null) {
          queue.enqueue(node.left)
        }

        if(node.right != null) {
          queue.enqueue(node.right)
        }
      })

      if(queue.isEmpty) {
        return buffer.head.value
      }
    }

    0
  }
}
