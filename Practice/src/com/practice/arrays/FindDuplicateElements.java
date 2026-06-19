package com.practice.arrays;

public class FindDuplicateElements {

    public static void findDuplicates(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            boolean isVisited = false;

            // Check if already counted
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    isVisited = true;
                    break;
                }
            }

            if (isVisited) continue;

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 3, 5, 4};

        findDuplicates(arr);
    }
}

/*
Time Complexity: O(n^2)
Space Complexity: O(1)
*/
