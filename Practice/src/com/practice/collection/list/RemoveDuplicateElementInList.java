package com.practice.collection.list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateElementInList {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "C", "A", "C", "D", "E", "A", "S");

        // Using Set to remove duplicates
        Set<String> unique = new HashSet<>(list);

        System.out.println("List after removing duplicates: " + unique);
    }
}
