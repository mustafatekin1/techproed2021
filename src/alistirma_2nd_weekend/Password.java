package alistirma_2nd_weekend;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// Specify a password. 
		// Get 4 passwords from the user. If true "You are signed in"
		// After 4 attempts "Your account is blocked"
		
		
		Scanner scan = new Scanner (System.in);
		String pw = "Mustafa";
		
		for (int i=0; i<=3; i++) {
		
		System.out.println("Enter the pasword");
		
		String userEntry = scan.nextLine();
		if (!userEntry.equals(pw)) {
			if (i<3) {
				System.out.println("You entered a wrong pw. Enter again!");
			}
			else {
				System.out.println("You are blocked");
			}
		}
		
		else {
			i = 3;
			System.out.println("Congrats. you are signed in");
		}
		
		
	}

		 
		

	scan.close();
	
	}}
