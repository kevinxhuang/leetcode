package com.leetcode.algorithms

class GasStationTest extends AlgorithmsTest {
  "GasStation" should "pass basic test" in {
    GasStation.canCompleteCircuit(Array(1,2,3,4,5), Array(3,4,5,1,2)) should be (3)
    GasStation.canCompleteCircuit(Array(2,3,4), Array(3, 4, 3)) should be (-1)
  }
}
