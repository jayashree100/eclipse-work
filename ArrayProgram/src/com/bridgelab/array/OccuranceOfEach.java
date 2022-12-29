package com.bridgelab.array;

public class OccuranceOfEach {
	
	public static  void occurance(int arr[]) {
		int visited =-1;
		int fr[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int count = 1;

			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					fr[j]=visited;
				}
			}
			if(fr[i]!=visited) {
				fr[i]= count;
			}
		}
			System.out.println("----------------------");
	        System.out.println(" Element | Frequency");  
	        System.out.println("---------------------------------------");  
	        for(int i = 0; i < fr.length; i++){  
	            if(fr[i] != visited)  
	                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
	        }  
	        System.out.println("----------------------------------------");  

			//System.out.println(arr[i]+ " " );
			//System.out.println(count);

			
		}
		
	

	public static void main(String[] args) {
		int[] arr = {10,20,10,30,20,56,40,40,56};
		occurance(arr);
	}

}
