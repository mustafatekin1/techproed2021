package day07_exercises;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		/*
		 * Write a Java program that accepts name,surname, age, weight, height;
		 * Calculates BMI(Body Mass Index) and prints the user’s status like that;
		 * John CARPENTER is 25 years old, his height is 170.5 cm and 
	his weight is 80.24 kg. He is HEALTHY because his BMI=24.7
		 * formula; bmi = weight / (height * height / 10000);
		 * bmi less than or equal 20 is weak,less than or equal 25 is healty,
	 less than or equal 30 is fat, the other option is obese
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scan.nextLine();
		
		System.out.println("Please enter your name");
		String surname = scan.nextLine().toUpperCase();
		
		System.out.println("Please enter your \nage\nweight\nheight");
		int age = scan.nextInt();
		float w = scan.nextFloat();
		float h = scan.nextFloat();
		
		float bmi = w/(h*h/10000);
		
		String result = bmi<=20? "weak":bmi>20&&bmi<=25? "healthy":bmi<=30? "fat": "obese";
		
		System.out.println(result);
		
		System.out.println(name + " " + surname + " is " + age + " years old " + "his height is " + h + 
				" and his weight is " + w + " kg. He is " + result + " because his " + 
				"bmi =" + bmi);
		
		
		
		
		
	}

}
