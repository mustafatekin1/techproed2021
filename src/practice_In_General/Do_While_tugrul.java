package practice_In_General;

import java.util.Scanner;

public class Do_While_tugrul {

	public static void main(String[] args) {
		/*
		 Ask user to enter his/her first name WITH any char (this is a bit different than DAY13 DOWHILE02
		 If the initial is lower case print a message like “Make the initial upper case”
		 If the initial is upper case print a message like “You did it right”
	*/
String name = "";
	do {	System.out.println(" Enter your name");
	
	Scanner scan = new Scanner (System.in);
	name = scan.next();
	
	
	} while  (name.charAt(0)>'Z' || name.charAt(0)<'A');
	
	System.out.println("You did it right");
	
	}

}
