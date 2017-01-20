package com.jyothesh.randomgenerator;

import java.util.Random;

public class RandomGenerator {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print(randomGenerator() + " ");
		}
	}
	
	private static int randomGenerator() {
		Random r = new Random(12389);
		return r.nextInt();
	}
}
