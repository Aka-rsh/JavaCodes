package com.practice.arrays;

import java.util.HashSet;

public class OptimizedFindDuplicateElements {

    public static void findDuplicates(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }

        for (int num : duplicates) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 3, 5, 4};

        findDuplicates(arr);
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/