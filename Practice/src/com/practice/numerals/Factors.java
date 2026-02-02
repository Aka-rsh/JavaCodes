package com.practice.numerals;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : - ");
        int num = in.nextInt();

        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                if (i != num / i) {
                    System.out.print((num / i) + " ");
                }
            }
        }

        in.close();
    }
}

//   Another Approach


//public class Factors {
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the number : - ");
//        int num = in.nextInt();
//
//        ArrayList<Integer> factors = new ArrayList<>();
//
//        int limit = (int) Math.sqrt(num);
//
//        for (int i = 1; i <= limit; i++) {
//            if (num % i == 0) {
//                factors.add(i);
//
//                if (i != num / i) {
//                    factors.add(num / i);
//                }
//            }
//        }
//
//        Collections.sort(factors);
//
//        System.out.print("Factors in sorted order: ");
//        for (int factor : factors) {
//            System.out.print(factor + " ");
//        }
//
//        in.close();
//    }
//}
