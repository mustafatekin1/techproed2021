package day18_MultiArrays;

import java.util.Scanner;

public class Arrays_Sum {

	public static void main(String[] args) {
		// Create an array with short way - by using curly braces.
		// Print the sum of elements.
		
		Scanner scan = new Scanner (System.in);
		
		int summing [] = {-3,5,10,4,1,4};
		int sum = 0;
		
 for (int i=0; i<summing.length; i++) { 
	 sum = sum + summing [i];
	 System.out.println("The cumulative sum is " + sum);
 }
	
	
	
	
	}

}
