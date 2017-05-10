package com.leetcode.algorithms;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BulbSwitcherTest {

    @Test
    public void testBulbSwitch() {
        assertEquals(new BulbSwitcher().bulbSwitch(1), 1);
        assertEquals(new BulbSwitcher().bulbSwitch(3), 1);
        assertEquals(new BulbSwitcher().bulbSwitch(4), 2);
        assertEquals(new BulbSwitcher().bulbSwitch(5), 2);
        assertEquals(new BulbSwitcher().bulbSwitch(6),2);
        assertEquals(new BulbSwitcher().bulbSwitch(99999), 316);
    }
}
