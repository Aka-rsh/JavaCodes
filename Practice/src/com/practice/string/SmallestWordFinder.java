package com.practice.string;

public class SmallestWordFinder {
    public static void main(String[] args) {
        String s = "I love Programming"; // your input string
        String[] words = s.split(" ");
        
        // Initialize smallest with the first word (safer than "")
        String smallest = words[0];

        for (String word : words) {
            if (word.length() < smallest.length()) {
                smallest = word;
            }
        }

        System.out.println("Smallest word: " + smallest);
    }
}
