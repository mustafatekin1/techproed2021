package day18_MultiArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {
		// Create an int array
		// Print the max and min elements.
		
		
		int a []  = new int [5];
		a [0] = 3;
		a [1] = 7;
		a [2] = 5;
		a [3] = 1;
		a [4] = 4;
		
	Arrays.sort(a);
	/*Strings are immutable. On the contrary, the arrays are changed in other words arrays a
	 * 
	 */
		System.out.println(a);
		
		System.out.println("max element is " + (a[a.length-1]));
		System.out.println("min element is " + a[0]);
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number of the elements: ");
		int number = scan.nextInt();
		int entry [] = new int [number];
		
		for (int i=0; i<entry.length; i++ ) {
			System.out.println("Please enter the "+ (i+1)+". element of the array.");
			entry [i] = scan.nextInt();	
		}
		int copyOfEntry [] = Arrays.copyOf(entry, number);
		// if we create the new array before sorting
		//	the copied array is sorted.
// So we use Arrays.copyOf() method to keep the original array.
		 // we should see the original array before sort
		Arrays.sort(entry);
		System.out.println("Max element of the "+ (entry[entry.length-1]));
		System.out.println("Min element of the "+ (entry[0]));
		System.out.println(Arrays.toString(entry));
		System.out.println(Arrays.toString(copyOfEntry));
	
		System.out.println(copyOfEntry.toString()); // If we don't use Arrays.toString() method, to print all elements!
	}
	
	

}
