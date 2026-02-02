package com.practice.string;

public class Pangram {
   public static void main(String[] args) {
	int[] arr = new int[128];
	
	String str = "Sphinx of black quartz, judge my vow";
	str = str.toUpperCase();
	for(int i=0; i<str.length(); i++) {
		char ch = str.charAt(i);
		arr[ch]++;
	}
	boolean flag = true;
	for(int i=65; i<=90; i++) {
		if(arr[i] == 0) {
			flag = false;
			break;
		}
	}
	System.out.println(flag==true?"Pangram": "Not Pangram");
   }
}
