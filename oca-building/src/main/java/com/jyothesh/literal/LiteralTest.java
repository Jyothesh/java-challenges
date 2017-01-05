package com.jyothesh.literal;

public class LiteralTest {

	public static void main(String args[]){
		int x = 10; // 10 is value in decimal
		int y = 010; // 8^0*0 + 8^1*1 (since 8 is the base) = 8
		int z = 0x10; // similar to base 8
		
		System.out.println(x+y+z +" is the output.");
	}
}
