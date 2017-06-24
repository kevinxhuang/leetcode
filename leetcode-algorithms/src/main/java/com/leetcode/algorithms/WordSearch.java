package com.leetcode.algorithms;

/**
 * https://leetcode.com/problems/word-search
 */
public class WordSearch {
    private final int NUM_DIRECTIONS = 4;
    private final int[] X_DIRECTIONS = new int[] {-1, 1, 0, 0};
    private final int[] Y_DIRECTIONS = new int[] {0, 0, -1, 1};

    public boolean exist(char[][] board, String word) {
        if (word == null || word.length() == 0 || board == null || board.length == 0) {
            return false;
        }

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean[][] used = new boolean[board.length][board[0].length];
                    used[i][j] = true;
                    boolean match = search(board, i, j, word.substring(1), used);
                    if (match) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private boolean search(char[][] board, int startX, int startY, String word, boolean used[][]) {
        if (word.length() == 0) {
            return true;
        }

        for(int i = 0; i < NUM_DIRECTIONS; i++) {
            int x = startX + X_DIRECTIONS[i];
            int y = startY + Y_DIRECTIONS[i];

            if (x >= 0 && x < board.length && y >=0 && y < board[x].length && board[x][y] == word.charAt(0) && !used[x][y]) {
                used[x][y] = true;
                boolean match = search(board, x, y, word.substring(1), used);
                if(match) {
                    return true;
                } else {
                    used[x][y] = false;
                }
            }
        }

        return false;
    }
}
