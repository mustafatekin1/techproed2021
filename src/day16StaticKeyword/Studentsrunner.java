package day16StaticKeyword;

import java.util.Scanner;

public class Studentsrunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		do {
			System.out.println("Please enter your first name");
			String firstName = scan.next();	
			System.out.println("Please enter your last name");
			String lastName = scan.next();
			String name = firstName+" "+lastName; 
			
			System.out.println("Please enter your grade");
			int grade = scan.nextInt();
			System.out.println("Please enter your registration year");
			int year = scan.nextInt();
			
			Students std1 = new Students(name, grade, year);
			
			System.out.println("Student name: " + std1.name);
			System.out.println("Student grade: " + std1.grade);
			System.out.println("Std registration year: " + std1.regYear);
			System.out.println(Students.id);//not good to use std1.id because it is a class variable
			
			System.out.println("Press Q to quit, to go on press any key");
			String q = scan.next();
			if (q.equalsIgnoreCase("q")) {
				break;
			}
			
		}while (true); 
		
		System.out.println("See you later...");
	//System.out.println(std1.name+" " + std1.grade+ " " + std1.id);
	
//	Students std2 = new Students ("Veli", 12, 2020);
//	std2.setId();
//	System.out.println(std2.id);
	scan.close();
	}

}
