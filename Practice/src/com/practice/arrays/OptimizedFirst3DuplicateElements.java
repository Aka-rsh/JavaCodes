package com.practice.arrays;

import java.util.HashMap;

public class OptimizedFirst3DuplicateElements {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 3, 5, 4, 6, 3};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        // Print first 3 duplicates
        for (int num : arr) {
            if (map.get(num) > 1) {
                System.out.println(num);
                map.put(num, 0); // avoid printing again
                count++;
            }

            if (count == 3) break;
        }
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/
