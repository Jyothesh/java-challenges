package com.jyothesh.arrays;

public class ArrayCopyDemo {

	public static void main(String[] args) {
		char[] copyFrom = { 'a', 'b', 'c', 'a', 'f', 'f', 'i', 'n', 'e', 'i', 'o'};
		
		//A simple way to copy an array using the System.arrayCopy
		char[] copyTo = new char[7];
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		System.out.println(new String(copyTo));
		
		//The only advantage by using the copyOfRange is we need not to create a array
		//since the method is  returning the array
		char[] copyingTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
		System.out.println(new String(copyingTo));

		//Array sorting
		int[] ascendingOrder = {10, 90, 30, 40, 50, 200, 600, 12, 5};
		java.util.Arrays.sort(ascendingOrder);
		
		for(int arrayElement: ascendingOrder) {
			System.out.println(arrayElement + " ");
		}
		
	}

}
