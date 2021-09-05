package day07_exercises;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		/* Ask user to enter minutes,
	       * Write a Java program to convert minutes into a number of years and days.
	       * Input: number of minutes 3456789
	       * Output: 3456789 minutes is approximately 6 years and 210 days
	       */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the minutes");
		long minute = scan.nextLong();
		long minute1 = Math.abs(minute);
		
		long years = minute1 / (60*24*365);
		long days = minute1%(60*24*365)/(24*60);
		
		System.out.println(minute1 +" minutes is app "+ years+" years and "+days+" days");
		
		scan.close();
		
	}

}
