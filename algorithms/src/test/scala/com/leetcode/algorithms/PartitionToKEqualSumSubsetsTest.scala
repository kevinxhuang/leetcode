package com.leetcode.algorithms

class PartitionToKEqualSumSubsetsTest extends AlgorithmsTest {
  "PartitionToKEqualSumSubsets" should "pass basic test" in {
    PartitionToKEqualSumSubsets.canPartitionKSubsets(Array(4, 3, 2, 3, 5, 2, 1), 4) should be (true)
    PartitionToKEqualSumSubsets.canPartitionKSubsets(Array(4, 3, 2, 3, 5, 2, 1, 1, 1, 1, 1, 1), 5) should be (true)
    PartitionToKEqualSumSubsets.canPartitionKSubsets(Array(4, 3, 2, 3, 5, 2, 1, 1, 1, 1, 1, 2), 5) should be (false)
    PartitionToKEqualSumSubsets.canPartitionKSubsets(Array(2, 6, 6), 2) should be (false)
    PartitionToKEqualSumSubsets.canPartitionKSubsets(Array(2, 2, 2), 2) should be (false)
    PartitionToKEqualSumSubsets.canPartitionKSubsets(Array(3522,181,521,515,304,123,2512,312,922,407,146,1932,4037,2646,3871,269), 5) should be (true)
  }
}
