package com.practice.arrays;

import java.util.Arrays;

public class ShiftZeroToEnd {
	
	 static void moveZeroInPlace(int[] arr, int n) {
		    int index = 0;
		    // Move non-zero elements to the front
		    for (int i = 0; i < n; i++) {
		        if (arr[i] != 0) {
		            arr[index++] = arr[i];
		        }
		    }
		    // Fill the rest with zeros
		    while (index < n) {
		        arr[index++] = 0;
		    }
		    System.out.println("In-place shift: " + Arrays.toString(arr));
		}

	
	public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 0, 1, 0};
        int n = arr.length;
        moveZeroInPlace(arr, n);
	}    
}
