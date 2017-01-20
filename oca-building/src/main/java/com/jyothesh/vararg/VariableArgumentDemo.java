package com.jyothesh.vararg;

public class VariableArgumentDemo {

	//main method creates an object of VariableArgument and calls the variable argument method
	//with out the static keyword before the method
	public static void main(String[] args) {
		VariableArgument va = new VariableArgument();
		va.calculateSum(10);
		va.calculateSum(23, 30, 34);
	}

}
