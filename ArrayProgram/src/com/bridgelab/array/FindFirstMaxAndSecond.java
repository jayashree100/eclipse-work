package com.bridgelab.array;

public class FindFirstMaxAndSecond {
	
	public static void firstMaxSecondMax(int arr[]) {
		
		int n = arr.length;
		int firstMax = arr[0];
		int secondMax =arr[0];
		
		
		for(int i=0;i<n;i++) {
			for(int j=1;j<n;j++) {
				if(arr[i]>firstMax) {
					 secondMax = firstMax;
					 firstMax = arr[i];
				}
				else if(arr[i]>secondMax) {
					firstMax = secondMax;
	
				}
				
			}
		}
		System.out.println("FirstMax is:"+firstMax + " "+secondMax);
	}

	public static void main(String[] args) {
		int[] arr = {1,55,20,67,45};
		firstMaxSecondMax(arr);
		

	}

}
