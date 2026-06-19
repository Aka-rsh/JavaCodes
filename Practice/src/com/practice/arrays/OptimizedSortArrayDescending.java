package com.practice.arrays;

import java.util.Arrays;
import java.util.Collections;

public class OptimizedSortArrayDescending {

    public static void main(String[] args) {
        Integer[] arr = {5, 2, 9, 1, 7};

        // Sort in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Array in descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*
Time Complexity: O(n log n)
Space Complexity: O(1)
*/
