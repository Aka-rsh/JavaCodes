package com.practice.arrays;

public class SortArrayAscending {

    // Method to sort array in ascending order
    public static void sortAscending(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};

        sortAscending(arr);

        System.out.println("Array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*
Time Complexity: O(n^2)
Space Complexity: O(1)
*/