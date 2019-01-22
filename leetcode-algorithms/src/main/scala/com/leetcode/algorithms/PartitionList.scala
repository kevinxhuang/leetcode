package com.leetcode.algorithms

import com.leetcode.algorithms.scalamodel.ListNode

/**
  * 86. Partition List
  *
  * https://leetcode.com/problems/partition-list/
  */
class PartitionList {
  var head: ListNode = null
  var tail: ListNode = null

  def isInitialized(): Boolean = head != null
  private def initialize(node: ListNode): Unit = {
    head = node
    tail = node
  }

  def append(node: ListNode): Unit = {
    if(!isInitialized()) {
      initialize(node)
    } else {
      tail.next = node
      tail = tail.next
    }
  }
}

object PartitionList {
  def partition(head: ListNode, x: Int): ListNode = {
    val lowPartition: PartitionList = new PartitionList()
    val highPartition: PartitionList = new PartitionList()

    var p = head
    while(p != null) {
      println(p.x)
      if(p.x < x) {
        lowPartition.append(p)
      } else {
        highPartition.append(p)
      }
      p = p.next
    }

    merge(lowPartition, highPartition)
  }

  def merge(lowPartition: PartitionList, highPartition: PartitionList): ListNode = {
    if(lowPartition.isInitialized() && highPartition.isInitialized()) {
      lowPartition.append(highPartition.head)
      highPartition.tail.next = null
      lowPartition.head
    } else if(lowPartition.isInitialized()) {
      lowPartition.head
    } else {
      highPartition.head
    }
  }
}
