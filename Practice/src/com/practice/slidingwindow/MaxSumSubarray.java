package com.practice.slidingwindow;

public class MaxSumSubarray {
    public static int maxSumSubarray(int[] arr, int N, int K) {
        // Step 1: sum of first K elements
        int windowSum = 0;
        for (int i = 0; i < K; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Step 2: slide the window
        for (int i = K; i < N; i++) {
            windowSum = windowSum - arr[i - K] + arr[i]; // remove left, add right
            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int N = arr.length;
        int K = 2;

        int result = maxSumSubarray(arr, N, K);
        System.out.println("Maximum sum of subarray of size " + K + " is: " + result);
    }
}
