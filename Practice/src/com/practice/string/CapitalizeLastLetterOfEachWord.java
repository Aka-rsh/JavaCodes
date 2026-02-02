package com.practice.string;

public class CapitalizeLastLetterOfEachWord { 
    public static void main(String[] args) {
        String s = "rAm is goOd";
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        
        for(int i=0; i<s.length(); i++) {
        	if(i == ch.length-1 || ch[i+1] == ' ') {
        		ch[i] = Character.toUpperCase(ch[i]);
        	}
        }
        System.out.println(ch);
    }
}
