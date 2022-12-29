package com.bridgelab.abstraction;

public class StringToArray {

	public static void main(String[] args) {
		String str = "welcome";
		      System.out.println( str.toCharArray());
		      
		      char[] arr = str.toCharArray();
		      
		      for(int i =0; i<arr.length;i++) {
		    	  System.out.println(arr[i]);
		      }

	}

}
