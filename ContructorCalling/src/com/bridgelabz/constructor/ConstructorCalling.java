package com.bridgelabz.constructor;

import com.bridgelabz.addressbook.CommandLine;

public class ConstructorCalling extends CommandLine {
	int a;
	int b;
	public ConstructorCalling(int a, int b) {
		
		this.a = a;
		this.b = b;
		
	
	}
	public static void main(String[] args) {
		CommandLine line = new CommandLine();
		System.out.println(line.c);
	}
	
	

}

