package com.practice.collection.list;

import java.util.ArrayList;
import java.util.List;

public class FindStringObject {

    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();

        list.add("Abc");
        list.add(4);
        list.add('A');
        list.add(null);
        list.add(true);
        list.add("Java");
        list.add("Stack");

        System.out.println("String objects present in the list:");
        
        // Method 1 (Best & Safe)
        for (Object obj : list) {
            if (obj instanceof String) {
                System.out.println(obj);
            }
        }

        System.out.println("===============================");

        // Method 2 (Safe version)
        for (Object obj : list) {
            if (obj != null && obj.getClass() == String.class) {
                System.out.println(obj);
            }
        }
    }
}

// when obj is null it causes 
