package com.practice.string;

public class DigitToWord {
     public static void main(String[] args) {
		String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		int n =123, rem =0 ;
		
		String ans = "";
		while(n!=0) {
			rem = n%10;
			ans = arr[rem] + ans;
			n=n/10;
		}
		 System.out.println(ans);
	}
}
