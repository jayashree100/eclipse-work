package com.bridgelab.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "jaya");
		map.put(2, "parvati");
		map.put(3, "gayatri");
		map.put(4, "Nagveni");
		map.put(5, "shreya");
		
		//System.out.println(map);
		
		
			
	Set set =	map.entrySet();
	//System.out.println(set);
	Iterator itr = set.iterator();
	
	while(itr.hasNext()) {
	Map.Entry entry = 	(Map.Entry) itr.next();
	
	System.out.println(entry.getValue());
	}
	
//comparing By key
	
         //map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
	}

}
