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

//  @Test
//  def testReadBinaryWatch(): Unit = {
//    assertEquals(BinaryWatch.readBinaryWatch(1).sorted.mkString, Array("1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32").sorted.mkString)
//    assertEquals(BinaryWatch.readBinaryWatch(8).sorted.mkString, Array("7:31","7:47","7:55","7:59","11:31","11:47","11:55","11:59").sorted.mkString)
//  }

  @Test
  def testMaxCount(): Unit = {
    assertEquals(RangeAdditionII.maxCount(3, 3, Array(Array(2, 2), Array(3,3))), 4)
  }
}
