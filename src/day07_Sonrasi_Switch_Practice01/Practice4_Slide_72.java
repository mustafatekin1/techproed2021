package day07_Sonrasi_Switch_Practice01;

import java.util.Scanner;

public class Practice4_Slide_72 {

	public static void main(String[] args) {
		// Make output United for U; States for S; America for A. 
System.out.println("Please enter U, S or A");
Scanner scan = new Scanner(System.in);


	String entry = scan.next().toUpperCase();
	
	if (entry.length()>1) {
		System.out.println("Please enter just one character U, S or A");
	} else {
	
	char abbr = entry.charAt(0);
	
		switch (abbr) {
		
		case 'U':
			System.out.println("United");
			break;
			
		case 'S':
			System.out.println("Stated");
			break;
			
		case 'A':
		System.out.println("America");
		break;
		
		default:
			System.out.println("Please just enter U, S or A");
			
		}
	
	}
		scan.close();
	}

}
