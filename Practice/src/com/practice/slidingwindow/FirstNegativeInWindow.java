package com.practice.slidingwindow;

import java.util.*;

//public class FirstNegativeInWindow {
//
//    static void printFirstNegative(int[] arr, int N, int K) {
//        Deque<Integer> queue = new LinkedList<>();
//
//        for (int i = 0; i < N; i++) {
//            // Add current negative number index to queue
//            if (arr[i] < 0) {
//                queue.addLast(i);
//            }
//
//            // Window reached size K
//            if (i >= K - 1) {
//                // Remove indices which are out of current window
//                while (!queue.isEmpty() && queue.peekFirst() <= i - K) {
//                    queue.pollFirst();
//                }
//
//                // Print first negative or 0 if none
//                if (!queue.isEmpty()) {
//                    System.out.print(arr[queue.peekFirst()] + " ");
//                } else {
//                    System.out.print("0 ");
//                }
//            }
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        // Test case 1
//        int[] arr1 = {-8, 2, 3, -6, 10};
//        int K1 = 2;
//        printFirstNegative(arr1, arr1.length, K1); // Output: -8 0 -6 -6
//
//        // Test case 2
//        int[] arr2 = {12, -1, -7, 8, -15, 30, 16, 28};
//        int K2 = 3;
//        printFirstNegative(arr2, arr2.length, K2); // Output: -1 -1 -7 -15 -15 0
//    }
//}


public class FirstNegativeInWindow {

    public static List<Integer> firstNegative(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        int i = 0, j = 0;

        while (j < arr.length) {

            // Step 1: calculation
            if (arr[j] < 0) {
                queue.add(arr[j]);
            }

            // Step 2: window size not hit
            if (j - i + 1 < k) {
                j++;
            }
            // Step 3: window size hit
            else if (j - i + 1 == k) {

                // Answer from calculation
                if (queue.isEmpty()) {
                    result.add(0);
                } else {
                    result.add(queue.peek());
                }

                // Step 4: slide the window
                if (!queue.isEmpty() && arr[i] == queue.peek()) {
                    queue.poll();
                }

                i++;
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        System.out.println(firstNegative(arr, k));
    }
}

