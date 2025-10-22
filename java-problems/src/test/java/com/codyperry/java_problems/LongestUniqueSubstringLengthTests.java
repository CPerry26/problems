package com.codyperry.java_problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LongestUniqueSubstringLengthTests {
    private final LongestUniqueSubstringLength longestUniqueSubstringLength = new LongestUniqueSubstringLength();

    @Test
    @Order(1)
    void testMixedChars() {
        int longestLength = longestUniqueSubstringLength.lengthOfLongestSubstring("abcabcbb");
        assertEquals(longestLength, 3); // abc
    }

    @Test
    @Order(2)
    void testNotUnique() {
        int longestLength = longestUniqueSubstringLength.lengthOfLongestSubstring("bbbbb");
        assertEquals(longestLength, 1); // b
    }

    @Test
    @Order(3)
    void testMiddleDuplicates() {
        int longestLength = longestUniqueSubstringLength.lengthOfLongestSubstring("pwwkew");
        assertEquals(longestLength, 3); // wke
    }

    @Test
    @Order(4)
    void testSubsequentString() {
        int longestLength = longestUniqueSubstringLength.lengthOfLongestSubstring("dvdf");
        assertEquals(longestLength, 3); // vdf
    }
}
