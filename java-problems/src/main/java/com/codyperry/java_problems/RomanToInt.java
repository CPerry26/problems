package com.codyperry.java_problems;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public int romanToInt(String s) {
        Map<String, Integer> numeralMap = new HashMap<>();
        numeralMap.put(String.valueOf("I"), Integer.valueOf(1));
        numeralMap.put(String.valueOf("V"), Integer.valueOf(5));
        numeralMap.put(String.valueOf("X"), Integer.valueOf(10));
        numeralMap.put(String.valueOf("L"), Integer.valueOf(50));
        numeralMap.put(String.valueOf("C"), Integer.valueOf(100));
        numeralMap.put(String.valueOf("D"), Integer.valueOf(500));
        numeralMap.put(String.valueOf("M"), Integer.valueOf(1000));
        numeralMap.put(String.valueOf("IV"), Integer.valueOf(4));
        numeralMap.put(String.valueOf("IX"), Integer.valueOf(9));
        numeralMap.put(String.valueOf("XL"), Integer.valueOf(40));
        numeralMap.put(String.valueOf("XC"), Integer.valueOf(90));
        numeralMap.put(String.valueOf("CD"), Integer.valueOf(400));
        numeralMap.put(String.valueOf("CM"), Integer.valueOf(900));

        char[] charArray = s.toCharArray();
        int value = 0;
        int idx = 0;

        while (idx < charArray.length) {
            Integer comboValue = null;
            if (idx != charArray.length - 1) {
                comboValue = numeralMap.get(String.valueOf(charArray[idx]) + String.valueOf(charArray[idx + 1]));
            }

            if (comboValue != null) {
                value += comboValue;
                idx += 2;
            } else {
                value += numeralMap.get(String.valueOf(charArray[idx]));
                idx++;
            }
        }

        return value;
    }
}
