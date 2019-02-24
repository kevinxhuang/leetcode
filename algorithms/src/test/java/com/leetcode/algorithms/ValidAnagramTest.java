package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ValidAnagramTest {
    @Test
    public void testIsAnagram() {
        assertTrue(new ValidAnagram().isAnagram("anagram", "nagaram"));
        assertFalse(new ValidAnagram().isAnagram("rat", "cat"));
        assertTrue(new ValidAnagram().isAnagram("", ""));
    }
}
