package com.bridgelab.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {

	public static void main(String[] args) {
		List<String> name = Arrays.asList("parvati","Jayashree","Vijayalak","Nagveni","Biresh");
		List<String> longnames = new ArrayList<String>();
	
	longnames	= name.stream().filter(str->str.length()>6 && str.length()<8 ).collect(Collectors.toList());
//	System.out.println(longnames);
	//name.stream().filter(str->str.length()>6 && str.length()<8 ).forEach(str->System.out.println(str));
	name.stream().filter(str->str.length()>6 && str.length()<8 ).forEach(System.out::println);

	 
	}

}
