package com.jyothesh.vararg;

/*
 * Class that demonstrates about the variable argument
 */
public class SimpleVariableArgument {

	public static void m1(int... m) {
		//prints the array object
		System.out.println("m value is : " + m);
		
		//to calculate the sum
		int total = 0;
		for(int y: m) {
			total += y;
		}
		
		System.out.println("Total for the varable arguments is : " +total);
	}
	
	public static void main(String[] args) {
		m1();
		m1(10, 20);
		m1(40, 50, 60, 70);
	}

}
