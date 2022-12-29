package com.bridgelab.abstraction;

public class InterfaceImpl  implements InterfacePractice{
	public void add() {
		int a = 10;
		int b = 20;
		int sum = a=b;
		System.out.println(sum);
		
	}
	
	public void sub() {
		System.out.println("this is child class");
	}
	

	public static void main(String[] args) {
		
		InterfaceImpl interf = new InterfaceImpl();
		interf.add();
		interf.sub();
		
	}

	
	public void div() {
		System.out.println("this is interface div");
		
	}

}
