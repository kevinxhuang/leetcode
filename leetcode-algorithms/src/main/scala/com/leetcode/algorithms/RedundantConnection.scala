package com.leetcode.algorithms


/**
  * 684. Redundant Connection
  *
  * https://leetcode.com/problems/redundant-connection/
  */
object RedundantConnection {
  import scala.annotation.tailrec
  import scala.collection.mutable

  def findRedundantConnection(edges: Array[Array[Int]]): Array[Int] = {
    val vertices = new mutable.HashSet[Int]()
    edges.zipWithIndex.find({case (edge, index) => {
      if(vertices.contains(edge.head) && vertices.contains(edge.last)) {
        hasCycles(edges.slice(0, index + 1))
      } else {
        vertices.add(edge.head)
        vertices.add(edge.last)
        false
      }
    }}) match {
      case Some((edge, _)) => edge
      case None => Array.emptyIntArray
    }
  }

  @tailrec
  private def hasCycles(edges: Array[Array[Int]]): Boolean = {
    if(edges.isEmpty) {
      false
    } else {
      val vertices = buildVertices(edges)
      val leafNodes = vertices.keySet.filter(v => vertices(v) <= 1)
      leafNodes.isEmpty || hasCycles(edges.filter(edge => {
        !(leafNodes.contains(edge.head) || leafNodes.contains(edge.last))
      }))
    }
  }

  private def buildVertices(edges: Array[Array[Int]]): Map[Int, Int] = {
    val degrees = new mutable.HashMap[Int, Int]()
    edges.foreach(edge => {
      degrees.put(edge.head, degrees.getOrElse(edge.head, 0) + 1)
      degrees.put(edge.last, degrees.getOrElse(edge.last, 0) + 1)
    })

    degrees.toMap
  }
}
