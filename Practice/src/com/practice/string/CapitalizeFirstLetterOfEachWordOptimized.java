package com.practice.string;

public class CapitalizeFirstLetterOfEachWordOptimized {

    public static void main(String[] args) {
        String s = "rAm is goOD";
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = true; // capitalize first char or after space

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(c);
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    sb.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }
        }

        System.out.println(sb.toString());
    }
}
