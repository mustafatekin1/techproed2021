package day13_Loops;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		// Get user's name. If initial is lower ask to make it uppercase
		//If initial is uppercase say "You did it right!"
		
		Scanner scan = new Scanner (System.in);
		char s = '0';
	
		
		do { 
			System.out.println("Enter your name");
			s = scan.next().charAt(0); 
			
			if (s>='a'&&s<='z')
				System.out.println("Make initial Uppercase");
			
		} while (s>='a'&&s<='z');
		
		System.out.println("You did it right!...");

	}

}
