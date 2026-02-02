package com.practice.string;

public class ConsecutiveCharacterCounter {
    public static void main(String[] args) {
        String s = "aaabbccaa";
        int cnt = 1; // start counting from first character
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length - 1; i++) { // loop till second-last element
            if (ch[i] == ch[i + 1]) {
                cnt++;
            } else {
                System.out.println(ch[i] + " " + cnt);
                cnt = 1; // reset counter for new character
            }
        }

        // Print the last character and its count
        System.out.println(ch[ch.length - 1] + " " + cnt);
    }
}
