package com.practice.arrays;

public class FirstNonRepeatedElement {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 3, 5,2, 4};

        for (int i = 0; i < arr.length; i++) {
            boolean isRepeated = false;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                System.out.println("First non-repeated element: " + arr[i]);
                return;
            }
        }

        System.out.println("No non-repeated element found");
    }
}

/*
Time Complexity: O(n^2)
Space Complexity: O(1)
*/