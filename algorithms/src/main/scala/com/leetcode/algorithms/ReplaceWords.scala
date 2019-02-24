package com.leetcode.algorithms

import com.leetcode.algorithms.annotation.TimeLimitExceeded

/**
  * 648. Replace Words
  *
  * https://leetcode.com/problems/replace-words
  */
@TimeLimitExceeded
object ReplaceWords {
  import scala.annotation.tailrec
  import scala.collection.mutable

  def replaceWords(dict: List[String], sentence: String): String = {
    val trieTree = new TrieTree(dict)

    sentence.split("\\s+").par.map(word => {
      val node = trieTree.findPrefix(word)
      if(node.isDefined) {
        node.get.word
      } else {
        word
      }
    }).mkString(" ")
  }

  case class TrieTreeNode(char: Char, word: String, isInDict: Boolean = false, children: mutable.Map[Char, TrieTreeNode] = mutable.Map.empty)
  class TrieTree(dict: List[String]) {
    private val internalDict = dict.toSet
    private val root = TrieTreeNode('#', "")

    internalDict.foreach(addWord)

    private def addWord(word: String) = {
      var current = root
      word.foreach(char => {
        if(!current.children.keySet.contains(char)){
          current.children.put(char, TrieTreeNode(char, current.word + char,
            internalDict.contains(current.word + char)))
        }
        current = current.children(char)
      })
    }

    def findPrefix(prefix: String): Option[TrieTreeNode] = {
      _findPrefix(prefix, root)
    }

    @tailrec
    private def _findPrefix(prefix: String, node: TrieTreeNode): Option[TrieTreeNode] = {
      if (node.isInDict) {
        Some(node)
      } else {
        if (prefix.nonEmpty && node.children.keySet.contains(prefix.head)) {
          _findPrefix(prefix.tail, node.children(prefix.head))
        } else {
          Option.empty
        }
      }
    }
  }
}


