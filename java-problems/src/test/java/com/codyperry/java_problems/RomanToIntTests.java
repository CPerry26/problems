package com.codyperry.java_problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RomanToIntTests {
    private final RomanToInt romanToInt = new RomanToInt();

    @Test
    @Order(1)
    void testNoCombo() {
        int value = romanToInt.romanToInt("III");
        assertEquals(value, 3);
    }

    @Test
    @Order(2)
    void testSimpleCombo() {
        int value = romanToInt.romanToInt("LVIII");
        assertEquals(value, 58);
    }

    @Test
    @Order(3)
    void testLargeCombo() {
        int value = romanToInt.romanToInt("MCMXCIV");
        assertEquals(value, 1994);
    }
}
