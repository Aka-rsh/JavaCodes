package com.practice.string;

public class SwapWordEdges {
    public static void main(String[] args) {
        String s = "Scanner is Class";
        char[] ch = s.toCharArray();
        int first = 0;

        for (int i = 0; i <= ch.length; i++) { // loop goes to length to handle last word
            // If start of a word
            if (i == 0 || ch[i - 1] == ' ') {
                first = i;
            }
            // If end of a word or end of string
            if (i == ch.length || ch[i] == ' ') {
                int last = i - 1;
                // Swap first and last letters of the word
                char temp = ch[first];
                ch[first] = ch[last];
                ch[last] = temp;
            }
        }

        System.out.println(new String(ch)); // convert char array back to string
    }
}
