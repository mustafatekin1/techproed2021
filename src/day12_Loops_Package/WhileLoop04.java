package day12_Loops_Package;

import java.util.Scanner;

public class WhileLoop04 {

	public static void main(String[] args) {
		/* Get a number							*1
		 * 										**2	
		 * print the following image eg: 4		***3
		 * 										****4
		 */
		
		System.out.println("Please enter a number");	
		Scanner scan = new Scanner(System.in);
		int n = Math.abs(scan.nextInt()); 
		
		int i=1;
		while (i<n+1) {
			
			int j=1; 
			while (j<i+1) {
			System.out.print("*");
			j++;	
			}
		
		System.out.println(i);
			
		i++;	
		}
		
		
		
	}

}
