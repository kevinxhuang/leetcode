package com.leetcode.algorithms

import scala.collection.mutable

/**
  * 205. Isomorphic Strings
  */
object IsomorphicStrings {
  def isIsomorphic(s: String, t: String): Boolean = {
    if(s.length != t.length) {
      false
    } else {
      val mapping = new mutable.HashMap[Char, Char]()
      s.zip(t).forall({
        case (k, v) =>
          if ((mapping.contains(k) && mapping(k) != v) ||
            (!mapping.contains(k) && mapping.values.exists(_ == v))) {
            false
          } else {
            mapping.put(k, v)
            true
          }
      })
    }
  }
}
