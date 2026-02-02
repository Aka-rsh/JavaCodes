package com.practice.string;

public class AvoidDuplicate {
    public static void main(String[] args) {
        String str = "abca";
        str = str.toLowerCase();
        char[] ch = str.toCharArray();  // fixed

        boolean[] b = new boolean[ch.length]; // track duplicates

        for (int i = 0; i < ch.length; i++) {
            if (!b[i]) {  // if not already counted
                int cnt = 1;  // count current char

                for (int j = i + 1; j < ch.length; j++) {  // fixed loop
                    if (ch[i] == ch[j]) {
                        cnt++;
                        b[j] = true;  // mark duplicate
                    }
                }
//                if(cnt==1) // this will lead to print only unique character
                System.out.println(ch[i] + " - " + cnt);
            }
        }
    }
}


//class AvoidDuplicate {
//    public static void main(String[] args) {
//        String str = "abca";
//        str = str.toLowerCase();
//        char[] ch = str.toCharArray();
//
//        int[] freq = new int[256]; // ASCII
//
//        for (char c : ch) freq[c]++;  // count frequency
//
//        for (char c : ch) {
//            if (freq[c] > 0) {
//                System.out.println(c + " - " + freq[c]);
//                freq[c] = 0; // avoid printing duplicates
//            }
//        }
//    }
//}


