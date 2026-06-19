package com.practice.arrays;

import java.util.Arrays;

public class MergeSortedArrays {

    public static int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int[] merged = new int[n + m];
        int i = 0, j = 0, k = 0;

        // Two-pointer merge
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements
        while (i < n) merged[k++] = arr1[i++];
        while (j < m) merged[k++] = arr2[j++];

        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 9};
        int[] merged = merge(arr1, arr2);
        System.out.println("Merged array: " + Arrays.toString(merged));
    }
}

// Time Complexity: O(n + m) → each element visited once
// Space Complexity: O(n + m) → merged array


//Brute Force 

//import java.util.Arrays;
//
//public class MergeSortedArrays {
//
//    public static int[] merge(int[] arr1, int[] arr2) {
//        int[] merged = new int[arr1.length + arr2.length];
//        int index = 0;
//        for (int num : arr1) merged[index++] = num;
//        for (int num : arr2) merged[index++] = num;
//        return merged;
//    }
//
//    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 3};
//        int[] arr2 = {4, 5};
//        int[] merged = merge(arr1, arr2);
//        System.out.println("Merged array: " + Arrays.toString(merged));
//    }
//}
//
//// Time Complexity: O(n + m) where n = arr1.length, m = arr2.length
//// Space Complexity: O(n + m)