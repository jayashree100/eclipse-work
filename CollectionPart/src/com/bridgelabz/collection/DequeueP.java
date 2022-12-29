package com.bridgelabz.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueP {

	public static void main(String[] args) {
	Deque<String> dQueue = new ArrayDeque<String>(); 
	
		dQueue.add("sw");
		dQueue.add("kq");
		dQueue.add("ts");
		
		dQueue.offer("xyz");
		dQueue.offerFirst("jai");
		dQueue.addFirst("k");
		
		dQueue.poll();
		
		for(String str : dQueue) {
			System.out.println(str);
		}


	}

}
