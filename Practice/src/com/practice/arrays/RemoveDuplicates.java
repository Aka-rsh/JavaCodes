package com.practice.arrays;

import java.util.Arrays;

public class RemoveDuplicates {

    public static int removeSame(int[] arr, int n) {
        if (n == 0) return 0;

        int j = 0;

        for (int i = 1; i < n; i++) {
            if (arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1; // new length
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 67, 34, 2, 4, 2, 1, 4};

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Remove duplicates
        int newLength = removeSame(arr, arr.length);

        // Step 3: Print result
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
