package com.bridgelabz.java8;

import java.util.ArrayList;

public class LambdaUsingList extends Object {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("jaya");
		list.add("sunil");
		list.add("parvati");
		list.add("Nagveni");
		
		
		for( String n : list) {
			System.out.println(n);
		}
		
		list.forEach((i)->{
			System.out.println(i);
		});
	}

}
