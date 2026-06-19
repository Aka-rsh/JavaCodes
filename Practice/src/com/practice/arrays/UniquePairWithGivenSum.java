package com.practice.arrays;

import java.util.Arrays;

public class UniquePairWithGivenSum {

    public static void findPairs(int[] arr, int target) {

        Arrays.sort(arr); // Step 1: sort array

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(arr[left] + " + " + arr[right] + " = " + target);

                // Skip duplicates
                int leftVal = arr[left];
                int rightVal = arr[right];

                while (left < right && arr[left] == leftVal) left++;
                while (left < right && arr[right] == rightVal) right--;

            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8, 3, 2};
        int target = 7;

        findPairs(arr, target);
    }
}

/*
Time Complexity: O(n log n)  // sorting
Space Complexity: O(1)
*/
