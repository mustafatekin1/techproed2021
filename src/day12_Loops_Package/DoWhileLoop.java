package day12_Loops_Package;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// Get integer from user.
		// If the number is less than 100 "Won" and continure to ask
		// else show "Lost" and finish the game. 
		
		System.out.println("Please enter a number");	
		Scanner scan = new Scanner(System.in);
		
		
		int n = 0;
		do {
		System.out.println("Enter a number");
		n = scan.nextInt(); 
		if (n<100) {
			System.out.println("You won!");
		}
		else {
			System.out.println("lost!");
			System.out.println();
		}
			
		} while (n<100);

	}

}
