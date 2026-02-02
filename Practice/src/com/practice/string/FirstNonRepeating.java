package com.practice.string;

public class FirstNonRepeating {
    public static Character firstNonRepeating(String s) {
        int[] freq = new int[256]; 

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        for (char c : s.toCharArray()) {
            if (freq[c] == 1) {
                return c;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("The First Non Repeating Character is :- "+firstNonRepeating("swiss")); 
    }
}

//import java.util.LinkedHashMap;
//import java.util.Map;
//
//public class FirstNonRepeating {
//    public static Character firstNonRepeating(String s) {
//        Map<Character, Integer> map = new LinkedHashMap<>();
//
//        for (char c : s.toCharArray()) {
////            map.put(c, map.getOrDefault(c, 0) + 1);
//        	if (map.containsKey(c)) {
//        	    map.put(c, map.get(c) + 1);
//        	} else {
//        	    map.put(c, 1);
//        	}
//
//        }
//
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            if (entry.getValue() == 1) {
//                return entry.getKey();
//            }
//        }
//        return null;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("The First Non Repeating Character is :- "+firstNonRepeating("swiss")); // w
//    }
//}
