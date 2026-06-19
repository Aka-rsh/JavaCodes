package com.practice.string;

public class SumOfNumbers {
    public static void main(String[] args) {
        String str = "hi221bye8405helllo45";

        int sum = 0;
        int num = 0; // to build numbers directly

        // Time Complexity: O(n)
        // We traverse the string once, where n = length of the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                // O(1) operation
                // build number mathematically
                num = num * 10 + (c - '0');
            } else {
                // O(1) operation
                // add number when non-digit appears
                sum += num;
                num = 0; // reset
            }
        }

        // O(1) operation
        // add last number if string ends with digit
        sum += num;

        System.out.println("Sum of numbers = " + sum);
    }
}

/*
Overall Complexity:

Time Complexity: O(n)
- Single pass through the string
- Each character is processed once

Space Complexity: O(1)
- No extra space used (only variables sum and num)
- Does not depend on input size
*/