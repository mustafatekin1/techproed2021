package day11_For_Loops;

import java.util.Scanner;

public class ForLoopSlides_Question_Mine {

	public static void main(String[] args) {
		// Get 2 odd numbers as a range from the user.
		// Sum up all the odd numbers in the given range.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 odd numbers");
		
	int odd1 = scan.nextInt();
	int odd2 = scan.nextInt();
	
	
		if ((odd1%2==1 && odd2%2==1)&&  (odd1<odd2)&& (odd1>0)&& (odd2>0)){
	
			{int sum = 0;

			for (int i=odd1; i<odd2+1; i+=2) {
				
				sum = sum + i;
				System.out.println("Cumulative sum is "+sum);
				
			}
				
				System.out.println("Sum is "+ sum);}}
		
	
		else {System.out.println("Please enter the numbers correctly: \n1.odd \n2.positive \n3.2nd one greater");	
		odd1 = scan.nextInt();
		odd2 = scan.nextInt();
	}

		
		scan.close();
	}}
