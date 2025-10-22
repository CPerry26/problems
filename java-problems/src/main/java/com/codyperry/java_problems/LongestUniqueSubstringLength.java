package com.codyperry.java_problems;

import java.util.HashMap;
import java.util.Map;

public class LongestUniqueSubstringLength {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> charOccurrences = new HashMap<>();

        int maxSubstring = 1;
        int startPos = 0;
        int endPos = 0;

        // Use two pointers to loop through the String and find the length of the longest substring.
        // The pointers start at the same value, and the indexes are +1 their current location to
        // indicate that the next substring starts without the duplicate (i.e. +1 from the duplicate
        // location).
        while (endPos < s.length()) {
            Character currChar = s.charAt(endPos);

            // We found a duplicate, calculate the new start position from taking the max
            // of the last seen index of the current char and the existing start position.
            // For example, for string "dvdf", if we are at index 2, our start position will get set to
            // the max of index (1,0), which sets it to 1, pointing at v.
            if (charOccurrences.containsKey(currChar)) {
                startPos = Math.max(charOccurrences.get(currChar), startPos);
            }

            // Compute the max from the previous max and the current substring with no duplicates.
            maxSubstring = Math.max(maxSubstring, endPos - startPos + 1);

            // Set the last seen index for the current char to +1 the current end since we don't want to include
            // a duplicate.
            charOccurrences.put(currChar, endPos + 1);
            endPos++;
        }

        return maxSubstring;
    }
}
