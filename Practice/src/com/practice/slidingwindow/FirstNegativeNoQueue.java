package com.practice.slidingwindow;

public class FirstNegativeNoQueue {

    static void printFirstNegative(int[] arr, int N, int K) {
        for (int i = 0; i <= N - K; i++) { // loop through each window
            int firstNeg = 0; // default if no negative found

            for (int j = i; j < i + K; j++) { // loop inside the window
                if (arr[j] < 0) {
                    firstNeg = arr[j];
                    break; // found first negative, break
                }
            }

            System.out.print(firstNeg + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {-8, 2, 3, -6, 10};
        int K1 = 2;
        printFirstNegative(arr1, arr1.length, K1); // Output: -8 0 -6 -6

        int[] arr2 = {12, -1, -7, 8, -15, 30, 16, 28};
        int K2 = 3;
        printFirstNegative(arr2, arr2.length, K2); // Output: -1 -1 -7 -15 -15 0
    }
}

