package com.practice.string;


public class PrintUniqueCharacter {
	
    public static void printUniqueCharacters(String str) {
        // Frequency array for ASCII characters (0–255)
        int[] freq = new int[256];

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }

        System.out.println("Unique Characters:");
        // Print characters that appear exactly once
        for (char ch : str.toCharArray()) {
            if (freq[ch] == 1) {
                System.out.print(ch + " ");
            }
        }
    }

    public static void main(String[] args) {
        String str = "Programming";
        printUniqueCharacters(str);
    }
}
