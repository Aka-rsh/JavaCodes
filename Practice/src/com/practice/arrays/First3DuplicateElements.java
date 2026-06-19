package com.practice.arrays;

public class First3DuplicateElements {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 3, 5, 4, 6, 3};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            // Check if already counted before
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) continue;

            // Count occurrences
            int freq = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                }
            }

            if (freq > 1) {
                System.out.println(arr[i]);
                count++;
            }

            if (count == 3) break;
        }
    }
}

/*
Time Complexity: O(n^2)
Space Complexity: O(1)
*/
