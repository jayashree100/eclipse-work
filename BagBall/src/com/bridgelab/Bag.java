package com.bridgelab;



public class Bag {

	public int getRandom() {
		int min = 1;
		int max = 4;
		int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
		return random_int;
	}

	public static void main(String[] args) {

		int greenCount = 1;
		int redCount = 1;
		int yellowCount = 1;
		int blueCount = 1;

		Bag operations = new Bag();
		Ball[] bag = new Ball[12];

		for (int i = 0; i < bag.length; i++) {

			while (bag[i] == null) { // to avoid null values as input
				int putBalls = operations.getRandom();

				switch (putBalls) {
				case 1:

					if (greenCount <= 3) {
						bag[i] = new Ball("green");
						greenCount++;
					}

					break;

				case 2:

					if (redCount < 6) {
						bag[i] = new Ball("red");
						redCount++;
					}
					break;

				case 3:

					if (yellowCount < 5) { // (40 / 100) * 12 = 5 balls

						bag[i] = new Ball("yellow");
						yellowCount++;
					}
					break;

				case 4:

					bag[i] = new Ball("blue");
					blueCount++;
					break;

				}

			}
		}

		System.out.println("red" + (redCount - 1) + " green " + (greenCount - 1) + " yellow " + (yellowCount - 1)
				+ " blue " + (blueCount - 1));

		Bag.printBalls(bag);
	}

	private static void printBalls(Ball[] bag) {

		for (Ball ball : bag) {
			System.out.println(ball);
		}
	}
}
