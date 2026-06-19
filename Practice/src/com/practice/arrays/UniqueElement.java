package com.practice.arrays;

public class UniqueElement {

    public static int findUnique(int[] arr) {
        int unique = 0;
        for (int num : arr) unique ^= num;
        return unique;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1};
        System.out.println("Unique element: " + findUnique(arr));
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)

//Brute Force
//public class UniqueElement {
//
//    public static void findUnique(int[] arr) {
//        System.out.print("Unique elements: ");
//        boolean found = false;
//
//        for (int i = 0; i < arr.length; i++) {
//            boolean isUnique = true;
//            for (int j = 0; j < arr.length; j++) {
//                if (i != j && arr[i] == arr[j]) {
//                    isUnique = false;
//                    break;
//                }
//            }
//            if (isUnique) {
//                System.out.print(arr[i] + " ");
//                found = true;
//            }
//        }
//
//        if (!found) System.out.print("None");
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 1, 1};
//        findUnique(arr);
//    }
//}

// Time Complexity: O(n^2)  → nested loops
// Space Complexity: O(1)    → no extra array used