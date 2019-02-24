package com.leetcode.algorithms

import com.leetcode.algorithms.scalamodel.TreeNode

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
  * 637. Average of Levels in Binary Tree
  *
  * https://leetcode.com/problems/average-of-levels-in-binary-tree
  */
object AverageOfLevelsInBinaryTree {
  def averageOfLevels(root: TreeNode): Array[Double] = {
    val resultBuilder = new ArrayBuffer[Double]()

    val queue = new mutable.Queue[TreeNode]()
    queue.enqueue(root)
    while(queue.nonEmpty) {
      val nodes = queue.dequeueAll(_ => true)
      resultBuilder += (nodes.map(_.value.toDouble).sum / nodes.size)

      nodes.flatMap(node => Seq(node.left, node.right))
        .filter(_ != null)
        .foreach(queue.enqueue(_))
    }

    resultBuilder.toArray
  }
}
