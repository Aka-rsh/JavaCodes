package com.practice.string;

public class PrefixPatternPrinter {
    public static void main(String[] args) {
        printPattern("Program", 4);
    }

    public static void printPattern(String str, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = n; i >= 1; i--) {
            result.append(str.substring(0, i));
        }

        System.out.println(result.toString());
    }
}


//public class PrefixPatternPrinter {
//    public static void main(String[] args) {
//        printPattern("Program", 4);
//    }
//
//    public static void printPattern(String str, int n) {
//        String result = "";
//
//        for (int i = n; i >= 1; i--) {
//            result += str.substring(0, i);
//        }
//
//        System.out.println(result);
//    }
//}
