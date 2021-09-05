package day07_exercises;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		/*
		 * Write a program and calculate grade of three exams with the given values
		 * A==>90-100 B==>80-89 C==>70-79 D==>60-69 F==>0-59 EXAMPLE: INPUT : Math=70
		 * Science=60 Chemistry=89 A==> 90-100 B==>80-89 C==>70-79 D==>60-69 F==>0-59
		 * OUTPUT : Math Grade = C Science Grade = D Chemistry Grade = B
		 */
Scanner scan=new Scanner(System.in);
System.out.println("Please enter your Math Grade");

int math=scan.nextInt();

System.out.println(math>=0&&math<=59? " Your Math grade is F" : math>=60&&math<=69? "Your Math grade is D":
	math>=70&&math<=79? "Your Math Grade is C": math>=80&&math<=89? "Your Math Grade is B":
	math>=80&&math<=100? "Your Math Grade is A": "Please enter a value between 0-100");
	
System.out.println("Please enter your Chem Grade");

int chem=scan.nextInt();

System.out.println(chem>=0&&chem<=59? " Your chem grade is F" : chem>=60&&chem<=69? "Your chem grade is D":
	chem>=70&&chem<=79? "Your chem Grade is C": chem>=80&&chem<=89? "Your chem Grade is B":
	chem>=80&&chem<=100? "Your chem Grade is A": "Please enter a value between 0-100");

System.out.println("Please enter your Science Grade");

int science=scan.nextInt();

System.out.println(science>=0&&science<=59? " Your science grade is F" : science>=60&&science<=69? "Your science grade is D":
	science>=70&&science<=79? "Your science Grade is C": science>=80&&science<=89? "Your science Grade is B":
	science>=80&&science<=100? "Your science Grade is A": "Please enter a value between 0-100");	





scan.close();	
	}

}
