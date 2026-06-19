package com.practice.arrays;

public class OptimizedPrimeNumbersInArray {

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7, 9, 97};

        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        boolean[] isPrime = sieve(max);

        for (int num : arr) {
            if (isPrime[num]) {
                System.out.println(num);
            }
        }
    }

    public static boolean[] sieve(int n) {
        boolean[] prime = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        return prime;
    }
}

// Time Complexity - O(n + k log log k)
// Space Complexity - O(n + k)