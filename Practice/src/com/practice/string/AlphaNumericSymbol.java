package com.practice.string;

public class AlphaNumericSymbol {
    public static void main(String[] args) {
    	   String str = "HI^7788ye89@#";
    	   
    	   StringBuilder alpha = new StringBuilder();
    	   StringBuilder digit = new StringBuilder();
    	   StringBuilder symbol = new StringBuilder();
    	   
    	   for(char c : str.toCharArray()) {
    		   if(Character.isLetter(c)) {
    			   alpha.append(c);
    		   }else if(Character.isDigit(c)) {
    			   digit.append(c);
    		   }else {
    			   symbol.append(c);
    		   }
    	   }
    	   String result = alpha.toString() + digit.toString() + symbol.toString();
		   System.out.println(result);
	}
}



//Method 2: Using ASCII Ranges (No Character class)

//public class AlphaNumericSymbol {
//    public static void main(String[] args) {
//        String str = "HI^7788ye89@#";
//
//        StringBuilder alpha = new StringBuilder();
//        StringBuilder digit = new StringBuilder();
//        StringBuilder symbol = new StringBuilder();
//
//        for (char c : str.toCharArray()) {
//            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
//                alpha.append(c);
//            } else if (c >= '0' && c <= '9') {
//                digit.append(c);
//            } else {
//                symbol.append(c);
//            }
//        }
//
//        System.out.println(alpha.toString() + digit.toString() + symbol.toString());
//    }
//}

