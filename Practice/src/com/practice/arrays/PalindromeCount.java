package com.practice.arrays;

public class PalindromeCount {

    public static boolean isPalindrome(int n) {
        int original = n, reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        int[] arr = {121, 34, 55, 11, 202};
        int count = 0;
        for (int num : arr) {
            if (isPalindrome(num)) count++;
        }
        System.out.println("Palindrome count: " + count);
    }
}

// Time Complexity: O(n * d) where d = number of digits in largest number
// Space Complexity: O(1)



// Into more Optimal way 

//package com.practice.arrays;
//
//public class PalindromeCount {
//
//    public static boolean isPalindrome(int n) {
//        String s = Integer.toString(n);
//        int left = 0, right = s.length() - 1;
//        while (left < right) {
//            if (s.charAt(left) != s.charAt(right)) return false;
//            left++;
//            right--;
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {121, 34, 55, 11, 202};
//        int count = 0;
//        for (int num : arr) {
//            if (isPalindrome(num)) count++;
//        }
//        System.out.println("Palindrome count: " + count);
//    }
//}
//
//// Time Complexity: O(n * d) → n = array length, d = digits in largest number
//// Space Complexity: O(d) → for string conversion per number