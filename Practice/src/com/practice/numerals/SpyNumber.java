package com.practice.numerals;

import java.util.Scanner;

public class SpyNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        // Store original number for output
        int originalNum = num;

        int sum = 0;       // Sum of digits
        int product = 1;   // Product of digits

        // Extract digits and calculate sum & product
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }

        // Ternary operator to check Spy Number
        String result = (sum == product) ? 
                        originalNum + " is a Spy Number." : 
                        originalNum + " is NOT a Spy Number.";

        // Print result
        System.out.println(result);

        in.close();
    }
}
