package com.codyperry.java_problems;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> complements = Map.of(
                '(', ')',
                '{', '}',
                '[', ']'
        );

        Stack<Character> seenChars = new Stack<>();
        seenChars.push(s.charAt(0));

        for (int idx = 1; idx < s.length(); idx++) {
            Character currChar = s.charAt(idx);

            if (!complements.containsKey(currChar)) {
                // We found a closing bracket, pop and check.
                if (seenChars.empty() || complements.get(seenChars.pop()) != currChar) {
                    return false;
                }

                continue;
            }

            seenChars.push(s.charAt(idx));
        }

        if (!seenChars.empty()) {
            return false;
        }

        return true;
    }
}
