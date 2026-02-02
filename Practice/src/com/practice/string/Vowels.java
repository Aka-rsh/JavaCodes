package com.practice.string;


	class VowelConsonantCounter {
	    public static void main(String[] args) {
	        String str = "skjcbkabfifbalaladjeife";
	        int vow = 0;
	        int consonants = 0;

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            // check vowel
	            if (ch == 'a' || ch == 'e' || ch == 'i' ||
	                ch == 'o' || ch == 'u' ||
	                ch == 'A' || ch == 'E' || ch == 'I' ||
	                ch == 'O' || ch == 'U') {

	                vow++;
	            } else if (Character.isLetter(ch)) {
	                consonants++;
	            }
	        }

	        System.out.println(vow + " " + consonants);
	    }
	}
