package com.bridgelab.abstraction;

class Honda extends Bike {
	 public void run() {
		  System.out.println("this abstract class run method");
	  }
	  
	  public static void main(String[] args) {
	Bike obj = new Honda();
		obj.run();
	}
	  
}
