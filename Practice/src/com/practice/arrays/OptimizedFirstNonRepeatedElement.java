package com.practice.arrays;

import java.util.HashMap;

public class OptimizedFirstNonRepeatedElement {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 3, 5, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find first non-repeated element
        for (int num : arr) {
            if (map.get(num) == 1) {
                System.out.println("First non-repeated element: " + num);
                return;
            }
        }

        System.out.println("No non-repeated element found");
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/