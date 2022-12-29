package com.bridgelabz.collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();
		
//		queue.add("Abc");
//		queue.add("Apple");
//		queue.add("xyz");
//		
		//System.out.println("this is first elements in the queue:" +queue.element());
		
	System.out.println("this is peek value: "+ queue.peek());
		
		Iterator itr = queue.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
