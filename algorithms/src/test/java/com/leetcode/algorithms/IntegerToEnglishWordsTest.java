package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class IntegerToEnglishWordsTest {
    @Test
    public void testNumberToWords() {
        assertEquals(new IntegerToEnglishWords().numberToWords(123), "One Hundred Twenty Three");
        assertEquals(new IntegerToEnglishWords().numberToWords(12345), "Twelve Thousand Three Hundred Forty Five");
        assertEquals(new IntegerToEnglishWords().numberToWords(1234567), "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven");
        assertEquals(new IntegerToEnglishWords().numberToWords(1), "One");
        assertEquals(new IntegerToEnglishWords().numberToWords(10), "Ten");
        assertEquals(new IntegerToEnglishWords().numberToWords(100), "One Hundred");
        assertEquals(new IntegerToEnglishWords().numberToWords(1000), "One Thousand");
        assertEquals(new IntegerToEnglishWords().numberToWords(10000), "Ten Thousand");
        assertEquals(new IntegerToEnglishWords().numberToWords(100000), "One Hundred Thousand");
        assertEquals(new IntegerToEnglishWords().numberToWords(1000000), "One Million");
        assertEquals(new IntegerToEnglishWords().numberToWords(1000001), "One Million One");
    }
}
