package day29exceptionsabstraction;

import java.util.Scanner;

public class E01_IllegalArgumentExc {

	public static void main(String[] args) {
	// IllegalArgumentException:
	// eg: number of the product or price of an item can not be negative.
	// unchecked exception
		
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter the age");
	int age = scan.nextInt();
	try {
	setAge(age);
	} catch (IllegalArgumentException e) {
		System.out.println("Please just enter positive numbers for age");		
		System.out.println(e.getMessage());// null because we assign the exception not Java!	
	}
	
	}

	
	public static void setAge (int age) throws IllegalArgumentException, NumberFormatException
	{if (age<0) {
		throw new IllegalArgumentException(); 
//'throw' keyword: is a command.; 'throws' is used to handle the exception
// 'throw' used inside the method body; throws is used in the method name line
// 	'throw' is used with "new" keyword. throws without new	
//					after 'throws' we can add multiple exceptions with comma.
						
	}
	System.out.println("The entered age is " + age);
	}
}
