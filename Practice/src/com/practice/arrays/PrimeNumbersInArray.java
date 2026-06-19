package com.practice.arrays;

public class PrimeNumbersInArray {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7, 9, 11};

        for (int num : arr) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }
}

//Time Complexity: O(n * √k)
//Space Complexity: O(1)