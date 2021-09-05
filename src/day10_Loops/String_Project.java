package day10_Loops;

import java.util.Scanner;

public class String_Project {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your firstname and lastname...");
		String name = scanner.nextLine();
		
		//System.out.println("Before:" + name);
		/*
		 Note: Just by using String methods, you cannot change the original String.
		       Because of that Strings are called "Immutable"
		       If you want to change the original String, you have to do assignment like below
		*/
		
		//1.Step:
		name = name.trim();
		//System.out.println("After:" + name);
		
		//2.Step:
		if(name.isBlank()) {
			System.out.println("Just space characters or nothing is not valid");
		}
		
		//3.Step:
		if(!name.contains(" ")) {
			System.out.println("One of the lastname and firstname is not entered or space is not used between firstname and lastname");
		}
		
		//4.Step:
		if(name.indexOf(" ")!=name.lastIndexOf(" ")) {
			
			int firstIdx = name.indexOf(" ");
			int lastIdx = name.lastIndexOf(" ");
			name = name.substring(0, firstIdx) + " " + name.substring(lastIdx+1);
			System.out.println(name);
		}

		//5.Step:
		
		/*
		 	When you create a variable between any curly barces, the variable can be used just inside the curly brace.
		 	If you try to use the variable outside the curly brace, Java will give Compile Time Error.
		 	This is called "Scope" in Java
		 */
		
		int idxOfSpace = name.indexOf(" ");
		String firstNameFormatted = "";
		String lastNameFormatted = "";

		firstNameFormatted = name.substring(0, 1).toUpperCase() + name.substring(1, idxOfSpace).toLowerCase();
		lastNameFormatted = name.substring(idxOfSpace + 1, idxOfSpace + 2).toUpperCase() + name.substring(idxOfSpace + 2).toLowerCase();

		name = firstNameFormatted + " " + lastNameFormatted;
		
		System.out.println(name);


	}

}
