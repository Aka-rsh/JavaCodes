package com.practice.numerals;

import java.util.Scanner;

public class FactorsDivisorsOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Factors / Divisors of " + num + " are:");

        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                if (i != num / i) { // avoid repeating square root twice
                    System.out.print(num / i + " ");
                }
            }
        }

        sc.close();
    }
}
