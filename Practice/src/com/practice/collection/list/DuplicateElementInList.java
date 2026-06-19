package com.practice.collection.list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementInList  {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "C", "A", "C", "D", "E", "A", "S");

        Set<String> seen = new HashSet<>();
        Set<String> duplicate = new HashSet<>();

        for (String s : list) {
            if (!seen.add(s)) {
                duplicate.add(s);
            }
        }

        System.out.println("Duplicate elements in the list: " + duplicate);
    }
}
