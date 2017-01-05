package com.jyothesh.arrays;

public class AnonomousArray {

	public static void main(String[] args) {
		//Anonymous array
		sum(new int[]{10,20,30});
	}
	
	public static void sum(int[] z) {
		int total = 0;
		for(int x: z) {
			total = total + x;
		}
		
		System.out.println("sum is " + total);
	}
}
