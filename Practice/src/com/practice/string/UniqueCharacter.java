package com.practice.string;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str = "Programming";
        char[] arr = str.toCharArray();

        System.out.println("Unique Characters:");

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];

            if (ch == ' ')
                continue;

            int cnt = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == ch) {
                    cnt++;
                }
            }

            if (cnt == 1) {
                System.out.print(ch + " ");
            }
        }
    }
}
