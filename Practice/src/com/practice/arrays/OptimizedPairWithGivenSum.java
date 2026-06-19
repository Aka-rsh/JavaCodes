package com.practice.arrays;

import java.util.HashSet;

public class OptimizedPairWithGivenSum {

    public static void findPairs(int[] arr, int target) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            if (set.contains(complement)) {
                System.out.println(complement + " + " + num + " = " + target);
            }

            set.add(num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8};
        int target = 7;

        findPairs(arr, target);
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/
