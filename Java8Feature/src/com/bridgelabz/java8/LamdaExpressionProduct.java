package com.bridgelabz.java8;

import java.util.ArrayList;
import java.util.Collections;

public class LamdaExpressionProduct {

	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<Product>();
		
		list.add(new Product(1,"shampoo",2.0f));
		list.add(new Product(2,"soap",3.0f));
		list.add(new Product(3,"sent",5.0f));
		
		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		
		for(Product p : list) {
            System.out.println(p.id+" "+p.name+" "+p.price);  

		}

		

	}

}
