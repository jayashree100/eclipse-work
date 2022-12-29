package com.bridgelab.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,15,20,25,30);
		
		List<Integer> evenNumber = new ArrayList<Integer>();
		
		//without using stream
//		for(Integer n :list) {
//			if(n%2 == 0) {
//				evenNumber.add(n);
//			}
//		}
//		System.out.println(evenNumber);
//
//	}
		
		//with using strem
//	evenNumber	=  list.stream().filter(n->n%2==0).collect(Collectors.toList());
//	System.out.println(evenNumber);
		
		//without store directly print 
		//list.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		list.stream().filter(n->n%2==0).forEach(System.out::println);
}
}
