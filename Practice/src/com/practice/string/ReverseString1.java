package com.practice.string;

public class ReverseString1 {
    public static void main(String[] args) {
        String str = "Hello";
        String ans = "";
        char[] ch = str.toCharArray();

        for (int i = ch.length - 1; i >= 0; i--) {
            ans = ans + ch[i];  
        }

        System.out.println(ans);  
        
        // Using StringBuilder
        
        StringBuilder sb = new StringBuilder(str);
        StringBuilder s = sb.reverse();
        String ss = s.toString();
        System.out.println(ss);
    }
}
