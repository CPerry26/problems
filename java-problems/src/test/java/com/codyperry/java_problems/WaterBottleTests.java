package com.codyperry.java_problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class WaterBottleTests {
    private final WaterBottles waterBottles = new WaterBottles();

    @Test
    @Order(1)
    void testHalfBottles() {
        int maxBottles = waterBottles.maxBottlesDrunk(13, 6);
        assertEquals(maxBottles, 15);
    }

    @Test
    @Order(2)
    void testUnevenBottles() {
        int maxBottles = waterBottles.maxBottlesDrunk(10, 3);
        assertEquals(maxBottles, 13);
    }
}
