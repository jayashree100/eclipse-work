package com.bridgelabz.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetPractice {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(50);
		set.add(30);
		set.add(10);
		set.add(10);
		
//	     Iterator itr = set.iterator();
//	     
//	     while(itr.hasNext()) {
//	    	 System.out.println(itr.next());
//	     }
//	    for(HashSet set1 : set ) {
//	    	
//	    }
		HashSet<Integer> elements = new HashSet<Integer>();
		System.out.println(set);
		
		
		Integer[] array = set.toArray(new Integer[set.size()]);
		System.out.println(array[0]);
		
		
		
	}

}
