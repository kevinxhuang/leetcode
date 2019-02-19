package com.leetcode.algorithms

import com.leetcode.algorithms.scalamodel._
import org.scalatest.testng.TestNGSuite
import org.testng.annotations.Test
import org.testng.Assert._

class AlgorithmsTest extends TestNGSuite {
  @Test
  def testAddTwoNumbers(): Unit = {
    val l1 = new ListNode(2)
    l1.next = new ListNode(4)
    l1.next.next = new ListNode(3)
    val l2 = new ListNode(5)
    l2.next = new ListNode(6)
    l2.next.next = new ListNode(4)
    AddTwoNumbers.addTwoNumbers(l1, l2)

    val l3 = new ListNode(9)
    l3.next = new ListNode(9)
    l3.next.next = new ListNode(9)
    val l4 = new ListNode(1)
    AddTwoNumbers.addTwoNumbers(l3, l4)
  }

  @Test
  def testAddBinary(): Unit = {
    assertEquals(AddBinary.addBinary("11", "1"), "100")
    assertEquals(AddBinary.addBinary("1000000000000000000000000000000", "1"), "1000000000000000000000000000001")
  }

  @Test
  def testWordPattern(): Unit = {
    assertEquals(WordPattern.wordPattern("abba", "dog cat cat dog"), true)
    assertEquals(WordPattern.wordPattern("abba", "dog cat cat fish"), false)
    assertEquals(WordPattern.wordPattern("aaaa", "dog cat cat dog"), false)
    assertEquals(WordPattern.wordPattern("abba", "dog dog dog dog"), false)
    assertEquals(WordPattern.wordPattern("aaa", "aaa aa aa aa aa"), false)
  }

  @Test
  def testIntegerReplacement(): Unit = {
    assertEquals(IntegerReplacement.integerReplacement(8), 3)
    assertEquals(IntegerReplacement.integerReplacement(7), 4)
    assertEquals(IntegerReplacement.integerReplacement(1), 0)
  }

  @Test
  def testNumberOfBoomerangs(): Unit = {
    assertEquals(NumberOfBoomerangs.numberOfBoomerangs(Array(Array(0, 0), Array(1, 0), Array(2, 0))), 2)
  }

  @Test
  def testMyPow(): Unit = {
    assertEquals(Pow.myPow(5, 0), 1.toDouble)
    assertEquals(Pow.myPow(5, 1), 5.toDouble)
    assertEquals(Pow.myPow(5, 2), 25.toDouble)
    assertEquals(Pow.myPow(2, 10), 1024.toDouble)
  }

  @Test
  def testIsNumber(): Unit = {
    assertTrue(ValidNumber.isNumber("0"))
    assertTrue(ValidNumber.isNumber(" 0.1 "))
    assertFalse(ValidNumber.isNumber("abc"))
    assertFalse(ValidNumber.isNumber("1 a"))
    assertTrue(ValidNumber.isNumber("2e10"))
    assertFalse(ValidNumber.isNumber("959440.94f"))
    assertTrue(ValidNumber.isNumber("-1."))
    assertTrue(ValidNumber.isNumber("+.8"))
  }

  @Test
  def testLongestPalindrome(): Unit = {
    assertEquals(LongestPalindromicSubstring.longestPalindrome("babad"), "bab")
    assertEquals(LongestPalindromicSubstring.longestPalindrome("cbbd"), "bb")
    assertEquals(LongestPalindromicSubstring.longestPalindrome(""), "")
    assertEquals(LongestPalindromicSubstring.longestPalindrome("a"), "a")
  }

  @Test
  def testIsSymmetric(): Unit = {
    val tree1 = new TreeNode(1)
    tree1.left = new TreeNode(2)
    tree1.right = new TreeNode(2)
    tree1.left.left = new TreeNode(3)
    tree1.left.right = new TreeNode(4)
    tree1.right.left = new TreeNode(4)
    tree1.right.right = new TreeNode(3)
    assertTrue(SymmetricTree.isSymmetric(tree1))

    val tree2 = new TreeNode(1)
    tree2.left = new TreeNode(2)
    tree2.right = new TreeNode(2)
    tree2.left.right = new TreeNode(3)
    tree2.right.right = new TreeNode(3)
    assertFalse(SymmetricTree.isSymmetric(tree2))

    assertTrue(SymmetricTree.isSymmetric(null))
  }

  @Test
  def testReadBinaryWatch(): Unit = {
    assertEquals(BinaryWatch.readBinaryWatch(1).sorted.mkString, Array("1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32").sorted.mkString)
    assertEquals(BinaryWatch.readBinaryWatch(8).sorted.mkString, Array("7:31","7:47","7:55","7:59","11:31","11:47","11:55","11:59").sorted.mkString)
  }

