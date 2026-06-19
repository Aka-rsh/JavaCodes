package com.practice.arrays;

import java.util.HashMap;

public class OptimizedMostRepeatedElement {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 3, 5, 4, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        int element = -1;

        // Find max frequency element
        for (int num : map.keySet()) {
            if (map.get(num) > maxCount) {
                maxCount = map.get(num);
                element = num;
            }
        }

        System.out.println("Most repeated element: " + element);
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/
