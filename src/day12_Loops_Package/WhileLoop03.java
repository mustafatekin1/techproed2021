package day12_Loops_Package;

import java.util.Scanner;

public class WhileLoop03 {

	public static void main(String[] args) {
		// Get n integer
		// Show the factors of the integer  and count them.
		//eg 12: 1, 2, 3, 4, 12

		System.out.println("Please enter a number");	
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int i = 1;
		int counter = 0; // flag: is used to describe something to count.
		while (i<n+1) {
			if (n%i == 0) {
			System.out.print(i+ ", ");	
			counter ++;}
			
			i++;
		}
		System.out.println();
		System.out.println("There are " + counter + " positive factors of " + n);
	}
	
}