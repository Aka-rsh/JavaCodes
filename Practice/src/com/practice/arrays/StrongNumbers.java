package com.practice.arrays;

public class StrongNumbers {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    public static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int[] arr = {145, 2, 123, 40585};
        System.out.println("Strong numbers:");
        for (int num : arr) {
            if (isStrong(num)) System.out.println(num);
        }
    }
}

// Time Complexity: O(n * d * 10) ~ O(n * d) (d = digits in number, factorial of 0-9 constant)
// Space Complexity: O(1)