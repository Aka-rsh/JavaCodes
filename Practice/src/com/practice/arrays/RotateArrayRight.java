package com.practice.arrays;

public class RotateArrayRight {
	
	public static void rotateRight(int[] arr, int k) {
		int n = arr.length;
		k = k %n;
		
		for(int i=0 ; i<k; i++) {
			int last = arr[n-1];
			
			for(int j=n-1; j>0; j--) {
				arr[j] = arr[j-1];
			}
			arr[0]= last;
		}
	}

	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		int k =3;
		rotateRight(arr,k);
		
		for (int ele : arr) {
			System.out.print(ele +" ");
		}
	}
	
}
