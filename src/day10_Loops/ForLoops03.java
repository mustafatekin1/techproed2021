package day10_Loops;

import java.util.Scanner;

public class ForLoops03 {

	public static void main(String[] args) {
		/* Get String from user.
		 *  Check if String is palindrome or not 
		 *  same with its reserved means Palindrome. ex: tahhat
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter a string");
		String reversed = "";
		String pal = scan.nextLine();
		for (int i=pal.length()-1; i>=0; i-- )
		{
			reversed = reversed + pal.charAt(i);
		}
		if (reversed.equalsIgnoreCase(pal)) { System.out.println("This is a Palindrome");
	}
		else {System.out.println(" This is not");}
		
		

}}
