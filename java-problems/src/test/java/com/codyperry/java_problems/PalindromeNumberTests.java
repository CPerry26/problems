package com.codyperry.java_problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PalindromeNumberTests {
    private final PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    @Order(1)
    void testThreeDigit() {
        boolean isPalindrome = palindromeNumber.isPalindrome(121);
        assertEquals(isPalindrome, true);
    }

    @Test
    @Order(2)
    void testNegativeNumber() {
        boolean isPalindrome = palindromeNumber.isPalindrome(-121);
        assertEquals(isPalindrome, false);
    }

    @Test
    @Order(3)
    void testSmallNumber() {
        boolean isPalindrome = palindromeNumber.isPalindrome(10);
        assertEquals(isPalindrome, false);
    }
}
