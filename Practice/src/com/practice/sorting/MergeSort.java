package com.practice.sorting;

public class MergeSort {
	
	public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
		int n = a.length;
		int m = b.length;
		
		int result[] = new int[n+m];
		
		int i=0, j=0, k=0;
		
		while(i<n && j<m) {
			if(a[i] < b[j]) {
				result[k++] = a[i++];
			}else {
				result[k++] = b[j++];
			}
			
			while(i<n) result[k++] = a[i++];
			while(j<m) result[k++] = b[j++];
		}
		return result;
	}
	
	public static int[] f(int[] arr, int start, int end) {
		if(start == end) {
			int[] res = new int[1];
			res[0] = arr[start];
			return res;
		}
		
		int mid = (start + end)/2;
		int[] left = f(arr,start,mid);
		int[] right = f(arr,mid+1,end);
		
		return mergeTwoSortedArrays(left,right);
	}
	
	public static int[] mergeSort(int[] arr) {
		int[] result = f(arr , 0 , arr.length-1);
		for(int i=0; i<arr.length; i++) {
			arr[i] = result[i];
		}
		return arr;
	}
	
	
   public static void main(String[] args) {
	int[] arr = {15,44,34,2,11};
	mergeSort(arr);
	  for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
      System.out.println();

   }
}
