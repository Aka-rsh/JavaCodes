package com.practice.arrays;

public class OptimizedRotateArrayLeft {

    // Method to reverse array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Method to rotate left by k
    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        // Step 1
        reverse(arr, 0, k - 1);

        // Step 2
        reverse(arr, k, n - 1);

        // Step 3
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        rotateLeft(arr, k);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)
*/
