package day12_Loops_Package;

import java.util.Scanner;

public class DoWhileLoop03 {

	public static void main(String[] args) {
		//  get a string eg: 1234abc_!3a+4
		// count the letters, digits and others.
		Scanner scan = new Scanner(System.in);
		int c_letter = 0;
		int c_digits = 0;
		int c_others = 0;
		
		int i = 0;
		
		System.out.println("Please enter your statement");
		String s = scan.nextLine();
		int l = s.length();
		
		do {
			
			{	if (s.charAt(i)>'A'&&s.charAt(i)<'z') {
				c_letter = c_letter + 1; 
				
				}
				else if (s.charAt(i)>='0'&&s.charAt(i)<='9') {
				c_digits = c_digits +1;
				
					
				}
			
				else {
					c_others = c_others+1;
				}
			}
			
		i++;	
		} while (i<l);
		
		System.out.println("letter number: " + c_letter);
		System.out.println("digit number: " + c_digits);
		System.out.println("others number: " + c_others);
	}

}
