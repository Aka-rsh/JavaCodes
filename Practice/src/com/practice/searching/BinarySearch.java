package com.practice.searching;

public class BinarySearch {

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // avoids overflow

            if (nums[mid] == target) {
                return mid;
            } 
            else if (nums[mid] < target) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }

        return -1; // element not found
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 2, 6, 7, 10, 12};
        int target = 7;

        int result = search(nums, target);

        if (result == -1) {
            System.out.println("Element not found in array.");
        } else {
            System.out.println("Element found at index position: " + result);
        }
    }
}
