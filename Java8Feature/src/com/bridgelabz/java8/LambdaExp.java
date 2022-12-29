package com.bridgelabz.java8;

@FunctionalInterface
interface Student{
	//String don(String name);
	int add(int a, int b);

}

public class LambdaExp {

	public static void main(String[] args) {
		
		//Student stu = (name)->{
			//return "Hello" +  " " + name;
		//};
		//System.out.println(stu.don(" jaya"));
		
		Student st = (a,b)-> (a+b);
			
		
		
	
		System.out.println(st.add(10, 20));


	}

}
