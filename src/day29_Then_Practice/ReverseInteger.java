package day29_Then_Practice;

import java.util.Scanner;

public class ReverseInteger {
	//6.Write a method that reverses a number. 
		//Method accepts an integer and returns an int. EX: 123 --> 321
	public static void reverseInt () {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter an integer");
		int entry = scan.nextInt();
		
		StringBuilder reversed = new StringBuilder();
		reversed.append(entry);
		reversed.reverse();
		
		System.out.println(reversed);
	
		
		Integer.parseInt(reversed.toString());
	}
	
	
	public static void main(String[] args) {
	
		
		reverseInt();
		

	}

}
