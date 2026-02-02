package com.practice.string;

public class StringToCharArray {
    public static void main(String[] args) {
        String str = "hello";

        // ===========================
        // 1️⃣ Manual Method
        // ===========================
        char[] manualArr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            manualArr[i] = str.charAt(i); // manually copy each character
        }

        System.out.println("Manual Method:");
        for (char c : manualArr) {
            System.out.print(c + " ");
        }
        System.out.println("\n----------------------------------");

        // ===========================
        // 2️⃣ Optimized Method using toCharArray()
        // ===========================
        char[] optimizedArr = str.toCharArray(); // built-in optimized method

        System.out.println("Optimized Method (toCharArray):");
        for (char c : optimizedArr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
