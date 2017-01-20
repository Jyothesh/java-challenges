package com.jyothesh.vararg;

/*
 * 1. We can mix var-arg parameter with normal paramater also
 * 		methodname(string x, int y, int ...z);
 * 2. If we are combining other methods with var-arg then it should be the last 
 * 	  parameter in the method.
 * 3. in any method, we can have only one var-arg parameter.
 * 4. Var-arg parameter will have least priority i.e, if no other method matches, 
 * 	  then it go for var-arg parameter.
 * 5. Single dimensional array can be replaced with var-arg parameters. but the vice versa is 
 *    not possible.
 */
public class VariableArgument {

	public void calculateSum(int ...a){
		int total = 0;
		for(int b: a) {
			total += b;
		}
		
		System.out.println("The total value for var-arg is : " + total);
	}
}
