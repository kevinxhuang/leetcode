package com.leetcode.algorithms;


import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.testng.Assert.assertEquals;

public class LetterCombinationsOfAPhoneNumberTest {
    @Test
    public void testLetterCombinations() {
        assertEquals(new LetterCombinationsOfAPhoneNumber().letterCombinations(""), Collections.EMPTY_LIST);
        assertEquals(new LetterCombinationsOfAPhoneNumber().letterCombinations("1"), Collections.EMPTY_LIST);
        assertEquals(new LetterCombinationsOfAPhoneNumber().letterCombinations("2"), Arrays.asList("a", "b", "c"));
        assertEquals(new LetterCombinationsOfAPhoneNumber().letterCombinations("3"), Arrays.asList("d", "e", "f"));
        assertEquals(new LetterCombinationsOfAPhoneNumber().letterCombinations("4"), Arrays.asList("g", "h", "i"));
        assertEquals(new LetterCombinationsOfAPhoneNumber().letterCombinations("5"), Arrays.asList("j", "k", "l"));
        assertEquals(new LetterCombinationsOfAPhoneNumber().letterCombinations("6"), Arrays.asList("m", "n", "o"));
        assertEquals(new LetterCombinationsOfAPhoneNumber().letterCombinations("7"), Arrays.asList("p", "q", "r", "s"));
        assertEquals(new LetterCombinationsOfAPhoneNumber().letterCombinations("8"), Arrays.asList("t", "u", "v"));
        assertEquals(new LetterCombinationsOfAPhoneNumber().letterCombinations("9"), Arrays.asList("w", "x", "y", "z"));
        assertEquals(new LetterCombinationsOfAPhoneNumber().letterCombinations("0"), Arrays.asList(" "));
        assertEquals(new LetterCombinationsOfAPhoneNumber().letterCombinations("23"), Arrays.asList("cd", "bd", "ce", "ad", "be", "cf", "ae", "bf", "af"));
        assertEquals(new LetterCombinationsOfAPhoneNumber().letterCombinations("312"), Collections.EMPTY_LIST);
        assertEquals(new LetterCombinationsOfAPhoneNumber().letterCombinations("1234567890"), Collections.EMPTY_LIST);
        assertEquals(new LetterCombinationsOfAPhoneNumber().letterCombinations("11111"), Collections.EMPTY_LIST);
        assertEquals(new LetterCombinationsOfAPhoneNumber().letterCombinations("211112"), Collections.EMPTY_LIST);
    }
}
