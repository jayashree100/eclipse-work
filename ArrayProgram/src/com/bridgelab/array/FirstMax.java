package com.bridgelab.array;

public class FirstMax {
	
	public static void firstMax(int arr[]) {
		int firstMax = arr[0];
		int secondMax = arr[0];
		int thirdMax = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>firstMax) {
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = arr[i];
			}
			else if(arr[i]>secondMax) {
				thirdMax = secondMax;
				secondMax = arr[i];
				
			}
			else if(arr[i]>thirdMax) {
				thirdMax = arr[i];
			}
			
		}
		System.out.println(firstMax);
		System.out.println(secondMax);
		System.out.println(thirdMax);

		
	}

	public static void main(String[] args) {
		int[] arr = {1,20,34,99,67,89};
		firstMax(arr);
		
	}

}
