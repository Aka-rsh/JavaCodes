package com.practice.numerals;

public class SumEvenOddNumbers {

    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                sumEven += i; // Add to even sum
            } else {
                sumOdd += i;  // Add to odd sum
            }
        }

        System.out.println("Sum of even numbers between 1 and 50: " + sumEven);
        System.out.println("Sum of odd numbers between 1 and 50: " + sumOdd);
    }
}
