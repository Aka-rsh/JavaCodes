package com.practice.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencySort {

    public String frequencySort(String s) {

        int n = s.length();

        Map<Character, Integer> map = new HashMap<>();

        // Count frequency of characters
        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Store characters in list
        List<Character> keys = new ArrayList<>(map.keySet());

        // Sort by frequency in descending order
        Collections.sort(keys, (a, b) -> map.get(b) - map.get(a));

        // Build final string
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < keys.size(); i++) {

            char key = keys.get(i);
            int freq = map.get(key);

            for (int j = 0; j < freq; j++) {
                sb.append(key);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        FrequencySort obj = new FrequencySort();

        String input = "tree";

        String result = obj.frequencySort(input);

        System.out.println("Sorted String: " + result);
    }
}
