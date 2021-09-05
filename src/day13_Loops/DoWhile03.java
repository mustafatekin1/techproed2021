package day13_Loops;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// Get PW from the user. If it is more than 6 "It is Okay"
		// Otherwise please enter more than 6 characters

		Scanner scan = new Scanner (System.in);
		String pw = "";
		do {
		System.out.println("Enter a password");
		pw = scan.nextLine();
		if (pw.length()<7) {
			System.out.println("Please enter a pw with more than 6 characters");
		}
		
		} while (pw.length()<7);
		
		System.out.println("Your pw is ok");
		
	}

}
