package com.practice.string;

public class ValidPalindrome {

    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                // Try skipping left or skipping right
                return isPalindrome(s, left + 1, right) ||
                       isPalindrome(s, left, right - 1);
            }

            left++;
            right--;
        }

        return true;
    }

    // Helper function to check palindrome in a range
    private boolean isPalindrome(String s, int i, int j) {

        while (i < j) {

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    // Main method for Eclipse
    public static void main(String[] args) {

        ValidPalindrome obj = new ValidPalindrome();

        String s = "abca";

        boolean result = obj.validPalindrome(s);

        System.out.println("Is valid palindrome (with at most one deletion)? " + result);
    }
}
