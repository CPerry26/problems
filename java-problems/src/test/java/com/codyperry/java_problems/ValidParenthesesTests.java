package com.codyperry.java_problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ValidParenthesesTests {
    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    @Order(1)
    void testHappyPath() {
        boolean isValid = validParentheses.isValid("()");
        assertEquals(isValid, true);
    }

    @Test
    @Order(2)
    void testMixedBrackets() {
        boolean isValid = validParentheses.isValid("()[]{}");
        assertEquals(isValid, true);
    }

    @Test
    @Order(3)
    void testIncompleteParens() {
        boolean isValid = validParentheses.isValid("(]");
        assertEquals(isValid, false);
    }

    @Test
    @Order(4)
    void testNestedParens() {
        boolean isValid = validParentheses.isValid("([])");
        assertEquals(isValid, true);
    }

    @Test
    @Order(5)
    void testSwappedParens() {
        boolean isValid = validParentheses.isValid("([)]");
        assertEquals(isValid, false);
    }

    @Test
    @Order(6)
    void testMixedIncompleteParens() {
        boolean isValid = validParentheses.isValid("()[]}{");
        assertEquals(isValid, false);
    }
}
