package com.practice.string;

public class RemoveOuterParentheses {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))"; // Input string
        StringBuilder res = new StringBuilder();
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (count > 0) res.append('(');
                count++;
            } else {
                count--;
                if (count > 0) res.append(')');
            }
        }

        System.out.println("Input:  " + s);
        System.out.println("Output: " + res.toString());
    }
}
