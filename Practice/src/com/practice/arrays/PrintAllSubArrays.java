package com.practice.arrays;

public class PrintAllSubArrays {

    public static void printSubArrays(int[] arr) {
        int n = arr.length;

        for (int start = 0; start < n; start++) {

            for (int end = start; end < n; end++) {

                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }

                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        printSubArrays(arr);
    }
}

/*
Time Complexity: O(n^3)
Space Complexity: O(1)
*/