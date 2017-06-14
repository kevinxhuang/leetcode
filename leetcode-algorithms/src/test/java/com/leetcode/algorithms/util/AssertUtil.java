package com.leetcode.algorithms.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import static org.testng.Assert.*;

public class AssertUtil {
    public static <T extends Comparable> void compareList(List<T> list1, List<T> list2) {
        if (list1 == null || list2 == null) {
            assertEquals(list1, list2);
        }
        assertEquals(list1.size(), list2.size());

        Collections.sort(list1);
        Collections.sort(list2);
        Iterator iter1 = list1.iterator();
        Iterator iter2 = list2.iterator();
        while(iter1.hasNext() && iter2.hasNext()) {
            assertEquals(iter1.next(), iter2.next());
        }
    }

    public static <T extends Comparable> void compareArrays(T[] array1, T[] array2) {
        if (array1 == null || array2 == null) {
            assertEquals(array1, array2);
        }
        assertEquals(array1.length, array2.length);

        Arrays.sort(array1);
        Arrays.sort(array2);
        for(int i = 0; i < array1.length; i++) {
            assertEquals(array1[i], array2[i]);
        }
    }
}
