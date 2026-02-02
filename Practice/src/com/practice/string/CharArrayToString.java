package com.practice.string;

public class CharArrayToString {
    public static void main(String[] args) {
        char[] arr = {'b','e','n','g','a','l','u','r','u'};

        // ===========================
        // 1️⃣ Manual Concatenation (Inefficient)
        // ===========================
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str = str + arr[i]; // creates a new string every iteration
        }
        System.out.println("Manual Concatenation:");
        System.out.println(str);
        System.out.println("----------------------------------");

        // ===========================
        // 2️⃣ Manual Optimized using StringBuilder
        // ===========================
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            sb.append(c);
        }
        System.out.println("Optimized Manual (StringBuilder):");
        System.out.println(sb.toString());
        System.out.println("----------------------------------");

        // ===========================
        // 3️⃣ Using Built-in Constructor
        // ===========================
        String s = new String(arr);
        System.out.println("Built-in Constructor (new String(char[])):");
        System.out.println(s);
    }
}
