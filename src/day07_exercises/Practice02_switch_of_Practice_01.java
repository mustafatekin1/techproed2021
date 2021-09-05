package day07_exercises;

import java.util.Scanner;

public class Practice02_switch_of_Practice_01 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter two numbers Show them e menu of operation signs and ask
		 * them to choose one. "Addition: 1 , Subtraction : 2 , Multiplication : 3,
		 * Division : 4 Print the result on the console
		 *
		 * EXAMPLE: INPUT: Num1 : 23 Num2 : 55 OUTPUT : Result : 78
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println(" Please enter your numbers to operate");
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		System.out.println(); // This is to pass to next line in the console
		System.out.println("Please select the operation:\n1 + for adding \n2 - for subtraction"
				+ " \n3 / for division \n4 * multiplier");
		
		String op = scan.next().toLowerCase();
		
		switch (op) { 
		case "+":
			System.out.println("The result of adding your numbers is " + (a+b));
		break;
		
		case "-":
			System.out.println("The result of subtracting your numbers is "  + (a-b));
		break;
		
		case "/":
			System.out.println("The result of dividing your numbers is "  + (a/b));
		break;
		
		case "*":
			System.out.println("The result of multiplying your numbers is "  + (a*b));
		break;

		default:
			break;}
		
		
		scan.close();
	}

}
