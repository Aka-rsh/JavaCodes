package com.practice.string;

//Optimized  - Avoids the extra space at the end.
public class ReverseWordsDemo {
    public static void main(String[] args) {
        String str = "ram is good";
        String[] words = str.split(" "); // Split the string by spaces
        StringBuilder reversed = new StringBuilder();

        // Loop from the end to the start
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) { // Avoid extra space at the end
                reversed.append(" ");
            }
        }

        System.out.println(reversed.toString());
    }
}



//public class ReverseWordsDemo {
//    public static void main(String[] args) {
//        String str = "ram is good";
//        String[] words = str.split(" "); // Split the string by spaces
//        String reversed = "";
//
//        // Loop from the end to the start
//        for (int i = words.length - 1; i >= 0; i--) {
//            reversed += words[i];
//            if (i != 0) { // Avoid extra space at the end
//                reversed += " ";
//            }
//        }
//
//        System.out.println(reversed);
//    }
//}
