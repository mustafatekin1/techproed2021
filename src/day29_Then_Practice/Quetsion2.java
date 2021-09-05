package day29_Then_Practice;

import java.util.Scanner;

public class Quetsion2 {

	public static void  is100 () {

		int total = 0;
		int i = 1;
		do {
		System.out.println("enter an integer");
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
		total = total + num;
		
		if (total==100) {
			System.out.println("you made it. Your sum is 100");
			break;}
		

		i++;} while(i<4); 
		
		if (total != 100) {
		System.out.println("Ran out of trials");
		}
	}
	
	public static void main(String[] args) {
		//2.Write a method where u ask a user to enter a number 
		// until the total is 100 or number of trials is equal to 3. 
		//EX: 1,2,3 --> You ran out of trials! EX2: 1,2,97 --> You made it! your sum is 100.
	
		is100();
		
	}

}
