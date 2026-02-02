package com.practice.string;

public class ChangeCaseOptimized {
    public static void main(String[] args) {
        String str = "Apple is verY Tas%4ty   pleASE hAve IT";
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                ans.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                ans.append(Character.toUpperCase(ch));
            } else {
                ans.append(ch); // Non-alphabetic characters remain unchanged
            }
        }

        System.out.println(ans.toString());
    }
}

//✅ Advantages of this approach:
//
//Uses Character.isUpperCase() and Character.isLowerCase() → more readable and safer than ASCII checks.
//
//Uses StringBuilder → avoids creating multiple string objects inside the loop (more memory-efficient).
//
//Works correctly for all alphabetic characters; non-alphabetic characters stay unchanged.