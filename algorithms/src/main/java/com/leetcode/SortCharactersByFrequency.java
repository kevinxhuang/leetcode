package com.leetcode;

import java.util.*;

/**
 * https://leetcode.com/problems/sort-characters-by-frequency/
 */
public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        Map<Character, Integer> charsMap = new HashMap<>();
        for(Character c: s.toCharArray()) {
            if(charsMap.containsKey(c)) {
                charsMap.put(c, charsMap.get(c) + 1);
            } else {
                charsMap.put(c, 1);
            }
        }

        Set<Character> sortedSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int char1Frequency = charsMap.get((Character) o1);
                int char2Frequency = charsMap.get((Character) o2);
                if (char1Frequency == char2Frequency) {
                    return ((Character) o2).compareTo((Character) o1);
                } else {
                    return char2Frequency - char1Frequency;
                }
            }
        });

        sortedSet.addAll(charsMap.keySet());

        StringBuilder sb = new StringBuilder();
        for(Character c : sortedSet) {
            for(int i = 0; i < charsMap.get(c); i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new SortCharactersByFrequency().frequencySort("tree"));
        System.out.println(new SortCharactersByFrequency().frequencySort("cccaaa"));
        System.out.println(new SortCharactersByFrequency().frequencySort("Aabb"));
    }
}
