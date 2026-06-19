package com.practice.arrays;

public class CheckDescendingOrder {

    public static boolean isDescending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {9, 7, 5, 3, 1};

        System.out.println(isDescending(arr) ? "Descending" : "Not Descending");
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)
*/
