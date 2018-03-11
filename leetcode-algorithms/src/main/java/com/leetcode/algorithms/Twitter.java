package com.leetcode.algorithms;

import java.util.*;

/**
  */
public class Twitter {
    private final Set<Integer> users;
    private final Map<Integer, Set<Integer>> links;
    private final Map<Integer, Integer> orderTable;
    private final Map<Integer, Set<Integer>> userToTweets;

    /** Initialize your data structure here. */
    public Twitter() {
        users = new HashSet<>();
        links = new HashMap<>();
        orderTable = new HashMap<>();
        userToTweets = new HashMap<>();
    }

    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        ensureUserExists(userId);
        orderTable.put(tweetId, orderTable.size() + 1);
        userToTweets.get(userId).add(tweetId);
    }

    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        if (!users.contains(userId)) {
            return Collections.EMPTY_LIST;
        }

        Set<Integer> recentTweets = new TreeSet<>((tweetId1, tweetId2) -> orderTable.get(tweetId2) - orderTable.get(tweetId1));

        recentTweets.addAll(userToTweets.get(userId));
        for(int followeeId : links.get(userId)) {
            recentTweets.addAll(userToTweets.get(followeeId));
        }

        return new ArrayList(recentTweets).subList(0, Math.min(recentTweets.size(), 10));
    }

    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        ensureUserExists(followerId);
        ensureUserExists(followeeId);
        links.get(followerId).add(followeeId);
    }

    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        ensureUserExists(followerId);
        ensureUserExists(followeeId);
        links.get(followerId).remove(followeeId);
    }

    private void ensureUserExists(int userId) {
        if (!users.contains(userId)) {
            users.add(userId);
            links.put(userId, new HashSet<>());
            userToTweets.put(userId, new HashSet<>());
        }
    }
}
