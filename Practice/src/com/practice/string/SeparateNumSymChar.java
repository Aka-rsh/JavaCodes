package com.practice.string;

public class SeparateNumSymChar {
   public static void main(String[] args) {
	   String str = "bhbr238#^4y32bAJN@#Drh";
	   int alpha = 0;
       int num = 0;
       int sym = 0;
	   
	   for(int i=0 ; i<str.length(); i++) {
		   char ch = str.charAt(i);
		   if (Character.isLetter(ch)) {
			    alpha++;
			} else if (Character.isDigit(ch)) {
			    num++;
			} else {
			    sym++;
			}
	   }

//		   if((ch >= 'A') && (ch <= 'Z') || (ch >= 'a') && (ch <= 'z')  ) {
//			   alpha++;
//		   }
//		   else if((ch >= '0' && ch <= '9')) {
//			   num++;
//		   }else {
//			   sym++;
//		   }
//	   }
	   System.out.println("Alpha : " + alpha + ",  Number : " + num + ", Symbol : " +sym) ;
   }
}
