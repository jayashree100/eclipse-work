package com.bridgelabz.collection;

import java.util.ArrayList;
import java.util.List;

import java.util.*;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student("jaya", 10, 29);
		Student s2 = new Student("viju", 15, 25);
		Student s3 = new Student("nagveni", 12, 30);
		
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		 Iterator<Student> itr=list.iterator();  
		 
		 while(itr.hasNext()) {
			 Student st = itr.next();
			 System.out.println(st.name+  " " +st.rollNo + " " +st.age+ " ");
		 }
		 
		 

	



	}

}
