package com.practice.arrays;

public class MissingElement {

    public static int findMissing(int[] arr, int n) {
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int num : arr) sum += num;
        return total - sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int missing = findMissing(arr, 5);
        System.out.println("Missing element: " + missing);
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)