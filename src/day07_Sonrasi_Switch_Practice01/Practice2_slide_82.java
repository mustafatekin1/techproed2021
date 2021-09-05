package day07_Sonrasi_Switch_Practice01;

import java.util.Scanner;

public class Practice2_slide_82 {

	public static void main(String[] args) {
		// User enters A, B ,C or D. True is C. others are wrong. 
		
		System.out.println("Please enter your choice A, B, C or D");
		Scanner scan = new Scanner (System.in);
		
		String entry = scan.next().toUpperCase();
		
		if (entry.length()>1) {
			System.out.println("Please enter just one character A, B, C or D");
		}
		else {
			 switch (entry) {
			 case "A":
				 System.out.println("False");
				 break;
				 
			 case "B":
				 System.out.println("False");
				 break;
				 
			 case "C":
				 System.out.println("True");
				 break;
				 
			 case "D":
				 System.out.println("False");
				 break;
			default:
				System.out.println("Please just enter A,B,C or D");
				 
				 
			 }
			
			
		}
	scan.close();
	
	}

}
