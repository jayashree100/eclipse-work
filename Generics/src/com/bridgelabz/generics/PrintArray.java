package com.bridgelabz.generics;

public class PrintArray<E> {
	E[] myArray;
	
	
	public PrintArray(E[] myArray) {
		
		this.myArray = myArray;
	}
	public static void main(String[] args) {
		
	
		Integer a[] = {1,2,3,4,5,6};
		Double[] b = {1.1,2.2,3.3,4.4,5.5};
		Character c[] = {'a','b','c'};
	
//new PrintArray<Integer>(a).toPrint();
//	new PrintArray<Double>(b).toPrint();
//		
		printArray(a);
		printArray(b);
		printArray(c);
	}


		
	



	 private static void toPrintArray(char[] c) {
		for(char i : c) {
			System.out.println(i);
		}
		
	}

	private static void toPrintArray(int[] a) {
		for(int i : a) {
			System.out.println(i);
		}
		
	}

	
//	
//	
	public static <E> void printArray(E[] elements) {
		for (E element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}
}
//
//	}
