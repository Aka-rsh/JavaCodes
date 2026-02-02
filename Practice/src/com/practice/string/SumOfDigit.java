package com.practice.string;

public class SumOfDigit {
   public static void main(String[] args) {
	String str = "hi221bye8405helllo45";
	int sum=0;
	for(int i=0; i<str.length(); i++) {
		char c = str.charAt(i);
		if(Character.isDigit(c)) {
			sum = sum + c -'0';
//			sum = sum + (ch-48);
		}
	}
	System.out.println(sum);
   }
}
