package weekend_2_20_june_Practice_Class;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		/*
		 Ask user for a string and print a new string made of 3 copies of the last 2 letters
The strings length will be at least 2.
ORNEK:
   INPUT      : Mustafa
   OUTPUT     : fafafa
		 */
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter word");
		
		String entry = scan.nextLine();
		for (int i = 0; i < 3; i++) {
			if (entry.length()>1) {
				System.out.print(entry.charAt(entry.length()-2)+""+
						entry.charAt(entry.length()-1));
				 if (entry.length () <=1) {
					System.out.println("Please enter 2 or more characters");
				}
			}
		}
		
		System.out.println();
		// Second way- much better
		
		for (int i = 1; i<4; i++) {
			System.out.print(entry.substring(entry.length()-2));
		}
		

	}

}
