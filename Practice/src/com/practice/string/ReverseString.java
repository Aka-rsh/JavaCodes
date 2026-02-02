package com.practice.string;

public class ReverseString {
	
	public static String reverseString(String str) {
		char[] ch = str.toCharArray();
		int s=0 , e=str.length()-1;
		while(s<e) {
			char temp = ch[s];
			ch[s]= ch[e];
			ch[e] = temp;
			
			s++; e--;
		}
		String z = new String(ch);
		return z;
	}
   public static void main(String[] args) {
	String str = "Hello";
	System.out.println(reverseString(str));
   }
}
