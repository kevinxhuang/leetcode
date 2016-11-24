package com.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * https://leetcode.com/problems/flatten-nested-list-iterator/
 */
interface NestedInteger {
    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return null if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}

class NestedIterator implements Iterator<Integer> {

    private List<Integer> flattenList;
    private int cursor;
    private int length;

    public NestedIterator(List<NestedInteger> nestedList) {
        flattenList = flat(nestedList);
        cursor = 0;
        length = flattenList.size();
    }

    @Override
    public Integer next() {
        return flattenList.get(cursor++);
    }

    @Override
    public boolean hasNext() {
        return cursor < length;
    }

    private List<Integer> flat(List<NestedInteger> nestedList) {
        List<Integer> integers = new ArrayList();

        for(NestedInteger nestedInteger: nestedList) {
            if (nestedInteger.isInteger()) {
                integers.add(nestedInteger.getInteger());
            } else {
                integers.addAll(flat(nestedInteger.getList()));
            }
        }

        return integers;
    }
}
