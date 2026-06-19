package com.practice.arrays;

public class NthUniqueCharacter {

    public static void main(String[] args) {
        String str = "programming";
        int n = 3; // find 3rd unique character
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            boolean isUnique = true;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                count++;
                if (count == n) {
                    System.out.println("Nth unique character: " + str.charAt(i));
                    return;
                }
            }
        }

        System.out.println("Not enough unique characters");
    }
}

/*
Time Complexity: O(n^2)
Space Complexity: O(1)
*/
