package com.leetcode.algorithms.util

import com.leetcode.algorithms.scalamodel.{ListNode, TreeNode}

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object AlgorithmsUtil {
  def createList(values: Array[Int]): ListNode = {
    values.map(new ListNode(_))
      .reduceRight((node1: ListNode, node2: ListNode) => {
        node1.next = node2
        node1})
  }

  def verifyList(head: ListNode, values: Array[Int]): Boolean = {
    val result = new ArrayBuffer[Int]()
    var cursor = head
    while(cursor != null) {
      result += cursor.x
      cursor = cursor.next
    }

    result.toArray sameElements values
  }

  def createBinaryTree(values: Array[Int]): TreeNode = {
    val nodes = values.map(value => {
      if(value == null) {
        null
      } else {
        new TreeNode(value)
      }
    })

    nodes.indices.foreach(i => {
      val node = nodes(i)
      val leftIndex = (i + 1) * 2 - 1
      val rightIndex = (i + 1) * 2
      if(nodes(i) != null) {
        if(leftIndex < nodes.length) {
          node.left = nodes(leftIndex)
        }
        if(rightIndex < nodes.length) {
          node.right = nodes(rightIndex)
        }
      }
    })

    nodes.head
  }

//  def verifyTree(root: TreeNode): Array[Int] = {
//    val values = new ArrayBuffer[Int]()
//    val nodesInCurrentLevel = new ArrayBuffer[TreeNode]()
//
//    nodesInCurrentLevel += root
//    while(nodesInCurrentLevel.exists(node => node.left != null || node.right != null)) {
//      val nodesInNextLevel = nodesInCurrentLevel.flatMap(node => Seq(node.left, node.right))
//      val valuesInCurrentLevel: Array[Int] = nodesInCurrentLevel.map(node => {
//        if(node == null) {
//          null
//        } else {
//          node.value
//        }
//      }).toArray
//      values ++= valuesInCurrentLevel
//      nodesInCurrentLevel.clear()
//
//      nodesInCurrentLevel ++= nodesInNextLevel
//    }
//  }
}
