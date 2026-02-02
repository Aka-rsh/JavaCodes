package com.practice.string;

public class CapitalizeLastLetterOfEachWordOptimized {

    public static void main(String[] args) {
        String s = "rAm is goOD";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                sb.append(c);
            } else {
                // capitalize if next is space or end of string
                if (i == s.length() - 1 || s.charAt(i + 1) == ' ') {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }
        }

        System.out.println(sb.toString());
    }
}

