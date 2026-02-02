package com.practice.string;

public class SortString {
	public static String sortString(String str) {
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length-1; i++) {
			for(int j=0; j<ch.length-i-1; j++) {
				if(ch[j] > ch[j+1]) {
					char temp = ch[j];
					ch[j] = ch[j+1];
					ch[j+1] = temp;
				}
			}
		}
		String s = new String(ch);
		return s;
	}
	
    public static void main(String[] args) {
		String str = "hello";
		System.out.println(sortString(str));
	}
}
