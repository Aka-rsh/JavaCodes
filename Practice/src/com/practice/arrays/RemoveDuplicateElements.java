package com.practice.arrays;

import java.util.HashSet;

public class RemoveDuplicateElements {

    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int i = 0;

        for (int num : set) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        int[] result = removeDuplicates(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/
