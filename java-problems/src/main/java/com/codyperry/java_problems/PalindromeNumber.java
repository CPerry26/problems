package com.codyperry.java_problems;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String xString = String.valueOf(x);
        char[] charArray = xString.toCharArray();

        int length = charArray.length - 1;
        for(int idx = 0; idx < charArray.length; idx++) {
            char currentChar = charArray[idx];
            char oppositeChar = charArray[length - idx];

            if (currentChar != oppositeChar) {
                return false;
            }
        }

        return true;
    }
}
