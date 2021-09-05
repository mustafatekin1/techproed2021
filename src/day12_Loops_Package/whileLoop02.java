package day12_Loops_Package;

import java.util.Scanner;

public class whileLoop02 {

	public static void main(String[] args) {
		// Get an integer from the user.
		// Print the sum of digits: eg. 256: 2+5+6=13

		System.out.println("Please enter a number");	
		Scanner scan = new Scanner(System.in);
	
	int n = Math.abs (scan.nextInt());
	int sum = 0;
	int i=1;
	
	while (n>0) { 
		int d = n%10;
		n= n/10; 
		sum = d + sum;
		System.out.println((i)+ ". basamak "+d); 
		i++;
	}
	System.out.println("The sum of digits is " + sum);
	
	
	}

}
