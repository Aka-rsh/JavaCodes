package com.practice.arrays;

public class PairWithGivenSum {

    public static void findPairs(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8};
        int target = 7;

        findPairs(arr, target);
    }
}

/*
Time Complexity: O(n^2)
Space Complexity: O(1)
*/
