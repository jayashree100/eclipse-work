package com.bridgelabz.java8;

interface Sys{
	public int add(int a, int b);
}

public class LamdaExpression {

	public static void main(String[] args) {
		Sys s = (a,b)->(a+b);
			System.out.println(s.add(10, 20));
		     	
		

	}

}
