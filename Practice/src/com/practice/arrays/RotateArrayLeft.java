package com.practice.arrays;

public class RotateArrayLeft {

    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        for (int i = 0; i < k; i++) {
            int first = arr[0];

            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }

            arr[n - 1] = first;
        }
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
Time Complexity: O(n * k)
Space Complexity: O(1)
*/