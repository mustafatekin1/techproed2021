package day17Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Task02 {

	public static void main(String[] args) {
		// Create an array by getting the length and elements from the user.
		// Print out the number of the characters in the array.
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter the length of your array");
		int length = scan.nextInt();
		
		int sum = 0;
		String user [] = new String [length];
		for (int i=0; i<length; i++) { 
		System.out.println("Enter array elements one by one");
		
		user [i] = scan.next();
		sum = sum + user[i].length();
		System.out.println("Cumulatove entered array elements:  " + Arrays.toString(user));
		System.out.println("The cumulative lenghths of each elements: " + sum);
		}
		System.out.println(Arrays.toString(user));
		System.out.println("The length of all entered elements "+sum);
	}

}
