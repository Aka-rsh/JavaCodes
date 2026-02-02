package com.practice.string;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "ram is good";
        String[] words = str.split(" "); // Split the string by spaces
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            // Reverse each word using StringBuilder
            String reversedWord = new StringBuilder(words[i]).reverse().toString();
            result.append(reversedWord);

            // Add space if it's not the last word
            if (i != words.length - 1) {
                result.append(" ");
            }
        }

        System.out.println(result.toString());
    }
}
