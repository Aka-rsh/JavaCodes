package com.practice.collection.iterarator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AccessOperation2 {
   public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	
	list.add(10);
	list.add(88);
	list.add(12);
	list.add(20);
	
	ListIterator<Integer> li = list.listIterator(4);
	System.out.println(li.hasPrevious());
//	System.out.println(li.next());
	
	li.add(90);
	System.out.println(li.previous());
	System.out.println(li.previous());
	li.set(100);
	System.out.println(li.hasPrevious());
	System.out.println(list);
   }
}
