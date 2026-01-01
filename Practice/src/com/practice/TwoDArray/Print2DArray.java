package com.practice.TwoDArray;

public class Print2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("=========================");
        // optimized approach 


        for(int[] val: arr){
            for(int temp : val){
                System.out.print(temp + " ");
            }
            System.out.println();
        }


//         ✅ What the Code Does
// arr is a 2D array: int[][] arr.
// The outer loop: for (int[] val : arr) iterates through each row (which is a 1D array) in the 2D array.
// The inner loop: for (int temp : val) iterates through each element in the current row.
// It prints each element followed by a space, and after each row, it prints a newline.
    }
}
