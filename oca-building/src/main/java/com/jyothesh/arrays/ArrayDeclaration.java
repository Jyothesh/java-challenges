package com.jyothesh.arrays;

public class ArrayDeclaration {

	public static void main(String[] args) {
		int[] a = new int[3];
		//Every array type a class exists.
		System.out.println(a.getClass().getName()); //[I
		boolean[] b = new boolean[3];
		System.out.println(b.getClass().getName());//[z
	}

}
