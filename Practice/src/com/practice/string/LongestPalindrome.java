package com.practice.string;

class LongestPalindromeFinder {
    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String s){
        String rev = new StringBuffer(s).reverse().toString();
        return s.equals(rev);
    }

    public static void main(String[] args) {
        String str = "forgeeksskeegfor";
        String largest = ""; // Holds the longest palindrome

        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j <= str.length(); j++){
                String sub = str.substring(i, j);
                if(isPalindrome(sub)){
                    if(sub.length() > largest.length()){
                        largest = sub;
                    }
                }
            }
        }

        // Print the longest palindrome
        System.out.println("Longest palindrome: " + largest);
    }
}


//class LongestPalindromeFinder {
//
//    // Expand around the center and return the longest palindrome
//    public static String expandAroundCenter(String s, int left, int right) {
//        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
//            left--;
//            right++;
//        }
//        // Return the palindrome found (substring excludes right index)
//        return s.substring(left + 1, right);
//    }
//
//    public static void main(String[] args) {
//        String str = "forgeeksskeegfor";
//        String longest = "";
//
//        for (int i = 0; i < str.length(); i++) {
//            // Odd length palindrome
//            String odd = expandAroundCenter(str, i, i);
//            // Even length palindrome
//            String even = expandAroundCenter(str, i, i + 1);
//
//            // Update longest if needed
//            if (odd.length() > longest.length()) {
//                longest = odd;
//            }
//            if (even.length() > longest.length()) {
//                longest = even;
//            }
//        }
//
//        System.out.println("Longest palindrome: " + longest);
//    }
//}
