package com.practice.arrays;

public class MostRepeatedElement {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 3, 5, 4, 2};

        int maxCount = 0;
        int element = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                element = arr[i];
            }
        }

        System.out.println("Most repeated element: " + element);
    }
}

/*
Time Complexity: O(n^2)
Space Complexity: O(1)
*/
