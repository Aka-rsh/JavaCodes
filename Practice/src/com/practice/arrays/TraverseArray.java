package com.practice.arrays;

public class TraverseArray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 0, -5, -10};
        System.out.println("To traverse an array we use a for loop:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
