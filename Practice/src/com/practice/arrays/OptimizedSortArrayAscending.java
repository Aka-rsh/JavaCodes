package com.practice.arrays;

import java.util.Arrays;

public class OptimizedSortArrayAscending {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};

        Arrays.sort(arr);

        System.out.println("Array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*
Time Complexity: O(n log n)
Space Complexity: O(1)
*/
