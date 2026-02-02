package com.practice.numerals;

import java.util.Scanner;

public class DuckNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int temp = num;
        boolean isDuck = false;

        // Check digits for zero (ignore leading zero if any)
        while (temp != 0) {
            int digit = temp % 10;
            if (digit == 0) {
                isDuck = true;
                break; // no need to check further
            }
            temp /= 10;
        }

        // Ternary operator to print result
        String result = isDuck ? num + " is a Duck Number" : num + " is NOT a Duck Number";
        System.out.println(result);

        in.close();
    }
}
