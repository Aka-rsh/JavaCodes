package com.practice.sorting;

import java.util.Arrays;

public class BubbleSort {

    // Optimized Bubble Sort
    static int[] bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop: for each pass
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // Track if any swap happens in this pass

            // Inner loop: compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true; // Swap happened
                }
            }

            // If no swaps occurred, array is already sorted
            if (!swapped) {
                break;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println("Original Array: " + Arrays.toString(arr));

        int[] sortedArr = bubbleSort(arr);

        System.out.println("Sorted Array:   " + Arrays.toString(sortedArr));
    }
}
