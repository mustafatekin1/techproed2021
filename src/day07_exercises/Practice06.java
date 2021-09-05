package day07_exercises;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		  /*
	       * Type java code by using if-else statement,
	       * Write a program to print absolute value of a number entered by user.
	       */

		System.out.println("Please enter a number");
		Scanner scan = new Scanner (System.in);
		
		float num = scan.nextFloat();
		if (num<0) { float numabs = -1*num; 
		System.out.println("abs value is" + numabs);			
		}
		else {
			System.out.println("abs value is "+num);
		}
		
		// The same can be solved with ternary
	
		//num<0? (numabs2 = -1*num) || System.out.println(numabs2)
		//:System.out.println(num);
		
		
		
	}

}
