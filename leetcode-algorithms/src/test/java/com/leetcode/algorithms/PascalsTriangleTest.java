package com.leetcode.algorithms;


import org.testng.annotations.Test;

public class PascalsTriangleTest {
    @Test
    public void testGenerate() {
        new PascalsTriangle().generate(1);
        new PascalsTriangle().generate(2);
        new PascalsTriangle().generate(5);
    }

}