  @Test
  def testMaxCount(): Unit = {
    assertEquals(RangeAdditionII.maxCount(3, 3, Array(Array(2, 2), Array(3,3))), 4)
  }

  @Test
  def testHIndex(): Unit = {
    assertEquals(HIndex.hIndex(Array(3, 0, 6, 1, 5)), 3)
  }

  @Test
  def testGrayCode(): Unit = {
    assertEquals(GrayCode.grayCode(0), List(0))
    assertEquals(GrayCode.grayCode(2), List(0,1,3,2))
    assertEquals(GrayCode.grayCode(3), List(0, 1, 3, 2, 6, 7, 5, 4))
  }

  @Test
  def testReverse(): Unit = {
    assertEquals(ReverseInteger.reverse(123), 321)
    assertEquals(ReverseInteger.reverse(-123), -321)
    assertEquals(ReverseInteger.reverse(1534236469), 0)
  }

  @Test
  def testIsPalindrome(): Unit = {
    assertEquals(PalindromeNumber.isPalindrome(12321), true)
    assertEquals(PalindromeNumber.isPalindrome(-12321), false)
    assertEquals(PalindromeNumber.isPalindrome(1), true)
    assertEquals(PalindromeNumber.isPalindrome(12), false)
  }

  @Test
  def testBook(): Unit = {
    val calendar = new MyCalendarI()
    assertEquals(calendar.book(10, 20), true)
    assertEquals(calendar.book(15, 25), false)
    assertEquals(calendar.book(20, 30), true)
  }

  @Test
  def testMaxRotateFunction(): Unit = {
    assertEquals(RotateFunction.maxRotateFunction(Array(4, 3, 2, 6)), 26)
    assertEquals(RotateFunction.maxRotateFunction(Array(1)), 0)
    assertEquals(RotateFunction.maxRotateFunction(Array(1,2)), 2)
    assertEquals(RotateFunction.maxRotateFunction(Array()), 0)
  }

  @Test
  def testFirstUniqChar(): Unit = {
    assertEquals(FirstUniqueCharacterInAString.firstUniqChar("leetcode"), 0)
    assertEquals(FirstUniqueCharacterInAString.firstUniqChar("loveleetcode"), 2)
  }

  @Test
  def testPick(): Unit = {
    val nums = Array(1,2,3,3,3)
    assertEquals(new RandomPickIndex(nums).pick(2), 1)
    assertTrue(new RandomPickIndex(nums).pick(3) == 2
      || new RandomPickIndex(nums).pick(3) == 3
      || new RandomPickIndex(nums).pick(3) == 4)
  }

  @Test
  def testCanPartitionKSubsets(): Unit = {
    assert(PartitionToKEqualSumSubsets.canPartitionKSubsets(Array(4, 3, 2, 3, 5, 2, 1), 4))
    assert(PartitionToKEqualSumSubsets.canPartitionKSubsets(Array(4, 3, 2, 3, 5, 2, 1, 1, 1, 1, 1, 1), 5))
    assert(!PartitionToKEqualSumSubsets.canPartitionKSubsets(Array(4, 3, 2, 3, 5, 2, 1, 1, 1, 1, 1, 2), 5))
    assert(!PartitionToKEqualSumSubsets.canPartitionKSubsets(Array(2, 6, 6), 2))
    assert(!PartitionToKEqualSumSubsets.canPartitionKSubsets(Array(2, 2, 2), 2))
    assert(PartitionToKEqualSumSubsets.canPartitionKSubsets(Array(3522,181,521,515,304,123,2512,312,922,407,146,1932,4037,2646,3871,269), 5))
  }

  @Test
  def testMaxProduct(): Unit = {
    assert(MaximumProductSubarray.maxProduct(Array(2,3,-2,4)) == 6)
  }

  @Test
  def testFindShortestSubArray(): Unit = {
    assert(DegreeOfAnArray.findShortestSubArray(Array(1,2,2,3,1)) == 2)
  }

  @Test
  def testNumMatchingSubseq(): Unit = {
    assert(NumberOfMatchingSubsequences.numMatchingSubseq("abcde", Array("a", "bb", "acd", "ace")) == 3)
    assert(NumberOfMatchingSubsequences.numMatchingSubseq("qlhxagxdqh", Array("qlhxagxdq","qlhxagxdq","lhyiftwtut","yfzwraahab")) == 2)
  }

  @Test
  def testCheckPerfectNumber(): Unit = {
    assert(PerfectNumber.checkPerfectNumber(28))
    assert(!PerfectNumber.checkPerfectNumber(1))
  }

