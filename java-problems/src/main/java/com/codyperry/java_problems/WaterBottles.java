package com.codyperry.java_problems;

public class WaterBottles {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        // Step 1. Drink my full bottles, initialize to the correct values.
        int maximumBottles = numBottles;
        int emptyBottles = numBottles;
        int fullBottles = 0;

        while (true) {
            // Step 2. Can we exchange?
            boolean canExchange = (emptyBottles - numExchange >= 0);
            boolean canDrink = fullBottles > 0;

            if (!canDrink && !canExchange) {
                break;
            }

            if (canExchange) {
                fullBottles += 1;
                emptyBottles = emptyBottles - numExchange;
                numExchange++;
            } else {
                maximumBottles += fullBottles;
                emptyBottles += fullBottles;
                fullBottles = 0;
            }
        }

        // Step 4. Return the maximum
        return maximumBottles;
    }
}
