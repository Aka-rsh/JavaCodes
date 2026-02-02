package com.practice.numerals;

import java.util.Scanner;

public class ArmStrongNumber {

    // Function to count digits in a number
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    // Function to calculate base^exponent
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;

        int numDigits = countDigits(num);
        int sum = 0;

        // Calculate sum of each digit raised to power of number of digits
        while (num != 0) {
            int digit = num % 10;
            sum += power(digit, numDigits);
            num /= 10;
        }

        // Ternary operator to check Armstrong
        String result = (originalNum == sum) ? 
                        originalNum + " is an Armstrong Number" : 
                        originalNum + " is NOT an Armstrong Number";

        System.out.println(result);

        sc.close();
    }
}
