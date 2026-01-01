package com.practice.string;

public class ChangeCase {
     public static void main(String[] args) {
		String str = "Apple is verY Tas%4ty   pleASE hAve IT";
		String ans = "";
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'A' && ch<= 'Z') {
				 ch =  (char) (ch + 32);
				ans = ans + ch;
			}
			else if(ch >= 'a' && ch<='z') {
				ch = (char) (ch -32);
				ans = ans +ch;
			}else {
				ans = ans + ch;
			}
		}
		System.out.println(ans);
	}
}
