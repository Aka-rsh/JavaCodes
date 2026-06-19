package com.practice.numerals;

public class PrintEvenNumbers {

    // Method 1: Using modulus operator
    public static void evenWithMod() {
        System.out.println("Even numbers using % operator:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // For new line
    }

    // Method 2: Using increment by 2
    public static void evenWithIncrement() {
        System.out.println("Even numbers using i += 2:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // For new line
    }

    public static void main(String[] args) {
        evenWithMod();
        evenWithIncrement();
    }
}
