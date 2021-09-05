package day17Arrays;

import java.util.Arrays;

public class Array01 {
	// Arrays are used to store multiple data in a single container.
	// In an array all elements must be in the same data type
	// Arrays accept  primitive data types and references eg no String. theoretically. 
	// Array references are stored in heap. So with this ability Strings can be used.
	
	// Arrays are non-primitive so stored in heap memory. 
	
	
	public static void main(String[] args) {
		// array syntax: 
		int a [] = new int [5];
		System.out.println(Arrays.toString(a));
		// How to add elements into an array?
		// We use indexes.
		a [2] = 11;
		a [4] = 22;
		a [0] = 7;
		a [1] = 9;
		a [3] = 99;
		
		System.out.println(Arrays.toString(a));
		System.out.println(a[2]);//3rd element
		System.out.println(a[4]);
		
		//How to get the number of elements in an array:
		System.out.println(a.length);//5
		// We use length with () but in array we use just length.
		
		
		
		
		
		
		
		
		
		
	}

}
