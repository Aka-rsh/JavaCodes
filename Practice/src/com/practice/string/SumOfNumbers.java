package com.practice.string;

public class SumOfNumbers {
    public static void main(String[] args) {
        String str = "hi221bye8405helllo45";
        int sum = 0;
        String num = ""; // temporary string to store digits

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                num += c; // append digit to temporary number string
            } else {
                if (!num.isEmpty()) {       // if a number has ended
                    sum += Integer.parseInt(num); // convert to int and add
                    num = "";               // reset for next number
                }
            }
        }

        // Add the last number if string ends with a digit
        if (!num.isEmpty()) {
            sum += Integer.parseInt(num);
        }

        System.out.println("Sum of numbers = " + sum);
    }
}
