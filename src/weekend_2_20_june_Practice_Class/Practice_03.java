package weekend_2_20_june_Practice_Class;

import java.util.Scanner;

public class Practice_03 {

	public static void main(String[] args) {
		/*Write a program to print a number entered by user,
		 * which are not divisible by 5 or divisible by 5
		 * till 10000*/
		
		Scanner scan = new Scanner (System.in);
		
		for (int i = 1;  i < 5; i++) {
		System.out.println("Enter a number");
		double a = scan.nextDouble();
			if ( a%5==0) {
				System.out.println(" This is divisible by 5");
			}
			else {
				System.out.println("not divisible");
			}
			
		}
		

	}

}
