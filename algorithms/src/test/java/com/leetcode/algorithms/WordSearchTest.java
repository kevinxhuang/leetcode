package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class WordSearchTest {
    @Test
    public void testExist() {
        char[][] board1 = new char[][]{
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};
        assertTrue(new WordSearch().exist(board1, "ABCCED"));
        assertTrue(new WordSearch().exist(board1, "SEE"));
        assertFalse(new WordSearch().exist(board1, "ABCB"));

        char[][] board2 = new char[][]{{'a','a'}};
        assertFalse(new WordSearch().exist(board2, "aaa"));
    }
}
