package com.practice.arrays;

public class CheckArraySorted {

    public static String isSorted(int[] arr) {
        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < arr[i - 1]) {
                isAscending = false;
            }

            if (arr[i] > arr[i - 1]) {
                isDescending = false;
            }
        }

        if (isAscending) return "Ascending";
        if (isDescending) return "Descending";
        return "Not Sorted";
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Array is: " + isSorted(arr));
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)
*/