package com.practice.string;

public class WordLengthFinder {
    public static void main(String[] args) {
        String s = "I love Programming in Java";

        if (s.isEmpty()) {
            System.out.println("The string is empty.");
            return;
        }

        String biggest = "";
        String smallest = null; // will set on first word

        String word = ""; // to build each word

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                word += ch; // add character to current word
            } 

            if (ch == ' ' || i == s.length() - 1) {
                // End of a word
                if (!word.isEmpty()) {
                    if (smallest == null || word.length() < smallest.length()) {
                        smallest = word;
                    }
                    if (word.length() > biggest.length()) {
                        biggest = word;
                    }
                }
                word = ""; // reset for next word
            }
        }

        System.out.println("Smallest word: " + smallest);
        System.out.println("Biggest word: " + biggest);
    }
}
