package com.practice.string;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        String str = "hi   bye hello";
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i + 1 < str.length() && str.charAt(i + 1) == ' ') {
                continue; // skip consecutive spaces
            }
            ans.append(str.charAt(i));
        }

        System.out.println(ans.toString());
    }
}
