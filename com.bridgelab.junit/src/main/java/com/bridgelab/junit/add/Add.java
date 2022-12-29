package com.bridgelab.junit.add;

public class Add {
	
	public  int findMax(int arr[]) {
		int max =0;
		
		for(int i =1;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			
		}
		return max;
	}

}
