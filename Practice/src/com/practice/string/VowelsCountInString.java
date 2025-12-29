package com.practice.string;

public class VowelsCountInString {
    public static void main(String[] args) {
		String str = "Hello World I'm using Java Programming";
		int cnt =0;
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
	            // Check for both lowercase and uppercase vowels
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
	                cnt++;
	            }
		}
		System.out.println(cnt);
	}
}
