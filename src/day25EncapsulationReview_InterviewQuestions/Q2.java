package day25EncapsulationReview_InterviewQuestions;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// COmpare 2 strings.
		// If they are anagram or not
		// Anagram: letters or numbers are the same in the other string
		//ex: mary and army
		
		System.out.println("Enter 2 strings");
		Scanner scan = new Scanner (System.in);
		String s1 = scan.nextLine().toUpperCase();
		String s2 = scan.nextLine().toUpperCase();
	
		int counter = 0;
		
		for (int i=0; i<s1.length(); i++) {
			
			for (int k=0; k<s2.length(); k++) {
				
				if (s1.charAt(i)==s2.charAt(k)) {
					counter++;
				}
		
			}
		
		}
	
	if (s1.length()!=s2.length()) {
		System.out.println("Even the length of the strings are different. Not an anagram");
	}
	if (s1.isBlank()) {
		System.out.println("One or both strings are empty");
	}
	else if (counter == s1.length()) {
		System.out.println("This is an anagram");}
	else {
		System.out.println("Not an anagram");	
		}
	
	
	
	}
}


