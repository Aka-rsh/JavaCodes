package com.practice.arrays;

import java.util.Scanner;

public class MaxMin {

    public static void maxMinEle(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
//        for (int i=0; i<arr.length ; i++ ) { 
//        	if (arr[i] > max) { max = arr[i]; 
//        	} if (arr[i] < min) {
//        		min = arr[i]; 
//        		} 
//        }
//
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Maximum Element: " + max);
        System.out.println("Minimum Element: " + min);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array length: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        maxMinEle(arr);
       input.close();
    }
}
