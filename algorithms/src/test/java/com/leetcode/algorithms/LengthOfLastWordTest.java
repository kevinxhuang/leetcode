package com.leetcode.algorithms;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class LengthOfLastWordTest {
    @Test
    public void tesLengthOfLastWord() {
        assertEquals(new LengthofLastWord().lengthOfLastWord("Hello World"), 5);
        assertEquals(new LengthofLastWord().lengthOfLastWord(""), 0);
    }
    
}
