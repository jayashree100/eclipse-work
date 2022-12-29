package com.bridgelabz.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ArrayListPractice {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		HashMap <String,Integer> hashmap = new HashMap<String,Integer>();
		hashmap.put("xyz", 0);
		System.out.println(hashmap);
		hashmap.put("abc",1);
		hashmap.put( "Apple",2);
		
		System.out.println(" xyz value is : " +hashmap.get("xyz"));
		
		for(Map.Entry m : hashmap.entrySet()) {
		System.out.println(m.getValue());
		}
		list.add("Mango");
		list.add("Banana");
		list.add("Grapes");

		System.out.println("size of the list: " +list.size());
		Collections.sort(list);
		
		for(String fruits : list) {
			System.out.println(fruits);
			System.out.println("sorting numbers");
			
			List<Integer> list1 = new ArrayList<Integer>();
			list1.add(10);
			list1.add(50);
			list1.add(80);
			list1.add(40);
			
			Collections.sort(list1);
			
			for(Integer number: list1) {
				System.out.println(number);
			}
		}

	}

}
