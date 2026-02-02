package com.practice.string;

public class Solution {
    
    public String removeOuterParentheses(String s) {
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
        return res.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String input1 = "(()())(())";
        String input2 = "(()())(())(()(()))";
        String input3 = "()()";

        System.out.println("Input: " + input1);
        System.out.println("Output: " + solution.removeOuterParentheses(input1));
        System.out.println();

        System.out.println("Input: " + input2);
        System.out.println("Output: " + solution.removeOuterParentheses(input2));
        System.out.println();

        System.out.println("Input: " + input3);
        System.out.println("Output: " + solution.removeOuterParentheses(input3));
    }
}

