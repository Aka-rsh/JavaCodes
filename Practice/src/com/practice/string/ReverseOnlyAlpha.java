package com.practice.string;

public class ReverseOnlyAlpha {
    public static void main(String[] args) {
        String input = "A56GH7W#Jj";
        String result = reverseOnlyAlpha(input);
        System.out.println(result);
    }

    public static String reverseOnlyAlpha(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (!isAlpha(arr[left])) {
                left++;
            } else if (!isAlpha(arr[right])) {
                right--;
            } else {
                // Swap letters
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return new String(arr);
    }

    // Check if character is a letter (without using Character.isLetter)
    public static boolean isAlpha(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
}
