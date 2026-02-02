package com.practice.numerals;

import java.util.Scanner;

public class StrongNumber {

    // Function to calculate factorial of a digit
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int originalNum = num; // Save original number
        int sum = 0;

        // Calculate sum of factorials of digits
        while (num != 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        // Ternary operator to check Strong Number
        String result = (sum == originalNum) ? 
                        originalNum + " is a Strong Number" : 
                        originalNum + " is NOT a Strong Number";

        System.out.println(result);

        sc.close();
    }
}
