package com.practice.arrays;

import java.util.HashMap;

public class OptimizedNthUniqueCharacter {

    public static void main(String[] args) {
        String str = "programming";
        int n = 3;

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = 0;

        // Find nth unique character
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                count++;
                if (count == n) {
                    System.out.println("Nth unique character: " + ch);
                    return;
                }
            }
        }

        System.out.println("Not enough unique characters");
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/
