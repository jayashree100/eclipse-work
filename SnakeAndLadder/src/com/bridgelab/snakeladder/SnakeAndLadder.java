package com.bridgelab.snakeladder;

public class SnakeAndLadder {
	
	public static void main(String[] args) {
		
		int start = 0;
		System.out.println("Welcome to SnakeAndladder program");
		System.out.println("start position of player is: "+start);
		int roll = (int)(Math.floor(Math.random()*10)%6+1);
		System.out.println("after rolling the dice is:" +roll );

	}

}
