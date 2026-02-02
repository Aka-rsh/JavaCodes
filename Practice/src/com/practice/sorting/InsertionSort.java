package com.practice.sorting;

import java.util.Arrays;

public class InsertionSort {
	public static int[] insertionSort(int[] arr) {
	    for(int i = 1; i < arr.length; i++) {
	        int key = arr[i];
	        int j = i - 1;

	        while(j >= 0 && arr[j] > key) {
	            arr[j + 1] = arr[j];
	            j--;
	        }
	        arr[j + 1] = key;
	    }
	    return arr;
	}

   public static void main(String[] args) {
	   int[] arr = {-3, 10, -1, 5, 0};
	   System.out.println("Original Array : " + Arrays.toString(arr));
	   System.out.println("Sorted Array : " + Arrays.toString(insertionSort(arr)));
   }
}
