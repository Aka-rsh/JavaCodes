package com.practice.arrays;

public class MergeSortedArrayZigZag {

    public static void zigzagMerge(int[] arr1, int[] arr2) {
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            System.out.print(arr1[i++] + " ");
            System.out.print(arr2[j++] + " ");
        }

        // Remaining elements
        while (i < arr1.length) {
            System.out.print(arr1[i++] + " ");
        }

        while (j < arr2.length) {
            System.out.print(arr2[j++] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6};

        zigzagMerge(arr1, arr2);
    }
}

/*
Time Complexity: O(n + m)
Space Complexity: O(1)
*/
