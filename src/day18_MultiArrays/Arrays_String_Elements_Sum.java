package day18_MultiArrays;

import java.util.Scanner;

public class Arrays_String_Elements_Sum {

	public static void main(String[] args) {
		// Get String element from the user
		// Find the multiplication of the length of the elements.

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number of the array elements");
		
		int num = scan.nextInt();
		String a [] = new String [num];
		
		int mult = 1;
		for (int i= 0; i<a.length;i++) {
			
			System.out.println("Enter the " + (i+1) + ". string element");
			a[i] = scan.next();
			
			mult = mult *a [i].length();
			System.out.println("Cumulative multipication is " + mult);
			
		}
	System.out.println("The result is " + mult);
	
	
	
	}

}
