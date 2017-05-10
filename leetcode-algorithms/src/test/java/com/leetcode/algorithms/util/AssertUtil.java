package com.leetcode.algorithms.util;

import java.util.Iterator;
import java.util.List;
import static org.testng.Assert.*;

public class AssertUtil {
    public static <T> void compareList(List<T> list1, List<T> list2) {
        if (list1 == null || list2 == null) {
            assertEquals(list1, list2);
        }
        assertEquals(list1.size(), list2.size());
        Iterator iter1 = list1.iterator();
        Iterator iter2 = list2.iterator();
        while(iter1.hasNext() && iter2.hasNext()) {
            assertEquals(iter1.next(), iter2.next());
        }
    }
}
