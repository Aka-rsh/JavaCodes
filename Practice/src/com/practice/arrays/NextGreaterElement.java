package com.practice.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer, Integer> nextGreater = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Find next greater element for nums2
        for (int num : nums2) {

            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreater.put(stack.pop(), num);
            }

            stack.push(num);
        }

        // Remaining elements have no greater element
        while (!stack.isEmpty()) {
            nextGreater.put(stack.pop(), -1);
        }

        // Build result for nums1
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreater.get(nums1[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        NextGreaterElement obj = new NextGreaterElement();

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] result = obj.nextGreaterElement(nums1, nums2);

        System.out.println("Next Greater Elements:");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
