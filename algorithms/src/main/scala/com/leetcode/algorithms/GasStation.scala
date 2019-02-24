package com.leetcode.algorithms

object GasStation {
  def canCompleteCircuit(gas: Array[Int], cost: Array[Int]): Int = {
    gas.indices.find(isCompleteCircuit(gas, cost, _)) match {
      case Some(pos) => pos
      case None => -1
    }
  }

  def isCompleteCircuit(gas: Array[Int], cost: Array[Int], startPos: Int): Boolean = {
    var tank = 0

    val indexes = (startPos until gas.length) ++ (0 until startPos)
    indexes.foreach(i => {
      tank = tank + gas(i) - cost(i)
      if(tank < 0) {
        return false
      }
    })

    true
  }
}
