package com.practice.string;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        String s = "rAm is goOD";
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if(i == 0 || ch[i-1] == ' ')
                ch[i] = Character.toUpperCase(ch[i]);
        }
        System.out.println(String.valueOf(ch));
    }
}
