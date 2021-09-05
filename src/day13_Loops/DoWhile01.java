package day13_Loops;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		// get integer. If it is even "You won" otherwise ask again.
		
		Scanner scanner = new Scanner (System.in);
		
		int n = 0;
		do { 
			System.out.println("Please enter an integer");
			n = scanner.nextInt();
				
			} while (n%2!=0);
		System.out.println("You won");
		
		
		
	}

}
