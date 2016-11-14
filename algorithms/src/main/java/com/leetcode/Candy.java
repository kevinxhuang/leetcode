package com.leetcode;

import java.util.*;

/**
 * https://leetcode.com/problems/candy/
 */
public class Candy {
    public int candy(int[] ratings) {
        if (ratings.length == 1) {
            return 1;
        }

        List<Child> children = new LinkedList<>();
        for(int i = 0; i < ratings.length; i++) {
            children.add(new Child(i, ratings[i]));
        }
        Collections.sort(children);

        int[] candies = new int[ratings.length];

        for (Child child : children) {
            int candy = 1;
            if ((child.getIndex() - 1) >= 0 && candies[child.getIndex() - 1] != 0) {
                candy = ratings[child.getIndex()] > ratings[child.getIndex() - 1] ? candies[child.getIndex() - 1] + 1: 1;
            }

            if ((child.getIndex() + 1) < children.size() && candies[child.getIndex() + 1] != 0) {
                candy = Math.max(candy, ratings[child.getIndex()] > ratings[child.getIndex() + 1] ? candies[child.getIndex() + 1] + 1: 1);
            }
            candies[child.getIndex()] = candy;
        }

        return sum(candies);
    }

    private int sum(final int[] nums) {
        int sum = 0;

        for(int num : nums) {
            sum += num;
        }

        return sum;
    }

    class Child implements Comparable<Child> {
        private final int index;
        private final int rating;

        public Child(int index, int rating) {
            this.index = index;
            this.rating = rating;
        }

        public int getIndex() {
            return index;
        }

        public int getRating() {
            return rating;
        }

        @Override
        public int compareTo(Child child) {
            return this.rating - child.rating;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Candy().candy(new int[]{2, 1, 3, 2, 1, 4, 3})); // 12
        System.out.println(new Candy().candy(new int[]{0})); // 1
        System.out.println(new Candy().candy(new int[]{1, 1, 1})); // 3
        System.out.println(new Candy().candy(new int[]{1, 2, 1})); // 4
        System.out.println(new Candy().candy(new int[]{2, 1, 2})); // 5
        System.out.println(new Candy().candy(new int[]{1, 2, 2})); // 4
        System.out.println(new Candy().candy(new int[]{2, 2, 1})); // 4
    }
}
