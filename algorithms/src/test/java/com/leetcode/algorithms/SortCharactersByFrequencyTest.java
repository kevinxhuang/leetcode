package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SortCharactersByFrequencyTest {
    @Test
    public void testFrequencySort() {
        assertEquals(new SortCharactersByFrequency().frequencySort("tree"), "eetr");
        assertEquals(new SortCharactersByFrequency().frequencySort("cccaaa"), "cccaaa");
        assertEquals(new SortCharactersByFrequency().frequencySort("Aabb"), "bbaA");
    }
}
