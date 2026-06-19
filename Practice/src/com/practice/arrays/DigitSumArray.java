package com.practice.arrays;

import java.util.Arrays;

public class DigitSumArray {

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 56};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sumOfDigits(arr[i]);
        }
        System.out.println("Array with digit sums: " + Arrays.toString(arr));
    }
}

// Time Complexity: O(n * d) where d = number of digits in largest number
// Space Complexity: O(1)