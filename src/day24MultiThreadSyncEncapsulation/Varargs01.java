package day24MultiThreadSyncEncapsulation;

import java.util.Arrays;

public class Varargs01 {
/* 1. Varargs uses arrays. That's why varags behaves as arrays with some little differences.
 * 2. We can not use more than one varargs in a method parenthesis
 * 3. Varargs must be the last parameter in the method parenthesis
   4. "..." should be put between data type and varargs name: ex: add (int ... a) 
 *
 */
	
	
	
	public static void main(String[] args) {
		// 

		System.out.println(add());
		System.out.println(add(3,5,4,10,12));	
	}

	public static int add () {
	return 3 + 5; }
//		
//	public static int add (int a, int b) {
//		return a+b;
//	}
//	public static int add (int a, int b, int c) {
//		return a+b+c;
//	}
//	
	
	// Instead of creating endless methods to add many numbers, we user vargs as follows: 
	public static int add (int  ...  a) {
		int sum =0; 
		
		for (int w:a) {
			sum = sum +w; 
		}
		return sum ;
		
	}
	
}
