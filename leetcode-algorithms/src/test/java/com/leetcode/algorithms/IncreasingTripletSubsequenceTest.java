package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class IncreasingTripletSubsequenceTest {
    @Test
    public void testIncreasingTriplet() {
        assertEquals(new IncreasingTripletSubsequence().increasingTriplet(new int[]{}), false); // false
        assertEquals(new IncreasingTripletSubsequence().increasingTriplet(new int[]{1, 2, 3, 4, 5}), true); // true
        assertEquals(new IncreasingTripletSubsequence().increasingTriplet(new int[]{5, 4, 3, 2, 1}), false); // false
        assertEquals(new IncreasingTripletSubsequence().increasingTriplet(new int[]{5, 1, 3, 2, 3}), true); // true
        assertEquals(new IncreasingTripletSubsequence().increasingTriplet(new int[]{2,1,5,0,3}), false); // false
    }
    
}
