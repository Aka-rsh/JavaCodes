package com.practice.string;

public class PangramOptimized {

    public static void main(String[] args) {

        String str = "Sphinx of quartz, judge my vow";

        boolean[] seen = new boolean[26];
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toUpperCase(str.charAt(i));

            if (ch >= 'A' && ch <= 'Z') {
                int index = ch - 'A';

                if (!seen[index]) {
                    seen[index] = true;
                    count++;
                }
            }

            // Early exit if all letters are found
            if (count == 26) {
                break;
            }
        }

        System.out.println(count == 26 ? "Pangram" : "Not Pangram");
    }
}
