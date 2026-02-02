package com.practice.string;

public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        String s = "hello hi bye How are you";
        int[] arr = new int[128];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {  // skip spaces
                arr[ch]++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println((char)i + " -> " + arr[i]);
            }
        }
    }
}
