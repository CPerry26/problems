package com.codyperry.java_problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TwoSumTests {
    private final TwoSum twoSum = new TwoSum();

    @Test
    @Order(1)
    void testCaseOne() {
        int[] nums = { 2, 7, 11, 15 };
        int[] indices = twoSum.twoSum(nums, 9);
        assertEquals(indices.length, 2);
        assertEquals(indices[0], 0);
        assertEquals(indices[1], 1);
    }

    @Test
    @Order(2)
    void testCaseTwo() {
        int[] nums = { 3, 2, 4 };
        int[] indices = twoSum.twoSum(nums, 6);
        assertEquals(indices.length, 2);
        assertEquals(indices[0], 1);
        assertEquals(indices[1], 2);
    }

    @Test
    @Order(3)
    void testCaseThree() {
        int[] nums = { 3, 3 };
        int[] indices = twoSum.twoSum(nums, 6);
        assertEquals(indices.length, 2);
        assertEquals(indices[0], 0);
        assertEquals(indices[1], 1);
    }
}
