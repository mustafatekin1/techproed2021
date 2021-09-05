package day29_Then_Practice;

import java.util.Scanner;

public class Pangram {
	 //Write a function to check whether a string is pangram or 
	//not assuming that the string passed in does not have any punctuation.
	//Pangrams are words or sentences containing every letter of the alphabet at least once.
	
	public static void main(String[] args) {
		
Scanner scan = new Scanner (System.in);
		String s1 = scan.nextLine().toUpperCase();
		String s2 = scan.nextLine().toUpperCase();
		
		int counter = 0;
		for (int i=0; i<s1.length()/2; i++) {
			for (int k=0; k<s1.length(); k++) {
				if (s1.charAt(i)!= s2.charAt(k)) {
					counter++;
				}
			}
			if (counter ==s1.length()) {
				System.out.println("This is a pangram");
			}
			else {
				System.out.println("Not a pangram");
			}
			
			
		}
		

	}

}
