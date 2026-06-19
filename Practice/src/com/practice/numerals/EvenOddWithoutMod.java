package com.practice.numerals;

import java.util.Scanner;

public class EvenOddWithoutMod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = (num / 2) * 2;

        if (result == num) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }

        sc.close();
    }
}

