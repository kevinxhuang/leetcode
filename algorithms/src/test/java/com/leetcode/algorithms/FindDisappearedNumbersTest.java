package com.leetcode.algorithms;


import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.testng.Assert.assertEquals;

public class FindDisappearedNumbersTest {
    @Test
    public void testFindDisappearedNumbers() {
        assertEquals(new FindDisappearedNumbers().findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}), Arrays.asList(5, 6));
        assertEquals(new FindDisappearedNumbers().findDisappearedNumbers(new int[]{4,3,2,2}), Arrays.asList(1));
        assertEquals(new FindDisappearedNumbers().findDisappearedNumbers(new int[]{1,2}), Collections.EMPTY_LIST);
    }
}
