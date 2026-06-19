package com.practice.arrays;

public class SortArrayDescending {

    // Method to sort array in descending order
    public static void sortDescending(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {
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

        sortDescending(arr);

        System.out.println("Array in descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*
Time Complexity: O(n^2)
Space Complexity: O(1)
*/
