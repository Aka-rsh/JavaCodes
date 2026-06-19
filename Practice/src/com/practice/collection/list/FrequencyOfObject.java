package com.practice.collection.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FrequencyOfObject {
   public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(100);
	list.add(140);
	list.add(140);
	list.add(20);
	list.add(40);
	list.add(10);
	
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	for(Integer i : list) {
		if(map.containsKey(i)) {
			map.put(i, map.get(i) +1 );
		}else {
			map.put(i, 1);
		}
	 }
	System.out.println(map);
   }
}
