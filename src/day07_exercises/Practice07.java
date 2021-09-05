package day07_exercises;
import java.util.Scanner;
public class Practice07 {

	public static void main(String[] args) {
/*
* A company decided to give bonus of 5% to employee 
if his/her year of service is more than or equal 5 years.
* Ask user for their salary and year of service 
and print the net bonus amount.
	     * Example: Input= 4 year service
	     *               salary: 4000
	     *          Output= 0
	     */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your years of eperience");
		
		byte a = scan.nextByte();
		int salary = scan.nextInt();
		
		if (a >= 5) { double salaryNew = salary*1.05; 
			System.out.println("Congrats. Your new salary is " + salaryNew);
		}
		else { System.out.println("Your salary is the same." + salary);
		
		scan.close();
	}
	}
}
