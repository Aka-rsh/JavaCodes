package com.practice.string;

public class StringHalfManipulator {
    public static void main(String[] args) {
        String s = "Hello";
        String ans = "";
        int n = s.length() / 2;

        // First half
        for (int i = 0; i < n; i++) {
            ans = ans + s.charAt(i);
        }

        // Second half (reversed)
        for (int j = s.length() - 1; j >= n; j--) {
            ans = ans + s.charAt(j);
        }

        System.out.println("Result: " + ans);
    }
}

