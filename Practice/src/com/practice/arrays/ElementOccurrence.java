package com.practice.arrays;

public class ElementOccurrence {

    public static int countOccurrence(int[] arr, int target) {
        int count = 0;
        for (int num : arr) if (num == target) count++;
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 4};
        int target = 2;
        System.out.println("Occurrence of " + target + ": " + countOccurrence(arr, target));
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)