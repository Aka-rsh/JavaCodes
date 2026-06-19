package com.practice.arrays;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        ArrayList<Integer> uniqueList = new ArrayList<>();

        // First element is always unique
        uniqueList.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                uniqueList.add(nums[i]);
            }
        }

        // Copy unique elements back to original array
        for (int i = 0; i < uniqueList.size(); i++) {
            nums[i] = uniqueList.get(i);
        }

        return uniqueList.size();
    }

    public static void main(String[] args) {

        RemoveDuplicatesFromSortedArray obj =
                new RemoveDuplicatesFromSortedArray();

        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};

        int uniqueCount = obj.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + uniqueCount);

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
