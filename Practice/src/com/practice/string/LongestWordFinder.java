package com.practice.string;

public class LongestWordFinder {
    public static void main(String[] args) {
        String s = " I love Programming";
        String[] words = s.split(" ");
        String biggest = "";

        for (String word : words) {
            if (word.length() > biggest.length()) {
                biggest = word;
            }
        }

        System.out.println("Biggest word: " + biggest);
    }
}