  @Test
  def testSubarraySum(): Unit = {
    assert(SubarraySumEqualsK.subarraySum(Array(1,1,1), 2) == 2)
    assert(SubarraySumEqualsK.subarraySum(Array(1,1,1), 3) == 1)
    assert(SubarraySumEqualsK.subarraySum(Array(1), 1) == 1)
    assert(SubarraySumEqualsK.subarraySum(Array(), 1) == 0)
    assert(SubarraySumEqualsK.subarraySum(Array(-1,-1,1), 0) == 1)
  }

  @Test
  def testIsUgly(): Unit = {
    assert(UglyNumber.isUgly(6))
    assert(!UglyNumber.isUgly(14))
  }

  @Test
  def testReorganizeString(): Unit = {
    assert(ReorganizeString.reorganizeString("aab") == "aba")
    assert(ReorganizeString.reorganizeString("aaab") == "")
    assert(ReorganizeString.reorganizeString("") == "")
    assert(ReorganizeString.reorganizeString("aa") == "")
  }

  @Test
  def testReplaceWords(): Unit = {
    assert(ReplaceWords.replaceWords(List("cat", "bat", "rat"), "the cattle was rattled by the battery")
      == "the cat was rat by the bat")
    assert(ReplaceWords.replaceWords(List("a", "aa", "aaa", "aaaa"), "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa")
      == "a a a a a a a a bbb baba a")
  }

  @Test
  def testDesignCircularQueue(): Unit = {
    val circularQueue = new MyCircularQueue(3); // set the size to be 3
    assert(circularQueue.enQueue(1)) // return true
    assert(circularQueue.enQueue(2))  // return true
    assert(circularQueue.enQueue(3))  // return true
    assert(!circularQueue.enQueue(4))  // return false, the queue is full
    assert(circularQueue.Rear() ==3) // return 3
    assert(circularQueue.isFull())  // return true
    assert(circularQueue.deQueue())  // return true
    assert(circularQueue.enQueue(4))  // return true
    assert(circularQueue.Rear() ==4)  // return 4
  }

  @Test
  def testSimplifyPath(): Unit = {
    assert(SimplifyPath.simplifyPath("/home/") == "/home")
    assert(SimplifyPath.simplifyPath("/../") == "/")
    assert(SimplifyPath.simplifyPath("/..") == "/")
  }

  @Test
  def testIsPowerOfFour(): Unit = {
    assert(!PowerOfFour.isPowerOfFour(0))
    assert(PowerOfFour.isPowerOfFour(1))
    assert(PowerOfFour.isPowerOfFour(4))
    assert(!PowerOfFour.isPowerOfFour(5))
    assert(PowerOfFour.isPowerOfFour(16))
  }

  @Test
  def testSumNumbers(): Unit = {
    val root1 = new TreeNode(1)
    root1.left = new TreeNode(2)
    root1.right = new TreeNode(3)
    assert(SumRootToLeafNumbers.sumNumbers(root1) == 25)

    val root2 = new TreeNode(4)
    root2.left = new TreeNode(9)
    root2.right = new TreeNode(0)
    root2.left.left = new TreeNode(5)
    root2.left.right = new TreeNode(1)
    assert(SumRootToLeafNumbers.sumNumbers(root2) == 1026)
  }

  @Test
  def testLongestCommonPrefix(): Unit = {
    assert(LongestCommonPrefix.longestCommonPrefix(Array("flower","flow","flight")) == "fl")
    assert(LongestCommonPrefix.longestCommonPrefix(Array("dog","racecar","car")) == "")
    assert(LongestCommonPrefix.longestCommonPrefix(Array()) == "")
    assert(LongestCommonPrefix.longestCommonPrefix(Array("")) == "")
    assert(LongestCommonPrefix.longestCommonPrefix(Array("a")) == "a")
    assert(LongestCommonPrefix.longestCommonPrefix(Array("a", "b")) == "")
    assert(LongestCommonPrefix.longestCommonPrefix(Array("a", "a")) == "a")
  }

  @Test
  def testFindRedundantConnection(): Unit = {
    assert(RedundantConnection.findRedundantConnection(
      Array(Array(1, 2), Array(1, 3), Array(2, 3))) sameElements Array(2, 3))
    assert(RedundantConnection.findRedundantConnection(
      Array(Array(1, 2), Array(2, 3), Array(3, 4), Array(1, 4), Array(1, 5))) sameElements Array(1, 4))
    assert(RedundantConnection.findRedundantConnection(
      Array(Array(3, 4), Array(1, 2), Array(2, 4), Array(3, 5), Array(2, 5))) sameElements Array(2, 5))
  }

  @Test
  def testCanCompleteCircuit(): Unit = {
    assert(GasStation.canCompleteCircuit(Array(1,2,3,4,5), Array(3,4,5,1,2)) == 3)
    assert(GasStation.canCompleteCircuit(Array(2,3,4), Array(3, 4, 3)) == -1)
  }
}
